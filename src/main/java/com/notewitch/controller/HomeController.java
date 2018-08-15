package com.notewitch.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.notewitch.dto.GroupDto;

@Controller
public class HomeController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping({ "/", "index" })
	public String home() {
		return "index";
	}
	
	@GetMapping("/groups")
	public String groups() {
		return "groups";
	}

	@GetMapping("/projects")
	public String projects() {
		return "projects";
	}
	
	@GetMapping("/multimedia")
	public String multimedia(@RequestParam String projectId, Model model) {
		model.addAttribute("projectId", projectId);
		return "multimedia";
	}

	@GetMapping("/group")
	public String projectCards(@RequestParam String id,HttpServletRequest session, Model model) {
		HttpHeaders requestHeaders = new HttpHeaders();
		Cookie[] cookies = session.getCookies();
		for (Cookie cookie : cookies) {
			requestHeaders.add(HttpHeaders.COOKIE, cookie.getName() + "=" + cookie.getValue());
		}
		HttpEntity<?> requestEntity = new HttpEntity<>(requestHeaders);
		String url = "http://localhost:8761/api/db-service/rest/group/" + id;
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
		ResponseEntity<GroupDto> response = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, requestEntity, GroupDto.class);
		model.addAttribute("group", response.getBody());
		return "projectCards";
	}
}

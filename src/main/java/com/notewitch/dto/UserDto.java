/*******************************************************************************
 * CONFIDENTIAL
 *******************************************************************************/
package com.notewitch.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


/**
 * @author EricAr
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {

	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private String otherNames;
	
	private String email;
	
	private String username;
	
	private String address;
	
	private List<ProjectDto> project;
}

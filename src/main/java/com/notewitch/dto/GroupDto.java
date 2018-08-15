/*******************************************************************************
 * CONFIDENTIAL
 *******************************************************************************/
package com.notewitch.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


/**
 * @author EricAr
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupDto implements Serializable {
	
	private static final long serialVersionUID = 7544957935729212550L;

	private String id;
	
	private String name;
	
	private String createdBy;
	
	@DateTimeFormat
	private LocalDateTime createdDate;
	
	private String modifiedBy;
	
	@DateTimeFormat
	private LocalDateTime modifiedDate;
	
	private List<ProjectDtoInGroup> project;
	
	private UserDto user;
}

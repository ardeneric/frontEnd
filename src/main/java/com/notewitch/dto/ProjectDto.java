/*******************************************************************************
 * CONFIDENTIAL
 *******************************************************************************/
package com.notewitch.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * @author EricAr
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectDto {

	private String id;
	
	private String projectName;
	
	private String createdBy;
	
	private LocalDateTime createdDate;
	
	private String modifiedBy;
	
	private LocalDateTime modifiedDate;
	
	private List<MultimediaDto> multimedia;
	
	private UserDto user;
	
	private GroupDto group;
}

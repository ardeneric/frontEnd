/*******************************************************************************
 * CONFIDENTIAL
 *******************************************************************************/
package com.notewitch.dto;

import java.time.LocalDateTime;

import javax.persistence.Lob;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * @author EricAr
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MultimediaDto {
	
	private String id;
	@Lob
	private Byte[] image;
	
	private String text;
	
	private String location;
	
	private String createdBy;
	
	private LocalDateTime createdDate;
	
	private String modifiedBy;
	
	private LocalDateTime modifiedDate;
	
	private ProjectDto project;
}

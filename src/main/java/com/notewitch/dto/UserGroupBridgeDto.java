package com.notewitch.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserGroupBridgeDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1335147360738281500L;
	private String id;
	private UserDto userId;
	private RoleDto roleId;
	private GroupDto groupId;
	
}

package com.niket.agrawal.customqueue.dto;

import lombok.Data;

@Data
public class TaskDetail {

	private String recepientName;
	
	private OperationName operationName; 

	public enum OperationName {
		EMAIL, PRINT
	}
}

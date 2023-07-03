package com.niket.agrawal.blockingqueue.with.thread.dto;

import lombok.Data;

@Data
public class TaskDetail {

	private String recepientName;
	
	private OperationName operationName; 

	public enum OperationName {
		EMAIL, PRINT
	}
}

package com.niket.agrawal.customqueue.dto;

public class TaskDetail {

	private String recepientName;
	
	private OperationName operationName; 
	
	public TaskDetail(String recepientName, OperationName operationName) {
		this.recepientName = recepientName;
		this.operationName = operationName;
	}

	/**
	 * @return the taskName
	 */
	public String getRecepientName() {
		return recepientName;
	}

	/**
	 * @return the operationName
	 */
	public OperationName getOperationName() {
		return operationName;
	}

	public enum OperationName {
		EMAIL, PRINT
	}
}

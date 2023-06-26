package com.niket.agrawal.customqueue.service;

import java.util.List;

import com.niket.agrawal.customqueue.dto.TaskDetail;

public interface TaskExecutionService {

	void submitTaskInQueue(TaskDetail taskDetail);

	int getQueueSize();

	String clearQueue();

	String removeTaskForUser(String recepientName);

	List<TaskDetail> getQueueDetails();

}

package com.niket.agrawal.blockingqueue.with.thread.service;

import java.util.List;

import com.niket.agrawal.blockingqueue.with.thread.dto.TaskDetail;

public interface TaskExecutionService {

	void submitTaskInQueue(TaskDetail taskDetail);

	int getQueueSize();

	String clearQueue();

	String removeTaskForUser(String recepientName);

	List<TaskDetail> getQueueDetails();

}

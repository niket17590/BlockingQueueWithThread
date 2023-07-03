package com.niket.agrawal.blockingqueue.with.thread.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niket.agrawal.blockingqueue.with.thread.dto.TaskDetail;
import com.niket.agrawal.blockingqueue.with.thread.service.ExecutorServiceImpl;

@RestController
@RequestMapping(value = "api/v1/executorService")
public class TaskControllerWithExecutorService {

	@Autowired
	private ExecutorServiceImpl executorServiceImpl;

	@PostMapping(value = "submitTask")
	public String submitTask(TaskDetail taskDetail) {
		executorServiceImpl.submitTask(taskDetail);
		return "You request is submitted for processing";
	}

}

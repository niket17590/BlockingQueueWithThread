package com.niket.agrawal.customqueue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niket.agrawal.customqueue.dto.TaskDetail;
import com.niket.agrawal.customqueue.service.ExecutorServiceImpl;

@RestController
@RequestMapping(value = "api/v1/executorService")
public class TaskControllerWithExecutorService {

	@Autowired
	private ExecutorServiceImpl executorServiceImpl;

	@PostMapping(value = "submitTask")
	public void submitTask(TaskDetail taskDetail) {
		executorServiceImpl.submitTask(taskDetail);
	}

}

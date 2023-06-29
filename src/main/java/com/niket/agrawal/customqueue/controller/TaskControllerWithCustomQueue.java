package com.niket.agrawal.customqueue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niket.agrawal.customqueue.dto.TaskDetail;
import com.niket.agrawal.customqueue.service.TaskExecutionService;

@RestController
@RequestMapping(value = "api/v1/customQueue")
public class TaskControllerWithCustomQueue {

	@Autowired
	private TaskExecutionService taskExecutionService;

	@PostMapping(value = "submitTask")
	public void submitTask(TaskDetail taskDetail) {
		taskExecutionService.submitTaskInQueue(taskDetail);
	}

	@GetMapping("getQueueSize")
	public String getQueueSize() {
		return "Total Tasks available in Queue are : " + taskExecutionService.getQueueSize();
	}

	@GetMapping("getTasksInQueue")
	public List<TaskDetail> getTasksInQueue() {
		return taskExecutionService.getQueueDetails();
	}

}

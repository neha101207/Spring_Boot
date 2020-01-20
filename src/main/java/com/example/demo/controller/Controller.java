package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.TaskService;
import com.example.demo.model.Model;



@RestController
@RequestMapping("/task")
public class Controller {
	
	@Autowired
	TaskService service;
	
	@PostMapping("/create")
	public String createTtask(@RequestBody Model m ) {
		String result= service.create_task(m);
		return result;
	}
	
	@GetMapping("alltask")
	public List<Model> gettask(){
		List <Model> list = new ArrayList<Model>();
		list = service.alltask();
		return list;
		
	}
	
	@PutMapping("updatetask")
	public String updat_e_task(@RequestBody Model m) {
		service.update_task(m);
		return "Success";
	}
	
	@DeleteMapping("/delete/{id}")
		public String deletetask(@PathVariable Integer id) {
		service.delete_task(id);
		return "Success";
	}
	
	
	


}

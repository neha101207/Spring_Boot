package com.example.demo.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Dao;
import com.example.demo.model.Model;

@Service
public class TaskService {
   
	
	@Autowired
	Dao dao;
	
	public String create_task(Model t) {
		dao.save(t);
		return "Success";
	}

	public List<Model> alltask() {
		// TODO Auto-generated method stub
		
		List<Model> list= dao.findAll();
		return list;
	}

	public void update_task(Model m2) {
		// TODO Auto-generated method stub
	Optional<Model> m=dao.findById(m2.getId());
	m.ifPresent(task->{
		String s=m2.getName();
		if(m2.getName()!=null) {
			 task.setName(m2.getName());
		};
		if(m2.getLabel()!=null) {
			 task.setLabel(m2.getLabel());	
		}
		
		
		 task.setId(m2.getId());
		 dao.save(task);
		System.out.print(s);
	});
	
	}

	public void delete_task(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	
}

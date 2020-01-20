package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

@Entity
@Table(name = "task_management")
public class Model {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "id")
	private Integer id;

	@Column(name="name")
	private String name;
	
	@Column(name ="label")
	private String label;
	




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Model(String name, String label, Integer id) {
		super();
		this.name = name;
		this.label = label;
		this.id = id;
	}

	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Model [name=" + name + ", label=" + label + ", Id=" + id + "]";
	}
	
	
}

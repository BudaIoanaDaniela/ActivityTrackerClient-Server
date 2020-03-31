package com.example.springrmiserver.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activity")
public class Activity implements Serializable{
	@Id
	private Long id;

	private String name;

	public Long getId() {
		return id;
	}

	public Activity() {
		
	}
	
	public Activity(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Activity createNewCategory(List<String> category) {
		return new Activity(Long.parseLong(category.get(0)), category.get(1));
	}
	

}

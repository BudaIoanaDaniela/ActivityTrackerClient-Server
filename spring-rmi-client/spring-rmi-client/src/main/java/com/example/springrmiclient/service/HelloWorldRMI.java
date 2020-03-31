package com.example.springrmiclient.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.springrmiclient.model.Activity;
import com.example.springrmiclient.model.ActivityDTO;
import com.example.springrmiclient.model.Expense;

public interface HelloWorldRMI {
	
	public String sayHelloRmi(String name);
	public List<String> getActivity(Long id);
	public List<String> getUser(Long id);
//	
	public List<List<String>> getRecords();
	
	public void  deleteRecord(Long id);
	
	public Expense createRecord(List<String> expense);
	
	public List<List<String>> activities();
	
	//public ResponseEntity<?> getCategory(Long id);
	
	public Activity createActivity(String[] list);
	
	public ResponseEntity<Activity> updateActivity(Activity activity);
	
	public void deleteActivity(Long id);
	
}

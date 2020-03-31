package com.example.springrmiserver.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.springrmiserver.model.Activity;
import com.example.springrmiserver.model.Record;


public interface HelloWorldRMI{

	public String sayHelloRmi(String name) throws RemoteException;
//	
	public List<List<String>> getRecords() throws RemoteException;
	
	public void deleteRecord(Long id) throws RemoteException;
	
	public Record createRecord(List<String> record) throws RemoteException;
	
	public List<List<String>> activities() throws RemoteException;
	

	
	public Activity createActivity(String[] category) throws RemoteException;
	
	public ResponseEntity<Activity> updateActivity(Activity activity) throws RemoteException;
	
	public void deleteActivity(Long id) throws RemoteException;
	public List<String> getActivity(Long id);
	public List<String> getUser(Long id);
}

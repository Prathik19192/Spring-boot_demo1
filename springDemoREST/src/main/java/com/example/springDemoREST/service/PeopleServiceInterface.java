package com.example.springDemoREST.service;

import java.util.List;

import com.example.springDemoREST.model.PeopleDetailss;

public interface PeopleServiceInterface{
	
	public String createPeopleInfo(PeopleDetailss peopleDetails);
	public String updatePeopleInfo(PeopleDetailss peopleDetails);
	public String deletePeopleInfo(Integer age);
	public PeopleDetailss getPeopleInfo(Integer age);
	public List<PeopleDetailss> getAllPeopleInfo();
	
}

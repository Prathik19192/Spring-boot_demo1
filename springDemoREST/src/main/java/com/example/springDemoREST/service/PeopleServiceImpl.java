package com.example.springDemoREST.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springDemoREST.Repository.PeopleRepository;
import com.example.springDemoREST.model.PeopleDetailss;

@Service
public class PeopleServiceImpl implements PeopleServiceInterface{
	
	PeopleRepository peopleRepo;
	
	public PeopleServiceImpl(PeopleRepository peopleRepo) {
		super();
		this.peopleRepo = peopleRepo;
	}

	
	public String createPeopleInfo(PeopleDetailss peopleDetails) {
		peopleRepo.save(peopleDetails);
		return "Success!!!";
	}

	@Override
	public String updatePeopleInfo(PeopleDetailss peopleDetails) {
		peopleRepo.save(peopleDetails);
		return "Updated Data!!!";
	}

	@Override
	public String deletePeopleInfo(Integer age) {
		peopleRepo.deleteById(age);
		return "Deleted!!!";
	}

	@Override
	public PeopleDetailss getPeopleInfo(Integer age) {
		return peopleRepo.findById(age).get();
	}

	@Override
	public List<PeopleDetailss> getAllPeopleInfo() {
		return peopleRepo.findAll();
	}

	
	
}

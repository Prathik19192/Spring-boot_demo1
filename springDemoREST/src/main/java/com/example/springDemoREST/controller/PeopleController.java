package com.example.springDemoREST.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.springDemoREST.model.PeopleDetailss;
import com.example.springDemoREST.service.PeopleServiceInterface;

@RestController
@RequestMapping("/peopledata")
public class PeopleController {
	
	PeopleServiceInterface peopleService;
	
	public PeopleController(PeopleServiceInterface peopleService) {
		super();
		this.peopleService = peopleService;
	}

	@GetMapping("{age}")
	public PeopleDetailss getPersonInfo(@PathVariable("age") Integer age) {
		return peopleService.getPeopleInfo(age);
	}
	
	@GetMapping()
	public List<PeopleDetailss> getAllPersonInfo() {
		return peopleService.getAllPeopleInfo();
	}
	
	@PostMapping
	public String createPersonInfo(@RequestBody PeopleDetailss peopleDetails) {
		peopleService.createPeopleInfo(peopleDetails);
		return "PeopleInfo created successfully";
	}
	
	@PutMapping
	public String updatePersonInfo(@RequestBody PeopleDetailss peopleDetails) {
		peopleService.updatePeopleInfo(peopleDetails);
		return "PeopleInfo Updated successfully";
	}
	
	@DeleteMapping("{age}")
	public String deletePersonInfo(@PathVariable("age") Integer age) {
		peopleService.deletePeopleInfo(age);
		return "Deleted PeopleInfo";
	}

}

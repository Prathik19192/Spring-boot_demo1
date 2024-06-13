package com.example.springDemoREST.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springDemoREST.model.PeopleDetailss;

public interface PeopleRepository extends JpaRepository<PeopleDetailss, Integer> {

}

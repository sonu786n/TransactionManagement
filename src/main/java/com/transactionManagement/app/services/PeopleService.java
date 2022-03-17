package com.transactionManagement.app.services;

import java.util.List;

import com.transactionManagement.app.dtos.PeopleRequestDto;
import com.transactionManagement.app.entities.People;

public interface PeopleService {

	List<People> addPeople(PeopleRequestDto dto, String value);

	String updatePeople(People dto);

	String deletePeople(Integer id);

	List<People> getPeople(String userName);

}

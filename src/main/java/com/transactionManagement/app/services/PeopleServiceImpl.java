package com.transactionManagement.app.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transactionManagement.app.dtos.PeopleRequestDto;
import com.transactionManagement.app.entities.People;
import com.transactionManagement.app.repositories.PeopleRepo;

@Service
public class PeopleServiceImpl implements PeopleService {

	@Autowired
	PeopleRepo repo;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public List<People> addPeople(PeopleRequestDto dto, String username) {
		People obj = modelMapper.map(dto, People.class);
		obj.setUser_Name(username);
		repo.save(obj);
		return repo.findByUserName(username);

	}

	@Override
	public String updatePeople(People dto) {

		People dbPerson = repo.findById(dto.getId()).orElseThrow(() -> new RuntimeException("Person not found"));

		dbPerson.setName(dto.getName());
		dbPerson.setSurname(dto.getSurname());
		dbPerson.setEmail(dto.getEmail());
		dbPerson.setMobile(dto.getMobile());
		dbPerson.setAddress(dto.getAddress());

		repo.save(dbPerson);

		return dto.getName() + " is updated sucessfully";
	}

	@Override
	public String deletePeople(Integer id) {

		repo.deleteById(id);
		
		return id+" is deleted Successfully";
	}

	@Override
	public List<People> getPeople(String userName) {
		
		List<People> peopleList = repo.findByUserName(userName);
		
		return repo.findAll();
	}

}

package com.rapidapi.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rapidapi.entity.DogBreedEntity;

@Repository
public interface DogBreedRepository extends JpaRepository<DogBreedEntity, Integer> {

	
	List<DogBreedEntity> findByBreed(String breed);
}

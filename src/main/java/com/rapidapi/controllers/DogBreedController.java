package com.rapidapi.controllers;

import java.util.List;
import java.util.logging.Logger;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rapidapi.dto.DogBreedDto;
import com.rapidapi.exceptions.RapidApiException;
import com.rapidapi.services.DogBreedService;

@RestController
public class DogBreedController {
	
	
	@Autowired
	DogBreedService dogBreedService;
	
	
	@RequestMapping("/")
	public String index() {
		return "This is api designed and developed for Rapid API - Dog Breed Application";
	}

	
	@RequestMapping(value="/dog_breeds",method = RequestMethod.GET)
	public ResponseEntity<List<DogBreedDto>> getDogBreeds() throws RapidApiException{
		try {
			return ResponseEntity.status(HttpStatus.OK).body(dogBreedService.listAllDogBreeds());
		}catch(RapidApiException e) {
			throw e;
		}
	}
	@RequestMapping(value="/dog_breeds",method = RequestMethod.POST)
	public ResponseEntity<Object> saveDogBreeds(@RequestBody DogBreedDto dogBreedDto) throws RapidApiException{
		try {
			return ResponseEntity.status(HttpStatus.OK).body(dogBreedService.saveDogBreed(dogBreedDto));
		}catch(RapidApiException e) {
			throw e;
		}
	}
	@RequestMapping(value="/dog_breeds",method = RequestMethod.PUT)
	public ResponseEntity<Object> updateDogBreeds(@RequestBody DogBreedDto dogBreedDto) throws RapidApiException{
		try {
			return ResponseEntity.status(HttpStatus.OK).body(dogBreedService.saveDogBreed(dogBreedDto));
		}catch(RapidApiException e) {
			throw e;
		}
	}
	@RequestMapping(value="/dog_breeds/{breed}",method = RequestMethod.GET)
	public  ResponseEntity<List<DogBreedDto>> getDogBreeds(@PathVariable("breed") String breed) throws RapidApiException{
		try {
			return ResponseEntity.status(HttpStatus.OK).body(dogBreedService.fingDogBreedsByBreed(breed));
		}catch(RapidApiException e) {
			throw e;
		}
	}
}
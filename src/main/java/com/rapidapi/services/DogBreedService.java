package com.rapidapi.services;

import java.util.List;

import com.rapidapi.dto.DogBreedDto;
import com.rapidapi.exceptions.RapidApiException;


public interface DogBreedService {

	List<DogBreedDto> listAllDogBreeds()throws RapidApiException;
	List<DogBreedDto> fingDogBreedsByBreed(String breed) throws RapidApiException;
	DogBreedDto saveDogBreed(DogBreedDto dogBreedDto) throws RapidApiException;
}

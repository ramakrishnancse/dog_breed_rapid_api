package com.rapidapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.rapidapi.dao.DogBreedRepository;
import com.rapidapi.dto.DogBreedDto;
import com.rapidapi.entity.DogBreedEntity;
import com.rapidapi.exceptions.RapidApiException;

import datamapper.DogBreedDtoMapper;

@Service
public class DogBreedServiceImpl implements DogBreedService {

	@Autowired
	DogBreedRepository dogBreedRepository;
	
	
	
	

	@Override
	public List<DogBreedDto> listAllDogBreeds()throws RapidApiException {
				
		 List<DogBreedDto> list = new ArrayList<>(dogBreedRepository.findAll().size());
			
		 dogBreedRepository.findAll().forEach(dogbreed->{
			 list.add( DogBreedDto.builder()
					 .breed(dogbreed.getBreed())
					 .id(dogbreed.getId())
					 .meta(dogbreed.getMeta())
					 .origin(dogbreed.getOrigin()).build() 
			 	);
		 });
		if(list.size()==0) throw new RapidApiException(HttpStatus.NOT_FOUND,"Dog Breeds not found","NOT_FOUND");
		return list;
	}

	@Override
	public List<DogBreedDto> fingDogBreedsByBreed(String breed) throws RapidApiException {
			List<DogBreedDto> list = new ArrayList<>(dogBreedRepository.findByBreed(breed).size());
		 
			
		 dogBreedRepository.findByBreed(breed).forEach(dogbreed->{
			 list.add( DogBreedDto.builder()
					 .breed(dogbreed.getBreed())
					 .id(dogbreed.getId())
					 .meta(dogbreed.getMeta())
					 .origin(dogbreed.getOrigin()).build() 
			 	);
		 });
		if(list.size()==0) throw new RapidApiException(HttpStatus.NOT_FOUND,"Dog Breeds not found","NOT_FOUND");
		return list;
	}

	@Override
	public DogBreedDto saveDogBreed(DogBreedDto dogBreedDto) throws RapidApiException {
		DogBreedEntity dogBreedEntity = new DogBreedEntity();
		dogBreedEntity.setBreed(dogBreedDto.getBreed());
		dogBreedEntity.setMeta(dogBreedDto.getMeta());
		dogBreedEntity.setOrigin(dogBreedDto.getOrigin());
		DogBreedEntity responseDogBreedEntity = dogBreedRepository.save(dogBreedEntity);
		return DogBreedDto.builder()
				 .breed(responseDogBreedEntity.getBreed())
				 .id(responseDogBreedEntity.getId())
				 .meta(responseDogBreedEntity.getMeta())
				 .origin(responseDogBreedEntity.getOrigin()).build();
	}

}

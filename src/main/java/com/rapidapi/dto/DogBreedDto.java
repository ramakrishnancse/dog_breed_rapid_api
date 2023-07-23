package com.rapidapi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@JsonInclude
public class DogBreedDto {
	
	private Integer id;
	private String breed;
	private String origin;
	private String url;
	private String meta;

	public DogBreedDto(){}
	public DogBreedDto(Integer id,String breed,String origin,String url, String meta){
		this.id = id;
		this.breed = breed;
		this.origin = origin;
		this.url = url;
		this.meta = meta;
	}
}

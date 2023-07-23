package com.rapidapi.entity;

import java.io.Serializable;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="dog_breed")
@Setter
@Getter

@NamedNativeQuery(query="select id,breed,origin,url,meta from dog_breed d where d.breed=?", name = "findByBreed")
@SqlResultSetMapping(name = "com.rapidapi.dto.DogBreedDto",
classes = @ConstructorResult(columns = { @ColumnResult(name= "id"),
		@ColumnResult(name= "breed"),@ColumnResult(name= "origin"),@ColumnResult(name= "url"),@ColumnResult(name= "meta")}, targetClass = com.rapidapi.dto.DogBreedDto.class))
public class DogBreedEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// id, breed, origin, url ,meta,img
	@Id
	@GeneratedValue
	private Integer id;
	private String breed;
	private String origin;
	private String url;
	private String meta;
		
}

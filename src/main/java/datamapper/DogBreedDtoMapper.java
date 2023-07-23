package datamapper;

import org.mapstruct.Mapper;

import com.rapidapi.dto.DogBreedDto;
import com.rapidapi.entity.DogBreedEntity;

@Mapper
public interface DogBreedDtoMapper {
	
	DogBreedDto convertDogBreedEntityToDogBreedDto(DogBreedEntity dogBreedEntity);
	DogBreedEntity convertDogBreedDtoToDogBreedEntity(DogBreedDto dogBreedEntity);
}

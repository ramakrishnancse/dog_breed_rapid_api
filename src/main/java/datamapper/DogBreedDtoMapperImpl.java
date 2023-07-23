package datamapper;

import com.rapidapi.dto.DogBreedDto;
import com.rapidapi.entity.DogBreedEntity;

public class DogBreedDtoMapperImpl implements DogBreedDtoMapper {

	@Override
	public DogBreedDto convertDogBreedEntityToDogBreedDto(DogBreedEntity dogBreedEntity) {
		
		if(dogBreedEntity == null)
		
		return null;
		
		DogBreedDto dogBreedDto = new DogBreedDto();
		
		
		
		return dogBreedDto;
	}

	@Override
	public DogBreedEntity convertDogBreedDtoToDogBreedEntity(DogBreedDto dogBreedEntity) {
		
		
		
		return null;
	}
	
	

}

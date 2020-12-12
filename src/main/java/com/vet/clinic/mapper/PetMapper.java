package com.vet.clinic.mapper;

import com.vet.clinic.dto.PetDto;
import com.vet.clinic.entity.Pet;
import com.vet.clinic.mapper.base.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {OwnerMapper.class})
public interface PetMapper extends BaseMapper<Integer, PetDto, Pet> {

    @Override
    @Mappings({
            @Mapping(target = "owner", ignore = true)
    })
    PetDto toBaseDto(Pet baseEntityPram);

}

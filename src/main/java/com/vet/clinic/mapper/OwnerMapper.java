package com.vet.clinic.mapper;

import com.vet.clinic.dto.OwnerDto;
import com.vet.clinic.entity.Owner;
import com.vet.clinic.mapper.base.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {PetMapper.class})
public interface OwnerMapper extends BaseMapper<Integer, OwnerDto, Owner> {
}

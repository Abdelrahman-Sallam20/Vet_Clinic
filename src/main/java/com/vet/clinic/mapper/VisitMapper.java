package com.vet.clinic.mapper;

import com.vet.clinic.dto.VisitDto;
import com.vet.clinic.entity.Visit;
import com.vet.clinic.mapper.base.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {PetMapper.class, ClinicMapper.class, DoctorMapper.class})
public interface VisitMapper extends BaseMapper<Integer, VisitDto, Visit> {
}

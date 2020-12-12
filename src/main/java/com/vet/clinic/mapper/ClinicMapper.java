package com.vet.clinic.mapper;

import com.vet.clinic.dto.ClinicDto;
import com.vet.clinic.entity.Clinic;
import com.vet.clinic.mapper.base.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClinicMapper extends BaseMapper<Integer, ClinicDto, Clinic> {
}

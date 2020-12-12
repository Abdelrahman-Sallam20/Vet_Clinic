package com.vet.clinic.mapper;

import com.vet.clinic.dto.DoctorDto;
import com.vet.clinic.entity.Doctor;
import com.vet.clinic.mapper.base.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ClinicMapper.class})
public interface DoctorMapper extends BaseMapper<Integer, DoctorDto, Doctor> {
}

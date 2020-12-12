package com.vet.clinic.dto;

import com.vet.clinic.dto.base.BaseDto;
import lombok.Data;

import java.util.Date;

@Data
public class VisitDto extends BaseDto<Integer> {

    private Date date;
    private PetDto pet;
    private DoctorDto doctor;
    private ClinicDto clinic;
}

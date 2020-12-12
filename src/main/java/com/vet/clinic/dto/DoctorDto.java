package com.vet.clinic.dto;

import com.vet.clinic.dto.base.BaseDto;
import lombok.Data;


@Data
public class DoctorDto extends BaseDto<Integer> {

    private String name;
    private String phone;
    private String photo;
    private String bio;
    private ClinicDto clinic;
}

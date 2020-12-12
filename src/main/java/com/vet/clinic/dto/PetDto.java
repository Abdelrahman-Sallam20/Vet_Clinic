package com.vet.clinic.dto;

import com.vet.clinic.dto.base.BaseDto;
import lombok.Data;

import java.util.Date;

@Data
public class PetDto extends BaseDto<Integer> {

    private String name;
    private String gender;
    private Date dateOfBirth;
    private String animalkind;
    private String photo;
    private Float weight;
    private OwnerDto owner;
}

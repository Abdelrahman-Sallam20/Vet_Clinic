package com.vet.clinic.dto;

import com.vet.clinic.dto.base.BaseDto;
import lombok.Data;

import java.util.List;

@Data
public class OwnerDto extends BaseDto<Integer> {

    private String name;
    private String phone;
    private String gender;
    private String address;
    private String email;
    private List<PetDto> petList;

}

package com.vet.clinic.dto;

import com.vet.clinic.dto.base.BaseDto;
import lombok.Data;

@Data
public class ClinicDto extends BaseDto<Integer> {

    private String name;
    private String address;
    private String phone;
    private Integer workingDays;
    private Integer hours;
    private String email;
    private String networkUrl;
}

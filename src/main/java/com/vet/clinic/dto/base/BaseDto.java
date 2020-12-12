package com.vet.clinic.dto.base;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class BaseDto<ID extends Serializable> implements Serializable {

    private static final long serialVersionUID = -4958883161160680941L;
    private ID id;
}

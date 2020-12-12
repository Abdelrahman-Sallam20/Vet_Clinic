package com.vet.clinic.entity.base;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Data
public abstract class BaseEntity<ID extends Serializable> implements Serializable {

    private static final long serialVersionUID = -4955049246832738075L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;
}

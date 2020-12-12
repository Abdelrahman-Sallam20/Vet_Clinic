package com.vet.clinic.entity;

import com.vet.clinic.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "clinic")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "clinic_id"))
})
@Data
public class Clinic extends BaseEntity<Integer> {

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "working_days")
    private Integer workingDays;

    @Column(name = "hours")
    private Integer hours;

    @Column(name = "email")
    private String email;

    @Column(name = "network_url")
    private String networkUrl;
}

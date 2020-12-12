package com.vet.clinic.entity;

import com.vet.clinic.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "doctor_id"))
})
@Data
public class Doctor extends BaseEntity<Integer> {

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "photo")
    private String photo;

    @Column(name = "bio")
    private String bio;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "clinic_clinic_id")
    private Clinic clinic;
}

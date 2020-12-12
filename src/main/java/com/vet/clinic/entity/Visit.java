package com.vet.clinic.entity;

import com.vet.clinic.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "visit")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "visit_id"))
})
@Data
public class Visit extends BaseEntity<Integer> {

    @Column(name = "date")
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_pet_id")
    private Pet pet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_doctor_id")
    private Doctor doctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clinic_clinic_id")
    private Clinic clinic;
}

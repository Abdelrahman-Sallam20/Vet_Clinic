package com.vet.clinic.entity;

import com.vet.clinic.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pet")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "pet_id"))
})
@Data
public class Pet extends BaseEntity<Integer> {

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_birth")
    private Date dateOfBirth;

    @Column(name = "animal_kind")
    private String animalkind;

    @Column(name = "photos")
    private String photo;

    @Column(name = "weight")
    private Float weight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_owner_id")
    private Owner owner;

//    @OneToMany(
//            mappedBy = "pet",
//            targetEntity = Visit.class
//    )
//    private List<Visit> visitList;
}

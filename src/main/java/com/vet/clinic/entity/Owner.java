package com.vet.clinic.entity;

import com.vet.clinic.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "owner")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "owner_id"))
})
@Data
public class Owner extends BaseEntity<Integer> {

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @OneToMany(
            mappedBy = "owner",
            targetEntity = Pet.class
    )
    private List<Pet> petList;
}

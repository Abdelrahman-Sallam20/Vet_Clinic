package com.vet.clinic.repository;

import com.vet.clinic.entity.Pet;
import com.vet.clinic.repository.base.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends BaseRepository<Integer, Pet> {

    @Query(value = "select * FROM clinic.pet WHERE owner_owner_id=?1", nativeQuery = true)
    List<Pet> findListOfOwnerPets(Integer ownerId);
}

package com.vet.clinic.repository;

import com.vet.clinic.entity.Owner;
import com.vet.clinic.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends BaseRepository<Integer, Owner> {
}

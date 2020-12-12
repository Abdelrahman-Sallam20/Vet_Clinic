package com.vet.clinic.repository;

import com.vet.clinic.entity.Visit;
import com.vet.clinic.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends BaseRepository<Integer, Visit> {
}

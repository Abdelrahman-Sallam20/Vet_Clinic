package com.vet.clinic.repository;

import com.vet.clinic.entity.Clinic;
import com.vet.clinic.repository.base.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClinicRepository extends BaseRepository<Integer, Clinic> {

    @Query(value = " SELECT * FROM clinic.clinic WHERE address LIKE %?1% OR phone LIKE %?1% ", nativeQuery = true)
    List<Clinic> findClinicsByAddressOrPhone(String Adress, String phone);

}

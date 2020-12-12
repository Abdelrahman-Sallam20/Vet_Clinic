package com.vet.clinic.repository;

import com.vet.clinic.entity.Doctor;
import com.vet.clinic.repository.base.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends BaseRepository<Integer, Doctor> {

    @Query(value = "select * FROM clinic.doctor where clinic_clinic_id=?1", nativeQuery = true)
    List<Doctor> findListClinicDoctors(Integer clinicId);
}

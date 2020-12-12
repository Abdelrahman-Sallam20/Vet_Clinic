package com.vet.clinic.service;

import com.vet.clinic.entity.Doctor;
import com.vet.clinic.repository.DoctorRepository;
import com.vet.clinic.service.base.BaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DoctorService extends BaseService<Integer, Doctor> {

    private DoctorRepository doctorRepository;
    private ClinicService clinicService;

    @Override
    public DoctorRepository getRepository() {
        return doctorRepository;
    }

    public List<Doctor> getDoctorsByClinicId(Integer clinicId) {
        return doctorRepository.findListClinicDoctors(clinicId);
    }

    public Doctor assignDoctor(Integer doctorId, Integer clinicId) {
        Doctor doctor = findById(doctorId);
        if (clinicId == null) {
            doctor.setClinic(null);
            updateEntity(doctor);
        }
        doctor.setClinic(clinicService.findById(clinicId));
        return updateEntity(doctor);
    }
}

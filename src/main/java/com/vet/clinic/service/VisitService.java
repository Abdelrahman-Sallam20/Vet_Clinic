package com.vet.clinic.service;

import com.vet.clinic.entity.Visit;
import com.vet.clinic.repository.VisitRepository;
import com.vet.clinic.service.base.BaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@AllArgsConstructor
@Service
public class VisitService extends BaseService<Integer, Visit> {

    private VisitRepository visitRepository;
    private ClinicService clinicService;
    private PetService petService;
    private DoctorService doctorService;

    @Override
    public VisitRepository getRepository() {
        return visitRepository;
    }

    @Override
    public Visit createEntity(Visit entity) {
        LocalDateTime localDateTime = LocalDateTime.now();
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        entity.setDate(new Date(date.getTime()));
        return super.createEntity(entity);
    }
}

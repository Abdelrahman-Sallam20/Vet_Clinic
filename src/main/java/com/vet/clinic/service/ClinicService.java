package com.vet.clinic.service;

import com.vet.clinic.entity.Clinic;
import com.vet.clinic.repository.ClinicRepository;
import com.vet.clinic.service.base.BaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ClinicService extends BaseService<Integer, Clinic> {

    private ClinicRepository clinicRepository;

    @Override
    public ClinicRepository getRepository() {
        return clinicRepository;
    }

    public List<Clinic> getClinicsByAddressOrPhone(String AddressOrPhone) {
        return clinicRepository.findClinicsByAddressOrPhone(AddressOrPhone, AddressOrPhone);
    }
}

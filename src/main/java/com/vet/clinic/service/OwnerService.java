package com.vet.clinic.service;

import com.vet.clinic.entity.Owner;
import com.vet.clinic.repository.OwnerRepository;
import com.vet.clinic.service.base.BaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class OwnerService extends BaseService<Integer, Owner> {

    private OwnerRepository ownerRepository;

    @Override
    public OwnerRepository getRepository() {
        return ownerRepository;
    }
}

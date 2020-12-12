package com.vet.clinic.service;

import com.vet.clinic.entity.Pet;
import com.vet.clinic.repository.PetRepository;
import com.vet.clinic.service.base.BaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PetService extends BaseService<Integer, Pet> {

    private PetRepository petRepository;

    @Override
    public PetRepository getRepository() {
        return petRepository;
    }

    public List<Pet> getPetsByOwnerId(Integer ownerId) {
        return petRepository.findListOfOwnerPets(ownerId);
    }
}

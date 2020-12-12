package com.vet.clinic.controller;

import com.vet.clinic.controller.base.BaseController;
import com.vet.clinic.dto.PetDto;
import com.vet.clinic.entity.Pet;
import com.vet.clinic.mapper.PetMapper;
import com.vet.clinic.response.SearchResultDto;
import com.vet.clinic.response.SuccessResponse;
import com.vet.clinic.response.base.BaseResponse;
import com.vet.clinic.service.PetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/pet")
public class PetController extends BaseController<Integer, Pet, PetDto> {

    private PetMapper petMapper;
    private PetService petService;

    @Override
    protected PetMapper getBaseMapper() {
        return petMapper;
    }

    @Override
    protected PetService getBaseService() {
        return petService;
    }

    @Override
    public BaseResponse listAll(@RequestParam(name = "page") int page, @RequestParam(name = "size") int size) {
        return super.listAll(page, size);
    }

    @Override
    public BaseResponse newEntity(@RequestBody PetDto bsEntityPram) {
        return super.newEntity(bsEntityPram);
    }

    @Override
    public BaseResponse updateEntity(@RequestBody PetDto bsEntityParam) {
        return super.updateEntity(bsEntityParam);
    }

    @Override
    public BaseResponse deleteEntity(@RequestParam(name = "id") Integer entityId) {
        return super.deleteEntity(entityId);
    }

    @Override
    public BaseResponse findById(@RequestParam(name = "id") Integer entityId) {
        return super.findById(entityId);
    }

    @RequestMapping(path = "/find-pets-by-ownerId", method = RequestMethod.GET)
    public BaseResponse getPetsByOwnerId(@RequestParam("ownerId") Integer ownerId) {
        List<Pet> petList = petService.getPetsByOwnerId(ownerId);
        List<PetDto> petDtoList = petMapper.toBaseDtoList(petList);
        return new SuccessResponse<>(new SearchResultDto<>(petDtoList, petDtoList.size()));
    }
}

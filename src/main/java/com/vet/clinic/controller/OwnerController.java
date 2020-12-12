package com.vet.clinic.controller;

import com.vet.clinic.controller.base.BaseController;
import com.vet.clinic.dto.OwnerDto;
import com.vet.clinic.entity.Owner;
import com.vet.clinic.mapper.OwnerMapper;
import com.vet.clinic.response.base.BaseResponse;
import com.vet.clinic.service.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/owner")
public class OwnerController extends BaseController<Integer, Owner, OwnerDto> {

    private OwnerMapper ownerMapper;
    private OwnerService ownerService;

    @Override
    protected OwnerMapper getBaseMapper() {
        return ownerMapper;
    }

    @Override
    protected OwnerService getBaseService() {
        return ownerService;
    }

    @Override
    public BaseResponse listAll(@RequestParam(name = "page") int page, @RequestParam(name = "size") int size) {
        return super.listAll(page, size);
    }

    @Override
    public BaseResponse newEntity(@RequestBody OwnerDto bsEntityPram) {
        return super.newEntity(bsEntityPram);
    }

    @Override
    public BaseResponse updateEntity(@RequestBody OwnerDto bsEntityParam) {
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
}

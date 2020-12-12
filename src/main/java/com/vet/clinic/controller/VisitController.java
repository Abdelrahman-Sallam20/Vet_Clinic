package com.vet.clinic.controller;

import com.vet.clinic.controller.base.BaseController;
import com.vet.clinic.dto.VisitDto;
import com.vet.clinic.entity.Visit;
import com.vet.clinic.mapper.VisitMapper;
import com.vet.clinic.response.SuccessResponse;
import com.vet.clinic.response.base.BaseResponse;
import com.vet.clinic.service.VisitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/visit")
public class VisitController extends BaseController<Integer, Visit, VisitDto> {

    private VisitMapper visitMapper;
    private VisitService visitService;

    @Override
    protected VisitMapper getBaseMapper() {
        return visitMapper;
    }

    @Override
    protected VisitService getBaseService() {
        return visitService;
    }

    @Override
    public BaseResponse newEntity(@RequestBody VisitDto bsEntityPram) {
        return super.newEntity(bsEntityPram);
    }

    @Override
    public BaseResponse findById(@RequestParam(name = "id") Integer entityId) {
        return super.findById(entityId);
    }

    @PostMapping(path = "/create-clinic-visit")
    public BaseResponse createVisit(@RequestBody VisitDto visitDto) {
        return new SuccessResponse<>(
                visitMapper.toBaseDto(visitService.createEntity(visitMapper.toBaseEntity(visitDto))));
    }
}

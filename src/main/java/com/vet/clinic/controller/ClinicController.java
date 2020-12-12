package com.vet.clinic.controller;

import com.vet.clinic.controller.base.BaseController;
import com.vet.clinic.dto.ClinicDto;
import com.vet.clinic.entity.Clinic;
import com.vet.clinic.mapper.ClinicMapper;
import com.vet.clinic.response.SearchResultDto;
import com.vet.clinic.response.SuccessResponse;
import com.vet.clinic.response.base.BaseResponse;
import com.vet.clinic.service.ClinicService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/clinic")
public class ClinicController extends BaseController<Integer, Clinic, ClinicDto> {

    private ClinicMapper clinicMapper;
    private ClinicService clinicService;

    @Override
    protected ClinicMapper getBaseMapper() {
        return clinicMapper;
    }

    @Override
    protected ClinicService getBaseService() {
        return clinicService;
    }

    @Override
    public BaseResponse listAll(@RequestParam(name = "page") int page, @RequestParam(name = "size") int size) {
        return super.listAll(page, size);
    }

    @Override
    public BaseResponse newEntity(@RequestBody ClinicDto bsEntityPram) {
        return super.newEntity(bsEntityPram);
    }

    @Override
    public BaseResponse updateEntity(@RequestBody ClinicDto bsEntityParam) {
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

    @RequestMapping(path = "/find-clinic-by-address-or-phone", method = RequestMethod.GET)
    public BaseResponse getClinicsByAddressOrPhone(@RequestParam("adress-phone") String addressOrPhone) {
        List<Clinic> clinicList = clinicService.getClinicsByAddressOrPhone(addressOrPhone);
        List<ClinicDto> clinicListDto = clinicMapper.toBaseDtoList(clinicList);
        return new SuccessResponse<>(new SearchResultDto<>(clinicListDto, clinicListDto.size()));
    }
}

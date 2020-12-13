package com.vet.clinic.controller;

import com.vet.clinic.controller.base.BaseController;
import com.vet.clinic.dto.DoctorDto;
import com.vet.clinic.entity.Doctor;
import com.vet.clinic.mapper.DoctorMapper;
import com.vet.clinic.response.SearchResultDto;
import com.vet.clinic.response.SuccessResponse;
import com.vet.clinic.response.base.BaseResponse;
import com.vet.clinic.service.DoctorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/doctor")
public class DoctorController extends BaseController<Integer, Doctor, DoctorDto> {

    private DoctorMapper doctorMapper;
    private DoctorService doctorService;

    @Override
    protected DoctorMapper getBaseMapper() {
        return doctorMapper;
    }

    @Override
    protected DoctorService getBaseService() {
        return doctorService;
    }

    @Override
    public BaseResponse listAll(@RequestParam(name = "page") int page, @RequestParam(name = "size") int size) {
        return super.listAll(page, size);
    }

    @Override
    public BaseResponse newEntity(@RequestBody DoctorDto bsEntityPram) {
        return super.newEntity(bsEntityPram);
    }

    @Override
    public BaseResponse updateEntity(@RequestBody DoctorDto bsEntityParam) {
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

    @GetMapping(path = "/find-doctors-by-clinic-id")
    public BaseResponse getDoctorsByClinicId(@RequestParam("clinicId") Integer clinicId) {
        List<Doctor> doctorList = doctorService.getDoctorsByClinicId(clinicId);
        List<DoctorDto> doctorDtoList = doctorMapper.toBaseDtoList(doctorList);
        return new SuccessResponse<>(new SearchResultDto<>(doctorDtoList, doctorDtoList.size()));
    }

    @RequestMapping(path = "/assign-de-assign-doctor", method = RequestMethod.PUT)
    public BaseResponse assignOrDeAssignDoctor(@RequestParam("doctorId") Integer doctorId, @RequestParam(value = "clinicId", required = false) Integer clinicId) {
        DoctorDto doctorDto = doctorMapper.toBaseDto(doctorService.assignDoctor(doctorId, clinicId));
        return new SuccessResponse<>(doctorDto);
    }
}

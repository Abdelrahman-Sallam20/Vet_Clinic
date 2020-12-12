package com.vet.clinic.controller.base;

import com.vet.clinic.dto.base.BaseDto;
import com.vet.clinic.entity.base.BaseEntity;
import com.vet.clinic.mapper.base.BaseMapper;
import com.vet.clinic.response.SearchResultDto;
import com.vet.clinic.response.SearchResultEntity;
import com.vet.clinic.response.SuccessResponse;
import com.vet.clinic.response.base.BaseResponse;
import com.vet.clinic.service.base.BaseService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;

public abstract class BaseController<ID extends Serializable, Entity extends BaseEntity<ID>, Dto extends BaseDto<ID>> {

    protected abstract BaseMapper<ID, Dto, Entity> getBaseMapper();

    protected abstract BaseService<ID, Entity> getBaseService();

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public BaseResponse listAll(@RequestParam("page") int page, @RequestParam("size") int size) {
        SearchResultEntity<ID, Entity> searchResult = getBaseService().listAll(page, size);
        return new SuccessResponse<SearchResultDto<ID, Dto>>(new SearchResultDto<ID, Dto>(
                getBaseMapper().toBaseDtoList(searchResult.getResultData()), searchResult.getTotalItemsCount()));
    }

    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public BaseResponse newEntity(@RequestBody Dto bsEntityPram) {
        return new SuccessResponse<Dto>(
                getBaseMapper().toBaseDto(getBaseService().createEntity(getBaseMapper().toBaseEntity(bsEntityPram))));
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public BaseResponse updateEntity(@RequestBody Dto bsEntityParam) {
        return new SuccessResponse<Dto>(
                getBaseMapper().toBaseDto(getBaseService().updateEntity(getBaseMapper().toBaseEntity(bsEntityParam))));
    }

    @RequestMapping(path = "/delete", method = RequestMethod.DELETE)
    public BaseResponse deleteEntity(@RequestParam("id") ID entityId) {
        getBaseService().hardDeleteEntity(getBaseService().findById(entityId));
        return new SuccessResponse<>(null);
    }

    @RequestMapping(path = "/find", method = RequestMethod.GET)
    public BaseResponse findById(@RequestParam("id") ID entityId) {
        return new SuccessResponse<Dto>(getBaseMapper().toBaseDto(getBaseService().findById(entityId)));
    }

}

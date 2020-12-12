package com.vet.clinic.mapper.base;


import com.vet.clinic.dto.base.BaseDto;
import com.vet.clinic.entity.base.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<ID extends Serializable, baseDto extends BaseDto<ID>,
        baseEntity extends BaseEntity<ID>> {

    baseDto toBaseDto(baseEntity baseEntityPram);

    baseEntity toBaseEntity(baseDto baseDtoPram);

    List<baseDto> toBaseDtoList(List<baseEntity> baseEntityList);

    List<baseEntity> toBaseEntityList(List<baseDto> baseDtoList);
}

package com.vet.clinic.service.base;

import com.vet.clinic.entity.base.BaseEntity;
import com.vet.clinic.repository.base.BaseRepository;
import com.vet.clinic.response.SearchResultEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseService<ID extends Serializable, E extends BaseEntity<ID>> {

    public abstract BaseRepository<ID, E> getRepository();

    public SearchResultEntity<ID, E> listAll(int page, int size) {
        Page<E> entityPage = getRepository().findAll(PageRequest.of(page, size));
        List<E> contentList = entityPage.getContent();
        long totalElements = entityPage.getTotalElements();
        return new SearchResultEntity<ID, E>(contentList, totalElements);
    }


    @Transactional
    public E createEntity(E entity) {
        return getRepository().save(entity);
    }


    @Transactional
    public E updateEntity(E entity) {
        return getRepository().save(entity);
    }

    public boolean hardDeleteEntity(E entity) {
        getRepository().delete(entity);
        return true;
    }

    public E findById(ID entityId) {
        Optional<E> optional = getRepository().findById(entityId);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }


}

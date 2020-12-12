package com.vet.clinic.response;


import com.vet.clinic.dto.base.BaseDto;

import java.io.Serializable;
import java.util.List;

public class SearchResultDto<ID extends Serializable, T extends BaseDto<ID>> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -4319279428294204611L;
    private List<T> resultData;
    private long totalItemsCount;

    public SearchResultDto(List<T> resultData, long totalElements) {
        super();
        this.resultData = resultData;
        this.totalItemsCount = totalElements;
    }

    public List<T> getResultData() {
        return resultData;
    }

    public void setResultData(List<T> resultData) {
        this.resultData = resultData;
    }

    public long getTotalItemsCount() {
        return totalItemsCount;
    }

    public void setTotalItemsCount(long totalItemsCount) {
        this.totalItemsCount = totalItemsCount;
    }
}

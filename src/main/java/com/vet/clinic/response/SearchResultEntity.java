package com.vet.clinic.response;


import com.vet.clinic.entity.base.BaseEntity;

import java.io.Serializable;
import java.util.List;

public class SearchResultEntity<ID extends Serializable, T extends BaseEntity<ID>> implements Serializable {

    private static final long serialVersionUID = -5450485512270772036L;
    private List<T> resultData;
    private long totalItemsCount;

    public SearchResultEntity(List<T> resultData, long totalElements) {
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

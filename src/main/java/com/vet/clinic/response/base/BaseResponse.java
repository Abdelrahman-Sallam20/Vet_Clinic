package com.vet.clinic.response.base;

public abstract class BaseResponse {

    private boolean errorStatus;

    public boolean isErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(boolean errorStatus) {
        this.errorStatus = errorStatus;
    }
}

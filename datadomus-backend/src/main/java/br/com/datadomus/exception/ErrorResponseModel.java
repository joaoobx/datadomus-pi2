package br.com.datadomus.exception;

import java.util.List;

public class ErrorResponseModel {

    private String type;

    private List<ErrorModel> errorModels;

    public ErrorResponseModel(String type, List<ErrorModel> errorModels) {
        this.type = type;
        this.errorModels = errorModels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ErrorModel> getErrorModels() {
        return errorModels;
    }

    public void setErrorModels(List<ErrorModel> errorModels) {
        this.errorModels = errorModels;
    }
}

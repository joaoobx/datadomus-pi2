package br.com.datadomus.exception;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ErrorResponseModel {

    private String type;

    private List<ErrorModel> errorModels;

    public ErrorResponseModel(String type, List<ErrorModel> errorModels) {
        this.type = type;
        this.errorModels = errorModels;
    }

}

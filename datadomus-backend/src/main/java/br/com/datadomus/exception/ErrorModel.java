package br.com.datadomus.exception;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ErrorModel {

    private String code;
    private String detail;
    private String source;

    public ErrorModel(String code, String detail, String source) {
        this.code = code;
        this.detail = detail;
        this.source = source;
    }

    public ErrorModel(String code, String detail) {
        this.code = code;
        this.detail = detail;
    }

}

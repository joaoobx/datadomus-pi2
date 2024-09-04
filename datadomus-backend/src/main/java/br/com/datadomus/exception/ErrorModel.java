package br.com.datadomus.exception;


public class ErrorModel {

    private String code;
    private String detail;
    private String source;

    public ErrorModel(String code, String detail, String source) {
        this.code = code;
        this.detail = detail;
        this.source = source;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}

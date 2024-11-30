package br.com.datadomus.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
@RestController
@Configuration
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ErrorResponseModel handleException(MethodArgumentNotValidException e) {
        List<ErrorModel> errorModels = processErrors(e);
        return new ErrorResponseModel(ErrorType.VALIDATION.toString(), errorModels);
    }

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponseModel handleException(RuntimeException e) {
        List<ErrorModel> errorModels = processErrors(e);
        return new ErrorResponseModel(ErrorType.SERVER.toString(), errorModels);
    }

    private List<ErrorModel> processErrors(MethodArgumentNotValidException e) {
        List<ErrorModel> validationErrorModels = new ArrayList<>();
        for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
            validationErrorModels.add(new ErrorModel(fieldError.getCode(), fieldError.getDefaultMessage(), fieldError.getField()));
        }
        return validationErrorModels;
    }

    private List<ErrorModel> processErrors(RuntimeException e) {
        List<ErrorModel> validationErrorModels = new ArrayList<>();
        validationErrorModels.add(new ErrorModel("500", e.getMessage()));
        return validationErrorModels;
    }
}
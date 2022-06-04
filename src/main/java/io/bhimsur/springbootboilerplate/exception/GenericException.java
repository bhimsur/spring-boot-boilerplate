package io.bhimsur.springbootboilerplate.exception;

import lombok.Getter;

@Getter
public class GenericException extends RuntimeException {

    private static final long serialVersionUID = 8951512887557038928L;

    private final String errorCode;

    public GenericException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

}

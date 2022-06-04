package io.bhimsur.springbootboilerplate.exception;

import io.bhimsur.springbootboilerplate.constant.ErrorConstant;
import io.bhimsur.springbootboilerplate.dto.ErrorDetail;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order
@RestControllerAdvice
@Slf4j
public class CommonExceptionHandler extends ResponseEntityExceptionHandler {
    String activityRefCode = MDC.get("X-B3-TraceId");

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> exception(Exception e) {
        log.error("Exception is UNCAUGHT, details : ", e);
        ErrorDetail errorDetail = ErrorDetail.builder()
                .errorCode(ErrorConstant.GENERAL_ERROR)
                .message(e.getMessage())
                .activityRefCode(activityRefCode)
                .build();

        return new ResponseEntity<>(errorDetail, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = {GenericException.class})
    public ResponseEntity<Object> genericException(GenericException e) {
        log.error("handling genericException, error : {}, cause by : {}", e.getMessage(), e.getCause());
        return buildResponseEntity(e.getErrorCode(), e.getMessage());
    }

    private ResponseEntity<Object> buildResponseEntity(String code, String message) {
        try {
            var errorDetail = ErrorDetail.builder()
                    .errorCode(code)
                    .message(message)
                    .activityRefCode(MDC.get("X-B3-TraceId"))
                    .build();
            return new ResponseEntity<>(errorDetail, HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return exception(e);
        }
    }
}

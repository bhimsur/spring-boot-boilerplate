package io.bhimsur.springbootboilerplate.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ErrorDetail implements Serializable {

    private static final long serialVersionUID = 7859940117469970809L;

    private String errorCode;
    private String message;
    private String activityRefCode;
}

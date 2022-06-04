package io.bhimsur.springbootboilerplate.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StatusConstant {

    ACTIVE(0, "Active"),
    BLOCKED(1, "Blocked");

    private final int status;
    private final String description;
}

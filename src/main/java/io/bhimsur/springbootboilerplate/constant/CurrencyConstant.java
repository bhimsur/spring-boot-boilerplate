package io.bhimsur.springbootboilerplate.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CurrencyConstant {

    AUD("AUD"),
    IDR("IDR");

    private final String currency;

}

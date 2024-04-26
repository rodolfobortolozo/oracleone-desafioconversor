package com.oracle.models;

import lombok.Data;

import java.util.Map;

@Data
public class Exchange {
    private String result;
    private String documentation;
    private String terms_of_use;
    private String base_code;
    private Map<String, Object> conversion_rates;

}

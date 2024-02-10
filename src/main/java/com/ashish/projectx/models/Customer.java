package com.ashish.projectx.models;

import lombok.Data;

@Data
public class Customer {

    private String name;
    private String customerId;
    private long limit;
    private long utilization;
}

package com.xworks.customerapp.customers;

import com.xworks.customerapp.constant.Website;
import com.xworks.customerapp.constant.Address;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class AppDto {

    private int coustmerId;
    private String coustmerName;
    private Address address;
    private Website website;
    private long contact;
}

package com.xworkz.meesho.impl;

import com.xworkz.meesho.dto.CustomerDTO;

public class Tester {
    public static void main(String[] args) {
        System.out.println("main started");

        ECommerceMeesho meesho= new ECommerceMesshoImpl();
        CustomerDTO dto=new CustomerDTO();
        meesho.addCustomer(dto);
        System.out.println("main ended");
    }
}

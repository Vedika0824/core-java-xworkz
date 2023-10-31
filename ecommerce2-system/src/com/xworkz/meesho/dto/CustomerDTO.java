package com.xworkz.meesho.dto;


import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDTO implements Serializable {
    private int id;
    private String name;
    private String email;
    private String password;
    private long phoneNumber;
    private  String address;

}

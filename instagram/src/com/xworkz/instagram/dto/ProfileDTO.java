package com.xworkz.instagram.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDTO implements Serializable {
    private int profileId;
    private long phoneNumber;
    private int age;
    private String password;
    private String uniqueName;



}

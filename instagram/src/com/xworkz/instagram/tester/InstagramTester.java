package com.xworkz.instagram.tester;

import com.xworkz.instagram.dto.ProfileDTO;
import com.xworkz.instagram.implement.InstagramApp;
import com.xworkz.instagram.implement.InstagramAppImpl;

import java.util.List;
import java.util.Scanner;

public class InstagramTester {
    public static void main(String[] args) {

        System.out.println("main started");
        InstagramApp insta = new InstagramAppImpl();
        Scanner sc= new Scanner(System.in);
        ProfileDTO dto = new ProfileDTO();
      /*  System.out.println("enter the phone number");
        dto.setPhoneNumber(sc.nextLong());

        System.out.println("enter the age");
        dto.setAge(sc.nextInt());*/

        System.out.println("enter the name");
        dto.setUniqueName(sc.next());
        ProfileDTO proff1=insta.getIdByName(dto.getUniqueName());
        System.out.println(proff1);
        System.out.println();



        System.out.println("enter the unique name");
        List phoneNumber=insta.getProfilePhoneNumberAndAgeByName(sc.next());
        System.out.println(phoneNumber);

        System.out.println("Enter the phone number");
        dto.setPhoneNumber(sc.nextLong());
        ProfileDTO prof1=insta.getProfileByPhoneNumber(dto.getPhoneNumber());
        System.out.println(prof1);
        System.out.println();

        System.out.println("enter the  id:");
        dto.setProfileId((sc.nextInt()));
        ProfileDTO prof=insta.getUniqueProfileById(dto.getProfileId());
        System.out.println(prof);
        System.out.println();

        System.out.println("enter the age to be updated and id");
        boolean isUpdated = insta.updateAgeById(sc.nextInt(), sc.nextInt());
        System.out.println(isUpdated);

        System.out.println("enter the id to delete profile");
        boolean isProfileDeleted = insta.deleteProfileById(sc.nextInt());
        System.out.println(isProfileDeleted);




        List<ProfileDTO> dtoList= insta.getAllProfile();
        dtoList.stream().forEach(System.out::println);
        //insta.addProfileId(dto);
        System.out.println("main ended");
    }

}
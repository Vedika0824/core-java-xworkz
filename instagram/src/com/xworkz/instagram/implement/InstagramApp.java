package com.xworkz.instagram.implement;

import com.xworkz.instagram.dto.ProfileDTO;

import java.util.List;

public interface InstagramApp {
    public boolean addProfileId(ProfileDTO dto);

    public List<ProfileDTO> getAllProfile();
    public ProfileDTO  getProfileByPhoneNumber(long phoneNumber);

   public List getProfilePhoneNumberAndAgeByName(String name);

    public ProfileDTO getUniqueProfileById(int id);

     public  ProfileDTO getIdByName(String email);

     public boolean updateAgeById(int id,int age);


     //public boolean updatePhoneNumberById(long phoneNumber,int id);
     //update table_name set ph_num=? where id=?

   // public boolean updatenameById(String name,int id);
    //update table_name set name=? where id=?

     public boolean deleteProfileById(int id);

     //public boolean deleteProfileByAge(int id);
}

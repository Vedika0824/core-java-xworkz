package com.xworkz.instagram.implement;

import com.xworkz.instagram.dto.ProfileDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class InstagramAppImpl implements InstagramApp{
    @Override
    public boolean addProfileId(ProfileDTO dto) {
        //JDBC STEPS

        Connection con= null;
        PreparedStatement stmt=null;

        //int id=15;
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram","root","Xworkzodc@123");
            stmt=con.prepareStatement("insert into profile_dto (profile_id,profilephoneNumber,age,password,uniqueProfileName) values(?,?,?,?)");
            //stmt.setInt(1,(int)Math.random()+1);
            stmt.setLong(1,dto.getPhoneNumber());
            stmt.setInt(2,dto.getAge());
            stmt.setString(3,dto.getPassword());
            stmt.setString(4,dto.getUniqueName());
            int noOfRowsAffected= stmt.executeUpdate();
            System.out.println(noOfRowsAffected);
            return true;
        }
        catch (SQLException e){
            e.printStackTrace();

        } finally {
            try{
                if(stmt!=null){
                    stmt.close();
                }

            }catch(SQLException e){
                e.printStackTrace();
            }

            try{
                if(con !=null){
                    con.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        return true;
    }

    @Override
    public List<ProfileDTO> getAllProfile() {
        //jdbc steps to get all profile from db table
        Connection con=null;
        PreparedStatement stmt= null;//purpose is to exectue query
        ResultSet rs= null;
        List<ProfileDTO> profileDTOS = new ArrayList<>();
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram","root","Xworkzodc@123");
            stmt= con.prepareStatement("select * from profile_dto");
            rs= stmt.executeQuery();

            while(rs.next()){
                ProfileDTO profileDTO= new ProfileDTO();
                profileDTO.setProfileId(rs.getInt(1));
                profileDTO.setPhoneNumber(rs.getLong(2));
                profileDTO.setAge(rs.getInt(3));
                profileDTO.setPassword(rs.getString(4));
                profileDTO.setUniqueName(rs.getString(5));
                profileDTOS.add(profileDTO);
            }

        }
        catch (SQLException e){
            e.printStackTrace();

        }finally {
            try{
                if(stmt!=null){
                    stmt.close();
                }

            }catch(SQLException e){
                e.printStackTrace();
            }

            try{
                if(con !=null){
                    con.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
       return profileDTOS;
        }

    @Override
    public ProfileDTO getProfileByPhoneNumber(long phoneNumber) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet res = null;

        ProfileDTO dto1 = new ProfileDTO();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkzodc@123");
            stmt = con.prepareStatement("SELECT * FROM profile_dto WHERE profilephoneNumber = ?");
           stmt.setLong(1,phoneNumber);
            res = stmt.executeQuery();
            while (res.next()) {
                dto1.setProfileId(res.getInt(1));
                dto1.setPhoneNumber(res.getLong(2));
                dto1.setAge(res.getInt(3));
                dto1.setPassword(res.getString(4));
                dto1.setUniqueName(res.getString(5));
            }
            }
            catch(SQLException e){
                e.printStackTrace();

            }finally{
                try {
                    if (stmt != null) {
                        stmt.close();
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }

                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return dto1;

        }



    @Override
    public List getProfilePhoneNumberAndAgeByName(String name) {
        List list= new ArrayList();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        ProfileDTO dtoo = new ProfileDTO();
       try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkzodc@123");
           stmt = con.prepareStatement("SELECT * FROM profile_dto WHERE uniqueProfileName = ?");
           stmt.setString(1,name);
           res = stmt.executeQuery();
           while (res.next()) {
               dtoo.setPhoneNumber(res.getLong("profilephoneNumber"));
               dtoo.setAge(res.getInt("age"));
               boolean isAdded=list.add(dtoo.getPhoneNumber() +"  "+ dtoo.getAge());
               System.out.println(isAdded);
       }
       }
       catch(SQLException e){
           e.printStackTrace();

       }finally{
           try {
               if (stmt != null) {
                   stmt.close();
               }

           } catch (SQLException e) {
               e.printStackTrace();
           }

           try {
               if (con != null) {
                   con.close();
               }
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
        return list;
    }

    @Override
    public ProfileDTO getUniqueProfileById(int id) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        ProfileDTO dto3 = new ProfileDTO();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkzodc@123");
            stmt = con.prepareStatement("SELECT * FROM profile_dto WHERE profile_id = ?");
            stmt.setInt(1, id);
            res = stmt.executeQuery();
            while (res.next()) {
                dto3.setProfileId(res.getInt(1));
                dto3.setPhoneNumber(res.getLong(2));
                dto3.setAge(res.getInt(3));
                dto3.setPassword(res.getString(4));
                dto3.setUniqueName(res.getString(5));
            }
        }
            catch(SQLException e){
                e.printStackTrace();

            }finally{
                try {
                    if (stmt != null) {
                        stmt.close();
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }

                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        return dto3;
    }

    @Override
    public boolean updateAgeById(int age, int id) {
        boolean isAgeUpdated=false;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        ProfileDTO dto4 = new ProfileDTO();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkzodc@123");
            stmt = con.prepareStatement("update profile_dto set age=? where profile_id=?");
            stmt.setInt(1, age);
            stmt.setInt(2, id);
            int isRowAffected= stmt.executeUpdate();
            if(isRowAffected >=1){
                isAgeUpdated=true;
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return true;

    }

    @Override
    public ProfileDTO getIdByName(String name) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        ProfileDTO dtoo1 = new ProfileDTO();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkzodc@123");
            stmt = con.prepareStatement("SELECT * FROM profile_dto WHERE uniqueProfileName = ?");
            stmt.setString(1,name);
            res = stmt.executeQuery();
            while (res.next()) {
                dtoo1.setProfileId(res.getInt(1));
//                dtoo1.setPhoneNumber(res.getLong(2));
//                dtoo1.setAge(res.getInt(3));
//                dtoo1.setPassword(res.getString(4));
//                dtoo1.setUniqueName(res.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return dtoo1;
    }



    @Override
    public boolean deleteProfileById(int id) {
        boolean isProfileDeleted = false;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        ProfileDTO dto5 = new ProfileDTO();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkzodc@123");
           con.setAutoCommit(false);
            stmt = con.prepareStatement("delete from profile_dto where profile_id=?");
            stmt.setInt(1, id);
            int isRowAffected = stmt.executeUpdate();
            con.commit();
            if (isRowAffected >= 1) {
                isProfileDeleted = true;

            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                con.rollback();//unsuccessfull transaction
                if (stmt != null) {
                    stmt.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

}


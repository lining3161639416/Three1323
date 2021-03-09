package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Spring1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=true", "root", "123456ln");
            String sql="select * from user";
            PreparedStatement ps = com.prepareStatement(sql);
            ResultSet res = ps.executeQuery();
            while (res.next()){
                String s = res.getString(3);
                System.out.println(s);
            }
            res.close();
            ps.close();
            com.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

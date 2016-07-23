package com.codathon.t9.Dao;

import com.codathon.t9.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ankit on 23/7/16.
 */
public class DictioneryDao {
    private static DictioneryDao dictioneryDao=new DictioneryDao();
    private DictioneryDao getInstance(){
        return dictioneryDao;
    }

    List<String> getStringsForNum(int num){
        List<String> strings=new ArrayList<String>();
        StringBuilder query=new StringBuilder();
        query.append("select string_sequence from dictionary where num_sequence=")
                .append(num);
        try (Connection connection = ConnectionUtil.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs=statement.executeQuery(query.toString())
        ){

            while (rs.next()){
                String strSequence=rs.getString("string_sequence");
                strings.add(strSequence);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return strings;
    }
}

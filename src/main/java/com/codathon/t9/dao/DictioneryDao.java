package com.codathon.t9.dao;

import com.codathon.t9.Constants;
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
    public static DictioneryDao getInstance(){
        return dictioneryDao;
    }

    public int getNoOfZerosToAppend(int num,String strSequence){
        List<String> strings=new ArrayList<String>();
        StringBuilder query=new StringBuilder();
        query.append("select string_sequence from dictionary where num_sequence=")
                .append(num).append(" order by id limit ").append(Constants.WORDS_LIMIT);
        int countOfZeros=0;
        try (Connection connection = ConnectionUtil.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs=statement.executeQuery(query.toString())
        ){

            while (rs.next() && !strSequence.equals(rs.getString("string_sequence"))){

                countOfZeros++;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return countOfZeros;
    }
}

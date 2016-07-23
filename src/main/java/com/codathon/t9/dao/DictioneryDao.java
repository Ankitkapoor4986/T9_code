package com.codathon.t9.dao;

import com.codathon.t9.Constants;
import com.codathon.t9.model.Dictionery;
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

    public void appendZerosToDictioneryPhoneStr(Dictionery dictionery){

        StringBuilder query=new StringBuilder();
        query.append("select string_sequence from dictionary where num_sequence=")
                .append(dictionery.getPhoneKey()).append(" order by string_sequence limit ").append(Constants.WORDS_LIMIT);
        StringBuilder countOfZeros=new StringBuilder("");
        try (Connection connection = ConnectionUtil.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs=statement.executeQuery(query.toString())
        ){

            while (rs.next() && !dictionery.getStringSequence().equals(rs.getString("string_sequence"))){

                countOfZeros.append("0");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        dictionery.setPhoneKey(dictionery.getPhoneKey().concat(countOfZeros.toString()));
    }
}

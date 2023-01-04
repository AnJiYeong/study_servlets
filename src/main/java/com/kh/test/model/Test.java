package com.kh.test.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.ellie.study_servlets.dao.Commons;

public class Test {
    public ArrayList<HashMap> selectList() throws SQLException{
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        String query = "SELECT * FROM TEST ";
        ResultSet resultSet = statement.executeQuery(query);
        ArrayList<HashMap> test_list = new ArrayList<HashMap>();
        while(resultSet.next()){
            HashMap<String, Object> test = new HashMap<String, Object>();
            test.put("SEQ", resultSet.getInt("SEQ"));
            test.put("WRITER", resultSet.getString("WRITER"));
            test.put("TITLE ", resultSet.getString("TITLE"));
            test.put("CONTENT ", resultSet.getString("CONTENT"));
            test.put("REGDATE", resultSet.getDate("REGDATE"));
            
            test_list.add(test);
        }    

        return test_list;
    }
    
}

package com.example.azurewebservicetest.repositories;


import com.example.azurewebservicetest.models.Hey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HeyRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Hey> getAllHeys() {
        String sql = "select * from Hey";
        RowMapper rowMapper = new BeanPropertyRowMapper(Hey.class);
        return jdbcTemplate.query(sql, rowMapper);
    }


    public void createHey(String hey) {
        String sql = "insert into Hey(Hey) values(?)";
        jdbcTemplate.update(sql, hey);
    }
}

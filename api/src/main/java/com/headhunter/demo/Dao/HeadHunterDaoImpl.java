package com.headhunter.demo.Dao;

import com.google.gson.Gson;
import com.headhunter.demo.bean.HeadHunter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

@Repository(value = "headHunterDao")
public class HeadHunterDaoImpl implements HeadHunterDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    Gson gson;
    @Override
    public List<HeadHunter> listAll() {
        System.out.println("inside query");
        String query = "SELECT * FROM headhunter";
        List<HeadHunter> headHunterList = new LinkedList<>();

        jdbcTemplate.query(query, new ResultSetExtractor<List<HeadHunter>>() {
            public List<HeadHunter> extractData(ResultSet rs) throws SQLException {
                while (rs.next()) {
                    HeadHunter headHunter = new HeadHunter();
                    headHunter.setId(rs.getLong("id"));
                    headHunter.setName(rs.getString("name"));
                    headHunter.setDescription(rs.getString("description"));
                    headHunterList.add(headHunter);
                }

                return headHunterList;
            }
        });
        System.out.println("headhunter list");
        return headHunterList;
    }
}

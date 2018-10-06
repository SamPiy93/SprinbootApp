package com.headhunter.demo.Dao;

import com.headhunter.demo.bean.HeadHunter;

import java.util.List;

public interface BaseDao {
    /**
     * List all records
     *
     * @return list of records
     */
    public List<HeadHunter> listAll();
}

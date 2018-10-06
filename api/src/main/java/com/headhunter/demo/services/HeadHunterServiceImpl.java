package com.headhunter.demo.services;

import com.headhunter.demo.Dao.HeadHunterDao;
import com.headhunter.demo.Dao.HeadHunterDaoImpl;
import com.headhunter.demo.bean.HeadHunter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class HeadHunterServiceImpl implements HeadHunterService {

    @Autowired
    private HeadHunterDao headHunterDao;

    @Override
    public List<HeadHunter> headHuntersList() {
        System.out.println("inside service");
        return this.headHunterDao.listAll();
    }
}

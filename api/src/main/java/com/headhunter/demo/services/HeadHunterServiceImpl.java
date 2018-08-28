package com.headhunter.demo.services;

import com.headhunter.demo.Repositories.HeadHunterRepository;
import com.headhunter.demo.bean.HeadHunter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadHunterServiceImpl implements HeadHunterService {
    @Autowired
    private HeadHunterRepository headHunterRepository;

    @Override
    public List<HeadHunter> headHuntersList() {
        List<HeadHunter> headHunterList = (List<HeadHunter>) this.headHunterRepository.findAll();
        return headHunterList;
    }
}

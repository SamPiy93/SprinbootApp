package com.headhunter.demo.Repositories;

import com.headhunter.demo.bean.HeadHunter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadHunterRepository extends CrudRepository<HeadHunter, Long> {
}

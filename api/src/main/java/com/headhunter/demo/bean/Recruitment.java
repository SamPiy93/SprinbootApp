package com.headhunter.demo.bean;

import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.util.Date;

public class Recruitment {
    private long id;
    private HeadHunter headhunter;
    private Date date;
    private int masonCount;
    private int carpenterCount;

    public Recruitment() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public HeadHunter getHeadhunter() {
        return headhunter;
    }

    public void setHeadhunter(HeadHunter headhunter) {
        this.headhunter = headhunter;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMasonCount() {
        return masonCount;
    }

    public void setMasonCount(int masonCount) {
        this.masonCount = masonCount;
    }

    public int getCarpenterCount() {
        return carpenterCount;
    }

    public void setCarpenterCount(int carpenterCount) {
        this.carpenterCount = carpenterCount;
    }
}

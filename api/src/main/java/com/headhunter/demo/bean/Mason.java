package com.headhunter.demo.bean;

import javax.persistence.*;
public class Mason {
    private long id;
    private String name;
    private int skilllevel;

    public Mason() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkilllevel() {
        return skilllevel;
    }

    public void setSkilllevel(int skilllevel) {
        this.skilllevel = skilllevel;
    }
}

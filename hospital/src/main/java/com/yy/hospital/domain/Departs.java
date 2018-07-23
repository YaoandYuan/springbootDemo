package com.yy.hospital.domain;

import java.io.Serializable;

public class Departs implements Serializable {

    private Integer deid;
    private  String dename;
    private String intro;
    private Integer dexist;

    public Integer getDeid() {
        return deid;
    }

    public void setDeid(Integer deid) {
        this.deid = deid;
    }

    public String getDename() {
        return dename;
    }

    public void setDename(String dename) {
        this.dename = dename;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getDexist() {
        return dexist;
    }

    public void setDexist(Integer dexist) {
        this.dexist = dexist;
    }
}

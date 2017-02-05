package com.test.core.spring.inheritance.beans;

/**
 *
 */
public class Adult extends Person {
    private String paspSer;
    private String paspNum;
    private String snils;

    public String getPaspSer() {
        return paspSer;
    }

    public void setPaspSer(String paspSer) {
        this.paspSer = paspSer;
    }

    public String getPaspNum() {
        return paspNum;
    }

    public void setPaspNum(String paspNum) {
        this.paspNum = paspNum;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }
}
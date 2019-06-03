package com.frank.design.prototype.example;

/**
 * @AUTHOR:Frank
 * @DATE:08/17/2018
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;


    public Resume(String name) {
        this.name = name;
    }

    //personal Info
    public void setPersonalInfo(String sex,String age){
        this.sex=sex;
        this.age=age;
    }

    // personal work experience
    public void setWorkExperience(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display(){
        System.out.print("Name :" + this.name+"  gender:"+sex+" age:"+age);
        System.out.println("    timeArea :" + this.timeArea+"  company:"+company);
    }

    public Resume clone(){
        Resume re = null;
        try {
            re = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return re;
    }
}

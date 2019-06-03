package com.frank.design.prototype.example;

import java.io.*;

/**
 * @AUTHOR:Frank
 * @DATE:08/17/2018
 */
public class ResumeDeepCopy implements Serializable{

    private static final long serialVersionUID = 1267293988171991494L;

    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience ;


    public ResumeDeepCopy(String name) {
        this.name = name;
    }

    //personal Info
    public void setPersonalInfo(String sex,String age){
        this.sex=sex;
        this.age=age;
    }

    // personal work experience
    public void setWorkExperience(String timeArea,String company){
        workExperience= new WorkExperience();
        this.workExperience.setCompany(company);
        this.workExperience.setTimeArea(timeArea);
    }

    public void display(){
        System.out.print("Name :" + this.name+"  gender:"+sex+" age:"+age);
        System.out.println("    timeArea :" + workExperience.getTimeArea()+"  company:"+workExperience.getCompany());
    }

    public ResumeDeepCopy clone(){
        ResumeDeepCopy re = null;
        try {
            // 写入当前对象的二进制流
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // 读出二进制流产生的新对象
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            re = (ResumeDeepCopy) ois.readObject();
        }catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return re;
    }
}

package com.frank.design.prototype.example;

/**
 * @AUTHOR:Frank
 * @DATE:08/17/2018
 */
public class ExampleMail {
    public static void main(String[] args){
        ResumeDeepCopy frank = new ResumeDeepCopy("Frank");
        frank.setPersonalInfo("femal","28");
        frank.setWorkExperience("20**-20**","xxxcom");
        ResumeDeepCopy clone1 = frank.clone();
        clone1.setWorkExperience("20**-20**","xxxcom2");
        ResumeDeepCopy clone2 = frank.clone();
        clone2.setWorkExperience("20**-20**","xxxcom2");
        frank.display();
        clone1.display();
        clone2.display();
    }
}

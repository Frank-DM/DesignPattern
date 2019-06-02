package com.frank.design.observermode.demo;

/**
 *  通知者实现类
 * @AUTHOR:Frank
 * @DATE:08/24/2018
 */
public class ConcrectSubject extends  Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}

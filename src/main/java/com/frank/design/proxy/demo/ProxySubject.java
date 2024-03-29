package com.frank.design.proxy.demo;

/**
 * Proxy to Request
 *
 * @AUTHOR:Frank
 * @DATE:08/03/2018
 */
public class ProxySubject implements Subject {

    private Subject subject;

    @Override
    public void request() {
        if (subject == null) {
            subject = new RealSubject();
        }
        subject.request();
    }
}

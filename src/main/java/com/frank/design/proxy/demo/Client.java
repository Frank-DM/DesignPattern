package com.frank.design.proxy.demo;

/**
 * @AUTHOR:Frank
 * @DATE:08/03/2018
 */
public class Client {
    public static void main(String[] args){
        ProxySubject proxySubject = new ProxySubject();
        proxySubject.request();
    }
}

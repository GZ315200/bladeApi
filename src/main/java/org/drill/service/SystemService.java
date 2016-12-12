package org.drill.service;


import org.drill.utils.MD5;

import java.security.NoSuchAlgorithmException;

/**
 * Created by gygesM on 2016/11/28.
 */
public class SystemService {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(MD5.MD5("123456","224188"));
    }
}

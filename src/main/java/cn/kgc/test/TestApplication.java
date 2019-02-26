package cn.kgc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ZHSTYLE on 2019/2/26 0026.
 */
public class TestApplication {

    public static void main(String[] args) {
        ApplicationContext ct= new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ct.toString());
    }
}

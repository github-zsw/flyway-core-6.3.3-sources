package org.flywaydb.core;

public class MainTest {


    /**
     * @Author: shiwangZhou
     * @Description:
     * @Date: 2020-04-19
     * @parm: * @param args
     */
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure().dataSource("jdbc:mysql://localhost:3306/springclouddemo?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai",
                "root", "123456").load();
        flyway.migrate();
        System.out.println("执行完了");

    }
}

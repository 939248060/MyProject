package com.yumgame.shirotest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.SimpleAccount;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;

public class AuthemcationTest {

    SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();
    @Before
    public void addAccount(){
        simpleAccountRealm.addAccount("admin","123","admin","user");
    }
    @Test
    public void testCode(){
        //1.构建一个SecurityManager
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(simpleAccountRealm);
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        //2.定义一个提交主体
        UsernamePasswordToken token = new UsernamePasswordToken("admin","123");
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        subject.checkRoles("admin");
        System.out.println(subject.isAuthenticated());
    }
}

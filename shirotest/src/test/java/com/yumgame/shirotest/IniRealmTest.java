package com.yumgame.shirotest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;


public class IniRealmTest {
    @Test
    public void testCode(){
        IniRealm iniRealm = new IniRealm("classpath:user.ini");
        //1.构建一个SecurityManager
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(iniRealm);
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        //2.定义一个提交主体
        UsernamePasswordToken token = new UsernamePasswordToken("admin","123");
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        System.out.println(subject.isAuthenticated());
    }
}

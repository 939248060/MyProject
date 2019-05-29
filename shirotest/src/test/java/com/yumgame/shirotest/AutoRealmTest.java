package com.yumgame.shirotest;

import com.yungame.AutoRealm.AutoRealm;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class AutoRealmTest {
    @Test
    public void testCode(){
        AutoRealm autoRealm = new AutoRealm();

        //1.构建一个SecurityManager
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();

        //shiro加密
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("md5");
        hashedCredentialsMatcher.setHashIterations(1);
        autoRealm.setCredentialsMatcher(hashedCredentialsMatcher);

        defaultSecurityManager.setRealm(autoRealm);
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        //2.定义一个提交主体
        UsernamePasswordToken token = new UsernamePasswordToken("admin","123d");
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        //subject.checkRoles("admin");
        //subject.checkPermissions("select","update");
        System.out.println(subject.isAuthenticated());
    }
}

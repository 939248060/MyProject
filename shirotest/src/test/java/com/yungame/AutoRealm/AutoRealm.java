package com.yungame.AutoRealm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AutoRealm extends AuthorizingRealm {
    Map<String,String> userMap = new HashMap<String, String>();
    {
        userMap.put("admin","cc03e747a6afbbcbf8be7668acfebee5");
        super.setName("admin");
    }
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String) principalCollection.getPrimaryPrincipal();
        Set<String> roles = getRoleByUsername(username);
        Set<String> permisstion = getPerMissionByUsername(username);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addRoles(roles);
        simpleAuthorizationInfo.addStringPermissions(permisstion);
        return simpleAuthorizationInfo;
    }

    private Set<String> getPerMissionByUsername(String username) {
        Set<String> sets = new HashSet<String>();
        sets.add("select");
        sets.add("update");
        return sets;
    }

    private Set<String> getRoleByUsername(String username) {
        Set<String> sets = new HashSet<String>();
        sets.add("admin");
        sets.add("user");
        return sets;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        String password = getPasswordByUsername(username);
        if(password == null) return null;
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(username,password,"admin");
        simpleAuthenticationInfo.setCredentialsSalt(ByteSource.Util.bytes("test"));
        return simpleAuthenticationInfo;
    }
    public String getPasswordByUsername(String username){
            return userMap.get(username);
    }

    public static void main(String[] args) {
        Md5Hash md5Hash = new Md5Hash("123","test");
        System.out.printf(md5Hash.toString());
    }
}

package com.ljf.mybaits.relation.annotation.domain;

/**
 * @ClassName: Role
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/18 14:42:38 
 * @Version: V1.0
 **/
public class Role {
    private int id;
    private String roleName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}

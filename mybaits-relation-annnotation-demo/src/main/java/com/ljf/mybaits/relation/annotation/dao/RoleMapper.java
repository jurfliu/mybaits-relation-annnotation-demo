package com.ljf.mybaits.relation.annotation.dao;

import com.ljf.mybaits.relation.annotation.domain.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper {
    @Select("SELECT a.uid,a.rid,b.id,b.role_name roleName FROM tb_user_role a,tb_role b WHERE a.rid=b.id AND a.uid=#{uid}")
    public List<Role> findByUid(int uid);
}

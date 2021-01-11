package com.yangya.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yangya.model.UmsAdminRoleRelation;
import com.yangya.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsAdminRoleRelationMapper extends BaseMapper<UmsAdminRoleRelation> {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}

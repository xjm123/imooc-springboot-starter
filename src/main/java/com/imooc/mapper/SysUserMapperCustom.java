package com.imooc.mapper;

import java.util.List;

import com.imooc.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapperCustom {
	
	List<SysUser> queryUserSimplyInfoById(String id);
}
package com.example.mybatis.dao;

import com.example.mybatis.entity.emp;
import com.example.mybatis.entity.empExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface empMapper {
    long countByExample(empExample example);

    int deleteByExample(empExample example);

    int deleteByPrimaryKey(Short empno);

    int insert(emp record);

    int insertSelective(emp record);

    List<emp> selectByExample(empExample example);

    emp selectByPrimaryKey(Short empno);

    int updateByExampleSelective(@Param("record") emp record, @Param("example") empExample example);

    int updateByExample(@Param("record") emp record, @Param("example") empExample example);

    int updateByPrimaryKeySelective(emp record);

    int updateByPrimaryKey(emp record);
}
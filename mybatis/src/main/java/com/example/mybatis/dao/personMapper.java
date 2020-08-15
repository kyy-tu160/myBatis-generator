package com.example.mybatis.dao;

import com.example.mybatis.entity.person;
import com.example.mybatis.entity.personExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface personMapper {
    long countByExample(personExample example);

    int deleteByExample(personExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(person record);

    int insertSelective(person record);

    List<person> selectByExample(personExample example);

    person selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") person record, @Param("example") personExample example);

    int updateByExample(@Param("record") person record, @Param("example") personExample example);

    int updateByPrimaryKeySelective(person record);

    int updateByPrimaryKey(person record);
}
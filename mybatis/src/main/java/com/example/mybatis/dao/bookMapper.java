package com.example.mybatis.dao;

import com.example.mybatis.entity.book;
import com.example.mybatis.entity.bookExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface bookMapper {
    long countByExample(bookExample example);

    int deleteByExample(bookExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(book record);

    int insertSelective(book record);

    List<book> selectByExample(bookExample example);

    book selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") book record, @Param("example") bookExample example);

    int updateByExample(@Param("record") book record, @Param("example") bookExample example);

    int updateByPrimaryKeySelective(book record);

    int updateByPrimaryKey(book record);
}
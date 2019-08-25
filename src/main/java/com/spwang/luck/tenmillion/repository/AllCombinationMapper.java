package com.spwang.luck.tenmillion.repository;

import com.spwang.luck.tenmillion.repository.entity.Combination;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author spwang 2019/7/20 1:16 PM
 * @version 0.0.1
 * @since 0.0.1
 */
@Mapper
public interface AllCombinationMapper {
    Long count();

    int deleteByPrimaryKey(Long id);

    int insert(Combination record);

    int insertSelective(Combination record);

    int insertList(@Param("list")List<Combination> list);

    Combination selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Combination record);

    int updateByPrimaryKey(Combination record);
}

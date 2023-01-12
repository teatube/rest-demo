package com.example.restdemo.models.dao;

import com.example.restdemo.models.entity.Singleplayergame;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * (Singleplayergame)表数据库访问层
 *
 * @author szl
 * @since 2023-01-11 17:16:04
 */
@Mapper
@Component
public interface SingleplayergameDao {

    /**
     * 通过ID查询单条数据
     *
     * @param idsingleplayergame 主键
     * @return 实例对象
     */
    Singleplayergame queryById(Long idsingleplayergame);

    /**
     * 查询指定行数据
     *
     * @param singleplayergame 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Singleplayergame> queryAllByLimit(Singleplayergame singleplayergame, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param singleplayergame 查询条件
     * @return 总行数
     */
    long count(Singleplayergame singleplayergame);

    /**
     * 新增数据
     *
     * @param singleplayergame 实例对象
     * @return 影响行数
     */
    int insert(Singleplayergame singleplayergame);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Singleplayergame> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Singleplayergame> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Singleplayergame> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Singleplayergame> entities);

    /**
     * 修改数据
     *
     * @param singleplayergame 实例对象
     * @return 影响行数
     */
    int update(Singleplayergame singleplayergame);

    /**
     * 通过主键删除数据
     *
     * @param idsingleplayergame 主键
     * @return 影响行数
     */
    int deleteById(Long idsingleplayergame);

}


package com.example.restdemo.models.dao;

import com.example.restdemo.models.entity.Multiplayergame;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * (Multiplayergame)表数据库访问层
 *
 * @author szl
 * @since 2023-01-12 14:26:11
 */
@Mapper
public interface MultiplayergameMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param idmultiplayergame 主键
     * @return 实例对象
     */
    Multiplayergame queryById(@Param(value = "idmultiplayergame") Long idmultiplayergame);

    /**
     * 查询指定行数据
     *
     * @param multiplayergame 查询条件
     * @param pageable        分页对象
     * @return 对象列表
     */
    List<Multiplayergame> queryAllByLimit(Multiplayergame multiplayergame, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param multiplayergame 查询条件
     * @return 总行数
     */
    long count(Multiplayergame multiplayergame);

    /**
     * 新增数据
     *
     * @param multiplayergame 实例对象
     * @return 影响行数
     */
    int insert(Multiplayergame multiplayergame);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Multiplayergame> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Multiplayergame> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Multiplayergame> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Multiplayergame> entities);

    /**
     * 修改数据
     *
     * @param multiplayergame 实例对象
     * @return 影响行数
     */
    int update(Multiplayergame multiplayergame);

    /**
     * 通过主键删除数据
     *
     * @param idmultiplayergame 主键
     * @return 影响行数
     */
    int deleteById(Long idmultiplayergame);

}


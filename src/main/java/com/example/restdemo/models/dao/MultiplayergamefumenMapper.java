package com.example.restdemo.models.dao;

import com.example.restdemo.models.entity.Multiplayergamefumen;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * (Multiplayergamefumen)表数据库访问层
 *
 * @author szl
 * @since 2023-01-12 14:26:11
 */
@Mapper
public interface MultiplayergamefumenMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param idmultiplayergameresult 主键
     * @return 实例对象
     */
    Multiplayergamefumen queryById(@Param(value = "idmultiplayergameresult") Long idmultiplayergameresult);

    /**
     * 查询指定行数据
     *
     * @param multiplayergamefumen 查询条件
     * @param pageable             分页对象
     * @return 对象列表
     */
    List<Multiplayergamefumen> queryAllByLimit(Multiplayergamefumen multiplayergamefumen, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param multiplayergamefumen 查询条件
     * @return 总行数
     */
    long count(Multiplayergamefumen multiplayergamefumen);

    /**
     * 新增数据
     *
     * @param multiplayergamefumen 实例对象
     * @return 影响行数
     */
    int insert(Multiplayergamefumen multiplayergamefumen);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Multiplayergamefumen> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Multiplayergamefumen> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Multiplayergamefumen> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Multiplayergamefumen> entities);

    /**
     * 修改数据
     *
     * @param multiplayergamefumen 实例对象
     * @return 影响行数
     */
    int update(Multiplayergamefumen multiplayergamefumen);

    /**
     * 通过主键删除数据
     *
     * @param idmultiplayergameresult 主键
     * @return 影响行数
     */
    int deleteById(Long idmultiplayergameresult);

}


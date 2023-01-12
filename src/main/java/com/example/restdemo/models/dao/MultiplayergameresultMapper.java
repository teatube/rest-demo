package com.example.restdemo.models.dao;

import com.example.restdemo.models.entity.Multiplayergameresult;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * (Multiplayergameresult)表数据库访问层
 *
 * @author szl
 * @since 2023-01-12 14:26:12
 */
@Mapper
public interface MultiplayergameresultMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param idmultiplayergameresult 主键
     * @return 实例对象
     */
    Multiplayergameresult queryById(@Param(value = "idmultiplayergameresult") Long idmultiplayergameresult);

    /**
     * 查询指定行数据
     *
     * @param multiplayergameresult 查询条件
     * @param pageable              分页对象
     * @return 对象列表
     */
    List<Multiplayergameresult> queryAllByLimit(Multiplayergameresult multiplayergameresult, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param multiplayergameresult 查询条件
     * @return 总行数
     */
    long count(Multiplayergameresult multiplayergameresult);

    /**
     * 新增数据
     *
     * @param multiplayergameresult 实例对象
     * @return 影响行数
     */
    int insert(Multiplayergameresult multiplayergameresult);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Multiplayergameresult> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Multiplayergameresult> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Multiplayergameresult> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Multiplayergameresult> entities);

    /**
     * 修改数据
     *
     * @param multiplayergameresult 实例对象
     * @return 影响行数
     */
    int update(Multiplayergameresult multiplayergameresult);

    /**
     * 通过主键删除数据
     *
     * @param idmultiplayergameresult 主键
     * @return 影响行数
     */
    int deleteById(Long idmultiplayergameresult);

}


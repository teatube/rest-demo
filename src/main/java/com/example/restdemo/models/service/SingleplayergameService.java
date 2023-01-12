package com.example.restdemo.models.service;

import com.example.restdemo.models.entity.Singleplayergame;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Singleplayergame)表服务接口
 *
 * @author szl
 * @since 2023-01-11 17:16:05
 */
public interface SingleplayergameService {

    /**
     * 通过ID查询单条数据
     *
     * @param idsingleplayergame 主键
     * @return 实例对象
     */
    Singleplayergame queryById(Long idsingleplayergame);

    /**
     * 分页查询
     *
     * @param singleplayergame 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Singleplayergame> queryByPage(Singleplayergame singleplayergame, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param singleplayergame 实例对象
     * @return 实例对象
     */
    Singleplayergame insert(Singleplayergame singleplayergame);

    /**
     * 修改数据
     *
     * @param singleplayergame 实例对象
     * @return 实例对象
     */
    Singleplayergame update(Singleplayergame singleplayergame);

    /**
     * 通过主键删除数据
     *
     * @param idsingleplayergame 主键
     * @return 是否成功
     */
    boolean deleteById(Long idsingleplayergame);

}

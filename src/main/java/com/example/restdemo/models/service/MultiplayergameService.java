package com.example.restdemo.models.service;

import com.example.restdemo.models.entity.Multiplayergame;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Multiplayergame)表服务接口
 *
 * @author szl
 * @since 2023-01-11 17:16:03
 */
public interface MultiplayergameService {

    /**
     * 通过ID查询单条数据
     *
     * @param idmultiplayergame 主键
     * @return 实例对象
     */
    Multiplayergame queryById(Long idmultiplayergame);

    /**
     * 分页查询
     *
     * @param multiplayergame 筛选条件
     * @param pageRequest     分页对象
     * @return 查询结果
     */
    Page<Multiplayergame> queryByPage(Multiplayergame multiplayergame, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param multiplayergame 实例对象
     * @return 实例对象
     */
    Multiplayergame insert(Multiplayergame multiplayergame);

    /**
     * 修改数据
     *
     * @param multiplayergame 实例对象
     * @return 实例对象
     */
    Multiplayergame update(Multiplayergame multiplayergame);

    /**
     * 通过主键删除数据
     *
     * @param idmultiplayergame 主键
     * @return 是否成功
     */
    boolean deleteById(Long idmultiplayergame);

}

package com.example.restdemo.models.service;

import com.example.restdemo.models.entity.Singleplayergamefumen;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Singleplayergamefumen)表服务接口
 *
 * @author szl
 * @since 2023-01-12 14:26:13
 */
public interface SingleplayergamefumenService {

    /**
     * 通过ID查询单条数据
     *
     * @param idsingleplayergame 主键
     * @return 实例对象
     */
    Singleplayergamefumen queryById(Long idsingleplayergame);

    /**
     * 分页查询
     *
     * @param singleplayergamefumen 筛选条件
     * @param pageRequest           分页对象
     * @return 查询结果
     */
    Page<Singleplayergamefumen> queryByPage(Singleplayergamefumen singleplayergamefumen, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param singleplayergamefumen 实例对象
     * @return 实例对象
     */
    Singleplayergamefumen insert(Singleplayergamefumen singleplayergamefumen);

    /**
     * 修改数据
     *
     * @param singleplayergamefumen 实例对象
     * @return 实例对象
     */
    Singleplayergamefumen update(Singleplayergamefumen singleplayergamefumen);

    /**
     * 通过主键删除数据
     *
     * @param idsingleplayergame 主键
     * @return 是否成功
     */
    boolean deleteById(Long idsingleplayergame);

}

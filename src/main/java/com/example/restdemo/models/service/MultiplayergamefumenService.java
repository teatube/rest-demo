package com.example.restdemo.models.service;

import com.example.restdemo.models.entity.Multiplayergamefumen;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Multiplayergamefumen)表服务接口
 *
 * @author szl
 * @since 2023-01-12 14:26:11
 */
public interface MultiplayergamefumenService {

    /**
     * 通过ID查询单条数据
     *
     * @param idmultiplayergameresult 主键
     * @return 实例对象
     */
    Multiplayergamefumen queryById(Long idmultiplayergameresult);

    /**
     * 分页查询
     *
     * @param multiplayergamefumen 筛选条件
     * @param pageRequest          分页对象
     * @return 查询结果
     */
    Page<Multiplayergamefumen> queryByPage(Multiplayergamefumen multiplayergamefumen, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param multiplayergamefumen 实例对象
     * @return 实例对象
     */
    Multiplayergamefumen insert(Multiplayergamefumen multiplayergamefumen);

    /**
     * 修改数据
     *
     * @param multiplayergamefumen 实例对象
     * @return 实例对象
     */
    Multiplayergamefumen update(Multiplayergamefumen multiplayergamefumen);

    /**
     * 通过主键删除数据
     *
     * @param idmultiplayergameresult 主键
     * @return 是否成功
     */
    boolean deleteById(Long idmultiplayergameresult);

}

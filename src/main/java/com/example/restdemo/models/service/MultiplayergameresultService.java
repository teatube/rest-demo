package com.example.restdemo.models.service;

import com.example.restdemo.models.entity.Multiplayergameresult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Multiplayergameresult)表服务接口
 *
 * @author szl
 * @since 2023-01-11 17:16:04
 */
public interface MultiplayergameresultService {

    /**
     * 通过ID查询单条数据
     *
     * @param idmultiplayergameresult 主键
     * @return 实例对象
     */
    Multiplayergameresult queryById(Long idmultiplayergameresult);

    /**
     * 分页查询
     *
     * @param multiplayergameresult 筛选条件
     * @param pageRequest           分页对象
     * @return 查询结果
     */
    Page<Multiplayergameresult> queryByPage(Multiplayergameresult multiplayergameresult, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param multiplayergameresult 实例对象
     * @return 实例对象
     */
    Multiplayergameresult insert(Multiplayergameresult multiplayergameresult);

    /**
     * 修改数据
     *
     * @param multiplayergameresult 实例对象
     * @return 实例对象
     */
    Multiplayergameresult update(Multiplayergameresult multiplayergameresult);

    /**
     * 通过主键删除数据
     *
     * @param idmultiplayergameresult 主键
     * @return 是否成功
     */
    boolean deleteById(Long idmultiplayergameresult);

}

package com.example.restdemo.models.service.impl;

import com.example.restdemo.models.entity.Multiplayergameresult;
import com.example.restdemo.models.dao.MultiplayergameresultDao;
import com.example.restdemo.models.service.MultiplayergameresultService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Multiplayergameresult)表服务实现类
 *
 * @author szl
 * @since 2023-01-11 17:16:04
 */
@Service("multiplayergameresultService")
public class MultiplayergameresultServiceImpl implements MultiplayergameresultService {
    @Resource
    private MultiplayergameresultDao multiplayergameresultDao;

    /**
     * 通过ID查询单条数据
     *
     * @param idmultiplayergameresult 主键
     * @return 实例对象
     */
    @Override
    public Multiplayergameresult queryById(Long idmultiplayergameresult) {
        return this.multiplayergameresultDao.queryById(idmultiplayergameresult);
    }

    /**
     * 分页查询
     *
     * @param multiplayergameresult 筛选条件
     * @param pageRequest           分页对象
     * @return 查询结果
     */
    @Override
    public Page<Multiplayergameresult> queryByPage(Multiplayergameresult multiplayergameresult, PageRequest pageRequest) {
        long total = this.multiplayergameresultDao.count(multiplayergameresult);
        return new PageImpl<>(this.multiplayergameresultDao.queryAllByLimit(multiplayergameresult, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param multiplayergameresult 实例对象
     * @return 实例对象
     */
    @Override
    public Multiplayergameresult insert(Multiplayergameresult multiplayergameresult) {
        this.multiplayergameresultDao.insert(multiplayergameresult);
        return multiplayergameresult;
    }

    /**
     * 修改数据
     *
     * @param multiplayergameresult 实例对象
     * @return 实例对象
     */
    @Override
    public Multiplayergameresult update(Multiplayergameresult multiplayergameresult) {
        this.multiplayergameresultDao.update(multiplayergameresult);
        return this.queryById(multiplayergameresult.getIdmultiplayergameresult());
    }

    /**
     * 通过主键删除数据
     *
     * @param idmultiplayergameresult 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long idmultiplayergameresult) {
        return this.multiplayergameresultDao.deleteById(idmultiplayergameresult) > 0;
    }
}

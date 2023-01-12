package com.example.restdemo.models.service.impl;

import com.example.restdemo.models.entity.Multiplayergamefumen;
import com.example.restdemo.models.dao.MultiplayergamefumenDao;
import com.example.restdemo.models.service.MultiplayergamefumenService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Multiplayergamefumen)表服务实现类
 *
 * @author szl
 * @since 2023-01-11 17:16:03
 */
@Service("multiplayergamefumenService")
public class MultiplayergamefumenServiceImpl implements MultiplayergamefumenService {
    @Resource
    private MultiplayergamefumenDao multiplayergamefumenDao;

    /**
     * 通过ID查询单条数据
     *
     * @param idmultiplayergameresult 主键
     * @return 实例对象
     */
    @Override
    public Multiplayergamefumen queryById(Long idmultiplayergameresult) {
        return this.multiplayergamefumenDao.queryById(idmultiplayergameresult);
    }

    /**
     * 分页查询
     *
     * @param multiplayergamefumen 筛选条件
     * @param pageRequest          分页对象
     * @return 查询结果
     */
    @Override
    public Page<Multiplayergamefumen> queryByPage(Multiplayergamefumen multiplayergamefumen, PageRequest pageRequest) {
        long total = this.multiplayergamefumenDao.count(multiplayergamefumen);
        return new PageImpl<>(this.multiplayergamefumenDao.queryAllByLimit(multiplayergamefumen, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param multiplayergamefumen 实例对象
     * @return 实例对象
     */
    @Override
    public Multiplayergamefumen insert(Multiplayergamefumen multiplayergamefumen) {
        this.multiplayergamefumenDao.insert(multiplayergamefumen);
        return multiplayergamefumen;
    }

    /**
     * 修改数据
     *
     * @param multiplayergamefumen 实例对象
     * @return 实例对象
     */
    @Override
    public Multiplayergamefumen update(Multiplayergamefumen multiplayergamefumen) {
        this.multiplayergamefumenDao.update(multiplayergamefumen);
        return this.queryById(multiplayergamefumen.getIdmultiplayergameresult());
    }

    /**
     * 通过主键删除数据
     *
     * @param idmultiplayergameresult 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long idmultiplayergameresult) {
        return this.multiplayergamefumenDao.deleteById(idmultiplayergameresult) > 0;
    }
}

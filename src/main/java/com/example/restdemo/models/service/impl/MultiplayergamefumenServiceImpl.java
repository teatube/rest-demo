package com.example.restdemo.models.service.impl;

import com.example.restdemo.models.entity.Multiplayergamefumen;
import com.example.restdemo.models.dao.MultiplayergamefumenMapper;
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
 * @since 2023-01-12 14:26:11
 */
@Service("multiplayergamefumenService")
public class MultiplayergamefumenServiceImpl implements MultiplayergamefumenService {
    @Resource
    private MultiplayergamefumenMapper multiplayergamefumenMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param idmultiplayergameresult 主键
     * @return 实例对象
     */
    @Override
    public Multiplayergamefumen queryById(Long idmultiplayergameresult) {
        return this.multiplayergamefumenMapper.queryById(idmultiplayergameresult);
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
        long total = this.multiplayergamefumenMapper.count(multiplayergamefumen);
        return new PageImpl<>(this.multiplayergamefumenMapper.queryAllByLimit(multiplayergamefumen, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param multiplayergamefumen 实例对象
     * @return 实例对象
     */
    @Override
    public Multiplayergamefumen insert(Multiplayergamefumen multiplayergamefumen) {
        this.multiplayergamefumenMapper.insert(multiplayergamefumen);
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
        this.multiplayergamefumenMapper.update(multiplayergamefumen);
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
        return this.multiplayergamefumenMapper.deleteById(idmultiplayergameresult) > 0;
    }
}

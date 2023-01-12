package com.example.restdemo.models.service.impl;

import com.example.restdemo.models.entity.Singleplayergamefumen;
import com.example.restdemo.models.dao.SingleplayergamefumenMapper;
import com.example.restdemo.models.service.SingleplayergamefumenService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Singleplayergamefumen)表服务实现类
 *
 * @author szl
 * @since 2023-01-12 14:26:13
 */
@Service("singleplayergamefumenService")
public class SingleplayergamefumenServiceImpl implements SingleplayergamefumenService {
    @Resource
    private SingleplayergamefumenMapper singleplayergamefumenMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param idsingleplayergame 主键
     * @return 实例对象
     */
    @Override
    public Singleplayergamefumen queryById(Long idsingleplayergame) {
        return this.singleplayergamefumenMapper.queryById(idsingleplayergame);
    }

    /**
     * 分页查询
     *
     * @param singleplayergamefumen 筛选条件
     * @param pageRequest           分页对象
     * @return 查询结果
     */
    @Override
    public Page<Singleplayergamefumen> queryByPage(Singleplayergamefumen singleplayergamefumen, PageRequest pageRequest) {
        long total = this.singleplayergamefumenMapper.count(singleplayergamefumen);
        return new PageImpl<>(this.singleplayergamefumenMapper.queryAllByLimit(singleplayergamefumen, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param singleplayergamefumen 实例对象
     * @return 实例对象
     */
    @Override
    public Singleplayergamefumen insert(Singleplayergamefumen singleplayergamefumen) {
        this.singleplayergamefumenMapper.insert(singleplayergamefumen);
        return singleplayergamefumen;
    }

    /**
     * 修改数据
     *
     * @param singleplayergamefumen 实例对象
     * @return 实例对象
     */
    @Override
    public Singleplayergamefumen update(Singleplayergamefumen singleplayergamefumen) {
        this.singleplayergamefumenMapper.update(singleplayergamefumen);
        return this.queryById(singleplayergamefumen.getIdsingleplayergame());
    }

    /**
     * 通过主键删除数据
     *
     * @param idsingleplayergame 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long idsingleplayergame) {
        return this.singleplayergamefumenMapper.deleteById(idsingleplayergame) > 0;
    }
}

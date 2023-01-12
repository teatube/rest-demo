package com.example.restdemo.models.service.impl;

import com.example.restdemo.models.entity.Singleplayergame;
import com.example.restdemo.models.dao.SingleplayergameDao;
import com.example.restdemo.models.service.SingleplayergameService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Singleplayergame)表服务实现类
 *
 * @author szl
 * @since 2023-01-11 17:16:05
 */
@Service("singleplayergameService")
public class SingleplayergameServiceImpl implements SingleplayergameService {
    @Resource
    private SingleplayergameDao singleplayergameDao;

    /**
     * 通过ID查询单条数据
     *
     * @param idsingleplayergame 主键
     * @return 实例对象
     */
    @Override
    public Singleplayergame queryById(Long idsingleplayergame) {
        return this.singleplayergameDao.queryById(idsingleplayergame);
    }

    /**
     * 分页查询
     *
     * @param singleplayergame 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Singleplayergame> queryByPage(Singleplayergame singleplayergame, PageRequest pageRequest) {
        long total = this.singleplayergameDao.count(singleplayergame);
        return new PageImpl<>(this.singleplayergameDao.queryAllByLimit(singleplayergame, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param singleplayergame 实例对象
     * @return 实例对象
     */
    @Override
    public Singleplayergame insert(Singleplayergame singleplayergame) {
        this.singleplayergameDao.insert(singleplayergame);
        return singleplayergame;
    }

    /**
     * 修改数据
     *
     * @param singleplayergame 实例对象
     * @return 实例对象
     */
    @Override
    public Singleplayergame update(Singleplayergame singleplayergame) {
        this.singleplayergameDao.update(singleplayergame);
        return this.queryById(singleplayergame.getIdsingleplayergame());
    }

    /**
     * 通过主键删除数据
     *
     * @param idsingleplayergame 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long idsingleplayergame) {
        return this.singleplayergameDao.deleteById(idsingleplayergame) > 0;
    }
}

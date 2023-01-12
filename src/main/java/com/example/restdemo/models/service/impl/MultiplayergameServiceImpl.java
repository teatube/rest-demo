package com.example.restdemo.models.service.impl;

import com.example.restdemo.models.entity.Multiplayergame;
import com.example.restdemo.models.dao.MultiplayergameMapper;
import com.example.restdemo.models.service.MultiplayergameService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Multiplayergame)表服务实现类
 *
 * @author szl
 * @since 2023-01-12 14:26:10
 */
@Service("multiplayergameService")
public class MultiplayergameServiceImpl implements MultiplayergameService {
    @Resource
    private MultiplayergameMapper multiplayergameMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param idmultiplayergame 主键
     * @return 实例对象
     */
    @Override
    public Multiplayergame queryById(Long idmultiplayergame) {
        return this.multiplayergameMapper.queryById(idmultiplayergame);
    }

    /**
     * 分页查询
     *
     * @param multiplayergame 筛选条件
     * @param pageRequest     分页对象
     * @return 查询结果
     */
    @Override
    public Page<Multiplayergame> queryByPage(Multiplayergame multiplayergame, PageRequest pageRequest) {
        long total = this.multiplayergameMapper.count(multiplayergame);
        return new PageImpl<>(this.multiplayergameMapper.queryAllByLimit(multiplayergame, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param multiplayergame 实例对象
     * @return 实例对象
     */
    @Override
    public Multiplayergame insert(Multiplayergame multiplayergame) {
        this.multiplayergameMapper.insert(multiplayergame);
        return multiplayergame;
    }

    /**
     * 修改数据
     *
     * @param multiplayergame 实例对象
     * @return 实例对象
     */
    @Override
    public Multiplayergame update(Multiplayergame multiplayergame) {
        this.multiplayergameMapper.update(multiplayergame);
        return this.queryById(multiplayergame.getIdmultiplayergame());
    }

    /**
     * 通过主键删除数据
     *
     * @param idmultiplayergame 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long idmultiplayergame) {
        return this.multiplayergameMapper.deleteById(idmultiplayergame) > 0;
    }
}

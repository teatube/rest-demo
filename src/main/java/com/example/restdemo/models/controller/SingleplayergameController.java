package com.example.restdemo.models.controller;

import com.example.restdemo.models.entity.Singleplayergame;
import com.example.restdemo.models.service.SingleplayergameService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Singleplayergame)表控制层
 *
 * @author szl
 * @since 2023-01-12 14:26:12
 */
@RestController
@RequestMapping("singleplayergame")
public class SingleplayergameController {
    /**
     * 服务对象
     */
    @Resource
    private SingleplayergameService singleplayergameService;

    /**
     * 分页查询
     *
     * @param singleplayergame 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Singleplayergame>> queryByPage(Singleplayergame singleplayergame, PageRequest pageRequest) {
        return ResponseEntity.ok(this.singleplayergameService.queryByPage(singleplayergame, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Singleplayergame> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.singleplayergameService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param singleplayergame 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Singleplayergame> add(Singleplayergame singleplayergame) {
        return ResponseEntity.ok(this.singleplayergameService.insert(singleplayergame));
    }

    /**
     * 编辑数据
     *
     * @param singleplayergame 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Singleplayergame> edit(Singleplayergame singleplayergame) {
        return ResponseEntity.ok(this.singleplayergameService.update(singleplayergame));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.singleplayergameService.deleteById(id));
    }

}


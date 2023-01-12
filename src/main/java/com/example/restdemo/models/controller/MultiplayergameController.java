package com.example.restdemo.models.controller;

import com.example.restdemo.models.entity.Multiplayergame;
import com.example.restdemo.models.service.MultiplayergameService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Multiplayergame)表控制层
 *
 * @author szl
 * @since 2023-01-11 17:16:03
 */
@RestController
@RequestMapping("multiplayergame")
public class MultiplayergameController {
    /**
     * 服务对象
     */
    @Resource
    private MultiplayergameService multiplayergameService;

    /**
     * 分页查询
     *
     * @param multiplayergame 筛选条件
     * @param pageRequest     分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Multiplayergame>> queryByPage(Multiplayergame multiplayergame, PageRequest pageRequest) {
        return ResponseEntity.ok(this.multiplayergameService.queryByPage(multiplayergame, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Multiplayergame> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.multiplayergameService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param multiplayergame 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Multiplayergame> add(Multiplayergame multiplayergame) {
        return ResponseEntity.ok(this.multiplayergameService.insert(multiplayergame));
    }

    /**
     * 编辑数据
     *
     * @param multiplayergame 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Multiplayergame> edit(Multiplayergame multiplayergame) {
        return ResponseEntity.ok(this.multiplayergameService.update(multiplayergame));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.multiplayergameService.deleteById(id));
    }

}


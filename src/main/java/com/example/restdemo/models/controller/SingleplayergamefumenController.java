package com.example.restdemo.models.controller;

import com.example.restdemo.models.entity.Singleplayergamefumen;
import com.example.restdemo.models.service.SingleplayergamefumenService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Singleplayergamefumen)表控制层
 *
 * @author szl
 * @since 2023-01-12 14:26:13
 */
@RestController
@RequestMapping("singleplayergamefumen")
public class SingleplayergamefumenController {
    /**
     * 服务对象
     */
    @Resource
    private SingleplayergamefumenService singleplayergamefumenService;

    /**
     * 分页查询
     *
     * @param singleplayergamefumen 筛选条件
     * @param pageRequest           分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Singleplayergamefumen>> queryByPage(Singleplayergamefumen singleplayergamefumen, PageRequest pageRequest) {
        return ResponseEntity.ok(this.singleplayergamefumenService.queryByPage(singleplayergamefumen, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Singleplayergamefumen> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.singleplayergamefumenService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param singleplayergamefumen 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Singleplayergamefumen> add(Singleplayergamefumen singleplayergamefumen) {
        return ResponseEntity.ok(this.singleplayergamefumenService.insert(singleplayergamefumen));
    }

    /**
     * 编辑数据
     *
     * @param singleplayergamefumen 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Singleplayergamefumen> edit(Singleplayergamefumen singleplayergamefumen) {
        return ResponseEntity.ok(this.singleplayergamefumenService.update(singleplayergamefumen));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.singleplayergamefumenService.deleteById(id));
    }

}


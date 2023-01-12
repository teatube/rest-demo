package com.example.restdemo.models.controller;

import com.example.restdemo.models.entity.Multiplayergamefumen;
import com.example.restdemo.models.service.MultiplayergamefumenService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Multiplayergamefumen)表控制层
 *
 * @author szl
 * @since 2023-01-12 14:26:11
 */
@RestController
@RequestMapping("multiplayergamefumen")
public class MultiplayergamefumenController {
    /**
     * 服务对象
     */
    @Resource
    private MultiplayergamefumenService multiplayergamefumenService;

    /**
     * 分页查询
     *
     * @param multiplayergamefumen 筛选条件
     * @param pageRequest          分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Multiplayergamefumen>> queryByPage(Multiplayergamefumen multiplayergamefumen, PageRequest pageRequest) {
        return ResponseEntity.ok(this.multiplayergamefumenService.queryByPage(multiplayergamefumen, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Multiplayergamefumen> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.multiplayergamefumenService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param multiplayergamefumen 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Multiplayergamefumen> add(Multiplayergamefumen multiplayergamefumen) {
        return ResponseEntity.ok(this.multiplayergamefumenService.insert(multiplayergamefumen));
    }

    /**
     * 编辑数据
     *
     * @param multiplayergamefumen 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Multiplayergamefumen> edit(Multiplayergamefumen multiplayergamefumen) {
        return ResponseEntity.ok(this.multiplayergamefumenService.update(multiplayergamefumen));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.multiplayergamefumenService.deleteById(id));
    }

}


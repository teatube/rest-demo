package com.example.restdemo.models.controller;

import com.example.restdemo.models.entity.Multiplayergameresult;
import com.example.restdemo.models.service.MultiplayergameresultService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Multiplayergameresult)表控制层
 *
 * @author szl
 * @since 2023-01-12 14:26:11
 */
@RestController
@RequestMapping("multiplayergameresult")
public class MultiplayergameresultController {
    /**
     * 服务对象
     */
    @Resource
    private MultiplayergameresultService multiplayergameresultService;

    /**
     * 分页查询
     *
     * @param multiplayergameresult 筛选条件
     * @param pageRequest           分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Multiplayergameresult>> queryByPage(Multiplayergameresult multiplayergameresult, PageRequest pageRequest) {
        return ResponseEntity.ok(this.multiplayergameresultService.queryByPage(multiplayergameresult, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Multiplayergameresult> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.multiplayergameresultService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param multiplayergameresult 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Multiplayergameresult> add(Multiplayergameresult multiplayergameresult) {
        return ResponseEntity.ok(this.multiplayergameresultService.insert(multiplayergameresult));
    }

    /**
     * 编辑数据
     *
     * @param multiplayergameresult 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Multiplayergameresult> edit(Multiplayergameresult multiplayergameresult) {
        return ResponseEntity.ok(this.multiplayergameresultService.update(multiplayergameresult));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.multiplayergameresultService.deleteById(id));
    }

}


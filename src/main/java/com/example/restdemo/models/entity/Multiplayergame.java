package com.example.restdemo.models.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Multiplayergame)实体类
 *
 * @author szl
 * @since 2023-01-12 14:26:10
 */
public class Multiplayergame implements Serializable {
    private static final long serialVersionUID = 809978881657091357L;

    private Long idmultiplayergame;

    private Date datetime;


    public Long getIdmultiplayergame() {
        return idmultiplayergame;
    }

    public void setIdmultiplayergame(Long idmultiplayergame) {
        this.idmultiplayergame = idmultiplayergame;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

}


package com.example.restdemo.models.entity;

import java.io.Serializable;

/**
 * (Singleplayergamefumen)实体类
 *
 * @author szl
 * @since 2023-01-12 14:26:13
 */
public class Singleplayergamefumen implements Serializable {
    private static final long serialVersionUID = -91879513914429226L;

    private Long idsingleplayergame;

    private String fumenCode;

    private String fumenString;


    public Long getIdsingleplayergame() {
        return idsingleplayergame;
    }

    public void setIdsingleplayergame(Long idsingleplayergame) {
        this.idsingleplayergame = idsingleplayergame;
    }

    public String getFumenCode() {
        return fumenCode;
    }

    public void setFumenCode(String fumenCode) {
        this.fumenCode = fumenCode;
    }

    public String getFumenString() {
        return fumenString;
    }

    public void setFumenString(String fumenString) {
        this.fumenString = fumenString;
    }

}


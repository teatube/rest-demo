package com.example.restdemo.models.entity;

import java.io.Serializable;

/**
 * (Multiplayergamefumen)实体类
 *
 * @author szl
 * @since 2023-01-12 14:26:11
 */
public class Multiplayergamefumen implements Serializable {
    private static final long serialVersionUID = -15150831484669535L;

    private Long idmultiplayergameresult;

    private String fumenCode;

    private String fumenString;

    private Long idmultiplayergame;


    public Long getIdmultiplayergameresult() {
        return idmultiplayergameresult;
    }

    public void setIdmultiplayergameresult(Long idmultiplayergameresult) {
        this.idmultiplayergameresult = idmultiplayergameresult;
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

    public Long getIdmultiplayergame() {
        return idmultiplayergame;
    }

    public void setIdmultiplayergame(Long idmultiplayergame) {
        this.idmultiplayergame = idmultiplayergame;
    }

}


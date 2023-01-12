package com.example.restdemo.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * (Multiplayergamefumen)实体类
 *
 * @author szl
 * @since 2023-01-11 17:16:03
 */
@Entity
public class Multiplayergamefumen implements Serializable {
    private static final long serialVersionUID = 478525804817414047L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idmultiplayergameresult")
    private Long idmultiplayergameresult;
    @Basic
    @Column(name = "fumen_code")
    private String fumenCode;
    @Basic
    @Column(name = "fumen_string")
    private String fumenString;
    @Basic
    @Column(name = "idmultiplayergame")
    private Long idmultiplayergame;
    @Lob
    @Column(name = "fumen_code")
    private String fumenCode1;
    @Lob
    @Column(name = "fumen_string")
    private String fumenString1;

    public String getFumenString1() {
        return fumenString1;
    }

    public void setFumenString1(String fumenString1) {
        this.fumenString1 = fumenString1;
    }

    public String getFumenCode1() {
        return fumenCode1;
    }

    public void setFumenCode1(String fumenCode1) {
        this.fumenCode1 = fumenCode1;
    }

    public Long getIdmultiplayergameresult() {
        return idmultiplayergameresult;
    }

    public void setIdmultiplayergameresult(long idmultiplayergameresult) {
        this.idmultiplayergameresult = idmultiplayergameresult;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multiplayergamefumen that = (Multiplayergamefumen) o;
        return Objects.equals(idmultiplayergameresult, that.idmultiplayergameresult) && Objects.equals(fumenCode, that.fumenCode) && Objects.equals(fumenString, that.fumenString) && Objects.equals(idmultiplayergame, that.idmultiplayergame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idmultiplayergameresult, fumenCode, fumenString, idmultiplayergame);
    }
}


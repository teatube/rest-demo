package com.example.restdemo.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * (Singleplayergamefumen)实体类
 *
 * @author szl
 * @since 2023-01-11 17:16:05
 */
@Entity
public class Singleplayergamefumen implements Serializable {
    private static final long serialVersionUID = 554731985645709037L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idsingleplayergame")
    private Long idsingleplayergame;
    @Basic
    @Column(name = "fumen_code")
    private String fumenCode;
    @Basic
    @Column(name = "fumen_string")
    private String fumenString;
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

    public Long getIdsingleplayergame() {
        return idsingleplayergame;
    }

    public void setIdsingleplayergame(long idsingleplayergame) {
        this.idsingleplayergame = idsingleplayergame;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Singleplayergamefumen that = (Singleplayergamefumen) o;
        return Objects.equals(idsingleplayergame, that.idsingleplayergame) && Objects.equals(fumenCode, that.fumenCode) && Objects.equals(fumenString, that.fumenString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idsingleplayergame, fumenCode, fumenString);
    }
}


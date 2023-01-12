package com.example.restdemo.models.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.io.Serializable;
import java.util.Objects;

/**
 * (Multiplayergame)实体类
 *
 * @author szl
 * @since 2023-01-11 17:16:03
 */
@Entity
public class Multiplayergame implements Serializable {
    private static final long serialVersionUID = 643525701352666943L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idmultiplayergame")
    private Long idmultiplayergame;
    @Basic
    @Column(name = "datetime")
    private Date datetime;

    public Long getIdmultiplayergame() {
        return idmultiplayergame;
    }

    public void setIdmultiplayergame(long idmultiplayergame) {
        this.idmultiplayergame = idmultiplayergame;
    }

    public void setIdmultiplayergame(Long idmultiplayergame) {
        this.idmultiplayergame = idmultiplayergame;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multiplayergame that = (Multiplayergame) o;
        return Objects.equals(idmultiplayergame, that.idmultiplayergame) && Objects.equals(datetime, that.datetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idmultiplayergame, datetime);
    }
}


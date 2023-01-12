package com.example.restdemo.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * (Multiplayergameresult)实体类
 *
 * @author szl
 * @since 2023-01-11 17:16:04
 */
@Entity
public class Multiplayergameresult implements Serializable {
    private static final long serialVersionUID = 706747738766757133L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idmultiplayergameresult")
    private Long idmultiplayergameresult;
    @Basic
    @Column(name = "iduser")
    private String iduser;
    @Basic
    @Column(name = "teaid")
    private String teaid;
    @Basic
    @Column(name = "time")
    private Long time;
    @Basic
    @Column(name = "clear_lines")
    private Long clearLines;
    @Basic
    @Column(name = "attack")
    private Long attack;
    @Basic
    @Column(name = "send")
    private Long send;
    @Basic
    @Column(name = "offset")
    private Long offset;
    @Basic
    @Column(name = "receive")
    private Long receive;
    @Basic
    @Column(name = "rise")
    private Long rise;
    @Basic
    @Column(name = "dig")
    private Long dig;
    @Basic
    @Column(name = "pieces")
    private Long pieces;
    @Basic
    @Column(name = "max_combo")
    private Long maxCombo;
    @Basic
    @Column(name = "pc_count")
    private Long pcCount;
    @Basic
    @Column(name = "place")
    private Integer place;
    @Basic
    @Column(name = "num_players")
    private Integer numPlayers;
    @Basic
    @Column(name = "fumen_code")
    private Integer fumenCode;
    @Basic
    @Column(name = "rule_set")
    private String ruleSet;
    @Basic
    @Column(name = "garbage")
    private String garbage;
    @Basic
    @Column(name = "idmultiplayergame")
    private Long idmultiplayergame;
    @Column(name = "clear_lines")
    private Long clearLines1;
    @Column(name = "max_combo")
    private Long maxCombo1;
    @Column(name = "pc_count")
    private Long pcCount1;
    @Column(name = "num_players")
    private Integer numPlayers1;
    @Column(name = "fumen_code")
    private Byte fumenCode1;
    @Lob
    @Column(name = "rule_set")
    private String ruleSet1;

    public String getRuleSet1() {
        return ruleSet1;
    }

    public void setRuleSet1(String ruleSet1) {
        this.ruleSet1 = ruleSet1;
    }

    public Byte getFumenCode1() {
        return fumenCode1;
    }

    public void setFumenCode1(Byte fumenCode1) {
        this.fumenCode1 = fumenCode1;
    }

    public Integer getNumPlayers1() {
        return numPlayers1;
    }

    public void setNumPlayers1(Integer numPlayers1) {
        this.numPlayers1 = numPlayers1;
    }

    public Long getPcCount1() {
        return pcCount1;
    }

    public void setPcCount1(Long pcCount1) {
        this.pcCount1 = pcCount1;
    }

    public Long getMaxCombo1() {
        return maxCombo1;
    }

    public void setMaxCombo1(Long maxCombo1) {
        this.maxCombo1 = maxCombo1;
    }

    public Long getClearLines1() {
        return clearLines1;
    }

    public void setClearLines1(Long clearLines1) {
        this.clearLines1 = clearLines1;
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

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getTeaid() {
        return teaid;
    }

    public void setTeaid(String teaid) {
        this.teaid = teaid;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getClearLines() {
        return clearLines;
    }

    public void setClearLines(Long clearLines) {
        this.clearLines = clearLines;
    }

    public Long getAttack() {
        return attack;
    }

    public void setAttack(Long attack) {
        this.attack = attack;
    }

    public Long getSend() {
        return send;
    }

    public void setSend(Long send) {
        this.send = send;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getReceive() {
        return receive;
    }

    public void setReceive(Long receive) {
        this.receive = receive;
    }

    public Long getRise() {
        return rise;
    }

    public void setRise(Long rise) {
        this.rise = rise;
    }

    public Long getDig() {
        return dig;
    }

    public void setDig(Long dig) {
        this.dig = dig;
    }

    public Long getPieces() {
        return pieces;
    }

    public void setPieces(Long pieces) {
        this.pieces = pieces;
    }

    public Long getMaxCombo() {
        return maxCombo;
    }

    public void setMaxCombo(Long maxCombo) {
        this.maxCombo = maxCombo;
    }

    public Long getPcCount() {
        return pcCount;
    }

    public void setPcCount(Long pcCount) {
        this.pcCount = pcCount;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public Integer getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(Integer numPlayers) {
        this.numPlayers = numPlayers;
    }

    public Integer getFumenCode() {
        return fumenCode;
    }

    public void setFumenCode(Byte fumenCode) {
        this.fumenCode = Integer.valueOf(fumenCode);
    }

    public void setFumenCode(Integer fumenCode) {
        this.fumenCode = fumenCode;
    }

    public String getRuleSet() {
        return ruleSet;
    }

    public void setRuleSet(String ruleSet) {
        this.ruleSet = ruleSet;
    }

    public String getGarbage() {
        return garbage;
    }

    public void setGarbage(String garbage) {
        this.garbage = garbage;
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
        Multiplayergameresult that = (Multiplayergameresult) o;
        return Objects.equals(idmultiplayergameresult, that.idmultiplayergameresult) && Objects.equals(iduser, that.iduser) && Objects.equals(teaid, that.teaid) && Objects.equals(time, that.time) && Objects.equals(clearLines, that.clearLines) && Objects.equals(attack, that.attack) && Objects.equals(send, that.send) && Objects.equals(offset, that.offset) && Objects.equals(receive, that.receive) && Objects.equals(rise, that.rise) && Objects.equals(dig, that.dig) && Objects.equals(pieces, that.pieces) && Objects.equals(maxCombo, that.maxCombo) && Objects.equals(pcCount, that.pcCount) && Objects.equals(place, that.place) && Objects.equals(numPlayers, that.numPlayers) && Objects.equals(fumenCode, that.fumenCode) && Objects.equals(ruleSet, that.ruleSet) && Objects.equals(garbage, that.garbage) && Objects.equals(idmultiplayergame, that.idmultiplayergame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idmultiplayergameresult, iduser, teaid, time, clearLines, attack, send, offset, receive, rise, dig, pieces, maxCombo, pcCount, place, numPlayers, fumenCode, ruleSet, garbage, idmultiplayergame);
    }
}


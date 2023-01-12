package com.example.restdemo.models.entity;

import java.io.Serializable;

/**
 * (Multiplayergameresult)实体类
 *
 * @author szl
 * @since 2023-01-12 14:26:11
 */
public class Multiplayergameresult implements Serializable {
    private static final long serialVersionUID = 477966551869235603L;

    private Long idmultiplayergameresult;

    private String iduser;

    private String teaid;

    private Long time;

    private Long clearLines;

    private Long attack;

    private Long send;

    private Long offset;

    private Long receive;

    private Long rise;

    private Long dig;

    private Long pieces;

    private Long maxCombo;

    private Long pcCount;

    private Integer place;

    private Integer numPlayers;

    private Integer fumenCode;

    private String ruleSet;

    private String garbage;

    private Long idmultiplayergame;


    public Long getIdmultiplayergameresult() {
        return idmultiplayergameresult;
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

}


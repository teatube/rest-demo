package com.example.restdemo.models.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Singleplayergame)实体类
 *
 * @author szl
 * @since 2023-01-12 14:26:12
 */
public class Singleplayergame implements Serializable {
    private static final long serialVersionUID = 598548073227184379L;

    private Long idsingleplayergame;

    private Date datetime;

    private String iduser;

    private String teaid;

    private Integer mode;

    private String clear;

    private Double serverTime;

    private Double clientTime;

    private Double lastPieceTime;

    private Long clearLines;

    private Long pieces;

    private Long score;

    private String fumenCode;

    private String cheat;

    private Date startTime;

    private String replayUpload;

    private String uuid;


    public Long getIdsingleplayergame() {
        return idsingleplayergame;
    }

    public void setIdsingleplayergame(Long idsingleplayergame) {
        this.idsingleplayergame = idsingleplayergame;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
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

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public String getClear() {
        return clear;
    }

    public void setClear(String clear) {
        this.clear = clear;
    }

    public Double getServerTime() {
        return serverTime;
    }

    public void setServerTime(Double serverTime) {
        this.serverTime = serverTime;
    }

    public Double getClientTime() {
        return clientTime;
    }

    public void setClientTime(Double clientTime) {
        this.clientTime = clientTime;
    }

    public Double getLastPieceTime() {
        return lastPieceTime;
    }

    public void setLastPieceTime(Double lastPieceTime) {
        this.lastPieceTime = lastPieceTime;
    }

    public Long getClearLines() {
        return clearLines;
    }

    public void setClearLines(Long clearLines) {
        this.clearLines = clearLines;
    }

    public Long getPieces() {
        return pieces;
    }

    public void setPieces(Long pieces) {
        this.pieces = pieces;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getFumenCode() {
        return fumenCode;
    }

    public void setFumenCode(String fumenCode) {
        this.fumenCode = fumenCode;
    }

    public String getCheat() {
        return cheat;
    }

    public void setCheat(String cheat) {
        this.cheat = cheat;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getReplayUpload() {
        return replayUpload;
    }

    public void setReplayUpload(String replayUpload) {
        this.replayUpload = replayUpload;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}


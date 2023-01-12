package com.example.restdemo.models.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.io.Serializable;
import java.util.Objects;

/**
 * (Singleplayergame)实体类
 *
 * @author szl
 * @since 2023-01-11 17:16:04
 */
@Entity
public class Singleplayergame implements Serializable {
    private static final long serialVersionUID = 822943053880871944L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idsingleplayergame")
    private Long idsingleplayergame;
    @Basic
    @Column(name = "datetime")
    private Date datetime;
    @Basic
    @Column(name = "iduser")
    private String iduser;
    @Basic
    @Column(name = "teaid")
    private String teaid;
    @Basic
    @Column(name = "mode")
    private Integer mode;
    @Basic
    @Column(name = "clear")
    private String clear;
    @Basic
    @Column(name = "server_time")
    private Double serverTime;
    @Basic
    @Column(name = "client_time")
    private Double clientTime;
    @Basic
    @Column(name = "last_piece_time")
    private Double lastPieceTime;
    @Basic
    @Column(name = "clear_lines")
    private Long clearLines;
    @Basic
    @Column(name = "pieces")
    private Long pieces;
    @Basic
    @Column(name = "score")
    private Long score;
    @Basic
    @Column(name = "fumen_code")
    private String fumenCode;
    @Basic
    @Column(name = "cheat")
    private String cheat;
    @Basic
    @Column(name = "start_time")
    private Date startTime;
    @Basic
    @Column(name = "replay_upload")
    private String replayUpload;
    @Basic
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "server_time")
    private Double serverTime1;
    @Column(name = "client_time")
    private Double clientTime1;
    @Column(name = "last_piece_time")
    private Double lastPieceTime1;
    @Column(name = "clear_lines")
    private Long clearLines1;
    @Lob
    @Column(name = "fumen_code")
    private String fumenCode1;
    @Column(name = "start_time")
    private Instant startTime1;
    @Column(name = "replay_upload", length = 20)
    private String replayUpload1;

    public String getReplayUpload1() {
        return replayUpload1;
    }

    public void setReplayUpload1(String replayUpload1) {
        this.replayUpload1 = replayUpload1;
    }

    public Instant getStartTime1() {
        return startTime1;
    }

    public void setStartTime1(Instant startTime1) {
        this.startTime1 = startTime1;
    }

    public String getFumenCode1() {
        return fumenCode1;
    }

    public void setFumenCode1(String fumenCode1) {
        this.fumenCode1 = fumenCode1;
    }

    public Long getClearLines1() {
        return clearLines1;
    }

    public void setClearLines1(Long clearLines1) {
        this.clearLines1 = clearLines1;
    }

    public Double getLastPieceTime1() {
        return lastPieceTime1;
    }

    public void setLastPieceTime1(Double lastPieceTime1) {
        this.lastPieceTime1 = lastPieceTime1;
    }

    public Double getClientTime1() {
        return clientTime1;
    }

    public void setClientTime1(Double clientTime1) {
        this.clientTime1 = clientTime1;
    }

    public Double getServerTime1() {
        return serverTime1;
    }

    public void setServerTime1(Double serverTime1) {
        this.serverTime1 = serverTime1;
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

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
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

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Singleplayergame that = (Singleplayergame) o;
        return Objects.equals(idsingleplayergame, that.idsingleplayergame) && Objects.equals(datetime, that.datetime) && Objects.equals(iduser, that.iduser) && Objects.equals(teaid, that.teaid) && Objects.equals(mode, that.mode) && Objects.equals(clear, that.clear) && Objects.equals(serverTime, that.serverTime) && Objects.equals(clientTime, that.clientTime) && Objects.equals(lastPieceTime, that.lastPieceTime) && Objects.equals(clearLines, that.clearLines) && Objects.equals(pieces, that.pieces) && Objects.equals(score, that.score) && Objects.equals(fumenCode, that.fumenCode) && Objects.equals(cheat, that.cheat) && Objects.equals(startTime, that.startTime) && Objects.equals(replayUpload, that.replayUpload) && Objects.equals(uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idsingleplayergame, datetime, iduser, teaid, mode, clear, serverTime, clientTime, lastPieceTime, clearLines, pieces, score, fumenCode, cheat, startTime, replayUpload, uuid);
    }
}


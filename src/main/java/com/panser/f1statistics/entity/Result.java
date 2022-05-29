package com.panser.f1statistics.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "results", schema = "ergastf1", catalog = "")
public class Result {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "resultId")
    private Integer resultId;
    @Basic
    @Column(name = "raceId")
    private Integer raceId;
    @Basic
    @Column(name = "driverId")
    private Integer driverId;
    @Basic
    @Column(name = "constructorId")
    private Integer constructorId;
    @Basic
    @Column(name = "number")
    private Integer number;
    @Basic
    @Column(name = "grid")
    private Integer grid;
    @Basic
    @Column(name = "position")
    private Integer position;
    @Basic
    @Column(name = "positionText")
    private String positionText;
    @Basic
    @Column(name = "positionOrder")
    private Integer positionOrder;
    @Basic
    @Column(name = "points")
    private Double points;
    @Basic
    @Column(name = "laps")
    private Integer laps;
    @Basic
    @Column(name = "time")
    private String time;
    @Basic
    @Column(name = "milliseconds")
    private Integer milliseconds;
    @Basic
    @Column(name = "fastestLap")
    private Integer fastestLap;
    @Basic
    @Column(name = "rank")
    private Integer rank;
    @Basic
    @Column(name = "fastestLapTime")
    private String fastestLapTime;
    @Basic
    @Column(name = "fastestLapSpeed")
    private String fastestLapSpeed;
    @Basic
    @Column(name = "statusId")
    private Integer statusId;

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getConstructorId() {
        return constructorId;
    }

    public void setConstructorId(Integer constructorId) {
        this.constructorId = constructorId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getGrid() {
        return grid;
    }

    public void setGrid(Integer grid) {
        this.grid = grid;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getPositionText() {
        return positionText;
    }

    public void setPositionText(String positionText) {
        this.positionText = positionText;
    }

    public Integer getPositionOrder() {
        return positionOrder;
    }

    public void setPositionOrder(Integer positionOrder) {
        this.positionOrder = positionOrder;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public Integer getLaps() {
        return laps;
    }

    public void setLaps(Integer laps) {
        this.laps = laps;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }

    public Integer getFastestLap() {
        return fastestLap;
    }

    public void setFastestLap(Integer fastestLap) {
        this.fastestLap = fastestLap;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getFastestLapTime() {
        return fastestLapTime;
    }

    public void setFastestLapTime(String fastestLapTime) {
        this.fastestLapTime = fastestLapTime;
    }

    public String getFastestLapSpeed() {
        return fastestLapSpeed;
    }

    public void setFastestLapSpeed(String fastestLapSpeed) {
        this.fastestLapSpeed = fastestLapSpeed;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Objects.equals(resultId, result.resultId) && Objects.equals(raceId, result.raceId) && Objects.equals(driverId, result.driverId) && Objects.equals(constructorId, result.constructorId) && Objects.equals(number, result.number) && Objects.equals(grid, result.grid) && Objects.equals(position, result.position) && Objects.equals(positionText, result.positionText) && Objects.equals(positionOrder, result.positionOrder) && Objects.equals(points, result.points) && Objects.equals(laps, result.laps) && Objects.equals(time, result.time) && Objects.equals(milliseconds, result.milliseconds) && Objects.equals(fastestLap, result.fastestLap) && Objects.equals(rank, result.rank) && Objects.equals(fastestLapTime, result.fastestLapTime) && Objects.equals(fastestLapSpeed, result.fastestLapSpeed) && Objects.equals(statusId, result.statusId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultId, raceId, driverId, constructorId, number, grid, position, positionText, positionOrder, points, laps, time, milliseconds, fastestLap, rank, fastestLapTime, fastestLapSpeed, statusId);
    }
}

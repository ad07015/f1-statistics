package com.panser.f1statistics.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "drivers")
public class Driver {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "driverId")
    private Integer driverId;
    @Basic
    @Column(name = "driverRef")
    private String driverRef;
    @Basic
    @Column(name = "number")
    private Integer number;
    @Basic
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "forename")
    private String forename;
    @Basic
    @Column(name = "surname")
    private String surname;
    @Basic
    @Column(name = "dob")
    private Date dob;
    @Basic
    @Column(name = "nationality")
    private String nationality;
    @Basic
    @Column(name = "url")
    private String url;

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getDriverRef() {
        return driverRef;
    }

    public void setDriverRef(String driverRef) {
        this.driverRef = driverRef;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(driverId, driver.driverId) && Objects.equals(driverRef, driver.driverRef) && Objects.equals(number, driver.number) && Objects.equals(code, driver.code) && Objects.equals(forename, driver.forename) && Objects.equals(surname, driver.surname) && Objects.equals(dob, driver.dob) && Objects.equals(nationality, driver.nationality) && Objects.equals(url, driver.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverId, driverRef, number, code, forename, surname, dob, nationality, url);
    }
}

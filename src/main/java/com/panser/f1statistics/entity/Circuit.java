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
@Table(name = "circuits", schema = "ergastf1", catalog = "")
public class Circuit {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "circuitId")
    private Integer circuitId;
    @Basic
    @Column(name = "circuitRef")
    private String circuitRef;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "location")
    private String location;
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "lat")
    private Double lat;
    @Basic
    @Column(name = "lng")
    private Double lng;
    @Basic
    @Column(name = "alt")
    private Integer alt;
    @Basic
    @Column(name = "url")
    private String url;

    public Integer getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(Integer circuitId) {
        this.circuitId = circuitId;
    }

    public String getCircuitRef() {
        return circuitRef;
    }

    public void setCircuitRef(String circuitRef) {
        this.circuitRef = circuitRef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Integer getAlt() {
        return alt;
    }

    public void setAlt(Integer alt) {
        this.alt = alt;
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
        Circuit circuit = (Circuit) o;
        return Objects.equals(circuitId, circuit.circuitId) && Objects.equals(circuitRef, circuit.circuitRef) && Objects.equals(name, circuit.name) && Objects.equals(location, circuit.location) && Objects.equals(country, circuit.country) && Objects.equals(lat, circuit.lat) && Objects.equals(lng, circuit.lng) && Objects.equals(alt, circuit.alt) && Objects.equals(url, circuit.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(circuitId, circuitRef, name, location, country, lat, lng, alt, url);
    }
}

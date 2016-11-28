package com.app.desktop.buruhpabrik.timbanganpacking.model;
// Generated Nov 28, 2016 3:37:48 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * BpStandar generated by hbm2java
 */
public class BpStandar  implements java.io.Serializable {


     private Integer id;
     private String kode;
     private String desc;
     private BigDecimal berat;
     private BigDecimal cones;
     private int hapus;
     private Integer createdBy;
     private Integer updatedBy;
     private Date createDate;
     private Date updateDate;

    public BpStandar() {
    }

	
    public BpStandar(String kode, int hapus) {
        this.kode = kode;
        this.hapus = hapus;
    }
    public BpStandar(String kode, String desc, BigDecimal berat, BigDecimal cones, int hapus, Integer createdBy, Integer updatedBy, Date createDate, Date updateDate) {
       this.kode = kode;
       this.desc = desc;
       this.berat = berat;
       this.cones = cones;
       this.hapus = hapus;
       this.createdBy = createdBy;
       this.updatedBy = updatedBy;
       this.createDate = createDate;
       this.updateDate = updateDate;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getKode() {
        return this.kode;
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getDesc() {
        return this.desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public BigDecimal getBerat() {
        return this.berat;
    }
    
    public void setBerat(BigDecimal berat) {
        this.berat = berat;
    }
    public BigDecimal getCones() {
        return this.cones;
    }
    
    public void setCones(BigDecimal cones) {
        this.cones = cones;
    }
    public int getHapus() {
        return this.hapus;
    }
    
    public void setHapus(int hapus) {
        this.hapus = hapus;
    }
    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }
    public Integer getUpdatedBy() {
        return this.updatedBy;
    }
    
    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getUpdateDate() {
        return this.updateDate;
    }
    
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }




}



package com.example.generator.entity;

import java.util.Date;

public class StatusT {
    private Integer revision;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private Long id;

    private String 姓名;

    private Integer 年龄;

    private Integer 性别;

    private String 地址;

    private Long 班级id;

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名 == null ? null : 姓名.trim();
    }

    public Integer get年龄() {
        return 年龄;
    }

    public void set年龄(Integer 年龄) {
        this.年龄 = 年龄;
    }

    public Integer get性别() {
        return 性别;
    }

    public void set性别(Integer 性别) {
        this.性别 = 性别;
    }

    public String get地址() {
        return 地址;
    }

    public void set地址(String 地址) {
        this.地址 = 地址 == null ? null : 地址.trim();
    }

    public Long get班级id() {
        return 班级id;
    }

    public void set班级id(Long 班级id) {
        this.班级id = 班级id;
    }
}
package com.mycompany.time_table_management_system.db.model;
// Generated Aug 2, 2015 2:18:56 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Module generated by hbm2java
 */
public class Module  implements java.io.Serializable {


     private String moduleNo;
     private Department department;
     private String moduleTitle;
     private BigDecimal credit;
     private Boolean isGpa;
     private Integer lectureHours;
     private Integer practicalHours;
     private Set schedules = new HashSet(0);

    public Module() {
    }

	
    public Module(String moduleNo, Department department, String moduleTitle) {
        this.moduleNo = moduleNo;
        this.department = department;
        this.moduleTitle = moduleTitle;
    }
    public Module(String moduleNo, Department department, String moduleTitle, BigDecimal credit, Boolean isGpa, Integer lectureHours, Integer practicalHours, Set schedules) {
       this.moduleNo = moduleNo;
       this.department = department;
       this.moduleTitle = moduleTitle;
       this.credit = credit;
       this.isGpa = isGpa;
       this.lectureHours = lectureHours;
       this.practicalHours = practicalHours;
       this.schedules = schedules;
    }
   
    public String getModuleNo() {
        return this.moduleNo;
    }
    
    public void setModuleNo(String moduleNo) {
        this.moduleNo = moduleNo;
    }
    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }
    public String getModuleTitle() {
        return this.moduleTitle;
    }
    
    public void setModuleTitle(String moduleTitle) {
        this.moduleTitle = moduleTitle;
    }
    public BigDecimal getCredit() {
        return this.credit;
    }
    
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }
    public Boolean getIsGpa() {
        return this.isGpa;
    }
    
    public void setIsGpa(Boolean isGpa) {
        this.isGpa = isGpa;
    }
    public Integer getLectureHours() {
        return this.lectureHours;
    }
    
    public void setLectureHours(Integer lectureHours) {
        this.lectureHours = lectureHours;
    }
    public Integer getPracticalHours() {
        return this.practicalHours;
    }
    
    public void setPracticalHours(Integer practicalHours) {
        this.practicalHours = practicalHours;
    }
    public Set getSchedules() {
        return this.schedules;
    }
    
    public void setSchedules(Set schedules) {
        this.schedules = schedules;
    }




}



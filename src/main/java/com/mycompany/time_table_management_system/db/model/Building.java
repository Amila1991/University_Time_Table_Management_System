package com.mycompany.time_table_management_system.db.model;
// Generated Aug 2, 2015 2:18:56 PM by Hibernate Tools 3.6.0



/**
 * Building generated by hbm2java
 */
@SuppressWarnings("serial")
public class Building  implements java.io.Serializable {


     private String buildingId;
     private String buildingName;

    public Building() {
    }

	
    public Building(String buildingId) {
        this.buildingId = buildingId;
    }
    public Building(String buildingId, String buildingName) {
       this.buildingId = buildingId;
       this.buildingName = buildingName;
    }
   
    public String getBuildingId() {
        return this.buildingId;
    }
    
    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }
    public String getBuildingName() {
        return this.buildingName;
    }
    
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }
}


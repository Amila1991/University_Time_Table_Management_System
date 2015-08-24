package com.mycompany.time_table_management_system.db.model;
// Generated Aug 2, 2015 2:18:56 PM by Hibernate Tools 3.6.0



/**
 * EquipmentId generated by hbm2java
 */
public class EquipmentId  implements java.io.Serializable {


     private String serialNo;
     private String modelNo;

    public EquipmentId() {
    }

    public EquipmentId(String serialNo, String modelNo) {
       this.serialNo = serialNo;
       this.modelNo = modelNo;
    }
   
    public String getSerialNo() {
        return this.serialNo;
    }
    
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    public String getModelNo() {
        return this.modelNo;
    }
    
    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EquipmentId) ) return false;
		 EquipmentId castOther = ( EquipmentId ) other; 
         
		 return ( (this.getSerialNo()==castOther.getSerialNo()) || ( this.getSerialNo()!=null && castOther.getSerialNo()!=null && this.getSerialNo().equals(castOther.getSerialNo()) ) )
 && ( (this.getModelNo()==castOther.getModelNo()) || ( this.getModelNo()!=null && castOther.getModelNo()!=null && this.getModelNo().equals(castOther.getModelNo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSerialNo() == null ? 0 : this.getSerialNo().hashCode() );
         result = 37 * result + ( getModelNo() == null ? 0 : this.getModelNo().hashCode() );
         return result;
   }   


}



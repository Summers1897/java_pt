package com.web.model;



/**
 * StepIndexId entity. @author MyEclipse Persistence Tools
 */

public class StepIndexId  implements java.io.Serializable {


    // Fields    

     private SysStep sysStep;
     private PlanIndex planIndex;


    // Constructors

    /** default constructor */
    public StepIndexId() {
    }

    
    /** full constructor */
    public StepIndexId(SysStep sysStep, PlanIndex planIndex) {
        this.sysStep = sysStep;
        this.planIndex = planIndex;
    }

   
    // Property accessors

    public SysStep getSysStep() {
        return this.sysStep;
    }
    
    public void setSysStep(SysStep sysStep) {
        this.sysStep = sysStep;
    }

    public PlanIndex getPlanIndex() {
        return this.planIndex;
    }
    
    public void setPlanIndex(PlanIndex planIndex) {
        this.planIndex = planIndex;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StepIndexId) ) return false;
		 StepIndexId castOther = ( StepIndexId ) other; 
         
		 return ( (this.getSysStep()==castOther.getSysStep()) || ( this.getSysStep()!=null && castOther.getSysStep()!=null && this.getSysStep().equals(castOther.getSysStep()) ) )
 && ( (this.getPlanIndex()==castOther.getPlanIndex()) || ( this.getPlanIndex()!=null && castOther.getPlanIndex()!=null && this.getPlanIndex().equals(castOther.getPlanIndex()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSysStep() == null ? 0 : this.getSysStep().hashCode() );
         result = 37 * result + ( getPlanIndex() == null ? 0 : this.getPlanIndex().hashCode() );
         return result;
   }   





}
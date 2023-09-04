
public class GetPlanFactory{  
    
 //use getPlan method to get object of type Plan   
     public plan getPlan(String planType){  
          if(planType == null){  
           return null;  
          }  
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
               return new DomesticPlan();  
             }   
         else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
              return new CommercialPlan();  
          }   
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
              return new InstitutionalPlan();
              
        } else if(planType.equalsIgnoreCase("SP")) {  
            return new Studenplan();
        }   
    return null;  
 }  
}//end of GetPlanFactory class.  


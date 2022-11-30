package week1.day2;

public class Mobile {
         String mobieBreandName="realme";
         char mobileLogo='r';
         short noOfmobile=5;
         int modelNumber=6;
         long imeiNumber=924532678236l;
         float mobileprice=28888.88f;
         boolean isDamaged=false;
         
         
public static void main (String[] args) {
      
   Mobile mob=new Mobile();
   System.out.println("mobileBreandName="+mob.mobieBreandName);
   System.out.println("mobileLogo="+mob.mobileLogo); 		
   System.out.println("noOfmobile="+mob.noOfmobile);		   		
   System.out.println("modelNumber="+mob.modelNumber);      
   System.out.println("imeiNumber="+mob.imeiNumber);      
   System.out.println(" mobileprice="+mob.mobileprice);
   System.out.println("isDamaged="+mob.isDamaged);
}
   
}

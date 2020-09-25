public class employee{
   public static final int is_part_time=1;
   public static final int is_full_time=2;
   public static final int rate_per_hour=20;

   public static void main(String[]  args){

       System.out.println("Welcome to Employee Wage Computation Program");
   int hours=0; 
   int wage=0;
   double presence = Math.floor(Math.random()*10) % 3;
       switch ((int)presence){
         case is_full_time:
            hours=8;
            break;
         case is_part_time:
            hours=4;
            break;
         default : 
            hours=0;
         }

     wage= hours * rate_per_hour;
    
     System.out.println("Daily Wage Of Employee Is : " + wage);

  }
}


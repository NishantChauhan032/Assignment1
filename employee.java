public class employee{

   public static void main(String[]  args){
       System.out.println("Welcome to Employee Wage Computation Program");
   int hours=0; int wage=0;
   double presence = Math.floor(Math.random()*10) % 2;
       if(presence==1)
          hours=8;
else
    hours=0;

   wage= hours*20;
    
    System.out.println("Daily Wage Of Employee Is : " + wage);

  }
}


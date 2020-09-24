public class employee{

   public static void main(String[]  args){
       System.out.println("Welcome to Employee Wage Computation Program");

    double attendence = Math.floor(Math.random()*10) % 2;
    if(attendence==1)
        System.out.println("Employee Is Present");
    else
        System.out.println("Employee Is Absent");
   }
}


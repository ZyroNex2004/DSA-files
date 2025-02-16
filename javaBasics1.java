import java.util.*;

//boilerplate code
public class javaBasics1 {
    public static void main(String args [])  {

        // operator
        // int a = 10;
        // int b = ++a;
        // System.out.println(a);
        // System.out.println(b);
        
        // both the code are same pre and post unary operator
        
        // int a = 10;
        // int b = a++;
        // System.out.println(a);
        // System.out.println(b);

            // logical and  operator
            // System.out.println( (3>2)  && ( 5>0));

         
        // conditional statements 
        // if else statement
        // int age = 16;
        // if(age >= 18) {
        //     System.out.println("adult: drive , vote");

        // }

        // if(age > 13 && age<18){
        //     System.out.println("teenager");
        // }
        // else {
        //     System.out.println("not adult");

        // }


        // printing the largest no. between 2 variables
        // int A = 1;
        // int B = 5;

        // if(A>=B){
        //     System.out.println("A is largest of 2");

        // }else{
        //     System.out.println("B is largest of 2");

        // }


        // print if a number is Odd or Even
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // if(a%2 ==0 ){
        //     System.out.println("number is even");
        // }else{
        //     System.out.println("number is odd");
        // }


        // tax calculator
        // int tax;
        // System.out.println("Enter the income");
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // if(income < 500000){
        //     tax =0;
        // }else if(income >= 500000 && income < 1000000){
        //     tax= (int)(income * (0.2));
            
        // }else{
        //     tax=(int)(income* (0.3));
        // }
        // System.out.println("your tax is " + tax);



        // print the largest 3 number
        // int A= 16, B=30, C= 6;
        // if(A>=B && A>=C){
        //     System.out.println("A is largest between them");
        // }else if( B>=C){
        //     System.out.println("B is largest");
        // }else{
        //     System.out.println("C is largest");
        // }


        // ternary Operator

        // int number = 5;

        // String type= ((number%2) == 0)? "even" : "odd";
        // System.out.println(type);


        // int marks =  67;
        // String RC = (marks>=33)? "Pass": "fail";
        // System.out.println(RC);


        //switch statements
        // int number = 8;
        // switch(number) {
        //     case 1: System.out.println("samsa");
        //         break;
        //     case 2 : System.out.println("burger");
        //         break;
        //     case 3: System.out.println("mango shake");
        //         break;
        //     default: System.out.println("we wake up");
        // }


        //calculator
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a :");
        // int a = sc.nextInt();
        // System.out.println("Enter b : ");
        // int b = sc.nextInt();

        // System.out.println("Enter operator");
        // char operator = sc.next().charAt(0);

        // switch(operator) {
        //     case '+' : System.out.println(a+b);
        //                    break;
        //     case '-' : System.out.println(a-b);
        //                     break;
        //     case '*': System.out.println(a*b);
        //                     break;
        //     case '/': System.out.println(a/b);
        //                      break;
        //     case '%': System.out.println(a%b);
        //                     break;
        //     default : System.out.println("wrong operator");
        // }




        // // checking number is postive or negtive  (Q1)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int num = sc.nextInt();
        //  if(num >= 0 ){
        //     System.out.println("Number is postive");
        //  } else{
        //     System.out.println("number is negative");
        //  }

         
        //  Q2
        // double temp = 103.5;
        // if(temp > 100){
        //     System.out.println("You have a fever");

        // }else{
        //     System.out.println("you not have a fever");
        // }


        // Q3)
        // Scanner sc= new Scanner(System.in);
        // int week = sc.nextInt();
        
        // switch(week){
        //     case 1 : System.out.println("Monday");
        //               break;
        //     case 2 : System.out.println("Tuesday");
        //               break;
        //     case 3 : System.out.println("Wednesday");
        //               break;
        //     case 4 : System.out.println("Thursday");
        //               break;
        //     case 5 : System.out.println("Friday");
        //               break;
        //     case 6 : System.out.println("Saturday");
        //               break;
        //     case 7 : System.out.println("Sunday");
        //               break;

        //     default : System.out.println("Invalid input");
        // }




        // Q5) leap year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        // Corrected leap year check
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }

    }
}
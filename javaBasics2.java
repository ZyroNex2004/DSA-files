import java.util.*;

//boilerplate code
public class javaBasics2 {
    public static void main(String args [])  {

        //while loop
        // int counter = 0;
        // while(counter < 100){
        //     System.out.println("Nobody cares");
        //         counter ++;
        // }
        // System.out.println("printed 100x");



        //printing  1 to 10 number using while loop
    //     int counter = 1;
    //     while(counter<=10){
    //         System.out.print(counter + " ");
    //         counter++;
    //     }
    //     System.out.println();


    // printing number from 1 to n
    // Scanner sc = new Scanner(System.in);
    // int range = sc.nextInt();
    // int counter =1 ;

    // while(counter <= range) {
    //     System.out.print(counter + " ");
    //     counter++;
    // }
    // System.out.println();



        //printng the sum of n natural number
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;

        // int i =1;
        // while(i <= n){
        //     sum +=i;
        //     i++;
        // }
        // System.out.println("sum is :"+sum);





        //for loop
        // for(int i=1;i<=10;i++){
        //     System.out.println("Nobody cares");
        // }

        
        //printing square pattern
        // for(int i =1;i<=4;i++){
            
        //         System.out.println("****");
        // }



        // printing the reerse of a number

        // int n = 10899;

        // while(n> 0){
        //     int lastDigit = n% 10;
        //     System.out.println(lastDigit);
        //     n = n / 10;
        // }
        // System.out.println();
 
        // 2-method

        // int n = 2003;
        // int rev= 0;
        // while(n>0){
        //     int lastDigit = n%10;
        //     rev = rev *10+ lastDigit;
        //     n = n/10;   
        // }
        // System.out.println(rev);



        // do-while loop
        // int counter = 1;
        // do{
        //     System.out.println("nobody cares");
        //     counter++;
        // }while(counter <=5);


        // break statement
        // for(int i=1; i<=5; i++){
        //     if(i ==3 ){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("i am out of the loop");

 

        //keep entering numbers till user enter a multiple of 10
        // Scanner sc = new Scanner(System.in);
    
        // do {
        //     System.out.print("Enter a number: ");
        //     int n = sc.nextInt();
        //     if (n % 10 == 0) {
        //         break;
        //     }
        //     System.out.println(n);
        // } while (true);
       
         

        //continue statement =  continue statement is used to skip the initations
        // for(int i =1;i<=5;i++){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }


        //Display all numbers entered by user except multiples of 10
        // Scanner sc = new Scanner(System.in);

        // do{
        //     System.out.println("Enter a number: ");
        //     int n = sc.nextInt();
        //     if(n%10 ==0){
        //         continue;
        //     }
        //     System.out.println("number was :" + n);
        // }while(true);



        // check whether the number is prime or not
        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();

        // if(n==2){
        //     System.out.println("n is prime");
        // }else{
        //     boolean isprime = true;
        //     for(int i =2;i<=Math.sqrt(n);i++){  //using root n is optimizing the code root n is max of both the number after that number will be repeat and it will take less time for large number
        //         if(n%i == 0 ){ // n is multiple of i (i is not equal to a or n)
        //             isprime = false;
        //         }
        //     }
        //     if(isprime == true){
        //         System.out.println("n is prime");
        //     }else{
        //         System.out.println("n is not prime");
        //     }
    
        // }


        // Dpp - Q2)
        // Scanner sc = new Scanner(System.in);

        // int number;
        // int choice;
        // int evensum = 0;
        // int oddsum = 0;

        // do{
        //     System.out.println("Enter the number" );
        //     number = sc.nextInt();

        //     if(number % 2 == 0){
        //         evensum += number;
        //     }else {
        //         oddsum += number;
        //     }
        //     System.out.print("Do you want to continue ? Press 1 for yes or 0 for no");

        //     choice = sc.nextInt();

        // }while(choice==1);

        // System.out.println("sum of even numbers: " +evensum);
        // System.out.println("sum of odd numbers: " + oddsum);
      


        // Dpp Q3)
        // Scanner sc =new Scanner(System.in);
        // int num;
        // int fact = 1;
        
        // System.out.println("Enter any positive number");
        // num = sc.nextInt();

        // for(int i=1;i<=num;i++){
        //     fact *=i; 
        // }
        // System.out.println("Factorial: " + fact);


        // Dpp Q4) multiplication table 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }



        


    }
}

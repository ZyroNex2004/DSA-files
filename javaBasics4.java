import java.util.*;

// public class javaBasics4 {
//     public static void printHelloWorld() {
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");

    
// }
// // call by value
// public static void swap(int a, int b){
//     int temp = a;
//     a = b;
//     b= temp;

//     System.out.println("a = " +a);
//     System.out.println("b = " +b);
// }

// public static void main(String[] args) {
//     int a =5;
//     int b=10;

//     swap(a,b);
// }
// }



//find product of a and b 
// public class javaBasics4 {
//     public static void printHelloWorld() {
//                 System.out.println("Hello World");
// }

// public static int product(int a, int b){
     
//     int mul = a * b;

//     return mul;
// }

// public static void main(String[] args) {

//     int a = 3;
//     int b= 5;

//     int multiply = product(a,b);

//     System.out.println("product of a and b is :" +multiply);

//     multiply = product(10,20);
//     System.out.println("product of a and b is :" +multiply);
// }
// }

//fatorial of a number ***** and binomial coefficient

// public class javaBasics4 {
//     public static int factorial(int n) {
         
//         int f = 1;
//         for(int i=1 ; i<=n; i++){
//             f = f * i;

//         }

//         return f;
                
// }

// public static int binCoeff(int n , int r) {
//     int fact_n = factorial(n);
//     int fact_r = factorial(r);
//     int fact_nmr = factorial(n-r);

//     int binCoeff = fact_n / (fact_r * fact_nmr);
//     return binCoeff;
// }

// public static void main(String[] args) {
//     // System.out.println("fact of num is : " +factorial(4));

//     System.out.println(binCoeff(5,2));
// }
// }


//************************************ */

// // func to cal sum of 2 nums
// public class javaBasics4 {
//         // public static int sum(int a, int b) {
//         //     return a + b;

//         // }
//         // //func to calc sum of 3 nums
//         // public static int sum(int a, int b,int c){
//         //     return a+b+c;
//         // }

//         //func to cal int sum
//         public static int sum(int a,int b){
//             return a + b;
//         }
        
//         // func to cal float sum
//         public static float sum(float a, float b){
//             return a + b;
//         }


//         public static void main(String[] args) {
//             System.out.println(sum(3,5));
//             System.out.println(sum(3.2f,5.5f));
//         }
//     }

    
// **********************************************
//check the prime or not //only for n>=2 . 1 is not a prime no.not a composite
// public class javaBasics4 {
    // public static boolean isPrime(int n){
        
    //  //corner case
    //  //2
    //  if(n==2){
    //     return true;
    //  }   
    //     for(int i=2;i<n-1;i++){
    //         if(n%i == 0){ //completely dividing
    //             return false;
                
    //         }
    //     }
    //     return true;
    // }


//     //optimize code
//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }

//     //print all prime  number in range 
//     public static void primesInRange(int n){
//         for(int i=2;i<=n;i++){
//             if(isPrime(i)){ //true
//                 System.out.print(i+" ");
//             }
//         }
//         System.out.println();
//     }




//     public static void main(String[] args) {
//         System.out.println(isPrime(2));
//         primesInRange(20); // 2 to 20
//     }
// }


// binary to decimal convert code ****************

// public class javaBasics4 {
//     public static void binTodec(int binNum){
//         int myNum = binNum;
//         int pow =0;
//         int decNum = 0;

//         while(binNum>0){
//             int lastDigit = binNum %10;
//             decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

//             pow++;
//             binNum = binNum/10;
//         }
//         System.out.println("decimal of" + myNum +" =" +decNum);
//     } 

//     public static void main(String[] args) {
//         binTodec(101);
//     }
// }


//decimal to binary ***********

// public class javaBasics4 {
//     public static void decTobin(int n){
//         int myNum = n;
//         int pow = 0;
//         int binNum = 0;

//         while(n>0){
//             int rem = n % 2;
//             binNum =binNum +(rem* (int)Math.pow(10,pow));
//             pow++;
//             n=n/2;
//         }
//         System.out.println("binary form of" +myNum + " = " +binNum);
//     }

//     public static void main(String[] args) {
//         decTobin(7);
//     }
// }


//********************************************** */
//exercise Q1) avg of 3 number

// public class javaBasics4 {
//     public static double avg(double n1, double n2,double n3){
//         return n1+n2+n3/3;
//     }


// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number n1");
//         double a = sc.nextInt();
//         System.out.println("Enter the number n2");
//         double b= sc.nextInt();
//         System.out.println("Enter the number n3");
//         double c= sc.nextInt();
//         double Average = avg(a,b,c);
//         System.out.println("AVERAGE is: " +Average);
// }
// }

// ******************************
// Q2) check even or odd

// public class javaBasics4 {
//     public static boolean isEven(int n){
          
//         if(n%2==0){
//             System.out.println( n+ " is even no.");
//             return true;
//         }else {
//             System.out.println(n + " is odd no.");
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num;
//         num = sc.nextInt();
//         System.out.print(isEven(num));
//     }

// }

//Q3) palidrom check code

// public class javaBasics4 {
   

//     public static void main(String[] args) {
//         System.out.println("please Enter a number :");
//         Scanner sc = new Scanner(System.in);
//         int palindrome = sc.nextInt();

        

//         if(isPalidrom(palindrome)){
//             System.out.println("Number: " + palindrome + " is a palindrome");
//         }else {
//             System.out.println("Number: " + palindrome + " is not a palindrome ");
//         }
//     }
    
//     public static boolean isPalidrom(int number){
//         int palindrome = number; //copied no.into var
//         int reverse = 0;

//         while(palindrome != 0){
//             int remainder = palindrome % 10;
//             reverse = reverse * 10 + remainder;
//             palindrome = palindrome /10; 
//         }
//         if(number == reverse){
//             return true;
//         }
//         return false;
//     }
 
// }


//********************************************** */
public class javaBasics4 {
    public static int sum(int n){
        int sum=0;
        int ld=0;
        while(n>0){
        ld = n % 10;
        sum = sum+ld;
        n = n/10;
        }
        return sum;

    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(sum(num));
    }
    }
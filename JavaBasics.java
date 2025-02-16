import java.util.*;

//boilerplate code
public class JavaBasics {
    public static void main(String args [])  {
     
    // 1 ) print
        // System.out.println("Hello Rohit"); //line ka space
    //     System.out.print("Hello Rohit\n"); //line ka space
    //     System.out.println("Hello Rohit"); //line ka space


    // 2
    // int a = 10;
    // int b = 5;
    // System.out.println(a);
    // System.out.println(b);
    // String name = "Rohit";
    // System.out.println(name);


    // a=50;
    // System.out.println(a);


    // 3) Dta type
    // byte b= 3;
    // System.out.println(b);
    // char ch= 'a';
    // System.out.println(ch);
    // boolean var = false;
    // float price = 15.2f;
    // float price = (float)15.2;
    // int number = 25;
    // //long 
    // //double
    // short n=240;

    // 4) sum of two numbers
    // int a =10;
    // int b = 5;
    // int sum= a+b;
    // System.out.println(sum);


    // 5) input 
    // Scanner sc = new Scanner(System.in);
    // String input = sc.next(); //sc.next() can print only one word before space
    // System.out.println(input);    

    // String name = sc.nextLine();  // sc.nextLine() can print multiple words 
    // System.out.println(name);

    // int number = sc.nextInt();
    // System.out.println(number);

    // float price = sc.nextFloat();     // problem in float value can not be printed or taken through output
    // System.out.println(price);
    

    // 6) sum of two number taken from user
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

    // 7) product of two number taken from user
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int Product = a * b;
    // System.out.println(Product);


    // 8) Area of a Circle
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the radius of the circle: "); // Prompt for user input
    // float rad = sc.nextFloat();
    // float Area = 3.14f * rad * rad; // Use 'f' to indicate float literal
    // System.out.println(Area);
     

    // 7) TypeConversion 
    // Scanner sc = new Scanner(System.in);
    // float number = sc.nextInt();
    // System.out.println(number);


    // 8) Type casting - loss of data
    // Scanner sc = new Scanner(System.in);
    // float a = 25.999f;
    // int b = (int)a;
    // System.out.println(b);

    //     9) Type promotion
    // char a = 'a';
    // char b = 'b';
    // System.out.println((int)(b));
    // System.out.println((int)(a));
    // System.out.println(b-a); 


    // Dpp-1 
    // 1) Avg of three no. 
  
  // Scanner sc = new Scanner(System.in);
    // int num1 = sc.nextInt();
    // int num2 = sc.nextInt();
    // int num3 = sc.nextInt();
    // int Avg = (num1 + num2 + num3)/3;
    // System.out.println( "average of three no.  is " + Avg);


    // 2 Area of  square
    //  Scanner sc = new Scanner(System.in);
    //  int side = sc.nextInt();
    //  int Area = side * side;
    //   System.out.println( "Area of square is " + Area);

    // 3) customer problem
       Scanner sc = new Scanner(System.in);
         System.out.println( "Enter the cost of 3 item" );
         float pencil = sc.nextFloat();
         float pen = sc.nextFloat();
         float eraser = sc.nextFloat();
         float Bill = pencil + pen + eraser;
         System.out.println( "Total bill " + Bill );

         float newTotal= Bill+ (0.18f* Bill);
         System.out.println("Bill with 18% tax : "+newTotal);



    }} 

// //hollow rectangle
// public class Advpattern {
//     public static void hollow_rectangle(int totRows, int totCols){
//         //outer loop
//         for(int i=1; i<=totRows;i++){
//             //inner -columns
//             for(int j=1; j<=totCols;j++){
//                 //cell-(i,j)
//                 if( i == 1 || i == totRows|| j == 1 || j == totCols ){
//                     //bounder cells
//                     System.out.print("*");

//                 } else {
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println();
        
//         }
//     }
    
//     public static void main(String[] args) {
//         hollow_rectangle(4, 5);
//     }
    
// }

// inverted & rotated half-pyramid
// public class Advpattern {
//    public static void half_pyramid(int n){
//     for(int i=1;i<=n;i++){
//         //spaces
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println( );
//     }
//    }
//    public static void main(String[] args) {
//     half_pyramid(4);
//    }
// }


//inverted half pyrmaid with number
// public class Advpattern {
//     public static void pyramid(int n){
//         for( int i=1;i<=n;i++){
//             for(int j=1; j<=n-i+1;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         pyramid(5);
//     }
// }


// floyd's triangle
// public class Advpattern {
//     public static void triangle(int n){
//         int counter =1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//             System.out.print(counter + " ");
//              counter++;
//         }
        
//         System.out.println();
//     }
// }
//     public static void main(String[] args) {

//         triangle(5);
//     }  
//     }


//********************************* */\
// //0-1 triangle
// public class Advpattern {
//     public static void zero_one(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j) % 2 == 0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         zero_one(5);
//     }
// }

//************************ */
// butterfly pattern
// public class Advpattern {
//     public static void butterfly(int n){
//         //1st half
//         for(int i=1;i<=n;i++){
//             //stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             //spaces
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //2nd half
//         for(int i=n;i>=1;i--){
//              //stars
//              for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             //spaces
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         butterfly(4);
//     }
// }


// ***************************
// // solid Rhombus
// public class Advpattern {
//     public static void rhombus(int n){
//         //outer loop
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         rhombus(5);
//     }
// }


// *************************
//hollow rhombus
// public class Advpattern {
//     public static void hollow_rhombus(int n){
//         // spaces
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //hollow rectangle-stars
//             for(int j=1;j<=n;j++){
//                 if( i==1|| i==n || j==1 || j==n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         hollow_rhombus(5);
//     }
// }

// ********************
//diamond pattern
public class Advpattern {
    public static void diamond(int n ){
        //1st half
        //outer loop
        for(int i =1;i<=n;i++){
            // inner loop
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        //outer loop
        for(int i=n;i>=1;i--){
            //inner loop
                //spaces
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond(5);
    }
}
import java.util.*;

//boilerplate code
public class pattern {
    public static void main(String args [])  {
        // print star pattern in incresaing order
        // for(int line=1; line<=4; line++){
        //     for(int star=1;star<=line;star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //print star pattern in decreasing order
        // int n=4;
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //print the 1234 half-pyramid pattern in increasing order
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //print character pattern
        int n=4;
        char ch='A';

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }
}

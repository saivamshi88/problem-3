import java.util.Scanner;

public class teatime {
    
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            {
             int button = sc.nextInt();{
             switch( button){
                 case  1: System.out.println("masala chai");
                 break;
                 case 2 : System.out.println("dum chai");
                 break;

                 case 3 :  System.out.println( "badam milk");
                 break;
                 case 4 : System.out.println("milk shake");
                 break;
                 default : System.out.println("wrong button othinav vya ");
             }
            }
            }
        }
    }
}


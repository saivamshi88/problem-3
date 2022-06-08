package loops;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int input;
            do{
                int marks = sc.nextInt();
                if(marks >=90 && marks <=100){
                    System.out.println("this is good");
                }
                else if (marks >=60 && marks <=89){
                    System.out.println("this also good");

                }
                else if (marks <= 0 && marks <=59){
                    System.out.println("this is a good as well");
                }
                else {
                    System.out.println("invalid");
                }
                System.out.println("want to continue ? if yes(1) if no(0)");
                input =  sc.nextInt();}

        while(input == 1);
            
            
            }
        }
    
    }
    


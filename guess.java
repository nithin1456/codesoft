import java.util.Random;
import java.util.Scanner;

class game{


    public static void main(String args[]){

        Random  obj = new Random();
        int number = obj.nextInt(100)+1;
        System.out.println("GUESS A NUMBER 0-100");
        System.out.println("You Have 6 Attempts ");
            
        Scanner s = new Scanner(System.in);
        int attempt = 6;


        while(attempt!=0){

            int guess = s.nextInt();
            if(guess == number){
                System.out.println(" You Won The Game");
                break;
            }
            else if( guess < number){
                 System.out.println(" Little Higher");
                 attempt--;
            }
            else 
            {
                 System.out.println(" The Number Is Lower");
                 attempt--;
            }

        }
        System.out.println(" You  Are Out Off Lives");






        s.close();
            


        
     


    }

}
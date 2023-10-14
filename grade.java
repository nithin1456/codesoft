import java.util.Scanner;


public class grade  {
    public static void  main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.println(" Enter Your Marks In 6 SUBS");
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        int s3 = s.nextInt();
        int s4 = s.nextInt();
        int s5 = s.nextInt();
        int s6 = s.nextInt();
        int marks = s1+s2+s3+s4+s5+s6;
        int r = marks/10;
        if(r ==10){
            System.out.println(" YOU GOT AN 'A+' GRADE");
        }
        else if(r==9){
            System.out.println(" YOU GOT AN 'A' GRADE");
        }
        else if(r==8){
             System.out.println(" YOU GOT AN 'B' GRADE");
        }
        else if(r==7){
             System.out.println(" YOU GOT AN 'B+' GRADE");
        }
        else if(r==6){
            System.out.println(" YOU GOT AN 'C' GRADE");
        }
        else{
             System.out.println(" YOU HAVE TO WORK HARD");
        }

    


        
        s.close();
    }
}

import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean f=false;
        int nt=0;
        System.out.println("enter the number of rounds you want to play:");
        int nr=sc.nextInt();
        int s=0;
        while(f!=true && nr>0){
        System.out.println("Enter a random number:");
        int u=sc.nextInt();
        int y=randomNumber();
        System.out.println(y);
        if(u==y){
        System.out.println("match");
        f=true;
        s++;
        }
        else if(u>y){
        System.out.println("Your guessed value greater");
        }
        else{
        System.out.println("Your guessed value smaller");
        }
        nr--;

}
System.out.println("Score:"+s);
    }
public static int randomNumber(){
    int x=0;
    Random r=new Random();
    x=r.nextInt(100);
    return x;
 }

}

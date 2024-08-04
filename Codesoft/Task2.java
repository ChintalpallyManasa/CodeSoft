import java.util.Scanner;

public class Task2 {
    
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of subjects you have:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the marks in each subject you secured");
        
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double avg=(double)sum/n;
        if(avg>=90)
        System.out.println("Your  total marks are "+sum+" average percentage is "+avg+" and the grade is A");
        else if(avg<90 && avg>79)
        System.out.println("Your  total marks are "+sum+" average percentage is "+avg+" and the grade is B");
        else  if(avg<80&& avg>69 )
        System.out.println("Your  total marks are "+sum+" average percentage is "+avg+" and the grade is C");
        else if(avg<70 && avg>59)
        System.out.println("Your  total marks are "+sum+" average percentage is "+avg+" and the grade is D");
        else if(avg<60 && avg>49)
        System.out.println("Your  total marks are "+sum+" average percentage is "+avg+" and the grade is E");
        else
        System.out.println("Your  total marks are "+sum+" average percentage is "+avg+" and the grade is Fail");
        
	}

}



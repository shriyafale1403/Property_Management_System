import java.util.Scanner;

public class Proj_run {

public static void main(String[] args) {

Scanner sc=new Scanner (System.in);
List l=new List();
int i=0;
System.out.println("WELCOME DEAR USER!!!");
System.out.println("Enter 1 , if you are a Admin\nEnter 2 if you are the Customer\n 3-Exit this"
		+ " applicaion");
i=sc.nextInt();
while(i!=3)
{
    
    if(i==1)
    l.Admin();
    
    else if(i==2)
        l.Customer();
    else if(i==3)
{
    	System.out.println("You have Exited Successfully");
    	}
    System.out.println("Enter 1 , if you are a Admin, Enter 2 if you are the Customer, 3-Exit this"
    		+ " applicaion");
    i=sc.nextInt();
}

System.out.println("Thank You...! Visit Again");

}

}



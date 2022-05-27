package emailapp;
import java.util.Scanner;
public class EmailApp{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Firstname=sc.next();
		String Lastname=sc.next();
		email em1=new email(Firstname, Lastname);
		System.out.println(em1.showInfo());
     }

}
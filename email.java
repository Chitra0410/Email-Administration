package emailapp;

import java.util.Scanner;

public class email {
	private String Firstname;
	private String Lastname;
	private String password;
	private String email;
	private String AlternateEmail;
	private int mailboxCapacity=650;
	private String department;
    private int defaultPasswordLength=10;
    private String companySuffix="jkmotors.com";
	
	//constructor to receive first and last name
	
	public email(String Firstname, String Lastname) {
		this.Firstname=Firstname;
		this.Lastname=Lastname;
		System.out.println("Email Created: " + this.Firstname +" " + this.Lastname);
		
	//method asking for department
		
		this.department=setdepartment();
		System.out.println("Department: " +this.department);
		
	//method returning a random password
		this.password=randomPassword(defaultPasswordLength);
	    System.out.println("Yor password is: " +this.password);
	
	
	//combine elements to generate Email
	
	    email=Firstname.toLowerCase()+ "." +Lastname.toLowerCase()+ "@" +department+ "." +companySuffix;
	    System.out.println("Your email is: "+email);
        } 
	
	//Ask for  the Department
		private String setdepartment() {
			System.out.print("New employee: "+Firstname+ "\nDepartment Codes: \n1 for Sales\n2 for Development\n3 for Accounting\nEnter the Department Code: ");
			Scanner sc=new Scanner(System.in);
			int deptSelect=sc.nextInt();
			if(deptSelect==1) {
				return "sales";
			}
			else if(deptSelect==2){
				return "dev";
			}
			else if(deptSelect==3) {
				return "acct";
			}
			else if(deptSelect==0) {
				return "none";
			}
			else {
				return "";
			}
		}	
					
	//Generate a random password
			private String randomPassword(int length) {
				String passwordset="ABCDEFG1593572@!";
				char[] password=new char[length];
				for(int i=0;i<length;i++){
					int rand=(int) (Math.random()*passwordset.length());
					password[i]=passwordset.charAt(rand);
				}
				return new String(password);
			}
			
    //set mailbbox capacity
			public void	setmailboxCapacity(int capacity){
				this.mailboxCapacity=capacity;
			}
			
			
	//set alternate email
			public void setAlternateEmail(String altEmail) {
			this.AlternateEmail=altEmail;
}
			

	//change password	
			public void changepassword(String password) {
				this.password=password;
			}
			
	//mailbox  capacity
			public int getmailboxCapacity(){
				return mailboxCapacity;
			}
			public String getAlternateEmail() {
				return AlternateEmail;
			}
			public String getpassword() {
				return password;
			}
			
			public  String showInfo() {
				return "Dispaly name: " +Firstname+" " +Lastname+
					   "\nCompany Email: " +email+
					   "\nMailbox Capacity: " +mailboxCapacity+ "mb";
			}
}
	
	
	


package emailApp;

import java.util.Scanner;
//13:46
public class Email {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private int mailBoxCapacity = 100;
	private int defaultPasswordLenght = 8;
	private String alternateEmail;
	private String companyName = "hotelemails.com";

			
			
			
// constructor to get first and last name 
public Email(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	System.out.println("Welcome " + firstName + "," + "\nCreate Your New Email! ");
	
	// call a method for dep - return dep
	this.department = setDepartment();
			//System.out.println("Department:  " + this.department);
	
	//call a method that returns a random pass with 8 characters
	this.password = randomPassword(defaultPasswordLenght);
	System.out.println("New Passwoord: " + this.password);
	
	//Generating email
	email = firstName.toLowerCase() + lastName.toLowerCase() + "." + department + "@" + companyName;
	System.out.println("Your new email is: " + email);
}
	
	

// ask for email department
private String setDepartment() {
	System.out.print("Enter department:\n-1 Administration\n-2 Reception\n-3 Housekeeping\n-4 F&B\n-0 none of the above\nEnter Department: ");
	Scanner in = new Scanner(System.in);
	
	int depOption = in.nextInt();
	if(depOption == 1) {
		return "Administration";
	}else if(depOption == 2) {
		return "Reception";
	}else if(depOption == 3) {
		return "Housekeeping";
	}else if(depOption == 4) {
		return "F&B";
	}else { return "";}	
}



//generate random pass
private String randomPassword(int length) {
	String passSet = "abcdefghijklmnopkrstuvwxyz0123456789@#$%&!.+-";
	char[] password = new char[length];
	for(int i=0; i<length; i++) {
		int randomPassSet = (int) (Math.random() * passSet.length());
		password[i] = passSet.charAt(randomPassSet);
		//System.out.println(randomPassSet);
		//System.out.println(passSet.charAt(randomPassSet));		
	}
	return new String(password);
}



// set mail box capacity 
public void setMailBoxCapacity(int capacity) {
	this.mailBoxCapacity = capacity;
}



// set alternate email
public void setAlternateEmail(String alternateEmail) {
	this.alternateEmail = alternateEmail;
}



// change pass
public void changePassword(String passeword) {
	this.password = password;
}



//get methods 
public int getMailBoxCapacity() {
	return mailBoxCapacity;
}
public String getAlternateEmail() {
	return alternateEmail;
}
public String getPassword() {
	return password;
}



//show all info necessary 
public String showAllInfo() {
	return  "\n\nEmployer Information:" + "\nEmployee name: " + firstName + " " + lastName +
			"\nCompany email: " + email +
			"\nMail box capacity: " + mailBoxCapacity + " mb";
}





}

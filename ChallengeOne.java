// We first import all the java packages we will use
import java.util.Scanner;  
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;



  
import java.util.regex.*;

public class ChallengeOne {


//function to validate date
static boolean validateJavaDate(String strDate) {

if (strDate.trim().equals("")) {
	    return true;
	} else {
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
	    sdfrmt.setLenient(false);
	    
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	    }
	    catch (ParseException e) { 
	        return false;
	    }
	    return true;
	}
}

	//fuction to convert distance from kilometers to miles
	static double distanceInMiles(double distanceInKm) {
		double convertedDistance;
		convertedDistance = distanceInKm * 0.62137119;
		return convertedDistance;
	}
	

	static int yearsOld(String birthYear) {
		int outcomeYear = 2021 - Integer.parseInt(birthYear);
		return outcomeYear;
	}

	//fuction to convert distance from kilometers to meters
	static double distanceInMeters(double distanceInKm) {
		double convertedDistance;
		convertedDistance = distanceInKm * 1000;
		return convertedDistance;
	}


	//fuction to convert age from years to milliseconds
	public static double ageInMilliseconds(int age) {

		double ageInMill = (age * 3.154e+7) * 1000; 
		return ageInMill;
	}

	//function to displaye birthday in hexadecimal, Octal and binary
	public static void displayBirthday(int birthDay) {
		String dayToHex = Integer.toHexString(birthDay);
		String dayToOct = Integer.toOctalString(birthDay);
		String dayToBinary = Integer.toBinaryString(birthDay);

		System.out.println("Your birthday in Hexadecimal is: " + dayToHex);
		System.out.println("Your birthday in Octal is: " + dayToOct);
		System.out.println("Your birthday in Binary is: " + dayToBinary );
	}

// validate first name and surname
  public static boolean validateInputStrings(String inputName) {
    return inputName.matches("[A-Z][a-zA-Z]*");
  }


	public static void main(String[] args) {

		String name = "";
		String surname = "";
		String date_of_birth = "";
		double distance_from_store;
		String closeProgram = "exit";

		//This line creates a new Scanner object		
		Scanner userInput = new Scanner(System.in); 

		System.out.println("======================================Challenge Part 1============================");
		
		
		//This line takes the name input from the user
		while(true){
			 System.out.println("What is your name: ");
			 name = userInput.nextLine();
			 if (validateInputStrings(name)){
			 	break;
			 }
		 System.out.println("Invalid first name");	
		}

		//This line takes the surname input from the user
		while(true){
			 System.out.println("What is your surname: ");
			 surname = userInput.nextLine();
			 if (validateInputStrings(surname)){
			 	break;
			 }
		 System.out.println("Invalid surname");	
		}

		

		//This line takes the date of birth input from the user
		while(true){
			 System.out.println("Enter your date of birth (In the format DD/MM/YYYY): ");
			 date_of_birth = userInput.nextLine();
			 if (validateJavaDate(date_of_birth)){
			 	break;
			 }
		 	System.out.println("Invalid date");	
		}

		//This line takes the distance to favourite shop input from the user
		System.out.println("How far is your favourite store from your home in Kilometres (km)? ");
		distance_from_store = userInput.nextDouble();

		System.out.println("======================================Challenge Part 2============================");
		//substring year from the date of birth
		String year = date_of_birth.split("/")[2];

		//calculate years old
		int userAge = yearsOld(year);

		//convert the birth day from string to integer
		int birthday = Integer.parseInt(date_of_birth.split("/")[0]);

		//display
		System.out.println("======================================Challenge Part 3============================");
		System.out.println("Hello " + name + " " + surname);
		System.out.println("You are " + userAge + " years old.");		
		System.out.println("Distance in Miles " + distanceInMiles(distance_from_store) + " mi");
		System.out.println("Distance in Meters " + distanceInMeters(distance_from_store) + " meters");
		System.out.println("Age in milliseconds " + ageInMilliseconds(userAge));
		displayBirthday(birthday);
		System.out.println("==================================================================================");
	
	}

	

}



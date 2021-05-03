package chrisbloom;

import java.util.ArrayList;

public class LoginPage {
	
	//Separate array list created for all user details
	
	public static ArrayList< String > userId = new ArrayList<String>();
	public static ArrayList< String > password = new ArrayList<String>();
	public static ArrayList< String > location = new ArrayList<String>();
	public static ArrayList< String > district = new ArrayList<String>();
	public static ArrayList< String > phoneNo = new ArrayList<String>();
	public static ArrayList< String > availableCities = new ArrayList<String>();
	
	/**
	 * Registers the new users with their user id and password
	 * @param userName
	 * @param passcode
	 * @return
	 */
	public static boolean regVerification(String userName, String passcode) {
	
		//checks if user name is valid
		if((userName.trim().equals(" ")  || userName.length()<4) || passcode.length()<8){ 
			System.out.println("Please enter valid details");
			return false;
			}
		
		//if valid append to the list
		else {
			userId.add(userName);
			password.add(passcode);
			System.out.println("Reistration Successfull");
			return true;
		}
			
	}
	/**
	 * If already registered login with the prior details(username,password)
	 * @param userName
	 * @param passcode
	 * @return
	 */
	public static boolean loginVerification(String userName, String passcode) {
		
		boolean login=false;
		
		//checks for the user name match in the list
		for (int i = 0; i < userId.size(); i++) {
			
			//if matches gives success message
			if (userName == userId.get(i) && passcode == password.get(i)) {
				login=true;
				System.out.println("Login successfull");
				return true;
			}
			
			
		}
		//else redirects to register
		
		System.out.println("Register ur details");
		return login;
	}
	
	/**
	 * gets and checks mobile for its validity do not accept the mobile number which is already given
	 * applies only during registration
	 * @param mobileNo
	 * @return
	 */
	public static boolean getMobileNumber(String mobileNo) {
		
		long mobileNoInt = Long.parseLong(mobileNo);
		int firstno=(int) (mobileNoInt/1000000000);
		
		//checks if the mobile number is already available
		for (int i = 0; i < phoneNo.size(); i++) {
			
			if (mobileNo == phoneNo.get(i) ) {
				System.out.println("Mobile number already available");
				return false;
			}
			
		}
		
		//checks for the validity of mobile number
		if(mobileNo.length()==10 && firstno!=0 && firstno>5) {
			System.out.println("Mobile number valid");
			phoneNo.add(mobileNo);
			 return true;
		    }
		
		else {
			System.out.println("Mobile number invalid");
			return false;
		}
		
	}
	
	/**
	 * Delivery available only for the below mentioned cities and are appended in a
	 * array list
	 */
	static{
		
		availableCities.add("MADURAI");
		availableCities.add("VIRUDHUNAGAR");
		availableCities.add("TRICHY");
		availableCities.add("DINDUGAL");
		availableCities.add("SALEM");
		availableCities.add("COIMBATORE");
	
	}
	
	/**
	 * checks if the given address is valid and if city matches the cities available
	 * @param city
	 * @param address
	 * @return
	 */
	public static boolean getAddress(String city,String address) {
		
		//if address not valid do not accept the address
		if( address.trim().length()==0 ) {
			System.out.println("Invalid address");
			return false;
		}
		
		//if valid checks for the available cities, checks these both and say about the delivery 
		else {
			for(String avalCities : availableCities) {
				if(avalCities.equalsIgnoreCase(city)){
					System.out.println("delivery available");
					return true;
				}
				else
				{
					continue;
				}
			}
		System.out.println("item not deliverable");
		return false;
		}
		
	}
	
	/**
	 * Display all users user name and mobile number
	 */
	public static void displayDetails() {
		System.out.println("USER NAME"+"         "+"MOBILENUMBER");
		System.out.println("**********"+"        "+"************");
		
		for(int i=0;i<userId.size();i++) {
			System.out.println(userId.get(i)+"         "+phoneNo.get(i));
		}
		System.out.println("************************************");
}


}

package lab2;

/**
 * BuddyInfo Class from Lab 1
 * @author david
 * @version lab1
 */
public class BuddyInfo {
	/**
	 * Name of the Buddy
	 */
	private String name;
	/**
	 * Address of the Buddy
	 */
	private String address;
	/**
	 * Phone Number of the Buddy
	 */
	private long phoneNumber;
	
	/**
	 * Program Entry Point
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BuddyInfo homer = new BuddyInfo("Homer", "Some Place", 1234567890);
			
			System.out.println("Hello " + homer.getName());
		} catch (IllegalArgumentException e) {
			System.out.println("EXCEPTION: Illegal Argument Exception - " + e.getMessage());
		}
	}

	public BuddyInfo(String name, String address, long phoneNumber) throws IllegalArgumentException {
		if (phoneNumber > 9999999999l) {
			throw new IllegalArgumentException("Invalid Phone Number! (Don't include Country Code)");
		}
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean equals(BuddyInfo other) {
		return this.getName().equals(other.getName()) 
				&& this.getAddress().equals(other.getAddress()) 
				&& this.getPhoneNumber() == other.getPhoneNumber();
	}
}

package lab2;

import java.util.ArrayList;

/**
 * Wraps a List of Buddies
 * @author david
 */
public class AddressBook {
	ArrayList<BuddyInfo> buddies;
	
	public boolean addBuddy(BuddyInfo buddy) {
		buddies.add(buddy);
		return true;
	}	
	
	public boolean addBuddy(String name, String address, long phoneNumber) {
		try {
			BuddyInfo buddy = new BuddyInfo(name, address, phoneNumber);
			return addBuddy(buddy);
		} catch (IllegalArgumentException e) {
			return false;
		}
	}
	
	public boolean removeBuddy(BuddyInfo buddy) {
		int toRemove = -1;
		for (int i = 0; i < buddies.size(); i++) {
			if (buddies.get(i).equals(buddy)) {
				toRemove = i;
			}
		}
		if (toRemove != -1) buddies.remove(toRemove);
		return true;
	}
	
	
	/**
	 * Program Entry Point
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		AddressBook buddies = new AddressBook();
		
		try {
			BuddyInfo homer = new BuddyInfo("Homer", "Some Place", 1234567890);
			
			buddies.addBuddy(homer);
			buddies.removeBuddy(homer);
			
		} catch (IllegalArgumentException e) {
			System.out.println("EXCEPTION: Illegal Argument Exception - " + e.getMessage());
		}
	}
}

package test2;

import java.util.*;

public class AddressBookOperations {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		List<AddressBook> addressBookList = new ArrayList<AddressBook>();

		boolean done = false;

		do {

			System.out.println("Add an entry");

			System.out.print("Enter a FIRST NAME  ");
			String fname = in.nextLine();

			System.out.print("Enter a LAST Name:");
			String lname = in.nextLine();

			System.out.print("Enter a PHONE NUMBER: ");
			String phoneNumber = in.nextLine();
			System.out.print("Enter a address ");
			String address = in.nextLine();

			System.out.println("Do you want to add more?Y/N");
			AddressBook addressbook = new AddressBook();
			addressbook.setAddress(address);
			addressbook.setPhoneNumber(phoneNumber);
			addressbook.setFname(fname);
			addressbook.setLname(lname);
			addressBookList.add(addressbook);

			if (in.nextLine().equals("N"))
				done = true;

		} while (!done);
		in.close();
		System.out.println(addressBookList.size());
		List<AddressBook> sortedaddressBookList = sortedListByFname(addressBookList);
		System.out.println("Address Book Sorted");
		print(sortedaddressBookList);
	}

	public static List<AddressBook> sortedListByFname(List<AddressBook> addressbook) {
		List<AddressBook> sorted = new ArrayList<>(addressbook);
		sorted.sort(Comparator.comparing(b -> b.getFname()));
		return sorted;
	}

	public static void print(List<AddressBook> list) {
		for (AddressBook obj : list) {
			System.out.println(obj.getFname());
		}
	}

}
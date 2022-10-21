import java.util.Scanner;

public class Facade {

	public Facade() {

		System.out.println("-------------------------------------------Facade-Design-Pattern-Started-----------------------------------------------");
		System.out.println("Type 0 if you are buyer");
		System.out.println("Type 1 if you are seller");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		Reminder reminder= new Reminder();
		Person person1;
		if (input == 0) {
			person1 = new Buyer("", "");
			System.out.println("Enter the Username");
			person1.username = sc.next();
			System.out.println("Enter the Password");
			person1.password = sc.next();

			if (person1.login_user()) {
				System.out.println("Successfully logged in!! ");
				System.out.println("-------------------------------------------Bride-Design-Pattern-Started-----------------------------------------------");
				System.out.println("Press 1 to select Product Categories");
				System.out.println("Press 2 to select Products");
				input=sc.nextInt();
				if (input==1){
					System.out.println("-------------------------------------------Factory-Design-Pattern-Started-----------------------------------------------");
					System.out.println("Press 1 for Produce product menu");
					System.out.println("Press 2 for Meat product menu");
					int input1 = sc.nextInt();
					if (input1==1){
						System.out.println("Produce product menu is chosen now");
					}
					if (input1==2) {

						System.out.println("Meat product menu is chosen now");
					}
				}
				else if (input==2) {

					System.out.println("-------------------------------------------Visitor-Design-Pattern-Started-----------------------------------------------");
					System.out.println("");
					System.out.println("");

				}

			} else
				System.out.println("Invalid Credentials!!");
		} else if (input==1) {

			person1 = new Seller("", "");
			System.out.println("Enter the Username");
			person1.username = sc.next();
			System.out.println("Enter the Password");
			person1.password = sc.next();

			if (person1.login_user()) {
				System.out.println("Successfully logged in!! ");
				System.out.println("-------------------------------------------Bride-Design-Pattern-Started-----------------------------------------------");
				System.out.println("Press 1 to select Product Categories");
				System.out.println("Press 2 to select Products");
				input=sc.nextInt();
				if (input==1){
					System.out.println("-------------------------------------------Factory-Design-Pattern-Started-----------------------------------------------");
					System.out.println("Press 1 for Produce product menu");
					System.out.println(" Press 2 for Meat product menu");
					int input1 = sc.nextInt();
					if (input1==1){
						System.out.println("Produce product menu is chosen now");
					}
					if (input1==2) {

						System.out.println("Meat product menu is chosen now");
					}
				}
				else if (input==2) {

					System.out.println("-------------------------------------------Visitor-Design-Pattern-Started-----------------------------------------------");
					System.out.println("");
					System.out.println("");

				}
			}
				System.out.println("Invalid Credentials!!");



		}



		int UserType;

	Product theSelectedProduct;

	int nProductCategory;

	ClassProductList theProductList;

	Person thePerson;
/*
	public boolean login() {
		return false;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void attachProductToUser() {

	}

	public Product selectProduct() {
		return null;
	}

	public void productOperation() {

	}
*/
}}

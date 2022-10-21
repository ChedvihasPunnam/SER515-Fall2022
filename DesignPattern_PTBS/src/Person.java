import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Person {

    public String username;
	public String password;
	private ProductMenu theProductMenu;

	private ProductMenu productMenu;

	public abstract void showMenu();

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public abstract ProductMenu CreateProductMenu();

	public boolean UserCheck(String string) {
		Scanner sc;
		try {
			sc = new Scanner(new File(string));
			while (sc.hasNextLine()) {
				String line[]= sc.next().split(":");

				if(line[0].equals(this.username) && line[1].equals(this.password)) {
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("User not found");

		}
		return false;
	}
	public boolean login_user() {

		if(this.getClass().equals(Buyer.class)) {
			String buyer_path = "C:/Users/Chedvihas/Desktop/ASU/SEM1/SER515/Design Patterns/SER515-Fall2022/DesignPattern_PTBS/test/BuyerInfo.txt";
			return UserCheck(buyer_path);
		}
		else if (this.getClass().equals(Seller.class))
		{
			String seller_path = "C:/Users/Chedvihas/Desktop/ASU/SEM1/SER515/Design Patterns/SER515-Fall2022/DesignPattern_PTBS/test/SellerInfo.txt";
			return UserCheck(seller_path);
		}
		else return false;

	}


}

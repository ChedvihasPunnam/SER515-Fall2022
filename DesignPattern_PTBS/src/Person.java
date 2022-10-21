import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Person {

	String username;
	String password;


	private ProductMenu theProductMenu;

	ProductMenuFactory productMenu;

	ProductMenu TheproductMenu;

	public boolean checkUser(String string) {
		Scanner sc;
		try {
			sc = new Scanner(new File(string));
			while (sc.hasNextLine()) {
				String s1[]= sc.next().split(":");

				if(s1[0].equals(this.username)&&s1[1].equals(this.password)) {
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error finding the user");
			e.printStackTrace();
		}
		return false;
	}

	public boolean userLogin () {
		if(this.getClass().equals(Buyer.class)) {
			return checkUser("C:/Users/Chedvihas/Desktop/ASU/SEM1/SER515/Design Patterns/SER515-Fall2022/DesignPattern_PTBS/test/BuyerInfo.txt");
		}

		else {
			return checkUser("C:/Users/Chedvihas/Desktop/ASU/SEM1/SER515/Design Patterns/SER515-Fall2022/DesignPattern_PTBS/test/SellerInfo.txt");
		}


	}
	public void showMenu(int choice) {
		if(choice==1) {
			ProduceProductMenu menu=this.productMenu.produceMenu;
			for(int i=0; i<menu.product.size();i++) {
				//System.out.println(per.username);
				System.out.println(":"+menu.product.get(i).productName);
			}
			System.out.println("Select from below");
		}
		else {
			MeatProductMenu menu=this.productMenu.meatMenu;
			for(int i=0; i<menu.product.size();i++) {

				//System.out.println(per.username);
				System.out.println(":"+menu.product.get(i).productName);
			}
			System.out.println("Select from below");
		}

	}


	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public abstract ProductMenu CreateProductMenu();

}

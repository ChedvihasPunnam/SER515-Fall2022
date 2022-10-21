public class Seller extends Person {

	public Seller(String UserName, String Password) {
		this.username=UserName;
		this.password=Password;
	}

	public void showMenu(String UserName, String Password) {

	}

	@Override
	public void showMenu() {

	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}

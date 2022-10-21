import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClassProductList implements ArrayList {

	private ReminderVisitor reminderVisitor;

	private Product[] theProduct;

	public ClassProductList() {
		super();
		getProducts("C:/Users/Chedvihas/Desktop/ASU/SEM1/SER515/Design Patterns/SER515-Fall2022/DesignPattern_PTBS/test/ProductInfo.txt");
	}
	public void getProducts(String path) {
		try {
			Scanner sc = new Scanner(new File(path));
			int j=0;
			while (sc.hasNextLine()) {
				sc.nextLine();
				j++;
			}
			this.theProduct=new Product[j];
			sc= new Scanner(new File (path));
			j=0;
			while (sc.hasNextLine()) {
				this.theProduct[j]=new Product(sc.nextLine().trim());
				j++;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();
		}

	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return new ProductIterator();
	}

	private class ProductIterator implements ListIterator {
		int index=0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index< theProduct.length;
		}

		@Override
		public void moveToHead() {
			// TODO Auto-generated method stub
			index = 0;
		}

		@Override
		public Product Next() {
			// TODO Auto-generated method stub
			if(this.hasNext())
				return theProduct[index++];
			return null;
		}



	}







	public void accept(NodeVisitor visitor) {

	}

}

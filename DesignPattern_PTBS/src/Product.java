public class Product {

	private ClassProductList classProductList;

	String productName;
	Trading[] trading;
	public Product(String name) {
		this.productName=name;
		this.trading= new Trading[2];
		int i;
		for (i=0; i<=1; i++ ) {
			if(i==0)
				this.trading[i]=new Trading("Trading for Produce Products "+" "+this.productName);
			if(i==1)
				this.trading[i]=new Trading("Trading for Meat Products "+" "+this.productName);

		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(this.productName+":\n");
		for(int i=0; i<this.trading.length;i++) {
			builder.append("\t"+this.trading[i].toString()+"\n");
		}
		return builder.toString();
	}

}

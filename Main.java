class Product{
	String pcode;
	String pname;	
	double price;

	public void setProductDetails(String productcode ,String productName , double productPrice  ){
		pcode = productcode;
		pname = productName;
		price = productPrice;
	}

	public double getPrice(){
		return price;
	}

	public void displayProduct(){
		System.out.println("Product code:"+ pcode);
		System.out.println("Product name:"+ pname);
		System.out.println("Product price:"+ price);
	}
}
class Main{
	public static void main(String[] args){
		Product product1 = new Product();
		product1.setProductDetails("P001","product1",100.0);

		Product product2 = new Product();
		product2.setProductDetails("P002","product2",50.0);

		Product product3 = new Product();
		product3.setProductDetails("P003","product3",150.0);

		
		Product lowestPriceProduct = product1;
		if(product2.getPrice()<lowestPriceProduct.getPrice()){
			lowestPriceProduct = product2;
		}

		if(product3.getPrice()<lowestPriceProduct.getPrice()){
			lowestPriceProduct = product3;
		}

		System.out.println("\nProduct with the lowest price:");
		lowestPriceProduct.displayProduct();
	}
}







				



		 
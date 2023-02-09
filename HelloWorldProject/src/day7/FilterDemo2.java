package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}


public class FilterDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList=new ArrayList<Product>();
		List<Product> target=new ArrayList<Product>();

		productList.add(new Product(101,"Laptop",40000));
		productList.add(new Product(102,"Camera",25000));
		productList.add(new Product(101,"Smartphone",50000));
		productList.add(new Product(101,"Smart TV",35000));
		productList.add(new Product(101,"Mouse",40000));
	
		
		target = productList.stream().filter(p->p.price>30000).collect(Collectors.toList());
		System.out.println(target);
	
	}

}

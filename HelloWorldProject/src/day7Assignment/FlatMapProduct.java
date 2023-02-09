package day7Assignment;

import java.util.ArrayList;
import java.util.Arrays;
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


public class FlatMapProduct {

	public static void main(String[] args) {
		List<Product> productList1=Arrays.asList(
				new Product(101,"hp laptop",40000),
				new Product(102,"acre laptop",50000),
				new Product(103,"samsung laptop",60000)
				);
		List<Product> productList2=Arrays.asList(
				new Product(101,"hp phone",40000),
				new Product(102,"acre phone",50000),
				new Product(103,"samsung phone",60000)
				);
		List<Product> productList3=Arrays.asList(
				new Product(101,"hp camera",40000),
				new Product(102,"acre camera",50000),
				new Product(103,"samsung camera",60000)
				);
		List<List<Product>> allList=new ArrayList<List<Product>>();
		List<Product> finalProductList=new ArrayList<Product>();
		
		allList.add(productList1);
		allList.add(productList2);
		allList.add(productList3);
		
		finalProductList=allList.stream().flatMap(pL->pL.stream()).collect(Collectors.toList());
		finalProductList.stream().forEach(p->System.out.println(p.name));
	}

}

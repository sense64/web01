package edu.donga;

import java.util.ArrayList;

public class ProductRepository {
   private ArrayList<Product> products = new ArrayList<Product>();
   public ProductRepository() {
   Product p1 = new Product("001", "족자", 10000, "홍길동", "선물" );
   Product p2 = new Product("002", "나태주 시", 5000, "심청", "선물");
   Product p3 = new Product("003", "사진 및 글", 12000, "심청", "액자");
   Product p4 = new Product("004", "사진 및 글1", 24000, "이순신", "가구");
   Product p5 = new Product("005", "강물처럼", 3000,"이순신", "액자");
   products.add(p1);
   products.add(p2);
   products.add(p3);
   products.add(p4);
   products.add(p5);
   }  
   public ArrayList<Product> getAllProducts(){
	   return products;
   }
}

package cg.model;

public class Book {
      private String title;
      private String Author;
      private double price;
      private int qty;
 public Book(String title,String Author,double price,int qty) {
	 this.title=title;
	 this.Author=Author;
	 this.price=price;
	 this.qty=qty;
 }
 public String getTitle() {
	 return title;
 }
 public String getAuthor() {
	 
	 return Author;
 }
 public double getPrice() {
	 return price;
 }
 public int getQty() {
	 return qty;
	 
 }
 public void setQty(int qty) {
	 this.qty=qty;
 }
 public String toString() {
	 return "'"+title+"' by"+Author;
 }
}

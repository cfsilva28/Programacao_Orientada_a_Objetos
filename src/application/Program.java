package application;

import javax.swing.JOptionPane;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Product product = new Product();
		System.out.println("Enter Product data: ");
		product.name = JOptionPane.showInputDialog("Name");
		product.price = Double.parseDouble(JOptionPane.showInputDialog("Price"));
		product.quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity In Stock"));

		System.out.println(product);	

	}

}

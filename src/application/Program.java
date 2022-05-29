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

		System.out.println("Product data: " + product);
		int quantity = Integer
				.parseInt(JOptionPane.showInputDialog("Enter the number of products to be added in stock:"));
		product.addProducts(quantity);

		System.out.println("Updated data: " + product);
		quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of products to be removed in stock:"));
		product.removeProducts(quantity);

		System.out.println("Updated data: " + product);

	}

}

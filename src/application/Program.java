package application;

import javax.swing.JOptionPane;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();

		rect.width = Double.parseDouble(JOptionPane.showInputDialog("Enter rectangle width"));
		rect.height = Double.parseDouble(JOptionPane.showInputDialog("Enter rectangle height"));
		
		System.out.println("AREA = "+rect.area());
		System.out.println("PERIMETER = "+rect.perimeter());
		System.out.println("DIAGONAL = "+rect.diagonal());
		
		
		

	}

}

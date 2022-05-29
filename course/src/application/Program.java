package application;

import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Triangle;

public class Program {

	// Solução do problema com orientação a objetos
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		System.out.println("Enter the measures of triangle X: ");

		x.a = Double.parseDouble(JOptionPane.showInputDialog("xA"));
		x.b = Double.parseDouble(JOptionPane.showInputDialog("xB"));
		x.c = Double.parseDouble(JOptionPane.showInputDialog("xC"));

		System.out.println("Enter the measures of triangle Y: ");

		y.a = Double.parseDouble(JOptionPane.showInputDialog("yA"));
		y.b = Double.parseDouble(JOptionPane.showInputDialog("yA"));
		y.c = Double.parseDouble(JOptionPane.showInputDialog("yA"));

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
	}
}
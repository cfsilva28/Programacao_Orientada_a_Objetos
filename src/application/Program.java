package application;

import javax.swing.JOptionPane;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Employee empl = new Employee();

		empl.name = JOptionPane.showInputDialog("Entre com o nome do Funcionário");
		empl.grossSalary = Double.parseDouble(JOptionPane.showInputDialog("Entre com o salário bruto do Funcionário"));
		empl.tax = Double.parseDouble(JOptionPane.showInputDialog("Entre com a porcentagem de imposto"));

		System.out.println("Employee" + empl);

		empl.increaseSalary(Double.parseDouble(JOptionPane.showInputDialog("Which percentage to increase salary?")));

		System.out.println("Update data: " + empl);

	}

}

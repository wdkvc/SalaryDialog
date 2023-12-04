// Chapter 2 (page )

import javax.swing.JOptionPane;

public class SalaryDialog 
{
	public static void main(String[] args) 
	{
		// Variables and constants
		String wageString;
		String dependentsString;
		double wage;
		double weeklyPay;
		int dependents;
		final double HOURS_IN_WEEK = 37.5;

		// Input phase
		wageString = JOptionPane.showInputDialog(null, "Please enter the employee's hourly wage:", "Salary Dialog 1", JOptionPane.INFORMATION_MESSAGE);
		wage = Double.parseDouble(wageString);

		dependentsString = JOptionPane.showInputDialog(null, "Now, enter the number of dependents:", "Salary Dialog 2", JOptionPane.WARNING_MESSAGE);
		dependents = Integer.parseInt(dependentsString);

		// Processing phase
        weeklyPay = wage * HOURS_IN_WEEK;

        // Output phase
        JOptionPane.showMessageDialog(null, "Weekly salary is $" + weeklyPay + "\nDeductions will be made for " + dependents + " dependents.");
	}
}
import javax.swing.JOptionPane;

public class CalculateCommission {
	static String input; // Input of user
	static int stocks; // /Amount of locks being bought
	static int locks; // Amount of stocks being bought
	static int barrels; // Amount of barrels being bought
	static double sales; // Total sales amount before commission
	static double commission = 0; // The amount of commission on the sale
	
	public static void UserInputs() {

		input = JOptionPane.showInputDialog("Enter the number of locks");
		locks = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Enter the number of stocks");
		stocks = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Enter the number of barrels");
		barrels = Integer.parseInt(input);
	}

	public static double Calculate(int locks, int stocks, int barrels) {
		double sales = locks * 45 + stocks * 30 + barrels * 25;

		if (sales <= 1000)
			commission = 0.1 * sales;
		else if (sales <= 1800)
			commission = 0.15 * (sales - 1000) + 100;
		else if (sales > 1800)
			commission = 0.2 * (sales - 1800) + 220;
		// totalSales = sales + commission;
		return commission;
	}

	public static void main(String[] args) {
		UserInputs();
		Calculate(locks, stocks, barrels);
		JOptionPane.showMessageDialog(null, "Commission for " + locks
				+ " locks " + stocks + " stocks " + barrels + " barrels is "
				+ commission);
		System.exit(0);
	}

}
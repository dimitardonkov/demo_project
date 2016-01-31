import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class FuelApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuelApp window = new FuelApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FuelApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextPane inpLiters = new JTextPane();
		inpLiters.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		inpLiters.setBounds(10, 30, 94, 23);
		frame.getContentPane().add(inpLiters);

		JTextPane infoInpLiters = new JTextPane();
		infoInpLiters.setText("\u043B\u0438\u0442\u0440\u0430");
		infoInpLiters.setBounds(129, 30, 36, 20);
		frame.getContentPane().add(infoInpLiters);

		JTextPane inpLitersCalc = new JTextPane();
		inpLitersCalc.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		inpLitersCalc.setBounds(10, 105, 93, 20);
		frame.getContentPane().add(inpLitersCalc);

		JTextPane infoInputLitersCalc = new JTextPane();
		infoInputLitersCalc.setText("\u043B\u0438\u0442\u0440\u0430");
		infoInputLitersCalc.setBounds(127, 102, 63, 23);
		frame.getContentPane().add(infoInputLitersCalc);

		JTextPane inpMoney = new JTextPane();
		inpMoney.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		inpMoney.setBounds(215, 105, 87, 20);
		frame.getContentPane().add(inpMoney);

		JRadioButton btnOptionAllFuel = new JRadioButton(
				"\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u0440\u0437\u0445\u043E\u0434 \u043B/100\u043A\u043C.");
		btnOptionAllFuel.setBounds(0, 0, 634, 23);
		frame.getContentPane().add(btnOptionAllFuel);

		JRadioButton optionCalculateFuel = new JRadioButton(
				"\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u0440\u0430\u0437\u0445\u043E\u0434 \u043B\u0438\u0442\u0440\u0438/\u043A\u043C.");
		optionCalculateFuel.setBounds(0, 70, 258, 23);
		frame.getContentPane().add(optionCalculateFuel);

		JTextPane infoInpMoney = new JTextPane();
		infoInpMoney.setText("km");
		infoInpMoney.setBounds(330, 102, 30, 23);

		inpLiters.setVisible(true);
		infoInpLiters.setVisible(true);
		inpLitersCalc.setVisible(false);
		inpMoney.setVisible(false);
		infoInputLitersCalc.setVisible(false);
		infoInpMoney.setVisible(false);

		frame.getContentPane().add(infoInpMoney);
		ButtonGroup group = new ButtonGroup();
		group.add(btnOptionAllFuel);
		group.add(optionCalculateFuel);
		btnOptionAllFuel.setSelected(true);
		btnOptionAllFuel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inpLiters.setVisible(true);
				infoInpLiters.setVisible(true);
				inpLitersCalc.setVisible(false);
				inpMoney.setVisible(false);
				infoInputLitersCalc.setVisible(false);
				infoInpMoney.setVisible(false);

			}
		});
		optionCalculateFuel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inpLiters.setVisible(false);
				inpLitersCalc.setVisible(true);
				inpMoney.setVisible(true);
				infoInputLitersCalc.setVisible(true);
				infoInpMoney.setVisible(true);
				infoInpLiters.setVisible(false);

			}
		});

		JTextPane distance = new JTextPane();
		distance.setText(
				"\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u0440\u0430\u0437\u0441\u0442\u043E\u044F\u043D\u0438\u0435");
		distance.setBounds(27, 164, 167, 23);
		frame.getContentPane().add(distance);

		JTextPane inpDistance = new JTextPane();
		inpDistance.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		inpDistance.setBounds(182, 164, 76, 23);
		frame.getContentPane().add(inpDistance);

		JTextPane infoDistance = new JTextPane();
		infoDistance.setText("km");
		infoDistance.setBounds(288, 174, 53, 23);
		frame.getContentPane().add(infoDistance);

		JTextPane priceFuel = new JTextPane();
		priceFuel.setText(
				"\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u0446\u0435\u043D\u0430 \u0433\u043E\u0440\u0438\u0432\u043E");
		priceFuel.setBounds(26, 217, 123, 23);
		frame.getContentPane().add(priceFuel);

		JTextPane inPriceFuel = new JTextPane();
		inPriceFuel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		inPriceFuel.setBounds(182, 217, 63, 23);
		frame.getContentPane().add(inPriceFuel);

		JTextPane infoPriceFuel = new JTextPane();
		infoPriceFuel.setText("\u043B\u0432");
		infoPriceFuel.setBounds(289, 233, 24, 23);
		frame.getContentPane().add(infoPriceFuel);
		JTextPane resultLiters = new JTextPane();
		resultLiters.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		resultLiters.setBounds(220, 391, 106, 29);
		frame.getContentPane().add(resultLiters);

		JTextPane resultMoney = new JTextPane();
		resultMoney.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		resultMoney.setBounds(219, 447, 94, 20);
		frame.getContentPane().add(resultMoney);

		JButton btnCalculate = new JButton("\u0418\u0417\u0427\u0418\u0421\u041B\u0418");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double distance, liters, price, ansFuel, ansPrice, inpKm, inpNLiters, ansAvrLiters;
				try {
					if (!optionCalculateFuel.isSelected()) {

						price = Double.parseDouble(inPriceFuel.getText());
						liters = Double.parseDouble(inpLiters.getText());
						distance = Double.parseDouble(inpDistance.getText());
						ansFuel = (distance / 100) * liters;
						ansPrice = ansFuel * price;
						resultLiters.setText(Double.toString(ansFuel));
						resultMoney.setText((Double.toString(ansPrice)));

					} else {
						inpKm = Double.parseDouble(inpMoney.getText());
						inpNLiters = Double.parseDouble(inpLitersCalc.getText());
						liters = inpNLiters*(100 / inpKm );
						distance = Double.parseDouble(inpDistance.getText());
						price = Double.parseDouble(inPriceFuel.getText());
						ansFuel = (distance / 100) * liters;
						ansPrice = ansFuel * price;
						resultLiters.setText(Double.toString(ansFuel));
						resultMoney.setText((Double.toString(ansPrice)));

					}

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Моля въведете коректни данни в полето");
				}
			}
		});
		btnCalculate.setBounds(198, 305, 221, 43);
		frame.getContentPane().add(btnCalculate);

		JTextPane infoFuel = new JTextPane();
		infoFuel.setText("\u0420\u0430\u0437\u0445\u043E\u0434 \u043D\u0430 \u0433\u043E\u0440\u0438\u0432\u043E:");
		infoFuel.setBounds(37, 391, 112, 29);
		frame.getContentPane().add(infoFuel);

		JTextPane infoCash = new JTextPane();
		infoCash.setText(
				"\u0426\u0435\u043D\u0430 \u043D\u0430 \u043F\u044A\u0442\u0443\u0432\u0430\u043D\u0435\u0442\u043E:");
		infoCash.setBounds(37, 447, 128, 29);
		frame.getContentPane().add(infoCash);

		JTextPane infoResultLiters = new JTextPane();
		infoResultLiters.setText("\u043B\u0438\u0442\u0440\u0430");
		infoResultLiters.setBounds(363, 391, 36, 29);
		frame.getContentPane().add(infoResultLiters);

		JTextPane infoResultMoney = new JTextPane();
		infoResultMoney.setText("\u043B\u0435\u0432\u0430.");
		infoResultMoney.setBounds(363, 447, 36, 23);
		frame.getContentPane().add(infoResultMoney);
	}
}

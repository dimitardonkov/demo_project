import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Component;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class FuelCalculator {

	protected static final String resultLiters = null;
	private JFrame frame;
	protected AbstractButton outAvrLiters;
	protected AbstractButton oinputDistance;
	protected AbstractButton inputPriceFuel;
	protected AbstractButton resultLV;
	protected AbstractButton resultFuel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuelCalculator window = new FuelCalculator();
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
	public FuelCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		frame.setJMenuBar(menuBar);

		JLabel label = DefaultComponentFactory.getInstance().createTitle(
				"\u0413\u043E\u0440\u0438\u0432\u0435\u043D \u043A\u0430\u043B\u043A\u0443\u043B\u0430\u0442\u043E\u0440");
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		menuBar.add(label);
		frame.getContentPane().setLayout(null);

		JRadioButton radioButton = new JRadioButton(
				"\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u043A\u043E\u043B\u043A\u043E \u043B\u0438\u0442\u0440\u0430 \u043D\u0430 100 \u0445\u0430\u0440\u0447\u0438 \u043A\u043E\u043B\u0430\u0442\u0430 \u0412\u0438.");
		radioButton.setActionCommand(
				"\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u043A\u043E\u043B\u043A\u043E \u043B\u0438\u0442\u0440\u0430 \u043D\u0430 100 \u0445\u0430\u0440\u0447\u0438 \u043A\u043E\u043B\u0430\u0442\u0430 \u0412\u0438.");
		radioButton.setBounds(6, 7, 339, 23);
		frame.getContentPane().add(radioButton);

		JRadioButton rdbtnNewRadioButton = new JRadioButton(
				"\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u043A\u043E\u043B\u043A\u043E \u043B\u0438\u0442\u0440\u0430 \u043D\u0430 \u0437\u0430 \u043A\u043E\u043B\u043A\u043E \u043A\u043C \u0445\u0430\u0440\u0447\u0438 \u043A\u043E\u043B\u0430\u0442\u0430 \u0412\u0438");
		rdbtnNewRadioButton.setBounds(6, 33, 339, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);

		JEditorPane litersInput = new JEditorPane();
		litersInput.setBackground(Color.RED);
		litersInput.setBounds(78, 63, 106, 20);
		frame.getContentPane().add(litersInput);

		JEditorPane kmInput = new JEditorPane();
		kmInput.setBackground(Color.RED);
		kmInput.setBounds(209, 63, 106, 20);
		frame.getContentPane().add(kmInput);

		JTextPane litersOutMain = new JTextPane();
		litersOutMain.setText(
				"\u0412\u0430\u0448\u0438\u044F \u0440\u0430\u0437\u0445\u043E\u0434 \u043D\u0430 100\u043A\u043C \u0435 :");
		litersOutMain.setBounds(24, 108, 160, 23);
		frame.getContentPane().add(litersOutMain);

		JTextPane litersOutDouble = new JTextPane();
		litersOutDouble.setBackground(Color.RED);
		litersOutDouble.setBounds(246, 111, 45, 20);
		frame.getContentPane().add(litersOutDouble);

		JTextPane litersOutString = new JTextPane();
		litersOutString.setText("\u043B\u0438\u0442\u0440\u0430");
		litersOutString.setBounds(332, 111, 36, 20);
		frame.getContentPane().add(litersOutString);

		JTextPane distance = new JTextPane();
		distance.setText(
				"\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u0440\u0430\u0437\u0441\u0442\u043E\u044F\u043D\u0438\u0435\u0442\u043E \u043D\u0430 \u043F\u044A\u0442\u0443\u0432\u0430\u043D\u0435\u0442\u043E (\u043A\u043C): ");
		distance.setBounds(10, 187, 302, 23);
		frame.getContentPane().add(distance);

		JTextPane priceFuelInput = new JTextPane();
		priceFuelInput.setText(
				"\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u0446\u0435\u043D\u0430 \u043D\u0430 \u0433\u043E\u0440\u0438\u0432\u043E\u0442\u043E(\u0432 \u043B\u0432):");
		priceFuelInput.setBounds(10, 240, 262, 20);
		frame.getContentPane().add(priceFuelInput);

		JButton btnCalculate = new JButton("\u0418\u0417\u0427\u0418\u0421\u041B\u0418");
		btnCalculate.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, num3, answerL, answerMoney;
				try {
					num1 = Integer.parseInt(outAvrLiters.getText());
					num2 = Integer.parseInt(oinputDistance.getText());
					num3 = Integer.parseInt(inputPriceFuel.getText());
					answerL = num1 * (num2 / 100);
					answerMoney = answerL * num3;
					resultFuel.setText(Integer.toString(answerL));
					resultLV.setText(Integer.toString(answerMoney));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Моля въведете коректна стойност!");
				}
			}
		});
		btnCalculate.setBounds(114, 297, 178, 46);
		frame.getContentPane().add(btnCalculate);

		JTextPane fuelResult = new JTextPane();
		fuelResult.setText(
				"\u0413\u043E\u0440\u0438\u0432\u043E\u0442\u043E \u043A\u043E\u0435\u0442\u043E \u0449\u0435 \r\n\u0438\u0437\u0440\u0430\u0437\u0445\u043E\u0434\u0438\u0442\u0435 \u0437\u0430 \u0432\u0430\u0448\u0435\u0442\u043E \r\n\u043F\u044A\u0442\u0443\u0432\u0430\u043D\u0435 \u0449\u0435 \u0435:");
		fuelResult.setBounds(10, 409, 198, 53);
		frame.getContentPane().add(fuelResult);

		JTextPane priceResult = new JTextPane();
		priceResult.setText(
				"\u0426\u0435\u043D\u0430\u0442\u0430 \u043D\u0430 \u0432\u0430\u0448\u0435\u0442\u043E \u043F\u044A\u0442\u0443\u0432\u0430\u043D\u0435 \u0449\u0435 \u0435:");
		priceResult.setBounds(10, 473, 198, 34);
		frame.getContentPane().add(priceResult);

		JTextPane outAvrLiters = new JTextPane();
		outAvrLiters.setBackground(Color.RED);
		outAvrLiters.setFont(new Font("Times New Roman", Font.BOLD, 12));
		outAvrLiters.setBounds(332, 11, 80, 19);
		frame.getContentPane().add(outAvrLiters);

		JTextPane inputDistance = new JTextPane();
		inputDistance.setBounds(304, 190, 61, 20);
		frame.getContentPane().add(inputDistance);

		JTextPane inputPriceFuel = new JTextPane();
		inputPriceFuel.setBounds(292, 240, 61, 20);
		frame.getContentPane().add(inputPriceFuel);

		JTextPane infoKm = new JTextPane();
		infoKm.setText("km");
		infoKm.setBounds(388, 187, 36, 20);
		frame.getContentPane().add(infoKm);

		JTextPane infoLv = new JTextPane();
		infoLv.setText("\u043B\u0435\u0432\u0430");
		infoLv.setBounds(382, 240, 30, 20);
		frame.getContentPane().add(infoLv);

		JLabel resultLiters = new JLabel("New label");
		resultLiters.setBackground(Color.RED);
		resultLiters.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
				System.out.println("hello!");
			}

			public void ancestorMoved(AncestorEvent arg0) {
			}

			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		resultLiters.setBounds(269, 408, 46, 14);
		frame.getContentPane().add(resultLiters);

		JLabel resultLV = new JLabel("New label");
		resultLV.setBackground(Color.RED);
		resultLV.setBounds(269, 473, 46, 14);
		frame.getContentPane().add(resultLV);

		JLabel lblNewLabel_2 = new JLabel("\u043B\u0438\u0442\u0440\u0430");
		lblNewLabel_2.setBounds(343, 409, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\u043B\u0435\u0432\u0430");
		lblNewLabel_3.setBounds(343, 473, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
	}
}

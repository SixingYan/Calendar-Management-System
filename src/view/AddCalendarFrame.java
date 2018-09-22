package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;

public class AddCalendarFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel label;
	private JTextField textField_6;
	private JLabel label_3;
	private JTextField textField_7;
	private JLabel label_4;
	private JTextField textField_8;
	private JLabel label_5;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel lblEndBy;
	private JTextField txtPersonal;
	private JLabel lblName;
	private JButton btnNewButton;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCalendarFrame frame = new AddCalendarFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddCalendarFrame() {
		setTitle("Add a new calendar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(16, 64, 39, 16);
		contentPane.add(lblYear);
		
		textField_1 = new JTextField();
		textField_1.setText("2018");
		textField_1.setColumns(10);
		textField_1.setBounds(57, 59, 66, 26);
		contentPane.add(textField_1);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setBounds(277, 152, 61, 16);
		contentPane.add(lblDuration);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(350, 147, 130, 26);
		contentPane.add(textField_2);
		
		JLabel lblStartBy = new JLabel("Start by");
		lblStartBy.setBounds(16, 190, 61, 16);
		contentPane.add(lblStartBy);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(89, 185, 130, 26);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Detail of A New Calendar");
		lblNewLabel.setBounds(6, 6, 470, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setText("09");
		textField.setColumns(10);
		textField.setBounds(183, 59, 66, 26);
		contentPane.add(textField);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(135, 64, 50, 16);
		contentPane.add(lblMonth);
		
		textField_4 = new JTextField();
		textField_4.setText("24");
		textField_4.setColumns(10);
		textField_4.setBounds(295, 59, 66, 26);
		contentPane.add(textField_4);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(254, 64, 39, 16);
		contentPane.add(lblDay);
		
		textField_5 = new JTextField();
		textField_5.setText("1000");
		textField_5.setColumns(10);
		textField_5.setBounds(414, 59, 66, 26);
		contentPane.add(textField_5);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(373, 64, 39, 16);
		contentPane.add(lblTime);
		
		label = new JLabel("Year");
		label.setBounds(16, 102, 39, 16);
		contentPane.add(label);
		
		textField_6 = new JTextField();
		textField_6.setText("2018");
		textField_6.setColumns(10);
		textField_6.setBounds(57, 97, 66, 26);
		contentPane.add(textField_6);
		
		label_3 = new JLabel("Month");
		label_3.setBounds(135, 102, 50, 16);
		contentPane.add(label_3);
		
		textField_7 = new JTextField();
		textField_7.setText("09");
		textField_7.setColumns(10);
		textField_7.setBounds(183, 97, 66, 26);
		contentPane.add(textField_7);
		
		label_4 = new JLabel("Day");
		label_4.setBounds(254, 102, 39, 16);
		contentPane.add(label_4);
		
		textField_8 = new JTextField();
		textField_8.setText("24");
		textField_8.setColumns(10);
		textField_8.setBounds(295, 97, 66, 26);
		contentPane.add(textField_8);
		
		label_5 = new JLabel("Time");
		label_5.setBounds(373, 102, 39, 16);
		contentPane.add(label_5);
		
		textField_9 = new JTextField();
		textField_9.setText("1000");
		textField_9.setColumns(10);
		textField_9.setBounds(414, 97, 66, 26);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(348, 180, 130, 26);
		contentPane.add(textField_10);
		
		lblEndBy = new JLabel("End by");
		lblEndBy.setBounds(275, 185, 61, 16);
		contentPane.add(lblEndBy);
		
		txtPersonal = new JTextField();
		txtPersonal.setText("Personal");
		txtPersonal.setColumns(10);
		txtPersonal.setBounds(89, 147, 130, 26);
		contentPane.add(txtPersonal);
		
		lblName = new JLabel("Name");
		lblName.setBounds(16, 152, 61, 16);
		contentPane.add(lblName);
		
		btnNewButton = new JButton("Confirm");
		btnNewButton.setBounds(363, 226, 117, 29);
		contentPane.add(btnNewButton);
		
		button = new JButton("Cancel");
		button.setBounds(244, 226, 117, 29);
		contentPane.add(button);
	}
}

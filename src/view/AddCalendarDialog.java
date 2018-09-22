package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class AddCalendarDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField txtPersonal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddCalendarDialog dialog = new AddCalendarDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddCalendarDialog() {
		setTitle("Create A New Calendar");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textField = new JTextField();
			textField.setText("2018");
			textField.setBounds(100, 88, 66, 26);
			contentPanel.add(textField);
			textField.setColumns(10);
			
			textField = new JTextField();
			textField.setText("09");
			textField.setColumns(10);
			textField.setBounds(217, 88, 66, 26);
			contentPanel.add(textField);
			
			textField = new JTextField();
			textField.setText("24");
			textField.setColumns(10);
			textField.setBounds(330, 88, 66, 26);
			contentPanel.add(textField);
			
			textField = new JTextField();
			textField.setText("2018");
			textField.setBounds(100, 148, 66, 26);
			contentPanel.add(textField);
			textField.setColumns(10);
			
			textField = new JTextField();
			textField.setText("10");
			textField.setColumns(10);
			textField.setBounds(217, 148, 66, 26);
			contentPanel.add(textField);
			
			textField = new JTextField();
			textField.setText("01");
			textField.setColumns(10);
			textField.setBounds(330, 148, 66, 26);
			contentPanel.add(textField);
			
			
			textField = new JTextField();
			textField.setText("1000");
			textField.setColumns(10);
			textField.setBounds(100, 194, 66, 26);
			contentPanel.add(textField);
			
			textField = new JTextField();
			textField.setText("1700");
			textField.setColumns(10);
			textField.setBounds(263, 194, 66, 26);
			contentPanel.add(textField);
			
		}
		{
			JLabel lblNewLabel = new JLabel("Calendar Name");
			lblNewLabel.setBounds(6, 30, 114, 16);
			contentPanel.add(lblNewLabel);
			
			
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Year");
			lblNewLabel_1.setBounds(62, 93, 44, 16);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtPersonal = new JTextField();
			txtPersonal.setText("Personal");
			txtPersonal.setBounds(122, 25, 130, 26);
			contentPanel.add(txtPersonal);
			txtPersonal.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Start from");
			lblNewLabel_2.setBounds(6, 58, 114, 16);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblMonth = new JLabel("Month");
			lblMonth.setBounds(172, 93, 44, 16);
			contentPanel.add(lblMonth);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Day");
			lblNewLabel_3.setBounds(286, 93, 32, 16);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Year");
			lblNewLabel_4.setBounds(62, 153, 61, 16);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Month");
			lblNewLabel_5.setBounds(172, 153, 61, 16);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Day");
			lblNewLabel_6.setBounds(286, 153, 61, 16);
			contentPanel.add(lblNewLabel_6);
		}
		{
			JLabel lblNewLabel_7 = new JLabel("End to");
			lblNewLabel_7.setBounds(6, 121, 61, 16);
			contentPanel.add(lblNewLabel_7);
		}
		{
			JLabel lblNewLabel_8 = new JLabel("Early Start by");
			lblNewLabel_8.setBounds(6, 199, 114, 16);
			contentPanel.add(lblNewLabel_8);
		}
		{
			JLabel lblNewLabel_9 = new JLabel("Last Start by");
			lblNewLabel_9.setBounds(172, 199, 125, 16);
			contentPanel.add(lblNewLabel_9);
		}
		{
			JLabel lblNewLabel_10 = new JLabel("Duration");
			lblNewLabel_10.setBounds(335, 30, 61, 16);
			contentPanel.add(lblNewLabel_10);
		}
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(392, 26, 52, 27);
		contentPanel.add(comboBox);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

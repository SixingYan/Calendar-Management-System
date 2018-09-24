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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectDateTimeDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private Boolean updated = false;
	public Boolean wasUpdated() {
		return updated;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SelectDateTimeDialog dialog = new SelectDateTimeDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SelectDateTimeDialog() {
		setTitle("Close Timeplot");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			
			textField = new JTextField();
			textField.setText("2018");
			textField.setBounds(89, 103, 66, 26);
			contentPanel.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setText("11");
			textField_1.setBounds(206, 103, 66, 26);
			textField_1.setColumns(10);
			contentPanel.add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setText("01");
			textField_2.setBounds(305, 103, 66, 26);
			textField_2.setColumns(10);
			contentPanel.add(textField_2);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Year");
			lblNewLabel_4.setBounds(51, 108, 61, 16);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Month");
			lblNewLabel_5.setBounds(161, 108, 61, 16);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Day");
			lblNewLabel_6.setBounds(275, 108, 61, 16);
			contentPanel.add(lblNewLabel_6);
		}
		{
			JLabel lblNewLabel = new JLabel("Day of Week");
			lblNewLabel.setBounds(51, 154, 85, 16);
			contentPanel.add(lblNewLabel);
		}
		{
			JComboBox DoWComboBox = new JComboBox();
			DoWComboBox.setBounds(134, 150, 66, 27);
			contentPanel.add(DoWComboBox);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Time of Day");
			lblNewLabel_1.setBounds(234, 154, 85, 16);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JComboBox TimeComboBox = new JComboBox();
			TimeComboBox.setBounds(315, 150, 71, 27);
			contentPanel.add(TimeComboBox);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Enter Date and/or Time");
			lblNewLabel_2.setBounds(51, 69, 151, 16);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						updated = true;
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						updated = false;
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}

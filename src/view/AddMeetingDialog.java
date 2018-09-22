package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;

public class AddMeetingDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtSixing;
	private JTextField txtFullerLab;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddMeetingDialog dialog = new AddMeetingDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddMeetingDialog() {
		setTitle("Create a New Meeting");
		setBounds(100, 100, 562, 343);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Select Time");
			lblNewLabel.setBounds(6, 25, 79, 16);
			contentPanel.add(lblNewLabel);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(90, 21, 135, 27);
			contentPanel.add(comboBox);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Enter or Select Person");
			lblNewLabel_1.setBounds(6, 106, 145, 16);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtSixing = new JTextField();
			txtSixing.setText("Jack");
			txtSixing.setBounds(163, 101, 130, 26);
			contentPanel.add(txtSixing);
			txtSixing.setColumns(10);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(305, 102, 112, 27);
			contentPanel.add(comboBox);
		}
		{
			JButton btnNewButton = new JButton("Add +");
			btnNewButton.setBounds(429, 101, 117, 29);
			contentPanel.add(btnNewButton);
		}
		{
			JList list = new JList();
			list.setBounds(6, 134, 537, 116);
			contentPanel.add(list);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Enter or Select Location");
			lblNewLabel_2.setBounds(6, 73, 160, 16);
			contentPanel.add(lblNewLabel_2);
		}
		{
			txtFullerLab = new JTextField();
			txtFullerLab.setText("Fuller Lab");
			txtFullerLab.setBounds(163, 68, 130, 26);
			contentPanel.add(txtFullerLab);
			txtFullerLab.setColumns(10);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(305, 69, 112, 27);
			contentPanel.add(comboBox);
		}
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

package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(192, 70, 416, 369);
		contentPane.add(list);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(646, 27, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("load");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(646, 91, 117, 29);
		contentPane.add(btnNewButton_1);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(156, 6, 1, 466);
		contentPane.add(verticalStrut);
		
		JButton btnNewButton_2 = new JButton("edit");
		btnNewButton_2.setBounds(646, 160, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("remove");
		btnNewButton_3.setBounds(646, 224, 117, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Show Date Schedule");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(6, 121, 177, 29);
		contentPane.add(btnNewButton_4);
		
		JTextPane txtpnCalendar = new JTextPane();
		txtpnCalendar.setEditable(false);
		txtpnCalendar.setText("Calendar");
		txtpnCalendar.setBounds(192, 26, 416, 32);
		contentPane.add(txtpnCalendar);
		
		JButton btnShowAllCalendars = new JButton("Show All Calendars");
		btnShowAllCalendars.setBounds(6, 65, 177, 29);
		contentPane.add(btnShowAllCalendars);
		
		JButton btnShowMonthSchedule = new JButton("Show Month Schedule");
		btnShowMonthSchedule.setBounds(6, 156, 177, 29);
		contentPane.add(btnShowMonthSchedule);
		
		JButton btnCloseTimeplot = new JButton("Close Timeplot");
		btnCloseTimeplot.setBounds(6, 197, 177, 29);
		contentPane.add(btnCloseTimeplot);
		
		
	}
}

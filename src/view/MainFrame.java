package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import controller.AddController;
import controller.LoadController;
import controller.RemoveController;
import model.Calendar;

import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Window.Type;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	public Hashtable<String, Calendar> curCalendarMgr;
	public String curCalendar;
	public int curTimeplot;
	public int curMeeting;
	public JList<String> textList;
	public JTextPane valueField;
	public JTextPane objectField;

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
		
		setTitle("EMS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textList = new JList();
		//textList.setListData(textArrList.toArray());
		textList.setBounds(192, 70, 416, 369);
		contentPane.add(textList);
		
		JButton btnNewButton = new JButton("Add +");
		btnNewButton.setBounds(645, 70, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Load =");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoadController(MainFrame.this).load();
			}
		});
		btnNewButton_1.setBounds(645, 134, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Remove -");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RemoveController(MainFrame.this).remove();
			}
		});
		btnNewButton_3.setBounds(645, 202, 117, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Show Date Schedule");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(6, 126, 177, 29);
		contentPane.add(btnNewButton_4);
		
		this.objectField = new JTextPane();
		objectField.setEditable(false);
		objectField.setText("Calendar");
		objectField.setBounds(192, 26, 208, 32);
		contentPane.add(objectField);
		
		this.valueField = new JTextPane();
		valueField.setEditable(false);
		valueField.setText("All");
		valueField.setBounds(399, 26, 208, 32);
		contentPane.add(valueField);

		JButton btnShowAllCalendars = new JButton("Show All Calendars");
		btnShowAllCalendars.setBounds(6, 70, 177, 29);
		contentPane.add(btnShowAllCalendars);
		
		JButton btnShowMonthSchedule = new JButton("Show Month Schedule");
		btnShowMonthSchedule.setBounds(6, 161, 177, 29);
		contentPane.add(btnShowMonthSchedule);
		
		JButton btnCloseTimeplot = new JButton("Close Timeplot");
		btnCloseTimeplot.setBounds(6, 202, 177, 29);
		contentPane.add(btnCloseTimeplot);
		
		JButton btnNewButton_5 = new JButton("Save");
		btnNewButton_5.setBounds(6, 338, 117, 29);
		contentPane.add(btnNewButton_5);
		
		JButton btnNew = new JButton("New");
		btnNew.setBounds(6, 297, 117, 29);
		contentPane.add(btnNew);
		
		JButton btnNewButton_6 = new JButton("Load");
		btnNewButton_6.setBounds(6, 379, 117, 29);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Quit");
		btnNewButton_7.setBounds(6, 420, 117, 29);
		contentPane.add(btnNewButton_7);
		
	}
	
	public MainFrame(Hashtable<String, Calendar> calendarMgr) {
		this.curCalendarMgr = calendarMgr;
		MainFrame();
	}
	
	public String getString(JTextPane field) {
		return field.getText();
	}

	public void setString(JTextPane field, String value) {
		field.setText(value);
	}
}

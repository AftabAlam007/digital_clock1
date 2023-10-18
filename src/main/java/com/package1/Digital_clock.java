package com.package1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class Digital_clock {

	private JFrame frame;
    JTextField textField_1;
	JTextField textField_2;
	JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Digital_clock window = new Digital_clock();
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
	public Digital_clock() {
		
		//IntelliJTheme.setup(Digital_clock.class.getResourceAsStream("dark theams.json"));
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 546, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		
		Font f = null;
		try {
			 f = Font.createFont(Font.TRUETYPE_FONT,Digital_clock.class.getResourceAsStream("/digital-7.ttf"));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192), new Color(0, 120, 215), new Color(0, 0, 255)));
		panel.setBounds(0, 0, 546, 300);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		// Visible Test field counting digit
		
		textField = new JTextField("06");
		textField.setBackground(new Color(0, 255, 255));
		textField.setFont(f.deriveFont(Font.BOLD,100f));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setEditable(false);
		textField.setBounds(26, 84, 119, 113);
		panel.add(textField);
		textField.setColumns(10);
		
		// Visible Test field_1 counting digit
		
		textField_1= new JTextField("06");
		textField_1.setBackground(new Color(0, 255, 255));
		textField_1.setFont(f.deriveFont(Font.BOLD,100f));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setEditable(false);
		textField_1.setBounds(201, 84, 119, 112);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		// Visible Test field_2 counting digit
		
		textField_2 = new JTextField("06");
		textField_2.setBackground(new Color(0, 255, 255));
		textField_2.setFont(f.deriveFont(Font.BOLD,100f));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setEditable(false);
		textField_2.setBounds(385, 84, 119, 112);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		// Visible : for this line
		
		JLabel lblNewLabel = new JLabel(":");
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setFont(f.deriveFont(Font.BOLD,100f));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(146, 84, 55, 112);
		panel.add(lblNewLabel);
		
		// Visible : for this line
		
		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setFont(f.deriveFont(Font.BOLD,100f));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(319, 84, 68, 112);
		panel.add(lblNewLabel_1);
		
		new ClockThread(this);
		
	}
}

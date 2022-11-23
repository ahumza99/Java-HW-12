/*
 * Author: Humza Ahmad
 * Program: GUI.java
 * Purpose: Creates a login GUI that takes a username and password
 * 			and validates whether it is correct or not
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	
	private static JLabel userlabel;
	private static JLabel passLabel;
	private static JLabel message;
	private static JPasswordField passField;
	private static JButton button;
	private static JTextField userField;

	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		panel.setLayout(null);
		
		userlabel = new JLabel("Username");
		userlabel.setBounds(10, 20, 80, 25);
		panel.add(userlabel);
		
		passLabel = new JLabel("Password");
		passLabel.setBounds(10, 60, 80, 25);
		panel.add(passLabel);
		
		userField= new JTextField(20);
		userField.setBounds(100, 20, 165, 25);
		panel.add(userField);
		
		passField = new JPasswordField();
		passField.setBounds(100, 50, 165, 25);
		panel.add(passField);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		message  = new JLabel("");
		message.setBounds(10, 110, 300, 25);
		panel.add(message);
		message.setText(null);
		
		frame.setVisible(true);

	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String user = userField.getText();
		@SuppressWarnings("deprecation")
		String password = passField.getText();
		
		System.out.println(user +", "  + password);
		
		if(user.equals("Humza") && password.equals("humzaiscool")) {
			message.setText("Login Successful :)");
			
		}
		
		else {
			message.setText("Login failed :(");
		}
	}

}

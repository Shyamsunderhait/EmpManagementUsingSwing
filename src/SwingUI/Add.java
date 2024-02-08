package SwingUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Operations.Emp;
import Operations.Implementation;

public class Add extends JFrame {
	JLabel label1, label2, label3;
	JTextField field1, field2, field3;
	JButton button;

	public Add() {
		setLayout(new FlowLayout());
		label1 = new JLabel("ID");
		label2 = new JLabel("Name");
		label3 = new JLabel("Salary");
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		field3 = new JTextField(10);
		button = new JButton("Save");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Emp emp = new Emp();
				emp.setId(Integer.parseInt(field1.getText()));
				emp.setName(field2.getText());
				emp.setSalary(Double.parseDouble(field3.getText()));

				Implementation impletmentations = new Implementation();
				impletmentations.addEmp(emp);
				System.out.println("data saved successfully");
				dispose();

			}
		});

		add(label1);
		add(field1);
		add(label2);
		add(field2);
		add(label3);
		add(field3);
		add(button);
		setSize(400, 400);
		setVisible(true);
	}
}

package SwingUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Operations.Emp;
import Operations.Implementation;

public class Update extends JFrame {
	JLabel id, name, salary;
	JTextField tid, tname, tsalary;
	Button button;

	public Update() {
		setLayout(new FlowLayout());
		id = new JLabel("Id");
		name = new JLabel("Name");
		salary = new JLabel("Salary");
		tid = new JTextField(10);
		tname = new JTextField(10);
		tsalary = new JTextField(10);
		button = new Button();
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Emp emp = new Emp();
				emp.setId(Integer.parseInt(tid.getText()));
				emp.setName(tname.getText());
				emp.setSalary(Double.parseDouble(tsalary.getText()));
				Implementation implementation = new Implementation();
				implementation.updateEmp(emp);
				System.out.println("Data update successfully");
				dispose();
			}
		});
		add(id);
		add(tid);
		add(name);
		add(tname);
		add(salary);
		add(tsalary);
		add(button);
		setSize(400,400);
		setVisible(true);
		
	}
}

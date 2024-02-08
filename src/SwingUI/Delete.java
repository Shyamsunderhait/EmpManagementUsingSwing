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

public class Delete extends JFrame{
	JLabel id;
	JTextField tid;
	JButton button;
	public Delete() {
		setLayout(new FlowLayout());
		id = new JLabel("Enter Id");
		tid = new JTextField(10);
		button = new JButton("Delete");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Emp emp = new Emp();
				emp.setId(Integer.parseInt(tid.getText()));
				Implementation implementation = new Implementation();
				implementation.deleteEmp(emp);
				System.out.println("deleted succesfully");
				dispose();
		
			}
		});
		
		add(id);
		add(tid);
		add(button);
		setSize(400,400);
		setVisible(true);
		
		
		
		
	}
}

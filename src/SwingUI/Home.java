package SwingUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Home extends JFrame {
	JMenuBar bar;
	JMenu menu1, menu2, menu3, menu4;
	JMenuItem item1, item2, item3, item4,item5;

	public Home() {
		setLayout(new FlowLayout());
		bar = new JMenuBar();
		menu1 = new JMenu("Employee");
		menu2 = new JMenu("Empoyee details");
		menu3 = new JMenu("Accounts");
		menu4 = new JMenu("utilities");

		item1 = new JMenuItem("Add");

		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Add();
			}
		});

		item2 = new JMenuItem("Update");
		item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Update();
			}
		});
		item3 = new JMenuItem("Delete");
		item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Delete();
			}
		});
		item4 = new JMenuItem("Show");
		item4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					new Show();
			}
		});
		item5 = new JMenuItem("Search");
		item4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					new Search();
			}
		});

		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
		bar.add(menu4);
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu2.add(item4);
		menu2.add(item5);
		add(bar);
		setSize(400, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Home();
	}

}

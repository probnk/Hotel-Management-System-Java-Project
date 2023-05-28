import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

class Menu extends JFrame implements ActionListener {
	private JLabel label1,label2;
	private JPanel panel;
	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem menuitem1,menuitem2,menuitem3,menuitem4,menuitem5,menuitem6;
	private Image img,temp;
	private ImageIcon image;
	private Login l;
	private Customer_Registeration c;
	private Add_Room a;
	private Checkin checkin;
	private Checkout checkout;
	private Employee employee;
	
	void Show() {
		setTitle("Menu");
		
		panel= new JPanel();
		panel.setBackground(new Color(0x1E2D39));
		panel.setBounds(0,0,1550,850);
		panel.setVisible(true);
		
		label1 = new JLabel("WELCOME TO OUR HOTEL MANAGEMENT SYSTEM");
		label1.setForeground(Color.ORANGE);
		label1.setFont(new Font("Arial",Font.PLAIN,24));
		label1.setBounds(50,50,300,50);
		panel.add(label1);
		
		menubar = new JMenuBar();
		menu = new JMenu("Hotel");
		menuitem1= new JMenuItem("Customer Registeration");
		menu.add(menuitem1);
		
		
		menuitem2= new JMenuItem("Manage Room");
		menu.add(menuitem2);
		menubar.add(menu);
		
		menuitem3= new JMenuItem("Room Checkin");
		menu.add(menuitem3);
		menubar.add(menu);
		
		menuitem4= new JMenuItem("Room Checkout");
		menu.add(menuitem4);
		menubar.add(menu);
		
		menuitem5= new JMenuItem("Employee Data");
		menu.add(menuitem5);
		menubar.add(menu);
		
		menuitem6= new JMenuItem("Log Out");
		menu.add(menuitem6);
		menubar.add(menu);
		
		image = new ImageIcon("five star hotel.JPG");
		img=image.getImage();
		temp=img.getScaledInstance(1500, 500, Image.SCALE_SMOOTH);
		image=new ImageIcon(temp);
		
		label2 = new JLabel(image);
		label2.setText("HOTEL MANAGEMENT SYSTEM");
		label2.setIcon(image);
		label2.setHorizontalTextPosition(JLabel.CENTER);
		label2.setVerticalTextPosition(JLabel.BOTTOM);
		label2.setForeground(Color.ORANGE);
		label2.setFont(new Font("Bell MT",Font.BOLD,24));
		label2.setIconTextGap(10);
		label2.setBounds(0, 0,1550, 800);
		
		c = new Customer_Registeration();
		a = new Add_Room();
		l = new Login();
		checkin = new Checkin();
		checkout = new Checkout();
		employee  = new Employee();
		
		menuitem1.addActionListener(this); 
		menuitem2.addActionListener(this); 
		menuitem3.addActionListener(this); 
		menuitem4.addActionListener(this);
		menuitem5.addActionListener(this);
		menuitem6.addActionListener(this); 
		
		add(label2);
		add(menubar);
		setJMenuBar(menubar);
		add(panel);
		setBounds(-10, 0, 1550, 900);
		setLayout(null);
		setVisible(true);
		setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==menuitem1) {
			c.add();
			a.dispose();
			checkin.dispose();
			checkout.dispose();
			employee.dispose();
			l.dispose();
			dispose();
		}
		else if(e.getSource()==menuitem2) {
			a.Room();	
			c.dispose();
			checkin.dispose();
			checkout.dispose();
			employee.dispose();
			l.dispose();
			dispose();
		}
		else if(e.getSource()==menuitem3) {
			checkin.entry();
			a.dispose();
			c.dispose();
			employee.dispose();
			checkout.dispose();
			l.dispose();
			dispose();
			}
		else if(e.getSource()==menuitem4) {
			checkout.exit();
			a.dispose();
			checkin.dispose();
			employee.dispose();
			c.dispose();
			l.dispose();
			dispose();
			}
		else if(e.getSource()==menuitem5) {
			employee.details();
			a.dispose();
			checkin.dispose();
			checkout.dispose();
			l.dispose();
			dispose();
			}
		else if(e.getSource()==menuitem6) {
			l.login();
			a.dispose();
			checkin.dispose();
			employee.dispose();
			checkout.dispose();
			dispose();
		}
	}
}

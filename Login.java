import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login implements ActionListener{
JFrame f;
JPanel p;
JLabel lusrnm,lpass;
JTextField tusrnm;
JPasswordField jpass;
JButton blogin,bexit;

public Login()
{
	JFrame f=new JFrame("LOGIN PAGE");
	f.setSize(300,300);
	f.setVisible(true);
	
	JPanel p=new JPanel();
	
	lusrnm=new JLabel("Username");
	lpass=new JLabel("Password");
	
	tusrnm=new JTextField(10);
	
	jpass=new JPasswordField(10);
	
	blogin=new JButton("Login");
	bexit=new JButton("EXIT");
	
	GridLayout gl=new GridLayout();
	f.setLayout(gl);
	p.setLayout(new GridLayout(3,3));
	
	f.add(p);
	p.add(lusrnm);
	p.add(tusrnm);
	p.add(lpass);
	p.add(jpass);
	p.add(blogin);
	p.add(bexit);
	
	blogin.addActionListener(this);
	bexit.addActionListener(this);
}
	public static void main(String[] args) {
		new Login();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==blogin)
		{
			if(tusrnm.getText().equals("kshitij"))
			{
				if(jpass.getText().equals("kys"))
				{
					new RegistrationForm();
				}
			}
		}
		
		if(e.getSource()==bexit)
		{
			System.exit(0);
		}
		
	}

}

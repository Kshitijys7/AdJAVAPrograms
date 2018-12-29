import javax.swing.*;
import java.awt.*;
public class RegistrationForm {
JFrame f1;
JPanel p1,p2;
JLabel lrno,lpass,laddr,lcity,lstate,lbackground;
JTextField trno;
JPasswordField jpass;
JTextArea jaddr;
JComboBox jcity;
JList lststate;
JButton bsave,bdelete,bupdate,bsearch,bprev,bnext,breset,bexit;
ImageIcon ii;

public RegistrationForm()
{
	f1=new JFrame("Registration Form");
	f1.setVisible(true);
	f1.setSize(400,400);
	
	
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	
	p1.setLayout(new GridLayout(5,2,5,5));
	p1.setBackground(new Color(60,70,40,30));
	p1.setBorder(BorderFactory.createLineBorder(Color.black));
	//p2.setBorder(BorderFactory.createLineBorder(Color.black));
	p2.setLayout(new GridLayout(2,4,5,5));
	p1.setBounds(375,90,400,400);
	p2.setBounds(375,490,400,100);
	//lbackground=new JLabel(new ImageIcon("C:\\Users\\Kshitij\\Downloads\\Emma-Watson-HD-Wallpapers-1080p-PIC-WPHR24547.jpg"));
	
	lrno=new JLabel("Registration no.");
	lrno.setFont(new Font("Chiller",Font.BOLD,35));
	lpass=new JLabel("Password");
	lpass.setFont(new Font("Chiller",Font.BOLD,35));
	laddr=new JLabel("Address");
	laddr.setFont(new Font("Chiller",Font.BOLD,35));
	lcity=new JLabel("City");
	lcity.setFont(new Font("Chiller",Font.BOLD,35));
	lstate=new JLabel("State");
	lstate.setFont(new Font("Chiller",Font.BOLD,35));
	
	trno=new JTextField(10);
	trno.setBorder(BorderFactory.createLineBorder(Color.black));
	jpass=new JPasswordField(10);
	jpass.setBorder(BorderFactory.createLineBorder(Color.black));
	jaddr=new JTextArea(10,5);
	jaddr.setBorder(BorderFactory.createLineBorder(Color.black));

	String carr[]= {"Pune","Mumbai"};
	jcity=new JComboBox(carr);
	jcity.setBorder(BorderFactory.createLineBorder(Color.black));
	
	String sarr[]= {"Maharashtra","Chattisgarh"};
	lststate=new JList(sarr);
	lststate.setBorder(BorderFactory.createLineBorder(Color.black));

	bsave=new JButton("Save");
	bdelete=new JButton("Delete");
	bupdate=new JButton("Update");
	bsearch=new JButton("Search");
	bprev=new JButton("<<");
	bnext=new JButton(">>");
	breset=new JButton("C");
	bexit=new JButton("EXIT");

	
	f1.add(p1);
	f1.add(p2);
	BorderLayout bl=new BorderLayout(5,5);
	f1.setLayout(bl);
	//f1.add(p1,BorderLayout.CENTER);
	//f1.add(p2,BorderLayout.SOUTH);
	
	
	p1.add(lrno);
	p1.add(trno);
	p1.add(lpass);
	p1.add(jpass);
	p1.add(laddr);
	p1.add(jaddr);
	p1.add(lcity);
	p1.add(jcity);
	p1.add(lstate);
	p1.add(lststate);
	
	p2.add(bsave);
	p2.add(bdelete);
	p2.add(bupdate);
	p2.add(bsearch);
	p2.add(bprev);
	p2.add(bnext);
	p2.add(breset);
	p2.add(bexit);
	
	ii=new ImageIcon("C:\\\\Users\\\\Kshitij\\\\Downloads\\\\untitled.png");
	lbackground = new JLabel(ii); 
	lbackground.setBounds(0,0,1000,1000);
	f1.add(lbackground);
	
}
public static void main(String[] args) {
	new RegistrationForm();

}
}

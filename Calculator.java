import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calculator implements ActionListener
{
JFrame frm;
JLabel lno1,lno2,lans;
JPanel pnl;
JTextField tno1,tno2,tans;
JButton badd,bsub,bmul,bdiv,bmod,breset,bsin,bcos,btan,bexit;

public Calculator()
{
	frm=new JFrame("Calculator");
	frm.setSize(400,400);
	frm.setVisible(true);
	
	pnl=new JPanel();
	frm.add(pnl);
	pnl.setBackground(Color.CYAN);
	GridLayout gl=new GridLayout(8,2);
	pnl.setLayout(gl);
	
	lno1=new JLabel("Number 1:");
	lno2=new JLabel("Number 2:");
	lans=new JLabel("Output:");
	
	tno1=new JTextField(10);
	tno2=new JTextField(10);
	tans=new JTextField(10);
	
	Font f1=new Font("Times New Roman",Font.BOLD+Font.ITALIC, 24);
	tans.setFont(f1);
	lans.setFont(f1);
	tans.setForeground(Color.RED);
	tans.setBackground(Color.yellow);

	
	badd=new JButton("+");
	bsub=new JButton("-");
	bmul=new JButton("*");
	bdiv=new JButton("/");
	bmod=new JButton("MOD");
	breset=new JButton("C");
	bsin=new JButton("sin");
	bcos=new JButton("cos");
	btan=new JButton("tan");
	bexit=new JButton("EXIT");
	
	pnl.add(lno1);
	pnl.add(tno1);
	pnl.add(lno2);
	pnl.add(tno2);
	pnl.add(lans);
	pnl.add(tans);
	pnl.add(badd);
	pnl.add(bsub);
	pnl.add(bmul);
	pnl.add(bdiv);
	pnl.add(bmod);
	pnl.add(breset);
	pnl.add(bsin);
	pnl.add(bcos);
	pnl.add(btan);
	pnl.add(bexit);
	
	badd.addActionListener(this);
	bsub.addActionListener(this);
	bmul.addActionListener(this);
	bdiv.addActionListener(this);
	bmod.addActionListener(this);
	breset.addActionListener(this);
	bsin.addActionListener(this);
	bcos.addActionListener(this);
	btan.addActionListener(this);
	bexit.addActionListener(this);

}

public void actionPerformed(ActionEvent e) 
{
	if(e.getSource()==badd)
	{
		String s1=tno1.getText();
		String s2=tno2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int ans=n1+n2;
		tans.setText(Integer.toString(ans));
	}
	
	if(e.getSource()==bsub)
	{
		String s1=tno1.getText();
		String s2=tno2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int ans=n1-n2;
		tans.setText(Integer.toString(ans));
	}
    
	if(e.getSource()==bmul)
	{
		String s1=tno1.getText();
		String s2=tno2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int ans=n1*n2;
		tans.setText(Integer.toString(ans));
	}
	
	if(e.getSource()==bdiv)
	{
		String s1=tno1.getText();
		String s2=tno2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int ans=n1/n2;
		tans.setText(Integer.toString(ans));
	}
	
	if(e.getSource()==bmod)
	{
		String s1=tno1.getText();
		String s2=tno2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int ans=n1%n2;
		tans.setText(Integer.toString(ans));
	}
	
	if(e.getSource()==breset)
	{
		tno1.setText("");
		tno2.setText("");
		tans.setText("");
	}
	
	if(e.getSource()==bsin)
	{
		double ans=Math.sin(Integer.parseInt(tno1.getText()));
		tans.setText(Double.toString(ans));
	}
	
	if(e.getSource()==bcos)
	{
		double ans=Math.cos(Integer.parseInt(tno1.getText()));
		tans.setText(Double.toString(ans));
	}
	
	if(e.getSource()==btan)
	{
		double ans=Math.tan(Integer.parseInt(tno1.getText()));
		tans.setText(Double.toString(ans));
	}
	
	if(e.getSource()==bexit)
	{
		System.exit(0);
	}
}
}

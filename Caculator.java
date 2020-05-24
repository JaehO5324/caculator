package «„¿Á»£2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Caculator extends JFrame {

	String[] arrStr = {"1","2","3","-","4","5","6","+","7","8","9","*","0","/","caculate"};
	
	
	Container cp;
	public Caculator() {
		
		
		cp=getContentPane();
		JTextField tf= new JTextField();
		JButton[]  num = new JButton[15];
		//JButton[]  pl = new JButton[4];
		JPanel panel = new JPanel();
		setVisible(true);
    setTitle("caculator");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(350,500);
	for(int i=0;i<=14;i++)
	{
		
		num[i]=new JButton(""+arrStr[i]);
		panel.add(num[i]);
//		if(i%4==0)
//		{
//		
//		}
//		else
//		{
//		num[i]=new JButton(""+i);
//		num[i].setSize(1,1);
//		panel.add(num[i]);
//		num[i].addActionListener(null);
//		}
	}
//	pl[4]=new JButton("+");
//	panel.add(pl[0]);
//	pl[8]=new JButton("-");
//	panel.add(pl[1]);
//	pl[12]=new JButton("*");
//	panel.add(pl[2]);
//	pl[16]=new JButton("/");
//	panel.add(pl[3]);
cp.setLayout(new BorderLayout());
panel.setLayout(new GridLayout(4,3));
cp.add(panel,"Center");

cp.add(tf,"North");

	}
	public static void main(String[]args)
	{
		new Caculator();
	}

}

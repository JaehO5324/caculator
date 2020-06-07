package «„¿Á»£2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Caculator extends JFrame {

	String[] arrStr = { "1", "2", "3", "-", "4", "5", "6", "+", "7", "8", "9", "*", "0", "/", "caculate", "reset",
			"del" };

	Container cp;

	Boolean isCalBtn = false;
	String q,n;
	String []p=new String[50];
	int rs,ct=0;
	
	public Caculator() {

		cp = getContentPane();
		JTextArea tf = new JTextArea();
		JButton[] num = new JButton[17];
		// JButton[] pl = new JButton[4];
		JPanel panel = new JPanel();
		setVisible(true);
		tf.setPreferredSize(new Dimension(200, 200));
		tf.setLineWrap(true);
		tf.setWrapStyleWord(true);

		setTitle("caculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 500);
		for (int i = 0; i <= 16; i++) {
			final int s = i + 1;
			num[i] = new JButton("" + arrStr[i]);
			panel.add(num[i]);

			num[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					if (e.getActionCommand().equals("-")) {
						if(!isCalBtn){
							isCalBtn = true;
							if (!tf.getText().equals("")) {
								 q="-";
					
							
								 p[ct]=tf.getText();
									System.out.println(p[ct]);
									ct++;
									tf.setText("");
							}
						}
						
						System.out.println(e.getActionCommand());
					} else if (e.getActionCommand().equals("+")) {
						if(!isCalBtn){
							isCalBtn = true;
							if (!tf.getText().equals("")) {
								tf.setText(tf.getText() + e.getActionCommand());
							}
						}
						
					} else if (e.getActionCommand().equals("*")) {
						if(!isCalBtn){
							isCalBtn = true;
							if (!tf.getText().equals("")) {
								tf.setText(tf.getText() + e.getActionCommand());
							}
						}
						
					} else if (e.getActionCommand().equals("/")) {
						if(!isCalBtn){
							isCalBtn = true;
							if (!tf.getText().equals("")) {
								tf.setText(tf.getText() + e.getActionCommand());
							}
						}
						
						
					} else if (e.getActionCommand().equals("caculate")) {
						isCalBtn = true;
					         if(q.equals("-"))
					         {
					        	 p[ct]=tf.getText();
									System.out.println(p[ct]);
									ct++;
					        	
					        	 
					        	 rs=Integer.parseInt(p[0])-Integer.parseInt(p[1]);
					        	 tf.setText(rs+"");
					         }
					} else if (e.getActionCommand().equals("reset")) {

					} else if (e.getActionCommand().equals("del")) {

					} else {
						isCalBtn = false;
						
						tf.setText(tf.getText() + e.getActionCommand());
						
					}

					// if(s>0&&s<4)
					// System.out.println(s+"");
					//
					// if(s>4&&s<8)
					// System.out.println((s-1)+"");
					//
					// if(s>8&&s<12)
					// System.out.println((s-2)+"");
					//
					// if(s>12)
					// System.out.println((s-3)+"");
					//
				}
			});

			// if(i%4==0)
			// {
			//
			// }
			// else
			// {
			// num[i]=new JButton(""+i);
			// num[i].setSize(1,1);
			// panel.add(num[i]);
			// num[i].addActionListener(null);
			// }
		}
		// pl[4]=new JButton("+");
		// panel.add(pl[0]);
		// pl[8]=new JButton("-");
		// panel.add(pl[1]);
		// pl[12]=new JButton("*");
		// panel.add(pl[2]);
		// pl[16]=new JButton("/");
		// panel.add(pl[3]);
		cp.setLayout(new BorderLayout());
		panel.setLayout(new GridLayout(5, 3));
		cp.add(panel, "Center");

		cp.add(tf, "North");

	}

	public static void main(String[] args) {
		new Caculator();
	}

}

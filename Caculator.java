package «„¿Á»£2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Caculator extends JFrame {

	String[] arrStr = { "1", "2", "3", "-", "4", "5", "6", "+", "7", "8", "9", "*", "0", "/", "caculate", "del",
			".","reset" };

	Container cp;

	Boolean isCalBtn = false;
	String q[] = new String[1000], n;
	String[] p = new String[50];
	asdasdasdasd

	int ct = 0, ntext = 1,ncal=1;
	double rs, fs;
	JTextArea tf = new JTextArea();
	
	public Caculator() {

		String rts[] = new String[1000];
		cp = getContentPane();
		
		JButton[] num = new JButton[17];
		// JButton[] pl = new JButton[4];
		JPanel panel = new JPanel();
		setVisible(true);
		tf.setPreferredSize(new Dimension(200, 200));
		tf.setLineWrap(true);
		tf.setWrapStyleWord(true);
		tf.setEditable(false);
		String ss;
		setTitle("caculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 500);
		setResizable(false);
		for (int i = 0; i <= 16; i++) {
			final int s = i + 1;
			num[i] = new JButton("" + arrStr[i]);
			panel.add(num[i]);

			num[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					if (e.getActionCommand().equals("-")) {
						cal("-" , e);

						System.out.println(e.getActionCommand());
					} else if (e.getActionCommand().equals("+")) {
						cal("+" , e);

					} else if (e.getActionCommand().equals("*")) {
						cal("*" , e);

					} else if (e.getActionCommand().equals("/")) {
						cal("/" , e);

					}
					else if(e.getActionCommand().equals("."))
					{
						if (!isCalBtn) {
							isCalBtn = true;
							if (!tf.getText().equals("")) {
								tf.setText(tf.getText() + e.getActionCommand());
							}
							ntext = 1;
                             ncal=1;
						}
					}
					
					else if (e.getActionCommand().equals("caculate")) {
						if(ncal==0)
						{
                         ncal=1;
						String get[] = tf.getText().toString().split("(?<=[*/+-])|(?=[*/+-])");

						ArrayList<String> arrayList = new ArrayList<>();

						for (int j = 0; j < get.length; j++) {
							arrayList.add(get[j]);
							System.out.print(arrayList.get(j) + "\n");
						}

						for (int j = 0; j < arrayList.size(); j++) {
							if (arrayList.get(j).equals("*")) {

								double result = Double.parseDouble(arrayList.get(j - 1))
										* Double.parseDouble(arrayList.get(j + 1));
								arrayList.set(j - 1, result + "");
								arrayList.remove(j);
								arrayList.remove(j);
								for (int k = 0; k < arrayList.size(); k++) {
									System.out.print(arrayList.get(k) + "\n");
								}
							} else if (arrayList.get(j).equals("/")) {

								double result = Double.parseDouble(arrayList.get(j - 1))
										/ Double.parseDouble(arrayList.get(j + 1));
								arrayList.set(j - 1, result + "");
								arrayList.remove(j);
								arrayList.remove(j);
								for (int k = 0; k < arrayList.size(); k++) {
									System.out.print(arrayList.get(k) + "\n");
								}
							}
						}
						for (int j = 0; j < arrayList.size(); j++) {
							if (arrayList.get(j).equals("+")) {

								double result = Double.parseDouble(arrayList.get(j - 1))
										+ Double.parseDouble(arrayList.get(j + 1));
								arrayList.set(j - 1, result + "");
								arrayList.remove(j);
								arrayList.remove(j);
								for (int k = 0; k < arrayList.size(); k++) {
									System.out.print(arrayList.get(k) + "\n");
								}
							} else if (arrayList.get(j).equals("-")) {

								double result = Double.parseDouble(arrayList.get(j - 1))
										- Double.parseDouble(arrayList.get(j + 1));
								arrayList.set(j - 1, result + "");
								arrayList.remove(j);
								arrayList.remove(j);
								int y = 0;
								for (int k = 0; k < arrayList.size(); k++) {
									System.out.print(arrayList.get(k) + "\n");
									y++;
								}
							}

						}

						tf.setText(arrayList.get(0) + "");
						ntext = 0;

					}
					}

					else if (e.getActionCommand().equals("reset")) {
						tf.setText("");
						ntext = 1;
						ncal=1;
					} else if (e.getActionCommand().equals("del")) {
						String es;
						es = tf.getText().substring(tf.getText().toString().length() - 1,
								tf.getText().toString().length());
						tf.setText(tf.getText().substring(0, tf.getText().toString().length() - 1));

						if (es.equals("+") || es.equals("-") || es.equals("*") || es.equals("/")) {
							ct--;
						}

					} else {
						isCalBtn = false;
						ncal=0;
						if (ntext == 1)
							tf.setText(tf.getText() + e.getActionCommand());

						else if (ntext == 0) {
							tf.setText("");
							tf.setText(tf.getText() + e.getActionCommand());
							ntext = 1;
						}

					}

				}
			});

		}

		{

		}
		cp.setLayout(new BorderLayout());
		panel.setLayout(new GridLayout(5, 3));
		cp.add(panel, "Center");

		cp.add(tf, "North");

	}
	
	public void cal(String get , ActionEvent e){
		if (!isCalBtn) {
			isCalBtn = true;
			if (!tf.getText().equals("")) {
				q[ct] = get;

				p[ct] = tf.getText();

				ct++;

				tf.setText(tf.getText() + e.getActionCommand());
			}
			ntext = 1;
			ncal=1;
		}
	}

	public static void main(String[] args) {
		new Caculator();
	}

}

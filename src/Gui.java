import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Gui extends JFrame{
private JLabel item1;
private JTextField a;
private JTextField b;
private JTextField c;
private JTextField solutions;
private JButton ShowSols;
private String solutions1 = "";
private boolean works = true;
private Quadratic quad = new Quadratic();
	public Gui() {
		
		super("Variable entry");
		setLayout(new FlowLayout());
		
		
		item1 = new JLabel("Enter a,b,c");
		add(item1);
		
		
		a = new JTextField(10);
		add(a);
		
		b = new JTextField(10);
		add(b);
		
		c = new JTextField(10);
		add(c);
		
		ShowSols = new JButton("Show Solutions");
		add(ShowSols);
	

		
		ButtonHandler buttonHandle = new ButtonHandler();
		ShowSols.addActionListener(buttonHandle);
		
		
		

		
	}
	

	
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			
			try {
		
			quad.setA(Double.parseDouble(a.getText()));
			quad.setB(Double.parseDouble(b.getText()));
			quad.setC(Double.parseDouble(c.getText()));
				solutions1 = quad.getSolutions();
			JOptionPane.showMessageDialog(null, solutions1);
			
			} catch (Exception e) {
				
				JOptionPane.showMessageDialog(null, "Please enter legit numbers");
			}
			
			
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

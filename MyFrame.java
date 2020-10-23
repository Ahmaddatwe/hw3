import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	public MyFrame (String S) {
		super(S);
		
		//JFrame frame = new JFrame("My First GUI");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
		
		this.getContentPane().setLayout(new FlowLayout());
		button1 = new JButton("Press");
		this.getContentPane().add(button1);
		button2 = new JButton("Button 2");
		this.getContentPane().add(button2);
		button1.setToolTipText("Press me and watch what happens");
		//this.getContentPane().add(BorderLayout.NORTH,button1);
		//this.getContentPane().add(BorderLayout.SOUTH,button);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if (b==button1)
		{
			JOptionPane.showConfirmDialog(this,  "You  clicked  Button1","Button  Click  Event  Handler",  JOptionPane.PLAIN_MESSAGE);
		}	
		else if (b==button2)
		{
		JOptionPane.showConfirmDialog(this,  "You  clicked  Button2","Button  Click  Event  Handler", JOptionPane.PLAIN_MESSAGE);
		}
	}
}


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class views {

	private JFrame frame;
	public static JButton add ;
	public static JButton sub ;
	public static JButton mul ;
	public static JButton mod ;
	public static JButton sqrt ;
	public static JButton div ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					views window = new views();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public views() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		add = new JButton("Add");
		add.setBounds(238, 29, 109, 50);
		frame.getContentPane().add(add);
		
		sub = new JButton("sub");
		sub.setBounds(68, 29, 109, 50);
		frame.getContentPane().add(sub);
		
		mul = new JButton("mult");
		mul.setBounds(238, 92, 109, 50);
		frame.getContentPane().add(mul);
		
		mod = new JButton("Mod");
		mod.setBounds(68, 92, 109, 50);
		frame.getContentPane().add(mod);
		
		div = new JButton("div");
		div.setBounds(68, 155, 109, 50);
		frame.getContentPane().add(div);
		
		sqrt = new JButton("sqrt");
		sqrt.setBounds(238, 155, 109, 50);
		frame.getContentPane().add(sqrt);
		Controller control = new Controller();
		add.addActionListener((ActionListener) control);
		sub.addActionListener((ActionListener) control);
		mul.addActionListener((ActionListener) control);
		mod.addActionListener((ActionListener) control);
		div.addActionListener((ActionListener) control);
		sqrt.addActionListener((ActionListener) control);
	}
}
		

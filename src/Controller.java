import java.awt.event.ActionEvent;
//import java.math.*;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Controller implements ActionListener{

	Model m = new Model() ;
//	views v = new views() ;
	@Override
	public void actionPerformed(ActionEvent e) {
		String input1;
		int num1;
		while(true){
		input1 = JOptionPane.showInputDialog("Enter the 1st number plz !");
		
	/*	char c[] =input1.toCharArray();
		for (int i = 0 ; i < c.length;i++){
		boolean con = Character.isDigit(c[i]);
		if (con=false) {JOptionPane.showMessageDialog(null, "plz just Enter a digit");
		break;}*/
		try{
			num1 = Integer.parseInt(input1);
			break;
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Please enter a number");
			continue;
		}
		}
	//	int num1 = Integer.parseInt(input1);
		
		String input2 ;
		int num2 =0;
	//	int num2 = Integer.parseInt(input2);
	/*	char c1[] =input2.toCharArray();
		for (int i = 0 ; i < c1.length;i++){
		boolean con = Character.isDigit(c1[i]);
		if (con=false) {JOptionPane.showMessageDialog(null, "plz just Enter a digit");
		break;}
		}*/
		if (!(e.getSource()== views.sqrt))while(true){
			input2 = JOptionPane.showInputDialog("Enter the 2nd number plz !");
			try{
				num2 = Integer.parseInt(input2);
				break;
			}
			catch(Exception ex){
				JOptionPane.showMessageDialog(null, "Please enter a number");
				continue;
			}
		}//while
		
		
		if (e.getSource() == views.add){
			double result =	m.add(num1, num2);
			JOptionPane.showMessageDialog(null,"The answer is:       "+result);
		}
		else if(e.getSource() == views.sub){
			double result =	m.sub(num1, num2);
			JOptionPane.showMessageDialog(null,"The answer is:       "+result);
		}
		else if(e.getSource() == views.div){
	//		try{
			double result =	m.div(num1, num2);
			if(num2 ==0){
				JOptionPane.showMessageDialog(null, "Please make sure that the 2nd number is not equal 0");
		
			}
			else 
				JOptionPane.showMessageDialog(null,"The answer is:       "+result);
	//		}
	//		catch(ArithmeticException ex){
	//				JOptionPane.showMessageDialog(null, "Please make sure that the 2nd number is not equal 0");
	//		}
		}
		else if(e.getSource() == views.sqrt){
		//	try{
			double result =	m.sr(num1);
			if(num1 >= 0)
			JOptionPane.showMessageDialog(null,"The answer is:       "+result);
			else JOptionPane.showMessageDialog(null, "Please enter a number that is > 0");
		//	}
		//	catch(ArithmeticException ex){
		//			JOptionPane.showMessageDialog(null, "Please enter a number that is > 0");
		//	}
		}
		else if (e.getSource() == views.mul){
			double result =	m.Mul(num1, num2);
			JOptionPane.showMessageDialog(null,"The answer is:       "+result);
		}
		 if(e.getSource() == views.mod){
	//		try{
			double result =	m.mod(num1, num2);
			if(num2 !=0)
			JOptionPane.showMessageDialog(null,"The answer is:       "+result);
			else JOptionPane.showMessageDialog(null, "Please make sure that the 2nd number is not equal 0");
	//		}
	//		catch(ArithmeticException ex){
	//				JOptionPane.showMessageDialog(null, "Please make sure that the 2nd number is not equal 0");
	//		}
		
		
	
	}//Action
	
	
	

	}
	}

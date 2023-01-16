import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculatrice extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lbTitre = new JLabel("Ma Calculatrice");
	private JButton btNb1 = new JButton("1");
	private JButton btNb2 = new JButton("2");
	private JButton btNb3 = new JButton("3");
	private JButton btNb4 = new JButton("4");
	private JButton btNb5 = new JButton("5");
	private JButton btNb6 = new JButton("6");
	private JButton btNb7 = new JButton("7");
	private JButton btNb8 = new JButton("8");
	private JButton btNb9 = new JButton("9");
	private JButton btNb0 = new JButton("0");
	private JButton btPlus = new JButton("+");
	private JButton btMoins = new JButton("-");
	private JButton btFois = new JButton("*");
	private JButton btDiv = new JButton("/");
	private JButton btPoint = new JButton(".");
	private JButton btAC = new JButton("AC");
	private JButton btEgal = new JButton("=");
	private JTextField txtResultat= new JTextField();
	
	private float save = 0;
	private String resultat ="";
	private String operation ="";
	private float recup = 0;
	private String finale= "";
	
	
	
	public Calculatrice() {
		this.setTitle("Ma Calculatrice");
		this.setBounds(200,150,400,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(152,151,148));
		this.setResizable(false);
		this.setLayout(null);
		this.txtResultat.setEditable(false);
		//FONT
		lbTitre.setFont(new Font("Serif",Font.ITALIC, 20));
		btNb1.setFont( new Font("Bookman Old Style",Font.BOLD, 15));
		btNb2.setFont( new Font("Bookman Old Style",Font.BOLD, 15));
		btNb3.setFont( new Font("Bookman Old Style",Font.BOLD, 15));
		btNb4.setFont( new Font("Bookman Old Style",Font.BOLD, 15));
		btNb5.setFont( new Font("Bookman Old Style",Font.BOLD, 15));
		btNb6.setFont( new Font("Bookman Old Style",Font.BOLD, 15));
		btNb7.setFont( new Font("Bookman Old Style",Font.BOLD, 15));
		btNb8.setFont( new Font("Bookman Old Style",Font.BOLD, 15));
		btNb9.setFont( new Font("Bookman Old Style",Font.BOLD, 15));
		btNb0.setFont( new Font("Bookman Old Style",Font.BOLD, 15));
		btAC.setFont( new Font("Bookman Old Style",Font.BOLD, 18));
		btAC.setForeground(Color.GREEN);
		btEgal.setFont( new Font("Bookman Old Style",Font.BOLD, 20));
		btEgal.setForeground(Color.RED);
		btPoint.setFont( new Font("Bookman Old Style",Font.BOLD, 20));
		btPlus.setFont( new Font("Bookman Old Style",Font.BOLD, 20));
		btPlus.setForeground(Color.RED);
		btMoins.setFont( new Font("Bookman Old Style",Font.BOLD, 20));
		btMoins.setForeground(Color.RED);
		btDiv.setFont( new Font("Bookman Old Style",Font.BOLD, 20));
		btDiv.setForeground(Color.RED);
		btFois.setFont( new Font("Bookman Old Style",Font.BOLD, 20));
		btFois.setForeground(Color.RED);
		
		
		//PLACE DES OBJETS
		this.lbTitre.setBounds(120,10,180,90);
		this.add(this.lbTitre);
		
		this.btAC.setBounds(30,400,70,50);
		this.add(this.btAC);
		this.btNb0.setBounds(100,400,70,50);
		this.add(this.btNb0);
		this.btPoint.setBounds(170,400,70,50);
		this.add(this.btPoint);
		this.btEgal.setBounds(240,400,70,50);
		this.add(this.btEgal);
		//---
		this.btNb1.setBounds(30,350,70,50);
		this.add(this.btNb1);
		this.btNb2.setBounds(100,350,70,50);
		this.add(this.btNb2);
		this.btNb3.setBounds(170,350,70,50);
		this.add(this.btNb3);
		this.btPlus.setBounds(240,350,70,50);
		this.add(this.btPlus);
		//---
		this.btNb4.setBounds(30,300,70,50);
		this.add(this.btNb4);
		this.btNb5.setBounds(100,300,70,50);
		this.add(this.btNb5);
		this.btNb6.setBounds(170,300,70,50);
		this.add(this.btNb6);
		this.btMoins.setBounds(240,300,70,50);
		this.add(this.btMoins);
		//---
		this.btNb7.setBounds(30,250,70,50);
		this.add(this.btNb7);
		this.btNb8.setBounds(100,250,70,50);
		this.add(this.btNb8);
		this.btNb9.setBounds(170,250,70,50);
		this.add(this.btNb9);
		this.btFois.setBounds(240,250,70,50);
		this.add(this.btFois);
		//---
		this.btDiv.setBounds(240,200,70,50);
		this.add(this.btDiv);
		//---
		this.txtResultat.setBounds(20,100,350,40);
		this.add(this.txtResultat);
		// rendre les boutons ecoutables / cliquables
		this.btAC.addActionListener(this);
		this.btNb1.addActionListener(this);
		this.btNb2.addActionListener(this);
		this.btNb3.addActionListener(this);
		this.btNb4.addActionListener(this);
		this.btNb5.addActionListener(this);
		this.btNb6.addActionListener(this);
		this.btNb7.addActionListener(this);
		this.btNb8.addActionListener(this);
		this.btNb9.addActionListener(this);
		this.btNb0.addActionListener(this);
		this.btPoint.addActionListener(this);
		this.btEgal.addActionListener(this);
		this.btPlus.addActionListener(this);
		this.btMoins.addActionListener(this);
		this.btFois.addActionListener(this);
		this.btDiv.addActionListener(this);

		
		this.setVisible(true);
	}
	
	private Font Font(String string, int bold, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		
	Calculatrice maCalc = new Calculatrice();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.btAC) {
			this.txtResultat.setText("");
		}
		else if (e.getSource() == this.btNb0) {
			this.txtResultat.setText(this.txtResultat.getText()+ this.btNb0.getText());
		}
		else if (e.getSource() == this.btNb1) {
			this.txtResultat.setText(this.txtResultat.getText()+ this.btNb1.getText());
		}
		else if (e.getSource() == this.btNb2) {
			this.txtResultat.setText(this.txtResultat.getText()+ this.btNb2.getText());
		}
		else if (e.getSource() == this.btNb3) {
			this.txtResultat.setText(this.txtResultat.getText()+ this.btNb3.getText());
		}
		else if (e.getSource() == this.btNb4) {
			this.txtResultat.setText(this.txtResultat.getText()+ this.btNb4.getText());
		}
		else if (e.getSource() == this.btNb5) {
			this.txtResultat.setText(this.txtResultat.getText()+ this.btNb5.getText());
		}
		else if (e.getSource() == this.btNb6) {
			this.txtResultat.setText(this.txtResultat.getText()+ this.btNb6.getText());
		}
		else if (e.getSource() == this.btNb7) {
			this.txtResultat.setText(this.txtResultat.getText()+ this.btNb7.getText());
		}
		else if (e.getSource() == this.btNb8) {
			this.txtResultat.setText(this.txtResultat.getText()+ this.btNb8.getText());
		}
		else if (e.getSource() == this.btNb9) {
			this.txtResultat.setText(this.txtResultat.getText()+ this.btNb9.getText());
		}
		else if (e.getSource() == this.btPoint) {
			this.txtResultat.setText(this.txtResultat.getText()+ this.btPoint.getText());
		}
		else if (e.getSource() == this.btPlus) {
			 
			this.save = Float.parseFloat(this.txtResultat.getText());
			this.txtResultat.setText("");
			this.operation = this.btPlus.getText();
			
		}
		else if (e.getSource() == this.btMoins) {
			 
			this.save = Float.parseFloat(this.txtResultat.getText());
			this.txtResultat.setText("");
			this.operation = this.btMoins.getText();
			
		}else if (e.getSource() == this.btFois) {
			 
			this.save = Float.parseFloat(this.txtResultat.getText());
			this.txtResultat.setText("");
			this.operation = this.btFois.getText();
			
		}else if (e.getSource() == this.btDiv) {
			 
			this.save = Float.parseFloat(this.txtResultat.getText()) ;
			this.txtResultat.setText("");
			this.operation = this.btDiv.getText();
			
		}
		else if(e.getSource() == this.btEgal) {
				 this.recup = Float.parseFloat(this.txtResultat.getText());
				 switch(this.operation) {
				 case ("/") : 
					 recup= this.save /recup;
				 	 break;
				 case ("+") : 
					recup=recup + this.save;
			 		break;
				 case ("-") : 
					recup=recup -this.save;
					break;
				 case ("*") : 
					recup=recup *this.save;
				 	break;
				 }
				 this.txtResultat.setText(recup +"");
				 
				
				
			
			}
			
		
			
		}
		
		
		
	}



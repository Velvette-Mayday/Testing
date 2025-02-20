package br_com_view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br_com_controle.Calculos;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {
	
	Calculos c1 = new Calculos();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 575);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbScreen = new JLabel("");
		lbScreen.setForeground(new Color(255, 255, 255));
		lbScreen.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		lbScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		lbScreen.setBackground(new Color(255, 255, 255));
		lbScreen.setBounds(48, 42, 465, 81);
		contentPane.add(lbScreen);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lbScreen.setText(lbScreen.getText() + "7");
				
			}
		});
		btnSeven.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnSeven.setForeground(new Color(255, 128, 128));
		btnSeven.setBounds(48, 133, 85, 81);
		contentPane.add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbScreen.setText(lbScreen.getText() + "8");
			}
		});
		btnEight.setForeground(new Color(255, 128, 128));
		btnEight.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnEight.setBounds(143, 133, 85, 81);
		contentPane.add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbScreen.setText(lbScreen.getText() + "9");
			}
		});
		btnNine.setForeground(new Color(255, 128, 128));
		btnNine.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnNine.setBounds(238, 133, 85, 81);
		contentPane.add(btnNine);
		
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbScreen.setText(lbScreen.getText() + "4");
			}
		});
		btnFour.setForeground(new Color(255, 128, 128));
		btnFour.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnFour.setBounds(48, 224, 85, 81);
		contentPane.add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbScreen.setText(lbScreen.getText() + "5");
			}
		});
		btnFive.setForeground(new Color(255, 128, 128));
		btnFive.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnFive.setBounds(143, 224, 85, 81);
		contentPane.add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbScreen.setText(lbScreen.getText() + "6");
			}
		});
		btnSix.setForeground(new Color(255, 128, 128));
		btnSix.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnSix.setBounds(238, 224, 85, 81);
		contentPane.add(btnSix);
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbScreen.setText(lbScreen.getText() + "1");
			}
		});
		btnOne.setForeground(new Color(255, 128, 128));
		btnOne.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnOne.setBounds(48, 315, 85, 81);
		contentPane.add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbScreen.setText(lbScreen.getText() + "2");
			}
		});
		btnTwo.setForeground(new Color(255, 128, 128));
		btnTwo.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnTwo.setBounds(143, 315, 85, 81);
		contentPane.add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbScreen.setText(lbScreen.getText() + "3");
			}
		});
		btnThree.setForeground(new Color(255, 128, 128));
		btnThree.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnThree.setBounds(238, 315, 85, 81);
		contentPane.add(btnThree);
		
		JButton btnZero = new JButton("0\r\n");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbScreen.setText(lbScreen.getText() + "0");
			}
		});
		btnZero.setForeground(new Color(255, 128, 128));
		btnZero.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnZero.setBounds(48, 406, 180, 81);
		contentPane.add(btnZero);
		
		JButton btnMultiplication = new JButton("x");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.setNum1(Double.valueOf(lbScreen.getText()));
				c1.setOp("*");
				lbScreen.setText("");
			}
		});
		btnMultiplication.setForeground(new Color(255, 128, 128));
		btnMultiplication.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnMultiplication.setBounds(238, 406, 85, 81);
		contentPane.add(btnMultiplication);
		
		JButton btnSubtraction = new JButton("-");
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.setNum1(Double.valueOf(lbScreen.getText()));
				c1.setOp("-");
				lbScreen.setText("");
			}
		});
		btnSubtraction.setForeground(new Color(255, 128, 128));
		btnSubtraction.setFont(new Font("Trebuchet MS", Font.PLAIN, 56));
		btnSubtraction.setBounds(333, 224, 85, 81);
		contentPane.add(btnSubtraction);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.setNum1(Double.valueOf(lbScreen.getText()));
				c1.setOp("/");
				lbScreen.setText("");
			}
		});
		btnDivision.setForeground(new Color(255, 128, 128));
		btnDivision.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnDivision.setBounds(333, 133, 85, 81);
		contentPane.add(btnDivision);
		
		JButton btnAdding = new JButton("+\r\n");
		btnAdding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.setNum1(Double.valueOf(lbScreen.getText()));
				c1.setOp("+");
				lbScreen.setText("");
			}
		});
		btnAdding.setForeground(new Color(255, 128, 128));
		btnAdding.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnAdding.setBounds(333, 315, 85, 172);
		contentPane.add(btnAdding);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.setNum2(Double.valueOf(lbScreen.getText()));
				lbScreen.setText("" + c1.calcular());
			}
		});
		btnEquals.setForeground(new Color(255, 128, 128));
		btnEquals.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnEquals.setBounds(429, 224, 85, 172);
		contentPane.add(btnEquals);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbScreen.setText("");
				c1.setNum1(0);
				c1.setNum2(0);
				c1.setOp("");
				
			}
		});
		btnClear.setForeground(new Color(255, 128, 128));
		btnClear.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnClear.setBounds(428, 133, 85, 81);
		contentPane.add(btnClear);
		
		JButton btnMultiplication_1 = new JButton(".");
		btnMultiplication_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbScreen.setText(lbScreen.getText() + ".");
			}
		});
		btnMultiplication_1.setForeground(new Color(255, 128, 128));
		btnMultiplication_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 52));
		btnMultiplication_1.setBounds(428, 406, 85, 81);
		contentPane.add(btnMultiplication_1);
		
		
		
		
	}
}

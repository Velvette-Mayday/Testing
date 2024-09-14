package br.com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.controle.Controle;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {
	
	Controle c1 = new Controle();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jTnome;
	private JTextField jTpreco;
	private JTextField jTquantidade;

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
		setBounds(100, 100, 570, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jTnome = new JTextField();
		jTnome.setForeground(new Color(128, 0, 0));
		jTnome.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		jTnome.setBounds(228, 10, 162, 25);
		contentPane.add(jTnome);
		jTnome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Insira o nome do produto:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 10, 198, 25);
		contentPane.add(lblNewLabel);
		
		jTpreco = new JTextField();
		jTpreco.setForeground(new Color(128, 0, 0));
		jTpreco.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		jTpreco.setColumns(10);
		jTpreco.setBounds(228, 40, 162, 25);
		contentPane.add(jTpreco);
		
		JLabel lblInsiraOPreo = new JLabel("Insira o preço do produto:");
		lblInsiraOPreo.setForeground(new Color(255, 255, 255));
		lblInsiraOPreo.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblInsiraOPreo.setBounds(10, 40, 198, 25);
		contentPane.add(lblInsiraOPreo);
		
		jTquantidade = new JTextField();
		jTquantidade.setForeground(new Color(128, 0, 0));
		jTquantidade.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		jTquantidade.setColumns(10);
		jTquantidade.setBounds(228, 75, 162, 25);
		contentPane.add(jTquantidade);
		
		JLabel lblInsiraONmero = new JLabel("Insira o número de produtos:");
		lblInsiraONmero.setForeground(new Color(255, 255, 255));
		lblInsiraONmero.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblInsiraONmero.setBounds(10, 73, 215, 25);
		contentPane.add(lblInsiraONmero);
		
		JLabel lblValorTotalDo = new JLabel("Valor total do item:");
		lblValorTotalDo.setForeground(Color.WHITE);
		lblValorTotalDo.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblValorTotalDo.setBounds(10, 142, 191, 25);
		contentPane.add(lblValorTotalDo);
		
		JLabel lblItemComMaior = new JLabel("Item com maior valor:");
		lblItemComMaior.setForeground(Color.WHITE);
		lblItemComMaior.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblItemComMaior.setBounds(10, 177, 215, 25);
		contentPane.add(lblItemComMaior);
		
		JLabel lblMdiaDosPreos = new JLabel("Média dos preços:");
		lblMdiaDosPreos.setForeground(Color.WHITE);
		lblMdiaDosPreos.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblMdiaDosPreos.setBounds(10, 212, 191, 25);
		contentPane.add(lblMdiaDosPreos);
		
		JLabel jLvalorTotal = new JLabel("0.00");
		jLvalorTotal.setForeground(Color.WHITE);
		jLvalorTotal.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		jLvalorTotal.setBounds(212, 142, 191, 25);
		contentPane.add(jLvalorTotal);
		
		JLabel jLitemMaiorValor = new JLabel(".");
		jLitemMaiorValor.setForeground(Color.WHITE);
		jLitemMaiorValor.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		jLitemMaiorValor.setBounds(228, 177, 215, 25);
		contentPane.add(jLitemMaiorValor);
		
		JLabel jLmedia = new JLabel("0.00");
		jLmedia.setForeground(Color.WHITE);
		jLmedia.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		jLmedia.setBounds(188, 212, 215, 25);
		contentPane.add(jLmedia);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				c1.setNome(jTnome.getText());
				c1.setPreco(jTpreco.getText());
				c1.setQuantidade(jTquantidade.getText());
				
				jLitemMaiorValor.setText(""+ c1.getMaiorValor());
				jLmedia.setText(""+ c1.getMedia());
				jLvalorTotal.setText(""+ c1.getValorTotal());
				
			}
		});
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnNewButton.setBounds(419, 28, 127, 49);
		contentPane.add(btnNewButton);
	}
}

package br.com.visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.controle.Controle;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MinhaTela extends JFrame {
	
	Controle c= new Controle();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jTnome;
	private JTextField jTquantidade;
	private JTextField jTvalor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MinhaTela frame = new MinhaTela();
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
	public MinhaTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do item:");
		lblNewLabel.setBounds(25, 55, 113, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("quantidade:");
		lblNewLabel_1.setBounds(25, 80, 95, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor:");
		lblNewLabel_2.setBounds(25, 105, 95, 14);
		contentPane.add(lblNewLabel_2);
		
		jTnome = new JTextField();
		jTnome.setBounds(109, 52, 86, 20);
		contentPane.add(jTnome);
		jTnome.setColumns(10);
		
		jTquantidade = new JTextField();
		jTquantidade.setBounds(109, 80, 86, 20);
		contentPane.add(jTquantidade);
		jTquantidade.setColumns(10);
		
		jTvalor = new JTextField();
		jTvalor.setBounds(109, 105, 86, 20);
		contentPane.add(jTvalor);
		jTvalor.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Valor Individual");
		lblNewLabel_3.setBounds(25, 165, 80, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel jLvalorIndividual = new JLabel("0.0");
		jLvalorIndividual.setBounds(35, 190, 46, 14);
		contentPane.add(jLvalorIndividual);
		
		JLabel lblNewLabel_4 = new JLabel("Item mais caro");
		lblNewLabel_4.setBounds(163, 165, 80, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel jLMaisCaro = new JLabel("Nenhum");
		jLMaisCaro.setBounds(173, 190, 46, 14);
		contentPane.add(jLMaisCaro);
		
		JLabel jLValorMCaro = new JLabel("0.0");
		jLValorMCaro.setBounds(183, 215, 46, 14);
		contentPane.add(jLValorMCaro);
		
		JLabel lblNewLabel_5 = new JLabel("Média");
		lblNewLabel_5.setBounds(309, 165, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel jLMedia = new JLabel("0.0");
		jLMedia.setBounds(309, 190, 46, 14);
		contentPane.add(jLMedia);
		
		JButton jBarmazenar = new JButton("armazenar");
		jBarmazenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setNome(jTnome.getText());
				c.setQuantidade(Double.valueOf(jTquantidade.getText()));
				c.setValor(Double.valueOf(jTvalor.getText()));
				
				jLMedia.setText("" +c.CalcularMedia());
				jLMaisCaro.setText(c.MaiorNome());
				jLvalorIndividual.setText("" + c.ValorUnidade());
				jLValorMCaro.setText("" + c.MaiorValor());
			}
		});
		jBarmazenar.setBounds(254, 76, 89, 23);
		contentPane.add(jBarmazenar);
	}
}

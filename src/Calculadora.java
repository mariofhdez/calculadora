import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public double primerNumero;
	public double segundoNumero;
	public String operador;
	public double resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 390);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(82, 109, 130));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.setLocationRelativeTo(null);
		
		JLabel campo = new JLabel("");
		campo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		campo.setOpaque(true);
		campo.setBackground(new Color(238, 238, 238));
		campo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		campo.setHorizontalAlignment(SwingConstants.TRAILING);
		campo.setBounds(10, 10, 230, 30);
		contentPane.add(campo);
		
		Font fuente = new Font("Tahoma", Font.PLAIN, 20);
		
		//NUMEROS
		JButton btn7 = new JButton("7");
		btn7.setFont(fuente);
		btn7.setBounds(10, 110, 50, 50);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(fuente);
		btn8.setBounds(70, 110, 50, 50);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(130, 110, 50, 50);
		btn9.setFont(fuente);
		contentPane.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 170, 50, 50);
		btn4.setFont(fuente);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(70, 170, 50, 50);
		btn5.setFont(fuente);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(130, 170, 50, 50);
		btn6.setFont(fuente);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 230, 50, 50);
		btn1.setFont(fuente);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(70, 230, 50, 50);
		btn2.setFont(fuente);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(130, 230, 50, 50);
		btn3.setFont(fuente);
		contentPane.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 290, 110, 50);
		btn0.setFont(fuente);
		contentPane.add(btn0);
		
		JButton btnPunto = new JButton(".");
		btnPunto.setBounds(130, 290, 50, 50);
		btnPunto.setFont(fuente);
		contentPane.add(btnPunto);
		
		//OPERACIONES
		JButton btnLimpiar = new JButton("C");
		btnLimpiar.setFont(fuente);
		btnLimpiar.setBounds(10, 50, 50, 50);
		contentPane.add(btnLimpiar);
		
		JButton btnDividir = new JButton("/");
		btnDividir.setFont(fuente);
		btnDividir.setBounds(70, 50, 50, 50);
		contentPane.add(btnDividir);
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.setFont(fuente);
		btnMultiplicar.setBounds(130, 50, 50, 50);
		contentPane.add(btnMultiplicar);
		
		JButton btnRestar = new JButton("-");
		btnRestar.setFont(fuente);
		btnRestar.setBounds(190, 50, 50, 50);
		contentPane.add(btnRestar);
		
		JButton btnSumar = new JButton("+");
		btnSumar.setFont(fuente);
		btnSumar.setBounds(190, 110, 50, 110);
		contentPane.add(btnSumar);
		
		JButton btnTotal = new JButton("=");
		btnTotal.setFont(fuente);
		btnTotal.setBounds(190, 230, 50, 110);
		contentPane.add(btnTotal);
		
		//ACTION PERFORMED
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo.setText(campo.getText()+"0");
			}
		});
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo.setText(campo.getText()+"1");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo.setText(campo.getText()+"2");
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo.setText(campo.getText()+"3");
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo.setText(campo.getText()+"4");
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo.setText(campo.getText()+"5");
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo.setText(campo.getText()+"6");
			}
		});
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo.setText(campo.getText()+"7");
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo.setText(campo.getText()+"8");
			}
		});
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo.setText(campo.getText()+"9");
			}
		});
		
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!campo.getText().contains(".")) {
					if(campo.getText().equals(""))campo.setText("0");
					campo.setText(campo.getText()+".");
				}
			}
		});
		
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo.setText("");
			}
		});
		
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNumero = Double.parseDouble(campo.getText());
				campo.setText("");
				operador = "+";
			}
		});
		
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNumero = Double.parseDouble(campo.getText());
				campo.setText("");
				operador = "-";
			}
		});
		
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNumero = Double.parseDouble(campo.getText());
				campo.setText("");
				operador = "*";
			}
		});
		
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNumero = Double.parseDouble(campo.getText());
				campo.setText("");
				operador = "/";
			}
		});
		
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundoNumero = Double.parseDouble(campo.getText());
				
				switch(operador) {
				case"+":
					resultado = primerNumero + segundoNumero;
					break;
				case"-":
					resultado = primerNumero - segundoNumero;
					break;
				case"*":
					resultado = primerNumero * segundoNumero;
					break;
				case"/":
					resultado = primerNumero / segundoNumero;
					break;
				}
				if(operador.equals("/")&& segundoNumero==0) {
					campo.setText("División entre cero.");
				}else {
					campo.setText(sinCero(resultado));
				}
			}
		});
		
	}
	
	public String sinCero(double resultado) {
		String retorno = "";
		
		retorno = Double.toString(resultado);
		
		if(resultado%1==0) {
			retorno = retorno.substring(0, retorno.length()-2);
		}
		
		return retorno;
	}

}

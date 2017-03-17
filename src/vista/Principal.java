package vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAnimal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldAnimal = new JTextField();
		textFieldAnimal.setBounds(160, 47, 86, 20);
		contentPane.add(textFieldAnimal);
		textFieldAnimal.setColumns(10);
		
		JLabel labelAnimal = new JLabel("");
		labelAnimal.setBounds(175, 118, 46, 14);
		contentPane.add(labelAnimal);
		
		JButton buttonMostrar = new JButton("Mostrar");
		buttonMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		buttonMostrar.setBounds(106, 176, 89, 23);
		contentPane.add(buttonMostrar);
		
		JButton buttonGuardar = new JButton("Guardar");
		buttonGuardar.setBounds(235, 176, 89, 23);
		contentPane.add(buttonGuardar);
	}
}

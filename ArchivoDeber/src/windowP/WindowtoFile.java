package windowP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import manageFile.FileManager;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class WindowtoFile extends JFrame {

	private JPanel contentPane;
	private JTextField nombreA;
	private JTextField dirA;
	private JTextField day;
	private JTextField month;
	private JTextField year;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowtoFile frame = new WindowtoFile();
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
	public WindowtoFile() {
		setTitle("Ingreso Datos");
		FileManager ventana= new FileManager();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 192);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("INGRESO");
		btn.setBounds(110, 120, 89, 23);
		contentPane.add(btn);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(10, 36, 61, 14);
		contentPane.add(lblDireccion);
		
		nombreA = new JTextField();
		nombreA.setBounds(96, 8, 103, 20);
		contentPane.add(nombreA);
		nombreA.setColumns(10);
		
		dirA = new JTextField();
		dirA.setBounds(96, 33, 103, 20);
		contentPane.add(dirA);
		dirA.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Fecha de Nacimiento");
		lblNewLabel.setBounds(10, 67, 121, 14);
		contentPane.add(lblNewLabel);
		
		day = new JTextField();
		day.setBounds(136, 64, 46, 20);
		contentPane.add(day);
		day.setColumns(10);
		
		month = new JTextField();
		month.setBounds(192, 64, 46, 20);
		contentPane.add(month);
		month.setColumns(10);
		
		year = new JTextField();
		year.setBounds(248, 64, 74, 20);
		contentPane.add(year);
		year.setColumns(10);
		
		JLabel lblDa = new JLabel("D\u00EDa");
		lblDa.setHorizontalAlignment(SwingConstants.CENTER);
		lblDa.setBounds(146, 95, 29, 14);
		contentPane.add(lblDa);
		
		JLabel mon = new JLabel("Mes");
		mon.setHorizontalAlignment(SwingConstants.CENTER);
		mon.setBounds(202, 95, 29, 14);
		contentPane.add(mon);
		
		JLabel yr = new JLabel("A\u00F1o");
		yr.setHorizontalAlignment(SwingConstants.CENTER);
		yr.setBounds(274, 95, 29, 14);
		contentPane.add(yr);
	
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int cont=0;
				String datos = (cont+1)+nombreA.getText()+" "+day.getText()+"/"+month.getText()+"/"+year.getText()+dirA.getText();
				ventana.save(datos,"Costumer.csv");
				cont++;
				//txtconsola.append(datos);
			}
		});
		
	}
}

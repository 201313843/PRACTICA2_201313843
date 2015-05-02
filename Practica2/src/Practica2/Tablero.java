package Practica2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Component;

import javax.swing.Box;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JTextPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.SwingConstants;

public class Tablero extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField Ficha1;
	private JTextField Ficha2;
	private JTextField Ficha3;
	private JTextField Ficha4;
	private JTextField Ficha5;
	private JTextField Ficha6;
	private JTextField Ficha7;
	private JTextField Ficha8;
	private JTextField textField_12;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblTorre;
	private JLabel lblTorre_1;
	private JLabel lblTorre_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero frame = new Tablero();
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
	public Tablero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 425);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setEnabled(false);
		textField.setBackground(Color.BLACK);
		textField.setBounds(50, 300, 500, 6);
		contentPane.add(textField);
		textField.setBorder(null);
		textField.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setForeground(new Color(0, 0, 102));
		textField_12.setEnabled(false);
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBorder(null);
		textField_12.setBackground(Color.BLACK);
		textField_12.setBounds(147, 100, 6, 200);
		contentPane.add(textField_12);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 102));
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(Color.BLACK);
		textField_1.setBounds(297, 100, 6, 200);
		contentPane.add(textField_1);
		
		lblTorre = new JLabel("torre 1");
		lblTorre.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				
				Ficha8.setBounds(132,85,36,15);
				
			}
		});
		lblTorre.setVerticalAlignment(SwingConstants.TOP);
		lblTorre.setBounds(86, 100, 124, 206);
		contentPane.add(lblTorre);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 0, 102));
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(Color.BLACK);
		textField_2.setBounds(447, 100, 6, 200);
		contentPane.add(textField_2);
		
		Ficha1 = new JTextField();
		Ficha1.setForeground(new Color(0, 0, 102));
		Ficha1.setEnabled(false);
		Ficha1.setEditable(false);
		Ficha1.setColumns(10);
		Ficha1.setBorder(null);
		Ficha1.setBackground(new Color(255, 0, 0));
		Ficha1.setBounds(97, 285, 106, 15);
		contentPane.add(Ficha1);
		
		Ficha2 = new JTextField();
		Ficha2.setForeground(new Color(0, 0, 102));
		Ficha2.setEnabled(false);
		Ficha2.setEditable(false);
		Ficha2.setColumns(10);
		Ficha2.setBorder(null);
		Ficha2.setBackground(new Color(255, 165, 0));
		Ficha2.setBounds(102, 270, 96, 15);
		contentPane.add(Ficha2);
		
		Ficha3 = new JTextField();
		Ficha3.setForeground(new Color(0, 0, 102));
		Ficha3.setEnabled(false);
		Ficha3.setEditable(false);
		Ficha3.setColumns(10);
		Ficha3.setBorder(null);
		Ficha3.setBackground(new Color(255, 255, 0));
		Ficha3.setBounds(107, 255, 86, 15);
		contentPane.add(Ficha3);
		
		Ficha4 = new JTextField();
		Ficha4.setForeground(new Color(0, 0, 102));
		Ficha4.setEnabled(false);
		Ficha4.setEditable(false);
		Ficha4.setColumns(10);
		Ficha4.setBorder(null);
		Ficha4.setBackground(new Color(124, 252, 0));
		Ficha4.setBounds(112, 240, 76, 15);
		contentPane.add(Ficha4);
		
		Ficha5 = new JTextField();
		Ficha5.setForeground(new Color(0, 0, 102));
		Ficha5.setEnabled(false);
		Ficha5.setEditable(false);
		Ficha5.setColumns(10);
		Ficha5.setBorder(null);
		Ficha5.setBackground(new Color(0, 128, 0));
		Ficha5.setBounds(117, 225, 66, 15);
		contentPane.add(Ficha5);
		
		Ficha6 = new JTextField();
		Ficha6.setForeground(new Color(0, 0, 102));
		Ficha6.setEnabled(false);
		Ficha6.setEditable(false);
		Ficha6.setColumns(10);
		Ficha6.setBorder(null);
		Ficha6.setBackground(new Color(0, 128, 128));
		Ficha6.setBounds(122, 210, 56, 15);
		contentPane.add(Ficha6);
		
		Ficha7 = new JTextField();
		Ficha7.setForeground(new Color(0, 0, 102));
		Ficha7.setEnabled(false);
		Ficha7.setEditable(false);
		Ficha7.setColumns(10);
		Ficha7.setBorder(null);
		Ficha7.setBackground(new Color(0, 0, 205));
		Ficha7.setBounds(127, 195, 46, 15);
		contentPane.add(Ficha7);
		
		Ficha8.setForeground(new Color(0, 0, 102));
		Ficha8.setEnabled(false);
		Ficha8.setEditable(false);
		Ficha8.setColumns(10);
		Ficha8.setBorder(null);
		Ficha8.setBackground(new Color(0, 0, 128));
		Ficha8.setBounds(132, 180, 36, 15);
		contentPane.add(Ficha8);
		
		lblTorre_1 = new JLabel("torre 2");
		lblTorre_1.setVerticalAlignment(SwingConstants.TOP);
		lblTorre_1.setBounds(240, 100, 124, 206);
		contentPane.add(lblTorre_1);
		
		lblTorre_2 = new JLabel("torre 3");
		lblTorre_2.setVerticalAlignment(SwingConstants.TOP);
		lblTorre_2.setBounds(388, 100, 124, 206);
		contentPane.add(lblTorre_2);
	}
}

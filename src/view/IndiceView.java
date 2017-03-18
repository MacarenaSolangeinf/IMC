package view;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.IndiceController;


public class IndiceView {
	private JOptionPane msjIMC;
	private JFrame ventana;
	private JFormattedTextField textfieldPeso;
	private JFormattedTextField textfieldAltura;
	private IndiceController indiceController;
	private JButton botonCalcular;
	
	public IndiceView(IndiceController indiceController){
		initialize(indiceController);
	}

	private void initialize(IndiceController indiceController){
		crearVentana();
		ventana.setVisible(true);
		this.setMsjIMC(new JOptionPane(""));
	}

	
	private void crearVentana() {
		ventana = new JFrame();
		//ventana.setMinimumSize(new Dimension(300,300));
		//ventana.getContentPane().setBackground(Color.BLACK); // cambio el color del fondo 
		ventana.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		addFormulario();
	}
	
	private void addFormulario() {
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblPeso.setForeground(Color.BLACK);
		lblPeso.setBounds(186, 14, 169, 15);
		ventana.getContentPane().add(lblPeso);
		setTextfieldPeso(new JFormattedTextField(new Double(0)));
		this.getTextfieldPeso().setBounds(new Rectangle(300, 15, 100, 21));
        this.getTextfieldPeso().setEditable(true);
		this.getTextfieldPeso().setHorizontalAlignment(JTextField.LEFT); 
		ventana.getContentPane().add(this.getTextfieldPeso());
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblAltura.setForeground(Color.BLACK);
		lblAltura.setBounds(186, 34, 169, 15);
		ventana.getContentPane().add(lblAltura);
		setTextfieldAltura(new JFormattedTextField(new Double(0)));
		this.getTextfieldAltura().setBounds(new Rectangle(300, 35, 100, 21));
        this.getTextfieldAltura().setEditable(true);
		this.getTextfieldAltura().setHorizontalAlignment(JTextField.LEFT); 
		ventana.getContentPane().add(this.getTextfieldAltura());
		
        this.setBotonCalcular(new JButton("Calcular IMC")); 
        this.getBotonCalcular().setBounds(192, 64, 180, 30);
        
        ventana.getContentPane().add(this.getBotonCalcular());	
	}
	
	public void clickBoton(ActionListener actionListener){
		this.getBotonCalcular().addActionListener(actionListener);
	}



	public IndiceController getIndiceController() {
		return indiceController;
	}



	public void setIndiceController(IndiceController indiceController) {
		this.indiceController = indiceController;
	}

	public JFormattedTextField getTextfieldAltura() {
		return textfieldAltura;
	}

	public void setTextfieldAltura(JFormattedTextField textfieldAltura) {
		this.textfieldAltura = textfieldAltura;
	}

	public JFormattedTextField getTextfieldPeso() {
		return textfieldPeso;
	}

	public void setTextfieldPeso(JFormattedTextField textfieldPeso) {
		this.textfieldPeso = textfieldPeso;
	}

	public JButton getBotonCalcular() {
		return botonCalcular;
	}

	public void setBotonCalcular(JButton botonCalcular) {
		this.botonCalcular = botonCalcular;
	}

	public JOptionPane getMsjIMC() {
		return msjIMC;
	}

	public void setMsjIMC(JOptionPane msjIMC) {
		this.msjIMC = msjIMC;
	}
	


}


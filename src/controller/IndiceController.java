package controller;
import view.IndiceView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.IndiceModel;

public class IndiceController {
	
	private IndiceView indiceView;
	private IndiceModel IndiceModel;
	
	public static void main(String[] args) { 
		IndiceController indiceController = new IndiceController();
	}
	
	public IndiceController(){
		this.initialize();
	}
	
	public void initialize(){
		IndiceView indiceView = new IndiceView(this); //La vista conoce al controller
		this.setIndiceView(indiceView); //El controller conoce  a la view.
		
		double peso = (double) this.getIndiceView().getTextfieldPeso().getValue();
		double altura = (double) this.getIndiceView().getTextfieldAltura().getValue();
		
		IndiceModel indiceModel= new IndiceModel(peso,altura); 
		this.setIndiceModel(indiceModel); //Controller conoce a Model.
		
		this.getIndiceView().clickBoton((event) -> this.mostrarIMC()); //Al actionListener le agregamos "bindiamos" la funcion.
	}
	
	public IndiceView getIndiceView() {
		return indiceView;
	}

	public void setIndiceView(IndiceView indiceView) {
		this.indiceView = indiceView;
	}

	public IndiceModel getIndiceModel() {
		return IndiceModel;
	}

	public void setIndiceModel(IndiceModel indiceModel) {
		IndiceModel = indiceModel;
	}

	private void mostrarIMC(){
		double peso = (double) this.getIndiceView().getTextfieldPeso().getValue();
		double altura = (double) this.getIndiceView().getTextfieldAltura().getValue();
		this.getIndiceModel().setPeso(peso);
		this.getIndiceModel().setAltura(altura);
		this.getIndiceView().getMsjIMC().showMessageDialog(null,this.getIndiceModel().calcularIMC());
	}
	
}

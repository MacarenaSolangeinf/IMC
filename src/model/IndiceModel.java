package model;

public class IndiceModel {
	
	private double peso;
	private double altura;
	
	
	public IndiceModel(double peso, double altura){
		initialize(peso,altura);	
	}
	
	private void initialize(double peso, double altura){
		this.setPeso(peso);
		this.setAltura(altura);
	}
	
	public String calcularIMC() {
        String msj;
        double imc;
        imc = (this.getPeso() / (this.getAltura()*this.getAltura()));
        
        if (imc < 18.5) {
            msj = "Usted se encuentra por debajo del peso normal con ese indice" + imc;
        }
        else if (imc >= 18.5 && imc <= 25) {
            	msj="Usted se encuentra en estado normal con ese indice" + imc;
            }
        	else {msj="Usted se encuentra en sobrepeso con ese indice" + imc;
        	}
       return msj;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}

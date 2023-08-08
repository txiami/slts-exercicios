package Lista04._03_Exercicio.animais;

import interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
	private double massa;
	private double tempo;
	private double distancia;
	
	public AnimalAB() {
		
	}
	
	public AnimalAB(double massa, double tempo, double distancia) {
		this.massa = massa;
		this.tempo = tempo;
		this.distancia = distancia;
	}
		
	public double getMassa() {
		return massa;
	}
	public void setMassa(double massa) {
		this.massa = massa;
	}
	public double getTempo() {
		return tempo;
	}
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	@Override
	public void comer(double massa) {
		this.massa = massa;
		System.out.println("O animal comeu " + massa + " Kg de alimento.");
	}

	@Override
	public void moverse(double distancia) {
		this.distancia = distancia;
		System.out.println("O animal moveu-se " + distancia + " Km.");
	}

	@Override
	public void dormir(double tempo) {
		this.tempo = tempo;
		System.out.println("O animal dormiu " + tempo + " horas.");
	}
}
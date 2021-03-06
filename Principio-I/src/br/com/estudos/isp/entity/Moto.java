package br.com.estudos.isp.entity;

import br.com.estudos.isp.utility.Iveiculo;
import br.com.estudos.isp.utility.IveiculoMoto;

public class Moto implements Iveiculo,IveiculoMoto{
	
	private String color;
	private String year;
	private double engine;
	
	

	public Moto(String color, String year, double engine) {
		configureMoto(color, year, engine);
	}

	@Override
	public void configureMoto(String color, String year, double engine) {
		this.color = color;
		this.year = year;
		this.engine = engine;
		System.out.println("Criando uma Moto " + engine + " " + color + " " + year);
		iniciarVeiculo();
		
	}

	@Override
	public void iniciarVeiculo() {
		System.out.println("Ligando os Motores");
		
	}

}

package br.com.LucasMontalvãoBongalhardo;

public class DisplayTemperatura extends Display<Temperatura> {
	private Temperatura temperatura;
	private Format<Temperatura> temperaturaFormat;
	
	DisplayTemperatura(Temperatura temperatura, Format<Temperatura> temperaturaFormat){
		this.temperatura = temperatura;
		this.temperaturaFormat = temperaturaFormat;
	}
	@Override
	void show() {
		System.out.println(temperaturaFormat.formatter(temperatura));
	}
}

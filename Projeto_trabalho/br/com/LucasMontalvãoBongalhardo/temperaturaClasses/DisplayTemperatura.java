package br.com.LucasMontalvãoBongalhardo.temperaturaClasses;

import br.com.LucasMontalvãoBongalhardo.defaultClasses.Display;
import br.com.LucasMontalvãoBongalhardo.defaultClasses.Format;

public class DisplayTemperatura extends Display<Temperatura> {
	private Temperatura temperatura;
	private Format<Temperatura> temperaturaFormat;
	
	public DisplayTemperatura(Temperatura temperatura, Format<Temperatura> temperaturaFormat){
		this.temperatura = temperatura;
		this.temperaturaFormat = temperaturaFormat;
	}
	@Override
	public void show() {
		System.out.println(temperaturaFormat.formatter(temperatura));
	}
}

package br.com.LucasMontalv�oBongalhardo.temperaturaClasses;

import br.com.LucasMontalv�oBongalhardo.defaultClasses.Display;
import br.com.LucasMontalv�oBongalhardo.defaultClasses.Format;

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

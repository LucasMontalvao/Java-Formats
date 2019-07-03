package br.com.LucasMontalvãoBongalhardo.calendarioClasses;

import br.com.LucasMontalvãoBongalhardo.defaultClasses.Display;
import br.com.LucasMontalvãoBongalhardo.defaultClasses.Format;

public class DisplayCalendario extends Display<Calendario> {
	private Calendario calendario;
	private Format<Calendario> data;
	
	public DisplayCalendario(Calendario calendario, Format<Calendario> data){
		this.calendario = calendario;
		this.data = data;
	}
	
	@Override
	public void show() {
		System.out.println("Dia" + " " + "Mês" + " " + "Ano");
		System.out.println(data.formatter(calendario));
		
	}

}

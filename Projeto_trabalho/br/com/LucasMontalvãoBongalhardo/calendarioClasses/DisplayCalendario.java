package br.com.LucasMontalv�oBongalhardo.calendarioClasses;

import br.com.LucasMontalv�oBongalhardo.defaultClasses.Display;
import br.com.LucasMontalv�oBongalhardo.defaultClasses.Format;

public class DisplayCalendario extends Display<Calendario> {
	private Calendario calendario;
	private Format<Calendario> data;
	
	public DisplayCalendario(Calendario calendario, Format<Calendario> data){
		this.calendario = calendario;
		this.data = data;
	}
	
	@Override
	public void show() {
		System.out.println("Dia" + " " + "M�s" + " " + "Ano");
		System.out.println(data.formatter(calendario));
		
	}

}

package br.com.LucasMontalv�oBongalhardo.horarioClasses;

import br.com.LucasMontalv�oBongalhardo.defaultClasses.Display;
import br.com.LucasMontalv�oBongalhardo.defaultClasses.Format;

public class DisplayTime extends Display<Horario> {
	private Horario hora;
	private Format<Horario> time;
	
	public DisplayTime(Horario hora, Format<Horario> time){
		this.hora = hora;
		this.time = time;
	}

	@Override
	public void show() {
		if(hora.hora <= 9) {
			System.out.println("0" + time.formatter(hora));
		}else if(hora.hora > 9 && hora.hora < 24){
			System.out.println(time.formatter(hora));
		}else {
			System.out.println("Voc� passou uma hora inv�lida!");
		}
		
	}

}

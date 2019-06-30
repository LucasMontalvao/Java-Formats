package br.com.LucasMontalvãoBongalhardo;

public class DisplayTime extends Display<Horario> {
	private Horario hora;
	private Format<Horario> time;
	
	DisplayTime(Horario hora, Format<Horario> time){
		this.hora = hora;
		this.time = time;
	}

	@Override
	void show() {
		if(hora.hora <= 9) {
			System.out.println("0" + time.formatter(hora));
		}else if(hora.hora > 9 && hora.hora < 24){
			System.out.println(time.formatter(hora));
		}else {
			System.out.println("Você passou uma hora inválida!");
		}
		
	}

}

package br.com.LucasMontalv�oBongalhardo.horarioClasses;

import br.com.LucasMontalv�oBongalhardo.defaultClasses.Format;

public class TimeFormat implements Format<Horario>{

	@Override
	public String formatter(Horario value) {
		String hora = null;
		hora = value.hora +":"+ value.minuto;
		return hora;
	}

}

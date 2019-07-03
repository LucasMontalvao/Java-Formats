package br.com.LucasMontalvãoBongalhardo.horarioClasses;

import br.com.LucasMontalvãoBongalhardo.defaultClasses.Format;

public class TimeFormat implements Format<Horario>{

	@Override
	public String formatter(Horario value) {
		String hora = null;
		hora = value.hora +":"+ value.minuto;
		return hora;
	}

}

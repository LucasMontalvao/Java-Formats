package br.com.LucasMontalv�oBongalhardo.temperaturaClasses;

import br.com.LucasMontalv�oBongalhardo.defaultClasses.Format;

public class TemperaturaFormat implements Format<Temperatura>{

	@Override
	public String formatter(Temperatura value) {
		String temperatura = new String();
		temperatura = value.temperatura + "�" + value.escala;
		return temperatura;
	}

}

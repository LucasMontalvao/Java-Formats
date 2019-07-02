package temperaturaClasses;

import defaultClasses.Format;

public class TemperaturaFormat implements Format<Temperatura>{

	@Override
	public String formatter(Temperatura value) {
		String temperatura = new String();
		temperatura = value.temperatura + "°" + value.escala;
		return temperatura;
	}

}

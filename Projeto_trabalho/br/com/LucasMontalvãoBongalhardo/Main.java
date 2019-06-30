package br.com.LucasMontalv�oBongalhardo;

public class Main {

	public static void main(String[] args) {
		//Exemplo rel�gio
		System.out.println("R�dio rel�gio: Hora em formato 24 horas.");
		Horario hora = new Horario();
		hora.setHora(10);
		hora.setMinuto(15);
		Format<Horario> time = new TimeFormat();
		Display<Horario> relogio = new DisplayTime(hora, time);
		relogio.show();
		//
		
		//Exemplo caled�rio
		System.out.println("\nCalend�rio: Dia, m�s e ano.");
		Calendario data = new Calendario();
		data.setAno(2019);
		data.setMes(2);
		data.setDia(20);
		Format<Calendario> calendario = new CalendarioFormat();
		Display<Calendario> display = new DisplayCalendario(data, calendario);
		display.show();
		//
		
		//Exemplo temperatura
		System.out.println("\nTemperatura: Em graus Celsius");
		Temperatura temperatura = new Temperatura();
		temperatura.setTemperatura((float)25.5);
		temperatura.setEscala("C");
		Format<Temperatura> temperaturaFormat = new TemperaturaFormat();
		Display<Temperatura> temperaturaDisplay = new DisplayTemperatura(temperatura, temperaturaFormat);
		temperaturaDisplay.show();
		//
		
		//Exemplo Radio FM
		System.out.println("\nR�dio FM: Esta��o sintonizada.");
		Radio radio = new Radio();
		radio.setEstacao((float)104.3);
		radio.setFrequenca("AM");
		Format<Radio> radioFormat = new RadioFormat();
		Display<Radio> radioDisplay = new DisplayRadio(radio, radioFormat);
		radioDisplay.show();
		//
	}
}

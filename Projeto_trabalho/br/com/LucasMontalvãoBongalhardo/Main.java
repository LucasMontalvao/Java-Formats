package br.com.LucasMontalvãoBongalhardo;

import br.com.LucasMontalvãoBongalhardo.calendarioClasses.Calendario;
import br.com.LucasMontalvãoBongalhardo.calendarioClasses.CalendarioFormat;
import br.com.LucasMontalvãoBongalhardo.calendarioClasses.DisplayCalendario;
import br.com.LucasMontalvãoBongalhardo.horarioClasses.DisplayTime;
import br.com.LucasMontalvãoBongalhardo.horarioClasses.Horario;
import br.com.LucasMontalvãoBongalhardo.horarioClasses.TimeFormat;
import br.com.LucasMontalvãoBongalhardo.radioClasses.DisplayRadio;
import br.com.LucasMontalvãoBongalhardo.radioClasses.Radio;
import br.com.LucasMontalvãoBongalhardo.radioClasses.RadioFormat;
import br.com.LucasMontalvãoBongalhardo.temperaturaClasses.DisplayTemperatura;
import br.com.LucasMontalvãoBongalhardo.temperaturaClasses.Temperatura;
import br.com.LucasMontalvãoBongalhardo.temperaturaClasses.TemperaturaFormat;
import br.com.LucasMontalvãoBongalhardo.defaultClasses.Display;
import br.com.LucasMontalvãoBongalhardo.defaultClasses.Format;

public class Main {

	public static void main(String[] args) {
		//Exemplo relógio
		System.out.println("Rádio relógio: Hora em formato 24 horas.");
		Horario hora = new Horario();
		hora.setHora(10);
		hora.setMinuto(15);
		Format<Horario> time = new TimeFormat();
		Display<Horario> relogio = new DisplayTime(hora, time);
		relogio.show();
		//
		
		//Exemplo caledário
		System.out.println("\nCalendário: Dia, mês e ano.");
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
		System.out.println("\nRádio FM: Estação sintonizada.");
		Radio radio = new Radio();
		radio.setEstacao((float)104.3);
		radio.setFrequenca("AM");
		Format<Radio> radioFormat = new RadioFormat();
		Display<Radio> radioDisplay = new DisplayRadio(radio, radioFormat);
		radioDisplay.show();
		//
	}
}

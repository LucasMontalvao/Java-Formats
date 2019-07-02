package br.com.LucasMontalvãoBongalhardo;

import calendarioClasses.Calendario;
import calendarioClasses.CalendarioFormat;
import calendarioClasses.DisplayCalendario;
import horarioClasses.DisplayTime;
import horarioClasses.Horario;
import horarioClasses.TimeFormat;
import radioClasses.DisplayRadio;
import radioClasses.Radio;
import radioClasses.RadioFormat;
import temperaturaClasses.DisplayTemperatura;
import temperaturaClasses.Temperatura;
import temperaturaClasses.TemperaturaFormat;
import defaultClasses.Display;
import defaultClasses.Format;

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

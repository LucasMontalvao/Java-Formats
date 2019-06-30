package br.com.LucasMontalv�oBongalhardo;

public class DisplayCalendario extends Display<Calendario> {
	private Calendario calendario;
	private Format<Calendario> data;
	
	DisplayCalendario(Calendario calendario, Format<Calendario> data){
		this.calendario = calendario;
		this.data = data;
	}
	
	@Override
	void show() {
		System.out.println("Dia" + " " + "M�s" + " " + "Ano");
		System.out.println(data.formatter(calendario));
		
	}

}

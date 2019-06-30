package br.com.LucasMontalvãoBongalhardo;

public class RadioFormat implements Format<Radio>{
	
	@Override
	public String formatter(Radio value) {
		String radio = new String();
		radio = value.frequenca +" " + value.estacao + " Mhz";
		return radio;
	}

}

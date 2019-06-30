package br.com.LucasMontalv�oBongalhardo;

public class DisplayRadio extends Display<Radio>{
	private Radio radio;
	private Format<Radio> radioFormat;
	
	DisplayRadio(Radio radio, Format<Radio> radioFormat){
		this.radio = radio;
		this.radioFormat = radioFormat;
	}
	
	@Override
	void show() {
		System.out.println(radioFormat.formatter(radio));
	}

}

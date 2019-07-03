package br.com.LucasMontalv�oBongalhardo.radioClasses;

import br.com.LucasMontalv�oBongalhardo.defaultClasses.Display;
import br.com.LucasMontalv�oBongalhardo.defaultClasses.Format;

public class DisplayRadio extends Display<Radio>{
	private Radio radio;
	private Format<Radio> radioFormat;
	
	public DisplayRadio(Radio radio, Format<Radio> radioFormat){
		this.radio = radio;
		this.radioFormat = radioFormat;
	}
	
	@Override
	public void show() {
		System.out.println(radioFormat.formatter(radio));
	}

}

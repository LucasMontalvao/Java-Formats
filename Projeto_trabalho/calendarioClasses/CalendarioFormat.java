package calendarioClasses;

import defaultClasses.Format;

public class CalendarioFormat implements Format<Calendario>{

	@Override
	public String formatter(Calendario value) {
		String calendario = new String();
		if(value.mes == 0) {
			calendario = "Mês inválido";
			return calendario;
		}else if(value.mes > 10){
			calendario = value.dia + "   "+ value.mes + "  " + value.ano;
			return calendario;
		}else {
			calendario = value.dia + "  " + "0"  + value.mes + "  " + value.ano;
			return calendario;
		}
		
	}

}

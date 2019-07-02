package radioClasses;

public class Radio {
	protected float estacao;
	protected String frequenca;

	public float getEstacao() {
		return estacao;
	}

	public String getFrequenca() {
		return frequenca;
	}

	public void setFrequenca(String frequenca) {
		this.frequenca = frequenca;
	}

	public void setEstacao(float estacao) {
		this.estacao = estacao;
	}
}

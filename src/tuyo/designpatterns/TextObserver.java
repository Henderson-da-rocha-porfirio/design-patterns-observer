package tuyo.designpatterns;

import javax.swing.JTextField;

public class TextObserver implements Observer { // Classe que representa um novo observador que implementa a interface Observer.

	private JTextField txtTemperature; // Atributo que referencia uma caixa de texto.

	public TextObserver(JTextField txtTemperature) {  // Construtor que recebe como parâmetro uma instância de JTextField e atribuir ao atributo da classe.
		this.txtTemperature = txtTemperature;
	}

	@Override
	public void update(Subject subject) { // Método update que implementa Observer.
		WeatherForecast wf = (WeatherForecast) subject; // Casting de subject para WeatherForecast.
		txtTemperature.setText(String.valueOf(wf.getTemperature())); // Colocar o texto na caixa de texto de temperatura.
	}																	//Strin.valueOf: converte de int para string.
}

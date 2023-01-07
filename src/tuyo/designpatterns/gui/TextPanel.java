package tuyo.designpatterns.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

import tuyo.designpatterns.TextObserver;
import tuyo.designpatterns.WeatherForecast;

public class TextPanel extends JPanel { // responsável pela caixa textfield que fica desabilitada para não sofrer modificação posterior através dela.

	public TextPanel() {
		JTextField txtTemperature = new JTextField(20);
		txtTemperature.setEnabled(false);
		add(txtTemperature);
		
		TextObserver observer = new TextObserver(txtTemperature); // Atributo onde é feito o registro do observador TextObserver.
		WeatherForecast.getInstance().registerObserver(observer); // Obtendo uma instância de instance. E o observador (observer) é passado como parâmetro.
	}
}

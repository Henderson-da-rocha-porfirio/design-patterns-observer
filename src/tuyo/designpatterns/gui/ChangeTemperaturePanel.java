package tuyo.designpatterns.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import tuyo.designpatterns.WeatherForecast;

public class ChangeTemperaturePanel extends JPanel implements ActionListener { // Painel que tem o combox
																					// ActionListener do java: The listener interface for receiving action events.
	private JComboBox<Integer> temperatureCbo; // Atributo JComboBox
	public ChangeTemperaturePanel() { 				// Construtor com as definições do combox

		Integer[] values = { 0, 5, 10, 15, 20, 25, 30 };
		temperatureCbo = new JComboBox<>(values);
		temperatureCbo.addActionListener(this); // Adiciona na classe um ActionListener.
		
		add(new JLabel("Temperatura:"));
		add(temperatureCbo);
	}

	@Override
	public void actionPerformed(ActionEvent event) { // Implementa como consequência o método actionPerformed.
		Integer temperature = (Integer) temperatureCbo.getSelectedItem(); // Toda alteração de temperatura for feita pelo usuário, esse método será chamado.
		WeatherForecast.getInstance().setTemperature(temperature); // Para obter uma instância de WeatherForecast. Utilizando o padrão Singleton.
	}
}

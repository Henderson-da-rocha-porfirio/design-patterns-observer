package tuyo.designpatterns;

public class ConsoleObserver implements Observer { // Classe do observador

	@Override
	public void update(Subject subject) { // interface vai implementar o método update.
											// no caso do Subject ele será uma instância de WeatherForecast.
		WeatherForecast wf = (WeatherForecast) subject; // Feito um casting de subject para WeatherForecast.
		
		System.out.println("Temperatura: " + wf.getTemperature());
	}
}

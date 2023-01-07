package tuyo.designpatterns;

import tuyo.designpatterns.gui.Window;


public class App {

	public static void main(String[] args) {
		
		ConsoleObserver observer = new ConsoleObserver(); // Registra o observador no WeatherForecast para que ele seja notificado.
		WeatherForecast.getInstance().registerObserver(observer); // Obtendo uma instância de instance. E o observador (observer) é passado como parâmetro.
		
		Window window = new Window("Temperatura", 300, 150);
		window.show();
	}
}

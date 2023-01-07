package tuyo.designpatterns;

import java.util.LinkedHashSet;
import java.util.Set;

public class WeatherForecast implements Subject { // Classe que representa a temperatura e implementa de Subject
	
	private static WeatherForecast instance; // SEQUENCIA SINGLETON 2 = Uma instância estática chamada de instance.
												// Atributo estático. Ele é um atributo de classe e não de objeto da classe.
													// Uma vez inicializada essa instância, ela sempre será a mesma onde quer que seja chamada e enquanto estiver executando a aplicação, a instância sempre será instance.
	private Set<Observer> observers = new LinkedHashSet<Observer>(); // Atributo " Set " que é uma biblioteca do java que permite não ter duplicação de elementos.
																// Será responsável pela armazenagem dessa informação. O " LinkedHashSet é para manter a ordem de inserção.
	private int temperature; // Atributo inteiro que armazena a temperatura
	
	private WeatherForecast() { // SEQUENCIA SINGLETON 1 = Construtor privado para evitar que objetos de WeatherForecast sejam criados fora da classe.
									// Ele servirá para que o objeto WeatherForecast seja usado em vários lugares do sistema. E não faz sentido ele ter mais de uma instância.
	}									// E para que garantir que ele terá uma instância só, será usado o outro designer partner: o Singleton = que permite usar a mesma instância para quem precisar.
	
	public static WeatherForecast getInstance() { // SEQUENCIA SINGLETON 3 = método estático público para quem precisar chamar essa instância.
		if (instance == null) { // Se a instancia está nula,
			instance = new WeatherForecast(); // eu crio o objeto que funcionará porque estou dentro da classe.
		}
		return instance; // Aqui a instância é retornada.
	}
	
	public int getTemperature() {
		return temperature;
	} //Método getTemperature
	
	public void setTemperature(int temperature) { // Método setTemperature
		this.temperature = temperature;
		notifyObservers(); // Ele notifica assim que há mudança de temperatura.
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer); // Método para quando um observer for registrado, ele vai nesse conjunto de observers e adicionar o que está sendo registrado, lá dentro da coleção "Set".
	}

	@Override
	public void unregisterObserver(Observer observer) {

		observers.remove(observer); // Método onde é feito o "desregistro".
	}

	@Override
	public void notifyObservers() { //Método responsável em notificar os observadores.
		for (Observer observer : observers) { // Basta fazer um for.
			observer.update(this); // Chamar para cada observer um método update. Passando o subject, ou seja, a própria instância (this) de WeatherForecast.
		}									// Quando ocorrer uma mudança, o notifyObservers é chamado.
	}											//  E esse vai iterar ( repetição de uma ou mais ações ) cada observador cadastrado, avisando da mudança através do método Update.
}													// E quando chamar este método? Ele tem que ser chamado na hora em que quero que ele notifique, imediatamente, aos observadores:
														// quando a mudança de temperatura ocorrer. No método setTemperature.

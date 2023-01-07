package tuyo.designpatterns;

public interface Subject {  // Classe genérica para trabalhar tanto com os observadores quanto com os observados

	public void registerObserver(Observer observer); // Método com passagem do parametro com um observador a ser registrado.
	public void unregisterObserver(Observer observer); // Método que desregistra o observador.
	public void notifyObservers(); // Método que notifica todos os observadores.
}

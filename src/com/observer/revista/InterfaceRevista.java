package com.observer.revista;

public interface InterfaceRevista {

	void registerObserver(Assinante assinante);

	void removeObserver(int id);

	void notifyObservers();

}

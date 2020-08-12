package com.observer.revista;

public class Main {
	
	public static void main(String[] args) {
		
		RevistaUltraJovem  revistaUltraJovem = new RevistaUltraJovem();
		revistaUltraJovem.setEdicao(7);
		Assinante assinante1 = new Assinante("Maria", 01);
		Assinante assinante2 = new Assinante("Sara", 02);
	
		revistaUltraJovem.registerObserver(assinante1);
		revistaUltraJovem.registerObserver(assinante2);
		revistaUltraJovem.notifyObservers();
		revistaUltraJovem.removeObserver(01);
		
		RevistaInformatica revistaInformatica = new RevistaInformatica();
		revistaInformatica.setEdicao(15);
		Assinante joão = new Assinante("João", 01);
		revistaInformatica.registerObserver(joão);
		revistaInformatica.notifyObservers();
	}

}

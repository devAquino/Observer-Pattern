package com.observer.revista;

import java.util.ArrayList;
import java.util.List;

public class RevistaInformatica implements InterfaceRevista{
	
	// Lista de assinantes
		private List<Assinante> assinantes = new ArrayList<Assinante>();
		
		// Declarado como static para que outra classe possa acessá-lo
		private static int edicao;

		public static int getEdicao() {
			return edicao;
		}

		public void setEdicao(int edicao) {
			this.edicao = edicao;
		}
		
		
		// Método responsável por armazenar os assinantes na lista
		@Override
		public void registerObserver(Assinante assinante) {
			assinantes.add(assinante);

		}

		// Métdo responsável por remover assinantes da lista 
		@Override
		public void removeObserver(int id) {
			assinantes.remove(id-1);

		}

		// Esse método percorre a lista de assinantes para noticar cada um da nova versão da revista 
		@Override
		public void notifyObservers() {
			for(Assinante assinante: assinantes) {
				assinante.update();
			}

		}
}

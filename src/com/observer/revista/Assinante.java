package com.observer.revista;

public class Assinante implements InterfaceAssinante{

	private RevistaUltraJovem revistaUltraJovem;
	
	private String nome;
	private int id;
	int novaEdicao = RevistaUltraJovem.getEdicao();
	
	public Assinante(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNovaEdicao() {
		return novaEdicao;
	}
		
	public Assinante(RevistaUltraJovem revistaUltraJovem) {
		super();
		this.revistaUltraJovem = revistaUltraJovem;
	}

	@Override
	public void update() {
		
		System.out.println("Olá " +getNome()+ "!" + ". Acaba de ser lançada a nova versão da Revista Ultra Jovem. " +
			"Esta é a edição número: "+ getNovaEdicao() );
		
		
	}

}

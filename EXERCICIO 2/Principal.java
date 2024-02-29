package com.ti2cc;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();
		
		//Inserir um elemento na tabela
		X carro = new X(5, "Tesla", "Elon Musk",'T');
		if(dao.inserirCarro(carro) == true) {
			System.out.println("Inserção com sucesso -> " + carro.toString());
		}
		
		//Mostrar carros de simbolo T		
		System.out.println("==== Carros de simbolo T === ");
		X[] carros = dao.getCarrosT();
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}

		//Atualizar carro
		carro.setDistribuidora("nova distribuidora");
		dao.atualizarCarro(carro);

		//Mostrar carros de simbolo T
		System.out.println("==== Mostrar carros === ");
		carros = dao.getCarros();
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}
		
		//Excluir carro
		dao.excluirCarro(carro.getCodigo());
		
		//Mostrar carros
		carros = dao.getCarros();
		System.out.println("==== Mostrar carros === ");		
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}
		
		dao.close();
	}
}
package Paine;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Callc.Entitis;

public class Execute {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Entitis> bemk = new ArrayList<>();

		System.out.println("quantos funcionarios serão inceridos? ");
		int quantidade = sc.nextInt();

		for (int i = 0; i < quantidade; i++) {
			System.out.println("");
			System.out.println("fucionario" + (i + 1) + ":");

			System.out.println("ID:");
			int id = sc.nextInt();
			while (hasId(bemk, id)) {
				System.out.println("ID repetido tente novamente");
				id = sc.nextInt();

			}
			System.out.println("NOME:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("SALARIO");
			double salario = sc.nextDouble();

			bemk.add(new Entitis(nome, salario, id));
		}
		System.out.println("");
		System.out.println("informe o ID do funcionario que tera o almento:");
		int id = sc.nextInt();

		Entitis funci = bemk.stream().filter(ind -> ind.getId() == id).findFirst().orElse(null);

		if (funci == null) {
			System.out.println("Id não localisado");
		} else {
			System.out.println("informe a porcentagem de almento:");
			double PSalario = sc.nextDouble();
			funci.percetSalario(PSalario);

			System.out.println("");
			System.out.println("Lista de Funcionarios:");
			for (Entitis cont : bemk)
				System.out.println(cont);

		}

		sc.close();

	}

	public  static  boolean  hasId ( List < Entitis > bemk , int  id ) {
		Entitis funci = bemk.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funci != null;
	}

}

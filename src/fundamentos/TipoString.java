package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
		
		
		
		var nome = "Pedro";
		var sobreNome = "Santos";
		var idade = 33;
		var salario = 12345.67;
		
		String maisUmaFrase = "\nNome: " + nome + "\nSobre Nome: " + sobreNome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		System.out.println("\nNome: " + nome + "\nSobre Nome: " + sobreNome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.", 
				nome , sobreNome, idade, salario);
		
		String frase = String.format("\n\nO senhor %s %s tem %d anos e ganha R$ %.2f.", 
				nome , sobreNome, idade, salario);
		System.out.println(frase);
		

	}

}

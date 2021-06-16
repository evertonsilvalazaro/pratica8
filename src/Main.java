import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("Quantos veiculos deseja cadastrar");
		x=sc.nextInt();
		
		Veiculos cadastro[]= new Veiculos[x];
		int i;
		for(i=0;i<x;i++){
			Veiculos carro=new Veiculos();

			System.out.println("digite o chassi");
			carro.setChassi(sc.next());
			
			System.out.println("Digite a placa");
			carro.setPlaca(sc.next());
		
			cadastro[i]=carro;	
			
		}
		
		for(i=0;i<x;i++) {
			System.out.println("O cadastro de registo número:  "+i);
			System.out.println("o chassi do veículo é: "+cadastro[i].getChassi());
			System.out.println("a placa do veículo é: "+cadastro[i].getPlaca());
			System.out.println("================================================");
		}
		
		System.out.println("fim");
	
	}

}

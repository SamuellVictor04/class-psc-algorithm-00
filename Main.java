import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    String sala = "A219";
	    String salaInformada = "";
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("Digite o número da sala: ");
		salaInformada = input.next();
		
		if (sala.equals(salaInformada)) {
		    System.out.print("Você esta no caminho certo! ");
		} else {
		    System.out.println("Você está perdido(a), se encontre.");
		}
		input.close();
	}
}
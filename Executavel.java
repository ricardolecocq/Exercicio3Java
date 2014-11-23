package LastBreath;
import java.util.Scanner; // importe essa classe para poder usar o scanner, como o scanf do C


public class Executavel // esta eh minha classe executavel, a main
{

	public static void main(String[] args) //metodo main da classe main, ba dum tss
	{
		Scanner scan = new Scanner(System.in); //ciando um objeto da classe Scanner, para poder pedir para o usuario digitar o numero... o System.in eh padrao, tem que decorar hehe
		
		System.out.println("Digite o tamanho do array"); // print firula pra melhorar visualizaçao do codigo
		Gerador.gerarVetorOrdenado(scan.nextInt()); // chamando o metodo gerarVetorOrdenado da classe Gerador, passando como parametro o objeto scan, o nextInt eh para pegar
													// uma variavel do tipo inteiro, poderia ser nextChar por exemplo, depende du q tu quer;
	}
}

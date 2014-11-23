package LastBreath;
import java.util.Random;  // aki eu importei a classe Random, para gerar numeros aleatorios, como ele tinha pedido

public class Gerador 
{
		public static int[] gerarVetor(int tamanho)  // metodo gerar vetor retorna um vetor do tipo inteiro, e recebe como parametro um inteiro, que eh o tamanho que vamos perguntar para o usuario
		{
			int[] randomVet = new int[tamanho];		// aki eu criei um vetor de inteiros, e como tamanho dei a variavel tamaho, que o usuario digita.
			Random rand = new Random();
			
			for (int i = 0; i < tamanho; i++) 		//para cada posiçao do vetor, randomizar um numero de 0 a 5000 e jogar la dentro
			{
				randomVet[i] = rand.nextInt(5000);
			}	
			return randomVet;						// retornar o vetor
		}
		
		public static void gerarVetorOrdenado(int tamanho)		// esse eh o metodo que nos vamos chamar na Executavel.., nao ha por que colocar muito codigo aki, 
																//oque ele faz eh apenas chamar os outros metodos quando ele for chamado
		{
			Ordenador.Imprimir(Ordenador.OrdenarVetor(Gerador.gerarVetor(tamanho)));
			
			// perae que porra eh essa?
			
			// calma, so prestar atençao
			// quando o metodo gerarVetorOrdenado eh chamado, ele executa esta linha de codigo, que nada mais eh do que chamar todos os outros metodos criados
			
			//primeiro, chamamos o metodo Imprimir, porque se nao imprimir nao serve pra nada os bagulho
			// lembram que o metodo imprimir faz? ele imprime um vetor de inteiros, para isso ele precisa receber um vetor de inteiros como parametro
			
			//o parametro que passamos para ele eh outro metodo, o OrdenarVetor
			// WTF como assim?
			//o metodo OrdenarVetor tambem retorna um vetor de inteiros, entao voce pode usar ele como parametro para o Imprimir
			
			//mas o metodo OrdenarVetor tambem precisa de um parametro, que tem que ser um vetor, entao nos usamos como parametro o metodo gerarVetor,
			// que tambem retorna um vetor de inteiros. esse metodo recebe como parametro um inteiro, que foi dado pelo usuario
			
			//resumo da obra: quando o metodo gerarVetorOrdenadoeh chamado, ele faz o seguinte:
			//passa para o gerarVetor o tamanho digitado pelo usuario, e gera um vetor dakele tamanho
			//esse vetor entra entao no metodo OrdenarVetor, e sai de la na ordem correta, direto para o metodo Imprimir.
			// que imprime td
			//eh isso
			//Here, have a potato.
		}
}

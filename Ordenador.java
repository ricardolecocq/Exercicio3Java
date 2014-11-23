package LastBreath; // esse eh o nome do pacote, ou seja, da pasta interna do projeto


public class Ordenador 
{
	//1. Criar a classe "Ordenador". Esta classe deve possuir pelo menos um método, "ordenarVetor", que ordena vetores de números inteiros. Crie métodos auxiliares se considerar necessário.

	public static int[] OrdenarVetor(int[] x) // esse eh o metodo que ordena o vetor. ve o int[] depois de public static? eh oque ele retorna quando chamado, um vetor do tipo inteiro
												// ele recebe como parametro um outro vetor do tipo inteiro.
	{
		int aux=0;						// esta variavel eh necessaria para fazer as trocas, ja que nao da pra trocar com somente 2
		
		
		for (int i = 0; i < x.length; i++)       //aqui temosa estrutura padrao de 2 FORs, que eh necessaria porque nos precisamos percorrer o vetor multiplas vezes, uma vez para cada elemento do mesmo
		{
			for (int j = 0; j < x.length; j++)
			{
				if(x[i]<x[j])					// este if checa se o bloco abaixo eh necessario ou nao...eh bastante simples, ele compara, ele funciona assim:
												// quando i for = a 0, ele vai verificar todo o vetor, atraves do J no segundo for, e ver se o valor ali eh maior que o valor de x[i]
												// se for, ele vai trocar as 2 variaveis de posiçao. por que estou usando o aux? pq eh assim que troca u.u
				{
					aux = x[i];
					x[i] = x[j];
					x[j] = aux;
				}
			}
		}
		return x;           				// esta parte mostra qual elemento que vai ser retornado.... precisa ser do tipo vetor de inteiros, pq foi oque foi declarado no tetorno do metodo
	}
	
	
	public static void Imprimir(int x[])   // este metodo nao foi pedido, mas eu criei por motivos obvios, nao adianta fazer tudo e nao imprimir nada, BEEEEHHHH;
	{
		for (int i = 0; i<x.length ; i++)
		{
			System.out.println(x[i]+"  ");
		}
			
	}
}

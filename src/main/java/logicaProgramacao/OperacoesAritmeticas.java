package logicaProgramacao;

public class OperacoesAritmeticas {
	//1.	Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
	
	public int getAreaRetangulo(int base, int altura) {
		int area = base * altura;
		return area;
	}
	
	//6.	Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
	public double getMediaAritmetica(double d, double e, double f, double g ) {
		double media = (d + e + f + g) / 4 ;
		return media;
		
	}
	
	//15.	Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).
	public double getConverteReais(double cotacao, double dolar) {
		double converte = dolar * cotacao;
		return converte;
	}
	
	//17.	Entrar via teclado com dois valores quaisquer “X” e “X”. Calcular e exibir o cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
	public double getExponencial(double x1, double x2) {
		double exp = Math.pow(x1, x2);
		return exp;
		
	}

}

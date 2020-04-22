package abstrato;
//Uma classe ABSTRATA n�o pode ser instanciada
public abstract class Forma {
	
	//APENAS classes ABSTRATAS podem possuir m�todos abstratos
	
	//Um m�todo ABSTRATO n�o possui implementa��o e obriga as 
	//classes filhas a reescreverem esse m�todo
	public abstract void desenhar();
	public abstract void aumentar(int tamanho);
}
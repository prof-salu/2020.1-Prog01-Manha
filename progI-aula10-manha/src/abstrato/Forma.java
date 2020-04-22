package abstrato;
//Uma classe ABSTRATA não pode ser instanciada
public abstract class Forma {
	
	//APENAS classes ABSTRATAS podem possuir métodos abstratos
	
	//Um método ABSTRATO não possui implementação e obriga as 
	//classes filhas a reescreverem esse método
	public abstract void desenhar();
	public abstract void aumentar(int tamanho);
}
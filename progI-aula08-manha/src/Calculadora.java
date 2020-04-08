//Classes final não podem possuir "filhos"
public final class Calculadora {
	
	public double soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public double soma(float num1, int num2) {
		return num1 + num2;
	}
	
	public double soma(double num1, double num2) {
		return num1 + num2;
	}
	
	public double soma(int num2, float num1) {
		return num1 + num2;
	}
}

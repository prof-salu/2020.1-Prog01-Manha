package abstrato;

public abstract class Canino extends Animal{
	
	@Override
	public void fazBarulho() {
		System.out.println("Canino fazendo barulho");		
	}
	
	public void latir() {
		System.out.println("Au au");
	}
}

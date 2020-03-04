
public class DesvioDeFluxo {

    public static void main(String[] args) {
        
        final int DIAS_DA_SEMANA = 5;
        
        switch(DIAS_DA_SEMANA){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terca-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido!");
        }
        
        
        System.out.println("==========================");
        
        
        int vistoria = 4;
        
        switch(vistoria){
            case 0:
            case 1:
            case 2:
                System.out.println("Abril");
                break;
            case 3:
            case 4:
                System.out.println("Maio");
                break;
            case 5:
                System.out.println("Junho");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Julho");
                break;
            case 9:
                System.out.println("Agosto");
                break;
            }       
    }
}

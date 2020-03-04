
public class TiposPrimitivos {
    public static void main(String args[]){
        int i = 1000000000;
        long l = 10000000000l;
        float f = 10.0000009f;
        double d = 10.0000009;
        
        System.out.println("I --> " + i);
        System.out.println("L --> " + l);
        System.out.println("F --> " + f);
        System.out.println("D --> " + d);
        
        char a1 = 'f';
        char a2 = 'd';
        
        System.out.println(a1+a2);
        
        byte b1 = 7;
        int i1 = 5;
        long l1 = 129;
        
        long l2 = b1 + i1;
        
        byte b2 = (byte) l1;
        
        System.out.println(b2);
        
        int x1 =10;
        System.out.println("x1: " + (++x1));
        
        int x2 = 10;
        System.out.println("x2: " + (x2++));
        
        System.out.println("****************");
        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
        
        System.out.println("\" hoje \" ");
        
        int x3 = 2;
        
        int x4 = (x3 > 5)?1:7;
        
        System.out.println("X4: " + x4);
        
        int z3 = 2;
        int z4;
        if(z3 > 5){
            z4 = 1;
        }else{
            z4 = 7;
        }
        System.out.println("Z4: " + z4);
        
        int x5 = 10;
        
        if(x5 > 7){
            System.out.println("x5: " + x5);
            int x6 = 7;
            System.out.println("x6: " + x6);
        }
        int x6 = 8;
        
        final double JUROS = 0.03;
        
        final double juros = 5;
        
        final double Juros = 5;
        
        final double JURos = 5;
        
        
    }
}

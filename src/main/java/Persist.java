import java.util.ArrayList;

public class Persist {
    public static int persistence(long n) {
        int digitos = 0;
        int result = 0;
        long multiplicacion = 1;
        ArrayList<Long> numeros = new ArrayList<>();

        while(n !=0)
        {
            n = n/10;
            digitos++;
            numeros.add(n);
        }
        if(digitos > 1){
            for (int i = 0; i < digitos; ++i) {
                multiplicacion = multiplicacion * numeros.get(i) ;
                result = result + 1 ;
            }
        }else {
            result =  0;
        }
        return result;
    }
}

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;


/**
 * Operaciones
 */
public class Operaciones {

    public double mediaAritmetica(double[] a) {
        OptionalDouble sumaArray = Arrays.stream(a).reduce((res, b) -> res + b);
        double total = sumaArray.getAsDouble();
        double mediaAritmetica = total / a.length;
        return mediaAritmetica;
    }

    public double mediaGeometrica(double[] a) {

        OptionalDouble resAllElements = Arrays.stream(a).reduce((res, b) -> res * b);
        double total = resAllElements.getAsDouble();
        double tam = a.length;
        double pot = 1 / tam;
        double mediaGeo = Math.pow(total, pot);
        return mediaGeo;
    }

    public double mediaPonderada(double[] a, double[] b) {
        double[] dividendos = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            dividendos[i] += a[i] * b[i];
           
        }
        OptionalDouble sumaArray = Arrays.stream(dividendos).reduce((res, i) -> res + i);
        OptionalDouble divisor = Arrays.stream(b).reduce((res, i) -> res + i);
        double mediaPonderada = sumaArray.getAsDouble() / divisor.getAsDouble();
        return mediaPonderada;
    }

    public double mediaArmonica(double[] a) {

        // OptionalDouble sumaArray = Arrays.stream(a).reduce((res, i) -> res + (1/i));
        double acc = 0;
        for (int j = 0; j < a.length; j++) {
            acc += 1 / a[j];
        }

        double mediaArmonica = (a.length / acc);
        int mediaArmonicaRound = (int) Math.round(mediaArmonica);
        return mediaArmonicaRound;

    }

    public double proporcion(double [] a, double c){
        double p = (c/a.length)*100;
        return p;
    }
}
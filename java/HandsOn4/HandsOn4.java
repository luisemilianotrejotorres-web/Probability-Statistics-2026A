public class HandsOn4 {

    public static void main(String[] args) {

        double[] datos = {
        25,30,32,35,40,42,45,47,50,52,
        55,57,60,62,65,67,70,72,75,78,
        80,82,85,87,90,92,95,97,100,102
        };

        int n = datos.length;
        int clases = 6;

        double min = datos[0];
        double max = datos[0];

        for(int i=0;i<n;i++){
            if(datos[i] < min){
                min = datos[i];
            }
            if(datos[i] > max){
                max = datos[i];
            }
        }

        double rango = max - min;
        double amplitud = rango / clases;

        int[] f = new int[clases];
        int[] fa = new int[clases];
        double[] fr = new double[clases];
        double[] fra = new double[clases];
        double[] xc = new double[clases];

        double li = min;
        double ls;

        for(int i=0;i<clases;i++){

            ls = li + amplitud;

            for(int j=0;j<n;j++){
                if(datos[j] >= li && datos[j] < ls){
                    f[i]++;
                }
            }

            xc[i] = (li + ls) / 2;

            li = ls;
        }

        int acumulada = 0;
        double acumuladaRel = 0;

        System.out.println("Clase  Limite  f  Xc  Fa  fr  fra  %");

        li = min;

        for(int i=0;i<clases;i++){

            ls = li + amplitud;

            acumulada = acumulada + f[i];
            fa[i] = acumulada;

            fr[i] = (double)f[i] / n;

            acumuladaRel = acumuladaRel + fr[i];
            fra[i] = acumuladaRel;

            double porcentaje = fr[i] * 100;

            System.out.println((i+1) + "  " +
            (int)li + "-" + (int)ls + "  " +
            f[i] + "  " +
            xc[i] + "  " +
            fa[i] + "  " +
            fr[i] + "  " +
            fra[i] + "  " +
            porcentaje);

            li = ls;
        }

        System.out.println("Total datos: " + n);
    }
}

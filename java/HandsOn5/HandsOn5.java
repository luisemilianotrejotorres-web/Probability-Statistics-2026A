public class HandsOn5 {

    public static void main(String[] args) {

        double datos[] = {
        25,30,32,35,40,42,45,47,50,52,
        55,57,60,62,65,67,70,72,75,78,
        80,82,85,87,90,92,95,97,100,102
        };

        int n = datos.length;

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

        int clases = 6;
        double rango = max - min;
        double amplitud = rango / clases;

        int f[] = new int[clases];
        double xc[] = new double[clases];

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

        System.out.println("Clase  Limite  f  Xc");

        li = min;

        for(int i=0;i<clases;i++){

            ls = li + amplitud;

            System.out.println((i+1) + "  " +
            (int)li + "-" + (int)ls + "  " +
            f[i] + "  " +
            xc[i]);

            li = ls;
        }

        double suma = 0;

        for(int i=0;i<n;i++){
            suma = suma + datos[i];
        }

        double media = suma / n;

        double mediana;
        mediana = (datos[n/2] + datos[(n/2)-1]) / 2;

        int mayor = f[0];
        int pos = 0;

        for(int i=1;i<clases;i++){
            if(f[i] > mayor){
                mayor = f[i];
                pos = i;
            }
        }

        double moda = xc[pos];

        System.out.println();
        System.out.println("Media = " + media);
        System.out.println("Mediana = " + mediana);
        System.out.println("Moda = " + moda);

    }
}

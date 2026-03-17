public class HandsOn3 {

    public static void main(String[] args) {

        double[] datos = {1.2,2.5,1.2,3.8,2.5,1.2,4.1,3.8,2.5,1.2};

        double[] clases = {1.2,2.5,3.8,4.1};
        int[] f = new int[clases.length];

        int total = datos.length;

        for(int i=0;i<datos.length;i++){
            for(int j=0;j<clases.length;j++){
                if(datos[i]==clases[j]){
                    f[j]++;
                }
            }
        }

        System.out.println("TABLA DE FRECUENCIAS");
        System.out.println("Clase   f   fr   %");

        for(int i=0;i<clases.length;i++){

            double fr = (double)f[i]/total;
            double porcentaje = fr*100;

            System.out.println(clases[i] + "   " + f[i] + "   " + fr + "   " + porcentaje + "%");
        }

        System.out.println("Total datos: " + total);
    }
}

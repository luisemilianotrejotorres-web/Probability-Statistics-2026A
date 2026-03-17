public class HandsOn1 {

    public static void main(String[] args) {

        int n = 5;

        double[] x = {1,2,3,4,5};
        double[] y = {2,4,6,8,10};

        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumX2 = 0;

        for(int i = 0; i < n; i++){

            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        double B1 = (n * sumXY - sumX * sumY) /
                    (n * sumX2 - sumX * sumX);

        double B0 = (sumY - B1 * sumX) / n;

        System.out.println("===== SIMPLE LINEAR REGRESSION =====");
        System.out.println("B0 = " + B0);
        System.out.println("B1 = " + B1);

        System.out.println("Ecuacion de Regresion:");
        System.out.println("y = " + B0 + " + " + B1 + "x");
    }
}

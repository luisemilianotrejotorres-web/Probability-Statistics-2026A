public class HandsOn2 {

    public static void main(String[] args) {

        int n = 9;

        double[] advertising = {43.60, 50.44, 59.01, 66.30, 82.36, 92.15, 100.51, 110.06, 111.51};
        double[] sales = {1261.08, 1475.28, 1657.52, 2059.05, 2303.76, 2512.64, 2751.46, 2787.67, 2939.13};

        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumX2 = 0;

        for(int i = 0; i < n; i++) {

            sumX += advertising[i];
            sumY += sales[i];
            sumXY += advertising[i] * sales[i];
            sumX2 += advertising[i] * advertising[i];
        }

        double B1 = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);

        double B0 = (sumY - B1 * sumX) / n;

        System.out.println("===== ECUACION DE REGRESION =====");
        System.out.println("Sales = " + B0 + " + (" + B1 + " * Advertising)");
        System.out.println();

        double[] newAdvertising = {60, 75, 90, 105, 120};

        System.out.println("===== PREDICCIONES =====");

        for(int i = 0; i < 5; i++) {

            double predictedSales = B0 + B1 * newAdvertising[i];

            System.out.println("Advertising = " + newAdvertising[i] +
                               " -> Predicted Sales = " + predictedSales);
        }
    }
}

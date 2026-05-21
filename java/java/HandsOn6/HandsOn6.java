public class HandsOn6 {

    public static void main(String[] args) {

        double total = 18;

        double lluviaYNublado = 7;
        double lluviaYNoNublado = 3;
        double noLlueveYNublado = 2;
        double noLlueveYNoNublado = 6;

        double nublado = 9;
        double noNublado = 9;

        double llueve = 10;
        double noLlueve = 8;

        System.out.println("===== PROBABILIDAD MARGINAL =====");

        double pNublado = nublado / total;
        double pLlueve = llueve / total;

        System.out.println("P(A) Nublado = " + pNublado);
        System.out.println("P(B) Llueve = " + pLlueve);

        System.out.println();

        System.out.println("===== PROBABILIDAD CONJUNTA =====");

        double pAyB = lluviaYNublado / total;

        System.out.println("P(A y B) = " + pAyB);

        System.out.println();

        System.out.println("===== PROBABILIDAD CONDICIONAL =====");

        double pBgivenA = lluviaYNublado / nublado;

        System.out.println("P(B|A) = " + pBgivenA);
    }
}

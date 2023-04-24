package Trigonometria;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int hip, catOp, catAdj, anguloInterno;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    /*Seno de 30°, 60° e 90° = 1/2 (0,5), √2/2, √3/2
    * Cosseno de 30°, 60° e 90° = √3/2, √2/2, 1/2 (0,5)
    * Tangente de 30°, 60° e 90° = √3/3, 1, √3*/
    public static void main(String args[]){
        /*Criando os Objetos*/
        criando();

        Object valorhip = hip;
        Object valorCatOp = catOp;
        Object valorCatAdj = catAdj;

        int medidaX = random.nextInt(1, 4);

        switch (medidaX){
            case 1:
                String hipString = Integer.toString(hip);
                hipString = "?";
                valorhip = hipString;
                break;
            case 2:
                String catOpString = Integer.toString(catOp);
                catOpString = "?";
                valorCatOp = catOpString;
                break;
            case 3:
                String catAdjString = Integer.toString(catAdj);
                catAdjString = "?";
                valorCatAdj = catAdjString;
                break;
        }

        /*Verificando as medidas e identificando medida desconhecida*/
        if (valorhip instanceof String){
            System.out.println("Hipotenusa: " + valorhip);
        } else {
            System.out.println("Hipotenusa: " + valorhip);
        }

        if (valorCatOp instanceof String){
            System.out.println("Cateto Oposto: " + valorCatOp);
        } else {
            System.out.println("Cateto Oposto: " + valorCatOp);
        }

        if (valorCatAdj instanceof String){
            System.out.println("Cateto Adjacente: " + valorCatAdj);
        } else {
            System.out.println("Cateto Adjacente: " + valorCatAdj);
        }
        System.out.println("Angulo Interno: " + anguloInterno+ "\n");

        System.out.println("Qual método (SOH CAH TOA) você vai usar para descobrir o valor da medida?:\n[1]SOH [2]CAH [3]TOA\n");
        int metodo = scanner.nextInt();

        double metodoNovo = metodoUsado(metodo);

        //System.out.println(Math.round(Math.sqrt(3) * 10.0)/ 10.0);
    }

    public static double metodoUsado(int metodo){
        switch (metodo){
            case 1:
                if (anguloInterno == 30){
                    anguloInterno = (int) 0.5;
                } else if (anguloInterno == 60) {
                    anguloInterno = (int) 0.7;
                } else if (anguloInterno == 90) {
                    anguloInterno = (int) 0.8;
                }
                break;
            case 2:
                if (anguloInterno == 30){
                    anguloInterno = (int) 0.8;
                } else if (anguloInterno == 60) {
                    anguloInterno = (int) 0.7;
                } else if (anguloInterno == 90) {
                    anguloInterno = (int) 0.5;
                }
                break;
            case 3:
                if (anguloInterno == 30){
                    anguloInterno = (int) 0.5;
                } else if (anguloInterno == 60) {
                    anguloInterno = 1;
                } else if (anguloInterno == 90) {
                    anguloInterno = (int) 1.7;
                }
                break;
        }
        return metodo;
    }

    public static void criando(){
        anguloInterno = 4;

        /*Criando as medidas*/
        hip = random.nextInt(1, 51);
        catOp = random.nextInt(1, 51);
        catAdj = random.nextInt(1, 51);

        int valorAnguloInterno = random.nextInt(1, 4);

        switch (valorAnguloInterno){
            case 1:
                anguloInterno = 30;
                break;
            case 2:
                anguloInterno = 60;
                break;
            case 3:
                anguloInterno = 90;
                break;
        }
    }

}

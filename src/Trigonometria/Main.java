package Trigonometria;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String args[]){
        /*Criando os Objetos*/
        ArrayList <Integer> valores = new ArrayList<Integer>();
        Random random = new Random();
        int anguloInterno = 0;

        /*Criando as medidas*/
        int hip = random.nextInt(1, 51);
        int catOp = random.nextInt(1, 51);
        int catAdj = random.nextInt(1, 51);

        Object valorhip = hip;
        Object valorCatOp = catOp;
        Object valorCatAdj = catAdj;
        
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
        System.out.println("Angulo Interno: " + anguloInterno);

    }
}

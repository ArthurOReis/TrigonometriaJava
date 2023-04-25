package Trigonometria;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Trigonometria {
    static Object hipotenusa, catetoOposto, catetoAdjacente;
    static int anguloInterno;
    public void inicio(){
        Random random = new Random(); //Instanciando Objeto random
        ArrayList<Integer> lista = new ArrayList<Integer>(); //Instanciando Objeto ArrayList

        for (int i = 0; i< 3; i++){
            int valor = random.nextInt(1, 51); //Atribui "valor" a um número aleatório de um a cinquenta
            lista.add(valor); //Adiciona os valores na lista
        }

        hipotenusa = lista.get(0);
        catetoOposto = lista.get(1);
        catetoAdjacente = lista.get(2);
        anguloInterno = random.nextInt(1, 91);

        switch (random.nextInt(1,4)){
            case 1:
                hipotenusa = "?";
                break;
            case 2:
                catetoOposto = "?";
                break;
            case 3:
                catetoAdjacente = "?";
                break;
        }

        System.out.println("Hipotenusa: "+ hipotenusa);
        System.out.println("Cateto Oposto: "+ catetoOposto);
        System.out.println("Cateto Adjacente: "+ catetoAdjacente);
        System.out.println("Ângulo Intero: "+ anguloInterno+"\n");
    }

    public void escolha(){
        Scanner scanner = new Scanner(System.in);
        Calculo c = new Calculo();

        String resposta;
        String resultadoTrigonomia;

        System.out.println("Tendo em vista os dados acima, qual método (SOH-CAH-TOA) irá utilizar para descobrir uma das medidas?:\n");
        System.out.println("DICA:\nSOH = Seno do ângulo interno/Cateto Oposto = Hipotenusa/?\nCosseno do ângulo interno/Cateto Adjacente = Hipotenusa/?\nTangente do ângulo interno/Cateto Oposto = Cateto Adjacente/?:");
        System.out.println("[1]SOH [2]CAH [3]TOA");

        try{
            resposta = Integer.toString(scanner.nextInt());
            resultadoTrigonomia = trigonomia(resposta);
            c.calculo(resultadoTrigonomia, hipotenusa, catetoOposto, catetoAdjacente);
        } catch (Exception e){
            System.out.println("Insira um valor válido!");
            escolha();
        }
    }

    public String trigonomia(String calculo){
        String realizarCalculo = null;
        switch (calculo){
            case "1":
                realizarCalculo = "Seno";
                break;
            case "2":
                realizarCalculo = "Cosseno";
                break;
            case "3":
                realizarCalculo = "Tangente";
                break;
            default:
                System.out.println("Insira um valor válido!\n");
                escolha();
        }
        return realizarCalculo;
    }
}

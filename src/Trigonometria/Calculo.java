package Trigonometria;

public class Calculo {
    public void calculo(String tipoCalculo, Object hipotenusa, Object catetoOposto, Object catetoAdjacente){
        switch (tipoCalculo){
            case "Seno":
                System.out.println("Seno");
                break;
            case "Cosseno":
                System.out.println("Cosseno");
                break;
            case "Tangente":
                System.out.println("Tangente");
                break;
        }
    }
}

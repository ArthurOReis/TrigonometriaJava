package Trigonometria;

public class Calculo {
    public double calculo(String tipoCalculo, Object hipotenusa, Object catetoOposto, Object catetoAdjacente, int anguloInterno){
        double resultado = 0;

        switch (tipoCalculo){
            case "Seno":
                double senoAngulo = seno(anguloInterno);
                double adjacenteDouble = ((int)catetoOposto * (int)hipotenusa)/senoAngulo;
                resultado = adjacenteDouble;
                break;
            case "Cosseno":
                double cossenhoAngulo = cosseno(anguloInterno);
                double opostoDouble = ((int)catetoAdjacente * (int)hipotenusa)/cossenhoAngulo;
                resultado = opostoDouble;
                break;
            case "Tangente":
                double tangenteAngulo = tangente(anguloInterno);
                double hipotenusaDouble = ((int)catetoOposto * (int)catetoAdjacente)/tangenteAngulo;
                resultado = hipotenusaDouble;
                break;
        }
        return resultado;
    }

    public double seno(int angulo) {
        double radianos = Math.toRadians(angulo);
        return Math.sin(radianos);
    }

    public double cosseno(int angulo) {
        double radianos = Math.toRadians(angulo);
        return Math.cos(radianos);
    }

    public double tangente(int angulo) {
        double radianos = Math.toRadians(angulo);
        return Math.tan(radianos);
    }
}

public class Calculadora_202311250030 {
    public float soma(float a, float b){
        return a + b;
    }

    public float subtracao(float a, float b){
        return a - b;
    }

    public float multiplicacao(float a, float b){
        return a * b;
    }

    public float divisao(float a, float b){
        if (b == 0){
            System.out.println("Warning: Divisão por zero");
            return Float.NaN;
        }

        return a / b;
    }
}

public class Adapter_Calculadora extends Calculadora_202321250008 implements Interface_Calculadora{

    @Override
    public float soma(float a, float b){
        return (float) super.somar(a, b);
    }

    @Override
    public float subtracao(float a, float b){
        return (float) super.subtrair(a, b);
    }

    @Override
    public float multiplicacao(float a, float b){
        return (float) super.multiplicar(a, b);
    }

    @Override
    public float divisao(float a, float b){

        if(b == 0){
            System.out.println("Warning: Divisão por zero");
            return Float.NaN;
        }
        return (float) super.dividir(a, b);
    }
}

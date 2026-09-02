public class Cliente_202311250030 {
    public static void main(String[] args){
        Calculadora_202311250030 calc = new Calculadora_202311250030();

        float n1 = 4.5f;
        float n2 = 2.5f;

        float soma = calc.soma(n1, n2);
        System.out.println(n1 + " + " + n2 + " = " + soma);

        float sub = calc.subtracao(n1, n2);
        System.out.println(n1 + " - " + n2 + " = " + sub);

        float mult = calc.multiplicacao(n1, n2);
        System.out.println(n1 + " * " + n2 + " = " + mult);

        float div = calc.divisao(n1, n2);
        System.out.println(n1 + " / " + n2 + " = " + div);


        System.out.println("Testando divisão por 0");
        float div0 = calc.divisao(n1, 0);
        System.out.println(n1 + " / " + 0 + " = " + div0);
    }
}

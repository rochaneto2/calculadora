public class Main {

    public static void main(String[] args) {
        var operacoesMatematicas = new OperacoesMatematicas();

        var total = operacoesMatematicas.subtracao(1.0, 1.0);

        print(total);
    }

    private static void print(final int total) {
        System.out.printf("Resultado da subtração: %d", total);
    }

}

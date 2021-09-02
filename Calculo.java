class Calculo {
    public static void main(String[] args) {
        Mes janeiro = new Mes();
        janeiro.valor = 15000;

        Mes fevereiro = new Mes();
        fevereiro.valor = 23000;

        Mes marco = new Mes();
        marco.valor = 17000;

        int soma = janeiro.valor + fevereiro.valor + marco.valor;
        System.out.printf("O total do trimestre é " + soma + "\n");

        int mediaMensal = soma / 3;
        System.out.printf("A média mensal é " + mediaMensal);

    }
}
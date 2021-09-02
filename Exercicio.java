// Exemplo:
// class Programa {
//     public static void main(String[] args) {
//       Conta minhaConta = new Conta();
//       minhaConta.dono = "Duke";
//       minhaConta.saldo = 1000.0;
//       System.out.println("Saldo atual: " + minhaConta.saldo);
//     }
//   }

//Sabendo que, em Janeiro, foram gastos 15000 reais, em Fevereiro, 23000 reais 
//e em Março, 17000 reais, faça um programa que calcula e imprime o gasto total no trimestre.
//Adicione código (sem alterar as linhas que já existem) na classe anterior para 
//imprimir a média mensal de gasto, criando uma variável mediaMensal junto com uma mensagem. 
//Para isso, concatene a String com o valor, usando "Valor da média mensal = " + mediaMensal .

class Exercicio {
    public static void main(String args[]) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        int soma = janeiro + fevereiro + marco;
        System.out.printf("O total do trimestre é " + soma + "\n");

        int mediaMensal = soma / 3;
        System.out.printf("A média mensal é " + mediaMensal);
    }
}
public class Main {
    public static void main(String[] args) {

        ContaCorrente testeCC = new ContaCorrente();
        testeCC.setNomeCliente("Cliente Conta Corrente");
        testeCC.setNumConta(0001);
        testeCC.depositar(100);
        testeCC.exibirSaldo();
        testeCC.sacar(20);
        testeCC.exibirSaldo();
        testeCC.sacar(200);
        testeCC.exibirSaldo();

        ContaPoupanca testePP = new ContaPoupanca();
        testePP.setNomeCliente("Cliente Conta Poupança");
        testePP.setNumConta(0002);
        testePP.depositar(200);
        testePP.exibirSaldo();
        testePP.sacar(10);
        testePP.exibirSaldo();
        testePP.sacar(300);
        testePP.exibirSaldo();

        ContaEspecial testeCE = new ContaEspecial();
        testeCE.setNomeCliente("Cliente Conta Especial");
        testeCE.setNumConta(0003);
        testeCE.depositar(500);
        testeCE.exibirSaldo();
        testeCE.sacar(150);
        testeCE.exibirSaldo();
        testeCE.sacar(400);
        testeCE.exibirSaldo();

    }
}
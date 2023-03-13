import java.util.Scanner;

public class ContaEspecial extends Conta {
    Scanner entrada = new Scanner(System.in);
    private double saldoCCE;
    private double saldoPPE;

    @Override
    public double depositar(double valor) {
       System.out.print("Digite (CC) para corrente ou (PP) para poupança: ");
       String resposta = entrada.nextLine();

       if (resposta.equals("CC")){
           this.saldoCCE += valor;
       }

            else if (resposta.equals("PP")) {
                 this.saldoPPE += valor + (valor * 0.005);
       }
                    else {
                       depositar(valor);
       }

        return 0;
    }

    @Override
    public double sacar(double valor) {
        System.out.print("Digite (CC) para corrente ou (PP) para poupança: ");
        String resposta = entrada.nextLine();

        if (resposta.equals("CC")) {
            this.saldoCCE -= valor;
        }
            else if(resposta.equals("PP")) {
                if (saldoPPE >= valor) {
                this.saldoPPE -= valor;
            }
                else {
                System.out.println("Saldo insuficiente para saque desse valor");
            }
        }
                    else{
                        sacar(valor);
                    }

        return 0;
    }

    public double getSaldoCCE() {
        return saldoCCE;
    }

    public void setSaldoCCE(double saldoCCE) {
        this.saldoCCE = saldoCCE;
    }

    public double getSaldoPPE() {
        return this.saldoPPE;
    }

    public void setSaldoPPE(double saldoPPE) {
        this.saldoPPE = saldoPPE;
    }

    @Override
    public void exibirSaldo() {

        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Numero Conta: " + this.getNumConta());
        System.out.println("Saldo corrente: " + this.saldoCCE);
        System.out.println("Saldo poupança: " + this.saldoPPE);
    }
}

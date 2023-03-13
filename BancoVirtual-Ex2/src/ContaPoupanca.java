public class ContaPoupanca extends Conta {

    private double saldoPP;

    public double depositar (double valor){
        saldoPP += valor;
        return saldoPP;
    }

    public double sacar (double valor){
        if(saldoPP > valor) {
            saldoPP -= valor;
        }
        else{
               System.out.println("Saldo insuficiente para saque desse valor");
            }

        return saldoPP;    }

    public void exibirSaldo(){
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Numero Conta: " + this.getNumConta());
        System.out.println("Saldo: " + saldoPP);
    }

    public double getSaldoPP() {
        return saldoPP;
    }

    public void setSaldoPP(double saldoPP) {
        this.saldoPP = saldoPP;
    }
}

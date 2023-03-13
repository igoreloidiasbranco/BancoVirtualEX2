public class ContaCorrente extends Conta {

    private double saldoCC;

    @Override
    public double depositar (double valor){
        saldoCC += valor;
        return saldoCC;
    }

    @Override
    public double sacar (double valor){
        if (saldoCC > valor) {
            saldoCC -= valor;
        }
            else {
                System.out.println("Saldo insuficiente para saque desse valor");
            }



        return saldoCC;
    }

    @Override
    public void exibirSaldo(){

        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Numero Conta: " + this.getNumConta());
        System.out.println("Saldo: " + saldoCC);
    }

    public double getSaldoCC() {
        return saldoCC;
    }

    public void setSaldoCC(double saldoCC) {
        this.saldoCC = saldoCC;
    }
}


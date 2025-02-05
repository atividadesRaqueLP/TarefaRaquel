//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double saldo = 100.00;
        double valor = 1;

        if(valor < saldo){
            throw new ValorMaiorSaldo("O valor é menor que o saldo");
        }

    }
}
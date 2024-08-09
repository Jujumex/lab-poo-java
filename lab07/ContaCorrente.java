package lab07;

public class ContaCorrete{
    String usuario;
    String senha;
    double saldo;
    String agencia;

    // int, boolean, char, flout, double

    String realizarExtrato(){
        return "Seu extrato de saldo é" + saldo;
    }

    void depositar(double valor){
        saldo += valor;
    }
}
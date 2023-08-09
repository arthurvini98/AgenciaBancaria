package banco;

public class Main {
    public static void main(String[] args) {
        AgenciaBancaria agencia = new AgenciaBancaria(1);

        ContaBancaria conta1 = new ContaBancaria(101, "João", 1000.0);
        ContaBancaria conta2 = new ContaBancaria(102, "Maria", 1500.0);

        agencia.adicionarConta(conta1);
        agencia.adicionarConta(conta2);

        ContaBancaria contaEncontrada = agencia.buscarConta(101);
        if (contaEncontrada != null) {
            System.out.println("Conta encontrada: " + contaEncontrada.getNomeTitular());
            contaEncontrada.depositar(500.0);
            contaEncontrada.sacar(200.0);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}
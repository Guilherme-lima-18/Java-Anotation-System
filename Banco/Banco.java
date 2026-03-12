package Banco;
import java.util.ArrayList;

class Banco {

    private ArrayList<Conta> contas = new ArrayList<>();

    public void AddConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(int numero) {
        for (Conta c : contas) {
            if (c.getNumConta() == numero) {
                return c;
            }
        }
        return null;
    }

    public void ListaConta() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (Conta c : contas) {
                System.out.println("---------------------");
                c.mostrarConta();
                System.out.println("---------------------");
            }
        }
    }
}
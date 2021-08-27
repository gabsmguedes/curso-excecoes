package fluxo;

public class TestaContaComExececaoChecked {

    public static void main(String[] args) {
        Conta conta = new Conta();
        try {
            conta.deposita();
        } catch (MinhaExcecao ex) {
            System.err.println("tratamento...");
        }
    }
}

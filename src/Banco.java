import java.util.HashMap;

public class Banco {
    private String nombre;
    private int cod;
    private HashMap<String, Integer> clientes;

    public Banco(String nombre, int cod) {
        this.clientes = new HashMap<>(50);
        this.nombre = nombre;
        this.cod = cod;
    }


    public void crearCuentaDeposito(String codigo, int interes) throws Exception {
        if (clientes.containsKey(codigo)) {
            throw new Exception("Ya existe cuenta con ese codigo");
        } else if (!clientes.containsKey(codigo)) {
            CuentaDeposito c = new CuentaDeposito(codigo, interes);

        }
    }

}

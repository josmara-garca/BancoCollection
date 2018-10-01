

public class CuentaVerde extends Cuenta{

    public CuentaVerde (String codigo){
        super (codigo);
    }

    @Override
    public double ingresar(double cantidad) {
        saldo = saldo + cantidad;
        return saldo;
    }

    @Override
    public double sacar(double cantidad) {
        double reintegro;
        reintegro = cantidad - (saldo * 0.03);
        saldo = saldo - reintegro;
        return saldo;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }
}

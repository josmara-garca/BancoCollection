

public class CuentaDeposito extends Cuenta{

    int interes;

    public CuentaDeposito (String codigo, int interes){
        super(codigo);
        this.interes = interes;

    }

    @Override
    public double ingresar(double cantidad) {
        double ingreso;
        if (cantidad > 1000){
            ingreso = cantidad + (cantidad * (interes / 100));
        }else{
            ingreso = cantidad;
        }
        saldo = saldo + ingreso;
        return saldo;
    }

    @Override
    public double sacar(double cantidad) {
        double reintegro;
        if (cantidad < 500){
            reintegro = cantidad - 5;
        }else{
            reintegro = cantidad - (cantidad * 0.01);
        }
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

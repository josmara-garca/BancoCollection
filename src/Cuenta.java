

public abstract class Cuenta {

    String codigo;
    double saldo;

    public Cuenta (String codigo){
        this.codigo = codigo;
    }

    public abstract double ingresar (double cantidad);

    public abstract double sacar (double cantidad);

    public double getSaldo (){
        return saldo;
    }
    @Override
    public boolean equals (Object o){
        if (o instanceof Cuenta){
            Cuenta c = (Cuenta) o;
            return c.codigo.equalsIgnoreCase(this.codigo);
        }
        return false;
    }

    public String getCodigo (){
        return codigo;
    }



}


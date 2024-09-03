package preparacionFinal.LoberiaAlquila;

public class ElemVencimiento extends ElemSimple{
    int mesesVigencia;
    static double descuento; //se asume que viene en formato 0,x

    public ElemVencimiento(int mesesVigencia, String descripcion, int antiguedad, int id, double valor, double descuento) {
        super(descripcion, valor, id, antiguedad);
        this.mesesVigencia = mesesVigencia;
        ElemVencimiento.descuento= descuento;
    }
    public ElemVencimiento(int mesesVigencia, String descripcion, int antiguedad, int id, double valor) {
        super(descripcion, valor, id, antiguedad);
        this.mesesVigencia = mesesVigencia;
    }

    public static double getDescuento() {
        return descuento;
    }

    public static void setDescuento(double descuento) {
        ElemVencimiento.descuento = descuento;
    }

    public int getMesesVigencia() {
        return mesesVigencia;
    }

    public void setMesesVigencia(int mesesVigencia) {
        this.mesesVigencia = mesesVigencia;
    }
    @Override
    public double getValor(){
        if(antiguedad>mesesVigencia){
            return valor - (antiguedad-mesesVigencia*(valor*descuento));
        }else{
            return valor;
        }
    }
}

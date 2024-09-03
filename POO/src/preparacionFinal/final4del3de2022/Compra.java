package preparacionFinal.final4del3de2022;

import java.time.LocalDate;

public class Compra {
    Cliente cliente;
    Libro compra;
    LocalDate fecha;
    double monto;

    public Compra(Cliente cliente, Libro compra) {
        this.cliente = cliente;
        this.compra = compra;
        this.monto= compra.getPrecio();
        this.fecha = LocalDate.now();
    }

    public double getMonto() {
        return monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Libro getCompra() {
        return compra;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setCompra(Libro compra) {
        this.compra = compra;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

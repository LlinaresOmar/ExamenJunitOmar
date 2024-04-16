package es.iesmz.tests;

public class Money {

    //Atributos
    private float cantidad;
    private TipoMoneda tipo;

    //Tipos de cambio
    final double K_EURaUSD = 1.18798;
    final double K_USDaEUR = 0.841845;

    final double K_EURaGBP = 0.857839;
    final double K_GBPaEUR = 1.165826;

    public Money(float cantidad, TipoMoneda tipo) {
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public float getCantidad() {
        return cantidad;
    }

    public TipoMoneda getTipo() {
        return tipo;
    }

    public float change(TipoMoneda origen, TipoMoneda destino, float cantidad){
        return 1;
    }
}

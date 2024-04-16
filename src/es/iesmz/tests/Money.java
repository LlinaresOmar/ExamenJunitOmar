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

    public Money() {
    }

    public float getCantidad() {
        return cantidad;
    }

    public TipoMoneda getTipo() {
        return tipo;
    }

    public float change(TipoMoneda origen, TipoMoneda destino, float money){
        float cambio = 0;
        if ((!origen.toString().equals("EUR") && !origen.toString().equals("USD") && !origen.toString().equals("GBP")) ||
                (!destino.toString().equals("EUR") && !destino.toString().equals("USD") && !destino.toString().equals("GBP"))
                || money < 0){
            cambio = -1;
        } else {

        }
        return cambio;
    }
}

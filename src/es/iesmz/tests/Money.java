package es.iesmz.tests;

public class Money {


    //Tipos de cambio
    final float K_EURaUSD = 1.18798f;
    final float K_USDaEUR = 0.841845f;

    final float K_EURaGBP = 0.857839f;
    final float K_GBPaEUR = 1.165826f;

    public Money() {
    }

    public float change(TipoMoneda origen, TipoMoneda destino, float money){
        float cambio = 0;
        if (!comprobarDatos(origen, destino, money)){
            cambio = -1;
        } else {
            if (origen.toString().equals("EUR")){
                if (destino.toString().equals("USD")){
                    cambio = (money*K_EURaUSD);
                } else if (destino.toString().equals("GBP")){
                    cambio = (money*K_EURaGBP);
                }
            } else if (origen.toString().equals("USD")){
                if (destino.toString().equals("EUR")){
                    cambio = (money*K_USDaEUR);
                } else if (destino.toString().equals("GBP")){
                    cambio = ((money*K_USDaEUR)*K_EURaGBP);
                }
            } else if (origen.toString().equals("GBP")){
                if (destino.toString().equals("EUR")){
                    cambio = money*K_GBPaEUR;
                } else if (destino.toString().equals("USD")){
                    cambio = (money*K_GBPaEUR)*K_EURaUSD;
                }
            }
        }
        return cambio;
    }

    private boolean comprobarDatos(TipoMoneda origen, TipoMoneda destino, float money){
        boolean datosCorrectos = true;
        if ((!origen.toString().equals("EUR") && !origen.toString().equals("USD") && !origen.toString().equals("GBP")) ||
                (!destino.toString().equals("EUR") && !destino.toString().equals("USD") && !destino.toString().equals("GBP"))
                || money < 0){
            datosCorrectos = false;
        }
        return datosCorrectos;
    }

    private float cambiosEuros(TipoMoneda origen, TipoMoneda destino, float money){

        return 0;
    }

}

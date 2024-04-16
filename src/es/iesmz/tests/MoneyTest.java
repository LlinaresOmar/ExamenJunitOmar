package es.iesmz.tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void TestEURaUSD1 (){
        Money money = new Money();
        assertEquals(28.37f, money.change(TipoMoneda.EUR, TipoMoneda.USD, 23.88f));
    }

    @Test
    void TestGBPaEUR1 (){
        Money money = new Money();
        assertEquals(1165.83f, money.change(TipoMoneda.GBP, TipoMoneda.EUR, 1000f));
    }

    @Test
    void TestEURaGBP1 (){
        Money money = new Money();
        assertEquals(201.21f, money.change(TipoMoneda.EUR, TipoMoneda.GBP, 234.56f));
    }

    @Test
    void TestUSDaEUR1 (){
        Money money = new Money();
        assertEquals(37.51f, money.change(TipoMoneda.USD, TipoMoneda.EUR, 44.56f));
    }

    @Test
    void TestGBPaUSD1 (){
        Money money = new Money();
        assertEquals(138.49f, money.change(TipoMoneda.GBP, TipoMoneda.USD, 100f));
    }

    @Test
    void TestUSDaGBP1 (){
        Money money = new Money();
        assertEquals(722.14f, money.change(TipoMoneda.USD, TipoMoneda.GBP, 1000f));
    }

    @Test
    void TestPTSaEUR1 (){
        Money money = new Money();
        assertEquals(-1f, money.change(TipoMoneda.PTS, TipoMoneda.EUR, 100.0f));
    }

    @Test
    void TestEURaPTS (){
        Money money = new Money();
        assertEquals(-1f, money.change(TipoMoneda.EUR, TipoMoneda.PTS, 123.3f));
    }

    @Test
    void TestUSDaPTS(){
        Money money = new Money();
        assertEquals(-1f, money.change(TipoMoneda.USD, TipoMoneda.EUR, -167.34f));
    }

}
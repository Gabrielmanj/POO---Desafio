package estabelecimento;

import com.loja.phones.model.AparelhoTelefonico;
import com.loja.phones.model.NavegadorInternet;
import com.loja.phones.model.ReprodutorMusical;
import multifuncional.Iphone;

public class Fabrica {
    public static void main(String[] args) {
        Iphone apple = new Iphone();
        ReprodutorMusical reproduzir = apple;
        NavegadorInternet navegar = apple;
        AparelhoTelefonico aparelho = apple;

        reproduzir.reproduzir();
        navegar.navegar();
        aparelho.aparelho();
    }
}

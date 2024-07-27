package multifuncional;

import com.loja.phones.model.AparelhoTelefonico;
import com.loja.phones.model.NavegadorInternet;
import com.loja.phones.model.ReprodutorMusical;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    public void aparelho() {
        System.out.println("LIGANDO VIA APARELHO IPHONE");
        System.out.println("ATENDENDO VIA APARELHO IPHONE");
        System.out.println("INICIANDO CORREIO DE VOZ VIA APARELHO IPHONE");
    }

    public void navegar() {
        System.out.println("EXIBINDO PAGINA VIA APARELHO IPHONE");
        System.out.println("ADICIONANDO NOVA ABA VIA APARELHO IPHONE");
        System.out.println("ATUALIZANDO PAGINA VIA APARELHO IPHONE");
    }

    public void reproduzir() {
        System.out.println("APARELHO IPHONE TOCANDO ");
        System.out.println("PAUSANDO APARELHO IPHONE");
        System.out.println("SELECIONANDO MUSICA VIA APARELHO IPHONE");
    }
}

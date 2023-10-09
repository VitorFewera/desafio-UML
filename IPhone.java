public interface ReprodutorMusical{
    void tocar();
    void pausar();
    void selecionarMusica();
}

public interface AparelhoTelefonico{
    boolean ligar();
    boolean atender();
    String iniciarCorrerioVoz();
}

public interface NavegadorInternet{
    String exibirPagina();
    void adicionarNovaAba();
    void atualizaPAgina();
}

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @java.lang.Override
    public void tocar() {

    }

    @java.lang.Override
    public void pausar() {

    }

    @java.lang.Override
    public void selecionarMusica() {

    }

    @java.lang.Override
    public boolean ligar() {
        return false;
    }

    @java.lang.Override
    public boolean atender() {
        return false;
    }

    @java.lang.Override
    public String iniciarCorrerioVoz() {
        return null;
    }

    @java.lang.Override
    public String exibirPagina() {
        return null;
    }

    @java.lang.Override
    public void adicionarNovaAba() {

    }

    @java.lang.Override
    public void atualizaPAgina() {

    }
}
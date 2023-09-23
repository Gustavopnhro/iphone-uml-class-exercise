interface AparelhoTelefonico {

    Navegador navegador = new Navegador();

    void ligar(String numero);
    void atender(String numero);
    void iniciarCorreioVoz(String numero);

}

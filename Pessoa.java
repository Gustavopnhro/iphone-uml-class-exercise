public class Pessoa {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        // iphone.adicionarNovaAba();
        // iphone.adicionarNovaAba();

        // iphone.adicionarNumero("999999999");
        // iphone.iniciarCorreioVoz("999999999");
        // iphone.removerNumero("999999999");
        // iphone.iniciarCorreioVoz("999999999");

        // iphone.exibirPagina("www.google.com");

        iphone.adicionarMusica("Radiohead - Creep");
        iphone.adicionarMusica("Coldplay - Viva la Vida");
        iphone.selecionarMusica("Radiohead - Creep");
        iphone.tocar();
        iphone.removerMusica("Radiohead - Creep");
        iphone.selecionarMusica("Coldplay - Viva la Vida");
        iphone.tocar();
        iphone.sair();
    }
}

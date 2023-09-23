import java.util.ArrayList;
import java.util.List;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    Navegador navegador = new Navegador();
    List <String> listaTelefonica = new ArrayList<String>();
    List <String> listaMusicas = new ArrayList<String>();
    String musica = "";
    

    //Escopo de Reprodutor Musical
     void adicionarMusica(String musica){
        if (listaMusicas.contains(musica)){
            System.out.println("Essa música já existe");
        } else {
            listaMusicas.add(musica);
        }
    }

     void removerMusica(String musica){
        if (listaMusicas.contains(musica)){
            listaMusicas.remove(musica);
            sair();
        } else {
            System.out.println("Musica inexistente na sua lista");
        }
    }


    //Escopo de Ligações
    void adicionarNumero(String numero){
        if (numero.length() == 9 ){
            listaTelefonica.add(numero);
        } else {
            System.out.println("Numero inválido");
        }
    }

     void removerNumero(String numero){
        if (listaTelefonica.contains(numero)){
            listaTelefonica.remove(numero);
        } else {
            System.out.println("Numero inexistente na sua agenda");
        }
    }



    @Override
    public void ligar(String numero){
        if (listaTelefonica.contains(numero)) {
            System.out.println("Ligando para " + numero);
        } else {
            System.out.println("Este número não existe na sua agenda");
        }
    }

    public void atender(String numero){
        if (listaTelefonica.contains(numero)){
            System.out.println("Atendendo o número conhecido " + numero);
        } else {
            System.out.println("Atendendo o número desconhecido "+ numero);
        }
    }

    public void iniciarCorreioVoz(String numero){
        if (listaTelefonica.contains(numero)){
            System.out.println("Iniciando correio de voz para " + numero);
        } else {
            System.out.println("Este número não existe na sua agenda");
        }
    }


    //Escopo de Navegação
    @Override
    public void exibirPagina(String url){
        System.out.println("Acessando o "+ url);
    }

    public void adicionarNovaAba(){
        navegador.adicionarNovaAba();
        System.out.println("Adicionando uma nova aba no " + navegador.getNome());
        System.out.println("Total de " + navegador.getAba());
    }


    //Escopo de Reprodutor Musical
    @Override

    public void tocar(){
        if (musica.length() == 0){
            System.out.println("Nenhuma música foi selecionada");
        } else {
            System.out.println("Tocando: " + musica);
        }
    };
    public void pausar(){
        if (musica.length() == 0){
            System.out.println("Nenhuma música foi selecionada");
        } else {
            System.out.println("Parando: " + musica);
        }
    };

    public void sair(){
        if (musica.length() == 0){
            System.out.println("Nenhuma música foi selecionada");
        } else {
            System.out.println("Saindo do player");
            this.musica = "";
        }

    };
    public void selecionarMusica(String musica){
        if (listaMusicas.contains(musica)){
            this.musica = musica;
        } else {
            System.out.println("Esta musica não existe na sua lista");
        }
    };
}

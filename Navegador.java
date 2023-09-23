public class Navegador {
    String nome = "Netscape";
    int aba;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getAba() {
        return aba;
    }

    public void adicionarNovaAba(){
        aba ++;
    }
}
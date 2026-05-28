import java.util.ArrayList;

public class Loja {
    private String nome;
    private ArrayList<Jogo> jogos = new ArrayList<>();

    public Loja(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
    }

    public void loja() {
        for (Jogo jogo : jogos) System.out.println(jogo);
    }
}

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Jogo> biblioteca = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addBiblioteca(Jogo jogo){
        this.biblioteca.add(jogo);
    }

    public void removerBiblioteca(Jogo jogo){
        this.biblioteca.remove(jogo);
    }

    public ArrayList<Jogo> biblioteca(){
        System.out.println("Usuário: " + this.nome);
        System.out.println("---Biblioteca---");
        for (Jogo jogo : biblioteca) System.out.println(jogo.getTitulo());
        System.out.println("----------------");
        return this.biblioteca;
    }

    public void comprarJogo(Jogo jogo){
        this.biblioteca.add(jogo);
    }
}

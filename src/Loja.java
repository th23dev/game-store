import java.util.ArrayList;

public class Loja {
    private String nome;
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Jogo> loja = new ArrayList<>();

    public Loja(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void addUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario){
        this.usuarios.remove(usuario);
    }

    public void addJogo(Jogo jogo){
        this.loja.add(jogo);
    }

    public void removerJogo(Jogo jogo){
        this.loja.remove(jogo);
    }

    public ArrayList<Jogo> loja(){
        System.out.println(this.nome);
        System.out.println("---Loja---");
        for (Jogo jogo : loja) System.out.println(jogo.getTitulo());
        System.out.println("----------");
        return this.loja;
    }
}

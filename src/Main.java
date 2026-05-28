public class Main {
    public static void main(String[] args) {
        Loja steam = new Loja("Steam");

        Jogo minecraft = new Jogo("Minecrafit");
        Jogo terraria = new Jogo("Terraria");
        Jogo bloonsTd6 = new Jogo("BloonsTd6");

        steam.getJogos().add(minecraft);
        steam.getJogos().add(terraria);
        steam.getJogos().add(bloonsTd6);

        steam.loja();
    }
}
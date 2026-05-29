public class Main {
    public static void main(String[] args) {

        // Testando as classes
        Loja steam = new Loja("Steam");

        Usuario thaua23sl = new Usuario("Thaua23sl");
        Usuario lucas = new Usuario("Lucas");
        Usuario royal = new Usuario("Royal Games");

        steam.addUsuario(thaua23sl);
        steam.addUsuario(lucas);
        steam.addUsuario(royal);

        Jogo terraria = new Jogo("Terraria");
        Jogo minecraft = new Jogo("Minecraft");
        Jogo csGo = new Jogo("CSGO");
        Jogo descender = new Jogo("Descenders");
        Jogo hytale = new Jogo("Hytale");

        steam.addJogo(terraria);
        steam.addJogo(minecraft);
        steam.addJogo(csGo);
        steam.addJogo(descender);
        steam.addJogo(hytale);

        steam.loja();

        thaua23sl.comprarJogo(terraria);
        thaua23sl.comprarJogo(hytale);
        thaua23sl.comprarJogo(descender);

        thaua23sl.biblioteca();

        lucas.comprarJogo(csGo);
        lucas.comprarJogo(minecraft);
        lucas.comprarJogo(terraria);

        lucas.biblioteca();

        royal.comprarJogo(csGo);
        royal.comprarJogo(minecraft);
        royal.comprarJogo(terraria);

        royal.biblioteca();
    }
}

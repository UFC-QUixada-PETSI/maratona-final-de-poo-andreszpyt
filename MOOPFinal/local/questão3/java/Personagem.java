
public abstract class Personagem {
    String nome;
    int vida;
    int estamina;
    Arma arma;


    public Personagem(String nome, int vida, int estamina, Arma arma) {
        this.nome = nome;
        this.vida = vida;
        this.estamina = estamina;
        this.arma = arma;
    }

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String equipar(Arma p) {
        this.arma = p;
        return nome + " equipou " + p.getNome();
    }
    public abstract boolean atacar();

    public void descansar() {
        System.out.println(nome+"descansou. Estamina: "+ estamina);
    }
}


public class Cavaleiro extends Personagem{
    int dano;
    Arma arma;

    public Cavaleiro(String nome, int vida, int estamina, Arma arma, int dano) {
        super(nome, vida, estamina, arma);
        this.dano = dano;
    }
    public Cavaleiro(String nome) {
        super(nome);
        this.dano = dano;
    }

    @Override
    public boolean atacar() {
        if(estamina < 10){
            throw new SemEstaminaException(nome + " está exausto e não consegue se mover!");
        }
        estamina -= 10;
        dano = arma.danoBase + 5;
        return false;
    }
}

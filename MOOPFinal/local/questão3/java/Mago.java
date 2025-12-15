
public class Mago extends Personagem{
    int dano;
    Arma arma;



    public Mago(String nome, int vida, int estamina, Arma arma, int dano, Arma arma1) {
        super(nome, vida, estamina, arma);
        this.dano = dano;
        this.arma = arma1;
    }



    public Mago(String nome) {
        super(nome);
        this.dano = dano;
    }

    @Override
    public boolean atacar() {
        if(estamina < 25){
            throw new SemEstaminaException(nome + " está exausto e não consegue se mover!");
        }
        estamina -= 25;
        dano = arma.danoBase + 10;
        return false;
    }
}

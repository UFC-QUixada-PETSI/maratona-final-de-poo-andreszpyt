
public class Espada extends Arma{
    int afiacao;
    int dano;

    public Espada(String nome, int danoBase, int durabilidade) throws ArmaQuebradaException{
        super(nome, danoBase, durabilidade);
        this.afiacao = afiacao;
    }

    @Override
    public void calcularDano() {
        if(dano <= 0){
            throw new ArmaQuebradaException("Arma quebrada!");
        }
        dano = danoBase + afiacao;
        durabilidade -= 5;
    }
}

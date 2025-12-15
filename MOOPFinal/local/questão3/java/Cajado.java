
public class Cajado extends Arma{
    double dano;
    double poderMagico;

    public Cajado(String nome, int danoBase, int durabilidade) throws ArmaQuebradaException {
        super(nome, danoBase, durabilidade);
    }

    @Override
    public void calcularDano() {
        
    }

    public void afiacao() {
        if(durabilidade <= 0){
            throw new ArmaQuebradaException("Arma quebrada!");
        }
        dano = danoBase + (poderMagico/2.0);
        durabilidade -= 10;
    }
}

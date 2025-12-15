
public abstract class Arma {
    String nome;
    int danoBase;
    int durabilidade;

    public Arma(String nome, int danoBase, int durabilidade) {
        this.nome = nome;
        this.danoBase = danoBase;
        this.durabilidade = 100;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "nome='" + nome + '\'' +
                ", danoBase=" + danoBase +
                ", durabilidade=" + durabilidade +
                '}';
    }

    public void equipar(Arma x) {

    }

    public abstract void calcularDano();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }
}

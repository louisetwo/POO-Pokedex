package POO;

public class Pokemon {    // Atributos de um Pokemon
    String Nome;
    int Pokenumber;
    String habilidade;
    String tipo;

    // Método Construtor

    public Pokemon(String nome, int pokenumber, String habilidade, String tipo) {
        Nome = nome;
        Pokenumber = pokenumber;
        this.habilidade = habilidade;
        this.tipo = tipo;
    }


    // Getters e Setters

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getPokenumber() {
        return Pokenumber;
    }

    public void setPokenumber(int pokenumber) {
        Pokenumber = pokenumber;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
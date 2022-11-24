public class Categoria extends Relatorio {

    private String nome;

    public Categoria(String descricao, String nome){
        super(descricao);
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getRelatorio() {
        return "Categoria: " + this.getNome() + "- Descrição: " + this.getDescricao() + "\n";
    }


}

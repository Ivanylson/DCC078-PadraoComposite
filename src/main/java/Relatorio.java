public abstract  class Relatorio {

    private String descricao;

    public Relatorio(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public abstract String getRelatorio();

}

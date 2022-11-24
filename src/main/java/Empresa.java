public class Empresa {

    private Relatorio relatorio;

    public void setRelatorio(Relatorio relatorio){
        this.relatorio = relatorio;
    }

    public String getRelatorio(){
        if(this.relatorio == null){
            throw new NullPointerException("Relatório não encontrado");
        }
        return this.relatorio.getRelatorio();
    }
}

import java.util.ArrayList;
import java.util.List;

public class Tag extends Relatorio {
    private List<Relatorio> relatorios;

    public Tag(String descricao){
        super(descricao);
        this.relatorios = new ArrayList<Relatorio>();
    }

    public void adiconaRelatorio(Relatorio relatorio){
        this.relatorios.add(relatorio);
    }

    public String getRelatorio(){
        String end = "";
        end = "Tag: " + this.getDescricao() + "\n";
        for (Relatorio relatorio : relatorios) {
            end += relatorio.getRelatorio();
        }
        return end;
    }
}

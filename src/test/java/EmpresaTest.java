import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetonarRelatorio(){
        Tag tag1 = new Tag("Tag1");

        Tag tag2 = new Tag("Tag2");
        Categoria categoria21 = new Categoria("Serviços", "Food");
        tag2.adiconaRelatorio(categoria21);

        Tag endTag = new Tag("Todas as tags");
        endTag.adiconaRelatorio(tag1);
        endTag.adiconaRelatorio(tag2);

        Empresa empresa = new Empresa();
        empresa.setRelatorio(endTag);

        assertEquals("Tag: Todas as tags\n" + "Tag: Tag1\n" + "Tag: Tag2\n" + "Categoria: Food- Descrição: Serviços\n", empresa.getRelatorio());
    }
    @Test
    void deveRetonarExcecaoEmpresa(){
        try{
            Empresa empresa = new Empresa();
            empresa.getRelatorio();
            fail();
        }catch (NullPointerException e){
            assertEquals("Relatório não encontrado", e.getMessage());
        }
    }

}
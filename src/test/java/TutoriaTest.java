import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TutoriaTest {
    @Test
    void deveRetornarPrecoTutoria() {
        Tutoria tutoria = new TutoriaEnem(100.0f);

        assertEquals(100.0f, tutoria.getPreco());
    }

    @Test
    void deveRetornarPrecoTutoriaComCorrecaoDeExercicios() {
        Tutoria tutoria = new CorrecaoDeExercicios(new TutoriaEnem(100.0f));

        assertEquals(130.0f, tutoria.getPreco());
    }

    @Test
    void deveRetornarPrecoTutoriaComMaterialComplementar() {
        Tutoria tutoria = new MaterialComplementar(new TutoriaEnem(100.0f));

        assertEquals(115.0f, tutoria.getPreco());
    }

    @Test
    void deveRetornarPrecoTutoriaComSimuladoExclusivo() {
        Tutoria tutoria = new SimuladoExclusivo(new TutoriaEnem(100.0f));

        assertEquals(150.0f, tutoria.getPreco());
    }

    @Test
    void deveRetornarPrecoTutoriaComCorrecaoDeExerciciosMaisMaterialComplementar() {
        Tutoria tutoria = new CorrecaoDeExercicios(new MaterialComplementar(new TutoriaEnem(100.0f)));

        assertEquals(145.0f, tutoria.getPreco());
    }

    @Test
    void deveRetornarPrecoTutoriaComCorrecaoDeExerciciosMaisSimuladoExclusivo() {
        Tutoria tutoria = new CorrecaoDeExercicios(new SimuladoExclusivo(new TutoriaEnem(100.0f)));

        assertEquals(180.0f, tutoria.getPreco());
    }

    @Test
    void deveRetornarPrecoTutoriaComMaterialComplementarMaisSimuladoExclusivo() {
        Tutoria tutoria = new MaterialComplementar(new SimuladoExclusivo(new TutoriaEnem(100.0f)));

        assertEquals(165.0f, tutoria.getPreco());
    }

    @Test
    void deveRetornarPrecoTutoriaComCorrecaoDeExerciciosMaisMaterialComplementarMaisSimuladoExclusivo() {
        Tutoria tutoria = new CorrecaoDeExercicios(new MaterialComplementar(new SimuladoExclusivo(new TutoriaEnem(100.0f))));

        assertEquals(195.0f, tutoria.getPreco());
    }

    @Test
    void deveRetornarEstruturaTutoria() {
        Tutoria tutoria = new TutoriaEnem();

        assertEquals("Tutoria Enem", tutoria.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTutoriaComCorrecaoDeExercicios() {
        Tutoria tutoria = new CorrecaoDeExercicios(new TutoriaEnem());

        assertEquals("Tutoria Enem/Exercícios Corrigidos", tutoria.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTutoriaComMaterialComplementar() {
        Tutoria tutoria = new MaterialComplementar(new TutoriaEnem());

        assertEquals("Tutoria Enem/Material Complementar", tutoria.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTutoriaComSimuladoExclusivo() {
        Tutoria tutoria = new SimuladoExclusivo(new TutoriaEnem());

        assertEquals("Tutoria Enem/Simulados Exclusivos", tutoria.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTutoriaComCorrecaoDeExerciciosMaisMaterialComplementar() {
        Tutoria tutoria = new CorrecaoDeExercicios(new MaterialComplementar (new TutoriaEnem()));

        assertEquals("Tutoria Enem/Material Complementar/Exercícios Corrigidos", tutoria.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTutoriaComCorrecaoDeExerciciosMaisSimuladoExclusivo() {
        Tutoria tutoria = new CorrecaoDeExercicios(new SimuladoExclusivo (new TutoriaEnem()));

        assertEquals("Tutoria Enem/Simulados Exclusivos/Exercícios Corrigidos", tutoria.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTutoriaComMaterialComplementarMaisSimuladoExclusivo() {
        Tutoria tutoria = new MaterialComplementar(new SimuladoExclusivo (new TutoriaEnem()));

        assertEquals("Tutoria Enem/Simulados Exclusivos/Material Complementar", tutoria.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTutoriaComCorrecaoDeExerciciosMaisMaterialComplementarMaisSimuladoExclusivo() {
        Tutoria tutoria = new CorrecaoDeExercicios (new MaterialComplementar(new SimuladoExclusivo (new TutoriaEnem())));

        assertEquals("Tutoria Enem/Simulados Exclusivos/Material Complementar/Exercícios Corrigidos", tutoria.getEstrutura());
    }
}

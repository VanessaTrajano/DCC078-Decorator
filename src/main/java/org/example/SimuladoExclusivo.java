package org.example;

public class SimuladoExclusivo extends TutoriaDecorator{
    public SimuladoExclusivo(Tutoria tutoria) {
        super(tutoria);
    }

    public float getAumentoPreco() {
        return 50.0f;
    }

    public String getNomeEstrutura() {
        return "Simulados Exclusivos";
    }
}

package org.example;

public class CorrecaoDeExercicios extends TutoriaDecorator{
    public CorrecaoDeExercicios(Tutoria tutoria) {
        super(tutoria);
    }

    public float getAumentoPreco() {
        return 30.0f;
    }

    public String getNomeEstrutura() {
        return "Exercícios Corrigidos";
    }
}

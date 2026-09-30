package org.example;

public class MaterialComplementar extends TutoriaDecorator{
    public MaterialComplementar(Tutoria tutoria) {
        super(tutoria);
    }

    public float getAumentoPreco() {
        return 15.0f;
    }

    public String getNomeEstrutura() {
        return "Material Complementar";
    }
}

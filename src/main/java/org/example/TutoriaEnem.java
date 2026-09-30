package org.example;

public class TutoriaEnem implements Tutoria {
    public float preco;

    public TutoriaEnem() {
    }

    public TutoriaEnem(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getEstrutura() {
        return "Tutoria Enem";
    }
}

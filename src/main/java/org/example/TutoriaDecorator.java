package org.example;

public abstract class TutoriaDecorator implements Tutoria{
    private Tutoria tutoria;
    public String estrutura;

    public TutoriaDecorator(Tutoria tutoria) {
        this.tutoria = tutoria;
    }

    public Tutoria getTutoria() {
        return tutoria;
    }

    public void setTutoria(Tutoria tutoria) {
        this.tutoria = tutoria;
    }

    public abstract float getAumentoPreco();

    public float getPreco() {
        return this.tutoria.getPreco() + this.getAumentoPreco();
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.tutoria.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}

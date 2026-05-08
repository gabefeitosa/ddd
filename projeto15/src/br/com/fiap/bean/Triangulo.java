package br.com.fiap.bean;

public class Triangulo extends Quadrado
{
    private float altura;

    public Triangulo(){}

    public Triangulo(float lado, float altura)
    {
        super(lado);
        this.altura = altura;
    }

    public float getAltura()
    {
        return altura;
    }

    public void setAltura(float altura)
    {
        this.altura = altura;
    }

    public float calcularArea()
    {
        return super.getLado() * altura / 2;
    }
}

package br.com.fiap.bean;

public class ContaEspecial extends ContaBancaria
{
    private float limite;

    public ContaEspecial() {}

    public float getLimite() {return limite;}
    public void setLimite(float limite) {this.limite = limite;}

    public float sacar(float valor)
    {
        if(valor <= limite)
            super.setSaldo(super.getSaldo() - valor);
        return super.getSaldo();
    }
}

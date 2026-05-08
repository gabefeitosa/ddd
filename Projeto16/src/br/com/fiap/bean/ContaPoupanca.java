package br.com.fiap.bean;

public class ContaPoupanca extends ContaBancaria
{
    private int diaDeRendimento;

    public ContaPoupanca() {}

    public int getDiaDeRendimento() {return diaDeRendimento;}
    public void setDiaDeRendimento(int diaDeRendimento) {this.diaDeRendimento = diaDeRendimento;}

    public float novoSaldo(float rendimento)
    {

        return super.getSaldo() + rendimento;
    }

}

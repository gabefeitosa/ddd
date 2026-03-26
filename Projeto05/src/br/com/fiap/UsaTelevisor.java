package br.com.fiap;

public class UsaTelevisor
{
    public static void main(String[] args)
    {
        Televisor tv1 = new Televisor();
        tv1.canal = 10;
        tv1.volume = 50;
        tv1.aumentarVolume();
        tv1.trocarCanal(20);
        tv1.Exibir();
        tv1.diminuirVolume();
        tv1.Exibir();
    }
}

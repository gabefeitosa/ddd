package br.com.fiap;

public class UsaRadio
{
    public static void main(String[] args)
    {
        // mock teste - simulado de teste - teste mocado
        // delcaração e instanciação do objeto

        Radio radio1 = new Radio();
        radio1.estacao = 89.1f;
        radio1.volume = 5;
        radio1.trocarEstacao(92.5f);
        radio1.aumentarVolume();
        radio1.aumentarVolume();
        radio1.aumentarVolume();
        System.out.println("Estação: " + radio1.estacao + "\nVolume: " + radio1.volume);


    }


}

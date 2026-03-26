package br.com.fiap.main;

import br.com.fiap.bean.Radio;

public class UsaRadio
{
    public static void main(String[] args)
    {
        Radio radio1 = new Radio();
        radio1.setVolume(50);
        radio1.setEstacao(85.9f);

        System.out.printf("Estação atual: %.1f \nVolume atual: %d", radio1.getEstacao(), radio1.getVolume());

    }
}

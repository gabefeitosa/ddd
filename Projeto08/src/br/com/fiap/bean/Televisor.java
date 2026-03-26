package br.com.fiap.bean;

public class Televisor
{
    private int volume;
    private int canal;

    public int getVolume()
    {
        return volume;
    }
    public void setVolume(int volume)
    {
        try
        {
            if(volume >=0 && volume <= 20)
                this.volume = volume;
            else
                throw new Exception("Volume fora da faixa permitida!");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public int getCanal()
    {
        return canal;
    }
    public void setCanal(int canal)
    {
        try
        {
            if(canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 13)
                this.canal = canal;
            else
                throw new Exception("Esse canal não existe!");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void aumentarVolume()
    {
        if(volume >= 0 && volume <= 20)
            volume++;
    }

    public void diminuirVolume()
    {
        if(volume >= 0 && volume <= 20)
            volume--;
    }
}

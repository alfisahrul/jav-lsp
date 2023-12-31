package repository;

import entity.Anggota;

public class AnggotaRepositoryImpl implements AnggotaRepository
{
    public boolean isFull()
    {
        var isFull = true;
        for (int i = 0;i< data.length;i++){
            if(data[i]==null){
                isFull = false;
                break;
            }
        }
        return isFull;

    }
    public void resizeIffull()
    {
        if (isFull()){
            var temp = data;

            data = new Anggota[data.length *2];

            for (int i = 0 ; i< temp.length; i++){
                data[i] = temp[i];
            }
        }

    }

    public Anggota[] data = new Anggota[10];

    @Override
    public Anggota[] getAllAnggota()
    {
        return data;
    }

    @Override
    public void add(Anggota anggota)
    {
        resizeIffull();

        for(var i = 0 ; i < data.length; i++){
            if(data[i] == null){
                data[i] = anggota;
                break;
            }
        }

    }

    @Override
    public boolean remove(Integer number)
    {
        if ((number - 1) >= data.length){
            return false;
        } else if (data[number-1] == null)
        {
            return false;
        }else {
            for (int i = (number-1) ; i< data.length; i++){
                if (i==(data.length) -1){
                    data[i] = null;
                }else {
                    data[i] = data[i+1];
                }
            }
        }
        return true;

    }

    @Override
    public void edit(Anggota anggota)
    {

    }
}

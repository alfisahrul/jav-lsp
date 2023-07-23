package repository;

import entity.Anggota;
import entity.Buku;

public class BukuRepositoryImpl implements BukuRepository
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

            data = new Buku[data.length *2];

            for (int i = 0 ; i< temp.length; i++){
                data[i] = temp[i];
            }
        }

    }
    public Buku[] data = new Buku[10];

    @Override
    public Buku[] getAllBuku() { return data;}


    @Override
    public void add(Buku buku)
    {
        resizeIffull();

        for(var i = 0 ; i < data.length; i++){
            if(data[i] == null){
                data[i] = buku;
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
    private int count = 0;
    @Override
    public void edit(Buku buku)
    {
        for (int i = 0; i < count; i++) {
            if (data[i].getId() == buku.getId()) {
                data[i] = buku;
                return;
            }
        }
        System.out.println("Book with ID " + buku.getId() + " not found. Cannot update.");
    }

    @Override
    public Buku findBukuById(int id) {
        for (int i = 0; i < count; i++) {
            if (data[i].getId() == id) {
                return data[i]; // Return the book if found
            }
        }
        return null; // Return null if the book with the specified ID is not found
    }
}

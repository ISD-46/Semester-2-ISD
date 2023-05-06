package com.jurnal;

// class untuk mepresentasikan sebuah node nya.
public class NodeAdjacent {
    private char data; // data untuk node nya dengan tipe data character
    private boolean visited = false;

    // constructor untuk menyimpan data saat object node di instansiasikan.
    NodeAdjacent(char data){
        this.data = data;
    }

    // method untuk mendapatkan data dari node ini
    public char getData(){
        return data;
    }

    // method untuk mengetahui apakah node ini sudah di visited atau belum
    public boolean isVisited(){
        return visited;
    }

    // method untuk mengubah boolean visited nya sudah di visited atau belum
    public void setVisited(boolean visited){
        this.visited = visited;
    }
}

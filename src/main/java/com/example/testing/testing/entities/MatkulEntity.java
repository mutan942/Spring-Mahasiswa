package com.example.testing.testing.entities;

import javax.persistence.*;

@Entity
@Table(name = "matkul")
public class MatkulEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String namamatkul;
    private String pengajar;
    private int jurusan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamamatkul() {
        return namamatkul;
    }

    public void setNamamatkul(String namamatkul) {
        this.namamatkul = namamatkul;
    }

    public String getPengajar() {
        return pengajar;
    }

    public void setPengajar(String pengajar) {
        this.pengajar = pengajar;
    }

    public int getJurusan() {
        return jurusan;
    }

    public void setJurusan(int jurusan) {
        this.jurusan = jurusan;
    }
}

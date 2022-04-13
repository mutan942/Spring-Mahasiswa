package com.example.testing.testing.entities;

import javax.persistence.*;

@Entity
@Table(name = "mahasiswa")
public class MahasiswaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nama;
    private int jurusan;
    private int fakultas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJurusan() {
        return jurusan;
    }

    public void setJurusan(int jurusan) {
        this.jurusan = jurusan;
    }

    public int getFakultas() {
        return fakultas;
    }

    public void setFakultas(int fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public String toString() {
        return "MahasiswaEntity{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", jurusan=" + jurusan +
                ", fakultas=" + fakultas +
                '}';
    }
}

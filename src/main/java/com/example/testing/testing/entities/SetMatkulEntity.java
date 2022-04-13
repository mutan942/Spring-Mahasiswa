package com.example.testing.testing.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "setmatakuliah")
public class SetMatkulEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int matkul;
    private int mahasiswa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatkul() {
        return matkul;
    }

    public void setMatkul(int matkul) {
        this.matkul = matkul;
    }

    public int getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(int mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}

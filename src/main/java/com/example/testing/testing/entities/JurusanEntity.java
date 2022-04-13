package com.example.testing.testing.entities;

import javax.persistence.*;

@Entity
@Table(name = "jurusan")
public class JurusanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String namajurusan;
    private int fakultas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamajurusan() {
        return namajurusan;
    }

    public void setNamajurusan(String namajurusan) {
        this.namajurusan = namajurusan;
    }

    public int getFakultas() {
        return fakultas;
    }

    public void setFakultas(int fakultas) {
        this.fakultas = fakultas;
    }
}

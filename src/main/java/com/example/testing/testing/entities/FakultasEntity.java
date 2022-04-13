package com.example.testing.testing.entities;

import javax.persistence.*;

@Entity
@Table(name = "fakultas")
public class FakultasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String namafakultas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamafakukltas() {
        return namafakultas;
    }

    public void setNamafakukltas(String namafakukltas) {
        this.namafakultas = namafakukltas;
    }
}

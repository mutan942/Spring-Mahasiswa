package com.example.testing.testing.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinDapatSiswa {
    private int id;
    private String nama;
    private String namajurusan;
    private String namafakultas;
}

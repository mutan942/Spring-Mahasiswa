package com.example.testing.testing.repositories;

import com.example.testing.testing.dto.JoinDapatBanyakAmbil;
import com.example.testing.testing.dto.JoinDapatMatkul;
import com.example.testing.testing.dto.JoinDapatSiswa;
import com.example.testing.testing.entities.SetMatkulEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SetmatkulRepository extends JpaRepository<SetMatkulEntity, Integer> {
    @Query(value = "SELECT new com.example.testing.testing.dto.JoinDapatMatkul(a.id, b.nama,c.namamatkul,d.namajurusan,e.namafakultas) " +
            "FROM SetMatkulEntity a INNER JOIN MahasiswaEntity b ON b.id=a.mahasiswa INNER JOIN MatkulEntity c ON a.matkul=c.id " +
            "INNER JOIN JurusanEntity d ON b.jurusan=d.id INNER JOIN FakultasEntity e ON e.id=b.fakultas")
    List<JoinDapatMatkul> getsetmatkul();

    @Query(value = "SELECT new com.example.testing.testing.dto.JoinDapatSiswa(a.id, a.nama, b.namajurusan, c.namafakultas) " +
            "FROM MahasiswaEntity a INNER JOIN JurusanEntity b ON b.id=a.jurusan INNER JOIN FakultasEntity c ON a.fakultas=c.id")
    List<JoinDapatSiswa> getsiswa();

    @Query(value = "SELECT new com.example.testing.testing.dto.JoinDapatBanyakAmbil(b.namamatkul)"
            +"FROM SetMatkulEntity a INNER JOIN MatkulEntity b ON a.matkul=b.id GROUP BY a.matkul")
    List<JoinDapatBanyakAmbil> getbanyakambil();

    @Query(value = "SELECT new com.example.testing.testing.dto.JoinDapatMatkul(a.id, b.nama,c.namamatkul,d.namajurusan,e.namafakultas) " +
            "FROM SetMatkulEntity a INNER JOIN MahasiswaEntity b ON b.id=a.mahasiswa INNER JOIN MatkulEntity c ON a.matkul=c.id " +
            "INNER JOIN JurusanEntity d ON b.jurusan=d.id INNER JOIN FakultasEntity e ON e.id=b.fakultas WHERE a.mahasiswa=?1")
    List<JoinDapatMatkul> getsetmatkulbymhs(int id);
}

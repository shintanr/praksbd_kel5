package com.example.model;

public class Mahasiswa {
    // ! Properties sesuai dengan tabel Mahasiswa
    private String nim;
    private String nama;
    private String angkatan;
    private String gender;
    private String no_tlp;
    private String asal_daerah;

    // ! Setter dan Getter Properties
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public void setNo_tlp(String no_telp) {
        this.no_tlp = no_telp;
    }

    public String getNo_tlp() {
        return no_tlp;
    }

    public void setAsal_daerah(String asal_daerah) {
        this.asal_daerah = asal_daerah;
    }

    public String getAsal_daerah() {
        return asal_daerah;
    }

}

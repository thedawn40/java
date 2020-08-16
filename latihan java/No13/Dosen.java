package tes.No13;
public class Dosen {
    
    String nik,kodeDosen,namaDosen,alamatDosen,kodeMk;

    public Dosen(String nik, String kodeDosen, String namaDosen, String alamatDosen, String kodeMk) {
        this.namaDosen = namaDosen;
        this.nik = nik;
        this.alamatDosen = alamatDosen;
        this.kodeDosen = kodeDosen;
        this.kodeMk = kodeMk;
    }
    

    /**
     * @return the nik
     */
    public String getNik() {
        return nik;
    }

    /**
     * @param nik the nik to set
     */
    public void setNik(String nik) {
        this.nik = nik;
    }

    /**
     * @return the kodeDosen
     */
    public String getKodeDosen() {
        return kodeDosen;
    }

    /**
     * @param kodeDosen the kodeDosen to set
     */
    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    /**
     * @return the namaDosen
     */
    public String getNamaDosen() {
        return namaDosen;
    }

    /**
     * @param namaDosen the namaDosen to set
     */
    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    /**
     * @return the alamatDosen
     */
    public String getAlamatDosen() {
        return alamatDosen;
    }

    /**
     * @param alamatDosen the alamatDosen to set
     */
    public void setAlamatDosen(String alamatDosen) {
        this.alamatDosen = alamatDosen;
    }

    /**
     * @return the kodeMk
     */
    public String getKodeMk() {
        return kodeMk;
    }

    /**
     * @param kodeMk the kodeMk to set
     */
    public void setKodeMk(String kodeMk) {
        this.kodeMk = kodeMk;
    }
    
}

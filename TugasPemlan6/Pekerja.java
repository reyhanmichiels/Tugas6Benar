package TugasPemlan6;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(){

    }

    public Pekerja(String nama, String NIK, Boolean jenisKelamin, Boolean menikah, int jamKerja, int hariKerja, String NIP) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji() {
        return getHariKerja() * getJamKerja() * 15;
    }
    // rumus cari hari libur
    //(((getHariKerja() - (getHariKerja() % 7) / 7) * 2);
    public double getBonus() {
        double bonusLembur;
        int libur = (getHariKerja() / 7) * 2;
        if (getHariKerja() - (getHariKerja() / 7 * 7) == 6)
            libur++;

        if (getJamKerja() > 7)
            bonusLembur = (getHariKerja() - libur) * (getJamKerja() - 7) * 7;
        else
            bonusLembur = 0;

        double bonusLibur;
        if (getHariKerja() > 5)
            bonusLibur = libur * getJamKerja() * 20;
        else
            bonusLibur = 0;

        return bonusLibur + bonusLembur;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus(){
        String kantorCabang = "";

        if (getNIP().charAt(0) == '1')
            kantorCabang = "Mondstadt";

        else if (getNIP().charAt(0) == '2')
            kantorCabang = "Liyue";

        else if (getNIP().charAt(0) == '3')
            kantorCabang = "Inazuma";

        else if (getNIP().charAt(0) == '4')
            kantorCabang = "Sumeru";

        else if (getNIP().charAt(0) == '5')
            kantorCabang = "Fontaine";

        else if (getNIP().charAt(0) == '6')
            kantorCabang = "Natlan";

        else if (getNIP().charAt(0) == '7')
            kantorCabang = "Snezhnaya";

        String departemen = "";

        if (getNIP().charAt(6) == '1')
            departemen += "Pemasaran";

        else if (getNIP().charAt(6) == '2')
            departemen += "Humas";

        else if (getNIP().charAt(6) == '3')
            departemen += "Riset";

        else if (getNIP().charAt(6) == '4')
            departemen += "Teknologi";

        else if (getNIP().charAt(6) == '5')
            departemen += "Personalia";

        else if (getNIP().charAt(6) == '6')
            departemen += "Akademik";

        else if (getNIP().charAt(6) == '7')
            departemen += "Administrasi";

        else if (getNIP().charAt(6) == '8')
            departemen += "Operasional";

        else if (getNIP().charAt(6) == '9')
            departemen += "Pembangunan";

        return departemen + ", " + kantorCabang + " cabang " + getNIP().charAt(2);
    }

    /*@Override
    double getPendapatan() {
        return super.getPendapatan() + getGaji() + getBonus();
    }*/

    public String toString(){
        String returnString = "";
        returnString += "===Pekerja===\n";
        returnString += "Nama         : " + getNama() + "\n";
        returnString += "NIK          : " + getNIK() + "\n";
        returnString += "Jenis Kelamin: ";
        if (super.getJenisKelamin())
            returnString += "Laki-Laki\n";
        else
            returnString += "Perempuan\n";
        returnString += "Pendapatan   : " + (getBonus() + getGaji() + getPendapatan()) + "$\n";
        returnString += "Bonus        : " + getBonus() + "$\n";
        returnString += "Gaji         : " + getGaji() + "$\n";
        returnString += "Status       : " + getStatus() + "\n";
        returnString += "----------------------------------------\n";

        return returnString;
    }
}


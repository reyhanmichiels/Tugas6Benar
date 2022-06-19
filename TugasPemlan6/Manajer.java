package TugasPemlan6;

public class Manajer extends Pekerja{
    private int lamaKerja;

    public Manajer(String nama, String NIK, Boolean jenisKelamin, Boolean menikah, int jamKerja, int hariKerja, String NIP, int lamaKerja) {
        super(nama, NIK, jenisKelamin, menikah, jamKerja, hariKerja, NIP);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double getGaji() {
        return super.getGaji();
    }

    @Override
    public double getBonus() {
        return super.getBonus() + (super.getBonus() * (0.3));
    }

    @Override
    double getPendapatan() {
        return super.getPendapatan() + 15;
    }

    public String toString (){
        String returnString = "";
        returnString += "===Manajer===\n";
        returnString += "Nama         : " + getNama() + "\n";
        returnString += "NIK          : " + getNIK() + "\n";
        returnString += "Jenis Kelamin: ";
        if (super.getJenisKelamin())
            returnString += "Laki-Laki\n";
        else
            returnString += "Perempuan\n";
        returnString += "Pendapatan   : " + (getBonus() + getGaji() + getPendapatan() ) + "$\n";
        returnString += "Bonus        : " + getBonus() + "$\n";
        returnString += "Gaji         : " + getGaji() + "$\n";
        returnString += "Status       : " + getStatus() + "\n";
        returnString += "Lama Kerja   : " + getLamaKerja() + "hari\n";
        returnString += "----------------------------------------\n";

        return returnString;
    }
}

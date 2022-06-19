package TugasPemlan6;

public class MahasiswaFilkom extends Manusia{
    private String NIM;
    private double IPK;

    public MahasiswaFilkom(String nama, String NIK, Boolean jenisKelamin, Boolean menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus(){
        if (getNIM().charAt(6) == '2' ){
            return "Teknik Meniup Gelembung, 20" +  getNIM().substring(0,2);
        }

        else if (getNIM().charAt(6) == '3' ){
            return "Teknik Berburu Ubur Ubur, 20" +  getNIM().substring(0,2);
        }

        else if (getNIM().charAt(6) == '4' ){
            return "Sistem Perhamburgeran, 20" +  getNIM().substring(0,2);
        }

        else if (getNIM().charAt(6) == '6' ){
            return "Pendidikan Chum Bucket, 20" +  getNIM().substring(0,2);
        }

        else if (getNIM().charAt(6) == '7' ){
            return "Teknologi Telepon Kerang, 20" +  getNIM().substring(0,2);
        }

        else
            return "NIM tidak valid";
    }

    public double getBeasiswa(){
        if (getIPK() >= 3.5 && getIPK() < 4.0){
            return 75.0;
        }
        else if ((getIPK() >= 3.0 && getIPK() < 3.5)){
            return 50.0;
        }
        else
            return 0.0;
    }

    public String toString(){
        String returnString = "";
        returnString += "===Mahasiswa===\n";
        returnString += "Nama         : " + getNama() + "\n";
        returnString += "NIK          : " + getNIK() + "\n";
        returnString += "Jenis Kelamin: ";
        if (super.getJenisKelamin())
            returnString += "Laki-Laki\n";
        else
            returnString += "Perempuan\n";
        returnString       += "Pendapatan   : " + (getBeasiswa() + getPendapatan()) + "$\n";
        returnString += "IPK          : " + getIPK() + "\n";
        returnString += "NIM          : " + getNIM() + "\n";
        returnString += "Status       : " + getStatus() + "\n";
        returnString += "----------------------------------------\n";

        return returnString;
    }
}

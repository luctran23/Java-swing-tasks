
package p1;


public class SinhVien {
    private String masv;
    private String tensv;
    private int tuoi;
    
    
    public SinhVien(){
        
    }

    public SinhVien(String masv, String tensv, int tuoi) {
        this.masv = masv;
        this.tensv = tensv;
        this.tuoi = tuoi;
    }
    
    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMasv() {
        return masv;
    }

    public String getTensv() {
        return tensv;
    }

    public int getTuoi() {
        return tuoi;
    }
    
}

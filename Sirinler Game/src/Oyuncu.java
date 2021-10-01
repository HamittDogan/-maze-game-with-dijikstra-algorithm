
public class Oyuncu extends Karakter {

    private int oyuncuID;
    private String oyuncuAdi;
    private int oyuncuTur;
    private int skor;

    public Oyuncu(int ID, String Ad, String Tur) {
        super(ID, Ad, Tur);
    }

    public void PuaniGoster() {

    }
  
    void enKısaYol() {

    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getOyuncuTur() {
        return oyuncuTur;
    }

    public void setOyuncuTur(int oyuncuTur) {
        this.oyuncuTur = oyuncuTur;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    @Override
    void enKisaYol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }

  class Puan {

        public void PuaniGosterGozlukluSirin() {

        }

        public void PuaniGosterTembelSirin() {

        }

        public void PuaniGosterGozluklSirin() {

        }
    }


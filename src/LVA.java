//  Berkay Yalcin tms-2 160501115  //

import java.util.ArrayList;

public class LVA {

    private String Name;
    private String AKTS;
    private String Abkurzung;
    private String wochentlichLehrstunde;

    private ArrayList<Student> dersialanlar = new ArrayList<>();
    private ArrayList<Dozent> dersiverenler = new ArrayList<>();

    LVA(String la, String lb, String lc, String ld) {

        this.setName(la);
        this.setAKTS(lb);
        this.setAbkurzung(lc);
        this.setWochentlichLehrstunde(ld);

    }

    public static boolean AbkurzungCheck(String a) {                // abkurzung muss 6 iNDEX HABEN  : ERSTE 3 SiND GROSS BUSCHTABEN UND LETZTE 3 SiND INDEX
        int k = 0;
        int l = 0;

        if (a.length() == 6) {
            for (int i = 0; i < 6; i++) {
                if ((i < 3) && (64 < a.charAt(i) && a.charAt(i) < 91)) {  //INF102
                    k++;

                } else if ((i >= 3) && (Character.isDigit(a.charAt(i)))) {
                    l++;
                }
            }
        }

        if (k + l == 6) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the AKTS
     */
    public String getAKTS() {
        return AKTS;
    }

    /**
     * @param AKTS the AKTS to set
     */
    public void setAKTS(String AKTS) {
        this.AKTS = AKTS;
    }

    /**
     * @return the Abkurzung
     */
    public String getAbkurzung() {
        return Abkurzung;
    }

    /**
     * @param Abkurzung the Abkurzung to set
     */
    public void setAbkurzung(String Abkurzung) {
        this.Abkurzung = Abkurzung;
    }

    /**
     * @return the wochentlichLehrstunde
     */
    public String getWochentlichLehrstunde() {
        return wochentlichLehrstunde;
    }

    /**
     * @param wochentlichLehrstunde the wochentlichLehrstunde to set
     */
    public void setWochentlichLehrstunde(String wochentlichLehrstunde) {
        this.wochentlichLehrstunde = wochentlichLehrstunde;
    }

    /**
     * @return the dersialanlar
     */
    public ArrayList<Student> getDersialanlar() {
        return dersialanlar;
    }

    /**
     * @param dersialanlar the dersialanlar to set
     */
    public void setDersialanlar(ArrayList<Student> dersialanlar) {
        this.dersialanlar = dersialanlar;
    }

    /**
     * @return the dersiverenler
     */
    public ArrayList<Dozent> getDersiverenler() {
        return dersiverenler;
    }

    /**
     * @param dersiverenler the dersiverenler to set
     */
    public void setDersiverenler(ArrayList<Dozent> dersiverenler) {
        this.dersiverenler = dersiverenler;
    }

}

//  Berkay Yalcin tms-2 160501115  //

import java.util.ArrayList;

public class Dozent extends Person {

    private String TC;

    private ArrayList<LVA> lva = new ArrayList<>();

    public Dozent(String da, String db, String dc, String dd, String de, String df) {
        setName(da);
        setNachname(db);
        setTelefonnummer(dc);
        setTC(dd);
        setFakultaet(de);
        setGeschlecht(df);
    }

    public boolean checkTCnummer() {           // TC nummer des Dozents muss 11 Ziffer haben
        if (getTC().length() == 11) {
            for (int i = 0; i < 11; i++) {
                if (Character.isDigit(getTC().charAt(i)) == false) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    /**
     * @return the lva
     */
    public ArrayList<LVA> getLva() {
        return lva;
    }

    /**
     * @param lva the lva to set
     */
    public void setLva(ArrayList<LVA> lva) {
        this.lva = lva;
    }
}

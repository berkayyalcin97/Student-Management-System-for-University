//  Berkay Yalcin tms-2 160501115  //

import java.util.ArrayList;

public class Student extends Person {

    private String matrikelNummer = "";
    private String klasse = "";
    private String notendurchschnitt = "";
    private String fachbereich = "";
    private String anmeldedatum = "";
    private ArrayList<LVA> lva = new ArrayList<>();

    public Student(String a, String b, String c, String d, String e, String f, String g, String l, String m, String p) {      //KONS BLOK  in diesem kontruktor blok habe ich die parametern in Student klasse momentanes buschtaben zuweisen.
        setName(a);
        setNachname(b);
        setTelefonnummer(c);
        setMatrikelNummer(d);
        setKlasse(e);
        setNotendurchschnitt(f);
        setFakultaet(g);
        setFachbereich(l);
        setGeschlecht(m);
        setAnmeldedatum(p);
    }

    public boolean checkMatrikelnummer() {                          // Mit diese Kontrol :Matrikel nummer kann nicht mit 0 beginnen ,Matrikel nummer muss nun von Ziffern entsteht und Matrikel nummer muss 7 Ziffer (nicht mehr oder wenig)
        if (getMatrikelNummer().length() == 7) {
            for (int i = 0; i < 7; i++) {
                if (Character.isDigit(getMatrikelNummer().charAt(i)) == false) {
                    return false;
                }
                if (getMatrikelNummer().startsWith("0")) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public String getMatrikelNummer() {
        return matrikelNummer;
    }

    public void setMatrikelNummer(String matrikelNummer) {
        this.matrikelNummer = matrikelNummer;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public String getNotendurchschnitt() {
        return notendurchschnitt;
    }

    public void setNotendurchschnitt(String notendurchschnitt) {
        this.notendurchschnitt = notendurchschnitt;
    }

    /**
     * @return the fachbereich
     */
    public String getFachbereich() {
        return fachbereich;
    }

    public void setFachbereich(String fachbereich) {
        this.fachbereich = fachbereich;
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

    /**
     * @return the anmeldedatum
     */
    public String getAnmeldedatum() {
        return anmeldedatum;
    }

    /**
     * @param anmeldedatum the anmeldedatum to set
     */
    public void setAnmeldedatum(String anmeldedatum) {
        this.anmeldedatum = anmeldedatum;
    }

}

//  Berkay Yalcin tms-2 160501115  //

import java.util.ArrayList;

public class Universitaet {

    private String name;
    private String adresse;
    private int studentAnzahl;

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Dozent> dozents = new ArrayList<>();
    private ArrayList<LVA> lvas = new ArrayList<>();

    public Universitaet(String name, String adresse, int studentAnzahl) {
        this.setName(name);
        this.setAdresse(adresse);
        this.setStudentAnzahl(studentAnzahl);

    }

    public void studentZurLvaAbmelden(String studentnummerabmelden, String lvacodeabmelden) {

        if (sucheStudent(studentnummerabmelden) != -1 && suchelva(lvacodeabmelden) != -1) {
            if (!StudentLvaAbmeldenKontrol(sucheStudent(studentnummerabmelden), suchelva(lvacodeabmelden)) == false) {
                getStudents().get(sucheStudent(studentnummerabmelden)).getLva().remove(getLvas().get(suchelva(lvacodeabmelden)));
                getLvas().get(suchelva(lvacodeabmelden)).getDersialanlar().remove(getStudents().get(sucheStudent(studentnummerabmelden)));
            }
        }

    }

    public void dozentZurLvaAbmelden(String dozentTcnummerabmelden, String lvacodedozentabmelden) {

        if (sucheDozent(dozentTcnummerabmelden) != -1 && suchelva(lvacodedozentabmelden) != -1) {
            if (!DozentLvaAbmeldenKontrol(sucheDozent(dozentTcnummerabmelden), suchelva(lvacodedozentabmelden)) == false) {
                getDozents().get(sucheDozent(dozentTcnummerabmelden)).getLva().remove(getLvas().get(suchelva(lvacodedozentabmelden)));
                getLvas().get(suchelva(lvacodedozentabmelden)).getDersiverenler().remove(getDozents().get(sucheDozent(dozentTcnummerabmelden)));
            }
        }

    }

    public boolean DozentLvaAbmeldenKontrol(int nummer, int lva) {
        if (!dozents.get(nummer).getLva().contains(lvas.get(lva))) {

            return false;
        } else {

            return true;
        }
    }

    public boolean StudentLvaAbmeldenKontrol(int nummer, int lva) {
        if (!students.get(nummer).getLva().contains(lvas.get(lva))) {

            return false;
        } else {
            return true;
        }
    }

    public void studentZurLvaAnmelden(String nummer, String lvacode) {

        if (sucheStudent(nummer) != -1 && suchelva(lvacode) != -1) {
            if (StudentLvaAnmeldenKontrol(sucheStudent(nummer), suchelva(lvacode)) == true) {
                getStudents().get(sucheStudent(nummer)).getLva().add(getLvas().get(suchelva(lvacode)));
                getLvas().get(suchelva(lvacode)).getDersialanlar().add(getStudents().get(sucheStudent(nummer)));
            }
        }
    }

    public void dozentZurLvaZuweisen(String dozetzurlvaTC, String lvacodedozent) {

        if (sucheDozent(dozetzurlvaTC) != -1 && suchelva(lvacodedozent) != -1) {
            if (DozentLvaAnmeldenKontrol(sucheDozent(dozetzurlvaTC), suchelva(lvacodedozent)) == true) {
                getDozents().get(sucheDozent(dozetzurlvaTC)).getLva().add(getLvas().get(suchelva(lvacodedozent)));
                getLvas().get(suchelva(lvacodedozent)).getDersiverenler().add(getDozents().get(sucheDozent(dozetzurlvaTC)));
            }
        }

    }

    public boolean DozentLvaAnmeldenKontrol(int nummer, int lva) {
        if (!dozents.get(nummer).getLva().contains(lvas.get(lva))) {

            return true;
        }
        return false;
    }

    public boolean StudentLvaAnmeldenKontrol(int nummer, int lva) {

        if (!students.get(nummer).getLva().contains(lvas.get(lva))) {

            return true;
        }
        return false;
    }

    public boolean studentExistenzKontrol(String kontrolierendeStudent) {
        for (int i = 0; i < getStudents().size(); i++) {
            if (kontrolierendeStudent.equals(getStudents().get(i).getMatrikelNummer())) {

                return true;
            }
        }
        return false;
    }

    public boolean DozentexistenzKontrol(String kontrolierendeDozent) {
        for (int i = 0; i < getDozents().size(); i++) {
            if (kontrolierendeDozent.equals(getDozents().get(i).getTC())) {

                return true;
            }
        }
        return false;
    }

    public boolean LVAexistenzKontrol(String kontrolierendeLVA) {
        for (int i = 0; i < getLvas().size(); i++) {
            if (kontrolierendeLVA.equals(getLvas().get(i).getAbkurzung())) {

                return true;
            }
        }
        return false;
    }

    public int sucheStudent(String gefundeneStudent) {
        int studentindex = -1;
        if ((getStudents().size() != 0)) {
            for (int i = 0; i < getStudents().size(); i++) {
                if (getStudents().get(i).getMatrikelNummer().equals(gefundeneStudent)) {
                    studentindex = i;
                    break;
                } else if (i == getStudents().size() - 1) {
                    System.out.println("Student existiert nicht");
                }
            }
        } else {
            System.out.println("Student existiert nicht");
        }
        return studentindex;
    }

    public int sucheDozent(String gefundeneDozent) {

        int dozentindex = -1;
        if (getDozents().size() != 0) {
            for (int i = 0; i < getDozents().size(); i++) {
                if (getDozents().get(i).getTC().equals(gefundeneDozent)) {
                    dozentindex = i;
                    break;
                } else if (i == getDozents().size() - 1) {
                    System.out.println("Dozent existiert nicht");
                }
            }
        } else {
            System.out.println("Dozent existiert nicht");
        }
        return dozentindex;
    }

    public int suchelva(String gefundeneLVA) {
        int lvaindex = -1;
        if (getLvas().size() != 0) {
            for (int i = 0; i < getLvas().size(); i++) {
                if (getLvas().get(i).getAbkurzung().equals(gefundeneLVA)) {
                    lvaindex = i;
                    break;
                } else if (i == getLvas().size() - 1) {
                    System.out.println("LVA existiert nicht");
                }
            }
        } else {
            System.out.println("LVA existiert nicht");

        }
        return lvaindex;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the studentAnzahl
     */
    public int getStudentAnzahl() {
        return studentAnzahl;
    }

    /**
     * @param studentAnzahl the studentAnzahl to set
     */
    public void setStudentAnzahl(int studentAnzahl) {
        this.studentAnzahl = studentAnzahl;
    }

    /**
     * @return the dozents
     */
    public ArrayList<Dozent> getDozents() {
        return dozents;
    }

    /**
     * @param dozents the dozents to set
     */
    public void setDozents(ArrayList<Dozent> dozents) {
        this.dozents = dozents;
    }

    /**
     * @return the lvas
     */
    public ArrayList<LVA> getLvas() {
        return lvas;
    }

    /**
     * @param lvas the lvas to set
     */
    public void setLvas(ArrayList<LVA> lvas) {
        this.lvas = lvas;
    }

}

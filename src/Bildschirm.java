//  Berkay Yalcin tms-2 160501115  //

import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Bildschirm extends javax.swing.JFrame {
    public Bildschirm() {
        initComponents();

        table_Studenten.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                int i = table_Studenten.getSelectedRow();
                if (i >= 0) {
                    tf_Name.setText((String) table_Studenten.getModel().getValueAt(i, 0));
                    tf_Nachname.setText((String) table_Studenten.getModel().getValueAt(i, 1));
                    tf_Matrikelnummer.setText((String) table_Studenten.getModel().getValueAt(i, 2));
                }
            }

        });

        table_Dozenten.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                int i = table_Dozenten.getSelectedRow();
                if (i >= 0) {
                    tf_DozentName.setText((String) table_Dozenten.getModel().getValueAt(i, 0));
                    tf_DozentNachname.setText((String) table_Dozenten.getModel().getValueAt(i, 1));
                    tf_DozentTcnummer.setText((String) table_Dozenten.getModel().getValueAt(i, 2));
                }
            }

        });
        table_Lvas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                int i = table_Lvas.getSelectedRow();
                if (i >= 0) {
                    tf_LvaName.setText((String) table_Lvas.getModel().getValueAt(i, 0));
                    tf_LvaAbkurzung.setText((String) table_Lvas.getModel().getValueAt(i, 1));
                    tf_LvaAkts.setText((String) table_Lvas.getModel().getValueAt(i, 2));
                }
            }

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Studenten = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_Name = new javax.swing.JTextField();
        tf_Nachname = new javax.swing.JTextField();
        tf_Telefonnummer = new javax.swing.JTextField();
        tf_Matrikelnummer = new javax.swing.JTextField();
        tf_Klasse = new javax.swing.JTextField();
        tf_Notendurchschnitt = new javax.swing.JTextField();
        tf_Fakultaet = new javax.swing.JTextField();
        tf_Fachbereich = new javax.swing.JTextField();
        tf_Geschlecht = new javax.swing.JTextField();
        studentaddierebutton = new javax.swing.JButton();
        studentloeschenbutton = new javax.swing.JButton();
        studentbearbeitenbutton = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        tf_sucheStudentFilter = new javax.swing.JTextField();
        studentzurlvaanmeldenbutton = new javax.swing.JButton();
        lb_Nachricht = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_Lvas1 = new javax.swing.JTable();
        listAlleLvaStudentButton = new javax.swing.JButton();
        studentzurlvaabmeldenbutton = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        table_LvasEinesStudents = new javax.swing.JTable();
        tf_Anmeldedatum = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_Dozenten = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_DozentName = new javax.swing.JTextField();
        tf_DozentNachname = new javax.swing.JTextField();
        tf_DozentTelefonnummer = new javax.swing.JTextField();
        tf_DozentTcnummer = new javax.swing.JTextField();
        tf_DozentFakultaet = new javax.swing.JTextField();
        tf_DozentGeschlecht = new javax.swing.JTextField();
        dozenthinzufugenbutton = new javax.swing.JButton();
        lb_DozentNachricht = new javax.swing.JLabel();
        dozentloeschenbutton = new javax.swing.JButton();
        dozentbearbeitenbutton = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        table_Lvas2 = new javax.swing.JTable();
        dozentzurlvaanmelden = new javax.swing.JButton();
        dozentzurlvaabmeldenbutton = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        table_LvasEinesDozents = new javax.swing.JTable();
        listAlleLvaDozentButton = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        tf_sucheDozentenFilter = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_Lvas = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tf_LvaName = new javax.swing.JTextField();
        tf_LvaAkts = new javax.swing.JTextField();
        tf_LvaAbkurzung = new javax.swing.JTextField();
        tf_LvaWochendlichLehrstunde = new javax.swing.JTextField();
        lvaaddierebutton = new javax.swing.JButton();
        lb_NachrichtLva = new javax.swing.JLabel();
        lvaloeschenbutton = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        lvabearbeitenbutton = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        table_StudentenEinerLva = new javax.swing.JTable();
        listAlleStudentEinerLvaButton = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        table_DozentenEinerLva = new javax.swing.JTable();
        listAlleDozentenEinerLvaButton = new javax.swing.JButton();
        tf_sucheLvaFilter = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_Studenten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nachname", "Martikelnummer", "Klasse", "Notendurchschnitt", "Fakultaet", "Fachbereich", "Geschlecht", "Telefonnummer", "Anmeldedatum"
            }
        ));
        jScrollPane1.setViewportView(table_Studenten);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("*Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nachname:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Telefonnummer:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("*Matrikelnummer:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Klasse:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Notendurchschnitt:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Fakultaet:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Fachbereich:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Geschlecht:");

        studentaddierebutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentaddierebutton.setText("Student Hinzufuegen");
        studentaddierebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentaddierebuttonActionPerformed(evt);
            }
        });

        studentloeschenbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentloeschenbutton.setText("Student Loeschen");
        studentloeschenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentloeschenbuttonActionPerformed(evt);
            }
        });

        studentbearbeitenbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentbearbeitenbutton.setText("Student Bearbeiten");
        studentbearbeitenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentbearbeitenbuttonActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Suche Student :");

        tf_sucheStudentFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_sucheStudentFilterKeyReleased(evt);
            }
        });

        studentzurlvaanmeldenbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentzurlvaanmeldenbutton.setText("Student zur Lva Anmelden");
        studentzurlvaanmeldenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentzurlvaanmeldenbuttonActionPerformed(evt);
            }
        });

        lb_Nachricht.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        table_Lvas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Abkuerzung", "AKTS"
            }
        ));
        jScrollPane7.setViewportView(table_Lvas1);

        listAlleLvaStudentButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listAlleLvaStudentButton.setText("Alle Lvas eines Student Zeigen");
        listAlleLvaStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAlleLvaStudentButtonActionPerformed(evt);
            }
        });

        studentzurlvaabmeldenbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentzurlvaabmeldenbutton.setText("Student zur Lva Abmelden");
        studentzurlvaabmeldenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentzurlvaabmeldenbuttonActionPerformed(evt);
            }
        });

        table_LvasEinesStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lva eines Students"
            }
        ));
        jScrollPane8.setViewportView(table_LvasEinesStudents);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Anmelde datum:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Nachricht :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Nachricht, javax.swing.GroupLayout.PREFERRED_SIZE, 1205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(studentbearbeitenbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel10)
                                        .addComponent(studentloeschenbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(studentaddierebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(studentzurlvaanmeldenbutton)
                                            .addComponent(studentzurlvaabmeldenbutton)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tf_sucheStudentFilter))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_Anmeldedatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_Telefonnummer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_Geschlecht, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_Fachbereich, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_Fakultaet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_Notendurchschnitt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_Klasse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_Matrikelnummer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_Nachname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listAlleLvaStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(tf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tf_Nachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tf_Matrikelnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tf_Klasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(tf_Notendurchschnitt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_Fakultaet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tf_Fachbereich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(tf_Geschlecht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tf_Telefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(tf_Anmeldedatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentaddierebutton)
                    .addComponent(studentzurlvaanmeldenbutton))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentloeschenbutton)
                    .addComponent(studentzurlvaabmeldenbutton)
                    .addComponent(listAlleLvaStudentButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentbearbeitenbutton)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_sucheStudentFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Nachricht, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Studentverwaltung", jPanel1);

        table_Dozenten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nachname", "TC Nummer", "Telefonnummer", "Fakultaet", "Geschlecht"
            }
        ));
        jScrollPane3.setViewportView(table_Dozenten);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("*Name:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Nachname:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Telefonnummer:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("*Tcnummer:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Fakultaet:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Geschlecht:");

        dozenthinzufugenbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dozenthinzufugenbutton.setText("Dozent Hinzufuegen");
        dozenthinzufugenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dozenthinzufugenbuttonActionPerformed(evt);
            }
        });

        dozentloeschenbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dozentloeschenbutton.setText("Dozent Loeschen");
        dozentloeschenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dozentloeschenbuttonActionPerformed(evt);
            }
        });

        dozentbearbeitenbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dozentbearbeitenbutton.setText("Dozent Bearbeiten");
        dozentbearbeitenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dozentbearbeitenbuttonActionPerformed(evt);
            }
        });

        table_Lvas2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Abkuerzung", "AKTS"
            }
        ));
        jScrollPane10.setViewportView(table_Lvas2);

        dozentzurlvaanmelden.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dozentzurlvaanmelden.setText("Dozent zur lva Zuweisen");
        dozentzurlvaanmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dozentzurlvaanmeldenActionPerformed(evt);
            }
        });

        dozentzurlvaabmeldenbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dozentzurlvaabmeldenbutton.setText("Dozent zur Lva Abmelden");
        dozentzurlvaabmeldenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dozentzurlvaabmeldenbuttonActionPerformed(evt);
            }
        });

        table_LvasEinesDozents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lvas eines Dozents"
            }
        ));
        jScrollPane9.setViewportView(table_LvasEinesDozents);

        listAlleLvaDozentButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listAlleLvaDozentButton.setText("Alle Lvas eines Dozent Zeigen");
        listAlleLvaDozentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAlleLvaDozentButtonActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Suche Dozent:");

        tf_sucheDozentenFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_sucheDozentenFilterKeyReleased(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Nachricht :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3)
                                .addComponent(jLabel12)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel16))
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_DozentTelefonnummer)
                                        .addComponent(tf_DozentFakultaet)
                                        .addComponent(tf_DozentNachname)
                                        .addComponent(tf_DozentTcnummer)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tf_DozentName, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                                .addComponent(tf_DozentGeschlecht))
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addGap(136, 136, 136)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listAlleLvaDozentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dozenthinzufugenbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(dozentloeschenbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dozentbearbeitenbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(tf_sucheDozentenFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dozentzurlvaabmeldenbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dozentzurlvaanmelden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(lb_DozentNachricht, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listAlleLvaDozentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(tf_DozentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_DozentNachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_DozentTcnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_DozentTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_DozentFakultaet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_DozentGeschlecht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dozentzurlvaanmelden)
                    .addComponent(dozenthinzufugenbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dozentloeschenbutton)
                    .addComponent(dozentzurlvaabmeldenbutton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dozentbearbeitenbutton)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(tf_sucheDozentenFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(140, 140, 140)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_DozentNachricht, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Dozentverwaltung", jPanel2);

        table_Lvas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Abkuerzung", "AKTS", "Wochendlich Lehrstunde"
            }
        ));
        jScrollPane5.setViewportView(table_Lvas);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("*Name des Lva:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("AKTS:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("*Abkuerzung:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Wochendlich Lehrstunde:");

        lvaaddierebutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lvaaddierebutton.setText("Lva Addieren");
        lvaaddierebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvaaddierebuttonActionPerformed(evt);
            }
        });

        lvaloeschenbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lvaloeschenbutton.setText("LVA Loeschen");
        lvaloeschenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvaloeschenbuttonActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Suche Lva :");

        lvabearbeitenbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lvabearbeitenbutton.setText("Lva Bearbeiten");
        lvabearbeitenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvabearbeitenbuttonActionPerformed(evt);
            }
        });

        table_StudentenEinerLva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Studenten Matrikelnummer", "Studenten Name", "Studenten Nachname"
            }
        ));
        jScrollPane11.setViewportView(table_StudentenEinerLva);

        listAlleStudentEinerLvaButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listAlleStudentEinerLvaButton.setText("List Angemeldeten Studenten");
        listAlleStudentEinerLvaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAlleStudentEinerLvaButtonActionPerformed(evt);
            }
        });

        table_DozentenEinerLva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dozenten Tc nummer", "Dozenten Name", "Dozenten Nachname"
            }
        ));
        jScrollPane12.setViewportView(table_DozentenEinerLva);

        listAlleDozentenEinerLvaButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listAlleDozentenEinerLvaButton.setText("List Angemeldeten Dozenten");
        listAlleDozentenEinerLvaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAlleDozentenEinerLvaButtonActionPerformed(evt);
            }
        });

        tf_sucheLvaFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_sucheLvaFilterKeyReleased(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Nachricht :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(lb_NachrichtLva, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_LvaAbkurzung, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_LvaAkts)
                                    .addComponent(tf_LvaName)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(tf_LvaWochendlichLehrstunde, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lvaaddierebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lvaloeschenbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvabearbeitenbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_sucheLvaFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listAlleDozentenEinerLvaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listAlleStudentEinerLvaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12)
                    .addComponent(jScrollPane11))
                .addGap(1072, 1072, 1072))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listAlleStudentEinerLvaButton)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_LvaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_LvaAkts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_LvaAbkurzung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_LvaWochendlichLehrstunde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lvaaddierebutton)
                            .addComponent(lvabearbeitenbutton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lvaloeschenbutton)
                            .addComponent(jLabel22)
                            .addComponent(tf_sucheLvaFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addComponent(listAlleDozentenEinerLvaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_NachrichtLva, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("Lva verwaltung", jPanel3);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("                                           TAU STUDENTENMANAGEMENTSYSTEM");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Die Attributen mit * Kennzeichnen muessen gefuelt werden");

        jLabel30.setText("Berkay Yalcin 160501115");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(251, 251, 251)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentaddierebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentaddierebuttonActionPerformed
        Student t = new Student(tf_Name.getText(), tf_Nachname.getText(), tf_Telefonnummer.getText(), tf_Matrikelnummer.getText(), tf_Klasse.getText(), tf_Notendurchschnitt.getText(), tf_Fakultaet.getText(), tf_Fachbereich.getText(), tf_Geschlecht.getText(), tf_Anmeldedatum.getText());

        String nachricht = "";

        String[] ss = new String[10];
        ss[0] = tf_Name.getText();
        ss[1] = tf_Nachname.getText();
        ss[2] = tf_Matrikelnummer.getText();
        ss[3] = tf_Klasse.getText();
        ss[4] = tf_Notendurchschnitt.getText();
        ss[5] = tf_Fakultaet.getText();
        ss[6] = tf_Fachbereich.getText();
        ss[7] = tf_Geschlecht.getText();
        ss[8] = tf_Telefonnummer.getText();
        ss[9] = tf_Anmeldedatum.getText();
        DefaultTableModel dtm = (DefaultTableModel) table_Studenten.getModel();

        if (t.checkMatrikelnummer() == false) {
            nachricht = nachricht + "   Student kann nicht hinzugefugt werden falsche Matrikelnummer Typ : Matrikel nummer muss nur 7 Ziffer haben und kann nicht mit 0 beginnen ";
            lb_Nachricht.setText(nachricht);
        }
        if (uni.studentExistenzKontrol(tf_Matrikelnummer.getText()) == true) {
            nachricht = nachricht + "   Student kann nicht hinzugefugt werden es gibt schon eine Student mit gleiche Matrikelnummer";
            lb_Nachricht.setText(nachricht);
        }
        if (tf_Name.getText().equals("")) {
            nachricht = nachricht + "   Name der Student kann nicht leer sein fullen sie die name um student zu uni anmelden";
            lb_Nachricht.setText(nachricht);
        }

        if (t.checkMatrikelnummer() && uni.studentExistenzKontrol(tf_Matrikelnummer.getText()) == false && !tf_Name.getText().isEmpty()) {
            dtm.addRow(ss);
            uni.getStudents().add(t);
            lb_Nachricht.setText("Student ist erfolgreich hinzugefugt");
        }


    }//GEN-LAST:event_studentaddierebuttonActionPerformed

    private void studentloeschenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentloeschenbuttonActionPerformed

        int i = table_Studenten.getSelectedRow();

        if (i >= 0) {
            DefaultTableModel dtm = (DefaultTableModel) table_Studenten.getModel();
            for (LVA lva : uni.getStudents().get(i).getLva()) {                          // Diese for schleife macht:wenn ein student von uni geloest wird,wird auch diese student von lva-dersialalar geloest wird 
                lva.getDersialanlar().remove(uni.getStudents().get(i));
            }

            uni.getStudents().remove(i);
            dtm.removeRow(i);
            lb_Nachricht.setText("Student ist geloscht");
        } else {
            lb_Nachricht.setText("Student ist nicht ausgewehlt");
        }

    }//GEN-LAST:event_studentloeschenbuttonActionPerformed

    private void studentbearbeitenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentbearbeitenbuttonActionPerformed

        int i = table_Studenten.getSelectedRow();
        String nachricht = "";
        if (i < 0) {
            nachricht = nachricht + "student ist nicht ausgewehlt";
            lb_Nachricht.setText(nachricht);
        }

        if (i >= 0) {

            if (!uni.getStudents().get(i).getMatrikelNummer().equals(tf_Matrikelnummer.getText())) {
                nachricht = nachricht + "+Sie konnen nicht Matrikel nummer bearbeiten aber andere Attributen werden bearbeitet  ";
                lb_Nachricht.setText(nachricht);
            }

            if (tf_Name.getText().equals("")) {
                nachricht = nachricht + "   Name der Student kann nicht leer sein bitte fuellen sie name um student zu bearbeiten konnen ";
                lb_Nachricht.setText(nachricht);
            } else {
                Student t = uni.getStudents().get(i);
                t.setName(tf_Name.getText());
                t.setNachname(tf_Nachname.getText());
                t.setTelefonnummer(tf_Telefonnummer.getText());
                t.setKlasse(tf_Klasse.getText());
                t.setNotendurchschnitt(tf_Notendurchschnitt.getText());
                t.setFakultaet(tf_Fakultaet.getText());
                t.setFachbereich(tf_Fachbereich.getText());
                t.setGeschlecht(tf_Geschlecht.getText());
                t.setAnmeldedatum(tf_Anmeldedatum.getText());

                table_Studenten.getModel().setValueAt(t.getName(), i, 0);
                table_Studenten.getModel().setValueAt(t.getNachname(), i, 1);
                table_Studenten.getModel().setValueAt(t.getKlasse(), i, 3);
                table_Studenten.getModel().setValueAt(t.getNotendurchschnitt(), i, 4);
                table_Studenten.getModel().setValueAt(t.getFakultaet(), i, 5);
                table_Studenten.getModel().setValueAt(t.getFachbereich(), i, 6);
                table_Studenten.getModel().setValueAt(t.getGeschlecht(), i, 7);
                table_Studenten.getModel().setValueAt(t.getTelefonnummer(), i, 8);
                table_Studenten.getModel().setValueAt(t.getAnmeldedatum(), i, 9);
                nachricht = nachricht + "Bearbeiten erfolgreich durchgefuhrt";
                lb_Nachricht.setText(nachricht);
            }

        }

    }//GEN-LAST:event_studentbearbeitenbuttonActionPerformed

    private void dozenthinzufugenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dozenthinzufugenbuttonActionPerformed

        Dozent addiertedozent = new Dozent(tf_DozentName.getText(), tf_DozentNachname.getText(), tf_DozentTelefonnummer.getText(), tf_DozentTcnummer.getText(), tf_DozentFakultaet.getText(), tf_DozentGeschlecht.getText());
        String nachricht = "";

        String[] dd = new String[6];
        dd[0] = tf_DozentName.getText();
        dd[1] = tf_DozentNachname.getText();
        dd[2] = tf_DozentTcnummer.getText();
        dd[3] = tf_DozentTelefonnummer.getText();
        dd[4] = tf_DozentFakultaet.getText();
        dd[5] = tf_DozentGeschlecht.getText();

        DefaultTableModel dtm = (DefaultTableModel) table_Dozenten.getModel();
        //dtm.addRow(ss);

        if (addiertedozent.checkTCnummer() == false) {
            nachricht = nachricht + "   Dozent kann nicht hinzugefugt werden falsche TC nummer Typ : Tc nummer muss 11 Ziffer haben ";
            lb_DozentNachricht.setText(nachricht);

        }
        if (uni.DozentexistenzKontrol(tf_DozentTcnummer.getText()) == true) {
            nachricht = nachricht + "Dozent kann nicht hinzugefugt werden es gibt schon eine Dozent mit gleiche Tcnummer";
            lb_DozentNachricht.setText(nachricht);
        }
        if (tf_DozentName.getText().isEmpty()) {
            nachricht = nachricht + "  Name der Dozent kann nicht leer sein";
            lb_DozentNachricht.setText(nachricht);
        }

        if (addiertedozent.checkTCnummer() == true && uni.DozentexistenzKontrol(tf_DozentTcnummer.getText()) == false && !tf_DozentName.getText().isEmpty()) {
            dtm.addRow(dd);
            uni.getDozents().add(addiertedozent);
            lb_DozentNachricht.setText("Dozent ist erfolgreich hinzugefugt");
        }


    }//GEN-LAST:event_dozenthinzufugenbuttonActionPerformed

    private void dozentloeschenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dozentloeschenbuttonActionPerformed
        int i = table_Dozenten.getSelectedRow();
        if (i >= 0) {

            DefaultTableModel dtmdozent = (DefaultTableModel) table_Dozenten.getModel();

            for (LVA lva : uni.getDozents().get(i).getLva()) {                 // wenn ein dozent geloest wird ,wird auch diese dozent von dozenten von eine lva - dersiverenler geloest
                lva.getDersiverenler().remove(uni.getDozents().get(i));
            }
            uni.getDozents().remove(i);
            dtmdozent.removeRow(i);
            lb_DozentNachricht.setText("Dozent ist geloscht");
        } else {
            lb_DozentNachricht.setText("Dozent ist nicht ausgewehlt");
        }

    }//GEN-LAST:event_dozentloeschenbuttonActionPerformed


    private void dozentbearbeitenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dozentbearbeitenbuttonActionPerformed
        int i = table_Dozenten.getSelectedRow();
        String nachricht = "";

        if (i < 0) {
            nachricht = nachricht + "dozent ist nicht ausgewehlt";
            lb_DozentNachricht.setText(nachricht);
        }

        if (i >= 0) {

            if (!uni.getDozents().get(i).getTC().equals(tf_DozentTcnummer.getText())) {
                nachricht = nachricht + "+Sie konnen nicht TC nummer nummer bearbeiten aber andere Attributen werden bearbeitet  ";
                lb_DozentNachricht.setText(nachricht);
            }

            if (tf_DozentName.getText().equals("")) {
                nachricht = nachricht + "   Name der Dozent kann nicht leer sein bitte fuellen sie name um dozent zu bearbeiten konnen";
                lb_DozentNachricht.setText(nachricht);
            } else {
                Dozent dozentneu = uni.getDozents().get(i);
                dozentneu.setName(tf_DozentName.getText());
                dozentneu.setNachname(tf_DozentNachname.getText());
                dozentneu.setTelefonnummer(tf_DozentTelefonnummer.getText());
                dozentneu.setFakultaet(tf_DozentFakultaet.getText());
                dozentneu.setGeschlecht(tf_DozentGeschlecht.getText());

                table_Dozenten.getModel().setValueAt(dozentneu.getName(), i, 0);
                table_Dozenten.getModel().setValueAt(dozentneu.getNachname(), i, 1);
                table_Dozenten.getModel().setValueAt(dozentneu.getTelefonnummer(), i, 3);
                table_Dozenten.getModel().setValueAt(dozentneu.getFakultaet(), i, 4);
                table_Dozenten.getModel().setValueAt(dozentneu.getGeschlecht(), i, 5);
                nachricht = nachricht + "Bearbeiten erfolgreich durchgefuhrt";
                lb_DozentNachricht.setText(nachricht);
            }

        }
    }//GEN-LAST:event_dozentbearbeitenbuttonActionPerformed

    private void lvaaddierebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvaaddierebuttonActionPerformed
        LVA tempLVA = new LVA(tf_LvaName.getText(), tf_LvaAkts.getText(), tf_LvaAbkurzung.getText(), tf_LvaWochendlichLehrstunde.getText());
        String nachricht = "";

        String[] lva = new String[4];
        lva[0] = tf_LvaName.getText();
        lva[1] = tf_LvaAbkurzung.getText();
        lva[2] = tf_LvaAkts.getText();
        lva[3] = tf_LvaWochendlichLehrstunde.getText();
        DefaultTableModel dtm = (DefaultTableModel) table_Lvas.getModel();
        DefaultTableModel dtm2 = (DefaultTableModel) table_Lvas1.getModel();     // ich habe das addiert weil,mochte ich alle lvas in studenten tab absehbar sein 
        DefaultTableModel dtm3 = (DefaultTableModel) table_Lvas2.getModel();     // ich habe das addiert weil,mochte ich alle lvas in dozenten tab absehbar sein
//dtm.addRow(ss);

        if (tf_LvaName.getText().equals("")) {
            nachricht = nachricht + "   Name der lva kann nicht leer sein";
            lb_NachrichtLva.setText(nachricht);
        }
        if (LVA.AbkurzungCheck(tempLVA.getAbkurzung()) == false) {
            nachricht = nachricht + "   LVA kann nicht hinzugefugt werden falsche Abkurzung  Typ. Abkurkuzng muss von 3 gross buschtaben und 3 ziffer wie : XXX111 entstehen ";
            lb_NachrichtLva.setText(nachricht);

        }
        if (uni.LVAexistenzKontrol(tf_LvaAbkurzung.getText()) == true) {
            nachricht = nachricht + "   LVA kann nicht hinzugefugt werden es gibt schon eine LVA mit gleiche Abkurzungkode";
            lb_NachrichtLva.setText(nachricht);

        }

        if (LVA.AbkurzungCheck(tempLVA.getAbkurzung()) == true && uni.LVAexistenzKontrol(tf_LvaAbkurzung.getText()) == false && !tf_LvaName.getText().isEmpty()) {

            dtm.addRow(lva);
            dtm2.addRow(lva);
            dtm3.addRow(lva);
            uni.getLvas().add(tempLVA);

            lb_NachrichtLva.setText("Lva ist erfolgreich hinzugefugt");
        }

    }//GEN-LAST:event_lvaaddierebuttonActionPerformed

    private void lvaloeschenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvaloeschenbuttonActionPerformed
        int i = table_Lvas.getSelectedRow();
        if (i >= 0) {

            DefaultTableModel dtmlva = (DefaultTableModel) table_Lvas.getModel();
            DefaultTableModel dtmlva2 = (DefaultTableModel) table_Lvas1.getModel();
            DefaultTableModel dtmlva3 = (DefaultTableModel) table_Lvas2.getModel();

            for (Student s : uni.getLvas().get(i).getDersialanlar()) {       //Dieser for schleife macht : Wenn ein Lva geloscht wird,wird auch diese lva otomatisch  vom Studenten geloscht
                s.getLva().remove(uni.getLvas().get(i));
            }

            for (Dozent d : uni.getLvas().get(i).getDersiverenler()) {    //Dieser for schleife macht : Wenn ein Lva geloscht wird,wird auch diese lva otomatisch  vom Dozenten geloscht 
                d.getLva().remove(uni.getLvas().get(i));
            }

            dtmlva.removeRow(i);
            dtmlva3.removeRow(i);                     //die geloeste lva vom die lva tafel im studenten tab geloest  
            dtmlva2.removeRow(i);                     //die geloeste lva vom die lva tafel im dozenten tab geloest   
            uni.getLvas().remove(i);
            lb_NachrichtLva.setText("LVA ist geloscht");
        } else {
            lb_NachrichtLva.setText("Lva ist nicht ausgewehlt");
        }
    }//GEN-LAST:event_lvaloeschenbuttonActionPerformed

    private void lvabearbeitenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvabearbeitenbuttonActionPerformed
        int i = table_Lvas.getSelectedRow();
        String nachricht = "";

        if (i < 0) {
            nachricht = nachricht + "lva ist nicht ausgewehlt";
            lb_NachrichtLva.setText(nachricht);
        }

        if (i >= 0) {
            if (!uni.getLvas().get(i).getAbkurzung().equals(tf_LvaAbkurzung.getText())) {
                nachricht = nachricht + "+Sie konnen nicht Abkurzung bearbeiten aber andere Attributen werden bearbeitet  ";
                lb_NachrichtLva.setText(nachricht);
            }
            if (tf_LvaName.getText().equals("")) {
                nachricht = nachricht + "   Name der Lva kann nicht leer sein fuellen sie name um lva zu bearbeiten konnen";
                lb_NachrichtLva.setText(nachricht);
            } else {

                LVA lvaneu = uni.getLvas().get(i);
                lvaneu.setName(tf_LvaName.getText());
                lvaneu.setAKTS(tf_LvaAkts.getText());
                lvaneu.setWochentlichLehrstunde(tf_LvaWochendlichLehrstunde.getText());

                table_Lvas.getModel().setValueAt(lvaneu.getName(), i, 0);
                table_Lvas.getModel().setValueAt(lvaneu.getAKTS(), i, 2);
                table_Lvas.getModel().setValueAt(lvaneu.getWochentlichLehrstunde(), i, 3);
                nachricht = nachricht + "Bearbeiten erfolgreich durchgefuhrt";
                lb_NachrichtLva.setText(nachricht);
            }

        }
    }//GEN-LAST:event_lvabearbeitenbuttonActionPerformed


    private void tf_sucheStudentFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_sucheStudentFilterKeyReleased
        DefaultTableModel dtm = (DefaultTableModel) table_Studenten.getModel();
        String suchestudent = tf_sucheStudentFilter.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        table_Studenten.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(suchestudent));

    }//GEN-LAST:event_tf_sucheStudentFilterKeyReleased

    private void studentzurlvaanmeldenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentzurlvaanmeldenbuttonActionPerformed

        int i = table_Studenten.getSelectedRow();
        int y = table_Lvas1.getSelectedRow();

        String nachricht = "";

        if (i < 0) {
            nachricht = nachricht + "Student ist nicht ausgewehlt";
            lb_Nachricht.setText(nachricht);
        }
        if (y < 0) {
            nachricht = nachricht + " LVA ist nicht ausgewehlt";
            lb_Nachricht.setText(nachricht);
        }

        if (!uni.getStudents().isEmpty() && !uni.getLvas().isEmpty() && i >= 0 && y >= 0) {

            String nummer = uni.getStudents().get(i).getMatrikelNummer();
            String lvacode = uni.getLvas().get(y).getAbkurzung();

            if (uni.StudentLvaAnmeldenKontrol(i, y) == false) {
                nachricht = nachricht + "Diese Student ist schon diese Lva angemeldet.Sie konnen diese Student nicht wieder anmelden gleiche Lva";
                lb_Nachricht.setText(nachricht);
            } else {

                uni.studentZurLvaAnmelden(nummer, lvacode);
                lb_Nachricht.setText("Student ist zu Lva addiert");
            }
        }


    }//GEN-LAST:event_studentzurlvaanmeldenbuttonActionPerformed

    private void listAlleLvaStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAlleLvaStudentButtonActionPerformed

        DefaultTableModel dtmlist = (DefaultTableModel) table_LvasEinesStudents.getModel();
        dtmlist.setRowCount(0);
        lb_Nachricht.setText("");
        int k = table_Studenten.getSelectedRow();

        if (!uni.getStudents().isEmpty() && k >= 0) {

            if (uni.getStudents().get(table_Studenten.getSelectedRow()).getLva().isEmpty()) {
                lb_Nachricht.setText("Die Student die sie seine Matrikelnummer geschrieben,ist keine Lva angemeldet.");
            } else {
                String nummer = uni.getStudents().get(table_Studenten.getSelectedRow()).getMatrikelNummer();
                for (int i = 0; i < uni.getStudents().get(table_Studenten.getSelectedRow()).getLva().size(); i++) {
                    String[] ss = new String[1];
                    ss[0] = uni.getStudents().get(table_Studenten.getSelectedRow()).getLva().get(i).getAbkurzung();
                    dtmlist.addRow(ss);
                    lb_Nachricht.setText("Die LVA s der Student ist gelistet");
                }
            }
        } else {
            lb_Nachricht.setText("Student ist nicht ausgewehlt");
        }


    }//GEN-LAST:event_listAlleLvaStudentButtonActionPerformed

    private void studentzurlvaabmeldenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentzurlvaabmeldenbuttonActionPerformed
        int i = table_Studenten.getSelectedRow();
        int y = table_Lvas1.getSelectedRow();
        String nachricht = "";

        if (i < 0) {
            nachricht = nachricht + "Student ist nicht ausgewehlt";
            lb_Nachricht.setText(nachricht);
        }
        if (y < 0) {
            nachricht = nachricht + " LVA ist nicht ausgewehlt";
            lb_Nachricht.setText(nachricht);
        }

        if (!uni.getStudents().isEmpty() && !uni.getLvas().isEmpty() && i >= 0 && y >= 0) {

            String studentnummerabmelden = uni.getStudents().get(i).getMatrikelNummer();
            String lvacodeabmelden = uni.getLvas().get(y).getAbkurzung();

            if (uni.StudentLvaAbmeldenKontrol(i, y) == false) {
                nachricht = nachricht + "Diese Student hat schon diese Lva nicht angemeldet.Sie konnen diese Student nicht abmelden";
                lb_Nachricht.setText(nachricht);
            } else {
                nachricht = nachricht + "Student Abgemeldet";
                uni.studentZurLvaAbmelden(studentnummerabmelden, lvacodeabmelden);
                lb_Nachricht.setText(nachricht);
            }

        }
    }//GEN-LAST:event_studentzurlvaabmeldenbuttonActionPerformed

    private void dozentzurlvaanmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dozentzurlvaanmeldenActionPerformed
        int i = table_Dozenten.getSelectedRow();
        int y = table_Lvas2.getSelectedRow();
        String nachricht = "";

        if (i < 0) {
            nachricht = nachricht + "Dozent ist nicht ausgewehlt";
            lb_DozentNachricht.setText(nachricht);
        }
        if (y < 0) {
            nachricht = nachricht + " LVA ist nicht ausgewehlt";
            lb_DozentNachricht.setText(nachricht);
        }

        if (!uni.getDozents().isEmpty() && !uni.getLvas().isEmpty() && i >= 0 && y >= 0) {

            String TCnummer = uni.getDozents().get(i).getTC();
            String lvacode = uni.getLvas().get(y).getAbkurzung();

            if (uni.DozentLvaAnmeldenKontrol(i, y) == false) {
                nachricht = nachricht + "Diese Dozent ist schon diese Lva angemeldet.Sie konnen diese Dozent nicht wieder anmelden gleiche Lva";
                lb_DozentNachricht.setText(nachricht);
            } else {
                uni.dozentZurLvaZuweisen(TCnummer, lvacode);
                nachricht = nachricht + "Dozent ist zu Lva angemeldet";
                lb_DozentNachricht.setText(nachricht);
            }

        }


    }//GEN-LAST:event_dozentzurlvaanmeldenActionPerformed

    private void dozentzurlvaabmeldenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dozentzurlvaabmeldenbuttonActionPerformed
        int i = table_Dozenten.getSelectedRow();
        int y = table_Lvas2.getSelectedRow();
        String nachricht = "";

        if (i < 0) {
            nachricht = nachricht + "Dozent ist nicht ausgewehlt";
            lb_DozentNachricht.setText(nachricht);
        }
        if (y < 0) {
            nachricht = nachricht + " LVA ist nicht ausgewehlt";
            lb_DozentNachricht.setText(nachricht);
        }

        if (!uni.getDozents().isEmpty() && !uni.getLvas().isEmpty() && i >= 0 && y >= 0) {

            String DozentTcnummerabmelden = uni.getDozents().get(i).getTC();
            String lvacodeabmelden = uni.getLvas().get(y).getAbkurzung();

            if (uni.DozentLvaAbmeldenKontrol(i, y) == false) {
                nachricht = nachricht + "Diese Dozent ist nicht diese Lva angemeldet,Sie konnen nicht diese Dozent von diese Lva Abmelden";
                lb_DozentNachricht.setText(nachricht);
            } else {
                uni.dozentZurLvaAbmelden(DozentTcnummerabmelden, lvacodeabmelden);
                nachricht = nachricht + "Dozent ist von Lva Abgemeldet";
                lb_DozentNachricht.setText(nachricht);
            }
        }
    }//GEN-LAST:event_dozentzurlvaabmeldenbuttonActionPerformed

    private void listAlleLvaDozentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAlleLvaDozentButtonActionPerformed
        DefaultTableModel dtmlist2 = (DefaultTableModel) table_LvasEinesDozents.getModel();
        dtmlist2.setRowCount(0);
        lb_DozentNachricht.setText("");
        int k = table_Dozenten.getSelectedRow();

        if (k >= 0) {
            if (uni.getDozents().get(table_Dozenten.getSelectedRow()).getLva().isEmpty()) {
                lb_DozentNachricht.setText("Die Dozent die sie seine Tc nummer geschrieben,ist keine Lva angemeldet.");
            } else {
                String nummer = uni.getDozents().get(table_Dozenten.getSelectedRow()).getTC();
                for (int i = 0; i < uni.getDozents().get(table_Dozenten.getSelectedRow()).getLva().size(); i++) { 
                    String[] dd = new String[1];
                    dd[0] = uni.getDozents().get(table_Dozenten.getSelectedRow()).getLva().get(i).getAbkurzung();
                    dtmlist2.addRow(dd);
                    lb_DozentNachricht.setText("Die LVA s der Dozent ist gelistet");
                }
            }
        } else {
            lb_DozentNachricht.setText("Dozent ist nicht ausgewehlt");
        }

    }//GEN-LAST:event_listAlleLvaDozentButtonActionPerformed


    private void listAlleStudentEinerLvaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAlleStudentEinerLvaButtonActionPerformed
        DefaultTableModel dtmlist3 = (DefaultTableModel) table_StudentenEinerLva.getModel();
        dtmlist3.setRowCount(0);
        int k = table_Lvas.getSelectedRow();

        if (k < 0) {
            lb_NachrichtLva.setText("lva ist nicht ausgewehlt ");
        }
        if (!uni.getLvas().isEmpty() && k >= 0) {

            if (uni.getLvas().get(table_Lvas.getSelectedRow()).getDersialanlar().isEmpty()) {
                lb_NachrichtLva.setText("Diese LVA hat keine Student");
            } else {
                String studentsdeslvacode = uni.getLvas().get(table_Lvas.getSelectedRow()).getAbkurzung();
                for (int i = 0; i < uni.getLvas().get(table_Lvas.getSelectedRow()).getDersialanlar().size(); i++) {
                    String[] studentimlva = new String[3];
                    studentimlva[0] = uni.getLvas().get(table_Lvas.getSelectedRow()).getDersialanlar().get(i).getMatrikelNummer();
                    studentimlva[1] = uni.getLvas().get(table_Lvas.getSelectedRow()).getDersialanlar().get(i).getName();
                    studentimlva[2] = uni.getLvas().get(table_Lvas.getSelectedRow()).getDersialanlar().get(i).getNachname();
                    dtmlist3.addRow(studentimlva);

                    lb_NachrichtLva.setText("alle students im lva ist gelistet ");

                }
            }
        }

    }//GEN-LAST:event_listAlleStudentEinerLvaButtonActionPerformed

    private void listAlleDozentenEinerLvaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAlleDozentenEinerLvaButtonActionPerformed
        DefaultTableModel dtmlist4 = (DefaultTableModel) table_DozentenEinerLva.getModel();
        dtmlist4.setRowCount(0);
        int k = table_Lvas.getSelectedRow();

        if (k < 0) {
            lb_NachrichtLva.setText("lva ist nicht ausgewehlt ");
        }

        if (!uni.getLvas().isEmpty() && k >= 0) {
            if (uni.getLvas().get(table_Lvas.getSelectedRow()).getDersiverenler().isEmpty()) {
                lb_NachrichtLva.setText("Diese LVA hat keine Dozent");
            } else {
                String dozentdeslvacode = uni.getLvas().get(table_Lvas.getSelectedRow()).getAbkurzung();
                for (int i = 0; i < uni.getLvas().get(table_Lvas.getSelectedRow()).getDersiverenler().size(); i++) {
                    String[] dozentimlva = new String[3];
                    dozentimlva[0] = uni.getLvas().get(table_Lvas.getSelectedRow()).getDersiverenler().get(i).getTC();
                    dozentimlva[1] = uni.getLvas().get(table_Lvas.getSelectedRow()).getDersiverenler().get(i).getName();
                    dozentimlva[2] = uni.getLvas().get(table_Lvas.getSelectedRow()).getDersiverenler().get(i).getNachname();
                    dtmlist4.addRow(dozentimlva);
                    lb_NachrichtLva.setText("alle dozent im lva ist gelistet ");
                }
            }
        }
    }//GEN-LAST:event_listAlleDozentenEinerLvaButtonActionPerformed

    private void tf_sucheDozentenFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_sucheDozentenFilterKeyReleased
        DefaultTableModel dtm2 = (DefaultTableModel) table_Dozenten.getModel();
        String suchedozent = tf_sucheDozentenFilter.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm2);
        table_Dozenten.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(suchedozent));
    }//GEN-LAST:event_tf_sucheDozentenFilterKeyReleased

    private void tf_sucheLvaFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_sucheLvaFilterKeyReleased
        DefaultTableModel dtm3 = (DefaultTableModel) table_Lvas.getModel();
        String suchelva = tf_sucheLvaFilter.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm3);
        table_Lvas.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(suchelva));
    }//GEN-LAST:event_tf_sucheLvaFilterKeyReleased

    Universitaet uni = new Universitaet("TDU", "Beykoz", 5000);

    public static void main(String args[]) {

        Bildschirm bildschirm = new Bildschirm();
        bildschirm.setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dozentbearbeitenbutton;
    private javax.swing.JButton dozenthinzufugenbutton;
    private javax.swing.JButton dozentloeschenbutton;
    private javax.swing.JButton dozentzurlvaabmeldenbutton;
    private javax.swing.JButton dozentzurlvaanmelden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lb_DozentNachricht;
    private javax.swing.JLabel lb_Nachricht;
    private javax.swing.JLabel lb_NachrichtLva;
    private javax.swing.JButton listAlleDozentenEinerLvaButton;
    private javax.swing.JButton listAlleLvaDozentButton;
    private javax.swing.JButton listAlleLvaStudentButton;
    private javax.swing.JButton listAlleStudentEinerLvaButton;
    private javax.swing.JButton lvaaddierebutton;
    private javax.swing.JButton lvabearbeitenbutton;
    private javax.swing.JButton lvaloeschenbutton;
    private javax.swing.JButton studentaddierebutton;
    private javax.swing.JButton studentbearbeitenbutton;
    private javax.swing.JButton studentloeschenbutton;
    private javax.swing.JButton studentzurlvaabmeldenbutton;
    private javax.swing.JButton studentzurlvaanmeldenbutton;
    private javax.swing.JTable table_Dozenten;
    private javax.swing.JTable table_DozentenEinerLva;
    private javax.swing.JTable table_Lvas;
    private javax.swing.JTable table_Lvas1;
    private javax.swing.JTable table_Lvas2;
    private javax.swing.JTable table_LvasEinesDozents;
    private javax.swing.JTable table_LvasEinesStudents;
    private javax.swing.JTable table_Studenten;
    private javax.swing.JTable table_StudentenEinerLva;
    private javax.swing.JTextField tf_Anmeldedatum;
    private javax.swing.JTextField tf_DozentFakultaet;
    private javax.swing.JTextField tf_DozentGeschlecht;
    private javax.swing.JTextField tf_DozentNachname;
    private javax.swing.JTextField tf_DozentName;
    private javax.swing.JTextField tf_DozentTcnummer;
    private javax.swing.JTextField tf_DozentTelefonnummer;
    private javax.swing.JTextField tf_Fachbereich;
    private javax.swing.JTextField tf_Fakultaet;
    private javax.swing.JTextField tf_Geschlecht;
    private javax.swing.JTextField tf_Klasse;
    private javax.swing.JTextField tf_LvaAbkurzung;
    private javax.swing.JTextField tf_LvaAkts;
    private javax.swing.JTextField tf_LvaName;
    private javax.swing.JTextField tf_LvaWochendlichLehrstunde;
    private javax.swing.JTextField tf_Matrikelnummer;
    private javax.swing.JTextField tf_Nachname;
    private javax.swing.JTextField tf_Name;
    private javax.swing.JTextField tf_Notendurchschnitt;
    private javax.swing.JTextField tf_Telefonnummer;
    private javax.swing.JTextField tf_sucheDozentenFilter;
    private javax.swing.JTextField tf_sucheLvaFilter;
    private javax.swing.JTextField tf_sucheStudentFilter;
    // End of variables declaration//GEN-END:variables

    private void elseif() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

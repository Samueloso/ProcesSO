/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Clases;

import java.awt.Color;

/**
 *
 * @author Radenixlol
 */
public class InterfazSimulation extends javax.swing.JFrame {

    Admin admin = new Admin(this);
    Color green = new Color(0, 153, 0);
    Color red = new Color(255, 0, 0);
    Color gray = new Color(102, 102, 102);
    Color white = new Color(255, 255, 255);
    Lista lista = new Lista();
    boolean visibility = false;

    /**
     * Creates new form InterfazSimulation
     */
    public InterfazSimulation() {
        initComponents();
        admin.init();
    }

    public void UpdateCola(Boolean z, int type, Cola cola) {
        String text = "";
        boolean empty = cola.ColaVacia();
        if (z) {
            if (!empty) {
                Personajes place = cola.getFinCola();
                text += place.getId();
                place = place.getAnterior();
                while (place != null) {
                    text += " -- ";
                    text += place.getId();
                    place = place.getAnterior();
                }
            }
            switch (type) {
                case 1 -> {
                    Cola1Z.setText(text);
                }
                case 2 -> {
                    Cola2Z.setText(text);
                }
                case 3 -> {
                    Cola3Z.setText(text);
                }
                case 4 -> {
                    ColaRZ.setText(text);
                }
            }
        } else {
            if (!empty) {
                Personajes place = cola.getInicioCola();
                text += place.getId();
                place = place.getSiguiente();
                while (place != null) {
                    text += " -- ";
                    text += place.getId();
                    place = place.getSiguiente();
                }
            }
            switch (type) {
                case 1 -> {
                    Cola1SF.setText(text);
                }
                case 2 -> {
                    Cola2SF.setText(text);
                }
                case 3 -> {
                    Cola3SF.setText(text);
                }
                case 4 -> {
                    ColaRSF.setText(text);
                }
            }
        }
    }

    public void UpdateTextZ() {
        String nameZ = admin.getSimulador().getZ().getNombre();
        CasillaZ.setText(nameZ);

        if (nameZ == "Link") {

            CasillaZ.setVisible(true);
        } else {

            CasillaZ.setVisible(false);
       }
        if (nameZ == "Ganondorf") {

            CasillaZ1.setVisible(true);
        } else {
            CasillaZ1.setVisible(false);
        }
        if (nameZ == "Zelda") {

            CasillaZ2.setVisible(true);
        } else {

            CasillaZ2.setVisible(false);
        }
      if (nameZ == "Yunobo") {

          CasillaZ3.setVisible(true);
        } else {

            CasillaZ3.setVisible(false);
        }
        if (nameZ == "Tureli") {

            CasillaZ4.setVisible(true);
        } else {

            CasillaZ4.setVisible(false);
        }
        if (nameZ == "Sidon") {

            CasillaZ5.setVisible(true);
        } else {

            CasillaZ5.setVisible(false);
       }

       if (nameZ == "Riju") {

            CasillaZ6.setVisible(true);      } 
       else {

            CasillaZ6.setVisible(false);
        }
       if (nameZ == "Rauru") {

           CasillaZ7.setVisible(true);
        } else {
            CasillaZ7.setVisible(false);
        }
        if (nameZ == "Prunia") {

            CasillaZ8.setVisible(true);
        } else {

            CasillaZ8.setVisible(false);
        }
        if (nameZ == "Mineru") {

            CasillaZ9.setVisible(true);
        } else {

            CasillaZ9.setVisible(false);
        }
        if (nameZ == "Kolog") {

           CasillaZ10.setVisible(true);
       } else {

            CasillaZ10.setVisible(false);
        }

    }

    public void UpdateTextSF() {
        String nameSF = admin.getSimulador().getSF().getNombre();
        CasillaSF.setText(nameSF);

        if (nameSF == "Viper") {

            CasillaSF.setVisible(true);
        } else {

            CasillaSF.setVisible(false);
        }
        if (nameSF == "Vega") {

            CasillaSF1.setVisible(true);
        } else {
            CasillaSF1.setVisible(false);
        }
        if (nameSF == "Ryu") {

            CasillaSF2.setVisible(true);
        } else {

            CasillaSF2.setVisible(false);
        }
        if (nameSF == "M.Bison") {

            CasillaSF3.setVisible(true);
        } else {

            CasillaSF3.setVisible(false);
        }
        if (nameSF == "Ken Masters") {

            CasillaSF4.setVisible(true);
        } else {

            CasillaSF4.setVisible(false);
        }
        if (nameSF == "Chun-Li") {

            CasillaSF5.setVisible(true);
        } else {

            CasillaSF5.setVisible(false);
        }

        if (nameSF == "Gouken") {

            CasillaSF6.setVisible(true);
        } else {

            CasillaSF6.setVisible(false);
        }
        if (nameSF == "Cammy") {

            CasillaSF7.setVisible(true);
        } else {
            CasillaSF7.setVisible(false);
        }
        if (nameSF == "Blanka") {

            CasillaSF8.setVisible(true);
        } else {

            CasillaSF8.setVisible(false);
        }
        if (nameSF == "Akuma") {

            CasillaSF9.setVisible(true);
        } else {

            CasillaSF9.setVisible(false);
        }

    }

    public void SetStatusAdmin(String t) {
        StatusAdmin.setText(t);
    }

    public void announce(String value) {
        if (value == "Tie") {
            StatusZ.setBackground(gray);
            StatusZ.setText("TIE");
            StatusSF.setBackground(gray);
            StatusSF.setText("TIE");
        } else if (value == "Unable") {
            StatusZ.setBackground(white);
            StatusZ.setText("CANCELLED");
            StatusSF.setBackground(white);
            StatusSF.setText("CANCELLED");
        }

    }

    public void announceWinner(boolean Z) {
        if (Z) {
            StatusZ.setBackground(green);
            StatusZ.setText("WIN");
            StatusSF.setBackground(red);
            StatusSF.setText("LOSE");
            int points = admin.getPointsZ();
            admin.setPointsZ(points);
            CountZ.setText(Integer.toString(points));
        } else {
            StatusZ.setBackground(red);
            StatusZ.setText("LOSE");
            StatusSF.setBackground(green);
            StatusSF.setText("WIN");
            int points = admin.getPointsSF();
            admin.setPointsSF(points);
            CountSF.setText(Integer.toString(points));
        }

    }

    public void setWhite() {
        StatusZ.setBackground(white);
        StatusZ.setText("");
        StatusSF.setBackground(white);
        StatusSF.setText("");
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Scroll1Z = new javax.swing.JScrollPane();
        Cola1Z = new javax.swing.JTextArea();
        Scroll2Z = new javax.swing.JScrollPane();
        Cola2Z = new javax.swing.JTextArea();
        Scroll3Z3 = new javax.swing.JScrollPane();
        Cola3Z = new javax.swing.JTextArea();
        ScrollRZ = new javax.swing.JScrollPane();
        ColaRZ = new javax.swing.JTextArea();
        Scroll1SF = new javax.swing.JScrollPane();
        Cola1SF = new javax.swing.JTextArea();
        Scroll2SF = new javax.swing.JScrollPane();
        Cola2SF = new javax.swing.JTextArea();
        Scroll3SF = new javax.swing.JScrollPane();
        Cola3SF = new javax.swing.JTextArea();
        ScrollRSF = new javax.swing.JScrollPane();
        ColaRSF = new javax.swing.JTextArea();
        CasillaZ = new javax.swing.JLabel();
        StatusZ = new javax.swing.JTextField();
        StatusSF = new javax.swing.JTextField();
        CasillaSF = new javax.swing.JLabel();
        CountZ = new javax.swing.JTextField();
        CountSF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BotonWinners = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        seconds = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        StatusAdmin = new javax.swing.JTextField();
        CasillaZ1 = new javax.swing.JLabel();
        CasillaZ2 = new javax.swing.JLabel();
        CasillaZ3 = new javax.swing.JLabel();
        CasillaZ4 = new javax.swing.JLabel();
        CasillaZ5 = new javax.swing.JLabel();
        CasillaZ6 = new javax.swing.JLabel();
        CasillaZ7 = new javax.swing.JLabel();
        CasillaZ8 = new javax.swing.JLabel();
        CasillaZ9 = new javax.swing.JLabel();
        CasillaZ10 = new javax.swing.JLabel();
        CasillaSF1 = new javax.swing.JLabel();
        CasillaSF2 = new javax.swing.JLabel();
        CasillaSF3 = new javax.swing.JLabel();
        CasillaSF4 = new javax.swing.JLabel();
        CasillaSF5 = new javax.swing.JLabel();
        CasillaSF6 = new javax.swing.JLabel();
        CasillaSF7 = new javax.swing.JLabel();
        CasillaSF8 = new javax.swing.JLabel();
        CasillaSF9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Scroll1Z.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll1Z.setFocusable(false);

        Cola1Z.setEditable(false);
        Cola1Z.setColumns(20);
        Cola1Z.setRows(5);
        Scroll1Z.setViewportView(Cola1Z);

        jPanel1.add(Scroll1Z, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 250, 60));

        Scroll2Z.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll2Z.setFocusable(false);

        Cola2Z.setEditable(false);
        Cola2Z.setColumns(20);
        Cola2Z.setRows(5);
        Scroll2Z.setViewportView(Cola2Z);

        jPanel1.add(Scroll2Z, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 250, 60));

        Scroll3Z3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll3Z3.setFocusable(false);

        Cola3Z.setEditable(false);
        Cola3Z.setColumns(20);
        Cola3Z.setRows(5);
        Scroll3Z3.setViewportView(Cola3Z);

        jPanel1.add(Scroll3Z3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 250, 60));

        ScrollRZ.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollRZ.setFocusable(false);

        ColaRZ.setEditable(false);
        ColaRZ.setColumns(20);
        ColaRZ.setRows(5);
        ScrollRZ.setViewportView(ColaRZ);

        jPanel1.add(ScrollRZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 250, 60));

        Scroll1SF.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll1SF.setFocusable(false);

        Cola1SF.setEditable(false);
        Cola1SF.setColumns(20);
        Cola1SF.setRows(5);
        Scroll1SF.setViewportView(Cola1SF);

        jPanel1.add(Scroll1SF, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 90, 250, 60));

        Scroll2SF.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll2SF.setFocusable(false);

        Cola2SF.setEditable(false);
        Cola2SF.setColumns(20);
        Cola2SF.setRows(5);
        Scroll2SF.setViewportView(Cola2SF);

        jPanel1.add(Scroll2SF, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, 250, 60));

        Scroll3SF.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll3SF.setFocusable(false);

        Cola3SF.setEditable(false);
        Cola3SF.setColumns(20);
        Cola3SF.setRows(5);
        Scroll3SF.setViewportView(Cola3SF);

        jPanel1.add(Scroll3SF, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 280, 250, 60));

        ScrollRSF.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollRSF.setFocusable(false);

        ColaRSF.setEditable(false);
        ColaRSF.setColumns(20);
        ColaRSF.setRows(5);
        ScrollRSF.setViewportView(ColaRSF);

        jPanel1.add(ScrollRSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 390, 250, 60));

        CasillaZ.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Link.png")); // NOI18N
        CasillaZ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 270, 350));

        StatusZ.setEditable(false);
        StatusZ.setBackground(new java.awt.Color(102, 102, 102));
        StatusZ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StatusZ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StatusZ.setText("CANCELADO");
        StatusZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusZActionPerformed(evt);
            }
        });
        jPanel1.add(StatusZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 270, 30));

        StatusSF.setEditable(false);
        StatusSF.setBackground(new java.awt.Color(255, 0, 0));
        StatusSF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StatusSF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StatusSF.setText("LOSE");
        jPanel1.add(StatusSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 270, 30));
        StatusSF.getAccessibleContext().setAccessibleName("");
        StatusSF.getAccessibleContext().setAccessibleDescription("");

        CasillaSF.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Viper.png")); // NOI18N
        CasillaSF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 270, 350));

        CountZ.setEditable(false);
        CountZ.setBackground(new java.awt.Color(204, 204, 204));
        CountZ.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CountZ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CountZ.setText("0");
        CountZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountZActionPerformed(evt);
            }
        });
        jPanel1.add(CountZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 120, 40));

        CountSF.setEditable(false);
        CountSF.setBackground(new java.awt.Color(204, 204, 204));
        CountSF.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CountSF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CountSF.setText("0");
        jPanel1.add(CountSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 120, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Cola 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Cola 2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Cola 3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Cola de Refuerzo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Cola 1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Cola 2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Cola 3");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Cola de Refuerzo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\ZeldaTOTKLogo.png")); // NOI18N
        jLabel9.setText("Zelda");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 250, 140));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\logosf.png")); // NOI18N
        jLabel10.setText("Street Fighter");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 560, 260, 140));

        BotonWinners.setText("Mostrar");
        BotonWinners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonWinnersActionPerformed(evt);
            }
        });
        jPanel1.add(BotonWinners, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 490, 80, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Segundos de duración de la simulación");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ganadores");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 460, 90, 30));

        seconds.setEditable(false);
        seconds.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        seconds.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seconds.setText("10");
        jPanel1.add(seconds, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, -1));

        StatusAdmin.setEditable(false);
        StatusAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StatusAdmin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(StatusAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 490, 260, -1));

        CasillaZ1.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ1.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Ganondorf.png")); // NOI18N
        CasillaZ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 270, 350));

        CasillaZ2.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ2.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Zelda.png")); // NOI18N
        CasillaZ2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 270, 350));

        CasillaZ3.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ3.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Yunobo.png")); // NOI18N
        CasillaZ3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 270, 350));

        CasillaZ4.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ4.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Tureli.png")); // NOI18N
        CasillaZ4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 270, 350));

        CasillaZ5.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ5.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Sidon.png")); // NOI18N
        CasillaZ5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 270, 350));

        CasillaZ6.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ6.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Riju.png")); // NOI18N
        CasillaZ6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 270, 350));

        CasillaZ7.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ7.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Rauru.png")); // NOI18N
        CasillaZ7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 270, 350));

        CasillaZ8.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ8.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Prunia.png")); // NOI18N
        CasillaZ8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 270, 350));

        CasillaZ9.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ9.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Mineru.png")); // NOI18N
        CasillaZ9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 270, 350));

        CasillaZ10.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ10.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Kolog.png")); // NOI18N
        CasillaZ10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 270, 350));

        CasillaSF1.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF1.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Vega.png")); // NOI18N
        CasillaSF1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 270, 350));

        CasillaSF2.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF2.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Ryu.png")); // NOI18N
        CasillaSF2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 270, 350));

        CasillaSF3.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF3.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\MBison.png")); // NOI18N
        CasillaSF3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 270, 350));

        CasillaSF4.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF4.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Ken Masters.png")); // NOI18N
        CasillaSF4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 270, 350));

        CasillaSF5.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF5.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Chuli.png")); // NOI18N
        CasillaSF5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 270, 350));

        CasillaSF6.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF6.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Gouken.png")); // NOI18N
        CasillaSF6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 270, 350));

        CasillaSF7.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF7.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Cammy.png")); // NOI18N
        CasillaSF7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 270, 350));

        CasillaSF8.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF8.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Blanka.png")); // NOI18N
        CasillaSF8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 270, 350));

        CasillaSF9.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF9.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Akuma.png")); // NOI18N
        CasillaSF9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 270, 350));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\ZELDOTA.gif")); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 620, 710));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\SF.gif")); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 620, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CountZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountZActionPerformed

    private void StatusZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusZActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int t = admin.getTiming();
        if (t > 1 && t <= 30) {

            t--;
            seconds.setText(Integer.toString(t));
            admin.setTiming(t);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int t = admin.getTiming();
        if (t >= 1 && t < 30) {

            t++;
            seconds.setText(Integer.toString(t));
            admin.setTiming(t);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonWinnersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonWinnersActionPerformed
        // TODO add your handling code here:
        if (!visibility) {
            Cola winners = admin.getWinners();
            lista.listado(winners);
            lista.setVisible(true);
            visibility = true;
            BotonWinners.setText("Ocultar");
        } else {
            lista.setVisible(false);
            visibility = false;
            BotonWinners.setText("Mostrar");
        }

    }//GEN-LAST:event_BotonWinnersActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazSimulation.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazSimulation.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazSimulation.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazSimulation.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazSimulation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonWinners;
    private javax.swing.JLabel CasillaSF;
    private javax.swing.JLabel CasillaSF1;
    private javax.swing.JLabel CasillaSF2;
    private javax.swing.JLabel CasillaSF3;
    private javax.swing.JLabel CasillaSF4;
    private javax.swing.JLabel CasillaSF5;
    private javax.swing.JLabel CasillaSF6;
    private javax.swing.JLabel CasillaSF7;
    private javax.swing.JLabel CasillaSF8;
    private javax.swing.JLabel CasillaSF9;
    private javax.swing.JLabel CasillaZ;
    private javax.swing.JLabel CasillaZ1;
    private javax.swing.JLabel CasillaZ10;
    private javax.swing.JLabel CasillaZ2;
    private javax.swing.JLabel CasillaZ3;
    private javax.swing.JLabel CasillaZ4;
    private javax.swing.JLabel CasillaZ5;
    private javax.swing.JLabel CasillaZ6;
    private javax.swing.JLabel CasillaZ7;
    private javax.swing.JLabel CasillaZ8;
    private javax.swing.JLabel CasillaZ9;
    private javax.swing.JTextArea Cola1SF;
    private javax.swing.JTextArea Cola1Z;
    private javax.swing.JTextArea Cola2SF;
    private javax.swing.JTextArea Cola2Z;
    private javax.swing.JTextArea Cola3SF;
    private javax.swing.JTextArea Cola3Z;
    private javax.swing.JTextArea ColaRSF;
    private javax.swing.JTextArea ColaRZ;
    private javax.swing.JTextField CountSF;
    private javax.swing.JTextField CountZ;
    private javax.swing.JScrollPane Scroll1SF;
    private javax.swing.JScrollPane Scroll1Z;
    private javax.swing.JScrollPane Scroll2SF;
    private javax.swing.JScrollPane Scroll2Z;
    private javax.swing.JScrollPane Scroll3SF;
    private javax.swing.JScrollPane Scroll3Z3;
    private javax.swing.JScrollPane ScrollRSF;
    private javax.swing.JScrollPane ScrollRZ;
    private javax.swing.JTextField StatusAdmin;
    private javax.swing.JTextField StatusSF;
    private javax.swing.JTextField StatusZ;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField seconds;
    // End of variables declaration//GEN-END:variables
}

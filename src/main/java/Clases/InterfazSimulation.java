/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Clases;

/**
 *
 * @author Radenixlol
 */
public class InterfazSimulation extends javax.swing.JFrame {

    Admin admin = new Admin(this);

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
        
        if(nameZ=="Link"){
        
        CasillaZ.setVisible(true);
        }else{
        
        CasillaZ.setVisible(false);
        }
        if(nameZ=="Ganondorf"){
        
        CasillaZ1.setVisible(true);
        }else{
        CasillaZ1.setVisible(false);
        }        
        if(nameZ=="Zelda"){
       
        CasillaZ2.setVisible(true);
        }else{
      
        CasillaZ2.setVisible(false);
        }        
        if(nameZ=="Yunobo"){
      
        CasillaZ3.setVisible(true);
        }else{
  
        CasillaZ3.setVisible(false);
        }        
        if(nameZ=="Tureli"){
   
        CasillaZ4.setVisible(true);
        }else{
       
        CasillaZ4.setVisible(false);
        }        
        if(nameZ=="Sidon"){
       
        CasillaZ5.setVisible(true);
        }else{

        CasillaZ5.setVisible(false);
        }
        
        if(nameZ=="Riju"){
        
        CasillaZ6.setVisible(true);
        }else{
        
        CasillaZ6.setVisible(false);
        }
        if(nameZ=="Rauru"){
        
        CasillaZ7.setVisible(true);
        }else{
        CasillaZ7.setVisible(false);
        }        
        if(nameZ=="Prunia"){
       
        CasillaZ8.setVisible(true);
        }else{
      
        CasillaZ8.setVisible(false);
        }        
        if(nameZ=="Mineru"){
      
        CasillaZ9.setVisible(true);
        }else{
  
        CasillaZ9.setVisible(false);
        }        
        if(nameZ=="Kolog"){
   
        CasillaZ10.setVisible(true);
        }else{
       
        CasillaZ10.setVisible(false);
        }        
  
        
    }
    
    public void UpdateTextSF() {
        String nameSF = admin.getSimulador().getSF().getNombre();
       
        if(nameSF=="Viper"){
        
        CasillaSF.setVisible(true);
        }else{
        
        CasillaSF.setVisible(false);
        }
        if(nameSF=="Vega"){
        
        CasillaSF1.setVisible(true);
        }else{
        CasillaSF1.setVisible(false);
        }        
        if(nameSF=="Ryu"){
       
        CasillaSF2.setVisible(true);
        }else{
      
        CasillaSF2.setVisible(false);
        }        
        if(nameSF=="M.Bison"){
      
        CasillaSF3.setVisible(true);
        }else{
  
        CasillaSF3.setVisible(false);
        }        
        if(nameSF=="Ken Masters"){
   
        CasillaSF4.setVisible(true);
        }else{
       
        CasillaSF4.setVisible(false);
        }        
        if(nameSF=="Chun-Li"){
       
        CasillaSF5.setVisible(true);
        }else{

        CasillaSF5.setVisible(false);
        }
        
        if(nameSF=="Gouken"){
        
        CasillaSF6.setVisible(true);
        }else{
        
        CasillaSF6.setVisible(false);
        }
        if(nameSF=="Cammy"){
        
        CasillaSF7.setVisible(true);
        }else{
        CasillaSF7.setVisible(false);
        }        
        if(nameSF=="Blanka"){
       
        CasillaSF8.setVisible(true);
        }else{
      
        CasillaSF8.setVisible(false);
        }        
        if(nameSF=="Akuma"){
      
        CasillaSF9.setVisible(true);
        }else{
  
        CasillaSF9.setVisible(false);
        }        

        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Scroll1Z.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll1Z.setFocusable(false);

        Cola1Z.setEditable(false);
        Cola1Z.setColumns(20);
        Cola1Z.setRows(5);
        Scroll1Z.setViewportView(Cola1Z);

        jPanel1.add(Scroll1Z, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 291, -1, -1));

        Scroll2Z.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll2Z.setFocusable(false);

        Cola2Z.setEditable(false);
        Cola2Z.setColumns(20);
        Cola2Z.setRows(5);
        Scroll2Z.setViewportView(Cola2Z);

        jPanel1.add(Scroll2Z, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 383, -1, -1));

        Scroll3Z3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll3Z3.setFocusable(false);

        Cola3Z.setEditable(false);
        Cola3Z.setColumns(20);
        Cola3Z.setRows(5);
        Scroll3Z3.setViewportView(Cola3Z);

        jPanel1.add(Scroll3Z3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 475, -1, -1));

        ScrollRZ.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollRZ.setFocusable(false);

        ColaRZ.setEditable(false);
        ColaRZ.setColumns(20);
        ColaRZ.setRows(5);
        ScrollRZ.setViewportView(ColaRZ);

        jPanel1.add(ScrollRZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 567, -1, -1));

        Scroll1SF.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll1SF.setFocusable(false);

        Cola1SF.setEditable(false);
        Cola1SF.setColumns(20);
        Cola1SF.setRows(5);
        Scroll1SF.setViewportView(Cola1SF);

        jPanel1.add(Scroll1SF, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, -1, -1));

        Scroll2SF.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll2SF.setFocusable(false);

        Cola2SF.setEditable(false);
        Cola2SF.setColumns(20);
        Cola2SF.setRows(5);
        Scroll2SF.setViewportView(Cola2SF);

        jPanel1.add(Scroll2SF, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, -1, -1));

        Scroll3SF.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll3SF.setFocusable(false);

        Cola3SF.setEditable(false);
        Cola3SF.setColumns(20);
        Cola3SF.setRows(5);
        Scroll3SF.setViewportView(Cola3SF);

        jPanel1.add(Scroll3SF, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 480, -1, -1));

        ScrollRSF.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollRSF.setFocusable(false);

        ColaRSF.setEditable(false);
        ColaRSF.setColumns(20);
        ColaRSF.setRows(5);
        ScrollRSF.setViewportView(ColaRSF);

        jPanel1.add(ScrollRSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 580, -1, -1));

        CasillaZ.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Link.png")); // NOI18N
        CasillaZ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 260, 350));

        StatusZ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StatusZ.setText("WIN");
        StatusZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusZActionPerformed(evt);
            }
        });
        jPanel1.add(StatusZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 692, -1, -1));

        StatusSF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StatusSF.setText("LOSE");
        jPanel1.add(StatusSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 692, -1, -1));

        CasillaSF.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Viper.png")); // NOI18N
        CasillaSF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 270, 350));

        CountZ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CountZ.setText("0");
        CountZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountZActionPerformed(evt);
            }
        });
        jPanel1.add(CountZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 194, -1, -1));

        CountSF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CountSF.setText("0");
        jPanel1.add(CountSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 194, -1, -1));

        CasillaZ1.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ1.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Ganondorf.png")); // NOI18N
        CasillaZ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 260, 350));

        CasillaZ2.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ2.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Zelda.png")); // NOI18N
        CasillaZ2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 270, 350));

        CasillaZ3.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ3.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Yunobo.png")); // NOI18N
        CasillaZ3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 270, 350));

        CasillaZ4.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ4.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Tureli.png")); // NOI18N
        CasillaZ4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 270, 360));

        CasillaZ5.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ5.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Sidon.png")); // NOI18N
        CasillaZ5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 270, 350));

        CasillaZ6.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ6.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Riju.png")); // NOI18N
        CasillaZ6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 270, 360));

        CasillaZ7.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ7.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Rauru.png")); // NOI18N
        CasillaZ7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 280, 360));

        CasillaZ8.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ8.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Prunia.png")); // NOI18N
        CasillaZ8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, 350));

        CasillaZ9.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ9.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Mineru.png")); // NOI18N
        CasillaZ9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 270, 350));

        CasillaZ10.setBackground(new java.awt.Color(0, 110, 168));
        CasillaZ10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaZ10.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Kolog.png")); // NOI18N
        CasillaZ10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaZ10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 270, 350));

        CasillaSF1.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF1.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Vega.png")); // NOI18N
        CasillaSF1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 270, 350));

        CasillaSF2.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF2.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Ryu.png")); // NOI18N
        CasillaSF2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 270, 350));

        CasillaSF3.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF3.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\MBison.png")); // NOI18N
        CasillaSF3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 270, 350));

        CasillaSF4.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF4.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Ken Masters.png")); // NOI18N
        CasillaSF4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 270, 350));

        CasillaSF5.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF5.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Chuli.png")); // NOI18N
        CasillaSF5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 270, 350));

        CasillaSF6.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF6.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Gouken.png")); // NOI18N
        CasillaSF6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 270, 350));

        CasillaSF7.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF7.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Cammy.png")); // NOI18N
        CasillaSF7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 270, 350));

        CasillaSF8.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF8.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Blanka.png")); // NOI18N
        CasillaSF8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 270, 350));

        CasillaSF9.setBackground(new java.awt.Color(51, 204, 255));
        CasillaSF9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CasillaSF9.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Desktop\\Cartas\\Akuma.png")); // NOI18N
        CasillaSF9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CasillaSF9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 270, 350));

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
    private javax.swing.JTextField StatusSF;
    private javax.swing.JTextField StatusZ;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

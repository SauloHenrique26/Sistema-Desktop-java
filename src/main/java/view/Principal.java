package view;


import control.CategoriaControl;
import control.ItemControl;
import control.MarcaControl;
import dao.CategoriaDao;
import dao.ItemDao;
import dao.MarcaDao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Item;




public class Principal extends javax.swing.JFrame {

    

    public Principal() {
        initComponents();
        this.LoadComboMarca();
        this.LoadComboCategoria();
        this.LoadtabelaIn();
        this.LoadtabelaOut();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTabela = new javax.swing.JButton();
        btnLeitura = new javax.swing.JButton();
        btnSaida = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextInCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnMarca = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        btnEntrada = new javax.swing.JButton();
        jTextValor = new javax.swing.JTextField();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jComboBoxCategoria3 = new javax.swing.JComboBox<>();
        jLabelIn = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableItemOut = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableItemIn = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextOutCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnOut = new javax.swing.JButton();
        jLabelIn1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jTextMarca = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnAddMarca = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jTextCategoria = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnAddCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(23, 35, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTabela.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnTabela.setForeground(new java.awt.Color(255, 255, 255));
        btnTabela.setIcon(new javax.swing.ImageIcon("C:\\Users\\Saulo Brito\\Downloads\\SmartStorage\\src\\main\\java\\view_images\\icons8_todo_list_32px.png")); // NOI18N
        btnTabela.setText("Estoque");
        btnTabela.setBorderPainted(false);
        btnTabela.setContentAreaFilled(false);
        btnTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabelaActionPerformed(evt);
            }
        });
        jPanel1.add(btnTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 190, 40));
        btnTabela.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                jPanel2.setVisible(false);
                jPanel6.setVisible(false);
                jPanel7.setVisible(true);
                jPanel5.setVisible(false);
                jPanel8.setVisible(false);
                jPanel9.setVisible(false);
            }

        });

        btnLeitura.setBackground(new java.awt.Color(255, 255, 255));
        btnLeitura.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnLeitura.setForeground(new java.awt.Color(255, 255, 255));
        btnLeitura.setIcon(new javax.swing.ImageIcon("C:\\Users\\Saulo Brito\\Downloads\\SmartStorage\\src\\main\\java\\view_images\\icons8_test_passed_32px.png")); // NOI18N
        btnLeitura.setText("Leitura de Materiais");
        btnLeitura.setBorderPainted(false);
        btnLeitura.setContentAreaFilled(false);
        btnLeitura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeituraActionPerformed(evt);
            }
        });
        jPanel1.add(btnLeitura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 190, 40));
        btnLeitura.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){

                jPanel2.setVisible(true);
                jPanel6.setVisible(false);
                jPanel7.setVisible(false);
                jPanel5.setVisible(false);
                jPanel8.setVisible(false);
                jPanel9.setVisible(false);

            }

        });

        btnSaida.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnSaida.setForeground(new java.awt.Color(255, 255, 255));
        btnSaida.setIcon(new javax.swing.ImageIcon("C:\\Users\\Saulo Brito\\Downloads\\SmartStorage\\src\\main\\java\\view_images\\icons8_checkout_32px.png")); // NOI18N
        btnSaida.setText("Saída de Materiais");
        btnSaida.setContentAreaFilled(false);
        btnSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 190, 40));
        btnSaida.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){

                jPanel2.setVisible(false);
                jPanel6.setVisible(false);
                jPanel7.setVisible(false);
                jPanel5.setVisible(true);
                jPanel8.setVisible(false);
                jPanel9.setVisible(false);

            }

        });

        btnPrincipal.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Saulo Brito\\Downloads\\SmartStorage\\src\\main\\java\\view_images\\icons8_home_32px.png")); // NOI18N
        btnPrincipal.setText("Home");
        btnPrincipal.setBorderPainted(false);
        btnPrincipal.setContentAreaFilled(false);
        btnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPrincipal.setIconTextGap(1);
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 40));
        btnPrincipal.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){

                jPanel2.setVisible(true);
                jPanel6.setVisible(false);
                jPanel7.setVisible(false);
                jPanel5.setVisible(false);
                jPanel8.setVisible(false);
                jPanel9.setVisible(false);

            }

        });

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Saulo Brito\\Downloads\\SmartStorage\\src\\main\\java\\view_images\\icons8_tags_32px_1.png")); // NOI18N
        jLabel7.setText("Smart Storage");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 50));

        jPanel3.setBackground(new java.awt.Color(71, 120, 197));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel2.setPreferredSize(new java.awt.Dimension(776, 483));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });
        jPanel2.add(jTextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 149, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel1.setText("Nome:");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setAlignmentX(1.1F);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));
        jPanel2.add(jTextInCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 149, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel2.setText("Valor:");
        jLabel2.setAlignmentX(1.1F);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel3.setText("Marca:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel4.setText("Categoria:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel5.setText("Código:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        btnMarca.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnMarca.setIcon(new javax.swing.ImageIcon("C:\\Users\\Saulo Brito\\Downloads\\SmartStorage\\src\\main\\java\\view_images\\icons8_registered_trademark_24px_1.png")); // NOI18N
        btnMarca.setText("Adicionar Marca");
        btnMarca.setBorder(null);
        btnMarca.setContentAreaFilled(false);
        btnMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMarca.setDoubleBuffered(true);
        btnMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(btnMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 150, 40));
        btnMarca.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){

                jPanel2.setVisible(false);
                jPanel6.setVisible(false);
                jPanel7.setVisible(false);
                jPanel5.setVisible(false);
                jPanel8.setVisible(true);
                jPanel9.setVisible(false);

            }

        });

        btnCategoria.setBackground(new java.awt.Color(255, 255, 255));
        btnCategoria.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnCategoria.setIcon(new javax.swing.ImageIcon("C:\\Users\\Saulo Brito\\Downloads\\SmartStorage\\src\\main\\java\\view_images\\icons8_category_24px_1.png")); // NOI18N
        btnCategoria.setText("Adicionar Categoria");
        btnCategoria.setBorder(null);
        btnCategoria.setBorderPainted(false);
        btnCategoria.setContentAreaFilled(false);
        btnCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 160, 40));
        btnCategoria.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){

                jPanel2.setVisible(false);
                jPanel6.setVisible(false);
                jPanel7.setVisible(false);
                jPanel5.setVisible(false);
                jPanel8.setVisible(false);
                jPanel9.setVisible(true);

            }

        });

        btnEntrada.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrada.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnEntrada.setIcon(new javax.swing.ImageIcon("C:\\Users\\Saulo Brito\\Downloads\\SmartStorage\\src\\main\\java\\view_images\\icons8_login_24px.png")); // NOI18N
        btnEntrada.setText("Entrada");
        btnEntrada.setBorder(null);
        btnEntrada.setBorderPainted(false);
        btnEntrada.setContentAreaFilled(false);
        btnEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrada.setFocusPainted(false);
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });
        jPanel2.add(btnEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 130, 40));
        jPanel2.add(jTextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 150, -1));

        jComboBoxMarca.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBoxMarca.setBorder(null);
        jComboBoxMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxMarcaFocusLost(evt);
            }
        });
        jComboBoxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 149, -1));

        jComboBoxCategoria3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxCategoria3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxCategoria3FocusLost(evt);
            }
        });
        jPanel2.add(jComboBoxCategoria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 149, -1));

        jLabelIn.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        jLabelIn.setText("Entrada de Itens");
        jPanel2.add(jLabelIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 90, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 629, 10));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setAlignmentX(0.0F);
        jPanel6.setAlignmentY(0.0F);
        jPanel6.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel6.setMinimumSize(new java.awt.Dimension(637, 319));
        jPanel6.setPreferredSize(new java.awt.Dimension(776, 483));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setAlignmentX(0.0F);
        jPanel7.setAlignmentY(0.0F);
        jPanel7.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel7.setMinimumSize(new java.awt.Dimension(637, 319));
        jPanel7.setPreferredSize(new java.awt.Dimension(776, 483));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 62, 629, 10));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        jLabel11.setText("Tabela de Itens");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 90, -1));

        jTableItemOut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Valor", "Data de Entrada", "Código", "Categoria", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableItemOut);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 330, 190));

        jTableItemIn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Valor", "Data de Entrada", "Código", "Categoria", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableItemIn);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 330, 190));

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel14.setText("Itens que Saíram de Estoque");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel15.setText("Itens em Estoque");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setAlignmentX(0.0F);
        jPanel5.setAlignmentY(0.0F);
        jPanel5.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel5.setMinimumSize(new java.awt.Dimension(637, 319));
        jPanel5.setPreferredSize(new java.awt.Dimension(776, 483));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextOutCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextOutCodigoActionPerformed(evt);
            }
        });
        jPanel5.add(jTextOutCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 111, 148, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel6.setText("Ler Código");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 111, 60, 20));

        btnOut.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\Saulo Brito\\Downloads\\SmartStorage\\src\\main\\java\\view_images\\icons8_naruto_24px_1.png")); // NOI18N
        btnOut.setText("Dar Saída");
        btnOut.setBorderPainted(false);
        btnOut.setContentAreaFilled(false);
        btnOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });
        jPanel5.add(btnOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 130, 50));

        jLabelIn1.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        jLabelIn1.setText("Saída de Itens");
        jPanel5.add(jLabelIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 90, -1));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 629, 10));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setAlignmentX(0.0F);
        jPanel8.setAlignmentY(0.0F);
        jPanel8.setPreferredSize(new java.awt.Dimension(776, 483));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel12.setText("Marca");

        btnAddMarca.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnAddMarca.setIcon(new javax.swing.ImageIcon("C:\\Users\\Saulo Brito\\Downloads\\SmartStorage\\src\\main\\java\\view_images\\icons8_rick_sanchez_24px.png")); // NOI18N
        btnAddMarca.setText("Adicionar Marca");
        btnAddMarca.setBorderPainted(false);
        btnAddMarca.setContentAreaFilled(false);
        btnAddMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jTextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(30, 30, 30)
                .addComponent(btnAddMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setAlignmentX(0.0F);
        jPanel9.setAlignmentY(0.0F);
        jPanel9.setPreferredSize(new java.awt.Dimension(776, 483));

        jTextCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCategoriaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel13.setText("Categoria");

        btnAddCategoria.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnAddCategoria.setIcon(new javax.swing.ImageIcon("C:\\Users\\Saulo Brito\\Downloads\\SmartStorage\\src\\main\\java\\view_images\\icons8_rick_sanchez_24px.png")); // NOI18N
        btnAddCategoria.setText("Adicionar Categoria");
        btnAddCategoria.setBorderPainted(false);
        btnAddCategoria.setContentAreaFilled(false);
        btnAddCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(btnAddCategoria)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMarcaActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        boolean sucesso;
            String inmarca = (String) jComboBoxMarca.getSelectedItem();
            String incate = (String) jComboBoxCategoria3.getSelectedItem();
            try{
            float getvalor = Float.parseFloat(jTextValor.getText().toString());
            ItemControl itemcontrol = new ItemControl();            
            sucesso = itemcontrol.cadastrarItem(jTextNome.getText().toUpperCase(),getvalor,jTextInCodigo.getText().toUpperCase(),inmarca,incate);
            if(sucesso==true){
              JOptionPane.showMessageDialog(null,"Item Adicionado");
              this.LoadtabelaIn();
              this.limparTelaEntrada(evt);
                
            }else{
               JOptionPane.showMessageDialog(null,"Os dados não foram preenchidos corretamente");
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Favor Digitar valor em formato adequado como exemplo: 0.00");
            }
            
                                          

    }//GEN-LAST:event_btnEntradaActionPerformed
    private void limparTelaEntrada(java.awt.event.ActionEvent evt){
        jTextInCodigo.setText("");
    }
    private void btnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaidaActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        boolean sucesso;
             float getvalor =0;
             String incate ="";
            ItemControl itemcontrol = new ItemControl();
            sucesso = itemcontrol.saidaItem(jTextOutCodigo.getText().toUpperCase());
            if(sucesso==true){
              JOptionPane.showMessageDialog(null,"Saída de Estoque");
              this.LoadtabelaIn();
              this.LoadtabelaOut();
              
                this.limparTelaOut(evt);
            }else{
               JOptionPane.showMessageDialog(null,"Codigo não encontrado");
            }
    }//GEN-LAST:event_btnOutActionPerformed
    private void limparTelaOut(java.awt.event.ActionEvent evt){
        jTextOutCodigo.setText("");
    }
    private void btnAddCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCategoriaActionPerformed
        boolean sucesso;
        
            CategoriaControl categoriaControl = new CategoriaControl();
            sucesso = categoriaControl.cadatrarCategoria(jTextCategoria.getText().toUpperCase());
            if(sucesso==true){
              JOptionPane.showMessageDialog(null,"Categoria Adicionada");  
              this.RefreshComboCate(jTextCategoria.getText().toUpperCase());
                this.limparTelaCat(evt);
            }else{
               JOptionPane.showMessageDialog(null,"Os dados não foram preenchidos");
            }
               // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCategoriaActionPerformed
    private void limparTelaCat(java.awt.event.ActionEvent evt){
        jTextCategoria.setText("");
    }
    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrincipalActionPerformed
    
    private void btnTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTabelaActionPerformed

    private void btnLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeituraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLeituraActionPerformed

    private void jTextCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCategoriaActionPerformed

    private void btnAddMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMarcaActionPerformed
        boolean sucesso;
            
                MarcaControl marcaControl = new MarcaControl();               
                sucesso = marcaControl.cadastrarMarca(jTextMarca.getText().toUpperCase());
                if(sucesso==true){
                  
                  JOptionPane.showMessageDialog(null,"Marca Adicionada");
                    this.RefreshComboMarca(jTextMarca.getText().toUpperCase());
                    this.limparTelaMarc(evt);
                    
                }else{
                   JOptionPane.showMessageDialog(null,"Os dados não foram preenchidos");
                }        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMarcaActionPerformed

    private void jComboBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaActionPerformed
            
    }//GEN-LAST:event_jComboBoxMarcaActionPerformed

    private void jComboBoxMarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxMarcaFocusLost
        String cbmarca = (String) jComboBoxMarca.getSelectedItem();
 
        
    }//GEN-LAST:event_jComboBoxMarcaFocusLost

    private void jComboBoxCategoria3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxCategoria3FocusLost
      String cbcate = (String) jComboBoxCategoria3.getSelectedItem();
      
    }//GEN-LAST:event_jComboBoxCategoria3FocusLost

    private void jTextOutCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextOutCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextOutCodigoActionPerformed
    private void limparTelaMarc(java.awt.event.ActionEvent evt){
        jTextMarca.setText("");
    }
    
   
   public void LoadComboMarca() {
         MarcaDao marcadao = new MarcaDao();
           for (String a: marcadao.MarcasCB()){
                 jComboBoxMarca.addItem(a);
           }
   
   } 
   
    public void LoadComboCategoria() {
         CategoriaDao categoriadao = new CategoriaDao();
           for (String c: categoriadao.CategoriaCB()){
                 jComboBoxCategoria3.addItem(c);
           }
   
   } 
   
    public void LoadtabelaIn() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTableItemIn.getModel();
        modelo.setNumRows(0);
         ItemDao itemdao = new ItemDao();
         for (Item c: itemdao.TabelaEntradaCB() ){
             
             modelo.addRow(new Object[]{
                 c.getProduto(),
                 c.getValor(),
                 c.getCreatedAt(),
                 c.getCodigo(),
                 c.getCategoria(),
                 c.getMarca()
                 
             });      
         
         
         }
            
    }
 
    public void LoadtabelaOut() {
        
        DefaultTableModel modelo1 = (DefaultTableModel) jTableItemOut.getModel();
        modelo1.setNumRows(0);
         ItemDao itemdao = new ItemDao();
         for (Item d: itemdao.TabelaSaidaCB() ){
             
             modelo1.addRow(new Object[]{
                 d.getProduto(),
                 d.getValor(),
                 d.getCreatedAt(),
                 d.getCodigo(),
                 d.getCategoria(),
                 d.getMarca()
                 
             });      
         
         
         }
            
    }
   
      
   public void RefreshComboCate(String cate){
       jComboBoxCategoria3.addItem(cate);
       
   }
public void RefreshComboMarca(String mar){
       jComboBoxMarca.addItem(mar);
       
   }


 
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCategoria;
    private javax.swing.JButton btnAddMarca;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnLeitura;
    private javax.swing.JButton btnMarca;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnSaida;
    private javax.swing.JButton btnTabela;
    private javax.swing.JComboBox<String> jComboBoxCategoria3;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelIn;
    private javax.swing.JLabel jLabelIn1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTableItemIn;
    private javax.swing.JTable jTableItemOut;
    private javax.swing.JTextField jTextCategoria;
    private javax.swing.JTextField jTextInCodigo;
    private javax.swing.JTextField jTextMarca;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextOutCodigo;
    private javax.swing.JTextField jTextValor;
    // End of variables declaration//GEN-END:variables

   
}

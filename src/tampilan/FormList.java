package tampilan;
import javax.swing.JOptionPane;

public class FormList extends javax.swing.JFrame {
    // Deklarasi 
    public double Total = 0;
    
    public String nBoxCasing;
    public String nBoxProc;
    public String nBoxMother;
    public String nBoxHDD;
    public String nBoxVGA;
    public String nBoxRAM;
    public String nBoxLCD;
    public String nBoxKeyboard;
    public String nBoxMouse;
    
    public long nTextCasing;
    public long nTextProc;
    public long nTextMother;
    public long nTextHDD;
    public long nTextVGA;
    public long nTextRAM;
    public long nTextLCD;
    public long nTextKeyboard;
    public long nTextMouse;

    public FormList() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pembayaran = new javax.swing.ButtonGroup();
        LabelMouse = new javax.swing.JLabel();
        LabelCasing = new javax.swing.JLabel();
        LabelProc = new javax.swing.JLabel();
        LabelMother = new javax.swing.JLabel();
        LabelHDD = new javax.swing.JLabel();
        LabelVGA = new javax.swing.JLabel();
        LabelRAM = new javax.swing.JLabel();
        LabelLCD = new javax.swing.JLabel();
        LabelKeyboard = new javax.swing.JLabel();
        BoxMouse = new javax.swing.JComboBox();
        BoxCasing = new javax.swing.JComboBox();
        BoxProc = new javax.swing.JComboBox();
        BoxMother = new javax.swing.JComboBox();
        BoxHDD = new javax.swing.JComboBox();
        BoxVGA = new javax.swing.JComboBox();
        BoxRAM = new javax.swing.JComboBox();
        BoxLCD = new javax.swing.JComboBox();
        BoxKeyboard = new javax.swing.JComboBox();
        TextProc = new javax.swing.JTextField();
        TextMother = new javax.swing.JTextField();
        TextHDD = new javax.swing.JTextField();
        TextVGA = new javax.swing.JTextField();
        TextRAM = new javax.swing.JTextField();
        TextLCD = new javax.swing.JTextField();
        TextKeyboard = new javax.swing.JTextField();
        TextMouse = new javax.swing.JTextField();
        TextCasing = new javax.swing.JTextField();
        OpsiPembayaran = new javax.swing.JLabel();
        Cek = new javax.swing.JButton();
        ViaOVO = new javax.swing.JRadioButton();
        ViaATM = new javax.swing.JRadioButton();
        Hiasan = new javax.swing.JLabel();
        LabelTotal = new javax.swing.JLabel();
        Reset = new javax.swing.JLabel();
        Lanjutkan = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TotalHarga = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        barFile = new javax.swing.JMenu();
        MenuAwal = new javax.swing.JMenuItem();
        barLogoutApp = new javax.swing.JMenuItem();
        barEdit = new javax.swing.JMenu();
        barLanjutkan = new javax.swing.JMenuItem();
        barReset = new javax.swing.JMenuItem();
        barCekHarga = new javax.swing.JMenuItem();
        barHelp = new javax.swing.JMenu();
        barCheckUpdates = new javax.swing.JMenuItem();
        barAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu List");
        setMaximumSize(new java.awt.Dimension(741, 640));
        setMinimumSize(new java.awt.Dimension(741, 640));
        setPreferredSize(new java.awt.Dimension(741, 640));
        setResizable(false);
        getContentPane().setLayout(null);

        LabelMouse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelMouse.setForeground(new java.awt.Color(0, 204, 204));
        LabelMouse.setText("Mouse");
        getContentPane().add(LabelMouse);
        LabelMouse.setBounds(50, 500, 70, 15);

        LabelCasing.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelCasing.setForeground(new java.awt.Color(0, 204, 204));
        LabelCasing.setText("Casing");
        getContentPane().add(LabelCasing);
        LabelCasing.setBounds(50, 100, 70, 15);

        LabelProc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelProc.setForeground(new java.awt.Color(0, 204, 204));
        LabelProc.setText("Processor");
        getContentPane().add(LabelProc);
        LabelProc.setBounds(50, 150, 70, 15);

        LabelMother.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelMother.setForeground(new java.awt.Color(0, 204, 204));
        LabelMother.setText("Motherboard");
        getContentPane().add(LabelMother);
        LabelMother.setBounds(50, 200, 70, 15);

        LabelHDD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelHDD.setForeground(new java.awt.Color(0, 204, 204));
        LabelHDD.setText("Hard Disk");
        getContentPane().add(LabelHDD);
        LabelHDD.setBounds(50, 250, 70, 15);

        LabelVGA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelVGA.setForeground(new java.awt.Color(0, 204, 204));
        LabelVGA.setText("Graphic Card");
        getContentPane().add(LabelVGA);
        LabelVGA.setBounds(50, 300, 70, 15);

        LabelRAM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelRAM.setForeground(new java.awt.Color(0, 204, 204));
        LabelRAM.setText("Memory RAM");
        getContentPane().add(LabelRAM);
        LabelRAM.setBounds(50, 350, 90, 15);

        LabelLCD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelLCD.setForeground(new java.awt.Color(0, 204, 204));
        LabelLCD.setText("Monitor/LCD");
        getContentPane().add(LabelLCD);
        LabelLCD.setBounds(50, 400, 70, 15);

        LabelKeyboard.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelKeyboard.setForeground(new java.awt.Color(0, 204, 204));
        LabelKeyboard.setText("Keyboard");
        getContentPane().add(LabelKeyboard);
        LabelKeyboard.setBounds(50, 450, 70, 15);

        BoxMouse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Pilih Jenis Mouse>", "1. Logitech B100 Optical USB Mouse", "2. PROLiNK Wireless Optical Mouse PMW6005", "3. Mouse Wireless Eyota Free Baterai AAA 2PCS", "4. Logitech G300S Gaming Mouse Wired Original", "5. Mouse Bluetooth 3.0 2.4GHz 1600DPI", "6. PROLiNK Wireless Optical Mouse PMW6005 Blue" }));
        BoxMouse.setBorder(null);
        BoxMouse.setMaximumSize(new java.awt.Dimension(56, 15));
        BoxMouse.setMinimumSize(new java.awt.Dimension(56, 15));
        BoxMouse.setPreferredSize(new java.awt.Dimension(56, 15));
        BoxMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxMouseActionPerformed(evt);
            }
        });
        getContentPane().add(BoxMouse);
        BoxMouse.setBounds(50, 520, 280, 26);

        BoxCasing.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Pilih Jenis Casing>", "1. CASING SPC SC-11/SX-15/SX-16 PSU 450 WATT", "2. CASING POWER UP BASIC NEW SERIES + PSU 450 WATT", "3. CASING POWER UP CORAL K21/22/23 + PSU 500 WATT", "4. CASING SIMBADA SIM V 3010 + PSU 380 WATT", "5. CASING INFINITY ELYSUM + FAN CASING 3 PC (NO PSU)", "6. CASING ALCATROZ ULTIMAX U3 + PSU 600 WATT", "7. CASING CUBE GAMING FERNOS (NO PSU)", "8. CASING ALCATROZ ULTIMAX U5 PRO", "9. CASING ALCATROZ ULTIMAX U9 PRO", "10. CASING ARMAGEDON NIMITZ N7 BLACK (NO PSU)" }));
        BoxCasing.setBorder(null);
        BoxCasing.setMaximumSize(new java.awt.Dimension(56, 15));
        BoxCasing.setMinimumSize(new java.awt.Dimension(56, 15));
        BoxCasing.setPreferredSize(new java.awt.Dimension(56, 15));
        BoxCasing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxCasingActionPerformed(evt);
            }
        });
        getContentPane().add(BoxCasing);
        BoxCasing.setBounds(50, 120, 280, 26);

        BoxProc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Pilih Jenis Processor>", "1. CPU AMD ATHLON 200GE (3.20GHz, 5M Cache)", "2. CPU AMD RYZEN 3 2200G (3,50GHz up to 3.70GHz, 6M Cache)", "3. CPU AMD RYZEN 3 3200G (3.60GHz up to 4.00GHZ, 6M Cache)", "4. CPU AMD RYZEN 5 3400G (3.70GHz up to 4.20GHz, 6M Cache)" }));
        BoxProc.setBorder(null);
        BoxProc.setMaximumSize(new java.awt.Dimension(56, 15));
        BoxProc.setMinimumSize(new java.awt.Dimension(56, 15));
        BoxProc.setPreferredSize(new java.awt.Dimension(56, 15));
        BoxProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxProcActionPerformed(evt);
            }
        });
        getContentPane().add(BoxProc);
        BoxProc.setBounds(50, 170, 280, 26);

        BoxMother.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Pilih Jenis Motherboard>", "1. MB AM4 MSI A320M PRO-VD/S V2 (DDR4)", "2. MB AM4 BIOSTAR A320MH (DDR4)", "3. MB AM4 ASUS PRIME A320M-F (DDR4)", "4. MB AM4 ASUS PRIME A320M-K (DDR4)", "5. MB AM4 MSI B450-A PRO MAX (DDR4)", "6. MB AM4 ASUS PRIME B450-PLUS (DDR4)" }));
        BoxMother.setBorder(null);
        BoxMother.setMaximumSize(new java.awt.Dimension(56, 15));
        BoxMother.setMinimumSize(new java.awt.Dimension(56, 15));
        BoxMother.setPreferredSize(new java.awt.Dimension(56, 15));
        BoxMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxMotherActionPerformed(evt);
            }
        });
        getContentPane().add(BoxMother);
        BoxMother.setBounds(50, 220, 280, 26);

        BoxHDD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Pilih Jenis HDD>", "1. HDD SEAGATE 160GB SATA (ST3160215SCE)", "2. HDD SEAGATE 250GB [ST3250310CS]", "3. HDD SEAGATE 500GB (ST3500312CS) OLD LOGO", "4. HDD SSD ADATA SU650 120GB", "5. HDD SSD Sandisk PLUS 120GB", "6. HDD SSD LEXAR NS100 128GB", "7. HDD SSD TEAM GX1 240GB (T253X1240G)", "8. HDD SSD WD Green 240GB WDS240G2G0A", "9. HDD SSD Visipro SDVPSA1910256 256GB", "10. HDD SSD ADATA SU650 240GB" }));
        BoxHDD.setBorder(null);
        BoxHDD.setMaximumSize(new java.awt.Dimension(56, 15));
        BoxHDD.setMinimumSize(new java.awt.Dimension(56, 15));
        BoxHDD.setPreferredSize(new java.awt.Dimension(56, 15));
        BoxHDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxHDDActionPerformed(evt);
            }
        });
        getContentPane().add(BoxHDD);
        BoxHDD.setBounds(50, 270, 280, 26);

        BoxVGA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Pilih Jenis VGA>", "1. VGA MSI RADEON R7240 2GB 64BIT DDR3 [R7 240 2GD3/LP]", "2. VGA MSI GT710 2GB 64BIT DDR3 [GT710 2GD 3H LP)", "3. VGA Digital Alliance GTX750Ti 2GB DDR5", "4. VGA MSI GTX1650 Gaming X 4GB DDR5", "5. VGA MSI RX570 ARMOR MK2 8GB DDR5 OC", "6. VGA ASUS GTX1650 Dual 4GB DDR5 OC", "7. VGA ASUS GTX1650 ROG Strix 4GB DDR5 OC" }));
        BoxVGA.setBorder(null);
        BoxVGA.setMaximumSize(new java.awt.Dimension(56, 15));
        BoxVGA.setMinimumSize(new java.awt.Dimension(56, 15));
        BoxVGA.setPreferredSize(new java.awt.Dimension(56, 15));
        BoxVGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxVGAActionPerformed(evt);
            }
        });
        getContentPane().add(BoxVGA);
        BoxVGA.setBounds(50, 320, 280, 26);

        BoxRAM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Pilih Jenis Memory RAM>", "1. Ram DDR4 Visipro 4GB 2400MHZ / 2666MHZ", "2. Ram DDR4 Kingston 4GB", "3. RAM DDR 4 CORSAIR VENGEANCE LPX BLACK 4GB (1X4GB) 2400MHZ", "4. Ram DDR4 Kingston 8GB", "5. Ram DDR4 Visipro 8GB 2400MHZ / 2666MHZ", "6. Ram DDR4 Transcend 8GB 1x8GB 2666MHz", "7. RAM DDR4 SAMSUNG 4GB" }));
        BoxRAM.setBorder(null);
        BoxRAM.setMaximumSize(new java.awt.Dimension(56, 15));
        BoxRAM.setMinimumSize(new java.awt.Dimension(56, 15));
        BoxRAM.setPreferredSize(new java.awt.Dimension(56, 15));
        BoxRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxRAMActionPerformed(evt);
            }
        });
        getContentPane().add(BoxRAM);
        BoxRAM.setBounds(50, 370, 280, 26);

        BoxLCD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Pilih Jenis LCD>", "1. LED ACER EB162Q 15.6", "2. LED ACER K192HQL-b 18.5", "3. LED ACER K202HQL 19.5", "4. LED ACER K242HL 24", "5. LED LG 24MP88HM-S 23.8", "6. LED LG 24MK400H-B", "7. LED LG 24UD58-B (Ultra HD 4K) 23.8" }));
        BoxLCD.setBorder(null);
        BoxLCD.setMaximumSize(new java.awt.Dimension(56, 15));
        BoxLCD.setMinimumSize(new java.awt.Dimension(56, 15));
        BoxLCD.setPreferredSize(new java.awt.Dimension(56, 15));
        BoxLCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxLCDActionPerformed(evt);
            }
        });
        getContentPane().add(BoxLCD);
        BoxLCD.setBounds(50, 420, 280, 26);

        BoxKeyboard.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Pilih Jenis Keyboard>", "1. Keyboard (PS/2) + Mouse Logitech MK100 (USB)", "2. Keyboard Gaming Sades Membrane TKL SABRE", "3. Keyboard Gaming NYK-K07 Premium", "4. Keyboard + Mouse Wireless Logitech MK220", "5. Keyboard + Mouse Wireless Logitech MK235", "6. Keyboard + Mouse Wireless Logitech MK240 nano", "7. Keyboard Gaming Sades Bladewolf" }));
        BoxKeyboard.setBorder(null);
        BoxKeyboard.setMaximumSize(new java.awt.Dimension(56, 15));
        BoxKeyboard.setMinimumSize(new java.awt.Dimension(56, 15));
        BoxKeyboard.setPreferredSize(new java.awt.Dimension(56, 15));
        BoxKeyboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxKeyboardActionPerformed(evt);
            }
        });
        getContentPane().add(BoxKeyboard);
        BoxKeyboard.setBounds(50, 470, 280, 26);

        TextProc.setEditable(false);
        TextProc.setBackground(new java.awt.Color(0, 0, 0));
        TextProc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextProc.setForeground(new java.awt.Color(51, 255, 0));
        TextProc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextProc.setText("Rp. 0");
        TextProc.setBorder(null);
        TextProc.setOpaque(false);
        TextProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextProcActionPerformed(evt);
            }
        });
        getContentPane().add(TextProc);
        TextProc.setBounds(340, 170, 110, 26);

        TextMother.setEditable(false);
        TextMother.setBackground(new java.awt.Color(0, 0, 0));
        TextMother.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextMother.setForeground(new java.awt.Color(51, 255, 0));
        TextMother.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextMother.setText("Rp. 0");
        TextMother.setBorder(null);
        TextMother.setOpaque(false);
        TextMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMotherActionPerformed(evt);
            }
        });
        getContentPane().add(TextMother);
        TextMother.setBounds(340, 220, 110, 26);

        TextHDD.setEditable(false);
        TextHDD.setBackground(new java.awt.Color(0, 0, 0));
        TextHDD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextHDD.setForeground(new java.awt.Color(51, 255, 0));
        TextHDD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextHDD.setText("Rp. 0");
        TextHDD.setBorder(null);
        TextHDD.setOpaque(false);
        TextHDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextHDDActionPerformed(evt);
            }
        });
        getContentPane().add(TextHDD);
        TextHDD.setBounds(340, 270, 110, 26);

        TextVGA.setEditable(false);
        TextVGA.setBackground(new java.awt.Color(0, 0, 0));
        TextVGA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextVGA.setForeground(new java.awt.Color(51, 255, 0));
        TextVGA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextVGA.setText("Rp. 0");
        TextVGA.setBorder(null);
        TextVGA.setOpaque(false);
        TextVGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextVGAActionPerformed(evt);
            }
        });
        getContentPane().add(TextVGA);
        TextVGA.setBounds(340, 320, 110, 26);

        TextRAM.setEditable(false);
        TextRAM.setBackground(new java.awt.Color(0, 0, 0));
        TextRAM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextRAM.setForeground(new java.awt.Color(51, 255, 0));
        TextRAM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextRAM.setText("Rp. 0");
        TextRAM.setBorder(null);
        TextRAM.setOpaque(false);
        TextRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextRAMActionPerformed(evt);
            }
        });
        getContentPane().add(TextRAM);
        TextRAM.setBounds(340, 370, 110, 26);

        TextLCD.setEditable(false);
        TextLCD.setBackground(new java.awt.Color(0, 0, 0));
        TextLCD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextLCD.setForeground(new java.awt.Color(51, 255, 0));
        TextLCD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextLCD.setText("Rp. 0");
        TextLCD.setBorder(null);
        TextLCD.setOpaque(false);
        TextLCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextLCDActionPerformed(evt);
            }
        });
        getContentPane().add(TextLCD);
        TextLCD.setBounds(340, 420, 110, 26);

        TextKeyboard.setEditable(false);
        TextKeyboard.setBackground(new java.awt.Color(0, 0, 0));
        TextKeyboard.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextKeyboard.setForeground(new java.awt.Color(51, 255, 0));
        TextKeyboard.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextKeyboard.setText("Rp. 0");
        TextKeyboard.setBorder(null);
        TextKeyboard.setOpaque(false);
        TextKeyboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextKeyboardActionPerformed(evt);
            }
        });
        getContentPane().add(TextKeyboard);
        TextKeyboard.setBounds(340, 470, 110, 26);

        TextMouse.setEditable(false);
        TextMouse.setBackground(new java.awt.Color(0, 0, 0));
        TextMouse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextMouse.setForeground(new java.awt.Color(51, 255, 0));
        TextMouse.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextMouse.setText("Rp. 0");
        TextMouse.setBorder(null);
        TextMouse.setOpaque(false);
        TextMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMouseActionPerformed(evt);
            }
        });
        getContentPane().add(TextMouse);
        TextMouse.setBounds(340, 520, 110, 26);

        TextCasing.setEditable(false);
        TextCasing.setBackground(new java.awt.Color(0, 0, 0));
        TextCasing.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextCasing.setForeground(new java.awt.Color(51, 255, 0));
        TextCasing.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextCasing.setText("Rp. 0");
        TextCasing.setBorder(null);
        TextCasing.setOpaque(false);
        TextCasing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCasingActionPerformed(evt);
            }
        });
        getContentPane().add(TextCasing);
        TextCasing.setBounds(340, 120, 110, 26);

        OpsiPembayaran.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OpsiPembayaran.setForeground(new java.awt.Color(0, 204, 204));
        OpsiPembayaran.setText("Pembayaran");
        getContentPane().add(OpsiPembayaran);
        OpsiPembayaran.setBounds(500, 340, 70, 15);

        Cek.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Cek.setText("Cek");
        Cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CekActionPerformed(evt);
            }
        });
        getContentPane().add(Cek);
        Cek.setBounds(560, 170, 73, 23);

        ViaOVO.setBackground(new java.awt.Color(0, 0, 0));
        Pembayaran.add(ViaOVO);
        ViaOVO.setForeground(new java.awt.Color(255, 255, 255));
        ViaOVO.setSelected(true);
        ViaOVO.setText("Via OVO");
        getContentPane().add(ViaOVO);
        ViaOVO.setBounds(500, 360, 190, 23);

        ViaATM.setBackground(new java.awt.Color(0, 0, 0));
        Pembayaran.add(ViaATM);
        ViaATM.setForeground(new java.awt.Color(255, 255, 255));
        ViaATM.setText("Via Kartu Kredit / ATM");
        getContentPane().add(ViaATM);
        ViaATM.setBounds(500, 390, 190, 23);

        Hiasan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cpu-gaming.png"))); // NOI18N
        getContentPane().add(Hiasan);
        Hiasan.setBounds(520, 190, 140, 160);

        LabelTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelTotal.setForeground(new java.awt.Color(0, 255, 255));
        LabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTotal.setText("Total Harga");
        getContentPane().add(LabelTotal);
        LabelTotal.setBounds(500, 100, 180, 15);

        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset.png"))); // NOI18N
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetMouseClicked(evt);
            }
        });
        getContentPane().add(Reset);
        Reset.setBounds(480, 420, 240, 70);

        Lanjutkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lanjutkan.png"))); // NOI18N
        Lanjutkan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LanjutkanMouseClicked(evt);
            }
        });
        getContentPane().add(Lanjutkan);
        Lanjutkan.setBounds(480, 490, 230, 63);

        Header.setBackground(new java.awt.Color(53, 11, 133));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("YudaAR Computer");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("\"Menerima Pesanan Kostum Rakitan PC Komputer\"");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(259, 259, 259))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jLabel3))
        );

        getContentPane().add(Header);
        Header.setBounds(0, 0, 740, 80);

        TotalHarga.setEditable(false);
        TotalHarga.setBackground(new java.awt.Color(0, 0, 0));
        TotalHarga.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        TotalHarga.setForeground(new java.awt.Color(0, 255, 0));
        TotalHarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalHargaActionPerformed(evt);
            }
        });
        getContentPane().add(TotalHarga);
        TotalHarga.setBounds(490, 120, 200, 40);

        Background.setBackground(new java.awt.Color(0, 0, 0));
        Background.setForeground(new java.awt.Color(0, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background-index.jpg"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(761, 475));
        Background.setMinimumSize(new java.awt.Dimension(761, 475));
        Background.setPreferredSize(new java.awt.Dimension(761, 475));
        Background.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                BackgroundAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(Background);
        Background.setBounds(0, 0, 740, 630);

        jMenuBar1.setBackground(new java.awt.Color(53, 11, 133));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(153, 255, 255));
        jMenuBar1.setToolTipText("");

        barFile.setBackground(new java.awt.Color(153, 255, 255));
        barFile.setText("File");

        MenuAwal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MenuAwal.setText("Kembali ke Menu Awal");
        MenuAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAwalActionPerformed(evt);
            }
        });
        barFile.add(MenuAwal);

        barLogoutApp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        barLogoutApp.setText("Keluar");
        barLogoutApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barLogoutAppActionPerformed(evt);
            }
        });
        barFile.add(barLogoutApp);

        jMenuBar1.add(barFile);

        barEdit.setBackground(new java.awt.Color(51, 51, 255));
        barEdit.setText("Edit");

        barLanjutkan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
        barLanjutkan.setText("Lanjutkan");
        barLanjutkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barLanjutkanActionPerformed(evt);
            }
        });
        barEdit.add(barLanjutkan);

        barReset.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        barReset.setText("Reset");
        barReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barResetActionPerformed(evt);
            }
        });
        barEdit.add(barReset);

        barCekHarga.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        barCekHarga.setText("Cek Harga");
        barCekHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barCekHargaActionPerformed(evt);
            }
        });
        barEdit.add(barCekHarga);

        jMenuBar1.add(barEdit);

        barHelp.setText("Help");
        barHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barHelpActionPerformed(evt);
            }
        });

        barCheckUpdates.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        barCheckUpdates.setText("Check for Updates");
        barCheckUpdates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barCheckUpdatesActionPerformed(evt);
            }
        });
        barHelp.add(barCheckUpdates);

        barAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        barAbout.setText("About ");
        barAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barAboutActionPerformed(evt);
            }
        });
        barHelp.add(barAbout);

        jMenuBar1.add(barHelp);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoxMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxMouseActionPerformed
        nBoxMouse = (String) BoxMouse.getSelectedItem();
            if (nBoxMouse == "<Pilih Jenis Mouse>") {
                nTextMouse = 0;
        }   if (nBoxMouse == "1. Logitech B100 Optical USB Mouse") {
                nTextMouse = 45000;
        }   if (nBoxMouse == "2. PROLiNK Wireless Optical Mouse PMW6005") {
                nTextMouse = 70000;
        }   if (nBoxMouse == "3. Mouse Wireless Eyota Free Baterai AAA 2PCS") {
                nTextMouse = 110000;
        }   if (nBoxMouse == "4. Logitech G300S Gaming Mouse Wired Original") {
                nTextMouse = 150000;
        }   if (nBoxMouse == "5. Mouse Bluetooth 3.0 2.4GHz 1600DPI") {
                nTextMouse = 185000;
        }   if (nBoxMouse == "6. PROLiNK Wireless Optical Mouse PMW6005 Blue") {
                nTextMouse = 250000;
        }   
        
    TextMouse.setText(String.valueOf("Rp. "+nTextMouse));
    }//GEN-LAST:event_BoxMouseActionPerformed

    private void BoxCasingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxCasingActionPerformed
        nBoxCasing = (String) BoxCasing.getSelectedItem();
            if (nBoxCasing == "<Pilih Jenis Casing>") {
                nTextCasing = 0;
        }   if (nBoxCasing == "1. CASING SPC SC-11/SX-15/SX-16 PSU 450 WATT") {
                nTextCasing = 240000;
        }   if (nBoxCasing == "2. CASING POWER UP BASIC NEW SERIES + PSU 450 WATT") {
                nTextCasing = 260000;
        }   if (nBoxCasing == "3. CASING POWER UP CORAL K21/22/23 + PSU 500 WATT") {
                nTextCasing = 290000;
        }   if (nBoxCasing == "4. CASING SIMBADA SIM V 3010 + PSU 380 WATT") {
                nTextCasing = 305000;
        }   if (nBoxCasing == "5. CASING INFINITY ELYSUM + FAN CASING 3 PC (NO PSU)") {
                nTextCasing = 320000;
        }   if (nBoxCasing == "6. CASING ALCATROZ ULTIMAX U3 + PSU 600 WATT") {
                nTextCasing = 400000;
        }   if (nBoxCasing == "7. CASING CUBE GAMING FERNOS (NO PSU)") {
                nTextCasing = 420000;
        }   if (nBoxCasing == "8. CASING ALCATROZ ULTIMAX U5 PRO") {
                nTextCasing = 460000;
        }   if (nBoxCasing == "9. CASING ALCATROZ ULTIMAX U9 PRO") {
                nTextCasing = 490000;
        }   if (nBoxCasing == "10. CASING ARMAGEDON NIMITZ N7 BLACK (NO PSU)") {
                nTextCasing = 525000;
        }
        
    TextCasing.setText(String.valueOf("Rp. "+nTextCasing));
    }//GEN-LAST:event_BoxCasingActionPerformed

    private void BoxProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxProcActionPerformed
        nBoxProc = (String) BoxProc.getSelectedItem();
            if (nBoxProc == "<Pilih Jenis Processor>") {
                nTextProc = 0;
        }   if (nBoxProc == "1. CPU AMD ATHLON 200GE (3.20GHz, 5M Cache)") {
                nTextProc = 825000;
        }   if (nBoxProc == "2. CPU AMD RYZEN 3 2200G (3,50GHz up to 3.70GHz, 6M Cache)") {
                nTextProc = 1225000;
        }   if (nBoxProc == "3. CPU AMD RYZEN 3 3200G (3.60GHz up to 4.00GHZ, 6M Cache)") {
                nTextProc = 1380000;
        }   if (nBoxProc == "4. CPU AMD RYZEN 5 3400G (3.70GHz up to 4.20GHz, 6M Cache)") {
                nTextProc = 1700000;
        }

    TextProc.setText(String.valueOf("Rp. "+nTextProc));
    }//GEN-LAST:event_BoxProcActionPerformed

    private void BoxMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxMotherActionPerformed
        nBoxMother = (String) BoxMother.getSelectedItem();
            if (nBoxMother == "<Pilih Jenis Motherboard>") {
                nTextMother = 0;
        }   if (nBoxMother == "1. MB AM4 MSI A320M PRO-VD/S V2 (DDR4)") {
                nTextMother = 725000;
        }   if (nBoxMother == "2. MB AM4 BIOSTAR A320MH (DDR4)") {
                nTextMother = 760000;
        }   if (nBoxMother == "3. MB AM4 ASUS PRIME A320M-F (DDR4)") {
                nTextMother = 825000;
        }   if (nBoxMother == "4. MB AM4 ASUS PRIME A320M-K (DDR4)") {
                nTextMother = 875000;
        }   if (nBoxMother == "5. MB AM4 MSI B450-A PRO MAX (DDR4)") {
                nTextMother = 1250000;
        }   if (nBoxMother == "6. MB AM4 ASUS PRIME B450-PLUS (DDR4)") {
                nTextMother = 1500000;
        }

    TextMother.setText(String.valueOf("Rp. "+nTextMother));
    }//GEN-LAST:event_BoxMotherActionPerformed

    private void BoxHDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxHDDActionPerformed
       nBoxHDD = (String) BoxHDD.getSelectedItem();
            if (nBoxHDD == "<Pilih Jenis HDD>") {
                nTextHDD = 0;
        }   if (nBoxHDD == "1. HDD SEAGATE 160GB SATA (ST3160215SCE)") {
                nTextHDD = 155000;
        }   if (nBoxHDD == "2. HDD SEAGATE 250GB [ST3250310CS]") {
                nTextHDD = 165000;
        }   if (nBoxHDD == "3. HDD SEAGATE 500GB (ST3500312CS) OLD LOGO") {
                nTextHDD = 215000;
        }   if (nBoxHDD == "4. HDD SSD ADATA SU650 120GB") {
                nTextHDD = 390000;
        }   if (nBoxHDD == "5. HDD SSD Sandisk PLUS 120GB") {
                nTextHDD = 420000;
        }   if (nBoxHDD == "6. HDD SSD LEXAR NS100 128GB") {
                nTextHDD = 430000;
        }   if (nBoxHDD == "7. HDD SSD TEAM GX1 240GB (T253X1240G)") {
                nTextHDD = 490000;
        }   if (nBoxHDD == "8. HDD SSD WD Green 240GB WDS240G2G0A") {
                nTextHDD = 520000;
        }   if (nBoxHDD == "9. HDD SSD Visipro SDVPSA1910256 256GB") {
                nTextHDD = 550000;
        }   if (nBoxHDD == "10. HDD SSD ADATA SU650 240GB") {
                nTextHDD = 575000;
        }   

    TextHDD.setText(String.valueOf("Rp. "+nTextHDD));
    }//GEN-LAST:event_BoxHDDActionPerformed

    private void BoxVGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxVGAActionPerformed
        nBoxVGA = (String) BoxVGA.getSelectedItem();
            if (nBoxVGA == "<Pilih Jenis VGA>") {
                nTextVGA = 0;
        }   if (nBoxVGA == "1. VGA MSI RADEON R7240 2GB 64BIT DDR3 [R7 240 2GD3/LP]") {
                nTextVGA = 580000;
        }   if (nBoxVGA == "2. VGA MSI GT710 2GB 64BIT DDR3 [GT710 2GD 3H LP)") {
                nTextVGA = 720000;
        }   if (nBoxVGA == "3. VGA Digital Alliance GTX750Ti 2GB DDR5") {
                nTextVGA = 1100000;
        }   if (nBoxVGA == "4. VGA MSI GTX1650 Gaming X 4GB DDR5") {
                nTextVGA = 1420000;
        }   if (nBoxVGA == "5. VGA MSI RX570 ARMOR MK2 8GB DDR5 OC") {
                nTextVGA = 1850000;
        }   if (nBoxVGA == "6. VGA ASUS GTX1650 Dual 4GB DDR5 OC") {
                nTextVGA = 2020000;
        }   if (nBoxVGA == "7. VGA ASUS GTX1650 ROG Strix 4GB DDR5 OC") {
                nTextVGA = 2200000;
        }

    TextVGA.setText(String.valueOf("Rp. "+nTextVGA));
    }//GEN-LAST:event_BoxVGAActionPerformed

    private void BoxRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxRAMActionPerformed
        nBoxRAM = (String) BoxRAM.getSelectedItem();
            if (nBoxRAM == "<Pilih Jenis Memory RAM>") {
                nTextRAM = 0;
        }   if (nBoxRAM == "1. Ram DDR4 Visipro 4GB 2400MHZ / 2666MHZ") {
                nTextRAM = 350000;
        }   if (nBoxRAM == "2. Ram DDR4 Kingston 4GB") {
                nTextRAM = 380000;
        }   if (nBoxRAM == "3. RAM DDR 4 CORSAIR VENGEANCE LPX BLACK 4GB (1X4GB) 2400MHZ") {
                nTextRAM = 465000;
        }   if (nBoxRAM == "4. Ram DDR4 Kingston 8GB") {
                nTextRAM = 520000;
        }   if (nBoxRAM == "5. Ram DDR4 Visipro 8GB 2400MHZ / 2666MHZ") {
                nTextRAM = 575000;
        }   if (nBoxRAM == "6. Ram DDR4 Transcend 8GB 1x8GB 2666MHz") {
                nTextRAM = 588000;
        }   if (nBoxRAM == "7. RAM DDR4 SAMSUNG 4GB") {
                nTextRAM = 660000;
        }

    TextRAM.setText(String.valueOf("Rp. "+nTextRAM));
    }//GEN-LAST:event_BoxRAMActionPerformed

    private void BoxLCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxLCDActionPerformed
        nBoxLCD = (String) BoxLCD.getSelectedItem();
            if (nBoxLCD == "<Pilih Jenis LCD>") {
                nTextLCD = 0;
        }   if (nBoxLCD == "1. LED ACER EB162Q 15.6") {
                nTextLCD = 880000;
        }   if (nBoxLCD == "2. LED ACER K192HQL-b 18.5") {
                nTextLCD = 920000;
        }   if (nBoxLCD == "3. LED ACER K202HQL 19.5") {
                nTextLCD = 1025000;
        }   if (nBoxLCD == "4. LED ACER K242HL 24") {
                nTextLCD = 1478000;
        }   if (nBoxLCD == "5. LED LG 24MP88HM-S 23.8") {
                nTextLCD = 1665000;
        }   if (nBoxLCD == "6. LED LG 24MK400H-B") {
                nTextLCD = 1720000;
        }   if (nBoxLCD == "7. LED LG 24UD58-B (Ultra HD 4K) 23.8") {
                nTextLCD = 1950000;
        }

    TextLCD.setText(String.valueOf("Rp. "+nTextLCD));
    }//GEN-LAST:event_BoxLCDActionPerformed

    private void BoxKeyboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxKeyboardActionPerformed
        nBoxKeyboard = (String) BoxKeyboard.getSelectedItem();
            if (nBoxKeyboard == "<Pilih Jenis Keyboard>") {
                nTextKeyboard = 0;
        }   if (nBoxKeyboard == "1. Keyboard (PS/2) + Mouse Logitech MK100 (USB)") {
                nTextKeyboard = 175000;
        }   if (nBoxKeyboard == "2. Keyboard Gaming Sades Membrane TKL SABRE") {
                nTextKeyboard = 200000;
        }   if (nBoxKeyboard == "3. Keyboard Gaming NYK-K07 Premium") {
                nTextKeyboard = 230000;
        }   if (nBoxKeyboard == "4. Keyboard + Mouse Wireless Logitech MK220") {
                nTextKeyboard = 265000;
        }   if (nBoxKeyboard == "5. Keyboard + Mouse Wireless Logitech MK235") {
                nTextKeyboard = 295000;
        }   if (nBoxKeyboard == "6. Keyboard + Mouse Wireless Logitech MK240 nano") {
                nTextKeyboard = 330000;
        }   if (nBoxKeyboard == "7. Keyboard Gaming Sades Bladewolf") {
                nTextKeyboard = 370000;
        }

    TextKeyboard.setText(String.valueOf("Rp. "+nTextKeyboard));
    }//GEN-LAST:event_BoxKeyboardActionPerformed

    private void TextProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextProcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextProcActionPerformed

    private void TextMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextMotherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextMotherActionPerformed

    private void TextHDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextHDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextHDDActionPerformed

    private void TextVGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextVGAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextVGAActionPerformed

    private void TextRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextRAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextRAMActionPerformed

    private void TextLCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextLCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextLCDActionPerformed

    private void TextKeyboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextKeyboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextKeyboardActionPerformed

    private void TextMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextMouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextMouseActionPerformed

    private void TextCasingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCasingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCasingActionPerformed

    private void ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseClicked
        // TODO add your handling code here:
        BoxCasing.setSelectedIndex(0);
        BoxProc.setSelectedIndex(0);
        BoxMother.setSelectedIndex(0);
        BoxHDD.setSelectedIndex(0);
        BoxVGA.setSelectedIndex(0);
        BoxRAM.setSelectedIndex(0);
        BoxLCD.setSelectedIndex(0);
        BoxKeyboard.setSelectedIndex(0);
        BoxMouse.setSelectedIndex(0);
        ViaOVO.setSelected(true);
        TotalHarga.setText("Rp. 0.0");
    }//GEN-LAST:event_ResetMouseClicked

    private void CekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CekActionPerformed
        // TODO add your handling code here:
        Total = nTextCasing + nTextProc + nTextMother + nTextHDD + nTextVGA + nTextRAM + nTextLCD + nTextKeyboard + nTextMouse;
        TotalHarga.setText(String.valueOf("Rp. ")+Total);
    }//GEN-LAST:event_CekActionPerformed

    private void TotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalHargaActionPerformed

    private void LanjutkanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LanjutkanMouseClicked
        // TODO add your handling code here:
        Total = nTextCasing + nTextProc + nTextMother + nTextHDD + nTextVGA + nTextRAM + nTextLCD + nTextKeyboard + nTextMouse;
        String bayar;
        if(ViaOVO.isSelected()){
            bayar = "Via OVO";
        }else{
            bayar = "Via Kartu Kredit / ATM";
        }
        
        int lanjutkan = JOptionPane.showOptionDialog(this,
                    "---------------------------------------------------------------------------------------------------------------------------------------"
                        +"\nCasing :                   "+nBoxCasing
                        + "\nProcessor :             "+nBoxProc
                        + "\nMotherBoard :         "+nBoxMother
                        + "\nHard Disk :              "+nBoxHDD
                        + "\nGraphic Card :        "+nBoxVGA
                        + "\nMemory RAM :         "+nBoxRAM
                        + "\nMonitor :                   "+nBoxLCD
                        + "\nKeyboard :               "+nBoxKeyboard
                        + "\nMouse :                    "+nBoxMouse
                        + "\n"
                        + "\n---------------------------------------------------------------------------------------------------------------------------------------"
                        + "\nTotal Harga :           Rp. "+Total
                        + "\nPembayaran :         "+bayar
                        + "\n---------------------------------------------------------------------------------------------------------------------------------------"
                        + "\n"
                        + "\n                                                                                                                                                                    Mulai Pemesanan?",
                "Rincian Pemesanan",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null , null, null);
        
        if(lanjutkan == JOptionPane.YES_NO_OPTION){
            JOptionPane.showInputDialog("Masukkan No. Handphone");
            JOptionPane.showMessageDialog(this, "Pemesanan Berhasil!");
            FormUtama n = new FormUtama();
            n.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LanjutkanMouseClicked

    private void barCekHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barCekHargaActionPerformed
        // TODO add your handling code here:
        Total = nTextCasing + nTextProc + nTextMother + nTextHDD + nTextVGA + nTextRAM + nTextLCD + nTextKeyboard + nTextMouse;
        TotalHarga.setText(String.valueOf("Rp. ")+Total);
    }//GEN-LAST:event_barCekHargaActionPerformed

    private void barResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barResetActionPerformed
        // TODO add your handling code here:
        BoxCasing.setSelectedIndex(0);
        BoxProc.setSelectedIndex(0);
        BoxMother.setSelectedIndex(0);
        BoxHDD.setSelectedIndex(0);
        BoxVGA.setSelectedIndex(0);
        BoxRAM.setSelectedIndex(0);
        BoxLCD.setSelectedIndex(0);
        BoxKeyboard.setSelectedIndex(0);
        BoxMouse.setSelectedIndex(0);
        ViaOVO.setSelected(true);
        TotalHarga.setText("Rp. 0.0");
    }//GEN-LAST:event_barResetActionPerformed

    private void barLogoutAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barLogoutAppActionPerformed
        // TODO add your handling code here:
        int keluar = JOptionPane.showOptionDialog(this, 
                        "Apakah Anda Ingin Keluar?", 
                        "Keluar dari Aplikasi", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        if(keluar == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_barLogoutAppActionPerformed

    private void MenuAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAwalActionPerformed
        // TODO add your handling code here:
        int keluar = JOptionPane.showOptionDialog(this,
                "Apakah Anda ingin kembali ke Menu awal?",
                "Kembali ke Menu Awal",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null , null, null);
        
        if(keluar == JOptionPane.YES_NO_OPTION){
            barLogoutApp.setVisible(false);
            FormUtama n = new FormUtama();
            n.setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(this, "Berhasil ke Menu Awal!");
        }
    }//GEN-LAST:event_MenuAwalActionPerformed

    private void barAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barAboutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Order PC Gaming Version 1.0 \nCreated by : Arbi Yudatama");
    }//GEN-LAST:event_barAboutActionPerformed

    private void barCheckUpdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barCheckUpdatesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Aplikasi sudah ter-update!");
    }//GEN-LAST:event_barCheckUpdatesActionPerformed

    private void barHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barHelpActionPerformed

    private void barLanjutkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barLanjutkanActionPerformed
        // TODO add your handling code here:
        String bayar;
        if(ViaOVO.isSelected()){
            bayar = "Via OVO";
        }else{
            bayar = "Via Kartu Kredit / ATM";
        }
        
        int lanjutkan = JOptionPane.showOptionDialog(this,
                    "---------------------------------------------------------------------------------------------------------------------------------------"
                        +"\nCasing :                   "+nBoxCasing
                        + "\nProcessor :             "+nBoxProc
                        + "\nMotherBoard :         "+nBoxMother
                        + "\nHard Disk :              "+nBoxHDD
                        + "\nGraphic Card :        "+nBoxVGA
                        + "\nMemory RAM :         "+nBoxRAM
                        + "\nMonitor :                   "+nBoxLCD
                        + "\nKeyboard :               "+nBoxKeyboard
                        + "\nMouse :                    "+nBoxMouse
                        + "\n"
                        + "\n---------------------------------------------------------------------------------------------------------------------------------------"
                        + "\nPembayaran :         "+bayar
                        + "\n---------------------------------------------------------------------------------------------------------------------------------------"
                        + "\n"
                        + "\n                                                                                                                                                                    Mulai Pemesanan?",
                "Rincian Pemesanan",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null , null, null);
        
        if(lanjutkan == JOptionPane.YES_NO_OPTION){
            JOptionPane.showInputDialog("Masukkan No. Handphone");
            JOptionPane.showMessageDialog(this, "Pemesanan Berhasil!");
            FormUtama n = new FormUtama();
            n.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_barLanjutkanActionPerformed

    private void BackgroundAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_BackgroundAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_BackgroundAncestorAdded
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
            java.util.logging.Logger.getLogger(FormList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JComboBox BoxCasing;
    private javax.swing.JComboBox BoxHDD;
    private javax.swing.JComboBox BoxKeyboard;
    private javax.swing.JComboBox BoxLCD;
    private javax.swing.JComboBox BoxMother;
    private javax.swing.JComboBox BoxMouse;
    private javax.swing.JComboBox BoxProc;
    private javax.swing.JComboBox BoxRAM;
    private javax.swing.JComboBox BoxVGA;
    private javax.swing.JButton Cek;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Hiasan;
    private javax.swing.JLabel LabelCasing;
    private javax.swing.JLabel LabelHDD;
    private javax.swing.JLabel LabelKeyboard;
    private javax.swing.JLabel LabelLCD;
    private javax.swing.JLabel LabelMother;
    private javax.swing.JLabel LabelMouse;
    private javax.swing.JLabel LabelProc;
    private javax.swing.JLabel LabelRAM;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JLabel LabelVGA;
    private javax.swing.JLabel Lanjutkan;
    private javax.swing.JMenuItem MenuAwal;
    private javax.swing.JLabel OpsiPembayaran;
    private javax.swing.ButtonGroup Pembayaran;
    private javax.swing.JLabel Reset;
    private javax.swing.JTextField TextCasing;
    private javax.swing.JTextField TextHDD;
    private javax.swing.JTextField TextKeyboard;
    private javax.swing.JTextField TextLCD;
    private javax.swing.JTextField TextMother;
    private javax.swing.JTextField TextMouse;
    private javax.swing.JTextField TextProc;
    private javax.swing.JTextField TextRAM;
    private javax.swing.JTextField TextVGA;
    private javax.swing.JTextField TotalHarga;
    private javax.swing.JRadioButton ViaATM;
    private javax.swing.JRadioButton ViaOVO;
    private javax.swing.JMenuItem barAbout;
    private javax.swing.JMenuItem barCekHarga;
    private javax.swing.JMenuItem barCheckUpdates;
    private javax.swing.JMenu barEdit;
    private javax.swing.JMenu barFile;
    private javax.swing.JMenu barHelp;
    private javax.swing.JMenuItem barLanjutkan;
    private javax.swing.JMenuItem barLogoutApp;
    private javax.swing.JMenuItem barReset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

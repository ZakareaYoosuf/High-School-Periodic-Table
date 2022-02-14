import javax.swing.ImageIcon;
public class PeriodicTable extends javax.swing.JFrame {

    public PeriodicTable() {
        initComponents();
        //alkali metals: 0 - 5
        //alkaline earth metals: 6 - 11 
        //halogen: 12 - 17
        //metalliods: 18 - 24
        // noble gases: 25 - 31
        // other non-metals: 32 - 38
        // post-transition metals : 39 - 49
        // rare-earth metals : 50 - 51
        button[0] = am_Lithium;
        button[1] = am_Sodium;
        button[2] = am_Potassium;
        button[3] = am_Rubidium;
        button[4] = am_Caesium;
        button[5] = am_Francium;
        button[6] = ae_Beryllium;
        button[7] = ae_Magnesium;
        button[8] = ae_Calcium;
        button[9] = ae_Stronium;
        button[10] = ae_Barium;
        button[11] = ae_Radium;
        button[12] = h_Flourine;
        button[13] = h_Chlorine;
        button[14] = h_Bromine;
        button[15] = h_Iodine;
        button[16] = h_Astatine;
        button[17] = h_Tennessine;
        button[18] = m_Boron;
        button[19] = m_Silicon;
        button[20] = m_Germanium;
        button[21] = m_Arsenic;
        button[22] = m_Antimony;
        button[23] = m_Tellerium;
        button[24] = m_Polonium;
        button[25] = ng_Helium;
        button[26] = ng_Neon;
        button[27] = ng_Argon;
        button[28] = ng_Krypton;
        button[29] = ng_Xenon;
        button[30] = ng_Radon;
        button[31] = ng_Oganesson;
        button[32] = o_Hydrogen;
        button[33] = o_Carbon;
        button[34] = o_Nitrogen;
        button[35] = o_Oxygen;
        button[36] = o_Sulfur;
        button[37] = o_Selenium;
        button[38] = o_Phosphorus;
        button[39] = pt_Aluminium;
        button[40] = pt_Gallium;
        button[41] = pt_Indium;
        button[42] = pt_Thallium;
        button[43] = pt_Tin;
        button[44] = pt_Lead;
        button[45] = pt_Bismuth;
        button[46] = pt_Nihonium;
        button[47] = pt_Flerovium;
        button[48] = pt_Moscovium;
        button[49] = pt_Livermonium;
        button[50] = re_RareEarth1;
        button[51] = re_RareEarth2;
        button[52] = t_Scandanium;
        button[53] = t_Titanium;
        button[54] = t_Vanadium;
        button[55] = t_Chromium;
        button[56] = t_Manganese;
        button[57] = t_Iron;
        button[58] = t_Cobalt;
        button[59] = t_Nickel;
        button[60] = t_Copper;
        button[61] = t_Zinc;
        button[62] = t_Yttrium;
        button[63] = t_Zirconium;
        button[64] = t_Niobrium;
        button[65] = t_Molybdenum;
        button[66] = t_Technetium;
        button[67] = t_Ruthenium;
        button[68] = t_Rhodium;
        button[69] = t_Palladium;
        button[70] = t_Silver;
        button[71] = t_Cadmium;
        button[72] = t_Hafnium;
        button[73] = t_Tantalum;
        button[74] = t_Tungsten;
        button[75] = t_Rhenium;
        button[76] = t_Osmium;
        button[77] = t_Iridium;
        button[78] = t_Platinum;
        button[79] = t_Gold;
        button[80] = t_Mercury;
        button[81] = t_Rutherfordium;
        button[82] = t_Dubnium;
        button[83] = t_Seaborgium;
        button[84] = t_Bohrium;
        button[85] = t_Hassmium;
        button[86] = t_Meitnerium;
        button[87] = t_Darmstadium;
        button[88] = t_Roentgenium;
        button[89] = t_Copernicium;

    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        midPanel = new javax.swing.JPanel();
        am_Potassium = new javax.swing.JButton();
        ae_Calcium = new javax.swing.JButton();
        t_Scandanium = new javax.swing.JButton();
        t_Zirconium = new javax.swing.JButton();
        t_Tantalum = new javax.swing.JButton();
        t_Manganese = new javax.swing.JButton();
        t_Cobalt = new javax.swing.JButton();
        t_Iron = new javax.swing.JButton();
        t_Palladium = new javax.swing.JButton();
        t_Meitnerium = new javax.swing.JButton();
        t_Platinum = new javax.swing.JButton();
        t_Copper = new javax.swing.JButton();
        m_Arsenic = new javax.swing.JButton();
        m_Antimony = new javax.swing.JButton();
        o_Selenium = new javax.swing.JButton();
        m_Tellerium = new javax.swing.JButton();
        pt_Livermonium = new javax.swing.JButton();
        am_Rubidium = new javax.swing.JButton();
        t_Titanium = new javax.swing.JButton();
        ae_Stronium = new javax.swing.JButton();
        t_Vanadium = new javax.swing.JButton();
        t_Chromium = new javax.swing.JButton();
        t_Molybdenum = new javax.swing.JButton();
        t_Hassmium = new javax.swing.JButton();
        t_Ruthenium = new javax.swing.JButton();
        t_Osmium = new javax.swing.JButton();
        t_Darmstadium = new javax.swing.JButton();
        t_Silver = new javax.swing.JButton();
        t_Iridium = new javax.swing.JButton();
        t_Cadmium = new javax.swing.JButton();
        t_Mercury = new javax.swing.JButton();
        t_Roentgenium = new javax.swing.JButton();
        t_Copernicium = new javax.swing.JButton();
        pt_Indium = new javax.swing.JButton();
        pt_Tin = new javax.swing.JButton();
        m_Polonium = new javax.swing.JButton();
        am_Caesium = new javax.swing.JButton();
        ae_Barium = new javax.swing.JButton();
        re_RareEarth1 = new javax.swing.JButton();
        t_Hafnium = new javax.swing.JButton();
        t_Rutherfordium = new javax.swing.JButton();
        t_Tungsten = new javax.swing.JButton();
        t_Technetium = new javax.swing.JButton();
        t_Bohrium = new javax.swing.JButton();
        t_Rhenium = new javax.swing.JButton();
        t_Gold = new javax.swing.JButton();
        t_Nickel = new javax.swing.JButton();
        t_Zinc = new javax.swing.JButton();
        pt_Gallium = new javax.swing.JButton();
        pt_Lead = new javax.swing.JButton();
        pt_Flerovium = new javax.swing.JButton();
        pt_Bismuth = new javax.swing.JButton();
        pt_Moscovium = new javax.swing.JButton();
        h_Bromine = new javax.swing.JButton();
        am_Francium = new javax.swing.JButton();
        ae_Radium = new javax.swing.JButton();
        re_RareEarth2 = new javax.swing.JButton();
        t_Yttrium = new javax.swing.JButton();
        t_Dubnium = new javax.swing.JButton();
        t_Seaborgium = new javax.swing.JButton();
        t_Rhodium = new javax.swing.JButton();
        pt_Thallium = new javax.swing.JButton();
        pt_Nihonium = new javax.swing.JButton();
        m_Germanium = new javax.swing.JButton();
        h_Iodine = new javax.swing.JButton();
        h_Astatine = new javax.swing.JButton();
        h_Tennessine = new javax.swing.JButton();
        ng_Xenon = new javax.swing.JButton();
        ng_Radon = new javax.swing.JButton();
        ng_Oganesson = new javax.swing.JButton();
        t_Niobrium = new javax.swing.JButton();
        ng_Krypton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        am_Lithium = new javax.swing.JButton();
        ae_Beryllium = new javax.swing.JButton();
        ae_Magnesium = new javax.swing.JButton();
        o_Hydrogen = new javax.swing.JButton();
        am_Sodium = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        m_Boron = new javax.swing.JButton();
        o_Carbon = new javax.swing.JButton();
        o_Nitrogen = new javax.swing.JButton();
        m_Silicon = new javax.swing.JButton();
        o_Phosphorus = new javax.swing.JButton();
        o_Oxygen = new javax.swing.JButton();
        o_Sulfur = new javax.swing.JButton();
        h_Flourine = new javax.swing.JButton();
        h_Chlorine = new javax.swing.JButton();
        ng_Argon = new javax.swing.JButton();
        ng_Neon = new javax.swing.JButton();
        pt_Aluminium = new javax.swing.JButton();
        ng_Helium = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        imglabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ng_NobleGases = new javax.swing.JButton();
        pt_PostTransitionMetals = new javax.swing.JButton();
        re_RareEarthMetals = new javax.swing.JButton();
        o_OtherNonMetals = new javax.swing.JButton();
        m_Metalliods = new javax.swing.JButton();
        h_Halogens = new javax.swing.JButton();
        am_AlkaliMetals = new javax.swing.JButton();
        ae_AlkaliEarthMetals = new javax.swing.JButton();
        t_TransitionMetals = new javax.swing.JButton();
        elementBox = new javax.swing.JComboBox<>();
        groupBox = new javax.swing.JComboBox<>();
        homePageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Periodic Table");
        setBounds(new java.awt.Rectangle(0, 0, 1140, 540));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1700, 970));
        setMinimumSize(new java.awt.Dimension(1700, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1700, 970));

        midPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        midPanel.setMaximumSize(new java.awt.Dimension(1618, 367));
        midPanel.setMinimumSize(new java.awt.Dimension(1618, 367));
        midPanel.setPreferredSize(new java.awt.Dimension(54, 54));

        am_Potassium.setBackground(new java.awt.Color(255, 102, 102));
        am_Potassium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        am_Potassium.setText("K");
        am_Potassium.setMaximumSize(new java.awt.Dimension(54, 54));
        am_Potassium.setMinimumSize(new java.awt.Dimension(54, 54));
        am_Potassium.setPreferredSize(new java.awt.Dimension(80, 80));
        am_Potassium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am_PotassiumActionPerformed(evt);
            }
        });

        ae_Calcium.setBackground(new java.awt.Color(255, 204, 153));
        ae_Calcium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        ae_Calcium.setText("Ca");
        ae_Calcium.setMaximumSize(new java.awt.Dimension(54, 54));
        ae_Calcium.setMinimumSize(new java.awt.Dimension(54, 54));
        ae_Calcium.setPreferredSize(new java.awt.Dimension(80, 80));
        ae_Calcium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae_CalciumActionPerformed(evt);
            }
        });

        t_Scandanium.setBackground(new java.awt.Color(255, 153, 153));
        t_Scandanium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Scandanium.setText("Sc");
        t_Scandanium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Scandanium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Scandanium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Scandanium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ScandaniumActionPerformed(evt);
            }
        });

        t_Zirconium.setBackground(new java.awt.Color(255, 153, 153));
        t_Zirconium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Zirconium.setText("Zr");
        t_Zirconium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Zirconium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Zirconium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Zirconium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ZirconiumActionPerformed(evt);
            }
        });

        t_Tantalum.setBackground(new java.awt.Color(255, 153, 153));
        t_Tantalum.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Tantalum.setText("Ta");
        t_Tantalum.setMaximumSize(new java.awt.Dimension(80, 80));
        t_Tantalum.setMinimumSize(new java.awt.Dimension(80, 80));
        t_Tantalum.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Tantalum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_TantalumActionPerformed(evt);
            }
        });

        t_Manganese.setBackground(new java.awt.Color(255, 153, 153));
        t_Manganese.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Manganese.setText("Mn");
        t_Manganese.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Manganese.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Manganese.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Manganese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ManganeseActionPerformed(evt);
            }
        });

        t_Cobalt.setBackground(new java.awt.Color(255, 153, 153));
        t_Cobalt.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Cobalt.setText("Co");
        t_Cobalt.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Cobalt.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Cobalt.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Cobalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_CobaltActionPerformed(evt);
            }
        });

        t_Iron.setBackground(new java.awt.Color(255, 153, 153));
        t_Iron.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Iron.setText("Fe");
        t_Iron.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Iron.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Iron.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Iron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_IronActionPerformed(evt);
            }
        });

        t_Palladium.setBackground(new java.awt.Color(255, 153, 153));
        t_Palladium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Palladium.setText("Pd");
        t_Palladium.setToolTipText("");
        t_Palladium.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_Palladium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Palladium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Palladium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Palladium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_PalladiumActionPerformed(evt);
            }
        });

        t_Meitnerium.setBackground(new java.awt.Color(255, 153, 153));
        t_Meitnerium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Meitnerium.setText("Mt");
        t_Meitnerium.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_Meitnerium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Meitnerium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Meitnerium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Meitnerium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_MeitneriumActionPerformed(evt);
            }
        });

        t_Platinum.setBackground(new java.awt.Color(255, 153, 153));
        t_Platinum.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Platinum.setText("Pt");
        t_Platinum.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_Platinum.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Platinum.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Platinum.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Platinum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_PlatinumActionPerformed(evt);
            }
        });

        t_Copper.setBackground(new java.awt.Color(255, 153, 153));
        t_Copper.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Copper.setText("Cu");
        t_Copper.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_Copper.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Copper.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Copper.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Copper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_CopperActionPerformed(evt);
            }
        });

        m_Arsenic.setBackground(new java.awt.Color(153, 153, 0));
        m_Arsenic.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        m_Arsenic.setText("As");
        m_Arsenic.setMaximumSize(new java.awt.Dimension(54, 54));
        m_Arsenic.setMinimumSize(new java.awt.Dimension(54, 54));
        m_Arsenic.setPreferredSize(new java.awt.Dimension(80, 80));
        m_Arsenic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_ArsenicActionPerformed(evt);
            }
        });

        m_Antimony.setBackground(new java.awt.Color(153, 153, 0));
        m_Antimony.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        m_Antimony.setText("Sb");
        m_Antimony.setMaximumSize(new java.awt.Dimension(54, 54));
        m_Antimony.setMinimumSize(new java.awt.Dimension(54, 54));
        m_Antimony.setPreferredSize(new java.awt.Dimension(80, 80));
        m_Antimony.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_AntimonyActionPerformed(evt);
            }
        });

        o_Selenium.setBackground(new java.awt.Color(0, 51, 255));
        o_Selenium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        o_Selenium.setText("Se");
        o_Selenium.setMaximumSize(new java.awt.Dimension(54, 54));
        o_Selenium.setMinimumSize(new java.awt.Dimension(54, 54));
        o_Selenium.setPreferredSize(new java.awt.Dimension(80, 80));
        o_Selenium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_SeleniumActionPerformed(evt);
            }
        });

        m_Tellerium.setBackground(new java.awt.Color(153, 153, 0));
        m_Tellerium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        m_Tellerium.setText("Te");
        m_Tellerium.setMaximumSize(new java.awt.Dimension(54, 54));
        m_Tellerium.setMinimumSize(new java.awt.Dimension(54, 54));
        m_Tellerium.setPreferredSize(new java.awt.Dimension(80, 80));
        m_Tellerium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_TelleriumActionPerformed(evt);
            }
        });

        pt_Livermonium.setBackground(new java.awt.Color(204, 204, 204));
        pt_Livermonium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        pt_Livermonium.setText("Lv");
        pt_Livermonium.setMaximumSize(new java.awt.Dimension(54, 54));
        pt_Livermonium.setMinimumSize(new java.awt.Dimension(54, 54));
        pt_Livermonium.setPreferredSize(new java.awt.Dimension(80, 80));
        pt_Livermonium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt_LivermoniumActionPerformed(evt);
            }
        });

        am_Rubidium.setBackground(new java.awt.Color(255, 102, 102));
        am_Rubidium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        am_Rubidium.setText("Rb");
        am_Rubidium.setMaximumSize(new java.awt.Dimension(54, 54));
        am_Rubidium.setMinimumSize(new java.awt.Dimension(54, 54));
        am_Rubidium.setPreferredSize(new java.awt.Dimension(80, 80));
        am_Rubidium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am_RubidiumActionPerformed(evt);
            }
        });

        t_Titanium.setBackground(new java.awt.Color(255, 153, 153));
        t_Titanium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Titanium.setText("Ti");
        t_Titanium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Titanium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Titanium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Titanium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_TitaniumActionPerformed(evt);
            }
        });

        ae_Stronium.setBackground(new java.awt.Color(255, 204, 153));
        ae_Stronium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        ae_Stronium.setText("Sr");
        ae_Stronium.setMaximumSize(new java.awt.Dimension(54, 54));
        ae_Stronium.setMinimumSize(new java.awt.Dimension(54, 54));
        ae_Stronium.setPreferredSize(new java.awt.Dimension(80, 80));
        ae_Stronium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae_StroniumActionPerformed(evt);
            }
        });

        t_Vanadium.setBackground(new java.awt.Color(255, 153, 153));
        t_Vanadium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Vanadium.setText("V");
        t_Vanadium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Vanadium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Vanadium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Vanadium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_VanadiumActionPerformed(evt);
            }
        });

        t_Chromium.setBackground(new java.awt.Color(255, 153, 153));
        t_Chromium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Chromium.setText("Cr");
        t_Chromium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Chromium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Chromium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Chromium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ChromiumActionPerformed(evt);
            }
        });

        t_Molybdenum.setBackground(new java.awt.Color(255, 153, 153));
        t_Molybdenum.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Molybdenum.setText("Mo");
        t_Molybdenum.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Molybdenum.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Molybdenum.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Molybdenum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_MolybdenumActionPerformed(evt);
            }
        });

        t_Hassmium.setBackground(new java.awt.Color(255, 153, 153));
        t_Hassmium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Hassmium.setText("Hs");
        t_Hassmium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Hassmium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Hassmium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Hassmium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_HassmiumActionPerformed(evt);
            }
        });

        t_Ruthenium.setBackground(new java.awt.Color(255, 153, 153));
        t_Ruthenium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Ruthenium.setText("Ru");
        t_Ruthenium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Ruthenium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Ruthenium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Ruthenium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_RutheniumActionPerformed(evt);
            }
        });

        t_Osmium.setBackground(new java.awt.Color(255, 153, 153));
        t_Osmium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Osmium.setText("Os");
        t_Osmium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Osmium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Osmium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Osmium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_OsmiumActionPerformed(evt);
            }
        });

        t_Darmstadium.setBackground(new java.awt.Color(255, 153, 153));
        t_Darmstadium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Darmstadium.setText("Ds");
        t_Darmstadium.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_Darmstadium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Darmstadium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Darmstadium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Darmstadium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_DarmstadiumActionPerformed(evt);
            }
        });

        t_Silver.setBackground(new java.awt.Color(255, 153, 153));
        t_Silver.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Silver.setText("Ag");
        t_Silver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_Silver.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Silver.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Silver.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Silver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_SilverActionPerformed(evt);
            }
        });

        t_Iridium.setBackground(new java.awt.Color(255, 153, 153));
        t_Iridium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Iridium.setText("Ir");
        t_Iridium.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_Iridium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Iridium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Iridium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Iridium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_IridiumActionPerformed(evt);
            }
        });

        t_Cadmium.setBackground(new java.awt.Color(255, 153, 153));
        t_Cadmium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Cadmium.setText("Cd");
        t_Cadmium.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_Cadmium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Cadmium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Cadmium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Cadmium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_CadmiumActionPerformed(evt);
            }
        });

        t_Mercury.setBackground(new java.awt.Color(255, 153, 153));
        t_Mercury.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Mercury.setText("Hg");
        t_Mercury.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Mercury.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Mercury.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Mercury.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_MercuryActionPerformed(evt);
            }
        });

        t_Roentgenium.setBackground(new java.awt.Color(255, 153, 153));
        t_Roentgenium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Roentgenium.setText("Rg");
        t_Roentgenium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Roentgenium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Roentgenium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Roentgenium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_RoentgeniumActionPerformed(evt);
            }
        });

        t_Copernicium.setBackground(new java.awt.Color(255, 153, 153));
        t_Copernicium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Copernicium.setText("Cn");
        t_Copernicium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Copernicium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Copernicium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Copernicium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_CoperniciumActionPerformed(evt);
            }
        });

        pt_Indium.setBackground(new java.awt.Color(204, 204, 204));
        pt_Indium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        pt_Indium.setText("In");
        pt_Indium.setMaximumSize(new java.awt.Dimension(54, 54));
        pt_Indium.setMinimumSize(new java.awt.Dimension(54, 54));
        pt_Indium.setPreferredSize(new java.awt.Dimension(80, 80));
        pt_Indium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt_IndiumActionPerformed(evt);
            }
        });

        pt_Tin.setBackground(new java.awt.Color(204, 204, 204));
        pt_Tin.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        pt_Tin.setText("Sn");
        pt_Tin.setMaximumSize(new java.awt.Dimension(54, 54));
        pt_Tin.setMinimumSize(new java.awt.Dimension(54, 54));
        pt_Tin.setPreferredSize(new java.awt.Dimension(80, 80));
        pt_Tin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt_TinActionPerformed(evt);
            }
        });

        m_Polonium.setBackground(new java.awt.Color(153, 153, 0));
        m_Polonium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        m_Polonium.setText("Po");
        m_Polonium.setMaximumSize(new java.awt.Dimension(54, 54));
        m_Polonium.setMinimumSize(new java.awt.Dimension(54, 54));
        m_Polonium.setPreferredSize(new java.awt.Dimension(80, 80));
        m_Polonium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_PoloniumActionPerformed(evt);
            }
        });

        am_Caesium.setBackground(new java.awt.Color(255, 102, 102));
        am_Caesium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        am_Caesium.setText("Cs");
        am_Caesium.setMaximumSize(new java.awt.Dimension(54, 54));
        am_Caesium.setMinimumSize(new java.awt.Dimension(54, 54));
        am_Caesium.setPreferredSize(new java.awt.Dimension(80, 80));
        am_Caesium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am_CaesiumActionPerformed(evt);
            }
        });

        ae_Barium.setBackground(new java.awt.Color(255, 204, 153));
        ae_Barium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        ae_Barium.setText("Ba");
        ae_Barium.setMaximumSize(new java.awt.Dimension(54, 54));
        ae_Barium.setMinimumSize(new java.awt.Dimension(54, 54));
        ae_Barium.setPreferredSize(new java.awt.Dimension(80, 80));
        ae_Barium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae_BariumActionPerformed(evt);
            }
        });

        re_RareEarth1.setBackground(new java.awt.Color(0, 204, 204));
        re_RareEarth1.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        re_RareEarth1.setText("La-Lu");
        re_RareEarth1.setMaximumSize(new java.awt.Dimension(54, 54));
        re_RareEarth1.setMinimumSize(new java.awt.Dimension(54, 54));
        re_RareEarth1.setPreferredSize(new java.awt.Dimension(80, 80));
        re_RareEarth1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re_RareEarth1ActionPerformed(evt);
            }
        });

        t_Hafnium.setBackground(new java.awt.Color(255, 153, 153));
        t_Hafnium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Hafnium.setText("Hf");
        t_Hafnium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Hafnium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Hafnium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Hafnium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_HafniumActionPerformed(evt);
            }
        });

        t_Rutherfordium.setBackground(new java.awt.Color(255, 153, 153));
        t_Rutherfordium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Rutherfordium.setText("Rf");
        t_Rutherfordium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Rutherfordium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Rutherfordium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Rutherfordium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_RutherfordiumActionPerformed(evt);
            }
        });

        t_Tungsten.setBackground(new java.awt.Color(255, 153, 153));
        t_Tungsten.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Tungsten.setText("W");
        t_Tungsten.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Tungsten.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Tungsten.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Tungsten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_TungstenActionPerformed(evt);
            }
        });

        t_Technetium.setBackground(new java.awt.Color(255, 153, 153));
        t_Technetium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Technetium.setText("Tc");
        t_Technetium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Technetium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Technetium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Technetium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_TechnetiumActionPerformed(evt);
            }
        });

        t_Bohrium.setBackground(new java.awt.Color(255, 153, 153));
        t_Bohrium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Bohrium.setText("Bh");
        t_Bohrium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Bohrium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Bohrium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Bohrium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_BohriumActionPerformed(evt);
            }
        });

        t_Rhenium.setBackground(new java.awt.Color(255, 153, 153));
        t_Rhenium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Rhenium.setText("Re");
        t_Rhenium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Rhenium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Rhenium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Rhenium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_RheniumActionPerformed(evt);
            }
        });

        t_Gold.setBackground(new java.awt.Color(255, 153, 153));
        t_Gold.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Gold.setText("Au");
        t_Gold.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_Gold.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Gold.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Gold.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Gold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_GoldActionPerformed(evt);
            }
        });

        t_Nickel.setBackground(new java.awt.Color(255, 153, 153));
        t_Nickel.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Nickel.setText("Ni");
        t_Nickel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_Nickel.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Nickel.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Nickel.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Nickel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_NickelActionPerformed(evt);
            }
        });

        t_Zinc.setBackground(new java.awt.Color(255, 153, 153));
        t_Zinc.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Zinc.setText("Zn");
        t_Zinc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_Zinc.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Zinc.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Zinc.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Zinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ZincActionPerformed(evt);
            }
        });

        pt_Gallium.setBackground(new java.awt.Color(204, 204, 204));
        pt_Gallium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        pt_Gallium.setText("Ga");
        pt_Gallium.setToolTipText("");
        pt_Gallium.setMaximumSize(new java.awt.Dimension(54, 54));
        pt_Gallium.setMinimumSize(new java.awt.Dimension(54, 54));
        pt_Gallium.setPreferredSize(new java.awt.Dimension(80, 80));
        pt_Gallium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt_GalliumActionPerformed(evt);
            }
        });

        pt_Lead.setBackground(new java.awt.Color(204, 204, 204));
        pt_Lead.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        pt_Lead.setText("Pb");
        pt_Lead.setMaximumSize(new java.awt.Dimension(54, 54));
        pt_Lead.setMinimumSize(new java.awt.Dimension(54, 54));
        pt_Lead.setPreferredSize(new java.awt.Dimension(80, 80));
        pt_Lead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt_LeadActionPerformed(evt);
            }
        });

        pt_Flerovium.setBackground(new java.awt.Color(204, 204, 204));
        pt_Flerovium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        pt_Flerovium.setText("Fl");
        pt_Flerovium.setMaximumSize(new java.awt.Dimension(54, 54));
        pt_Flerovium.setMinimumSize(new java.awt.Dimension(54, 54));
        pt_Flerovium.setPreferredSize(new java.awt.Dimension(80, 80));
        pt_Flerovium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt_FleroviumActionPerformed(evt);
            }
        });

        pt_Bismuth.setBackground(new java.awt.Color(204, 204, 204));
        pt_Bismuth.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        pt_Bismuth.setText("Bi");
        pt_Bismuth.setMaximumSize(new java.awt.Dimension(54, 54));
        pt_Bismuth.setMinimumSize(new java.awt.Dimension(54, 54));
        pt_Bismuth.setPreferredSize(new java.awt.Dimension(80, 80));
        pt_Bismuth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt_BismuthActionPerformed(evt);
            }
        });

        pt_Moscovium.setBackground(new java.awt.Color(204, 204, 204));
        pt_Moscovium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        pt_Moscovium.setText("Mc");
        pt_Moscovium.setMaximumSize(new java.awt.Dimension(54, 54));
        pt_Moscovium.setMinimumSize(new java.awt.Dimension(54, 54));
        pt_Moscovium.setPreferredSize(new java.awt.Dimension(80, 80));
        pt_Moscovium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt_MoscoviumActionPerformed(evt);
            }
        });

        h_Bromine.setBackground(new java.awt.Color(255, 255, 153));
        h_Bromine.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        h_Bromine.setText("Br");
        h_Bromine.setMaximumSize(new java.awt.Dimension(54, 54));
        h_Bromine.setMinimumSize(new java.awt.Dimension(54, 54));
        h_Bromine.setPreferredSize(new java.awt.Dimension(80, 80));
        h_Bromine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_BromineActionPerformed(evt);
            }
        });

        am_Francium.setBackground(new java.awt.Color(255, 102, 102));
        am_Francium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        am_Francium.setText("Fr");
        am_Francium.setMaximumSize(new java.awt.Dimension(54, 54));
        am_Francium.setMinimumSize(new java.awt.Dimension(54, 54));
        am_Francium.setPreferredSize(new java.awt.Dimension(80, 80));
        am_Francium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am_FranciumActionPerformed(evt);
            }
        });

        ae_Radium.setBackground(new java.awt.Color(255, 204, 153));
        ae_Radium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        ae_Radium.setText("Ra");
        ae_Radium.setMaximumSize(new java.awt.Dimension(54, 54));
        ae_Radium.setMinimumSize(new java.awt.Dimension(54, 54));
        ae_Radium.setPreferredSize(new java.awt.Dimension(80, 80));
        ae_Radium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae_RadiumActionPerformed(evt);
            }
        });

        re_RareEarth2.setBackground(new java.awt.Color(0, 204, 204));
        re_RareEarth2.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        re_RareEarth2.setText("Ac-Lr");
        re_RareEarth2.setMaximumSize(new java.awt.Dimension(54, 54));
        re_RareEarth2.setMinimumSize(new java.awt.Dimension(54, 54));
        re_RareEarth2.setPreferredSize(new java.awt.Dimension(80, 80));
        re_RareEarth2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re_RareEarth2ActionPerformed(evt);
            }
        });

        t_Yttrium.setBackground(new java.awt.Color(255, 153, 153));
        t_Yttrium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Yttrium.setText("Y");
        t_Yttrium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Yttrium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Yttrium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Yttrium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_YttriumActionPerformed(evt);
            }
        });

        t_Dubnium.setBackground(new java.awt.Color(255, 153, 153));
        t_Dubnium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Dubnium.setText("Db");
        t_Dubnium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Dubnium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Dubnium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Dubnium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_DubniumActionPerformed(evt);
            }
        });

        t_Seaborgium.setBackground(new java.awt.Color(255, 153, 153));
        t_Seaborgium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Seaborgium.setText("Sg");
        t_Seaborgium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Seaborgium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Seaborgium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Seaborgium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_SeaborgiumActionPerformed(evt);
            }
        });

        t_Rhodium.setBackground(new java.awt.Color(255, 153, 153));
        t_Rhodium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Rhodium.setText("Rh");
        t_Rhodium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Rhodium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Rhodium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Rhodium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_RhodiumActionPerformed(evt);
            }
        });

        pt_Thallium.setBackground(new java.awt.Color(204, 204, 204));
        pt_Thallium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        pt_Thallium.setText("Tl");
        pt_Thallium.setMaximumSize(new java.awt.Dimension(54, 54));
        pt_Thallium.setMinimumSize(new java.awt.Dimension(54, 54));
        pt_Thallium.setPreferredSize(new java.awt.Dimension(80, 80));
        pt_Thallium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt_ThalliumActionPerformed(evt);
            }
        });

        pt_Nihonium.setBackground(new java.awt.Color(204, 204, 204));
        pt_Nihonium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        pt_Nihonium.setText("Nh");
        pt_Nihonium.setMaximumSize(new java.awt.Dimension(54, 54));
        pt_Nihonium.setMinimumSize(new java.awt.Dimension(54, 54));
        pt_Nihonium.setPreferredSize(new java.awt.Dimension(80, 80));
        pt_Nihonium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt_NihoniumActionPerformed(evt);
            }
        });

        m_Germanium.setBackground(new java.awt.Color(153, 153, 0));
        m_Germanium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        m_Germanium.setText("Ge");
        m_Germanium.setMaximumSize(new java.awt.Dimension(54, 54));
        m_Germanium.setMinimumSize(new java.awt.Dimension(54, 54));
        m_Germanium.setPreferredSize(new java.awt.Dimension(80, 80));
        m_Germanium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_GermaniumActionPerformed(evt);
            }
        });

        h_Iodine.setBackground(new java.awt.Color(255, 255, 153));
        h_Iodine.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        h_Iodine.setText("I");
        h_Iodine.setMaximumSize(new java.awt.Dimension(54, 54));
        h_Iodine.setMinimumSize(new java.awt.Dimension(54, 54));
        h_Iodine.setPreferredSize(new java.awt.Dimension(80, 80));
        h_Iodine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_IodineActionPerformed(evt);
            }
        });

        h_Astatine.setBackground(new java.awt.Color(255, 255, 153));
        h_Astatine.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        h_Astatine.setText("At");
        h_Astatine.setMaximumSize(new java.awt.Dimension(54, 54));
        h_Astatine.setMinimumSize(new java.awt.Dimension(54, 54));
        h_Astatine.setPreferredSize(new java.awt.Dimension(80, 80));
        h_Astatine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_AstatineActionPerformed(evt);
            }
        });

        h_Tennessine.setBackground(new java.awt.Color(255, 255, 153));
        h_Tennessine.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        h_Tennessine.setText("Ts");
        h_Tennessine.setMaximumSize(new java.awt.Dimension(54, 54));
        h_Tennessine.setMinimumSize(new java.awt.Dimension(54, 54));
        h_Tennessine.setPreferredSize(new java.awt.Dimension(80, 80));
        h_Tennessine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_TennessineActionPerformed(evt);
            }
        });

        ng_Xenon.setBackground(new java.awt.Color(102, 255, 204));
        ng_Xenon.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        ng_Xenon.setText("Xe");
        ng_Xenon.setMaximumSize(new java.awt.Dimension(54, 54));
        ng_Xenon.setMinimumSize(new java.awt.Dimension(54, 54));
        ng_Xenon.setPreferredSize(new java.awt.Dimension(80, 80));
        ng_Xenon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ng_XenonActionPerformed(evt);
            }
        });

        ng_Radon.setBackground(new java.awt.Color(102, 255, 204));
        ng_Radon.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        ng_Radon.setText("Rn");
        ng_Radon.setMaximumSize(new java.awt.Dimension(54, 54));
        ng_Radon.setMinimumSize(new java.awt.Dimension(54, 54));
        ng_Radon.setPreferredSize(new java.awt.Dimension(80, 80));
        ng_Radon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ng_RadonActionPerformed(evt);
            }
        });

        ng_Oganesson.setBackground(new java.awt.Color(102, 255, 204));
        ng_Oganesson.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        ng_Oganesson.setText("Og");
        ng_Oganesson.setMaximumSize(new java.awt.Dimension(54, 54));
        ng_Oganesson.setMinimumSize(new java.awt.Dimension(54, 54));
        ng_Oganesson.setPreferredSize(new java.awt.Dimension(80, 80));
        ng_Oganesson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ng_OganessonActionPerformed(evt);
            }
        });

        t_Niobrium.setBackground(new java.awt.Color(255, 153, 153));
        t_Niobrium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        t_Niobrium.setText("Nb");
        t_Niobrium.setMaximumSize(new java.awt.Dimension(54, 54));
        t_Niobrium.setMinimumSize(new java.awt.Dimension(54, 54));
        t_Niobrium.setPreferredSize(new java.awt.Dimension(80, 80));
        t_Niobrium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_NiobriumActionPerformed(evt);
            }
        });

        ng_Krypton.setBackground(new java.awt.Color(102, 255, 204));
        ng_Krypton.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        ng_Krypton.setText("Kr");
        ng_Krypton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ng_Krypton.setMaximumSize(new java.awt.Dimension(54, 54));
        ng_Krypton.setMinimumSize(new java.awt.Dimension(54, 54));
        ng_Krypton.setPreferredSize(new java.awt.Dimension(80, 80));
        ng_Krypton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ng_KryptonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout midPanelLayout = new javax.swing.GroupLayout(midPanel);
        midPanel.setLayout(midPanelLayout);
        midPanelLayout.setHorizontalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(am_Rubidium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(am_Caesium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(am_Potassium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(am_Francium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ae_Stronium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ae_Barium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ae_Calcium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ae_Radium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_Scandanium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Yttrium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(re_RareEarth1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(re_RareEarth2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(midPanelLayout.createSequentialGroup()
                        .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(midPanelLayout.createSequentialGroup()
                                .addComponent(t_Titanium, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_Vanadium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(midPanelLayout.createSequentialGroup()
                                .addComponent(t_Zirconium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_Niobrium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(t_Chromium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_Molybdenum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                                .addComponent(t_Manganese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_Iron, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                                .addComponent(t_Technetium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_Ruthenium, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(midPanelLayout.createSequentialGroup()
                        .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t_Hafnium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_Rutherfordium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t_Tantalum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_Dubnium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                                .addComponent(t_Tungsten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_Rhenium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_Osmium, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                                .addComponent(t_Seaborgium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_Bohrium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_Hassmium, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_Rhodium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Cobalt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Iridium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Meitnerium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                        .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_Darmstadium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_Platinum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_Palladium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                                .addComponent(t_Roentgenium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_Copernicium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pt_Nihonium, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                                .addComponent(t_Silver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_Cadmium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pt_Indium, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                                .addComponent(t_Gold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_Mercury, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pt_Thallium, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                        .addComponent(t_Nickel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_Copper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_Zinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt_Gallium, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                        .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                                .addComponent(pt_Flerovium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pt_Moscovium, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                                .addComponent(pt_Tin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_Antimony, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                                .addComponent(pt_Lead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pt_Bismuth, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                                .addComponent(m_Tellerium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h_Iodine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ng_Xenon, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                                .addComponent(pt_Livermonium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h_Tennessine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ng_Oganesson, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                                .addComponent(m_Polonium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h_Astatine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ng_Radon, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                        .addComponent(m_Germanium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m_Arsenic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(o_Selenium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(h_Bromine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ng_Krypton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        midPanelLayout.setVerticalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(am_Potassium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ae_Calcium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_Scandanium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_Titanium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_Vanadium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_Chromium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pt_Gallium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(m_Germanium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(m_Arsenic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(o_Selenium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(h_Bromine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ng_Krypton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_Zinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_Copper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_Nickel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_Cobalt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_Iron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_Manganese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ng_Xenon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h_Iodine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_Tellerium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_Antimony, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_Tin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_Indium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Cadmium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Silver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Palladium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Rhodium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Ruthenium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Technetium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Molybdenum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Niobrium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Zirconium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Yttrium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ae_Stronium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(am_Rubidium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ae_Barium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(am_Caesium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(re_RareEarth1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Hafnium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Tantalum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Tungsten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Rhenium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Osmium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Iridium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Platinum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Gold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Mercury, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_Thallium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_Lead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_Bismuth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_Polonium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h_Astatine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ng_Radon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(am_Francium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ae_Radium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(re_RareEarth2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Rutherfordium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Dubnium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Seaborgium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Bohrium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Hassmium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Meitnerium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Darmstadium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Roentgenium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Copernicium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_Nihonium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_Flerovium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_Moscovium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_Livermonium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h_Tennessine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ng_Oganesson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        am_Lithium.setBackground(new java.awt.Color(255, 102, 102));
        am_Lithium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        am_Lithium.setText("Li");
        am_Lithium.setPreferredSize(new java.awt.Dimension(80, 80));
        am_Lithium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am_LithiumActionPerformed(evt);
            }
        });

        ae_Beryllium.setBackground(new java.awt.Color(255, 204, 153));
        ae_Beryllium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        ae_Beryllium.setText("Be");
        ae_Beryllium.setPreferredSize(new java.awt.Dimension(80, 80));
        ae_Beryllium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae_BerylliumActionPerformed(evt);
            }
        });

        ae_Magnesium.setBackground(new java.awt.Color(255, 204, 153));
        ae_Magnesium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        ae_Magnesium.setText("Mg");
        ae_Magnesium.setPreferredSize(new java.awt.Dimension(80, 80));
        ae_Magnesium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae_MagnesiumActionPerformed(evt);
            }
        });

        o_Hydrogen.setBackground(new java.awt.Color(0, 51, 255));
        o_Hydrogen.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        o_Hydrogen.setText("H");
        o_Hydrogen.setPreferredSize(new java.awt.Dimension(80, 80));
        o_Hydrogen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_HydrogenActionPerformed(evt);
            }
        });

        am_Sodium.setBackground(new java.awt.Color(255, 102, 102));
        am_Sodium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        am_Sodium.setText("Na");
        am_Sodium.setPreferredSize(new java.awt.Dimension(80, 80));
        am_Sodium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am_SodiumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(o_Hydrogen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(am_Lithium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(am_Sodium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ae_Beryllium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ae_Magnesium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(o_Hydrogen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(am_Lithium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ae_Beryllium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ae_Magnesium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(am_Sodium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        m_Boron.setBackground(new java.awt.Color(153, 153, 0));
        m_Boron.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        m_Boron.setText("B");
        m_Boron.setMaximumSize(new java.awt.Dimension(54, 54));
        m_Boron.setMinimumSize(new java.awt.Dimension(54, 54));
        m_Boron.setPreferredSize(new java.awt.Dimension(80, 80));
        m_Boron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_BoronActionPerformed(evt);
            }
        });

        o_Carbon.setBackground(new java.awt.Color(0, 51, 255));
        o_Carbon.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        o_Carbon.setText("C");
        o_Carbon.setMaximumSize(new java.awt.Dimension(54, 54));
        o_Carbon.setMinimumSize(new java.awt.Dimension(54, 54));
        o_Carbon.setPreferredSize(new java.awt.Dimension(80, 80));
        o_Carbon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_CarbonActionPerformed(evt);
            }
        });

        o_Nitrogen.setBackground(new java.awt.Color(0, 51, 255));
        o_Nitrogen.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        o_Nitrogen.setText("N");
        o_Nitrogen.setMaximumSize(new java.awt.Dimension(54, 54));
        o_Nitrogen.setMinimumSize(new java.awt.Dimension(54, 54));
        o_Nitrogen.setPreferredSize(new java.awt.Dimension(80, 80));
        o_Nitrogen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_NitrogenActionPerformed(evt);
            }
        });

        m_Silicon.setBackground(new java.awt.Color(153, 153, 0));
        m_Silicon.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        m_Silicon.setText("Si");
        m_Silicon.setMaximumSize(new java.awt.Dimension(54, 54));
        m_Silicon.setMinimumSize(new java.awt.Dimension(54, 54));
        m_Silicon.setPreferredSize(new java.awt.Dimension(80, 80));
        m_Silicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_SiliconActionPerformed(evt);
            }
        });

        o_Phosphorus.setBackground(new java.awt.Color(0, 51, 255));
        o_Phosphorus.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        o_Phosphorus.setText("P");
        o_Phosphorus.setMaximumSize(new java.awt.Dimension(54, 54));
        o_Phosphorus.setMinimumSize(new java.awt.Dimension(54, 54));
        o_Phosphorus.setPreferredSize(new java.awt.Dimension(80, 80));
        o_Phosphorus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_PhosphorusActionPerformed(evt);
            }
        });

        o_Oxygen.setBackground(new java.awt.Color(0, 51, 255));
        o_Oxygen.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        o_Oxygen.setText("O");
        o_Oxygen.setMaximumSize(new java.awt.Dimension(54, 54));
        o_Oxygen.setMinimumSize(new java.awt.Dimension(54, 54));
        o_Oxygen.setPreferredSize(new java.awt.Dimension(80, 80));
        o_Oxygen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_OxygenActionPerformed(evt);
            }
        });

        o_Sulfur.setBackground(new java.awt.Color(0, 51, 255));
        o_Sulfur.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        o_Sulfur.setText("S");
        o_Sulfur.setMaximumSize(new java.awt.Dimension(54, 54));
        o_Sulfur.setMinimumSize(new java.awt.Dimension(54, 54));
        o_Sulfur.setPreferredSize(new java.awt.Dimension(80, 80));
        o_Sulfur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_SulfurActionPerformed(evt);
            }
        });

        h_Flourine.setBackground(new java.awt.Color(255, 255, 153));
        h_Flourine.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        h_Flourine.setText("Fl");
        h_Flourine.setMaximumSize(new java.awt.Dimension(54, 54));
        h_Flourine.setMinimumSize(new java.awt.Dimension(54, 54));
        h_Flourine.setPreferredSize(new java.awt.Dimension(80, 80));
        h_Flourine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_FlourineActionPerformed(evt);
            }
        });

        h_Chlorine.setBackground(new java.awt.Color(255, 255, 153));
        h_Chlorine.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        h_Chlorine.setText("Cl");
        h_Chlorine.setMaximumSize(new java.awt.Dimension(54, 54));
        h_Chlorine.setMinimumSize(new java.awt.Dimension(54, 54));
        h_Chlorine.setPreferredSize(new java.awt.Dimension(80, 80));
        h_Chlorine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_ChlorineActionPerformed(evt);
            }
        });

        ng_Argon.setBackground(new java.awt.Color(102, 255, 204));
        ng_Argon.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        ng_Argon.setText("Ar");
        ng_Argon.setMaximumSize(new java.awt.Dimension(54, 54));
        ng_Argon.setMinimumSize(new java.awt.Dimension(54, 54));
        ng_Argon.setPreferredSize(new java.awt.Dimension(80, 80));
        ng_Argon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ng_ArgonActionPerformed(evt);
            }
        });

        ng_Neon.setBackground(new java.awt.Color(102, 255, 204));
        ng_Neon.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        ng_Neon.setText("Ne");
        ng_Neon.setMaximumSize(new java.awt.Dimension(54, 54));
        ng_Neon.setMinimumSize(new java.awt.Dimension(54, 54));
        ng_Neon.setPreferredSize(new java.awt.Dimension(80, 80));
        ng_Neon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ng_NeonActionPerformed(evt);
            }
        });

        pt_Aluminium.setBackground(new java.awt.Color(204, 204, 204));
        pt_Aluminium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        pt_Aluminium.setText("Al");
        pt_Aluminium.setMaximumSize(new java.awt.Dimension(54, 54));
        pt_Aluminium.setMinimumSize(new java.awt.Dimension(54, 54));
        pt_Aluminium.setPreferredSize(new java.awt.Dimension(80, 80));
        pt_Aluminium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt_AluminiumActionPerformed(evt);
            }
        });

        ng_Helium.setBackground(new java.awt.Color(102, 255, 204));
        ng_Helium.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        ng_Helium.setText("He");
        ng_Helium.setMaximumSize(new java.awt.Dimension(54, 54));
        ng_Helium.setMinimumSize(new java.awt.Dimension(54, 54));
        ng_Helium.setPreferredSize(new java.awt.Dimension(80, 80));
        ng_Helium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ng_HeliumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pt_Aluminium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m_Silicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(o_Phosphorus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(m_Boron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(o_Carbon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(o_Nitrogen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(o_Oxygen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(h_Flourine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ng_Neon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(o_Sulfur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(h_Chlorine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ng_Argon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ng_Helium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ng_Helium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_Boron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o_Carbon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o_Nitrogen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o_Oxygen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h_Flourine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ng_Neon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_Silicon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o_Phosphorus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o_Sulfur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h_Chlorine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ng_Argon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_Aluminium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Element Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bookman Old Style", 0, 18))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 28)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("High School Periodic Table");

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 250));

        ng_NobleGases.setBackground(new java.awt.Color(102, 255, 204));
        ng_NobleGases.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        ng_NobleGases.setText("Noble Gases");
        ng_NobleGases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ng_NobleGasesActionPerformed(evt);
            }
        });

        pt_PostTransitionMetals.setBackground(new java.awt.Color(204, 204, 204));
        pt_PostTransitionMetals.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pt_PostTransitionMetals.setText("Post-transition Metals");
        pt_PostTransitionMetals.setMaximumSize(new java.awt.Dimension(200, 40));
        pt_PostTransitionMetals.setMinimumSize(new java.awt.Dimension(200, 40));
        pt_PostTransitionMetals.setPreferredSize(new java.awt.Dimension(200, 40));
        pt_PostTransitionMetals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt_PostTransitionMetalsActionPerformed(evt);
            }
        });

        re_RareEarthMetals.setBackground(new java.awt.Color(0, 204, 204));
        re_RareEarthMetals.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        re_RareEarthMetals.setText("Rare-earth Metals");
        re_RareEarthMetals.setMaximumSize(new java.awt.Dimension(200, 40));
        re_RareEarthMetals.setMinimumSize(new java.awt.Dimension(200, 40));
        re_RareEarthMetals.setPreferredSize(new java.awt.Dimension(200, 40));
        re_RareEarthMetals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re_RareEarthMetalsActionPerformed(evt);
            }
        });

        o_OtherNonMetals.setBackground(new java.awt.Color(0, 51, 255));
        o_OtherNonMetals.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        o_OtherNonMetals.setText("Other Non-metals");
        o_OtherNonMetals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_OtherNonMetalsActionPerformed(evt);
            }
        });

        m_Metalliods.setBackground(new java.awt.Color(153, 153, 0));
        m_Metalliods.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        m_Metalliods.setText("Metalloids");
        m_Metalliods.setMaximumSize(new java.awt.Dimension(110, 40));
        m_Metalliods.setMinimumSize(new java.awt.Dimension(110, 40));
        m_Metalliods.setPreferredSize(new java.awt.Dimension(110, 40));
        m_Metalliods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_MetalliodsActionPerformed(evt);
            }
        });

        h_Halogens.setBackground(new java.awt.Color(255, 255, 153));
        h_Halogens.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        h_Halogens.setText("Halogens");
        h_Halogens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_HalogensActionPerformed(evt);
            }
        });

        am_AlkaliMetals.setBackground(new java.awt.Color(255, 102, 102));
        am_AlkaliMetals.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        am_AlkaliMetals.setText("Alkali Metals");
        am_AlkaliMetals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am_AlkaliMetalsActionPerformed(evt);
            }
        });

        ae_AlkaliEarthMetals.setBackground(new java.awt.Color(255, 204, 153));
        ae_AlkaliEarthMetals.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        ae_AlkaliEarthMetals.setText("Alkali Earth Metals");
        ae_AlkaliEarthMetals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae_AlkaliEarthMetalsActionPerformed(evt);
            }
        });

        t_TransitionMetals.setBackground(new java.awt.Color(255, 153, 153));
        t_TransitionMetals.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        t_TransitionMetals.setText("Transition Metals");
        t_TransitionMetals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_TransitionMetalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ae_AlkaliEarthMetals, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(am_AlkaliMetals, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_TransitionMetals, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(o_OtherNonMetals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m_Metalliods, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(h_Halogens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pt_PostTransitionMetals, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ng_NobleGases, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(re_RareEarthMetals, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(am_AlkaliMetals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ng_NobleGases, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(m_Metalliods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pt_PostTransitionMetals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(o_OtherNonMetals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ae_AlkaliEarthMetals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(re_RareEarthMetals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t_TransitionMetals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(h_Halogens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        elementBox.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        elementBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select element", "Aluminium", "Antimony", "Argon", "Arsenic", "Astatine", "Barium", "Beryllium", "Bismuth", "Bohrium", "Boron", "Bromine", "Cadmium", "Calcium", "Carbon", "Caesium", "Chlorine", "Chromium", "Colbalt", "Copernicium", "Copper", "Darmstadium", "Dubnium", "Flerovium", "Flourine", "Francium", "Gallium", "Germanium", "Gold", "Hafnium", "Hassmium", "Helium", "Hydrogen", "Indium", "Iodine", "Iridium", "Iron", "Krypton", "Lead", "Lithium", "Livermorium", "Magnesium", "Manganese", "Meitnerium", "Mercury", "Molybdenum", "Moscovium", "Neon", "Nickel", "Nihonium", "Niobrium", "Nitrogen", "Oganesson", "Osmium", "Oxygen", "Palladium", "Phosphorus", "Platinum", "Polonium", "Potassium", "Radium", "Radon", "Rhenium", "Rhodium", "Roentgenium", "Rubidium", "Ruthenium", "Rutherfordium", "Scandanium", "Seaborgium", "Selenium", "Silicon", "Silver", "Sodium", "Stronium", "Sulfur", "Tantalum", "Technetium", "Thallium", "Tin", "Titanium", "Tungsten", "Vanadium", "Xenon", "Yttrium", "Zinc", "Zirconium"}));
        elementBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementBoxActionPerformed(evt);
            }
        });

        groupBox.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        groupBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select group", "Alkali Metals", "Alkaline Earth Metals", "Halogens", "Metalloids", "Noble Gases", "Other Non-Metals", "Post-transition Metals", "Rare-earth Metals", "Transition Metals", }));
        groupBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupBoxActionPerformed(evt);
            }
        });

        homePageButton.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        homePageButton.setText("Home Page");
        homePageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(homePageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(imglabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(elementBox, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(groupBox, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(midPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(homePageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(midPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elementBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imglabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//All ActionPerformed Methods below set the text of the Element Summary Label to their corresponding element
    private void t_DubniumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_DubniumActionPerformed
        jLabel4.setText("<html> Element name: Dubnium"
                + "<br> Atomic Symbol: Db"
                + "<br> Atomic number: 105"
                + "<br> Atomic weight: 268.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>5</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Dubnium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_DubniumActionPerformed

    private void t_ChromiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ChromiumActionPerformed
        jLabel4.setText("<html> Element name: Chromium"
                + "<br> Atomic Symbol: Cr"
                + "<br> Atomic number: 24 "
                + "<br> Atomic weight: 51.996"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>4</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Chromium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_ChromiumActionPerformed

    private void re_RareEarth1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re_RareEarth1ActionPerformed
        jLabel4.setText("<html> Lanthanides are not used in high school chemistry"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource(""));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_re_RareEarth1ActionPerformed

    private void t_MolybdenumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_MolybdenumActionPerformed
        jLabel4.setText("<html> Element name: Molybdenum"
                + "<br> Atomic Symbol: Mo"
                + "<br> Atomic number: 42"
                + "<br> Atomic weight: 95.95"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>4</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Molybdenum.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_MolybdenumActionPerformed

    private void h_BromineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_BromineActionPerformed
        jLabel4.setText("<html> Element name: Bromine"
                + "<br> Atomic Symbol: Br"
                + "<br> Atomic number: 35"
                + "<br> Atomic weight: 79.904"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>5</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Bromine.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_h_BromineActionPerformed

    private void ng_HeliumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ng_HeliumActionPerformed
                
        jLabel4.setText("<html> Element name: Helium"
                + "<br> Atomic Symbol: He"
                + "<br> Atomic number: 2"
                + "<br> Atomic weight: 4.003"
                + "<br> Electron configuration:1s<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Helium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ng_HeliumActionPerformed

    private void m_BoronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_BoronActionPerformed
        jLabel4.setText("<html> Element name: Boron"
                + "<br> Atomic Symbol: B"
                + "<br> Atomic number: 5 "
                + "<br> Atomic weight: 10.81"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Boron.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_m_BoronActionPerformed

    private void o_CarbonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_CarbonActionPerformed
        jLabel4.setText("<html> Element name: Carbon"
                + "<br> Atomic Symbol: C"
                + "<br> Atomic number: 6 "
                + "<br> Atomic weight: 12.011"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Carbon.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_o_CarbonActionPerformed

    private void o_NitrogenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_NitrogenActionPerformed
        jLabel4.setText("<html> Element name: Nitrogen"
                + "<br> Atomic Symbol: N"
                + "<br> Atomic number: 7 "
                + "<br> Atomic weight: 14.007"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>3</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Nitrogen.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_o_NitrogenActionPerformed

    private void pt_AluminiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt_AluminiumActionPerformed
        jLabel4.setText("<html> Element name: Aluminium"
                + "<br> Atomic Symbol: Al"
                + "<br> Atomic number: 13 "
                + "<br> Atomic weight: 26.982"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Aluminium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_pt_AluminiumActionPerformed

    private void m_SiliconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_SiliconActionPerformed
        jLabel4.setText("<html> Element name: Silicon"
                + "<br> Atomic Symbol: Si"
                + "<br> Atomic number: 14 "
                + "<br> Atomic weight: 28.085"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Silicon.gif"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_m_SiliconActionPerformed

    private void o_PhosphorusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_PhosphorusActionPerformed
        jLabel4.setText("<html> Element name: Phosphorus"
                + "<br> Atomic Symbol: P"
                + "<br> Atomic number: 15"
                + "<br> Atomic weight: 30.974"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>3</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Phosphorus.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_o_PhosphorusActionPerformed

    private void o_OxygenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_OxygenActionPerformed
        jLabel4.setText("<html> Element name: Oxygen"
                + "<br> Atomic Symbol: O"
                + "<br> Atomic number: 8 "
                + "<br> Atomic weight: 15.999"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>4</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Oxygen.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_o_OxygenActionPerformed

    private void o_SulfurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_SulfurActionPerformed
        jLabel4.setText("<html> Element name: Sulfur"
                + "<br> Atomic Symbol: S"
                + "<br> Atomic number: 16 "
                + "<br> Atomic weight: 32.06"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>4</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Sulfur.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_o_SulfurActionPerformed

    private void h_FlourineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_FlourineActionPerformed
        jLabel4.setText("<html> Element name: Fluorine"
                + "<br> Atomic Symbol: F"
                + "<br> Atomic number: 9"
                + "<br> Atomic weight: 18.998"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>5</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Flourine.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_h_FlourineActionPerformed

    private void ng_NeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ng_NeonActionPerformed
        jLabel4.setText("<html> Element name: Neon"
                + "<br> Atomic Symbol: Ne"
                + "<br> Atomic number: 10"
                + "<br> Atomic weight: 20.180"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Neon.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ng_NeonActionPerformed

    private void ng_ArgonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ng_ArgonActionPerformed
        jLabel4.setText("<html> Element name: Argon"
                + "<br> Atomic Symbol: Ar"
                + "<br> Atomic number: 18"
                + "<br> Atomic weight: 39.948"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Argon.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ng_ArgonActionPerformed

    private void h_ChlorineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_ChlorineActionPerformed
        jLabel4.setText("<html> Element name: Chlorine"
                + "<br> Atomic Symbol: Cl"
                + "<br> Atomic number: 17"
                + "<br> Atomic weight: 35.45"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>5</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Chlorine.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_h_ChlorineActionPerformed

    private void am_LithiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am_LithiumActionPerformed
        jLabel4.setText("<html> Element name: Lithium"
                + "<br> Atomic Symbol: Li"
                + "<br> Atomic number: 3"
                + "<br> Atomic weight: 6.941"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Lithium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_am_LithiumActionPerformed

    private void t_TitaniumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_TitaniumActionPerformed
        jLabel4.setText("<html> Element name: Titanium"
                + "<br> Atomic Symbol: Ti"
                + "<br> Atomic number: 22"
                + "<br> Atomic weight: 47.867"
                + "<br> Electron configuration:1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Titanium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_TitaniumActionPerformed

    private void o_HydrogenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_HydrogenActionPerformed
        jLabel4.setText("<html> Element name: Hydrogen"
                + "<br> Atomic Symbol: H"
                + "<br> Atomic number: 1 "
                + "<br> Atomic weight: 1.008"
                + "<br> Electron configuration: 1s<sup>1</sup>"
                + "</html>");
    ImageIcon ico = new ImageIcon(getClass().getResource("Hydrogen.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_o_HydrogenActionPerformed

    private void pt_IndiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt_IndiumActionPerformed
        jLabel4.setText("<html> Element name: Indium"
                + "<br> Atomic Symbol: In"
                + "<br> Atomic number: 49"
                + "<br> Atomic weight: 114.820"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Indium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_pt_IndiumActionPerformed

    private void pt_LeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt_LeadActionPerformed
        jLabel4.setText("<html> Element name: Lead"
                + "<br> Atomic Symbol: Pb"
                + "<br> Atomic number: 82"
                + "<br> Atomic weight: 207.200"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>4</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Lead.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_pt_LeadActionPerformed

    private void pt_NihoniumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt_NihoniumActionPerformed
        jLabel4.setText("<html> Element name: Nihonium"
                + "<br> Atomic Symbol: Nh"
                + "<br> Atomic number: 113"
                + "<br> Atomic weight: 286.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>10</sup> 7p<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Nihonium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_pt_NihoniumActionPerformed

    private void ng_KryptonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ng_KryptonActionPerformed
        jLabel4.setText("<html> Element name: Krypton"
                + "<br> Atomic Symbol: Kr"
                + "<br> Atomic number: 36"
                + "<br> Atomic weight: 83.798"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Krypton.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ng_KryptonActionPerformed

    private void am_RubidiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am_RubidiumActionPerformed
        jLabel4.setText("<html> Element name: Rubidium"
                + "<br> Atomic Symbol: Rb"
                + "<br> Atomic number: 37"
                + "<br> Atomic weight: 85.468"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Rubidium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_am_RubidiumActionPerformed

    private void t_ManganeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ManganeseActionPerformed
        jLabel4.setText("<html> Element name: Manganese"
                + "<br> Atomic Symbol: Mn"
                + "<br> Atomic number: 25 "
                + "<br> Atomic weight: 54.938"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>5</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Manganese.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_ManganeseActionPerformed

    private void ae_BerylliumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae_BerylliumActionPerformed
        jLabel4.setText("<html> Element name: Berylium"
                + "<br> Atomic Symbol: Be"
                + "<br> Atomic number: 4 "
                + "<br> Atomic weight: 9.0122"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Berylium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ae_BerylliumActionPerformed

    private void am_SodiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am_SodiumActionPerformed
        jLabel4.setText("<html> Element name: Soduim"
                + "<br> Atomic Symbol: Na"
                + "<br> Atomic number: 11 "
                + "<br> Atomic weight: 22.990"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Sodium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_am_SodiumActionPerformed

    private void ae_MagnesiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae_MagnesiumActionPerformed
        jLabel4.setText("<html> Element name: Magnesium"
                + "<br> Atomic Symbol: Mg"
                + "<br> Atomic number: 12 "
                + "<br> Atomic weight: 24.305"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Magnesium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ae_MagnesiumActionPerformed

    private void am_PotassiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am_PotassiumActionPerformed
        jLabel4.setText("<html> Element name: Potassium"
                + "<br> Atomic Symbol: K"
                + "<br> Atomic number: 19 "
                + "<br> Atomic weight: 39.098"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Potassium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_am_PotassiumActionPerformed

    private void ae_CalciumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae_CalciumActionPerformed
        jLabel4.setText("<html> Element name: Calcium"
                + "<br> Atomic Symbol: Ca"
                + "<br> Atomic number: 20 "
                + "<br> Atomic weight: 40.078"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Calcium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ae_CalciumActionPerformed

    private void t_ScandaniumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ScandaniumActionPerformed
        jLabel4.setText("<html> Element name: Scandium"
                + "<br> Atomic Symbol: Sc"
                + "<br> Atomic number: 21 "
                + "<br> Atomic weight: 44.956"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Scandium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_ScandaniumActionPerformed

    private void t_VanadiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_VanadiumActionPerformed
        jLabel4.setText("<html> Element name: Vanadium"
                + "<br> Atomic Symbol: V"
                + "<br> Atomic number: 23 "
                + "<br> Atomic weight: 50.942"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>3</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Vanadium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_VanadiumActionPerformed

    private void t_IronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_IronActionPerformed
        jLabel4.setText("<html> Element name: Iron"
                + "<br> Atomic Symbol: Fe"
                + "<br> Atomic number: 26 "
                + "<br> Atomic weight: 55.845"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>6</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Iron.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_IronActionPerformed

    private void t_CobaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_CobaltActionPerformed
        jLabel4.setText("<html> Element name: Cobalt"
                + "<br> Atomic Symbol: Co"
                + "<br> Atomic number: 27 "
                + "<br> Atomic weight: 58.933"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>7</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Cobalt.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_CobaltActionPerformed

    private void t_NickelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_NickelActionPerformed
        jLabel4.setText("<html> Element name: Nickel"
                + "<br> Atomic Symbol: Ni"
                + "<br> Atomic number: 28"
                + "<br> Atomic weight: 58.693"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>8</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Nickel.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_NickelActionPerformed

    private void t_CopperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_CopperActionPerformed
        jLabel4.setText("<html> Element name: Copper"
                + "<br> Atomic Symbol: Cu"
                + "<br> Atomic number: 29"
                + "<br> Atomic weight: 63.546"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>9</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Copper.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_CopperActionPerformed

    private void t_ZincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ZincActionPerformed
        jLabel4.setText("<html> Element name: Zinc"
                + "<br> Atomic Symbol: Zn"
                + "<br> Atomic number: 30"
                + "<br> Atomic weight: 65.38"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Zinc.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_ZincActionPerformed

    private void pt_GalliumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt_GalliumActionPerformed
        jLabel4.setText("<html> Element name: Gallium"
                + "<br> Atomic Symbol: Ga"
                + "<br> Atomic number: 31"
                + "<br> Atomic weight: 69.723"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Gallium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_pt_GalliumActionPerformed

    private void m_GermaniumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_GermaniumActionPerformed
        jLabel4.setText("<html> Element name: Germanium"
                + "<br> Atomic Symbol: Ge"
                + "<br> Atomic number: 32"
                + "<br> Atomic weight: 72.630"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Germanium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_m_GermaniumActionPerformed

    private void m_ArsenicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_ArsenicActionPerformed
        jLabel4.setText("<html> Element name: Arsenic"
                + "<br> Atomic Symbol: As"
                + "<br> Atomic number: 33"
                + "<br> Atomic weight: 74.922"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>3</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Arsenic.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_m_ArsenicActionPerformed

    private void o_SeleniumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_SeleniumActionPerformed
        jLabel4.setText("<html> Element name: Selenium"
                + "<br> Atomic Symbol: Se"
                + "<br> Atomic number: 34"
                + "<br> Atomic weight: 78.971"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>4</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Selenium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_o_SeleniumActionPerformed

    private void ae_StroniumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae_StroniumActionPerformed
        jLabel4.setText("<html> Element name: Strontium"
                + "<br> Atomic Symbol: Sr"
                + "<br> Atomic number: 38"
                + "<br> Atomic weight: 87.620"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Strontium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ae_StroniumActionPerformed

    private void t_YttriumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_YttriumActionPerformed
        jLabel4.setText("<html> Element name: Yttrium"
                + "<br> Atomic Symbol: Y"
                + "<br> Atomic number: 39"
                + "<br> Atomic weight: 88.906"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Yttrium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_YttriumActionPerformed

    private void t_ZirconiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ZirconiumActionPerformed
        jLabel4.setText("<html> Element name: Zirconium"
                + "<br> Atomic Symbol: Zr"
                + "<br> Atomic number: 40"
                + "<br> Atomic weight: 91.224"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Zirconium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_ZirconiumActionPerformed

    private void t_NiobriumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_NiobriumActionPerformed
        jLabel4.setText("<html> Element name: Niobium"
                + "<br> Atomic Symbol: Nb"
                + "<br> Atomic number: 41"
                + "<br> Atomic weight: 92.906"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>3</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Niobium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_NiobriumActionPerformed

    private void t_TechnetiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_TechnetiumActionPerformed
        jLabel4.setText("<html> Element name: Technetium"
                + "<br> Atomic Symbol: Tc"
                + "<br> Atomic number: 43"
                + "<br> Atomic weight: 98.000"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>5</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Technetium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_TechnetiumActionPerformed

    private void t_RutheniumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_RutheniumActionPerformed
        jLabel4.setText("<html> Element name: Ruthenium"
                + "<br> Atomic Symbol: Ru"
                + "<br> Atomic number: 44"
                + "<br> Atomic weight: 101.070"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>6</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Ruthenium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_RutheniumActionPerformed

    private void t_RhodiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_RhodiumActionPerformed
        jLabel4.setText("<html> Element name: Rhodium"
                + "<br> Atomic Symbol: Rh"
                + "<br> Atomic number: 45"
                + "<br> Atomic weight: 102.910"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>7</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Rhodium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_RhodiumActionPerformed

    private void t_PalladiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_PalladiumActionPerformed
        jLabel4.setText("<html> Element name: Palladium"
                + "<br> Atomic Symbol: Pd"
                + "<br> Atomic number: 46"
                + "<br> Atomic weight: 106.420"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>8</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Palladium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_PalladiumActionPerformed

    private void t_SilverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_SilverActionPerformed
        jLabel4.setText("<html> Element name: Silver"
                + "<br> Atomic Symbol: Ag"
                + "<br> Atomic number: 47"
                + "<br> Atomic weight: 107.807"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>9</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Silver.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_SilverActionPerformed

    private void t_CadmiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_CadmiumActionPerformed
        jLabel4.setText("<html> Element name: Cadmium"
                + "<br> Atomic Symbol: Cd"
                + "<br> Atomic number: 48"
                + "<br> Atomic weight: 112.410"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Cadmium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_CadmiumActionPerformed

    private void pt_TinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt_TinActionPerformed
        jLabel4.setText("<html> Element name: Tin"
                + "<br> Atomic Symbol: Sn"
                + "<br> Atomic number: 50"
                + "<br> Atomic weight: 118.710"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Tin.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_pt_TinActionPerformed

    private void m_AntimonyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_AntimonyActionPerformed
        jLabel4.setText("<html> Element name: Antimony"
                + "<br> Atomic Symbol: Sb"
                + "<br> Atomic number: 51"
                + "<br> Atomic weight: 121.760"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>3</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Antimony.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_m_AntimonyActionPerformed

    private void m_TelleriumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_TelleriumActionPerformed
        jLabel4.setText("<html> Element name: Tellurium"
                + "<br> Atomic Symbol: Te"
                + "<br> Atomic number: 52"
                + "<br> Atomic weight: 127.600"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>4</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Tellurium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_m_TelleriumActionPerformed

    private void h_IodineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_IodineActionPerformed
        jLabel4.setText("<html> Element name: Iodine"
                + "<br> Atomic Symbol: I"
                + "<br> Atomic number: 53"
                + "<br> Atomic weight: 126.900"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>5</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Iodine.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_h_IodineActionPerformed

    private void ng_XenonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ng_XenonActionPerformed
        jLabel4.setText("<html> Element name: Xenon"
                + "<br> Atomic Symbol: Xe"
                + "<br> Atomic number: 54"
                + "<br> Atomic weight: 131.290"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Xenon.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ng_XenonActionPerformed

    private void am_CaesiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am_CaesiumActionPerformed
        jLabel4.setText("<html> Element name: Caesium"
                + "<br> Atomic Symbol: Cs"
                + "<br> Atomic number: 55"
                + "<br> Atomic weight: 132.910"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Cesium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_am_CaesiumActionPerformed

    private void ae_BariumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae_BariumActionPerformed
        jLabel4.setText("<html> Element name: Barium"
                + "<br> Atomic Symbol: Ba"
                + "<br> Atomic number: 56"
                + "<br> Atomic weight: 137.333"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Barium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ae_BariumActionPerformed

    private void t_HafniumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_HafniumActionPerformed
        jLabel4.setText("<html> Element name: Hafnium"
                + "<br> Atomic Symbol: Hf"
                + "<br> Atomic number: 72"
                + "<br> Atomic weight: 178.490"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>4</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Hafnium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_HafniumActionPerformed

    private void t_TantalumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_TantalumActionPerformed
        jLabel4.setText("<html> Element name: Tantalum"
                + "<br> Atomic Symbol: Ta"
                + "<br> Atomic number: 73"
                + "<br> Atomic weight: 180.950"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>5</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Tantalum.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_TantalumActionPerformed

    private void t_TungstenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_TungstenActionPerformed
        jLabel4.setText("<html> Element name: Tungsten"
                + "<br> Atomic Symbol: W"
                + "<br> Atomic number: 74"
                + "<br> Atomic weight: 183.840"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>6</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Tungsten.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_TungstenActionPerformed

    private void t_RheniumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_RheniumActionPerformed
        jLabel4.setText("<html> Element name: Rhenium"
                + "<br> Atomic Symbol: Re"
                + "<br> Atomic number: 75"
                + "<br> Atomic weight: 186.210"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>7</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Rhenium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_RheniumActionPerformed

    private void t_OsmiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_OsmiumActionPerformed
        jLabel4.setText("<html> Element name: Osmium"
                + "<br> Atomic Symbol: Os"
                + "<br> Atomic number: 76"
                + "<br> Atomic weight: 190.230"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>8</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Osmium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_OsmiumActionPerformed

    private void t_IridiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_IridiumActionPerformed
        jLabel4.setText("<html> Element name: Iridium"
                + "<br> Atomic Symbol: Ir"
                + "<br> Atomic number: 77"
                + "<br> Atomic weight: 192.220"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>9</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Iridium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_IridiumActionPerformed

    private void t_PlatinumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_PlatinumActionPerformed
        jLabel4.setText("<html> Element name: Platinum"
                + "<br> Atomic Symbol: Pt"
                + "<br> Atomic number: 78"
                + "<br> Atomic weight: 195.080"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Platinum.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_PlatinumActionPerformed

    private void t_GoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_GoldActionPerformed
        jLabel4.setText("<html> Element name: Gold"
                + "<br> Atomic Symbol: Au"
                + "<br> Atomic number: 79"
                + "<br> Atomic weight: 196.970"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Gold.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_GoldActionPerformed

    private void t_MercuryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_MercuryActionPerformed
        jLabel4.setText("<html> Element name: Mercury"
                + "<br> Atomic Symbol: Hg"
                + "<br> Atomic number: 80"
                + "<br> Atomic weight: 200.59"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Mercury.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_MercuryActionPerformed

    private void pt_ThalliumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt_ThalliumActionPerformed
        jLabel4.setText("<html> Element name: Thallium"
                + "<br> Atomic Symbol: Tl"
                + "<br> Atomic number: 81"
                + "<br> Atomic weight: 204.38"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>3</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Thallium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_pt_ThalliumActionPerformed

    private void pt_BismuthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt_BismuthActionPerformed
        jLabel4.setText("<html> Element name: Bismuth"
                + "<br> Atomic Symbol: Bi"
                + "<br> Atomic number: 83"
                + "<br> Atomic weight: 208.98"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>5</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Bismuth.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_pt_BismuthActionPerformed

    private void m_PoloniumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_PoloniumActionPerformed
        jLabel4.setText("<html> Element name: Polonium"
                + "<br> Atomic Symbol: Po"
                + "<br> Atomic number: 84"
                + "<br> Atomic weight: 209.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Polonium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_m_PoloniumActionPerformed

    private void h_AstatineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_AstatineActionPerformed
        jLabel4.setText("<html> Element name: Astatine"
                + "<br> Atomic Symbol: At"
                + "<br> Atomic number: 86"
                + "<br> Atomic weight: 210.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Astatine.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_h_AstatineActionPerformed

    private void ng_RadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ng_RadonActionPerformed
        jLabel4.setText("<html> Element name: Radon"
                + "<br> Atomic Symbol: Rn"
                + "<br> Atomic number: 86"
                + "<br> Atomic weight: 222.000"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Radon.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ng_RadonActionPerformed

    private void ae_RadiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae_RadiumActionPerformed
        jLabel4.setText("<html> Element name: Radium"
                + "<br> Atomic Symbol: Ra"
                + "<br> Atomic number: 88"
                + "<br> Atomic weight: 226.000"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Radium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ae_RadiumActionPerformed

    private void am_FranciumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am_FranciumActionPerformed
        jLabel4.setText("<html> Element name: Francium"
                + "<br> Atomic Symbol: Fr"
                + "<br> Atomic number: 87"
                + "<br> Atomic weight: 223.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Francium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_am_FranciumActionPerformed

    private void re_RareEarth2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re_RareEarth2ActionPerformed
        jLabel4.setText("<html> Actenides are not used in high school chemistry"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource(""));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_re_RareEarth2ActionPerformed

    private void t_RutherfordiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_RutherfordiumActionPerformed
        jLabel4.setText("<html> Element name: Rutherfordium"
                + "<br> Atomic Symbol: Rf"
                + "<br> Atomic number: 104"
                + "<br> Atomic weight: 267.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>3</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Rutherfordium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_RutherfordiumActionPerformed

    private void t_SeaborgiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_SeaborgiumActionPerformed
        jLabel4.setText("<html> Element name: Seaborgium"
                + "<br> Atomic Symbol: Sg"
                + "<br> Atomic number: 106"
                + "<br> Atomic weight: 269.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>5</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Seaborgium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_SeaborgiumActionPerformed

    private void t_BohriumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_BohriumActionPerformed
        jLabel4.setText("<html> Element name: Bohrium"
                + "<br> Atomic Symbol: Bh"
                + "<br> Atomic number: 107"
                + "<br> Atomic weight: 270.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>6</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Bohrium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_BohriumActionPerformed

    private void t_HassmiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_HassmiumActionPerformed
        jLabel4.setText("<html> Element name: Hassium"
                + "<br> Atomic Symbol: Hs"
                + "<br> Atomic number: 108"
                + "<br> Atomic weight: 270.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>7</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Hassium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_HassmiumActionPerformed

    private void t_MeitneriumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_MeitneriumActionPerformed
        jLabel4.setText("<html> Element name: Meitnerium"
                + "<br> Atomic Symbol: Mt"
                + "<br> Atomic number: 109"
                + "<br> Atomic weight: 278.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>8</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Meitnerium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_MeitneriumActionPerformed

    private void t_DarmstadiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_DarmstadiumActionPerformed
        jLabel4.setText("<html> Element name: Darmstadium"
                + "<br> Atomic Symbol: Ds"
                + "<br> Atomic number: 110"
                + "<br> Atomic weight: 281.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>9</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Darmstadium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_DarmstadiumActionPerformed

    private void t_RoentgeniumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_RoentgeniumActionPerformed
        jLabel4.setText("<html> Element name: Roentgenium"
                + "<br> Atomic Symbol: Rg"
                + "<br> Atomic number: 282"
                + "<br> Atomic weight: 282.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>10</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Roentgenium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_RoentgeniumActionPerformed

    private void t_CoperniciumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_CoperniciumActionPerformed
        jLabel4.setText("<html> Element name: Copernicium"
                + "<br> Atomic Symbol: Cn"
                + "<br> Atomic number: 112"
                + "<br> Atomic weight: 285.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>10</sup> 7p<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Copernicium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_CoperniciumActionPerformed

    private void pt_FleroviumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt_FleroviumActionPerformed
        jLabel4.setText("<html> Element name: Flerovium"
                + "<br> Atomic Symbol: Fl"
                + "<br> Atomic number: 114"
                + "<br> Atomic weight: 289.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>10</sup> 7p<sup>4</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Flerovium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_pt_FleroviumActionPerformed

    private void pt_MoscoviumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt_MoscoviumActionPerformed
        jLabel4.setText("<html> Element name: Moscovium"
                + "<br> Atomic Symbol: Mc"
                + "<br> Atomic number: 115"
                + "<br> Atomic weight: 290.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>10</sup> 7p<sup>5</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Moscovium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_pt_MoscoviumActionPerformed

    private void pt_LivermoniumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt_LivermoniumActionPerformed
        jLabel4.setText("<html> Element name: Livermorium"
                + "<br> Atomic Symbol: Lv"
                + "<br> Atomic number: 116"
                + "<br> Atomic weight: 293.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>10</sup> 7p<sup>6</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Livermorium.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_pt_LivermoniumActionPerformed

    private void h_TennessineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_TennessineActionPerformed
        jLabel4.setText("<html> Element name: Tennessine"
                + "<br> Atomic Symbol: Ts"
                + "<br> Atomic number: 117"
                + "<br> Atomic weight: 294.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>10</sup> 7p<sup>6</sup> 6f<sup>1</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Tennessine.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_h_TennessineActionPerformed

    private void ng_OganessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ng_OganessonActionPerformed
        jLabel4.setText("<html> Element name: Oganesson"
                + "<br> Atomic Symbol: Og"
                + "<br> Atomic number: 118"
                + "<br> Atomic weight: 294.00"
                + "<br> Electron configuration: 1s<sup>2</sup> 2s<sup>2</sup> 2p<sup>6</sup> 3s<sup>2</sup> 3p<sup>6</sup> 4s<sup>2</sup> 3d<sup>10</sup> 4p<sup>6</sup> 5s<sup>2</sup> 4d<sup>10</sup> 5p<sup>6</sup> 6s<sup>2</sup> 4f<sup>1</sup>4 5d<sup>10</sup> 6p<sup>6</sup> 7s<sup>2</sup> 5f<sup>1</sup>4 6d<sup>10</sup> 7p<sup>6</sup> 6f<sup>2</sup>"
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource("Oganesson.png"));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ng_OganessonActionPerformed

    private void am_AlkaliMetalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am_AlkaliMetalsActionPerformed
        jLabel4.setText("<html> Element group: Alkali Metals"
                + "<br> Alkali metals are in the first column."
                + "<br> They bond well with halogens because they have only 1 valence electron."
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource(""));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_am_AlkaliMetalsActionPerformed

    private void ae_AlkaliEarthMetalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae_AlkaliEarthMetalsActionPerformed
        jLabel4.setText("<html> Element group: Alkali Earth Metals"
                + "<br> Alkali Earth metals are in the second column."
                + "<br> They have low densities, melting points, and boiling points."
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource(""));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ae_AlkaliEarthMetalsActionPerformed

    private void t_TransitionMetalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_TransitionMetalsActionPerformed
        jLabel4.setText("<html> Element group: Transition Metals"
                + "<br> Transition metals are in columns 3-12."
                + "<br> They usually have high densities, melting points, and boiling points, and form colored compounds."
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource(""));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_t_TransitionMetalsActionPerformed

    private void m_MetalliodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_MetalliodsActionPerformed
        jLabel4.setText("<html> Element group: Metalloids"
                + "<br> Metalloid are between the transition metals and the non-metals."
                + "<br> They are semi-conductors of heat and electricity."
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource(""));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_m_MetalliodsActionPerformed

    private void o_OtherNonMetalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_OtherNonMetalsActionPerformed
        // TODO add your handling code here:
        jLabel4.setText("<html> Element group: Other non-metals"
                + "<br> They exist in different states at room temperature."
                + "<br> They are the worst conductors of heat and electricity."
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource(""));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_o_OtherNonMetalsActionPerformed

    private void h_HalogensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_HalogensActionPerformed
        // TODO add your handling code here:
        jLabel4.setText("<html> Element group: Halogens"
                + "<br> The group 7 elements."
                + "<br> The name Halogen aka \"salt former\" is derieved from greek roots."
                + "<br> \"Hal\" meaning salt and \"gen\" meaning \"to form\"."
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource(""));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_h_HalogensActionPerformed

    private void ng_NobleGasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ng_NobleGasesActionPerformed
        // TODO add your handling code here:
        jLabel4.setText("<html> Element group: Noble Gases"
                + "<br> Noble Gases are the group 8 elements."
                + "<br> They have the lowest chemical reactivity because if their full outer shell."
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource(""));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_ng_NobleGasesActionPerformed

    private void re_RareEarthMetalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re_RareEarthMetalsActionPerformed
        // TODO add your handling code here:
        jLabel4.setText("<html> Element group: Rare-earth metals"
                + "<br> They are silver, silvery-white, or gray metals."
                + "<br> They are used in higher level math."
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource(""));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_re_RareEarthMetalsActionPerformed

    private void pt_PostTransitionMetalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt_PostTransitionMetalsActionPerformed
        // TODO add your handling code here:
        jLabel4.setText("<html> Element group: Post-transition metals"
                + "<br> They are also known as the poor metals."
                + "<br> They are used in higher level math."
                + "</html>");
        ImageIcon ico = new ImageIcon(getClass().getResource(""));
        imglabel.setIcon(ico);
        validate();
    }//GEN-LAST:event_pt_PostTransitionMetalsActionPerformed

    private void elementBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementBoxActionPerformed
        // TODO add your handling code here:
                String element = (String) elementBox.getSelectedItem();
        switch (element){
            case "Select element":
            for (int i = 0; i < button.length; i++) {
                button[i].setEnabled(true);
            }
            break;
            case "Aluminium":
            elementEnable(pt_Aluminium);
            break;
            case "Antimony":
            elementEnable(m_Antimony);
            break;
            case "Argon":
            elementEnable(ng_Argon);
            break;
            case "Astatine":
            elementEnable(h_Astatine);
            break;
            case "Barium":
            elementEnable(ae_Barium);
            break;
            case "Beryllium":
            elementEnable(ae_Beryllium);
            break;
            case "Bismuth":
            elementEnable(pt_Bismuth);
            break;
            case "Bohrium":
            elementEnable(t_Bohrium);
            break;
            case "Boron":
            elementEnable(m_Boron);
            break;
            case "Bromine":
            elementEnable(h_Bromine);
            break;
            case "Cadmium":
            elementEnable(t_Cadmium);
            break;
            case "Calcium":
            elementEnable(ae_Calcium);
            break;
            case "Carbon":
            elementEnable(o_Carbon);
            break;
            case "Caesium":
            elementEnable(am_Caesium);
            break;
            case "Arsenic":
            elementEnable(m_Arsenic);
            break;
            case "Chlorine":
            elementEnable(h_Chlorine);
            break;
            case "Chromium":
            elementEnable(t_Chromium);
            break;
            case "Colbalt":
            elementEnable(t_Cobalt);
            break;
            case "Copernicium":
            elementEnable(t_Copernicium);
            break;
            case "Copper":
            elementEnable(t_Copper);
            break;
            case "Darmstadium":
            elementEnable(t_Darmstadium);
            break;
            case "Dubnium":
            elementEnable(t_Dubnium);
            break;
            case "Flerovium":
            elementEnable(pt_Flerovium);
            break;
            case "Flourine":
            elementEnable(h_Flourine);
            break;
            case "Francium":
            elementEnable(am_Francium);
            break;
            case "Gallium":
            elementEnable(pt_Gallium);
            break;
            case "Germanium":
            elementEnable(m_Germanium);
            break;
            case "Gold":
            elementEnable(t_Gold);
            break;
            case "Hafnium":
            elementEnable(t_Hafnium);
            break;
            case "Hassmium":
            elementEnable(t_Hassmium);
            break;
            case "Helium":
            elementEnable(ng_Helium);
            break;
            case "Hydrogen":
            elementEnable(o_Hydrogen);
            break;
            case "Indium":
            elementEnable(pt_Indium);
            break;
            case "Iodine":
            elementEnable(h_Iodine);
            break;
            case "Iridium":
            elementEnable(t_Iridium);
            break;
            case "Iron":
            elementEnable(t_Iron);
            break;
            case "Krypton":
            elementEnable(ng_Krypton);
            break;
            case "Lead":
            elementEnable(pt_Lead);
            break;
            case "Lithium":
            elementEnable(am_Lithium);
            break;
            case "Livermorium":
            elementEnable(pt_Livermonium);
            break;
            case "Magnesium":
            elementEnable(ae_Magnesium);
            break;
            case "Manganese":
            elementEnable(t_Manganese);
            break;
            case "Meitnerium":
            elementEnable(t_Meitnerium);
            break;
            case "Mercury":
            elementEnable(t_Mercury);
            break;
            case "Molybdenum":
            elementEnable(t_Molybdenum);
            break;
            case "Moscovium":
            elementEnable(pt_Moscovium);
            break;
            case "Neon":
            elementEnable(ng_Neon);
            break;
            case "Nickel":
            elementEnable(t_Nickel);
            break;
            case "Nihonium":
            elementEnable(pt_Nihonium);
            break;
            case "Niobrium":
            elementEnable(t_Niobrium);
            break;
            case "Nitrogen":
            elementEnable(o_Nitrogen);
            break;
            case "Oganesson":
            elementEnable(ng_Oganesson);
            break;
            case "Osmium":
            elementEnable(t_Osmium);
            break;
            case "Oxygen":
            elementEnable(o_Oxygen);
            break;
            case "Palladium":
            elementEnable(t_Palladium);
            break;
            case "Phosphorus":
            elementEnable(o_Phosphorus);
            break;
            case "Platinum":
            elementEnable(t_Platinum);
            break;
            case "Polonium":
            elementEnable(m_Polonium);
            break;
            case "Potassium":
            elementEnable(am_Potassium);
            break;
            case "Radium":
            elementEnable(ae_Radium);
            break;
            case "Radon":
            elementEnable(ng_Radon);
            break;
            case "Rhenium":
            elementEnable(t_Rhenium);
            break;
            case "Rhodium":
            elementEnable(t_Rhodium);
            break;
            case "Roentgenium":
            elementEnable(t_Roentgenium);
            break;
            case "Rubidium":
            elementEnable(am_Rubidium);
            break;
            case "Ruthenium":
            elementEnable(t_Ruthenium);
            break;
            case "Rutherfordium":
            elementEnable(t_Rutherfordium);
            break;
            case "Scandanium":
            elementEnable(t_Scandanium);
            break;
            case "Seaborgium":
            elementEnable(t_Seaborgium);
            break;
            case "Selenium":
            elementEnable(o_Selenium);
            break;
            case "Silicon":
            elementEnable(m_Silicon);
            break;
            case "Silver":
            elementEnable(t_Silver);
            break;
            case "Sodium":
            elementEnable(am_Sodium);
            break;
            case "Stronium":
            elementEnable(ae_Stronium);
            break;
            case "Sulfur":
            elementEnable(o_Sulfur);
            break;
            case "Tantalum":
            elementEnable(t_Tantalum);
            break;
            case "Technetium":
            elementEnable(t_Technetium);
            break;
            case "Tellerium":
            elementEnable(m_Tellerium);
            break;
            case "Tenessine":
            elementEnable(h_Tennessine);
            break;
            case "Thallium":
            elementEnable(pt_Thallium);
            break;
            case "Tin":
            elementEnable(pt_Tin);
            break;
            case "Titanium":
            elementEnable(t_Titanium);
            break;
            case "Tungsten":
            elementEnable(t_Tungsten);
            break;
            case "Vanadium":
            elementEnable(t_Vanadium);
            break;
            case "Xenon":
            elementEnable(ng_Xenon);
            break;
            case "Yttrium":
            elementEnable(t_Yttrium);
            break;
            case "Zinc":
            elementEnable(t_Zinc);
            break;
            case "Zirconium":
            elementEnable(t_Zirconium);
            break;
        }
    }//GEN-LAST:event_elementBoxActionPerformed

    private void groupBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupBoxActionPerformed
        // TODO add your handling code here:
                String group = (String) groupBox.getSelectedItem();
        for (int i = 0; i < button.length; i++) {
            button[i].setEnabled(true);
        }
        switch (group) {
            case "Alkali Metals":
                disable();
                enable(0, 5);
                break;
            case "Alkaline Earth Metals":
                disable();
                enable(6, 11);
                break;
            case "Halogens":
                disable();
                enable(12, 17);
                break;
            case "Metalloids":
                disable();
                enable(18, 24);
                break;
            case "Noble Gases":
                disable();
                enable(25, 31);
                break;
            case "Other Non-Metals":
                disable();
                enable(32, 38);
                break;
            case "Post-transition Metals":
                disable();
                enable(39, 49);
                break;
            case "Rare-earth Metals":
                disable();
                enable(50, 51);
                break;
            case "Transition Metals":
                disable();
                enable (52,89);
                break;
        }
    }//GEN-LAST:event_groupBoxActionPerformed

    private void homePageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        
        HomePage hmPage = new HomePage();
        hmPage.setVisible(true);
    }//GEN-LAST:event_homePageButtonActionPerformed

    public void disable (){
        for (int i = 0; i < button.length; i++) {
            button[i].setEnabled(false);
        }
    }
    
    public void enable(int start, int end) {
        for (int i = start; i <= end; i++){
            button[i].setEnabled(true);
        }
        
    }
    
    public void elementEnable (javax.swing.JButton elnum){
       disable();
       elnum.setEnabled(true);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeriodicTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeriodicTable().setVisible(true);
            }
        });
    }
    
     javax.swing.JButton [] button = new javax.swing.JButton [90];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ae_AlkaliEarthMetals;
    private javax.swing.JButton ae_Barium;
    private javax.swing.JButton ae_Beryllium;
    private javax.swing.JButton ae_Calcium;
    private javax.swing.JButton ae_Magnesium;
    private javax.swing.JButton ae_Radium;
    private javax.swing.JButton ae_Stronium;
    private javax.swing.JButton am_AlkaliMetals;
    private javax.swing.JButton am_Caesium;
    private javax.swing.JButton am_Francium;
    private javax.swing.JButton am_Lithium;
    private javax.swing.JButton am_Potassium;
    private javax.swing.JButton am_Rubidium;
    private javax.swing.JButton am_Sodium;
    private javax.swing.JComboBox<String> elementBox;
    private javax.swing.JComboBox<String> groupBox;
    private javax.swing.JButton h_Astatine;
    private javax.swing.JButton h_Bromine;
    private javax.swing.JButton h_Chlorine;
    private javax.swing.JButton h_Flourine;
    private javax.swing.JButton h_Halogens;
    private javax.swing.JButton h_Iodine;
    private javax.swing.JButton h_Tennessine;
    private javax.swing.JButton homePageButton;
    private javax.swing.JLabel imglabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton m_Antimony;
    private javax.swing.JButton m_Arsenic;
    private javax.swing.JButton m_Boron;
    private javax.swing.JButton m_Germanium;
    private javax.swing.JButton m_Metalliods;
    private javax.swing.JButton m_Polonium;
    private javax.swing.JButton m_Silicon;
    private javax.swing.JButton m_Tellerium;
    private javax.swing.JPanel midPanel;
    private javax.swing.JButton ng_Argon;
    private javax.swing.JButton ng_Helium;
    private javax.swing.JButton ng_Krypton;
    private javax.swing.JButton ng_Neon;
    private javax.swing.JButton ng_NobleGases;
    private javax.swing.JButton ng_Oganesson;
    private javax.swing.JButton ng_Radon;
    private javax.swing.JButton ng_Xenon;
    private javax.swing.JButton o_Carbon;
    private javax.swing.JButton o_Hydrogen;
    private javax.swing.JButton o_Nitrogen;
    private javax.swing.JButton o_OtherNonMetals;
    private javax.swing.JButton o_Oxygen;
    private javax.swing.JButton o_Phosphorus;
    private javax.swing.JButton o_Selenium;
    private javax.swing.JButton o_Sulfur;
    private javax.swing.JButton pt_Aluminium;
    private javax.swing.JButton pt_Bismuth;
    private javax.swing.JButton pt_Flerovium;
    private javax.swing.JButton pt_Gallium;
    private javax.swing.JButton pt_Indium;
    private javax.swing.JButton pt_Lead;
    private javax.swing.JButton pt_Livermonium;
    private javax.swing.JButton pt_Moscovium;
    private javax.swing.JButton pt_Nihonium;
    private javax.swing.JButton pt_PostTransitionMetals;
    private javax.swing.JButton pt_Thallium;
    private javax.swing.JButton pt_Tin;
    private javax.swing.JButton re_RareEarth1;
    private javax.swing.JButton re_RareEarth2;
    private javax.swing.JButton re_RareEarthMetals;
    private javax.swing.JButton t_Bohrium;
    private javax.swing.JButton t_Cadmium;
    private javax.swing.JButton t_Chromium;
    private javax.swing.JButton t_Cobalt;
    private javax.swing.JButton t_Copernicium;
    private javax.swing.JButton t_Copper;
    private javax.swing.JButton t_Darmstadium;
    private javax.swing.JButton t_Dubnium;
    private javax.swing.JButton t_Gold;
    private javax.swing.JButton t_Hafnium;
    private javax.swing.JButton t_Hassmium;
    private javax.swing.JButton t_Iridium;
    private javax.swing.JButton t_Iron;
    private javax.swing.JButton t_Manganese;
    private javax.swing.JButton t_Meitnerium;
    private javax.swing.JButton t_Mercury;
    private javax.swing.JButton t_Molybdenum;
    private javax.swing.JButton t_Nickel;
    private javax.swing.JButton t_Niobrium;
    private javax.swing.JButton t_Osmium;
    private javax.swing.JButton t_Palladium;
    private javax.swing.JButton t_Platinum;
    private javax.swing.JButton t_Rhenium;
    private javax.swing.JButton t_Rhodium;
    private javax.swing.JButton t_Roentgenium;
    private javax.swing.JButton t_Ruthenium;
    private javax.swing.JButton t_Rutherfordium;
    private javax.swing.JButton t_Scandanium;
    private javax.swing.JButton t_Seaborgium;
    private javax.swing.JButton t_Silver;
    private javax.swing.JButton t_Tantalum;
    private javax.swing.JButton t_Technetium;
    private javax.swing.JButton t_Titanium;
    private javax.swing.JButton t_TransitionMetals;
    private javax.swing.JButton t_Tungsten;
    private javax.swing.JButton t_Vanadium;
    private javax.swing.JButton t_Yttrium;
    private javax.swing.JButton t_Zinc;
    private javax.swing.JButton t_Zirconium;
    // End of variables declaration//GEN-END:variables

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.racePrep;

/**
 *
 * @author Josh Brookes
 */
public class rpChampionship extends javax.swing.JPanel {

    /**
     * Creates new form rpChampionship
     */
    public rpChampionship() {
        initComponents();
        updateScreenData();
    }

    public void updateScreenData() {
        //F1 DC
        lblDCPos1.setText(Integer.toString(1 + pageNum * 10));
        lblDCPos2.setText(Integer.toString(2 + pageNum * 10));
        lblDCPos3.setText(Integer.toString(3 + pageNum * 10));
        lblDCPos4.setText(Integer.toString(4 + pageNum * 10));
        lblDCPos5.setText(Integer.toString(5 + pageNum * 10));
        lblDCPos6.setText(Integer.toString(6 + pageNum * 10));
        lblDCPos7.setText(Integer.toString(7 + pageNum * 10));
        lblDCPos8.setText(Integer.toString(8 + pageNum * 10));
        lblDCPos9.setText(Integer.toString(9 + pageNum * 10));
        lblDCPos10.setText(Integer.toString(10 + pageNum * 10));

        lblDCDriverPos1.setText(grandprixworld.gui.FullGame.data.f1.driversStandings.get(0 + pageNum * 10).driver.fname + " " + grandprixworld.gui.FullGame.data.f1.driversStandings.get(0 + pageNum * 10).driver.lname);
        lblDCDriverPos2.setText(grandprixworld.gui.FullGame.data.f1.driversStandings.get(1 + pageNum * 10).driver.fname + " " + grandprixworld.gui.FullGame.data.f1.driversStandings.get(1 + pageNum * 10).driver.lname);
        lblDCDriverPos3.setText(grandprixworld.gui.FullGame.data.f1.driversStandings.get(2 + pageNum * 10).driver.fname + " " + grandprixworld.gui.FullGame.data.f1.driversStandings.get(2 + pageNum * 10).driver.lname);
        lblDCDriverPos4.setText(grandprixworld.gui.FullGame.data.f1.driversStandings.get(3 + pageNum * 10).driver.fname + " " + grandprixworld.gui.FullGame.data.f1.driversStandings.get(3 + pageNum * 10).driver.lname);
        lblDCDriverPos5.setText(grandprixworld.gui.FullGame.data.f1.driversStandings.get(4 + pageNum * 10).driver.fname + " " + grandprixworld.gui.FullGame.data.f1.driversStandings.get(4 + pageNum * 10).driver.lname);
        lblDCDriverPos6.setText(grandprixworld.gui.FullGame.data.f1.driversStandings.get(5 + pageNum * 10).driver.fname + " " + grandprixworld.gui.FullGame.data.f1.driversStandings.get(5 + pageNum * 10).driver.lname);
        lblDCDriverPos7.setText(grandprixworld.gui.FullGame.data.f1.driversStandings.get(6 + pageNum * 10).driver.fname + " " + grandprixworld.gui.FullGame.data.f1.driversStandings.get(6 + pageNum * 10).driver.lname);
        lblDCDriverPos8.setText(grandprixworld.gui.FullGame.data.f1.driversStandings.get(7 + pageNum * 10).driver.fname + " " + grandprixworld.gui.FullGame.data.f1.driversStandings.get(7 + pageNum * 10).driver.lname);
        lblDCDriverPos9.setText(grandprixworld.gui.FullGame.data.f1.driversStandings.get(8 + pageNum * 10).driver.fname + " " + grandprixworld.gui.FullGame.data.f1.driversStandings.get(8 + pageNum * 10).driver.lname);
        lblDCDriverPos10.setText(grandprixworld.gui.FullGame.data.f1.driversStandings.get(9 + pageNum * 10).driver.fname + " " + grandprixworld.gui.FullGame.data.f1.driversStandings.get(9 + pageNum * 10).driver.lname);

        lblDCTeamPos1.setText(grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.f1.driversStandings.get(0 + pageNum * 10).driver.raceNum).name);
        lblDCTeamPos2.setText(grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.f1.driversStandings.get(1 + pageNum * 10).driver.raceNum).name);
        lblDCTeamPos3.setText(grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.f1.driversStandings.get(2 + pageNum * 10).driver.raceNum).name);
        lblDCTeamPos4.setText(grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.f1.driversStandings.get(3 + pageNum * 10).driver.raceNum).name);
        lblDCTeamPos5.setText(grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.f1.driversStandings.get(4 + pageNum * 10).driver.raceNum).name);
        lblDCTeamPos6.setText(grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.f1.driversStandings.get(5 + pageNum * 10).driver.raceNum).name);
        lblDCTeamPos7.setText(grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.f1.driversStandings.get(6 + pageNum * 10).driver.raceNum).name);
        lblDCTeamPos8.setText(grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.f1.driversStandings.get(7 + pageNum * 10).driver.raceNum).name);
        lblDCTeamPos9.setText(grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.f1.driversStandings.get(8 + pageNum * 10).driver.raceNum).name);
        lblDCTeamPos10.setText(grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.f1.driversStandings.get(9 + pageNum * 10).driver.raceNum).name);

        lblDCPtsPos1.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.driversStandings.get(0 + pageNum * 10).points));
        lblDCPtsPos2.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.driversStandings.get(1 + pageNum * 10).points));
        lblDCPtsPos3.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.driversStandings.get(2 + pageNum * 10).points));
        lblDCPtsPos4.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.driversStandings.get(3 + pageNum * 10).points));
        lblDCPtsPos5.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.driversStandings.get(4 + pageNum * 10).points));
        lblDCPtsPos6.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.driversStandings.get(5 + pageNum * 10).points));
        lblDCPtsPos7.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.driversStandings.get(6 + pageNum * 10).points));
        lblDCPtsPos8.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.driversStandings.get(7 + pageNum * 10).points));
        lblDCPtsPos9.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.driversStandings.get(8 + pageNum * 10).points));
        lblDCPtsPos10.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.driversStandings.get(9 + pageNum * 10).points));
        //F1 CC
        lblCCTeamPos1.setText(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(0).team.name);
        lblCCTeamPos2.setText(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(1).team.name);
        lblCCTeamPos3.setText(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(2).team.name);
        lblCCTeamPos4.setText(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(3).team.name);
        lblCCTeamPos5.setText(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(4).team.name);
        lblCCTeamPos6.setText(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(5).team.name);
        lblCCTeamPos7.setText(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(6).team.name);
        lblCCTeamPos8.setText(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(7).team.name);
        lblCCTeamPos9.setText(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(8).team.name);
        lblCCTeamPos10.setText(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(9).team.name);

        lblCCPtsPos1.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(0).points));
        lblCCPtsPos2.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(1).points));
        lblCCPtsPos3.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(2).points));
        lblCCPtsPos4.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(3).points));
        lblCCPtsPos5.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(4).points));
        lblCCPtsPos6.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(5).points));
        lblCCPtsPos7.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(6).points));
        lblCCPtsPos8.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(7).points));
        lblCCPtsPos9.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(8).points));
        lblCCPtsPos10.setText(Integer.toString(grandprixworld.gui.FullGame.data.f1.teamsStandings.get(9).points));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblDCPos1 = new javax.swing.JLabel();
        lblDCDriverPos1 = new javax.swing.JLabel();
        lblDCTeamPos1 = new javax.swing.JLabel();
        lblDCPtsPos1 = new javax.swing.JLabel();
        lblDCPos2 = new javax.swing.JLabel();
        lblDCDriverPos2 = new javax.swing.JLabel();
        lblDCTeamPos2 = new javax.swing.JLabel();
        lblDCPtsPos2 = new javax.swing.JLabel();
        lblDCTeamPos3 = new javax.swing.JLabel();
        lblDCPos3 = new javax.swing.JLabel();
        lblDCPtsPos3 = new javax.swing.JLabel();
        lblDCDriverPos3 = new javax.swing.JLabel();
        lblDCTeamPos4 = new javax.swing.JLabel();
        lblDCDriverPos4 = new javax.swing.JLabel();
        lblDCPtsPos4 = new javax.swing.JLabel();
        lblDCPos4 = new javax.swing.JLabel();
        lblDCDriverPos5 = new javax.swing.JLabel();
        lblDCTeamPos5 = new javax.swing.JLabel();
        lblDCPtsPos5 = new javax.swing.JLabel();
        lblDCPos5 = new javax.swing.JLabel();
        lblDCPos6 = new javax.swing.JLabel();
        lblDCPtsPos6 = new javax.swing.JLabel();
        lblDCDriverPos6 = new javax.swing.JLabel();
        lblDCTeamPos6 = new javax.swing.JLabel();
        lblDCPtsPos7 = new javax.swing.JLabel();
        lblDCTeamPos7 = new javax.swing.JLabel();
        lblDCDriverPos7 = new javax.swing.JLabel();
        lblDCPos7 = new javax.swing.JLabel();
        lblDCDriverPos8 = new javax.swing.JLabel();
        lblDCPtsPos8 = new javax.swing.JLabel();
        lblDCPos8 = new javax.swing.JLabel();
        lblDCTeamPos8 = new javax.swing.JLabel();
        lblDCPtsPos9 = new javax.swing.JLabel();
        lblDCPos9 = new javax.swing.JLabel();
        lblDCDriverPos9 = new javax.swing.JLabel();
        lblDCTeamPos9 = new javax.swing.JLabel();
        lblDCDriverPos10 = new javax.swing.JLabel();
        lblDCPtsPos10 = new javax.swing.JLabel();
        lblDCTeamPos10 = new javax.swing.JLabel();
        lblDCPos10 = new javax.swing.JLabel();
        btnPrev = new javax.swing.JLabel();
        btnNext = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblCCPos1 = new javax.swing.JLabel();
        lblCCTeamPos1 = new javax.swing.JLabel();
        lblCCPtsPos1 = new javax.swing.JLabel();
        lblCCPos2 = new javax.swing.JLabel();
        lblCCTeamPos2 = new javax.swing.JLabel();
        lblCCPtsPos2 = new javax.swing.JLabel();
        lblCCPos3 = new javax.swing.JLabel();
        lblCCPtsPos3 = new javax.swing.JLabel();
        lblCCTeamPos3 = new javax.swing.JLabel();
        lblCCTeamPos4 = new javax.swing.JLabel();
        lblCCPtsPos4 = new javax.swing.JLabel();
        lblCCPos4 = new javax.swing.JLabel();
        lblCCTeamPos5 = new javax.swing.JLabel();
        lblCCPtsPos5 = new javax.swing.JLabel();
        lblCCPos5 = new javax.swing.JLabel();
        lblCCPos6 = new javax.swing.JLabel();
        lblCCPtsPos6 = new javax.swing.JLabel();
        lblCCTeamPos6 = new javax.swing.JLabel();
        lblCCPtsPos7 = new javax.swing.JLabel();
        lblCCTeamPos7 = new javax.swing.JLabel();
        lblCCPos7 = new javax.swing.JLabel();
        lblCCTeamPos8 = new javax.swing.JLabel();
        lblCCPtsPos8 = new javax.swing.JLabel();
        lblCCPos8 = new javax.swing.JLabel();
        lblCCPtsPos9 = new javax.swing.JLabel();
        lblCCPos9 = new javax.swing.JLabel();
        lblCCTeamPos9 = new javax.swing.JLabel();
        lblCCTeamPos10 = new javax.swing.JLabel();
        lblCCPtsPos10 = new javax.swing.JLabel();
        lblCCPos10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        jLabel252 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jLabel273 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        jLabel285 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jLabel287 = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jLabel297 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jLabel299 = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        jLabel301 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        jLabel303 = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        jLabel305 = new javax.swing.JLabel();
        jLabel306 = new javax.swing.JLabel();
        jLabel307 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        jLabel309 = new javax.swing.JLabel();
        jLabel310 = new javax.swing.JLabel();
        jLabel311 = new javax.swing.JLabel();
        jLabel312 = new javax.swing.JLabel();
        jLabel313 = new javax.swing.JLabel();
        jLabel314 = new javax.swing.JLabel();
        jLabel315 = new javax.swing.JLabel();
        jLabel316 = new javax.swing.JLabel();
        jLabel317 = new javax.swing.JLabel();
        jLabel318 = new javax.swing.JLabel();
        jLabel319 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jLabel321 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        jLabel323 = new javax.swing.JLabel();
        jLabel324 = new javax.swing.JLabel();
        jLabel325 = new javax.swing.JLabel();
        jLabel326 = new javax.swing.JLabel();
        jLabel327 = new javax.swing.JLabel();
        jLabel328 = new javax.swing.JLabel();
        jLabel329 = new javax.swing.JLabel();
        jLabel330 = new javax.swing.JLabel();
        jLabel331 = new javax.swing.JLabel();
        jLabel332 = new javax.swing.JLabel();
        jLabel333 = new javax.swing.JLabel();
        jLabel334 = new javax.swing.JLabel();
        jLabel335 = new javax.swing.JLabel();
        jLabel336 = new javax.swing.JLabel();
        jLabel337 = new javax.swing.JLabel();
        jLabel338 = new javax.swing.JLabel();
        jLabel339 = new javax.swing.JLabel();
        jLabel340 = new javax.swing.JLabel();
        jLabel341 = new javax.swing.JLabel();
        jLabel342 = new javax.swing.JLabel();
        jLabel343 = new javax.swing.JLabel();
        jLabel344 = new javax.swing.JLabel();
        jLabel345 = new javax.swing.JLabel();
        jLabel346 = new javax.swing.JLabel();
        jLabel347 = new javax.swing.JLabel();
        jLabel348 = new javax.swing.JLabel();
        jLabel349 = new javax.swing.JLabel();
        jLabel350 = new javax.swing.JLabel();
        jLabel351 = new javax.swing.JLabel();
        jLabel352 = new javax.swing.JLabel();
        jLabel353 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(88, 103, 108));
        setForeground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 550));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1070, 520));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1070, 520));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1070, 520));

        jPanel1.setBackground(new java.awt.Color(88, 103, 108));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 5, 5));

        jPanel4.setOpaque(false);

        jLabel8.setBackground(new java.awt.Color(113, 132, 137));
        jLabel8.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Driver's Championship");
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel8.setOpaque(true);

        lblDCPos1.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPos1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPos1.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPos1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDCPos1.setText("1");
        lblDCPos1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPos1.setOpaque(true);

        lblDCDriverPos1.setBackground(new java.awt.Color(113, 132, 137));
        lblDCDriverPos1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCDriverPos1.setForeground(new java.awt.Color(255, 255, 255));
        lblDCDriverPos1.setText(" ");
        lblDCDriverPos1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCDriverPos1.setOpaque(true);

        lblDCTeamPos1.setBackground(new java.awt.Color(113, 132, 137));
        lblDCTeamPos1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCTeamPos1.setForeground(new java.awt.Color(255, 255, 255));
        lblDCTeamPos1.setText(" ");
        lblDCTeamPos1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCTeamPos1.setOpaque(true);

        lblDCPtsPos1.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPtsPos1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPtsPos1.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPtsPos1.setText(" ");
        lblDCPtsPos1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPtsPos1.setOpaque(true);

        lblDCPos2.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPos2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPos2.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPos2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDCPos2.setText("2");
        lblDCPos2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPos2.setOpaque(true);

        lblDCDriverPos2.setBackground(new java.awt.Color(113, 132, 137));
        lblDCDriverPos2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCDriverPos2.setForeground(new java.awt.Color(255, 255, 255));
        lblDCDriverPos2.setText(" ");
        lblDCDriverPos2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCDriverPos2.setOpaque(true);

        lblDCTeamPos2.setBackground(new java.awt.Color(113, 132, 137));
        lblDCTeamPos2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCTeamPos2.setForeground(new java.awt.Color(255, 255, 255));
        lblDCTeamPos2.setText(" ");
        lblDCTeamPos2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCTeamPos2.setOpaque(true);

        lblDCPtsPos2.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPtsPos2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPtsPos2.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPtsPos2.setText(" ");
        lblDCPtsPos2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPtsPos2.setOpaque(true);

        lblDCTeamPos3.setBackground(new java.awt.Color(113, 132, 137));
        lblDCTeamPos3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCTeamPos3.setForeground(new java.awt.Color(255, 255, 255));
        lblDCTeamPos3.setText(" ");
        lblDCTeamPos3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCTeamPos3.setOpaque(true);

        lblDCPos3.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPos3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPos3.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPos3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDCPos3.setText("3");
        lblDCPos3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPos3.setOpaque(true);

        lblDCPtsPos3.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPtsPos3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPtsPos3.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPtsPos3.setText(" ");
        lblDCPtsPos3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPtsPos3.setOpaque(true);

        lblDCDriverPos3.setBackground(new java.awt.Color(113, 132, 137));
        lblDCDriverPos3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCDriverPos3.setForeground(new java.awt.Color(255, 255, 255));
        lblDCDriverPos3.setText(" ");
        lblDCDriverPos3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCDriverPos3.setOpaque(true);

        lblDCTeamPos4.setBackground(new java.awt.Color(113, 132, 137));
        lblDCTeamPos4.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCTeamPos4.setForeground(new java.awt.Color(255, 255, 255));
        lblDCTeamPos4.setText(" ");
        lblDCTeamPos4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCTeamPos4.setOpaque(true);

        lblDCDriverPos4.setBackground(new java.awt.Color(113, 132, 137));
        lblDCDriverPos4.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCDriverPos4.setForeground(new java.awt.Color(255, 255, 255));
        lblDCDriverPos4.setText(" ");
        lblDCDriverPos4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCDriverPos4.setOpaque(true);

        lblDCPtsPos4.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPtsPos4.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPtsPos4.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPtsPos4.setText(" ");
        lblDCPtsPos4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPtsPos4.setOpaque(true);

        lblDCPos4.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPos4.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPos4.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPos4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDCPos4.setText("4");
        lblDCPos4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPos4.setOpaque(true);

        lblDCDriverPos5.setBackground(new java.awt.Color(113, 132, 137));
        lblDCDriverPos5.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCDriverPos5.setForeground(new java.awt.Color(255, 255, 255));
        lblDCDriverPos5.setText(" ");
        lblDCDriverPos5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCDriverPos5.setOpaque(true);

        lblDCTeamPos5.setBackground(new java.awt.Color(113, 132, 137));
        lblDCTeamPos5.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCTeamPos5.setForeground(new java.awt.Color(255, 255, 255));
        lblDCTeamPos5.setText(" ");
        lblDCTeamPos5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCTeamPos5.setOpaque(true);

        lblDCPtsPos5.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPtsPos5.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPtsPos5.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPtsPos5.setText(" ");
        lblDCPtsPos5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPtsPos5.setOpaque(true);

        lblDCPos5.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPos5.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPos5.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPos5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDCPos5.setText("5");
        lblDCPos5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPos5.setOpaque(true);

        lblDCPos6.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPos6.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPos6.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPos6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDCPos6.setText("6");
        lblDCPos6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPos6.setOpaque(true);

        lblDCPtsPos6.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPtsPos6.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPtsPos6.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPtsPos6.setText(" ");
        lblDCPtsPos6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPtsPos6.setOpaque(true);

        lblDCDriverPos6.setBackground(new java.awt.Color(113, 132, 137));
        lblDCDriverPos6.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCDriverPos6.setForeground(new java.awt.Color(255, 255, 255));
        lblDCDriverPos6.setText(" ");
        lblDCDriverPos6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCDriverPos6.setOpaque(true);

        lblDCTeamPos6.setBackground(new java.awt.Color(113, 132, 137));
        lblDCTeamPos6.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCTeamPos6.setForeground(new java.awt.Color(255, 255, 255));
        lblDCTeamPos6.setText(" ");
        lblDCTeamPos6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCTeamPos6.setOpaque(true);

        lblDCPtsPos7.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPtsPos7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPtsPos7.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPtsPos7.setText(" ");
        lblDCPtsPos7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPtsPos7.setOpaque(true);

        lblDCTeamPos7.setBackground(new java.awt.Color(113, 132, 137));
        lblDCTeamPos7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCTeamPos7.setForeground(new java.awt.Color(255, 255, 255));
        lblDCTeamPos7.setText(" ");
        lblDCTeamPos7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCTeamPos7.setOpaque(true);

        lblDCDriverPos7.setBackground(new java.awt.Color(113, 132, 137));
        lblDCDriverPos7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCDriverPos7.setForeground(new java.awt.Color(255, 255, 255));
        lblDCDriverPos7.setText(" ");
        lblDCDriverPos7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCDriverPos7.setOpaque(true);

        lblDCPos7.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPos7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPos7.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPos7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDCPos7.setText("7");
        lblDCPos7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPos7.setOpaque(true);

        lblDCDriverPos8.setBackground(new java.awt.Color(113, 132, 137));
        lblDCDriverPos8.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCDriverPos8.setForeground(new java.awt.Color(255, 255, 255));
        lblDCDriverPos8.setText(" ");
        lblDCDriverPos8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCDriverPos8.setOpaque(true);

        lblDCPtsPos8.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPtsPos8.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPtsPos8.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPtsPos8.setText(" ");
        lblDCPtsPos8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPtsPos8.setOpaque(true);

        lblDCPos8.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPos8.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPos8.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPos8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDCPos8.setText("8");
        lblDCPos8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPos8.setOpaque(true);

        lblDCTeamPos8.setBackground(new java.awt.Color(113, 132, 137));
        lblDCTeamPos8.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCTeamPos8.setForeground(new java.awt.Color(255, 255, 255));
        lblDCTeamPos8.setText(" ");
        lblDCTeamPos8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCTeamPos8.setOpaque(true);

        lblDCPtsPos9.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPtsPos9.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPtsPos9.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPtsPos9.setText(" ");
        lblDCPtsPos9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPtsPos9.setOpaque(true);

        lblDCPos9.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPos9.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPos9.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPos9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDCPos9.setText("9");
        lblDCPos9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPos9.setOpaque(true);

        lblDCDriverPos9.setBackground(new java.awt.Color(113, 132, 137));
        lblDCDriverPos9.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCDriverPos9.setForeground(new java.awt.Color(255, 255, 255));
        lblDCDriverPos9.setText(" ");
        lblDCDriverPos9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCDriverPos9.setOpaque(true);

        lblDCTeamPos9.setBackground(new java.awt.Color(113, 132, 137));
        lblDCTeamPos9.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCTeamPos9.setForeground(new java.awt.Color(255, 255, 255));
        lblDCTeamPos9.setText(" ");
        lblDCTeamPos9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCTeamPos9.setOpaque(true);

        lblDCDriverPos10.setBackground(new java.awt.Color(113, 132, 137));
        lblDCDriverPos10.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCDriverPos10.setForeground(new java.awt.Color(255, 255, 255));
        lblDCDriverPos10.setText(" ");
        lblDCDriverPos10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCDriverPos10.setOpaque(true);

        lblDCPtsPos10.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPtsPos10.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPtsPos10.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPtsPos10.setText(" ");
        lblDCPtsPos10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPtsPos10.setOpaque(true);

        lblDCTeamPos10.setBackground(new java.awt.Color(113, 132, 137));
        lblDCTeamPos10.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCTeamPos10.setForeground(new java.awt.Color(255, 255, 255));
        lblDCTeamPos10.setText(" ");
        lblDCTeamPos10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCTeamPos10.setOpaque(true);

        lblDCPos10.setBackground(new java.awt.Color(113, 132, 137));
        lblDCPos10.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblDCPos10.setForeground(new java.awt.Color(255, 255, 255));
        lblDCPos10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDCPos10.setText("10");
        lblDCPos10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblDCPos10.setOpaque(true);

        btnPrev.setBackground(new java.awt.Color(64, 64, 64));
        btnPrev.setFont(new java.awt.Font("Formula1 Display Bold", 0, 32)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPrev.setText(" Prev ");
        btnPrev.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnPrev.setEnabled(false);
        btnPrev.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrev.setOpaque(true);
        btnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrevMouseClicked(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(64, 64, 64));
        btnNext.setFont(new java.awt.Font("Formula1 Display Bold", 0, 32)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNext.setText(" Next ");
        btnNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNext.setOpaque(true);
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDCPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCDriverPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCTeamPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCPtsPos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDCPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCDriverPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCTeamPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCPtsPos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDCPos3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCDriverPos3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCTeamPos3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCPtsPos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDCPos4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCDriverPos4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCTeamPos4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCPtsPos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDCPos5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCDriverPos5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCTeamPos5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCPtsPos5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDCPos6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCDriverPos6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCTeamPos6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCPtsPos6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDCPos7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCDriverPos7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCTeamPos7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCPtsPos7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDCPos8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCDriverPos8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCTeamPos8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCPtsPos8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDCPos9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCDriverPos9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCTeamPos9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCPtsPos9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDCPos10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCDriverPos10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCTeamPos10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDCPtsPos10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDCPos1)
                    .addComponent(lblDCDriverPos1)
                    .addComponent(lblDCTeamPos1)
                    .addComponent(lblDCPtsPos1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDCPos2)
                    .addComponent(lblDCDriverPos2)
                    .addComponent(lblDCTeamPos2)
                    .addComponent(lblDCPtsPos2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDCPos3)
                    .addComponent(lblDCDriverPos3)
                    .addComponent(lblDCTeamPos3)
                    .addComponent(lblDCPtsPos3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDCPos4)
                    .addComponent(lblDCDriverPos4)
                    .addComponent(lblDCTeamPos4)
                    .addComponent(lblDCPtsPos4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDCPos5)
                    .addComponent(lblDCDriverPos5)
                    .addComponent(lblDCTeamPos5)
                    .addComponent(lblDCPtsPos5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDCPos6)
                    .addComponent(lblDCDriverPos6)
                    .addComponent(lblDCTeamPos6)
                    .addComponent(lblDCPtsPos6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDCPos7)
                    .addComponent(lblDCDriverPos7)
                    .addComponent(lblDCTeamPos7)
                    .addComponent(lblDCPtsPos7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDCPos8)
                    .addComponent(lblDCDriverPos8)
                    .addComponent(lblDCTeamPos8)
                    .addComponent(lblDCPtsPos8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDCPos9)
                    .addComponent(lblDCDriverPos9)
                    .addComponent(lblDCTeamPos9)
                    .addComponent(lblDCPtsPos9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDCPos10)
                    .addComponent(lblDCDriverPos10)
                    .addComponent(lblDCTeamPos10)
                    .addComponent(lblDCPtsPos10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);

        jPanel5.setOpaque(false);

        jLabel9.setBackground(new java.awt.Color(113, 132, 137));
        jLabel9.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Constructor's Championship");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel9.setOpaque(true);

        lblCCPos1.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPos1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPos1.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPos1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCCPos1.setText("1");
        lblCCPos1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPos1.setOpaque(true);

        lblCCTeamPos1.setBackground(new java.awt.Color(113, 132, 137));
        lblCCTeamPos1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCTeamPos1.setForeground(new java.awt.Color(255, 255, 255));
        lblCCTeamPos1.setText(" ");
        lblCCTeamPos1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCTeamPos1.setOpaque(true);

        lblCCPtsPos1.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPtsPos1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPtsPos1.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPtsPos1.setText(" ");
        lblCCPtsPos1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPtsPos1.setOpaque(true);

        lblCCPos2.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPos2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPos2.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPos2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCCPos2.setText("2");
        lblCCPos2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPos2.setOpaque(true);

        lblCCTeamPos2.setBackground(new java.awt.Color(113, 132, 137));
        lblCCTeamPos2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCTeamPos2.setForeground(new java.awt.Color(255, 255, 255));
        lblCCTeamPos2.setText(" ");
        lblCCTeamPos2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCTeamPos2.setOpaque(true);

        lblCCPtsPos2.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPtsPos2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPtsPos2.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPtsPos2.setText(" ");
        lblCCPtsPos2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPtsPos2.setOpaque(true);

        lblCCPos3.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPos3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPos3.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPos3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCCPos3.setText("3");
        lblCCPos3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPos3.setOpaque(true);

        lblCCPtsPos3.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPtsPos3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPtsPos3.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPtsPos3.setText(" ");
        lblCCPtsPos3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPtsPos3.setOpaque(true);

        lblCCTeamPos3.setBackground(new java.awt.Color(113, 132, 137));
        lblCCTeamPos3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCTeamPos3.setForeground(new java.awt.Color(255, 255, 255));
        lblCCTeamPos3.setText(" ");
        lblCCTeamPos3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCTeamPos3.setOpaque(true);

        lblCCTeamPos4.setBackground(new java.awt.Color(113, 132, 137));
        lblCCTeamPos4.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCTeamPos4.setForeground(new java.awt.Color(255, 255, 255));
        lblCCTeamPos4.setText(" ");
        lblCCTeamPos4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCTeamPos4.setOpaque(true);

        lblCCPtsPos4.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPtsPos4.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPtsPos4.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPtsPos4.setText(" ");
        lblCCPtsPos4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPtsPos4.setOpaque(true);

        lblCCPos4.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPos4.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPos4.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPos4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCCPos4.setText("4");
        lblCCPos4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPos4.setOpaque(true);

        lblCCTeamPos5.setBackground(new java.awt.Color(113, 132, 137));
        lblCCTeamPos5.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCTeamPos5.setForeground(new java.awt.Color(255, 255, 255));
        lblCCTeamPos5.setText(" ");
        lblCCTeamPos5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCTeamPos5.setOpaque(true);

        lblCCPtsPos5.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPtsPos5.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPtsPos5.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPtsPos5.setText(" ");
        lblCCPtsPos5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPtsPos5.setOpaque(true);

        lblCCPos5.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPos5.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPos5.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPos5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCCPos5.setText("5");
        lblCCPos5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPos5.setOpaque(true);

        lblCCPos6.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPos6.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPos6.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPos6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCCPos6.setText("6");
        lblCCPos6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPos6.setOpaque(true);

        lblCCPtsPos6.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPtsPos6.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPtsPos6.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPtsPos6.setText(" ");
        lblCCPtsPos6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPtsPos6.setOpaque(true);

        lblCCTeamPos6.setBackground(new java.awt.Color(113, 132, 137));
        lblCCTeamPos6.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCTeamPos6.setForeground(new java.awt.Color(255, 255, 255));
        lblCCTeamPos6.setText(" ");
        lblCCTeamPos6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCTeamPos6.setOpaque(true);

        lblCCPtsPos7.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPtsPos7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPtsPos7.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPtsPos7.setText(" ");
        lblCCPtsPos7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPtsPos7.setOpaque(true);

        lblCCTeamPos7.setBackground(new java.awt.Color(113, 132, 137));
        lblCCTeamPos7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCTeamPos7.setForeground(new java.awt.Color(255, 255, 255));
        lblCCTeamPos7.setText(" ");
        lblCCTeamPos7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCTeamPos7.setOpaque(true);

        lblCCPos7.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPos7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPos7.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPos7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCCPos7.setText("7");
        lblCCPos7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPos7.setOpaque(true);

        lblCCTeamPos8.setBackground(new java.awt.Color(113, 132, 137));
        lblCCTeamPos8.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCTeamPos8.setForeground(new java.awt.Color(255, 255, 255));
        lblCCTeamPos8.setText(" ");
        lblCCTeamPos8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCTeamPos8.setOpaque(true);

        lblCCPtsPos8.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPtsPos8.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPtsPos8.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPtsPos8.setText(" ");
        lblCCPtsPos8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPtsPos8.setOpaque(true);

        lblCCPos8.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPos8.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPos8.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPos8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCCPos8.setText("8");
        lblCCPos8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPos8.setOpaque(true);

        lblCCPtsPos9.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPtsPos9.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPtsPos9.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPtsPos9.setText(" ");
        lblCCPtsPos9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPtsPos9.setOpaque(true);

        lblCCPos9.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPos9.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPos9.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPos9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCCPos9.setText("9");
        lblCCPos9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPos9.setOpaque(true);

        lblCCTeamPos9.setBackground(new java.awt.Color(113, 132, 137));
        lblCCTeamPos9.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCTeamPos9.setForeground(new java.awt.Color(255, 255, 255));
        lblCCTeamPos9.setText(" ");
        lblCCTeamPos9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCTeamPos9.setOpaque(true);

        lblCCTeamPos10.setBackground(new java.awt.Color(113, 132, 137));
        lblCCTeamPos10.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCTeamPos10.setForeground(new java.awt.Color(255, 255, 255));
        lblCCTeamPos10.setText(" ");
        lblCCTeamPos10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCTeamPos10.setOpaque(true);

        lblCCPtsPos10.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPtsPos10.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPtsPos10.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPtsPos10.setText(" ");
        lblCCPtsPos10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPtsPos10.setOpaque(true);

        lblCCPos10.setBackground(new java.awt.Color(113, 132, 137));
        lblCCPos10.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCCPos10.setForeground(new java.awt.Color(255, 255, 255));
        lblCCPos10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCCPos10.setText("10");
        lblCCPos10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCCPos10.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblCCPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCTeamPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCPtsPos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblCCPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCTeamPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCPtsPos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblCCPos3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCTeamPos3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCPtsPos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblCCPos4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCTeamPos4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCPtsPos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblCCPos5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCTeamPos5, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCPtsPos5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblCCPos6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCTeamPos6, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCPtsPos6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblCCPos7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCTeamPos7, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCPtsPos7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblCCPos8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCTeamPos8, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCPtsPos8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblCCPos9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCTeamPos9, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCPtsPos9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblCCPos10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCTeamPos10, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCCPtsPos10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCCPos1)
                    .addComponent(lblCCTeamPos1)
                    .addComponent(lblCCPtsPos1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCCPos2)
                    .addComponent(lblCCTeamPos2)
                    .addComponent(lblCCPtsPos2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCCPos3)
                    .addComponent(lblCCTeamPos3)
                    .addComponent(lblCCPtsPos3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCCPos4)
                    .addComponent(lblCCTeamPos4)
                    .addComponent(lblCCPtsPos4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCCPos5)
                    .addComponent(lblCCTeamPos5)
                    .addComponent(lblCCPtsPos5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCCPos6)
                    .addComponent(lblCCTeamPos6)
                    .addComponent(lblCCPtsPos6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCCPos7)
                    .addComponent(lblCCTeamPos7)
                    .addComponent(lblCCPtsPos7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCCPos8)
                    .addComponent(lblCCTeamPos8)
                    .addComponent(lblCCPtsPos8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCCPos9)
                    .addComponent(lblCCTeamPos9)
                    .addComponent(lblCCPtsPos9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCCPos10)
                    .addComponent(lblCCTeamPos10)
                    .addComponent(lblCCPtsPos10))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);

        jTabbedPane1.addTab("Formula 1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(88, 103, 108));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255), 3));

        jLabel10.setBackground(new java.awt.Color(113, 132, 137));
        jLabel10.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Driver's Championship");
        jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel10.setOpaque(true);

        jLabel166.setBackground(new java.awt.Color(113, 132, 137));
        jLabel166.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel166.setText("1");
        jLabel166.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel166.setOpaque(true);

        jLabel170.setBackground(new java.awt.Color(113, 132, 137));
        jLabel170.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(255, 255, 255));
        jLabel170.setText(" ");
        jLabel170.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel170.setOpaque(true);

        jLabel172.setBackground(new java.awt.Color(113, 132, 137));
        jLabel172.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(255, 255, 255));
        jLabel172.setText(" ");
        jLabel172.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel172.setOpaque(true);

        jLabel176.setBackground(new java.awt.Color(113, 132, 137));
        jLabel176.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(255, 255, 255));
        jLabel176.setText(" ");
        jLabel176.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel176.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel176.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel176.setOpaque(true);
        jLabel176.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel181.setBackground(new java.awt.Color(113, 132, 137));
        jLabel181.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel181.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel181.setText("2");
        jLabel181.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel181.setOpaque(true);

        jLabel187.setBackground(new java.awt.Color(113, 132, 137));
        jLabel187.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel187.setForeground(new java.awt.Color(255, 255, 255));
        jLabel187.setText(" ");
        jLabel187.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel187.setOpaque(true);

        jLabel189.setBackground(new java.awt.Color(113, 132, 137));
        jLabel189.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel189.setForeground(new java.awt.Color(255, 255, 255));
        jLabel189.setText(" ");
        jLabel189.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel189.setOpaque(true);

        jLabel195.setBackground(new java.awt.Color(113, 132, 137));
        jLabel195.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel195.setForeground(new java.awt.Color(255, 255, 255));
        jLabel195.setText(" ");
        jLabel195.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel195.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel195.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel195.setOpaque(true);
        jLabel195.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel199.setBackground(new java.awt.Color(113, 132, 137));
        jLabel199.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel199.setForeground(new java.awt.Color(255, 255, 255));
        jLabel199.setText(" ");
        jLabel199.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel199.setOpaque(true);

        jLabel202.setBackground(new java.awt.Color(113, 132, 137));
        jLabel202.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(255, 255, 255));
        jLabel202.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel202.setText("3");
        jLabel202.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel202.setOpaque(true);

        jLabel204.setBackground(new java.awt.Color(113, 132, 137));
        jLabel204.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel204.setForeground(new java.awt.Color(255, 255, 255));
        jLabel204.setText(" ");
        jLabel204.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel204.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel204.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel204.setOpaque(true);
        jLabel204.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel205.setBackground(new java.awt.Color(113, 132, 137));
        jLabel205.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel205.setForeground(new java.awt.Color(255, 255, 255));
        jLabel205.setText(" ");
        jLabel205.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel205.setOpaque(true);

        jLabel206.setBackground(new java.awt.Color(113, 132, 137));
        jLabel206.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel206.setForeground(new java.awt.Color(255, 255, 255));
        jLabel206.setText(" ");
        jLabel206.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel206.setOpaque(true);

        jLabel207.setBackground(new java.awt.Color(113, 132, 137));
        jLabel207.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel207.setForeground(new java.awt.Color(255, 255, 255));
        jLabel207.setText(" ");
        jLabel207.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel207.setOpaque(true);

        jLabel208.setBackground(new java.awt.Color(113, 132, 137));
        jLabel208.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel208.setForeground(new java.awt.Color(255, 255, 255));
        jLabel208.setText(" ");
        jLabel208.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel208.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel208.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel208.setOpaque(true);
        jLabel208.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel209.setBackground(new java.awt.Color(113, 132, 137));
        jLabel209.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel209.setForeground(new java.awt.Color(255, 255, 255));
        jLabel209.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel209.setText("4");
        jLabel209.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel209.setOpaque(true);

        jLabel210.setBackground(new java.awt.Color(113, 132, 137));
        jLabel210.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel210.setForeground(new java.awt.Color(255, 255, 255));
        jLabel210.setText(" ");
        jLabel210.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel210.setOpaque(true);

        jLabel211.setBackground(new java.awt.Color(113, 132, 137));
        jLabel211.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel211.setForeground(new java.awt.Color(255, 255, 255));
        jLabel211.setText(" ");
        jLabel211.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel211.setOpaque(true);

        jLabel212.setBackground(new java.awt.Color(113, 132, 137));
        jLabel212.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel212.setForeground(new java.awt.Color(255, 255, 255));
        jLabel212.setText(" ");
        jLabel212.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel212.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel212.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel212.setOpaque(true);
        jLabel212.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel213.setBackground(new java.awt.Color(113, 132, 137));
        jLabel213.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel213.setForeground(new java.awt.Color(255, 255, 255));
        jLabel213.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel213.setText("5");
        jLabel213.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel213.setOpaque(true);

        jLabel214.setBackground(new java.awt.Color(113, 132, 137));
        jLabel214.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel214.setForeground(new java.awt.Color(255, 255, 255));
        jLabel214.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel214.setText("6");
        jLabel214.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel214.setOpaque(true);

        jLabel215.setBackground(new java.awt.Color(113, 132, 137));
        jLabel215.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel215.setForeground(new java.awt.Color(255, 255, 255));
        jLabel215.setText(" ");
        jLabel215.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel215.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel215.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel215.setOpaque(true);
        jLabel215.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel216.setBackground(new java.awt.Color(113, 132, 137));
        jLabel216.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel216.setForeground(new java.awt.Color(255, 255, 255));
        jLabel216.setText(" ");
        jLabel216.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel216.setOpaque(true);

        jLabel217.setBackground(new java.awt.Color(113, 132, 137));
        jLabel217.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel217.setForeground(new java.awt.Color(255, 255, 255));
        jLabel217.setText(" ");
        jLabel217.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel217.setOpaque(true);

        jLabel218.setBackground(new java.awt.Color(113, 132, 137));
        jLabel218.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel218.setForeground(new java.awt.Color(255, 255, 255));
        jLabel218.setText(" ");
        jLabel218.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel218.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel218.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel218.setOpaque(true);
        jLabel218.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel219.setBackground(new java.awt.Color(113, 132, 137));
        jLabel219.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel219.setForeground(new java.awt.Color(255, 255, 255));
        jLabel219.setText(" ");
        jLabel219.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel219.setOpaque(true);

        jLabel220.setBackground(new java.awt.Color(113, 132, 137));
        jLabel220.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel220.setForeground(new java.awt.Color(255, 255, 255));
        jLabel220.setText(" ");
        jLabel220.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel220.setOpaque(true);

        jLabel221.setBackground(new java.awt.Color(113, 132, 137));
        jLabel221.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel221.setForeground(new java.awt.Color(255, 255, 255));
        jLabel221.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel221.setText("7");
        jLabel221.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel221.setOpaque(true);

        jLabel222.setBackground(new java.awt.Color(113, 132, 137));
        jLabel222.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel222.setForeground(new java.awt.Color(255, 255, 255));
        jLabel222.setText(" ");
        jLabel222.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel222.setOpaque(true);

        jLabel223.setBackground(new java.awt.Color(113, 132, 137));
        jLabel223.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel223.setForeground(new java.awt.Color(255, 255, 255));
        jLabel223.setText(" ");
        jLabel223.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel223.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel223.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel223.setOpaque(true);
        jLabel223.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel224.setBackground(new java.awt.Color(113, 132, 137));
        jLabel224.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel224.setForeground(new java.awt.Color(255, 255, 255));
        jLabel224.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel224.setText("8");
        jLabel224.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel224.setOpaque(true);

        jLabel225.setBackground(new java.awt.Color(113, 132, 137));
        jLabel225.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel225.setForeground(new java.awt.Color(255, 255, 255));
        jLabel225.setText(" ");
        jLabel225.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel225.setOpaque(true);

        jLabel226.setBackground(new java.awt.Color(113, 132, 137));
        jLabel226.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel226.setForeground(new java.awt.Color(255, 255, 255));
        jLabel226.setText(" ");
        jLabel226.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel226.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel226.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel226.setOpaque(true);
        jLabel226.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel227.setBackground(new java.awt.Color(113, 132, 137));
        jLabel227.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel227.setForeground(new java.awt.Color(255, 255, 255));
        jLabel227.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel227.setText("9");
        jLabel227.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel227.setOpaque(true);

        jLabel228.setBackground(new java.awt.Color(113, 132, 137));
        jLabel228.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel228.setForeground(new java.awt.Color(255, 255, 255));
        jLabel228.setText(" ");
        jLabel228.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel228.setOpaque(true);

        jLabel229.setBackground(new java.awt.Color(113, 132, 137));
        jLabel229.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel229.setForeground(new java.awt.Color(255, 255, 255));
        jLabel229.setText(" ");
        jLabel229.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel229.setOpaque(true);

        jLabel230.setBackground(new java.awt.Color(113, 132, 137));
        jLabel230.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel230.setForeground(new java.awt.Color(255, 255, 255));
        jLabel230.setText(" ");
        jLabel230.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel230.setOpaque(true);

        jLabel231.setBackground(new java.awt.Color(113, 132, 137));
        jLabel231.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel231.setForeground(new java.awt.Color(255, 255, 255));
        jLabel231.setText(" ");
        jLabel231.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel231.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel231.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel231.setOpaque(true);
        jLabel231.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel232.setBackground(new java.awt.Color(113, 132, 137));
        jLabel232.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel232.setForeground(new java.awt.Color(255, 255, 255));
        jLabel232.setText(" ");
        jLabel232.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel232.setOpaque(true);

        jLabel233.setBackground(new java.awt.Color(113, 132, 137));
        jLabel233.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel233.setForeground(new java.awt.Color(255, 255, 255));
        jLabel233.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel233.setText("10");
        jLabel233.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel233.setOpaque(true);

        jLabel234.setBackground(new java.awt.Color(113, 132, 137));
        jLabel234.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel234.setForeground(new java.awt.Color(255, 255, 255));
        jLabel234.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel234.setText("11");
        jLabel234.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel234.setOpaque(true);

        jLabel235.setBackground(new java.awt.Color(113, 132, 137));
        jLabel235.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel235.setForeground(new java.awt.Color(255, 255, 255));
        jLabel235.setText(" ");
        jLabel235.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel235.setOpaque(true);

        jLabel236.setBackground(new java.awt.Color(113, 132, 137));
        jLabel236.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel236.setForeground(new java.awt.Color(255, 255, 255));
        jLabel236.setText(" ");
        jLabel236.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel236.setOpaque(true);

        jLabel237.setBackground(new java.awt.Color(113, 132, 137));
        jLabel237.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel237.setForeground(new java.awt.Color(255, 255, 255));
        jLabel237.setText(" ");
        jLabel237.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel237.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel237.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel237.setOpaque(true);
        jLabel237.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel238.setBackground(new java.awt.Color(113, 132, 137));
        jLabel238.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel238.setForeground(new java.awt.Color(255, 255, 255));
        jLabel238.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel238.setText("12");
        jLabel238.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel238.setOpaque(true);

        jLabel239.setBackground(new java.awt.Color(113, 132, 137));
        jLabel239.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel239.setForeground(new java.awt.Color(255, 255, 255));
        jLabel239.setText(" ");
        jLabel239.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel239.setOpaque(true);

        jLabel240.setBackground(new java.awt.Color(113, 132, 137));
        jLabel240.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel240.setForeground(new java.awt.Color(255, 255, 255));
        jLabel240.setText(" ");
        jLabel240.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel240.setOpaque(true);

        jLabel241.setBackground(new java.awt.Color(113, 132, 137));
        jLabel241.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel241.setForeground(new java.awt.Color(255, 255, 255));
        jLabel241.setText(" ");
        jLabel241.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel241.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel241.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel241.setOpaque(true);
        jLabel241.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel242.setBackground(new java.awt.Color(113, 132, 137));
        jLabel242.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel242.setForeground(new java.awt.Color(255, 255, 255));
        jLabel242.setText(" ");
        jLabel242.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel242.setOpaque(true);

        jLabel243.setBackground(new java.awt.Color(113, 132, 137));
        jLabel243.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel243.setForeground(new java.awt.Color(255, 255, 255));
        jLabel243.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel243.setText("13");
        jLabel243.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel243.setOpaque(true);

        jLabel244.setBackground(new java.awt.Color(113, 132, 137));
        jLabel244.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel244.setForeground(new java.awt.Color(255, 255, 255));
        jLabel244.setText(" ");
        jLabel244.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel244.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel244.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel244.setOpaque(true);
        jLabel244.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel245.setBackground(new java.awt.Color(113, 132, 137));
        jLabel245.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel245.setForeground(new java.awt.Color(255, 255, 255));
        jLabel245.setText(" ");
        jLabel245.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel245.setOpaque(true);

        jLabel246.setBackground(new java.awt.Color(113, 132, 137));
        jLabel246.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel246.setForeground(new java.awt.Color(255, 255, 255));
        jLabel246.setText(" ");
        jLabel246.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel246.setOpaque(true);

        jLabel247.setBackground(new java.awt.Color(113, 132, 137));
        jLabel247.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel247.setForeground(new java.awt.Color(255, 255, 255));
        jLabel247.setText(" ");
        jLabel247.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel247.setOpaque(true);

        jLabel248.setBackground(new java.awt.Color(113, 132, 137));
        jLabel248.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel248.setForeground(new java.awt.Color(255, 255, 255));
        jLabel248.setText(" ");
        jLabel248.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel248.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel248.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel248.setOpaque(true);
        jLabel248.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel249.setBackground(new java.awt.Color(113, 132, 137));
        jLabel249.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel249.setForeground(new java.awt.Color(255, 255, 255));
        jLabel249.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel249.setText("14");
        jLabel249.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel249.setOpaque(true);

        jLabel250.setBackground(new java.awt.Color(113, 132, 137));
        jLabel250.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel250.setForeground(new java.awt.Color(255, 255, 255));
        jLabel250.setText(" ");
        jLabel250.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel250.setOpaque(true);

        jLabel251.setBackground(new java.awt.Color(113, 132, 137));
        jLabel251.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel251.setForeground(new java.awt.Color(255, 255, 255));
        jLabel251.setText(" ");
        jLabel251.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel251.setOpaque(true);

        jLabel252.setBackground(new java.awt.Color(113, 132, 137));
        jLabel252.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel252.setForeground(new java.awt.Color(255, 255, 255));
        jLabel252.setText(" ");
        jLabel252.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel252.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel252.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel252.setOpaque(true);
        jLabel252.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel253.setBackground(new java.awt.Color(113, 132, 137));
        jLabel253.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel253.setForeground(new java.awt.Color(255, 255, 255));
        jLabel253.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel253.setText("15");
        jLabel253.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel253.setOpaque(true);

        jLabel254.setBackground(new java.awt.Color(113, 132, 137));
        jLabel254.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel254.setForeground(new java.awt.Color(255, 255, 255));
        jLabel254.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel254.setText("16");
        jLabel254.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel254.setOpaque(true);

        jLabel255.setBackground(new java.awt.Color(113, 132, 137));
        jLabel255.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel255.setForeground(new java.awt.Color(255, 255, 255));
        jLabel255.setText(" ");
        jLabel255.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel255.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel255.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel255.setOpaque(true);
        jLabel255.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel256.setBackground(new java.awt.Color(113, 132, 137));
        jLabel256.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel256.setForeground(new java.awt.Color(255, 255, 255));
        jLabel256.setText(" ");
        jLabel256.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel256.setOpaque(true);

        jLabel257.setBackground(new java.awt.Color(113, 132, 137));
        jLabel257.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel257.setForeground(new java.awt.Color(255, 255, 255));
        jLabel257.setText(" ");
        jLabel257.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel257.setOpaque(true);

        jLabel258.setBackground(new java.awt.Color(113, 132, 137));
        jLabel258.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel258.setForeground(new java.awt.Color(255, 255, 255));
        jLabel258.setText(" ");
        jLabel258.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel258.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel258.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel258.setOpaque(true);
        jLabel258.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel259.setBackground(new java.awt.Color(113, 132, 137));
        jLabel259.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel259.setForeground(new java.awt.Color(255, 255, 255));
        jLabel259.setText(" ");
        jLabel259.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel259.setOpaque(true);

        jLabel260.setBackground(new java.awt.Color(113, 132, 137));
        jLabel260.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel260.setForeground(new java.awt.Color(255, 255, 255));
        jLabel260.setText(" ");
        jLabel260.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel260.setOpaque(true);

        jLabel261.setBackground(new java.awt.Color(113, 132, 137));
        jLabel261.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel261.setForeground(new java.awt.Color(255, 255, 255));
        jLabel261.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel261.setText("17");
        jLabel261.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel261.setOpaque(true);

        jLabel262.setBackground(new java.awt.Color(113, 132, 137));
        jLabel262.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel262.setForeground(new java.awt.Color(255, 255, 255));
        jLabel262.setText(" ");
        jLabel262.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel262.setOpaque(true);

        jLabel263.setBackground(new java.awt.Color(113, 132, 137));
        jLabel263.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel263.setForeground(new java.awt.Color(255, 255, 255));
        jLabel263.setText(" ");
        jLabel263.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel263.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel263.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel263.setOpaque(true);
        jLabel263.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel264.setBackground(new java.awt.Color(113, 132, 137));
        jLabel264.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel264.setForeground(new java.awt.Color(255, 255, 255));
        jLabel264.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel264.setText("18");
        jLabel264.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel264.setOpaque(true);

        jLabel265.setBackground(new java.awt.Color(113, 132, 137));
        jLabel265.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel265.setForeground(new java.awt.Color(255, 255, 255));
        jLabel265.setText(" ");
        jLabel265.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel265.setOpaque(true);

        jLabel266.setBackground(new java.awt.Color(113, 132, 137));
        jLabel266.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel266.setForeground(new java.awt.Color(255, 255, 255));
        jLabel266.setText(" ");
        jLabel266.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel266.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel266.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel266.setOpaque(true);
        jLabel266.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel267.setBackground(new java.awt.Color(113, 132, 137));
        jLabel267.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel267.setForeground(new java.awt.Color(255, 255, 255));
        jLabel267.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel267.setText("19");
        jLabel267.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel267.setOpaque(true);

        jLabel268.setBackground(new java.awt.Color(113, 132, 137));
        jLabel268.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel268.setForeground(new java.awt.Color(255, 255, 255));
        jLabel268.setText(" ");
        jLabel268.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel268.setOpaque(true);

        jLabel269.setBackground(new java.awt.Color(113, 132, 137));
        jLabel269.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel269.setForeground(new java.awt.Color(255, 255, 255));
        jLabel269.setText(" ");
        jLabel269.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel269.setOpaque(true);

        jLabel270.setBackground(new java.awt.Color(113, 132, 137));
        jLabel270.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel270.setForeground(new java.awt.Color(255, 255, 255));
        jLabel270.setText(" ");
        jLabel270.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel270.setOpaque(true);

        jLabel271.setBackground(new java.awt.Color(113, 132, 137));
        jLabel271.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel271.setForeground(new java.awt.Color(255, 255, 255));
        jLabel271.setText(" ");
        jLabel271.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel271.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel271.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel271.setOpaque(true);
        jLabel271.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel272.setBackground(new java.awt.Color(113, 132, 137));
        jLabel272.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel272.setForeground(new java.awt.Color(255, 255, 255));
        jLabel272.setText(" ");
        jLabel272.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel272.setOpaque(true);

        jLabel273.setBackground(new java.awt.Color(113, 132, 137));
        jLabel273.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel273.setForeground(new java.awt.Color(255, 255, 255));
        jLabel273.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel273.setText("20");
        jLabel273.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel273.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel176, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel187, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel189, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel195, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel202, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel205, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel204, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel209, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel207, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel208, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel210, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel211, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel216, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel217, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel215, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel221, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel220, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel219, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel218, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel224, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel222, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel225, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel223, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel227, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel228, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel229, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel226, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel233, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel230, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel232, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel231, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel234, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel235, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel236, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel237, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel238, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel239, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel240, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel241, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel243, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel245, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel242, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel244, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel249, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel247, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel246, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel248, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel253, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel250, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel251, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel252, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel254, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel256, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel257, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel255, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel261, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel260, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel259, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel258, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel264, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel262, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel265, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel263, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel267, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel268, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel269, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel266, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel273, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel270, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel272, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel271, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel166)
                            .addComponent(jLabel170)
                            .addComponent(jLabel172)
                            .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel181)
                            .addComponent(jLabel187)
                            .addComponent(jLabel189)
                            .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel202)
                            .addComponent(jLabel205)
                            .addComponent(jLabel199)
                            .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel209)
                            .addComponent(jLabel207)
                            .addComponent(jLabel206)
                            .addComponent(jLabel208, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel213)
                            .addComponent(jLabel210)
                            .addComponent(jLabel211)
                            .addComponent(jLabel212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel214)
                            .addComponent(jLabel216)
                            .addComponent(jLabel217)
                            .addComponent(jLabel215, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel221)
                            .addComponent(jLabel220)
                            .addComponent(jLabel219)
                            .addComponent(jLabel218, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel224)
                            .addComponent(jLabel222)
                            .addComponent(jLabel225)
                            .addComponent(jLabel223, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel227)
                            .addComponent(jLabel228)
                            .addComponent(jLabel229)
                            .addComponent(jLabel226, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel233)
                            .addComponent(jLabel230)
                            .addComponent(jLabel232)
                            .addComponent(jLabel231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel234)
                            .addComponent(jLabel235)
                            .addComponent(jLabel236)
                            .addComponent(jLabel237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel238)
                            .addComponent(jLabel239)
                            .addComponent(jLabel240)
                            .addComponent(jLabel241, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel243)
                            .addComponent(jLabel245)
                            .addComponent(jLabel242)
                            .addComponent(jLabel244, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel249)
                            .addComponent(jLabel247)
                            .addComponent(jLabel246)
                            .addComponent(jLabel248, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel253)
                            .addComponent(jLabel250)
                            .addComponent(jLabel251)
                            .addComponent(jLabel252, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel254)
                            .addComponent(jLabel256)
                            .addComponent(jLabel257)
                            .addComponent(jLabel255, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel261)
                            .addComponent(jLabel260)
                            .addComponent(jLabel259)
                            .addComponent(jLabel258, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel264)
                            .addComponent(jLabel262)
                            .addComponent(jLabel265)
                            .addComponent(jLabel263, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel267)
                            .addComponent(jLabel268)
                            .addComponent(jLabel269)
                            .addComponent(jLabel266, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel273)
                            .addComponent(jLabel270)
                            .addComponent(jLabel272)
                            .addComponent(jLabel271, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Formula 2", jPanel2);

        jPanel3.setBackground(new java.awt.Color(88, 103, 108));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel11.setBackground(new java.awt.Color(113, 132, 137));
        jLabel11.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Driver's Championship");
        jLabel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel11.setOpaque(true);

        jLabel274.setBackground(new java.awt.Color(113, 132, 137));
        jLabel274.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel274.setForeground(new java.awt.Color(255, 255, 255));
        jLabel274.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel274.setText("1");
        jLabel274.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel274.setOpaque(true);

        jLabel275.setBackground(new java.awt.Color(113, 132, 137));
        jLabel275.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel275.setForeground(new java.awt.Color(255, 255, 255));
        jLabel275.setText(" ");
        jLabel275.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel275.setOpaque(true);

        jLabel276.setBackground(new java.awt.Color(113, 132, 137));
        jLabel276.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel276.setForeground(new java.awt.Color(255, 255, 255));
        jLabel276.setText(" ");
        jLabel276.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel276.setOpaque(true);

        jLabel277.setBackground(new java.awt.Color(113, 132, 137));
        jLabel277.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel277.setForeground(new java.awt.Color(255, 255, 255));
        jLabel277.setText(" ");
        jLabel277.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel277.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel277.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel277.setOpaque(true);
        jLabel277.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel278.setBackground(new java.awt.Color(113, 132, 137));
        jLabel278.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel278.setForeground(new java.awt.Color(255, 255, 255));
        jLabel278.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel278.setText("2");
        jLabel278.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel278.setOpaque(true);

        jLabel279.setBackground(new java.awt.Color(113, 132, 137));
        jLabel279.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel279.setForeground(new java.awt.Color(255, 255, 255));
        jLabel279.setText(" ");
        jLabel279.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel279.setOpaque(true);

        jLabel280.setBackground(new java.awt.Color(113, 132, 137));
        jLabel280.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel280.setForeground(new java.awt.Color(255, 255, 255));
        jLabel280.setText(" ");
        jLabel280.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel280.setOpaque(true);

        jLabel281.setBackground(new java.awt.Color(113, 132, 137));
        jLabel281.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel281.setForeground(new java.awt.Color(255, 255, 255));
        jLabel281.setText(" ");
        jLabel281.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel281.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel281.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel281.setOpaque(true);
        jLabel281.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel282.setBackground(new java.awt.Color(113, 132, 137));
        jLabel282.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel282.setForeground(new java.awt.Color(255, 255, 255));
        jLabel282.setText(" ");
        jLabel282.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel282.setOpaque(true);

        jLabel283.setBackground(new java.awt.Color(113, 132, 137));
        jLabel283.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel283.setForeground(new java.awt.Color(255, 255, 255));
        jLabel283.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel283.setText("3");
        jLabel283.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel283.setOpaque(true);

        jLabel284.setBackground(new java.awt.Color(113, 132, 137));
        jLabel284.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel284.setForeground(new java.awt.Color(255, 255, 255));
        jLabel284.setText(" ");
        jLabel284.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel284.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel284.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel284.setOpaque(true);
        jLabel284.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel285.setBackground(new java.awt.Color(113, 132, 137));
        jLabel285.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel285.setForeground(new java.awt.Color(255, 255, 255));
        jLabel285.setText(" ");
        jLabel285.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel285.setOpaque(true);

        jLabel286.setBackground(new java.awt.Color(113, 132, 137));
        jLabel286.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel286.setForeground(new java.awt.Color(255, 255, 255));
        jLabel286.setText(" ");
        jLabel286.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel286.setOpaque(true);

        jLabel287.setBackground(new java.awt.Color(113, 132, 137));
        jLabel287.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel287.setForeground(new java.awt.Color(255, 255, 255));
        jLabel287.setText(" ");
        jLabel287.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel287.setOpaque(true);

        jLabel288.setBackground(new java.awt.Color(113, 132, 137));
        jLabel288.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel288.setForeground(new java.awt.Color(255, 255, 255));
        jLabel288.setText(" ");
        jLabel288.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel288.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel288.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel288.setOpaque(true);
        jLabel288.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel289.setBackground(new java.awt.Color(113, 132, 137));
        jLabel289.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel289.setForeground(new java.awt.Color(255, 255, 255));
        jLabel289.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel289.setText("4");
        jLabel289.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel289.setOpaque(true);

        jLabel290.setBackground(new java.awt.Color(113, 132, 137));
        jLabel290.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel290.setForeground(new java.awt.Color(255, 255, 255));
        jLabel290.setText(" ");
        jLabel290.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel290.setOpaque(true);

        jLabel291.setBackground(new java.awt.Color(113, 132, 137));
        jLabel291.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel291.setForeground(new java.awt.Color(255, 255, 255));
        jLabel291.setText(" ");
        jLabel291.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel291.setOpaque(true);

        jLabel292.setBackground(new java.awt.Color(113, 132, 137));
        jLabel292.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel292.setForeground(new java.awt.Color(255, 255, 255));
        jLabel292.setText(" ");
        jLabel292.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel292.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel292.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel292.setOpaque(true);
        jLabel292.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel293.setBackground(new java.awt.Color(113, 132, 137));
        jLabel293.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel293.setForeground(new java.awt.Color(255, 255, 255));
        jLabel293.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel293.setText("5");
        jLabel293.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel293.setOpaque(true);

        jLabel294.setBackground(new java.awt.Color(113, 132, 137));
        jLabel294.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel294.setForeground(new java.awt.Color(255, 255, 255));
        jLabel294.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel294.setText("6");
        jLabel294.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel294.setOpaque(true);

        jLabel295.setBackground(new java.awt.Color(113, 132, 137));
        jLabel295.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel295.setForeground(new java.awt.Color(255, 255, 255));
        jLabel295.setText(" ");
        jLabel295.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel295.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel295.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel295.setOpaque(true);
        jLabel295.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel296.setBackground(new java.awt.Color(113, 132, 137));
        jLabel296.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel296.setForeground(new java.awt.Color(255, 255, 255));
        jLabel296.setText(" ");
        jLabel296.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel296.setOpaque(true);

        jLabel297.setBackground(new java.awt.Color(113, 132, 137));
        jLabel297.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel297.setForeground(new java.awt.Color(255, 255, 255));
        jLabel297.setText(" ");
        jLabel297.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel297.setOpaque(true);

        jLabel298.setBackground(new java.awt.Color(113, 132, 137));
        jLabel298.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel298.setForeground(new java.awt.Color(255, 255, 255));
        jLabel298.setText(" ");
        jLabel298.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel298.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel298.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel298.setOpaque(true);
        jLabel298.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel299.setBackground(new java.awt.Color(113, 132, 137));
        jLabel299.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel299.setForeground(new java.awt.Color(255, 255, 255));
        jLabel299.setText(" ");
        jLabel299.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel299.setOpaque(true);

        jLabel300.setBackground(new java.awt.Color(113, 132, 137));
        jLabel300.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel300.setForeground(new java.awt.Color(255, 255, 255));
        jLabel300.setText(" ");
        jLabel300.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel300.setOpaque(true);

        jLabel301.setBackground(new java.awt.Color(113, 132, 137));
        jLabel301.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel301.setForeground(new java.awt.Color(255, 255, 255));
        jLabel301.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel301.setText("7");
        jLabel301.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel301.setOpaque(true);

        jLabel302.setBackground(new java.awt.Color(113, 132, 137));
        jLabel302.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel302.setForeground(new java.awt.Color(255, 255, 255));
        jLabel302.setText(" ");
        jLabel302.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel302.setOpaque(true);

        jLabel303.setBackground(new java.awt.Color(113, 132, 137));
        jLabel303.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel303.setForeground(new java.awt.Color(255, 255, 255));
        jLabel303.setText(" ");
        jLabel303.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel303.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel303.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel303.setOpaque(true);
        jLabel303.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel304.setBackground(new java.awt.Color(113, 132, 137));
        jLabel304.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel304.setForeground(new java.awt.Color(255, 255, 255));
        jLabel304.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel304.setText("8");
        jLabel304.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel304.setOpaque(true);

        jLabel305.setBackground(new java.awt.Color(113, 132, 137));
        jLabel305.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel305.setForeground(new java.awt.Color(255, 255, 255));
        jLabel305.setText(" ");
        jLabel305.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel305.setOpaque(true);

        jLabel306.setBackground(new java.awt.Color(113, 132, 137));
        jLabel306.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel306.setForeground(new java.awt.Color(255, 255, 255));
        jLabel306.setText(" ");
        jLabel306.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel306.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel306.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel306.setOpaque(true);
        jLabel306.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel307.setBackground(new java.awt.Color(113, 132, 137));
        jLabel307.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel307.setForeground(new java.awt.Color(255, 255, 255));
        jLabel307.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel307.setText("9");
        jLabel307.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel307.setOpaque(true);

        jLabel308.setBackground(new java.awt.Color(113, 132, 137));
        jLabel308.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel308.setForeground(new java.awt.Color(255, 255, 255));
        jLabel308.setText(" ");
        jLabel308.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel308.setOpaque(true);

        jLabel309.setBackground(new java.awt.Color(113, 132, 137));
        jLabel309.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel309.setForeground(new java.awt.Color(255, 255, 255));
        jLabel309.setText(" ");
        jLabel309.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel309.setOpaque(true);

        jLabel310.setBackground(new java.awt.Color(113, 132, 137));
        jLabel310.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel310.setForeground(new java.awt.Color(255, 255, 255));
        jLabel310.setText(" ");
        jLabel310.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel310.setOpaque(true);

        jLabel311.setBackground(new java.awt.Color(113, 132, 137));
        jLabel311.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel311.setForeground(new java.awt.Color(255, 255, 255));
        jLabel311.setText(" ");
        jLabel311.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel311.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel311.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel311.setOpaque(true);
        jLabel311.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel312.setBackground(new java.awt.Color(113, 132, 137));
        jLabel312.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel312.setForeground(new java.awt.Color(255, 255, 255));
        jLabel312.setText(" ");
        jLabel312.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel312.setOpaque(true);

        jLabel313.setBackground(new java.awt.Color(113, 132, 137));
        jLabel313.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel313.setForeground(new java.awt.Color(255, 255, 255));
        jLabel313.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel313.setText("10");
        jLabel313.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel313.setOpaque(true);

        jLabel314.setBackground(new java.awt.Color(113, 132, 137));
        jLabel314.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel314.setForeground(new java.awt.Color(255, 255, 255));
        jLabel314.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel314.setText("11");
        jLabel314.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel314.setOpaque(true);

        jLabel315.setBackground(new java.awt.Color(113, 132, 137));
        jLabel315.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel315.setForeground(new java.awt.Color(255, 255, 255));
        jLabel315.setText(" ");
        jLabel315.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel315.setOpaque(true);

        jLabel316.setBackground(new java.awt.Color(113, 132, 137));
        jLabel316.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel316.setForeground(new java.awt.Color(255, 255, 255));
        jLabel316.setText(" ");
        jLabel316.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel316.setOpaque(true);

        jLabel317.setBackground(new java.awt.Color(113, 132, 137));
        jLabel317.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel317.setText(" ");
        jLabel317.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel317.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel317.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel317.setOpaque(true);
        jLabel317.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel318.setBackground(new java.awt.Color(113, 132, 137));
        jLabel318.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel318.setForeground(new java.awt.Color(255, 255, 255));
        jLabel318.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel318.setText("12");
        jLabel318.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel318.setOpaque(true);

        jLabel319.setBackground(new java.awt.Color(113, 132, 137));
        jLabel319.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel319.setForeground(new java.awt.Color(255, 255, 255));
        jLabel319.setText(" ");
        jLabel319.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel319.setOpaque(true);

        jLabel320.setBackground(new java.awt.Color(113, 132, 137));
        jLabel320.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel320.setForeground(new java.awt.Color(255, 255, 255));
        jLabel320.setText(" ");
        jLabel320.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel320.setOpaque(true);

        jLabel321.setBackground(new java.awt.Color(113, 132, 137));
        jLabel321.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel321.setForeground(new java.awt.Color(255, 255, 255));
        jLabel321.setText(" ");
        jLabel321.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel321.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel321.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel321.setOpaque(true);
        jLabel321.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel322.setBackground(new java.awt.Color(113, 132, 137));
        jLabel322.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel322.setForeground(new java.awt.Color(255, 255, 255));
        jLabel322.setText(" ");
        jLabel322.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel322.setOpaque(true);

        jLabel323.setBackground(new java.awt.Color(113, 132, 137));
        jLabel323.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel323.setForeground(new java.awt.Color(255, 255, 255));
        jLabel323.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel323.setText("13");
        jLabel323.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel323.setOpaque(true);

        jLabel324.setBackground(new java.awt.Color(113, 132, 137));
        jLabel324.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel324.setForeground(new java.awt.Color(255, 255, 255));
        jLabel324.setText(" ");
        jLabel324.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel324.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel324.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel324.setOpaque(true);
        jLabel324.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel325.setBackground(new java.awt.Color(113, 132, 137));
        jLabel325.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel325.setForeground(new java.awt.Color(255, 255, 255));
        jLabel325.setText(" ");
        jLabel325.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel325.setOpaque(true);

        jLabel326.setBackground(new java.awt.Color(113, 132, 137));
        jLabel326.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel326.setForeground(new java.awt.Color(255, 255, 255));
        jLabel326.setText(" ");
        jLabel326.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel326.setOpaque(true);

        jLabel327.setBackground(new java.awt.Color(113, 132, 137));
        jLabel327.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel327.setForeground(new java.awt.Color(255, 255, 255));
        jLabel327.setText(" ");
        jLabel327.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel327.setOpaque(true);

        jLabel328.setBackground(new java.awt.Color(113, 132, 137));
        jLabel328.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel328.setForeground(new java.awt.Color(255, 255, 255));
        jLabel328.setText(" ");
        jLabel328.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel328.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel328.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel328.setOpaque(true);
        jLabel328.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel329.setBackground(new java.awt.Color(113, 132, 137));
        jLabel329.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel329.setForeground(new java.awt.Color(255, 255, 255));
        jLabel329.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel329.setText("14");
        jLabel329.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel329.setOpaque(true);

        jLabel330.setBackground(new java.awt.Color(113, 132, 137));
        jLabel330.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel330.setForeground(new java.awt.Color(255, 255, 255));
        jLabel330.setText(" ");
        jLabel330.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel330.setOpaque(true);

        jLabel331.setBackground(new java.awt.Color(113, 132, 137));
        jLabel331.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel331.setForeground(new java.awt.Color(255, 255, 255));
        jLabel331.setText(" ");
        jLabel331.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel331.setOpaque(true);

        jLabel332.setBackground(new java.awt.Color(113, 132, 137));
        jLabel332.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel332.setForeground(new java.awt.Color(255, 255, 255));
        jLabel332.setText(" ");
        jLabel332.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel332.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel332.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel332.setOpaque(true);
        jLabel332.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel333.setBackground(new java.awt.Color(113, 132, 137));
        jLabel333.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel333.setForeground(new java.awt.Color(255, 255, 255));
        jLabel333.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel333.setText("15");
        jLabel333.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel333.setOpaque(true);

        jLabel334.setBackground(new java.awt.Color(113, 132, 137));
        jLabel334.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel334.setForeground(new java.awt.Color(255, 255, 255));
        jLabel334.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel334.setText("16");
        jLabel334.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel334.setOpaque(true);

        jLabel335.setBackground(new java.awt.Color(113, 132, 137));
        jLabel335.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel335.setForeground(new java.awt.Color(255, 255, 255));
        jLabel335.setText(" ");
        jLabel335.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel335.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel335.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel335.setOpaque(true);
        jLabel335.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel336.setBackground(new java.awt.Color(113, 132, 137));
        jLabel336.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel336.setForeground(new java.awt.Color(255, 255, 255));
        jLabel336.setText(" ");
        jLabel336.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel336.setOpaque(true);

        jLabel337.setBackground(new java.awt.Color(113, 132, 137));
        jLabel337.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel337.setForeground(new java.awt.Color(255, 255, 255));
        jLabel337.setText(" ");
        jLabel337.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel337.setOpaque(true);

        jLabel338.setBackground(new java.awt.Color(113, 132, 137));
        jLabel338.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel338.setForeground(new java.awt.Color(255, 255, 255));
        jLabel338.setText(" ");
        jLabel338.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel338.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel338.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel338.setOpaque(true);
        jLabel338.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel339.setBackground(new java.awt.Color(113, 132, 137));
        jLabel339.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel339.setForeground(new java.awt.Color(255, 255, 255));
        jLabel339.setText(" ");
        jLabel339.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel339.setOpaque(true);

        jLabel340.setBackground(new java.awt.Color(113, 132, 137));
        jLabel340.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel340.setForeground(new java.awt.Color(255, 255, 255));
        jLabel340.setText(" ");
        jLabel340.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel340.setOpaque(true);

        jLabel341.setBackground(new java.awt.Color(113, 132, 137));
        jLabel341.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel341.setForeground(new java.awt.Color(255, 255, 255));
        jLabel341.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel341.setText("17");
        jLabel341.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel341.setOpaque(true);

        jLabel342.setBackground(new java.awt.Color(113, 132, 137));
        jLabel342.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel342.setForeground(new java.awt.Color(255, 255, 255));
        jLabel342.setText(" ");
        jLabel342.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel342.setOpaque(true);

        jLabel343.setBackground(new java.awt.Color(113, 132, 137));
        jLabel343.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel343.setForeground(new java.awt.Color(255, 255, 255));
        jLabel343.setText(" ");
        jLabel343.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel343.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel343.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel343.setOpaque(true);
        jLabel343.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel344.setBackground(new java.awt.Color(113, 132, 137));
        jLabel344.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel344.setForeground(new java.awt.Color(255, 255, 255));
        jLabel344.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel344.setText("18");
        jLabel344.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel344.setOpaque(true);

        jLabel345.setBackground(new java.awt.Color(113, 132, 137));
        jLabel345.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel345.setForeground(new java.awt.Color(255, 255, 255));
        jLabel345.setText(" ");
        jLabel345.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel345.setOpaque(true);

        jLabel346.setBackground(new java.awt.Color(113, 132, 137));
        jLabel346.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel346.setForeground(new java.awt.Color(255, 255, 255));
        jLabel346.setText(" ");
        jLabel346.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel346.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel346.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel346.setOpaque(true);
        jLabel346.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel347.setBackground(new java.awt.Color(113, 132, 137));
        jLabel347.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel347.setForeground(new java.awt.Color(255, 255, 255));
        jLabel347.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel347.setText("19");
        jLabel347.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel347.setOpaque(true);

        jLabel348.setBackground(new java.awt.Color(113, 132, 137));
        jLabel348.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel348.setForeground(new java.awt.Color(255, 255, 255));
        jLabel348.setText(" ");
        jLabel348.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel348.setOpaque(true);

        jLabel349.setBackground(new java.awt.Color(113, 132, 137));
        jLabel349.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel349.setForeground(new java.awt.Color(255, 255, 255));
        jLabel349.setText(" ");
        jLabel349.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel349.setOpaque(true);

        jLabel350.setBackground(new java.awt.Color(113, 132, 137));
        jLabel350.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel350.setForeground(new java.awt.Color(255, 255, 255));
        jLabel350.setText(" ");
        jLabel350.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel350.setOpaque(true);

        jLabel351.setBackground(new java.awt.Color(113, 132, 137));
        jLabel351.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel351.setForeground(new java.awt.Color(255, 255, 255));
        jLabel351.setText(" ");
        jLabel351.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel351.setMaximumSize(new java.awt.Dimension(62, 24));
        jLabel351.setMinimumSize(new java.awt.Dimension(62, 24));
        jLabel351.setOpaque(true);
        jLabel351.setPreferredSize(new java.awt.Dimension(62, 24));

        jLabel352.setBackground(new java.awt.Color(113, 132, 137));
        jLabel352.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel352.setForeground(new java.awt.Color(255, 255, 255));
        jLabel352.setText(" ");
        jLabel352.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel352.setOpaque(true);

        jLabel353.setBackground(new java.awt.Color(113, 132, 137));
        jLabel353.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel353.setForeground(new java.awt.Color(255, 255, 255));
        jLabel353.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel353.setText("20");
        jLabel353.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel353.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel274, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel275, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel276, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel277, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel278, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel279, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel280, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel281, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel283, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel285, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel282, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel284, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel289, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel287, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel286, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel288, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel293, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel290, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel291, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel292, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel294, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel296, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel297, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel295, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel301, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel300, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel299, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel298, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel304, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel302, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel305, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel303, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel307, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel308, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel309, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel306, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel313, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel310, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel312, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel311, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel314, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel315, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel316, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel318, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel319, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel320, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel321, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel323, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel325, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel322, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel329, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel327, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel326, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel328, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel333, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel330, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel331, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel332, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel334, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel336, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel337, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel335, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel341, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel340, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel339, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel338, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel344, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel342, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel345, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel343, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel347, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel348, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel349, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel346, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel353, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel350, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel352, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel351, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel274)
                            .addComponent(jLabel275)
                            .addComponent(jLabel276)
                            .addComponent(jLabel277, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel278)
                            .addComponent(jLabel279)
                            .addComponent(jLabel280)
                            .addComponent(jLabel281, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel283)
                            .addComponent(jLabel285)
                            .addComponent(jLabel282)
                            .addComponent(jLabel284, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel289)
                            .addComponent(jLabel287)
                            .addComponent(jLabel286)
                            .addComponent(jLabel288, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel293)
                            .addComponent(jLabel290)
                            .addComponent(jLabel291)
                            .addComponent(jLabel292, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel294)
                            .addComponent(jLabel296)
                            .addComponent(jLabel297)
                            .addComponent(jLabel295, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel301)
                            .addComponent(jLabel300)
                            .addComponent(jLabel299)
                            .addComponent(jLabel298, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel304)
                            .addComponent(jLabel302)
                            .addComponent(jLabel305)
                            .addComponent(jLabel303, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel307)
                            .addComponent(jLabel308)
                            .addComponent(jLabel309)
                            .addComponent(jLabel306, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel313)
                            .addComponent(jLabel310)
                            .addComponent(jLabel312)
                            .addComponent(jLabel311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel314)
                            .addComponent(jLabel315)
                            .addComponent(jLabel316)
                            .addComponent(jLabel317, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel318)
                            .addComponent(jLabel319)
                            .addComponent(jLabel320)
                            .addComponent(jLabel321, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel323)
                            .addComponent(jLabel325)
                            .addComponent(jLabel322)
                            .addComponent(jLabel324, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel329)
                            .addComponent(jLabel327)
                            .addComponent(jLabel326)
                            .addComponent(jLabel328, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel333)
                            .addComponent(jLabel330)
                            .addComponent(jLabel331)
                            .addComponent(jLabel332, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel334)
                            .addComponent(jLabel336)
                            .addComponent(jLabel337)
                            .addComponent(jLabel335, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel341)
                            .addComponent(jLabel340)
                            .addComponent(jLabel339)
                            .addComponent(jLabel338, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel344)
                            .addComponent(jLabel342)
                            .addComponent(jLabel345)
                            .addComponent(jLabel343, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel347)
                            .addComponent(jLabel348)
                            .addComponent(jLabel349)
                            .addComponent(jLabel346, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel353)
                            .addComponent(jLabel350)
                            .addComponent(jLabel352)
                            .addComponent(jLabel351, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Formula 3", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        pageNum = 1;
        btnNext.setEnabled(false);
        btnPrev.setEnabled(true);
        updateScreenData();
    }//GEN-LAST:event_btnNextMouseClicked

    private void btnPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseClicked
        pageNum = 0;
        btnNext.setEnabled(true);
        btnPrev.setEnabled(false);
        updateScreenData();
    }//GEN-LAST:event_btnPrevMouseClicked

    private int pageNum = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnNext;
    private javax.swing.JLabel btnPrev;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel327;
    private javax.swing.JLabel jLabel328;
    private javax.swing.JLabel jLabel329;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel331;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel333;
    private javax.swing.JLabel jLabel334;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel336;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel338;
    private javax.swing.JLabel jLabel339;
    private javax.swing.JLabel jLabel340;
    private javax.swing.JLabel jLabel341;
    private javax.swing.JLabel jLabel342;
    private javax.swing.JLabel jLabel343;
    private javax.swing.JLabel jLabel344;
    private javax.swing.JLabel jLabel345;
    private javax.swing.JLabel jLabel346;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel349;
    private javax.swing.JLabel jLabel350;
    private javax.swing.JLabel jLabel351;
    private javax.swing.JLabel jLabel352;
    private javax.swing.JLabel jLabel353;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCCPos1;
    private javax.swing.JLabel lblCCPos10;
    private javax.swing.JLabel lblCCPos2;
    private javax.swing.JLabel lblCCPos3;
    private javax.swing.JLabel lblCCPos4;
    private javax.swing.JLabel lblCCPos5;
    private javax.swing.JLabel lblCCPos6;
    private javax.swing.JLabel lblCCPos7;
    private javax.swing.JLabel lblCCPos8;
    private javax.swing.JLabel lblCCPos9;
    private javax.swing.JLabel lblCCPtsPos1;
    private javax.swing.JLabel lblCCPtsPos10;
    private javax.swing.JLabel lblCCPtsPos2;
    private javax.swing.JLabel lblCCPtsPos3;
    private javax.swing.JLabel lblCCPtsPos4;
    private javax.swing.JLabel lblCCPtsPos5;
    private javax.swing.JLabel lblCCPtsPos6;
    private javax.swing.JLabel lblCCPtsPos7;
    private javax.swing.JLabel lblCCPtsPos8;
    private javax.swing.JLabel lblCCPtsPos9;
    private javax.swing.JLabel lblCCTeamPos1;
    private javax.swing.JLabel lblCCTeamPos10;
    private javax.swing.JLabel lblCCTeamPos2;
    private javax.swing.JLabel lblCCTeamPos3;
    private javax.swing.JLabel lblCCTeamPos4;
    private javax.swing.JLabel lblCCTeamPos5;
    private javax.swing.JLabel lblCCTeamPos6;
    private javax.swing.JLabel lblCCTeamPos7;
    private javax.swing.JLabel lblCCTeamPos8;
    private javax.swing.JLabel lblCCTeamPos9;
    private javax.swing.JLabel lblDCDriverPos1;
    private javax.swing.JLabel lblDCDriverPos10;
    private javax.swing.JLabel lblDCDriverPos2;
    private javax.swing.JLabel lblDCDriverPos3;
    private javax.swing.JLabel lblDCDriverPos4;
    private javax.swing.JLabel lblDCDriverPos5;
    private javax.swing.JLabel lblDCDriverPos6;
    private javax.swing.JLabel lblDCDriverPos7;
    private javax.swing.JLabel lblDCDriverPos8;
    private javax.swing.JLabel lblDCDriverPos9;
    private javax.swing.JLabel lblDCPos1;
    private javax.swing.JLabel lblDCPos10;
    private javax.swing.JLabel lblDCPos2;
    private javax.swing.JLabel lblDCPos3;
    private javax.swing.JLabel lblDCPos4;
    private javax.swing.JLabel lblDCPos5;
    private javax.swing.JLabel lblDCPos6;
    private javax.swing.JLabel lblDCPos7;
    private javax.swing.JLabel lblDCPos8;
    private javax.swing.JLabel lblDCPos9;
    private javax.swing.JLabel lblDCPtsPos1;
    private javax.swing.JLabel lblDCPtsPos10;
    private javax.swing.JLabel lblDCPtsPos2;
    private javax.swing.JLabel lblDCPtsPos3;
    private javax.swing.JLabel lblDCPtsPos4;
    private javax.swing.JLabel lblDCPtsPos5;
    private javax.swing.JLabel lblDCPtsPos6;
    private javax.swing.JLabel lblDCPtsPos7;
    private javax.swing.JLabel lblDCPtsPos8;
    private javax.swing.JLabel lblDCPtsPos9;
    private javax.swing.JLabel lblDCTeamPos1;
    private javax.swing.JLabel lblDCTeamPos10;
    private javax.swing.JLabel lblDCTeamPos2;
    private javax.swing.JLabel lblDCTeamPos3;
    private javax.swing.JLabel lblDCTeamPos4;
    private javax.swing.JLabel lblDCTeamPos5;
    private javax.swing.JLabel lblDCTeamPos6;
    private javax.swing.JLabel lblDCTeamPos7;
    private javax.swing.JLabel lblDCTeamPos8;
    private javax.swing.JLabel lblDCTeamPos9;
    // End of variables declaration//GEN-END:variables
}

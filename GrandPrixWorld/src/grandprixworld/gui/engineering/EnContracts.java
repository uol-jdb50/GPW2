/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.engineering;

import grandprixworld.gamedata.ContractType;
import grandprixworld.gamedata.car.*;
import grandprixworld.gamedata.car.engine.*;
import grandprixworld.gamedata.car.tyres.Tyres;
import grandprixworld.gui.FullGame;

/**
 *
 * @author Josh Brookes
 */
public class EnContracts extends javax.swing.JPanel {

    boolean engineRD;
    int engineChange;
    int engineCompRD;
    boolean fuelRD;
    int fuelChange;
    int fuelSpecRD;
    boolean tyreRD;
    int tyreChange;
    int tyreCompRD;
    int engineImprove;
    int engineRemap;
    int fuelImprove;
    int fuelRemap;
    int tyreImprove;
    int tyreRemap;
    int engineRem;
    int fuelRem;
    int tyreRem;

    ICE newICE;
    Turbo newTurbo;
    MGUH newMGUH;
    MGUK newMGUK;
    EnergyStore newES;
    Electronics newCE;
    Fuel newFuel;
    Tyres newTyreComp;

    /**
     * Creates new form EnContracts
     */
    public EnContracts() {
        initComponents();
        resetComboBox(1);
        resetComboBox(2);
        resetComboBox(3);
        resetComboBox(4);
        resetComboBox(5);
        resetComboBox(6);
        resetComboBox(7);
        resetComboBox(8);
        resetComboBox(9);
        resetComboBox(10);
        resetComboBox(11);
        resetComboBox(12);
        updateScreenData();
        initOther();
    }

    private void resetComboBox(int section) {
        switch (section) {
            case 1://ICE
                selICESpec.removeAllItems();
                for (ICE i : FullGame.data.findPlayerTeam().ice) {
                    selICESpec.addItem(i.name);
                }
                break;
            case 2://TC
                selTCSpec.removeAllItems();
                for (Turbo i : FullGame.data.findPlayerTeam().turbo) {
                    selTCSpec.addItem(i.name);
                }
                break;
            case 3://MGUH
                selMGUHSpec.removeAllItems();
                for (MGUH i : FullGame.data.findPlayerTeam().mguh) {
                    selMGUHSpec.addItem(i.name);
                }
                break;
            case 4://MGUK
                selMGUKSpec.removeAllItems();
                for (MGUK i : FullGame.data.findPlayerTeam().mguk) {
                    selMGUKSpec.addItem(i.name);
                }
                break;
            case 5://ES
                selESSpec.removeAllItems();
                for (EnergyStore i : FullGame.data.findPlayerTeam().es) {
                    selESSpec.addItem(i.name);
                }
                break;
            case 6://CE
                selCESpec.removeAllItems();
                for (Electronics i : FullGame.data.findPlayerTeam().ce) {
                    selCESpec.addItem(i.name);
                }
                break;
            case 7://Fuel
                selFuelSpec.removeAllItems();
                for (Fuel f : FullGame.data.findPlayerTeam().fuel) {
                    selFuelSpec.addItem(f.name);
                }
                break;
            case 8://C1
                selC1Spec.removeAllItems();
                for (Tyres i : FullGame.data.findPlayerTeam().c1tyres) {
                    selC1Spec.addItem(i.name);
                }
                break;
            case 9://C2
                selC2Spec.removeAllItems();
                for (Tyres i : FullGame.data.findPlayerTeam().c2tyres) {
                    selC2Spec.addItem(i.name);
                }
                break;
            case 10://C3
                selC3Spec.removeAllItems();
                for (Tyres i : FullGame.data.findPlayerTeam().c3tyres) {
                    selC3Spec.addItem(i.name);
                }
                break;
            case 11://C4
                selC4Spec.removeAllItems();
                for (Tyres i : FullGame.data.findPlayerTeam().c4tyres) {
                    selC4Spec.addItem(i.name);
                }
                break;
            case 12://C5
                selC5Spec.removeAllItems();
                for (Tyres i : FullGame.data.findPlayerTeam().c5tyres) {
                    selC5Spec.addItem(i.name);
                }
                break;
            case 13://Inter
            case 14://Wet
        }
    }

    public void updateScreenData() {
        lblEngineSupplier.setText(FullGame.data.findPlayerTeam().engineSp.name);
        lblEngineContract.setText(FullGame.data.findPlayerTeam().engineSp.contracts.get(FullGame.data.findPlayerTeam().engineCtId).type.toString());
        switch (FullGame.data.findPlayerTeam().engineSp.contracts.get(FullGame.data.findPlayerTeam().engineCtId).type) {
            case WORKS:
                lblEngineRD.setText("Control");
                break;
            case PARTNER:
                lblEngineRD.setText("Assist");
                break;
            case CUSTOMER:
                lblEngineRD.setText("None");
                break;
        }
        imgEngineTesting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().tstEng + ".png")));
        imgEngineImprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + engineImprove + ".png")));
        imgEngineRemap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + engineRemap + ".png")));

        if (engineCompRD == 1) {
            imgICEFuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newICE.fuel + ".png")));
            imgICEPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newICE.power + ".png")));
            imgICEHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newICE.heat + ".png")));
            imgICERel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newICE.reliability + ".png")));
            imgICERig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newICE.rigidity + ".png")));
            imgICEWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newICE.weight + ".png")));

            imgICERem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + engineRem + ".png")));
        } else {
            imgICEFuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().ice.get(selICESpec.getSelectedIndex()).fuel + ".png")));
            imgICEPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().ice.get(selICESpec.getSelectedIndex()).power + ".png")));
            imgICEHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().ice.get(selICESpec.getSelectedIndex()).heat + ".png")));
            imgICERel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().ice.get(selICESpec.getSelectedIndex()).reliability + ".png")));
            imgICERig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().ice.get(selICESpec.getSelectedIndex()).rigidity + ".png")));
            imgICEWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().ice.get(selICESpec.getSelectedIndex()).weight + ".png")));

            imgICERem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
        }
        if (engineChange == 1 && engineCompRD == 1) {
            btnICEFuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnICEPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnICEHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnICERel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnICERig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnICEWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
        } else {
            btnICEFuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnICEPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnICEHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnICERel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnICERig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnICEWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
        }

        imgTCPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().turbo.get(selTCSpec.getSelectedIndex()).power + ".png")));
        imgTCHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().turbo.get(selTCSpec.getSelectedIndex()).heat + ".png")));
        imgTCRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().turbo.get(selTCSpec.getSelectedIndex()).reliability + ".png")));
        imgTCWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().turbo.get(selTCSpec.getSelectedIndex()).weight + ".png")));
        if (engineCompRD == 2) {
            imgTCPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTurbo.power + ".png")));
            imgTCHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTurbo.heat + ".png")));
            imgTCRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTurbo.reliability + ".png")));
            imgTCWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTurbo.weight + ".png")));
            imgTCRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + engineRem + ".png")));
        } else {
            imgTCRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
        }
        if (engineChange == 1 && engineCompRD == 2) {
            btnTCPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnTCHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnTCRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnTCWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
        } else {
            btnTCPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnTCHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnTCRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnTCWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
        }

        imgMGUHPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().mguh.get(selMGUHSpec.getSelectedIndex()).power + ".png")));
        imgMGUHHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().mguh.get(selMGUHSpec.getSelectedIndex()).heat + ".png")));
        imgMGUHRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().mguh.get(selMGUHSpec.getSelectedIndex()).reliability + ".png")));
        imgMGUHWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().mguh.get(selMGUHSpec.getSelectedIndex()).weight + ".png")));
        if (engineCompRD == 3) {
            imgMGUHPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newMGUH.power + ".png")));
            imgMGUHHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newMGUH.heat + ".png")));
            imgMGUHRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newMGUH.reliability + ".png")));
            imgMGUHWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newMGUH.weight + ".png")));
            imgMGUHRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + engineRem + ".png")));
        } else {
            imgMGUHRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
        }
        if (engineChange == 1 && engineCompRD == 3) {
            btnMGUHPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnMGUHHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnMGUHRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnMGUHWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
        } else {
            btnMGUHPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnMGUHHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnMGUHRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnMGUHWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
        }

        imgMGUKPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().mguk.get(selMGUKSpec.getSelectedIndex()).power + ".png")));
        imgMGUKHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().mguk.get(selMGUKSpec.getSelectedIndex()).heat + ".png")));
        imgMGUKRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().mguk.get(selMGUKSpec.getSelectedIndex()).reliability + ".png")));
        imgMGUKWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().mguk.get(selMGUKSpec.getSelectedIndex()).weight + ".png")));
        if (engineCompRD == 4) {
            imgMGUKPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newMGUK.power + ".png")));
            imgMGUKHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newMGUK.heat + ".png")));
            imgMGUKRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newMGUK.reliability + ".png")));
            imgMGUKWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newMGUK.weight + ".png")));
            imgMGUKRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + engineRem + ".png")));
        } else {
            imgMGUKRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
        }
        if (engineChange == 1 && engineCompRD == 4) {
            btnMGUKPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnMGUKHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnMGUKRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnMGUKWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
        } else {
            btnMGUKPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnMGUKHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnMGUKRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnMGUKWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
        }

        imgESCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().es.get(selESSpec.getSelectedIndex()).capacity + ".png")));
        imgESHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().es.get(selESSpec.getSelectedIndex()).heat + ".png")));
        imgESRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().es.get(selESSpec.getSelectedIndex()).reliability + ".png")));
        imgESWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().es.get(selESSpec.getSelectedIndex()).weight + ".png")));
        if (engineCompRD == 5) {
            imgESCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newES.capacity + ".png")));
            imgESHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newES.heat + ".png")));
            imgESRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newES.reliability + ".png")));
            imgESWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newES.weight + ".png")));
            imgESRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + engineRem + ".png")));
        } else {
            imgESRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
        }
        if (engineChange == 1 && engineCompRD == 5) {
            btnESCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnESHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnESRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnESWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
        } else {
            btnESCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnESHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnESRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnESWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
        }

        imgCERel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().ce.get(selCESpec.getSelectedIndex()).reliability + ".png")));
        imgCERig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().ce.get(selCESpec.getSelectedIndex()).rigidity + ".png")));
        imgCEWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().ce.get(selCESpec.getSelectedIndex()).weight + ".png")));
        if (engineCompRD == 6) {
            imgCERel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newCE.reliability + ".png")));
            imgCERig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newCE.rigidity + ".png")));
            imgCEWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newCE.weight + ".png")));
            imgCERem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + engineRem + ".png")));
        } else {
            imgCERem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
        }
        if (engineChange == 1 && engineCompRD == 2) {
            btnCERel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnCERig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnCEWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
        } else {
            btnCERel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnCERig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnCEWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
        }

        lblFuelSupplier.setText(FullGame.data.findPlayerTeam().fuelSp.name);
        lblFuelContract.setText(FullGame.data.findPlayerTeam().fuelSp.contracts.get(FullGame.data.findPlayerTeam().fuelCtId).type.toString());
        switch (FullGame.data.findPlayerTeam().fuelSp.contracts.get(FullGame.data.findPlayerTeam().fuelCtId).type) {
            case WORKS:
                lblFuelRD.setText("Control");
                break;
            case PARTNER:
                lblFuelRD.setText("Assist");
                break;
            case CUSTOMER:
                lblFuelRD.setText("None");
                break;
        }
        imgFuelTesting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().tstFuel + ".png")));
        imgFuelImprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + fuelImprove + ".png")));
        imgFuelRemap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + fuelRemap + ".png")));
        if (fuelChange == 1 && fuelSpecRD == 1) {
            btnFuelPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnFuelToler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
        } else {
            btnFuelPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnFuelToler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
        }

        imgFuelPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().fuel.get(selFuelSpec.getSelectedIndex()).performance + ".png")));
        imgFuelToler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().fuel.get(selFuelSpec.getSelectedIndex()).tolerance + ".png")));
        if (fuelSpecRD == 1) {
            imgFuelPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newFuel.performance + ".png")));
            imgFuelToler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newFuel.tolerance + ".png")));
            imgFuelRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + fuelRem + ".png")));
        } else {
            imgFuelRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
        }

        lblTyreSupplier.setText(FullGame.data.findPlayerTeam().tyreSp.name);
        lblTyreContract.setText(FullGame.data.findPlayerTeam().tyreSp.contracts.get(FullGame.data.findPlayerTeam().tyreCtId).type.toString());
        switch (FullGame.data.findPlayerTeam().tyreSp.contracts.get(FullGame.data.findPlayerTeam().tyreCtId).type) {
            case WORKS:
                lblTyreRD.setText("Control");
                break;
            case PARTNER:
                lblTyreRD.setText("Assist");
                break;
            case CUSTOMER:
                lblTyreRD.setText("None");
                break;
        }
        imgTyreTesting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().tstTyre + ".png")));
        imgTyreImprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + tyreImprove + ".png")));
        imgTyreRemap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + tyreRemap + ".png")));

        imgC1Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c1tyres.get(selC1Spec.getSelectedIndex()).grip + ".png")));
        imgC1Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c1tyres.get(selC1Spec.getSelectedIndex()).resilience + ".png")));
        imgC1Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c1tyres.get(selC1Spec.getSelectedIndex()).stiffness + ".png")));
        imgC1Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c1tyres.get(selC1Spec.getSelectedIndex()).heat + ".png")));
        if (tyreCompRD == 1) {
            imgC1Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.grip + ".png")));
            imgC1Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.resilience + ".png")));
            imgC1Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.stiffness + ".png")));
            imgC1Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.heat + ".png")));
            imgC1Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + tyreRem + ".png")));
        } else {
            imgC1Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
        }
        if (tyreChange == 1 && tyreCompRD == 1) {
            btnC1Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC1Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC1Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC1Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
        } else {
            btnC1Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC1Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC1Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC1Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
        }

        imgC2Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c2tyres.get(selC2Spec.getSelectedIndex()).grip + ".png")));
        imgC2Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c2tyres.get(selC2Spec.getSelectedIndex()).resilience + ".png")));
        imgC2Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c2tyres.get(selC2Spec.getSelectedIndex()).stiffness + ".png")));
        imgC2Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c2tyres.get(selC2Spec.getSelectedIndex()).heat + ".png")));
        if (tyreCompRD == 2) {
            imgC2Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.grip + ".png")));
            imgC2Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.resilience + ".png")));
            imgC2Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.stiffness + ".png")));
            imgC2Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.heat + ".png")));
            imgC2Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + tyreRem + ".png")));
        } else {
            imgC2Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
        }
        if (tyreChange == 1 && tyreCompRD == 2) {
            btnC2Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC2Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC2Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC2Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
        } else {
            btnC2Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC2Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC2Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC2Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
        }

        imgC3Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c3tyres.get(selC3Spec.getSelectedIndex()).grip + ".png")));
        imgC3Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c3tyres.get(selC3Spec.getSelectedIndex()).resilience + ".png")));
        imgC3Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c3tyres.get(selC3Spec.getSelectedIndex()).stiffness + ".png")));
        imgC3Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c3tyres.get(selC3Spec.getSelectedIndex()).heat + ".png")));
        if (tyreCompRD == 3) {
            imgC3Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.grip + ".png")));
            imgC3Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.resilience + ".png")));
            imgC3Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.stiffness + ".png")));
            imgC3Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.heat + ".png")));
            imgC3Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + tyreRem + ".png")));
        } else {
            imgC3Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
        }
        if (tyreChange == 1 && tyreCompRD == 3) {
            btnC3Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC3Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC3Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC3Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
        } else {
            btnC3Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC3Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC3Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC3Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
        }

        imgC4Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c4tyres.get(selC4Spec.getSelectedIndex()).grip + ".png")));
        imgC4Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c4tyres.get(selC4Spec.getSelectedIndex()).resilience + ".png")));
        imgC4Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c4tyres.get(selC4Spec.getSelectedIndex()).stiffness + ".png")));
        imgC4Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c4tyres.get(selC4Spec.getSelectedIndex()).heat + ".png")));
        if (tyreCompRD == 4) {
            imgC4Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.grip + ".png")));
            imgC4Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.resilience + ".png")));
            imgC4Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.stiffness + ".png")));
            imgC4Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.heat + ".png")));
            imgC4Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + tyreRem + ".png")));
        } else {
            imgC4Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
        }
        if (tyreChange == 1 && tyreCompRD == 4) {
            btnC4Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC4Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC4Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC4Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
        } else {
            btnC4Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC4Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC4Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC4Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
        }

        imgC5Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c5tyres.get(selC5Spec.getSelectedIndex()).grip + ".png")));
        imgC5Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c5tyres.get(selC5Spec.getSelectedIndex()).resilience + ".png")));
        imgC5Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c5tyres.get(selC5Spec.getSelectedIndex()).stiffness + ".png")));
        imgC5Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().c5tyres.get(selC5Spec.getSelectedIndex()).heat + ".png")));
        if (tyreCompRD == 5) {
            imgC5Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.grip + ".png")));
            imgC5Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.resilience + ".png")));
            imgC5Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.stiffness + ".png")));
            imgC5Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + newTyreComp.heat + ".png")));
            imgC5Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + tyreRem + ".png")));
        } else {
            imgC5Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
        }
        if (tyreChange == 1 && tyreCompRD == 5) {
            btnC5Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC5Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC5Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
            btnC5Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png")));
        } else {
            btnC5Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC5Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC5Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
            btnC5Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png")));
        }
    }

    private void initOther() {
        selICESpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selICESpecActionPerformed(evt);
            }
        });
        selTCSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selICESpecActionPerformed(evt);
            }
        });
        selMGUHSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selICESpecActionPerformed(evt);
            }
        });
        selMGUKSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selICESpecActionPerformed(evt);
            }
        });
        selESSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selICESpecActionPerformed(evt);
            }
        });
        selCESpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selICESpecActionPerformed(evt);
            }
        });
        selFuelSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selICESpecActionPerformed(evt);
            }
        });
        selC1Spec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selICESpecActionPerformed(evt);
            }
        });
        selC2Spec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selICESpecActionPerformed(evt);
            }
        });
        selC3Spec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selICESpecActionPerformed(evt);
            }
        });
        selC4Spec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selICESpecActionPerformed(evt);
            }
        });
        selC5Spec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selICESpecActionPerformed(evt);
            }
        });

        btnICEFuel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 1, 1);
            }
        });
        btnICEPower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 1, 2);
            }
        });
        btnICEHeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 1, 3);
            }
        });
        btnICERel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 1, 4);
            }
        });
        btnICERig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 1, 5);
            }
        });
        btnICEWei.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 1, 6);
            }
        });
        btnTCPower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 2, 1);
            }
        });
        btnTCHeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 2, 2);
            }
        });
        btnTCRel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 2, 3);
            }
        });
        btnTCWei.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 2, 4);
            }
        });
        btnMGUHPower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 3, 1);
            }
        });
        btnMGUHHeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 3, 2);
            }
        });
        btnMGUHRel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 3, 3);
            }
        });
        btnMGUHWei.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 3, 4);
            }
        });
        btnMGUKPower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 4, 1);
            }
        });
        btnMGUKHeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 4, 2);
            }
        });
        btnMGUKRel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 4, 3);
            }
        });
        btnMGUKWei.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 4, 4);
            }
        });
        btnESCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 5, 1);
            }
        });
        btnESHeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 5, 2);
            }
        });
        btnESRel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 5, 3);
            }
        });
        btnESWei.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 5, 4);
            }
        });
        btnCERel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 6, 1);
            }
        });
        btnCERig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 6, 2);
            }
        });
        btnCEWei.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 1, 6, 3);
            }
        });
        btnFuelPerf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 2, 0, 1);
            }
        });
        btnFuelToler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 2, 0, 2);
            }
        });
        btnC1Grip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 1, 1);
            }
        });
        btnC1Res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 1, 2);
            }
        });
        btnC1Stiff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 1, 3);
            }
        });
        btnC1Heat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 1, 4);
            }
        });
        btnC2Grip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 2, 1);
            }
        });
        btnC2Res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 2, 2);
            }
        });
        btnC2Stiff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 2, 3);
            }
        });
        btnC2Heat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 2, 4);
            }
        });
        btnC3Grip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 3, 1);
            }
        });
        btnC3Res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 3, 2);
            }
        });
        btnC3Stiff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 3, 3);
            }
        });
        btnC3Heat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 3, 4);
            }
        });
        btnC4Grip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 4, 1);
            }
        });
        btnC4Res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 4, 2);
            }
        });
        btnC4Stiff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 4, 3);
            }
        });
        btnC4Heat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 4, 4);
            }
        });
        btnC5Grip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 5, 1);
            }
        });
        btnC5Res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 5, 2);
            }
        });
        btnC5Stiff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 5, 3);
            }
        });
        btnC5Heat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeAttributeClicked(evt, 3, 5, 4);
            }
        });
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
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblEngineSupplier = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEngineContract = new javax.swing.JLabel();
        lblEngineRD = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        imgEngineTesting = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnEngineStart = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        imgEngineRemap = new javax.swing.JLabel();
        btnEngineRemap = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        imgEngineImprove = new javax.swing.JLabel();
        btnEngineImprove = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tabsEngine = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        selICESpec = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        btnICEStart = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        imgICEFuel = new javax.swing.JLabel();
        btnICEFuel = new javax.swing.JLabel();
        imgICEPower = new javax.swing.JLabel();
        btnICEPower = new javax.swing.JLabel();
        imgICEHeat = new javax.swing.JLabel();
        btnICEHeat = new javax.swing.JLabel();
        imgICERel = new javax.swing.JLabel();
        btnICERel = new javax.swing.JLabel();
        imgICERig = new javax.swing.JLabel();
        btnICERig = new javax.swing.JLabel();
        imgICEWei = new javax.swing.JLabel();
        btnICEWei = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btnICEFinish = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        imgICERem = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        selTCSpec = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        btnTCStart = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        imgTCPower = new javax.swing.JLabel();
        btnTCPower = new javax.swing.JLabel();
        imgTCHeat = new javax.swing.JLabel();
        btnTCHeat = new javax.swing.JLabel();
        imgTCRel = new javax.swing.JLabel();
        btnTCRel = new javax.swing.JLabel();
        imgTCWei = new javax.swing.JLabel();
        btnTCWei = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btnTCFinish = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        imgTCRem = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        selMGUHSpec = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        btnMGUHStart = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        imgMGUHPower = new javax.swing.JLabel();
        btnMGUHPower = new javax.swing.JLabel();
        imgMGUHHeat = new javax.swing.JLabel();
        btnMGUHHeat = new javax.swing.JLabel();
        imgMGUHRel = new javax.swing.JLabel();
        btnMGUHRel = new javax.swing.JLabel();
        imgMGUHWei = new javax.swing.JLabel();
        btnMGUHWei = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        btnMGUHFinish = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        imgMGUHRem = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        selMGUKSpec = new javax.swing.JComboBox<>();
        jLabel100 = new javax.swing.JLabel();
        btnMGUKStart = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        imgMGUKPower = new javax.swing.JLabel();
        btnMGUKPower = new javax.swing.JLabel();
        imgMGUKHeat = new javax.swing.JLabel();
        btnMGUKHeat = new javax.swing.JLabel();
        imgMGUKRel = new javax.swing.JLabel();
        btnMGUKRel = new javax.swing.JLabel();
        imgMGUKWei = new javax.swing.JLabel();
        btnMGUKWei = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        btnMGUKFinish = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        imgMGUKRem = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        selESSpec = new javax.swing.JComboBox<>();
        jLabel126 = new javax.swing.JLabel();
        selESStart = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        imgESCap = new javax.swing.JLabel();
        btnESCap = new javax.swing.JLabel();
        imgESHeat = new javax.swing.JLabel();
        btnESHeat = new javax.swing.JLabel();
        imgESRel = new javax.swing.JLabel();
        btnESRel = new javax.swing.JLabel();
        imgESWei = new javax.swing.JLabel();
        btnESWei = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        btnESFinish = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        imgESRem = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel151 = new javax.swing.JLabel();
        selCESpec = new javax.swing.JComboBox<>();
        jLabel152 = new javax.swing.JLabel();
        btnCEStart = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        imgCERel = new javax.swing.JLabel();
        btnCERel = new javax.swing.JLabel();
        imgCERig = new javax.swing.JLabel();
        btnCERig = new javax.swing.JLabel();
        imgCEWei = new javax.swing.JLabel();
        btnCEWei = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        btnCEFinish = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        imgCERem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lblFuelSupplier = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        lblFuelContract = new javax.swing.JLabel();
        lblFuelRD = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        imgFuelTesting = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        btnFuelStart = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        imgFuelRemap = new javax.swing.JLabel();
        btnFuelRemap = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        imgFuelImprove = new javax.swing.JLabel();
        btnFuelImprove = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel158 = new javax.swing.JLabel();
        selFuelSpec = new javax.swing.JComboBox<>();
        jLabel159 = new javax.swing.JLabel();
        btnSelectSpec = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        imgFuelPerf = new javax.swing.JLabel();
        btnFuelPerf = new javax.swing.JLabel();
        imgFuelToler = new javax.swing.JLabel();
        btnFuelToler = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        btnFuelFinish = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        imgFuelRem = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        lblTyreSupplier = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        lblTyreContract = new javax.swing.JLabel();
        lblTyreRD = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel146 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        imgTyreTesting = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        btnTyreStart = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        imgTyreRemap = new javax.swing.JLabel();
        btnTyreRemap = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        imgTyreImprove = new javax.swing.JLabel();
        btnTyreImprove = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        tabsTyres = new javax.swing.JTabbedPane();
        jPanel22 = new javax.swing.JPanel();
        jLabel192 = new javax.swing.JLabel();
        selC1Spec = new javax.swing.JComboBox<>();
        jLabel193 = new javax.swing.JLabel();
        btnC1Start = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        imgC1Grip = new javax.swing.JLabel();
        btnC1Grip = new javax.swing.JLabel();
        imgC1Res = new javax.swing.JLabel();
        btnC1Res = new javax.swing.JLabel();
        imgC1Stiff = new javax.swing.JLabel();
        btnC1Stiff = new javax.swing.JLabel();
        imgC1Heat = new javax.swing.JLabel();
        btnC1Heat = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        btnC1Finish = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        imgC1Rem = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel218 = new javax.swing.JLabel();
        selC2Spec = new javax.swing.JComboBox<>();
        jLabel219 = new javax.swing.JLabel();
        btnC2Start = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        imgC2Grip = new javax.swing.JLabel();
        btnC2Grip = new javax.swing.JLabel();
        imgC2Res = new javax.swing.JLabel();
        btnC2Res = new javax.swing.JLabel();
        imgC2Stiff = new javax.swing.JLabel();
        btnC2Stiff = new javax.swing.JLabel();
        imgC2Heat = new javax.swing.JLabel();
        btnC2Heat = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        btnC2Finish = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        imgC2Rem = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel238 = new javax.swing.JLabel();
        selC3Spec = new javax.swing.JComboBox<>();
        jLabel239 = new javax.swing.JLabel();
        btnC3Start = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        imgC3Grip = new javax.swing.JLabel();
        btnC3Grip = new javax.swing.JLabel();
        imgC3Res = new javax.swing.JLabel();
        btnC3Res = new javax.swing.JLabel();
        imgC3Stiff = new javax.swing.JLabel();
        btnC3Stiff = new javax.swing.JLabel();
        imgC3Heat = new javax.swing.JLabel();
        btnC3Heat = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        btnC3Finish = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        imgC3Rem = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel258 = new javax.swing.JLabel();
        selC4Spec = new javax.swing.JComboBox<>();
        jLabel259 = new javax.swing.JLabel();
        btnC4Start = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        imgC4Grip = new javax.swing.JLabel();
        btnC4Grip = new javax.swing.JLabel();
        imgC4Res = new javax.swing.JLabel();
        btnC4Res = new javax.swing.JLabel();
        imgC4Stiff = new javax.swing.JLabel();
        btnC4Stiff = new javax.swing.JLabel();
        imgC4Heat = new javax.swing.JLabel();
        btnC4Heat = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        btnC4Finish = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        imgC4Rem = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel278 = new javax.swing.JLabel();
        selC5Spec = new javax.swing.JComboBox<>();
        jLabel279 = new javax.swing.JLabel();
        btnC5Start = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        jLabel285 = new javax.swing.JLabel();
        imgC5Grip = new javax.swing.JLabel();
        btnC5Grip = new javax.swing.JLabel();
        imgC5Res = new javax.swing.JLabel();
        btnC5Res = new javax.swing.JLabel();
        imgC5Stiff = new javax.swing.JLabel();
        btnC5Stiff = new javax.swing.JLabel();
        imgC5Heat = new javax.swing.JLabel();
        btnC5Heat = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        btnC5Finish = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        imgC5Rem = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel298 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
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
        jLabel332 = new javax.swing.JLabel();
        jLabel333 = new javax.swing.JLabel();
        jLabel334 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel315 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
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
        jLabel335 = new javax.swing.JLabel();
        jLabel336 = new javax.swing.JLabel();
        jLabel337 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(88, 103, 108));
        setForeground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 550));
        setPreferredSize(new java.awt.Dimension(1100, 550));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1070, 520));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1070, 520));

        jPanel1.setBackground(new java.awt.Color(88, 103, 108));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 10, 10));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(2, 1, 10, 10));

        jPanel12.setOpaque(false);

        jLabel8.setBackground(new java.awt.Color(113, 132, 137));
        jLabel8.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Contract");
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel8.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(113, 132, 137));
        jLabel1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Supplier");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel1.setOpaque(true);

        lblEngineSupplier.setBackground(new java.awt.Color(113, 132, 137));
        lblEngineSupplier.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblEngineSupplier.setForeground(new java.awt.Color(255, 255, 255));
        lblEngineSupplier.setText(" ");
        lblEngineSupplier.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblEngineSupplier.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(113, 132, 137));
        jLabel2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Contract");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel2.setOpaque(true);

        lblEngineContract.setBackground(new java.awt.Color(113, 132, 137));
        lblEngineContract.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblEngineContract.setForeground(new java.awt.Color(255, 255, 255));
        lblEngineContract.setText(" ");
        lblEngineContract.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblEngineContract.setOpaque(true);

        lblEngineRD.setBackground(new java.awt.Color(113, 132, 137));
        lblEngineRD.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblEngineRD.setForeground(new java.awt.Color(255, 255, 255));
        lblEngineRD.setText(" ");
        lblEngineRD.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblEngineRD.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(113, 132, 137));
        jLabel3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("R&D");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEngineSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEngineContract, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEngineRD, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblEngineSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblEngineContract, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblEngineRD, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel12);

        jPanel13.setOpaque(false);

        jLabel9.setBackground(new java.awt.Color(113, 132, 137));
        jLabel9.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Testing");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel9.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(113, 132, 137));
        jLabel7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Testing");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel7.setOpaque(true);

        imgEngineTesting.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgEngineTesting.setForeground(new java.awt.Color(255, 255, 255));
        imgEngineTesting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel16.setBackground(new java.awt.Color(113, 132, 137));
        jLabel16.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("Start Work");
        jLabel16.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel16.setOpaque(true);

        btnEngineStart.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnEngineStart.setForeground(new java.awt.Color(255, 255, 255));
        btnEngineStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEngineStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnEngineStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEngineStartMouseClicked(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(113, 132, 137));
        jLabel17.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("Remapping");
        jLabel17.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel17.setOpaque(true);

        imgEngineRemap.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgEngineRemap.setForeground(new java.awt.Color(255, 255, 255));
        imgEngineRemap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgEngineRemap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnEngineRemap.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnEngineRemap.setForeground(new java.awt.Color(255, 255, 255));
        btnEngineRemap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEngineRemap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnEngineRemap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEngineRemapMouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(113, 132, 137));
        jLabel18.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel18.setText("Improvement");
        jLabel18.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel18.setOpaque(true);

        imgEngineImprove.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgEngineImprove.setForeground(new java.awt.Color(255, 255, 255));
        imgEngineImprove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgEngineImprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnEngineImprove.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnEngineImprove.setForeground(new java.awt.Color(255, 255, 255));
        btnEngineImprove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEngineImprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnEngineImprove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEngineImproveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEngineStart)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(imgEngineRemap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEngineRemap))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(imgEngineImprove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEngineImprove))
                            .addComponent(imgEngineTesting))
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(imgEngineTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEngineStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgEngineRemap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEngineRemap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgEngineImprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEngineImprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel13);

        jPanel1.add(jPanel4);

        jPanel5.setOpaque(false);

        tabsEngine.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(88, 103, 108));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel11.setBackground(new java.awt.Color(113, 132, 137));
        jLabel11.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Specification");
        jLabel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel11.setOpaque(true);

        selICESpec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N

        jLabel19.setBackground(new java.awt.Color(113, 132, 137));
        jLabel19.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel19.setText("Start Work");
        jLabel19.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel19.setOpaque(true);

        btnICEStart.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnICEStart.setForeground(new java.awt.Color(255, 255, 255));
        btnICEStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnICEStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnICEStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnICEStartMouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(113, 132, 137));
        jLabel12.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Data");
        jLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel12.setOpaque(true);

        jLabel21.setBackground(new java.awt.Color(113, 132, 137));
        jLabel21.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel21.setText("Fuel");
        jLabel21.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel21.setOpaque(true);

        jLabel22.setBackground(new java.awt.Color(113, 132, 137));
        jLabel22.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel22.setText("Power");
        jLabel22.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel22.setOpaque(true);

        jLabel23.setBackground(new java.awt.Color(113, 132, 137));
        jLabel23.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel23.setText("Heat");
        jLabel23.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel23.setOpaque(true);

        jLabel24.setBackground(new java.awt.Color(113, 132, 137));
        jLabel24.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel24.setText("Reliability");
        jLabel24.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel24.setOpaque(true);

        jLabel25.setBackground(new java.awt.Color(113, 132, 137));
        jLabel25.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel25.setText("Rigidity");
        jLabel25.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel25.setOpaque(true);

        jLabel26.setBackground(new java.awt.Color(113, 132, 137));
        jLabel26.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel26.setText("Weight");
        jLabel26.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel26.setOpaque(true);

        imgICEFuel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgICEFuel.setForeground(new java.awt.Color(255, 255, 255));
        imgICEFuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnICEFuel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnICEFuel.setForeground(new java.awt.Color(255, 255, 255));
        btnICEFuel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnICEFuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgICEPower.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgICEPower.setForeground(new java.awt.Color(255, 255, 255));
        imgICEPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnICEPower.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnICEPower.setForeground(new java.awt.Color(255, 255, 255));
        btnICEPower.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnICEPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgICEHeat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgICEHeat.setForeground(new java.awt.Color(255, 255, 255));
        imgICEHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnICEHeat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnICEHeat.setForeground(new java.awt.Color(255, 255, 255));
        btnICEHeat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnICEHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgICERel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgICERel.setForeground(new java.awt.Color(255, 255, 255));
        imgICERel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnICERel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnICERel.setForeground(new java.awt.Color(255, 255, 255));
        btnICERel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnICERel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgICERig.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgICERig.setForeground(new java.awt.Color(255, 255, 255));
        imgICERig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnICERig.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnICERig.setForeground(new java.awt.Color(255, 255, 255));
        btnICERig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnICERig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgICEWei.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgICEWei.setForeground(new java.awt.Color(255, 255, 255));
        imgICEWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnICEWei.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnICEWei.setForeground(new java.awt.Color(255, 255, 255));
        btnICEWei.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnICEWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel30.setBackground(new java.awt.Color(113, 132, 137));
        jLabel30.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel30.setText("Confirm Specification");
        jLabel30.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel30.setOpaque(true);

        btnICEFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnICEFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnICEFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnICEFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnICEFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnICEFinishMouseClicked(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(113, 132, 137));
        jLabel31.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel31.setText("Remaining");
        jLabel31.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel31.setOpaque(true);

        imgICERem.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgICERem.setForeground(new java.awt.Color(255, 255, 255));
        imgICERem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgICERem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnICEStart)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(selICESpec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgICEPower)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnICEPower))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgICEHeat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnICEHeat))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgICERel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnICERel))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgICERig)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnICERig))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgICEWei)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnICEWei))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgICEFuel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnICEFuel)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgICERem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnICEFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selICESpec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnICEStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgICEFuel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnICEFuel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgICEPower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnICEPower))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgICEHeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnICEHeat, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(imgICERel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnICERel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnICERig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgICERig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgICEWei, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnICEWei, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgICERem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnICEFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabsEngine.addTab("  ICE  ", jPanel8);

        jPanel9.setBackground(new java.awt.Color(88, 103, 108));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel32.setBackground(new java.awt.Color(113, 132, 137));
        jLabel32.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel32.setText("Specification");
        jLabel32.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel32.setOpaque(true);

        selTCSpec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        selTCSpec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FER-TC19XX-01A" }));

        jLabel33.setBackground(new java.awt.Color(113, 132, 137));
        jLabel33.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel33.setText("Start Work");
        jLabel33.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel33.setOpaque(true);

        btnTCStart.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTCStart.setForeground(new java.awt.Color(255, 255, 255));
        btnTCStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTCStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnTCStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTCStartMouseClicked(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(113, 132, 137));
        jLabel34.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Data");
        jLabel34.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel34.setOpaque(true);

        jLabel35.setBackground(new java.awt.Color(113, 132, 137));
        jLabel35.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel35.setText("Power");
        jLabel35.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel35.setOpaque(true);

        jLabel36.setBackground(new java.awt.Color(113, 132, 137));
        jLabel36.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel36.setText("Heat");
        jLabel36.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel36.setOpaque(true);

        jLabel37.setBackground(new java.awt.Color(113, 132, 137));
        jLabel37.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel37.setText("Reliability");
        jLabel37.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel37.setOpaque(true);

        jLabel38.setBackground(new java.awt.Color(113, 132, 137));
        jLabel38.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel38.setText("Weight");
        jLabel38.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel38.setOpaque(true);

        imgTCPower.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgTCPower.setForeground(new java.awt.Color(255, 255, 255));
        imgTCPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnTCPower.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTCPower.setForeground(new java.awt.Color(255, 255, 255));
        btnTCPower.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTCPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgTCHeat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgTCHeat.setForeground(new java.awt.Color(255, 255, 255));
        imgTCHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnTCHeat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTCHeat.setForeground(new java.awt.Color(255, 255, 255));
        btnTCHeat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTCHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgTCRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgTCRel.setForeground(new java.awt.Color(255, 255, 255));
        imgTCRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnTCRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTCRel.setForeground(new java.awt.Color(255, 255, 255));
        btnTCRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTCRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgTCWei.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgTCWei.setForeground(new java.awt.Color(255, 255, 255));
        imgTCWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnTCWei.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTCWei.setForeground(new java.awt.Color(255, 255, 255));
        btnTCWei.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTCWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel47.setBackground(new java.awt.Color(113, 132, 137));
        jLabel47.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel47.setText("Confirm Specification");
        jLabel47.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel47.setOpaque(true);

        btnTCFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTCFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnTCFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTCFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnTCFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTCFinishMouseClicked(evt);
            }
        });

        jLabel48.setBackground(new java.awt.Color(113, 132, 137));
        jLabel48.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel48.setText("Remaining");
        jLabel48.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel48.setOpaque(true);

        imgTCRem.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgTCRem.setForeground(new java.awt.Color(255, 255, 255));
        imgTCRem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTCRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnTCStart)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(selTCSpec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgTCHeat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTCHeat))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgTCRel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTCRel))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgTCWei)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTCWei))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgTCPower)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTCPower)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgTCRem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTCFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selTCSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnTCStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgTCPower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnTCPower, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgTCHeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnTCHeat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgTCRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnTCRel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(imgTCWei, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTCWei, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgTCRem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTCFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabsEngine.addTab("Turbo", jPanel9);

        jPanel10.setBackground(new java.awt.Color(88, 103, 108));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel49.setBackground(new java.awt.Color(113, 132, 137));
        jLabel49.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel49.setText("Specification");
        jLabel49.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel49.setOpaque(true);

        selMGUHSpec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        selMGUHSpec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FER-MGUH19XX-01A" }));

        jLabel50.setBackground(new java.awt.Color(113, 132, 137));
        jLabel50.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel50.setText("Start Work");
        jLabel50.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel50.setOpaque(true);

        btnMGUHStart.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnMGUHStart.setForeground(new java.awt.Color(255, 255, 255));
        btnMGUHStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMGUHStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnMGUHStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMGUHStartMouseClicked(evt);
            }
        });

        jLabel51.setBackground(new java.awt.Color(113, 132, 137));
        jLabel51.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Data");
        jLabel51.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel51.setOpaque(true);

        jLabel52.setBackground(new java.awt.Color(113, 132, 137));
        jLabel52.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel52.setText("Power");
        jLabel52.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel52.setOpaque(true);

        jLabel53.setBackground(new java.awt.Color(113, 132, 137));
        jLabel53.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel53.setText("Heat");
        jLabel53.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel53.setOpaque(true);

        jLabel54.setBackground(new java.awt.Color(113, 132, 137));
        jLabel54.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel54.setText("Reliability");
        jLabel54.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel54.setOpaque(true);

        jLabel55.setBackground(new java.awt.Color(113, 132, 137));
        jLabel55.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel55.setText("Weight");
        jLabel55.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel55.setOpaque(true);

        imgMGUHPower.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgMGUHPower.setForeground(new java.awt.Color(255, 255, 255));
        imgMGUHPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnMGUHPower.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnMGUHPower.setForeground(new java.awt.Color(255, 255, 255));
        btnMGUHPower.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMGUHPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgMGUHHeat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgMGUHHeat.setForeground(new java.awt.Color(255, 255, 255));
        imgMGUHHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnMGUHHeat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnMGUHHeat.setForeground(new java.awt.Color(255, 255, 255));
        btnMGUHHeat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMGUHHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgMGUHRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgMGUHRel.setForeground(new java.awt.Color(255, 255, 255));
        imgMGUHRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnMGUHRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnMGUHRel.setForeground(new java.awt.Color(255, 255, 255));
        btnMGUHRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMGUHRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgMGUHWei.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgMGUHWei.setForeground(new java.awt.Color(255, 255, 255));
        imgMGUHWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnMGUHWei.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnMGUHWei.setForeground(new java.awt.Color(255, 255, 255));
        btnMGUHWei.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMGUHWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel95.setBackground(new java.awt.Color(113, 132, 137));
        jLabel95.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel95.setText("Confirm Specification");
        jLabel95.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel95.setOpaque(true);

        btnMGUHFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnMGUHFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnMGUHFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMGUHFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnMGUHFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMGUHFinishMouseClicked(evt);
            }
        });

        jLabel97.setBackground(new java.awt.Color(113, 132, 137));
        jLabel97.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel97.setText("Remaining");
        jLabel97.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel97.setOpaque(true);

        imgMGUHRem.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgMGUHRem.setForeground(new java.awt.Color(255, 255, 255));
        imgMGUHRem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMGUHRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(btnMGUHStart)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(selMGUHSpec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgMGUHHeat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMGUHHeat))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgMGUHRel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMGUHRel))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgMGUHWei)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMGUHWei))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgMGUHPower)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMGUHPower)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgMGUHRem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMGUHFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selMGUHSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMGUHStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel50))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgMGUHPower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnMGUHPower, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgMGUHHeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnMGUHHeat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgMGUHRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnMGUHRel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addComponent(imgMGUHWei, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMGUHWei, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgMGUHRem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMGUHFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabsEngine.addTab("MGU-H", jPanel10);

        jPanel11.setBackground(new java.awt.Color(88, 103, 108));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel99.setBackground(new java.awt.Color(113, 132, 137));
        jLabel99.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel99.setText("Specification");
        jLabel99.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel99.setOpaque(true);

        selMGUKSpec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        selMGUKSpec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FER-MGUK19XX-01A" }));

        jLabel100.setBackground(new java.awt.Color(113, 132, 137));
        jLabel100.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel100.setText("Start Work");
        jLabel100.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel100.setOpaque(true);

        btnMGUKStart.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnMGUKStart.setForeground(new java.awt.Color(255, 255, 255));
        btnMGUKStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMGUKStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnMGUKStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMGUKStartMouseClicked(evt);
            }
        });

        jLabel102.setBackground(new java.awt.Color(113, 132, 137));
        jLabel102.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("Data");
        jLabel102.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel102.setOpaque(true);

        jLabel103.setBackground(new java.awt.Color(113, 132, 137));
        jLabel103.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel103.setText("Power");
        jLabel103.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel103.setOpaque(true);

        jLabel104.setBackground(new java.awt.Color(113, 132, 137));
        jLabel104.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel104.setText("Heat");
        jLabel104.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel104.setOpaque(true);

        jLabel105.setBackground(new java.awt.Color(113, 132, 137));
        jLabel105.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel105.setText("Reliability");
        jLabel105.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel105.setOpaque(true);

        jLabel106.setBackground(new java.awt.Color(113, 132, 137));
        jLabel106.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel106.setText("Weight");
        jLabel106.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel106.setOpaque(true);

        imgMGUKPower.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgMGUKPower.setForeground(new java.awt.Color(255, 255, 255));
        imgMGUKPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnMGUKPower.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnMGUKPower.setForeground(new java.awt.Color(255, 255, 255));
        btnMGUKPower.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMGUKPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgMGUKHeat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgMGUKHeat.setForeground(new java.awt.Color(255, 255, 255));
        imgMGUKHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnMGUKHeat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnMGUKHeat.setForeground(new java.awt.Color(255, 255, 255));
        btnMGUKHeat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMGUKHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgMGUKRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgMGUKRel.setForeground(new java.awt.Color(255, 255, 255));
        imgMGUKRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnMGUKRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnMGUKRel.setForeground(new java.awt.Color(255, 255, 255));
        btnMGUKRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMGUKRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgMGUKWei.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgMGUKWei.setForeground(new java.awt.Color(255, 255, 255));
        imgMGUKWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnMGUKWei.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnMGUKWei.setForeground(new java.awt.Color(255, 255, 255));
        btnMGUKWei.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMGUKWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel121.setBackground(new java.awt.Color(113, 132, 137));
        jLabel121.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel121.setText("Confirm Specification");
        jLabel121.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel121.setOpaque(true);

        btnMGUKFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnMGUKFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnMGUKFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMGUKFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnMGUKFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMGUKFinishMouseClicked(evt);
            }
        });

        jLabel123.setBackground(new java.awt.Color(113, 132, 137));
        jLabel123.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel123.setText("Remaining");
        jLabel123.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel123.setOpaque(true);

        imgMGUKRem.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgMGUKRem.setForeground(new java.awt.Color(255, 255, 255));
        imgMGUKRem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMGUKRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(btnMGUKStart)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(selMGUKSpec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgMGUKHeat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMGUKHeat))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgMGUKRel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMGUKRel))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgMGUKWei)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMGUKWei))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgMGUKPower)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMGUKPower)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgMGUKRem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMGUKFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selMGUKSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMGUKStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel100))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel102)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgMGUKPower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnMGUKPower, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgMGUKHeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnMGUKHeat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgMGUKRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnMGUKRel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel106)
                    .addComponent(imgMGUKWei, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMGUKWei, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgMGUKRem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMGUKFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabsEngine.addTab("MGU-K", jPanel11);

        jPanel14.setBackground(new java.awt.Color(88, 103, 108));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel125.setBackground(new java.awt.Color(113, 132, 137));
        jLabel125.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel125.setText("Specification");
        jLabel125.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel125.setOpaque(true);

        selESSpec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        selESSpec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FER-ES19XX-01A" }));

        jLabel126.setBackground(new java.awt.Color(113, 132, 137));
        jLabel126.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel126.setText("Start Work");
        jLabel126.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel126.setOpaque(true);

        selESStart.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        selESStart.setForeground(new java.awt.Color(255, 255, 255));
        selESStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selESStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        selESStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selESStartMouseClicked(evt);
            }
        });

        jLabel128.setBackground(new java.awt.Color(113, 132, 137));
        jLabel128.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(255, 255, 255));
        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel128.setText("Data");
        jLabel128.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel128.setOpaque(true);

        jLabel129.setBackground(new java.awt.Color(113, 132, 137));
        jLabel129.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(255, 255, 255));
        jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel129.setText("Capacity");
        jLabel129.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel129.setOpaque(true);

        jLabel130.setBackground(new java.awt.Color(113, 132, 137));
        jLabel130.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(255, 255, 255));
        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel130.setText("Heat");
        jLabel130.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel130.setOpaque(true);

        jLabel131.setBackground(new java.awt.Color(113, 132, 137));
        jLabel131.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel131.setText("Reliability");
        jLabel131.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel131.setOpaque(true);

        jLabel132.setBackground(new java.awt.Color(113, 132, 137));
        jLabel132.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel132.setText("Weight");
        jLabel132.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel132.setOpaque(true);

        imgESCap.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgESCap.setForeground(new java.awt.Color(255, 255, 255));
        imgESCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnESCap.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnESCap.setForeground(new java.awt.Color(255, 255, 255));
        btnESCap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnESCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgESHeat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgESHeat.setForeground(new java.awt.Color(255, 255, 255));
        imgESHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnESHeat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnESHeat.setForeground(new java.awt.Color(255, 255, 255));
        btnESHeat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnESHeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgESRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgESRel.setForeground(new java.awt.Color(255, 255, 255));
        imgESRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnESRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnESRel.setForeground(new java.awt.Color(255, 255, 255));
        btnESRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnESRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgESWei.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgESWei.setForeground(new java.awt.Color(255, 255, 255));
        imgESWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnESWei.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnESWei.setForeground(new java.awt.Color(255, 255, 255));
        btnESWei.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnESWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel147.setBackground(new java.awt.Color(113, 132, 137));
        jLabel147.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(255, 255, 255));
        jLabel147.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel147.setText("Confirm Specification");
        jLabel147.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel147.setOpaque(true);

        btnESFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnESFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnESFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnESFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnESFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnESFinishMouseClicked(evt);
            }
        });

        jLabel149.setBackground(new java.awt.Color(113, 132, 137));
        jLabel149.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel149.setText("Remaining");
        jLabel149.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel149.setOpaque(true);

        imgESRem.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgESRem.setForeground(new java.awt.Color(255, 255, 255));
        imgESRem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgESRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel128, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel126, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel125, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(selESStart)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(selESSpec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgESHeat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnESHeat))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgESRel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnESRel))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgESWei)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnESWei))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgESCap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnESCap)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel147, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel149, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgESRem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnESFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selESSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(selESStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel126))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel128)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgESCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnESCap, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel130, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgESHeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnESHeat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgESRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnESRel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel132)
                    .addComponent(imgESWei, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnESWei, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel149, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgESRem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel147, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnESFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabsEngine.addTab("  ES  ", jPanel14);

        jPanel15.setBackground(new java.awt.Color(88, 103, 108));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel151.setBackground(new java.awt.Color(113, 132, 137));
        jLabel151.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(255, 255, 255));
        jLabel151.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel151.setText("Specification");
        jLabel151.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel151.setOpaque(true);

        selCESpec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        selCESpec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FER-CE19XX-01A" }));

        jLabel152.setBackground(new java.awt.Color(113, 132, 137));
        jLabel152.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(255, 255, 255));
        jLabel152.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel152.setText("Start Work");
        jLabel152.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel152.setOpaque(true);

        btnCEStart.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCEStart.setForeground(new java.awt.Color(255, 255, 255));
        btnCEStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCEStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnCEStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCEStartMouseClicked(evt);
            }
        });

        jLabel154.setBackground(new java.awt.Color(113, 132, 137));
        jLabel154.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(255, 255, 255));
        jLabel154.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel154.setText("Data");
        jLabel154.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel154.setOpaque(true);

        jLabel155.setBackground(new java.awt.Color(113, 132, 137));
        jLabel155.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(255, 255, 255));
        jLabel155.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel155.setText("Reliability");
        jLabel155.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel155.setOpaque(true);

        jLabel156.setBackground(new java.awt.Color(113, 132, 137));
        jLabel156.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(255, 255, 255));
        jLabel156.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel156.setText("Rigidity");
        jLabel156.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel156.setOpaque(true);

        jLabel157.setBackground(new java.awt.Color(113, 132, 137));
        jLabel157.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel157.setText("Weight");
        jLabel157.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel157.setOpaque(true);

        imgCERel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCERel.setForeground(new java.awt.Color(255, 255, 255));
        imgCERel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnCERel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCERel.setForeground(new java.awt.Color(255, 255, 255));
        btnCERel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCERel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgCERig.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCERig.setForeground(new java.awt.Color(255, 255, 255));
        imgCERig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnCERig.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCERig.setForeground(new java.awt.Color(255, 255, 255));
        btnCERig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCERig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgCEWei.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCEWei.setForeground(new java.awt.Color(255, 255, 255));
        imgCEWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnCEWei.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCEWei.setForeground(new java.awt.Color(255, 255, 255));
        btnCEWei.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCEWei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel173.setBackground(new java.awt.Color(113, 132, 137));
        jLabel173.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel173.setForeground(new java.awt.Color(255, 255, 255));
        jLabel173.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel173.setText("Confirm Specification");
        jLabel173.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel173.setOpaque(true);

        btnCEFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCEFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnCEFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCEFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnCEFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCEFinishMouseClicked(evt);
            }
        });

        jLabel175.setBackground(new java.awt.Color(113, 132, 137));
        jLabel175.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(255, 255, 255));
        jLabel175.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel175.setText("Remaining");
        jLabel175.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel175.setOpaque(true);

        imgCERem.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCERem.setForeground(new java.awt.Color(255, 255, 255));
        imgCERem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCERem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel152, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel151, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(btnCEStart)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(selCESpec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgCERig)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCERig))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgCEWei)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCEWei))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgCERel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCERel)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel173, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel175, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgCERem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCEFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selCESpec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel151, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCEStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel152))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel154)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel155, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgCERel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnCERel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel156, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgCERig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnCERig))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel157, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgCEWei, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnCEWei, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel175, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgCERem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel173, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCEFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabsEngine.addTab("  CE  ", jPanel15);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabsEngine)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabsEngine)
                .addContainerGap())
        );

        jPanel1.add(jPanel5);

        jTabbedPane1.addTab("Engine", jPanel1);

        jPanel2.setBackground(new java.awt.Color(88, 103, 108));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 10, 10));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(2, 1, 10, 10));

        jPanel16.setOpaque(false);

        jLabel20.setBackground(new java.awt.Color(113, 132, 137));
        jLabel20.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Contract");
        jLabel20.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel20.setOpaque(true);

        jLabel39.setBackground(new java.awt.Color(113, 132, 137));
        jLabel39.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel39.setText("Supplier");
        jLabel39.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel39.setOpaque(true);

        lblFuelSupplier.setBackground(new java.awt.Color(113, 132, 137));
        lblFuelSupplier.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblFuelSupplier.setForeground(new java.awt.Color(255, 255, 255));
        lblFuelSupplier.setText(" ");
        lblFuelSupplier.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblFuelSupplier.setOpaque(true);

        jLabel45.setBackground(new java.awt.Color(113, 132, 137));
        jLabel45.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel45.setText("Contract");
        jLabel45.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel45.setOpaque(true);

        lblFuelContract.setBackground(new java.awt.Color(113, 132, 137));
        lblFuelContract.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblFuelContract.setForeground(new java.awt.Color(255, 255, 255));
        lblFuelContract.setText(" ");
        lblFuelContract.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblFuelContract.setOpaque(true);

        lblFuelRD.setBackground(new java.awt.Color(113, 132, 137));
        lblFuelRD.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblFuelRD.setForeground(new java.awt.Color(255, 255, 255));
        lblFuelRD.setText(" ");
        lblFuelRD.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblFuelRD.setOpaque(true);

        jLabel57.setBackground(new java.awt.Color(113, 132, 137));
        jLabel57.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel57.setText("R&D");
        jLabel57.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel57.setOpaque(true);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFuelSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFuelContract, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFuelRD, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(lblFuelSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(lblFuelContract, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(lblFuelRD, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel16);

        jPanel17.setOpaque(false);

        jLabel65.setBackground(new java.awt.Color(113, 132, 137));
        jLabel65.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Testing");
        jLabel65.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel65.setOpaque(true);

        jLabel83.setBackground(new java.awt.Color(113, 132, 137));
        jLabel83.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel83.setText("Testing");
        jLabel83.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel83.setOpaque(true);

        imgFuelTesting.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgFuelTesting.setForeground(new java.awt.Color(255, 255, 255));
        imgFuelTesting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel91.setBackground(new java.awt.Color(113, 132, 137));
        jLabel91.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel91.setText("Start Work");
        jLabel91.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel91.setOpaque(true);

        btnFuelStart.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnFuelStart.setForeground(new java.awt.Color(255, 255, 255));
        btnFuelStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFuelStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnFuelStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFuelStartMouseClicked(evt);
            }
        });

        jLabel93.setBackground(new java.awt.Color(113, 132, 137));
        jLabel93.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel93.setText("Remapping");
        jLabel93.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel93.setOpaque(true);

        imgFuelRemap.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgFuelRemap.setForeground(new java.awt.Color(255, 255, 255));
        imgFuelRemap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFuelRemap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnFuelRemap.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnFuelRemap.setForeground(new java.awt.Color(255, 255, 255));
        btnFuelRemap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFuelRemap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnFuelRemap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFuelRemapMouseClicked(evt);
            }
        });

        jLabel108.setBackground(new java.awt.Color(113, 132, 137));
        jLabel108.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel108.setText("Improvement");
        jLabel108.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel108.setOpaque(true);

        imgFuelImprove.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgFuelImprove.setForeground(new java.awt.Color(255, 255, 255));
        imgFuelImprove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFuelImprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnFuelImprove.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnFuelImprove.setForeground(new java.awt.Color(255, 255, 255));
        btnFuelImprove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFuelImprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnFuelImprove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFuelImproveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel108, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFuelStart)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(imgFuelRemap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFuelRemap))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(imgFuelImprove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFuelImprove))
                            .addComponent(imgFuelTesting))
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83)
                    .addComponent(imgFuelTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFuelStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgFuelRemap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFuelRemap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgFuelImprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFuelImprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel17);

        jPanel2.add(jPanel6);

        jPanel7.setOpaque(false);

        jLabel158.setBackground(new java.awt.Color(113, 132, 137));
        jLabel158.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(255, 255, 255));
        jLabel158.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel158.setText("Specification");
        jLabel158.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel158.setOpaque(true);

        selFuelSpec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        selFuelSpec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SHL-19XX-01A" }));

        jLabel159.setBackground(new java.awt.Color(113, 132, 137));
        jLabel159.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel159.setText("Start Work");
        jLabel159.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel159.setOpaque(true);

        btnSelectSpec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnSelectSpec.setForeground(new java.awt.Color(255, 255, 255));
        btnSelectSpec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSelectSpec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnSelectSpec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectSpecMouseClicked(evt);
            }
        });

        jLabel167.setBackground(new java.awt.Color(113, 132, 137));
        jLabel167.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(255, 255, 255));
        jLabel167.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel167.setText("Data");
        jLabel167.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel167.setOpaque(true);

        jLabel168.setBackground(new java.awt.Color(113, 132, 137));
        jLabel168.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(255, 255, 255));
        jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel168.setText("Performance");
        jLabel168.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel168.setOpaque(true);

        jLabel169.setBackground(new java.awt.Color(113, 132, 137));
        jLabel169.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(255, 255, 255));
        jLabel169.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel169.setText("Engine Tolerance");
        jLabel169.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel169.setOpaque(true);

        imgFuelPerf.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgFuelPerf.setForeground(new java.awt.Color(255, 255, 255));
        imgFuelPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnFuelPerf.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnFuelPerf.setForeground(new java.awt.Color(255, 255, 255));
        btnFuelPerf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFuelPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgFuelToler.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgFuelToler.setForeground(new java.awt.Color(255, 255, 255));
        imgFuelToler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnFuelToler.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnFuelToler.setForeground(new java.awt.Color(255, 255, 255));
        btnFuelToler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFuelToler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel181.setBackground(new java.awt.Color(113, 132, 137));
        jLabel181.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel181.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel181.setText("Confirm Specification");
        jLabel181.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel181.setOpaque(true);

        btnFuelFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnFuelFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnFuelFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFuelFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnFuelFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFuelFinishMouseClicked(evt);
            }
        });

        jLabel183.setBackground(new java.awt.Color(113, 132, 137));
        jLabel183.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(255, 255, 255));
        jLabel183.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel183.setText("Remaining");
        jLabel183.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel183.setOpaque(true);

        imgFuelRem.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgFuelRem.setForeground(new java.awt.Color(255, 255, 255));
        imgFuelRem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFuelRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel167, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel159, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel158, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnSelectSpec)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(selFuelSpec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel181, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel183, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgFuelRem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFuelFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel169, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel168, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(imgFuelPerf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFuelPerf))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(imgFuelToler)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFuelToler)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selFuelSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel158, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSelectSpec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel159))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel167)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel168, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgFuelPerf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel169, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imgFuelToler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnFuelToler))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel183, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgFuelRem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel181, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFuelFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnFuelPerf)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.add(jPanel7);

        jTabbedPane1.addTab("Fuel", jPanel2);

        jPanel3.setBackground(new java.awt.Color(88, 103, 108));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(1, 2, 10, 10));

        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.GridLayout(2, 1, 10, 10));

        jPanel20.setOpaque(false);

        jLabel119.setBackground(new java.awt.Color(113, 132, 137));
        jLabel119.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setText("Contract");
        jLabel119.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel119.setOpaque(true);

        jLabel120.setBackground(new java.awt.Color(113, 132, 137));
        jLabel120.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel120.setText("Supplier");
        jLabel120.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel120.setOpaque(true);

        lblTyreSupplier.setBackground(new java.awt.Color(113, 132, 137));
        lblTyreSupplier.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTyreSupplier.setForeground(new java.awt.Color(255, 255, 255));
        lblTyreSupplier.setText(" ");
        lblTyreSupplier.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTyreSupplier.setOpaque(true);

        jLabel134.setBackground(new java.awt.Color(113, 132, 137));
        jLabel134.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(255, 255, 255));
        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel134.setText("Contract");
        jLabel134.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel134.setOpaque(true);

        lblTyreContract.setBackground(new java.awt.Color(113, 132, 137));
        lblTyreContract.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTyreContract.setForeground(new java.awt.Color(255, 255, 255));
        lblTyreContract.setText(" ");
        lblTyreContract.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTyreContract.setOpaque(true);

        lblTyreRD.setBackground(new java.awt.Color(113, 132, 137));
        lblTyreRD.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTyreRD.setForeground(new java.awt.Color(255, 255, 255));
        lblTyreRD.setText(" ");
        lblTyreRD.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTyreRD.setOpaque(true);

        jLabel145.setBackground(new java.awt.Color(113, 132, 137));
        jLabel145.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(255, 255, 255));
        jLabel145.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel145.setText("R&D");
        jLabel145.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel145.setOpaque(true);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTyreSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTyreContract, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTyreRD, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel119)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(lblTyreSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(lblTyreContract, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel145)
                    .addComponent(lblTyreRD, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jPanel18.add(jPanel20);

        jPanel21.setOpaque(false);

        jLabel146.setBackground(new java.awt.Color(113, 132, 137));
        jLabel146.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(255, 255, 255));
        jLabel146.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel146.setText("Testing");
        jLabel146.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel146.setOpaque(true);

        jLabel170.setBackground(new java.awt.Color(113, 132, 137));
        jLabel170.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(255, 255, 255));
        jLabel170.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel170.setText("Testing");
        jLabel170.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel170.setOpaque(true);

        imgTyreTesting.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgTyreTesting.setForeground(new java.awt.Color(255, 255, 255));
        imgTyreTesting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel180.setBackground(new java.awt.Color(113, 132, 137));
        jLabel180.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(255, 255, 255));
        jLabel180.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel180.setText("Start Work");
        jLabel180.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel180.setOpaque(true);

        btnTyreStart.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTyreStart.setForeground(new java.awt.Color(255, 255, 255));
        btnTyreStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTyreStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnTyreStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTyreStartMouseClicked(evt);
            }
        });

        jLabel186.setBackground(new java.awt.Color(113, 132, 137));
        jLabel186.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(255, 255, 255));
        jLabel186.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel186.setText("Remapping");
        jLabel186.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel186.setOpaque(true);

        imgTyreRemap.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgTyreRemap.setForeground(new java.awt.Color(255, 255, 255));
        imgTyreRemap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTyreRemap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnTyreRemap.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTyreRemap.setForeground(new java.awt.Color(255, 255, 255));
        btnTyreRemap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTyreRemap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnTyreRemap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTyreRemapMouseClicked(evt);
            }
        });

        jLabel189.setBackground(new java.awt.Color(113, 132, 137));
        jLabel189.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel189.setForeground(new java.awt.Color(255, 255, 255));
        jLabel189.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel189.setText("Improvement");
        jLabel189.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel189.setOpaque(true);

        imgTyreImprove.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgTyreImprove.setForeground(new java.awt.Color(255, 255, 255));
        imgTyreImprove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTyreImprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnTyreImprove.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTyreImprove.setForeground(new java.awt.Color(255, 255, 255));
        btnTyreImprove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTyreImprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnTyreImprove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTyreImproveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel146, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel180, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel186, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel189, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel170, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTyreStart)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(imgTyreRemap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTyreRemap))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(imgTyreImprove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTyreImprove))
                            .addComponent(imgTyreTesting))
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel146)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel170)
                    .addComponent(imgTyreTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTyreStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel180, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel186, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgTyreRemap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTyreRemap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel189, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgTyreImprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTyreImprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jPanel18.add(jPanel21);

        jPanel3.add(jPanel18);

        jPanel19.setOpaque(false);

        tabsTyres.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N

        jPanel22.setBackground(new java.awt.Color(88, 103, 108));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel192.setBackground(new java.awt.Color(113, 132, 137));
        jLabel192.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(255, 255, 255));
        jLabel192.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel192.setText("Specification");
        jLabel192.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel192.setOpaque(true);

        selC1Spec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        selC1Spec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIR-C119XX-01A" }));

        jLabel193.setBackground(new java.awt.Color(113, 132, 137));
        jLabel193.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel193.setForeground(new java.awt.Color(255, 255, 255));
        jLabel193.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel193.setText("Start Work");
        jLabel193.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel193.setOpaque(true);

        btnC1Start.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC1Start.setForeground(new java.awt.Color(255, 255, 255));
        btnC1Start.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC1Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnC1Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnC1StartMouseClicked(evt);
            }
        });

        jLabel195.setBackground(new java.awt.Color(113, 132, 137));
        jLabel195.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel195.setForeground(new java.awt.Color(255, 255, 255));
        jLabel195.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel195.setText("Data");
        jLabel195.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel195.setOpaque(true);

        jLabel196.setBackground(new java.awt.Color(113, 132, 137));
        jLabel196.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(255, 255, 255));
        jLabel196.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel196.setText("Grip");
        jLabel196.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel196.setOpaque(true);

        jLabel197.setBackground(new java.awt.Color(113, 132, 137));
        jLabel197.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(255, 255, 255));
        jLabel197.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel197.setText("Resilience");
        jLabel197.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel197.setOpaque(true);

        jLabel198.setBackground(new java.awt.Color(113, 132, 137));
        jLabel198.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel198.setForeground(new java.awt.Color(255, 255, 255));
        jLabel198.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel198.setText("Stiffness");
        jLabel198.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel198.setOpaque(true);

        jLabel199.setBackground(new java.awt.Color(113, 132, 137));
        jLabel199.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel199.setForeground(new java.awt.Color(255, 255, 255));
        jLabel199.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel199.setText("Heat");
        jLabel199.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel199.setOpaque(true);

        imgC1Grip.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC1Grip.setForeground(new java.awt.Color(255, 255, 255));
        imgC1Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC1Grip.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC1Grip.setForeground(new java.awt.Color(255, 255, 255));
        btnC1Grip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC1Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC1Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC1Res.setForeground(new java.awt.Color(255, 255, 255));
        imgC1Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC1Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC1Res.setForeground(new java.awt.Color(255, 255, 255));
        btnC1Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC1Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC1Stiff.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC1Stiff.setForeground(new java.awt.Color(255, 255, 255));
        imgC1Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC1Stiff.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC1Stiff.setForeground(new java.awt.Color(255, 255, 255));
        btnC1Stiff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC1Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC1Heat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC1Heat.setForeground(new java.awt.Color(255, 255, 255));
        imgC1Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC1Heat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC1Heat.setForeground(new java.awt.Color(255, 255, 255));
        btnC1Heat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC1Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel214.setBackground(new java.awt.Color(113, 132, 137));
        jLabel214.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel214.setForeground(new java.awt.Color(255, 255, 255));
        jLabel214.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel214.setText("Confirm Specification");
        jLabel214.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel214.setOpaque(true);

        btnC1Finish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC1Finish.setForeground(new java.awt.Color(255, 255, 255));
        btnC1Finish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC1Finish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnC1Finish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnC1FinishMouseClicked(evt);
            }
        });

        jLabel216.setBackground(new java.awt.Color(113, 132, 137));
        jLabel216.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel216.setForeground(new java.awt.Color(255, 255, 255));
        jLabel216.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel216.setText("Remaining");
        jLabel216.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel216.setOpaque(true);

        imgC1Rem.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC1Rem.setForeground(new java.awt.Color(255, 255, 255));
        imgC1Rem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgC1Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel195, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel193, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel192, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(btnC1Start)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(selC1Spec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel197, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC1Res)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC1Res))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC1Stiff)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC1Stiff))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC1Heat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC1Heat))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC1Grip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC1Grip)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel214, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel216, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgC1Rem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnC1Finish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selC1Spec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel192, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnC1Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel193))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel195)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel196, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgC1Grip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnC1Grip, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel197, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgC1Res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnC1Res))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel198, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgC1Stiff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnC1Stiff, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel199)
                    .addComponent(imgC1Heat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC1Heat, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel216, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgC1Rem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel214, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnC1Finish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabsTyres.addTab("C1", jPanel22);

        jPanel23.setBackground(new java.awt.Color(88, 103, 108));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel218.setBackground(new java.awt.Color(113, 132, 137));
        jLabel218.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel218.setForeground(new java.awt.Color(255, 255, 255));
        jLabel218.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel218.setText("Specification");
        jLabel218.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel218.setOpaque(true);

        selC2Spec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        selC2Spec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIR-C219XX-01A" }));

        jLabel219.setBackground(new java.awt.Color(113, 132, 137));
        jLabel219.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel219.setForeground(new java.awt.Color(255, 255, 255));
        jLabel219.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel219.setText("Start Work");
        jLabel219.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel219.setOpaque(true);

        btnC2Start.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC2Start.setForeground(new java.awt.Color(255, 255, 255));
        btnC2Start.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC2Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnC2Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnC2StartMouseClicked(evt);
            }
        });

        jLabel221.setBackground(new java.awt.Color(113, 132, 137));
        jLabel221.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel221.setForeground(new java.awt.Color(255, 255, 255));
        jLabel221.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel221.setText("Data");
        jLabel221.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel221.setOpaque(true);

        jLabel222.setBackground(new java.awt.Color(113, 132, 137));
        jLabel222.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel222.setForeground(new java.awt.Color(255, 255, 255));
        jLabel222.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel222.setText("Grip");
        jLabel222.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel222.setOpaque(true);

        jLabel223.setBackground(new java.awt.Color(113, 132, 137));
        jLabel223.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel223.setForeground(new java.awt.Color(255, 255, 255));
        jLabel223.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel223.setText("Resilience");
        jLabel223.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel223.setOpaque(true);

        jLabel224.setBackground(new java.awt.Color(113, 132, 137));
        jLabel224.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel224.setForeground(new java.awt.Color(255, 255, 255));
        jLabel224.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel224.setText("Stiffness");
        jLabel224.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel224.setOpaque(true);

        jLabel225.setBackground(new java.awt.Color(113, 132, 137));
        jLabel225.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel225.setForeground(new java.awt.Color(255, 255, 255));
        jLabel225.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel225.setText("Heat");
        jLabel225.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel225.setOpaque(true);

        imgC2Grip.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC2Grip.setForeground(new java.awt.Color(255, 255, 255));
        imgC2Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC2Grip.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC2Grip.setForeground(new java.awt.Color(255, 255, 255));
        btnC2Grip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC2Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC2Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC2Res.setForeground(new java.awt.Color(255, 255, 255));
        imgC2Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC2Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC2Res.setForeground(new java.awt.Color(255, 255, 255));
        btnC2Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC2Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC2Stiff.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC2Stiff.setForeground(new java.awt.Color(255, 255, 255));
        imgC2Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC2Stiff.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC2Stiff.setForeground(new java.awt.Color(255, 255, 255));
        btnC2Stiff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC2Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC2Heat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC2Heat.setForeground(new java.awt.Color(255, 255, 255));
        imgC2Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC2Heat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC2Heat.setForeground(new java.awt.Color(255, 255, 255));
        btnC2Heat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC2Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel234.setBackground(new java.awt.Color(113, 132, 137));
        jLabel234.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel234.setForeground(new java.awt.Color(255, 255, 255));
        jLabel234.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel234.setText("Confirm Specification");
        jLabel234.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel234.setOpaque(true);

        btnC2Finish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC2Finish.setForeground(new java.awt.Color(255, 255, 255));
        btnC2Finish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC2Finish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnC2Finish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnC2FinishMouseClicked(evt);
            }
        });

        jLabel236.setBackground(new java.awt.Color(113, 132, 137));
        jLabel236.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel236.setForeground(new java.awt.Color(255, 255, 255));
        jLabel236.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel236.setText("Remaining");
        jLabel236.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel236.setOpaque(true);

        imgC2Rem.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC2Rem.setForeground(new java.awt.Color(255, 255, 255));
        imgC2Rem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgC2Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel221, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel219, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel218, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(btnC2Start)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(selC2Spec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel223, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC2Res)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC2Res))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel224, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC2Stiff)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC2Stiff))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel225, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC2Heat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC2Heat))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel222, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC2Grip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC2Grip)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel234, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel236, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgC2Rem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnC2Finish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selC2Spec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel218, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnC2Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel219))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel221)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel222, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgC2Grip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnC2Grip, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel223, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgC2Res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnC2Res))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel224, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgC2Stiff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnC2Stiff, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel225)
                    .addComponent(imgC2Heat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC2Heat, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel236, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgC2Rem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel234, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnC2Finish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabsTyres.addTab("C2", jPanel23);

        jPanel24.setBackground(new java.awt.Color(88, 103, 108));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel238.setBackground(new java.awt.Color(113, 132, 137));
        jLabel238.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel238.setForeground(new java.awt.Color(255, 255, 255));
        jLabel238.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel238.setText("Specification");
        jLabel238.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel238.setOpaque(true);

        selC3Spec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        selC3Spec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIR-C319XX-01A" }));

        jLabel239.setBackground(new java.awt.Color(113, 132, 137));
        jLabel239.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel239.setForeground(new java.awt.Color(255, 255, 255));
        jLabel239.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel239.setText("Start Work");
        jLabel239.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel239.setOpaque(true);

        btnC3Start.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC3Start.setForeground(new java.awt.Color(255, 255, 255));
        btnC3Start.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC3Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnC3Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnC3StartMouseClicked(evt);
            }
        });

        jLabel241.setBackground(new java.awt.Color(113, 132, 137));
        jLabel241.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel241.setForeground(new java.awt.Color(255, 255, 255));
        jLabel241.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel241.setText("Data");
        jLabel241.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel241.setOpaque(true);

        jLabel242.setBackground(new java.awt.Color(113, 132, 137));
        jLabel242.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel242.setForeground(new java.awt.Color(255, 255, 255));
        jLabel242.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel242.setText("Grip");
        jLabel242.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel242.setOpaque(true);

        jLabel243.setBackground(new java.awt.Color(113, 132, 137));
        jLabel243.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel243.setForeground(new java.awt.Color(255, 255, 255));
        jLabel243.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel243.setText("Resilience");
        jLabel243.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel243.setOpaque(true);

        jLabel244.setBackground(new java.awt.Color(113, 132, 137));
        jLabel244.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel244.setForeground(new java.awt.Color(255, 255, 255));
        jLabel244.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel244.setText("Stiffness");
        jLabel244.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel244.setOpaque(true);

        jLabel245.setBackground(new java.awt.Color(113, 132, 137));
        jLabel245.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel245.setForeground(new java.awt.Color(255, 255, 255));
        jLabel245.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel245.setText("Heat");
        jLabel245.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel245.setOpaque(true);

        imgC3Grip.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC3Grip.setForeground(new java.awt.Color(255, 255, 255));
        imgC3Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC3Grip.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC3Grip.setForeground(new java.awt.Color(255, 255, 255));
        btnC3Grip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC3Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC3Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC3Res.setForeground(new java.awt.Color(255, 255, 255));
        imgC3Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC3Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC3Res.setForeground(new java.awt.Color(255, 255, 255));
        btnC3Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC3Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC3Stiff.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC3Stiff.setForeground(new java.awt.Color(255, 255, 255));
        imgC3Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC3Stiff.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC3Stiff.setForeground(new java.awt.Color(255, 255, 255));
        btnC3Stiff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC3Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC3Heat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC3Heat.setForeground(new java.awt.Color(255, 255, 255));
        imgC3Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC3Heat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC3Heat.setForeground(new java.awt.Color(255, 255, 255));
        btnC3Heat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC3Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel254.setBackground(new java.awt.Color(113, 132, 137));
        jLabel254.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel254.setForeground(new java.awt.Color(255, 255, 255));
        jLabel254.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel254.setText("Confirm Specification");
        jLabel254.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel254.setOpaque(true);

        btnC3Finish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC3Finish.setForeground(new java.awt.Color(255, 255, 255));
        btnC3Finish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC3Finish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnC3Finish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnC3FinishMouseClicked(evt);
            }
        });

        jLabel256.setBackground(new java.awt.Color(113, 132, 137));
        jLabel256.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel256.setForeground(new java.awt.Color(255, 255, 255));
        jLabel256.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel256.setText("Remaining");
        jLabel256.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel256.setOpaque(true);

        imgC3Rem.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC3Rem.setForeground(new java.awt.Color(255, 255, 255));
        imgC3Rem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgC3Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel241, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel239, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel238, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(btnC3Start)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(selC3Spec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel243, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC3Res)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC3Res))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel244, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC3Stiff)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC3Stiff))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel245, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC3Heat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC3Heat))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel242, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC3Grip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC3Grip)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel254, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel256, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgC3Rem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnC3Finish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selC3Spec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel238, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnC3Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel239))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel241)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel242, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgC3Grip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnC3Grip, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel243, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgC3Res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnC3Res))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel244, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgC3Stiff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnC3Stiff, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel245)
                    .addComponent(imgC3Heat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC3Heat, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel256, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgC3Rem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel254, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnC3Finish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabsTyres.addTab("C3", jPanel24);

        jPanel25.setBackground(new java.awt.Color(88, 103, 108));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel258.setBackground(new java.awt.Color(113, 132, 137));
        jLabel258.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel258.setForeground(new java.awt.Color(255, 255, 255));
        jLabel258.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel258.setText("Specification");
        jLabel258.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel258.setOpaque(true);

        selC4Spec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        selC4Spec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIR-C419XX-01A" }));

        jLabel259.setBackground(new java.awt.Color(113, 132, 137));
        jLabel259.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel259.setForeground(new java.awt.Color(255, 255, 255));
        jLabel259.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel259.setText("Start Work");
        jLabel259.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel259.setOpaque(true);

        btnC4Start.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC4Start.setForeground(new java.awt.Color(255, 255, 255));
        btnC4Start.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC4Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnC4Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnC4StartMouseClicked(evt);
            }
        });

        jLabel261.setBackground(new java.awt.Color(113, 132, 137));
        jLabel261.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel261.setForeground(new java.awt.Color(255, 255, 255));
        jLabel261.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel261.setText("Data");
        jLabel261.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel261.setOpaque(true);

        jLabel262.setBackground(new java.awt.Color(113, 132, 137));
        jLabel262.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel262.setForeground(new java.awt.Color(255, 255, 255));
        jLabel262.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel262.setText("Grip");
        jLabel262.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel262.setOpaque(true);

        jLabel263.setBackground(new java.awt.Color(113, 132, 137));
        jLabel263.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel263.setForeground(new java.awt.Color(255, 255, 255));
        jLabel263.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel263.setText("Resilience");
        jLabel263.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel263.setOpaque(true);

        jLabel264.setBackground(new java.awt.Color(113, 132, 137));
        jLabel264.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel264.setForeground(new java.awt.Color(255, 255, 255));
        jLabel264.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel264.setText("Stiffness");
        jLabel264.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel264.setOpaque(true);

        jLabel265.setBackground(new java.awt.Color(113, 132, 137));
        jLabel265.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel265.setForeground(new java.awt.Color(255, 255, 255));
        jLabel265.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel265.setText("Heat");
        jLabel265.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel265.setOpaque(true);

        imgC4Grip.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC4Grip.setForeground(new java.awt.Color(255, 255, 255));
        imgC4Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC4Grip.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC4Grip.setForeground(new java.awt.Color(255, 255, 255));
        btnC4Grip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC4Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC4Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC4Res.setForeground(new java.awt.Color(255, 255, 255));
        imgC4Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC4Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC4Res.setForeground(new java.awt.Color(255, 255, 255));
        btnC4Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC4Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC4Stiff.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC4Stiff.setForeground(new java.awt.Color(255, 255, 255));
        imgC4Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC4Stiff.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC4Stiff.setForeground(new java.awt.Color(255, 255, 255));
        btnC4Stiff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC4Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC4Heat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC4Heat.setForeground(new java.awt.Color(255, 255, 255));
        imgC4Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC4Heat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC4Heat.setForeground(new java.awt.Color(255, 255, 255));
        btnC4Heat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC4Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel274.setBackground(new java.awt.Color(113, 132, 137));
        jLabel274.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel274.setForeground(new java.awt.Color(255, 255, 255));
        jLabel274.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel274.setText("Confirm Specification");
        jLabel274.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel274.setOpaque(true);

        btnC4Finish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC4Finish.setForeground(new java.awt.Color(255, 255, 255));
        btnC4Finish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC4Finish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnC4Finish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnC4FinishMouseClicked(evt);
            }
        });

        jLabel276.setBackground(new java.awt.Color(113, 132, 137));
        jLabel276.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel276.setForeground(new java.awt.Color(255, 255, 255));
        jLabel276.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel276.setText("Remaining");
        jLabel276.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel276.setOpaque(true);

        imgC4Rem.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC4Rem.setForeground(new java.awt.Color(255, 255, 255));
        imgC4Rem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgC4Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel261, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel259, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel258, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(btnC4Start)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(selC4Spec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel263, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC4Res)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC4Res))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel264, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC4Stiff)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC4Stiff))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel265, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC4Heat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC4Heat))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel262, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC4Grip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC4Grip)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel274, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel276, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgC4Rem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnC4Finish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selC4Spec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel258, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnC4Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel259))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel261)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel262, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgC4Grip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnC4Grip, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel263, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgC4Res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnC4Res))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel264, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgC4Stiff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnC4Stiff, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel265)
                    .addComponent(imgC4Heat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC4Heat, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel276, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgC4Rem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel274, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnC4Finish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabsTyres.addTab("C4", jPanel25);

        jPanel26.setBackground(new java.awt.Color(88, 103, 108));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel278.setBackground(new java.awt.Color(113, 132, 137));
        jLabel278.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel278.setForeground(new java.awt.Color(255, 255, 255));
        jLabel278.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel278.setText("Specification");
        jLabel278.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel278.setOpaque(true);

        selC5Spec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        selC5Spec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIR-C519XX-01A" }));

        jLabel279.setBackground(new java.awt.Color(113, 132, 137));
        jLabel279.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel279.setForeground(new java.awt.Color(255, 255, 255));
        jLabel279.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel279.setText("Start Work");
        jLabel279.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel279.setOpaque(true);

        btnC5Start.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC5Start.setForeground(new java.awt.Color(255, 255, 255));
        btnC5Start.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC5Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnC5Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnC5StartMouseClicked(evt);
            }
        });

        jLabel281.setBackground(new java.awt.Color(113, 132, 137));
        jLabel281.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel281.setForeground(new java.awt.Color(255, 255, 255));
        jLabel281.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel281.setText("Data");
        jLabel281.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel281.setOpaque(true);

        jLabel282.setBackground(new java.awt.Color(113, 132, 137));
        jLabel282.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel282.setForeground(new java.awt.Color(255, 255, 255));
        jLabel282.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel282.setText("Grip");
        jLabel282.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel282.setOpaque(true);

        jLabel283.setBackground(new java.awt.Color(113, 132, 137));
        jLabel283.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel283.setForeground(new java.awt.Color(255, 255, 255));
        jLabel283.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel283.setText("Resilience");
        jLabel283.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel283.setOpaque(true);

        jLabel284.setBackground(new java.awt.Color(113, 132, 137));
        jLabel284.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel284.setForeground(new java.awt.Color(255, 255, 255));
        jLabel284.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel284.setText("Stiffness");
        jLabel284.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel284.setOpaque(true);

        jLabel285.setBackground(new java.awt.Color(113, 132, 137));
        jLabel285.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel285.setForeground(new java.awt.Color(255, 255, 255));
        jLabel285.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel285.setText("Heat");
        jLabel285.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel285.setOpaque(true);

        imgC5Grip.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC5Grip.setForeground(new java.awt.Color(255, 255, 255));
        imgC5Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC5Grip.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC5Grip.setForeground(new java.awt.Color(255, 255, 255));
        btnC5Grip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC5Grip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC5Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC5Res.setForeground(new java.awt.Color(255, 255, 255));
        imgC5Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC5Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC5Res.setForeground(new java.awt.Color(255, 255, 255));
        btnC5Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC5Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC5Stiff.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC5Stiff.setForeground(new java.awt.Color(255, 255, 255));
        imgC5Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC5Stiff.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC5Stiff.setForeground(new java.awt.Color(255, 255, 255));
        btnC5Stiff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC5Stiff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgC5Heat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC5Heat.setForeground(new java.awt.Color(255, 255, 255));
        imgC5Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnC5Heat.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC5Heat.setForeground(new java.awt.Color(255, 255, 255));
        btnC5Heat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC5Heat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel294.setBackground(new java.awt.Color(113, 132, 137));
        jLabel294.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel294.setForeground(new java.awt.Color(255, 255, 255));
        jLabel294.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel294.setText("Confirm Specification");
        jLabel294.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel294.setOpaque(true);

        btnC5Finish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnC5Finish.setForeground(new java.awt.Color(255, 255, 255));
        btnC5Finish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnC5Finish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnC5Finish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnC5FinishMouseClicked(evt);
            }
        });

        jLabel296.setBackground(new java.awt.Color(113, 132, 137));
        jLabel296.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel296.setForeground(new java.awt.Color(255, 255, 255));
        jLabel296.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel296.setText("Remaining");
        jLabel296.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel296.setOpaque(true);

        imgC5Rem.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgC5Rem.setForeground(new java.awt.Color(255, 255, 255));
        imgC5Rem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgC5Rem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel281, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel279, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel278, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(btnC5Start)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(selC5Spec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jLabel283, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC5Res)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC5Res))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jLabel284, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC5Stiff)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC5Stiff))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jLabel285, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC5Heat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC5Heat))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jLabel282, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgC5Grip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC5Grip)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel294, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel296, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgC5Rem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnC5Finish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selC5Spec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel278, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnC5Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel279))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel281)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel282, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgC5Grip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnC5Grip, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel283, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgC5Res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnC5Res))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel284, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgC5Stiff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnC5Stiff, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel285)
                    .addComponent(imgC5Heat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC5Heat, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel296, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgC5Rem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel294, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnC5Finish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabsTyres.addTab("C5", jPanel26);

        jPanel27.setBackground(new java.awt.Color(88, 103, 108));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel298.setBackground(new java.awt.Color(113, 132, 137));
        jLabel298.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel298.setForeground(new java.awt.Color(255, 255, 255));
        jLabel298.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel298.setText("Specification");
        jLabel298.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel298.setOpaque(true);

        jComboBox13.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIR-CI19XX-01A" }));

        jLabel299.setBackground(new java.awt.Color(113, 132, 137));
        jLabel299.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel299.setForeground(new java.awt.Color(255, 255, 255));
        jLabel299.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel299.setText("Start Work");
        jLabel299.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel299.setOpaque(true);

        jLabel300.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel300.setForeground(new java.awt.Color(255, 255, 255));
        jLabel300.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel300.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N

        jLabel301.setBackground(new java.awt.Color(113, 132, 137));
        jLabel301.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel301.setForeground(new java.awt.Color(255, 255, 255));
        jLabel301.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel301.setText("Data");
        jLabel301.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel301.setOpaque(true);

        jLabel302.setBackground(new java.awt.Color(113, 132, 137));
        jLabel302.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel302.setForeground(new java.awt.Color(255, 255, 255));
        jLabel302.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel302.setText("Grip");
        jLabel302.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel302.setOpaque(true);

        jLabel303.setBackground(new java.awt.Color(113, 132, 137));
        jLabel303.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel303.setForeground(new java.awt.Color(255, 255, 255));
        jLabel303.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel303.setText("Resilience");
        jLabel303.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel303.setOpaque(true);

        jLabel304.setBackground(new java.awt.Color(113, 132, 137));
        jLabel304.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel304.setForeground(new java.awt.Color(255, 255, 255));
        jLabel304.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel304.setText("Stiffness");
        jLabel304.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel304.setOpaque(true);

        jLabel305.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel305.setForeground(new java.awt.Color(255, 255, 255));
        jLabel305.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel306.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel306.setForeground(new java.awt.Color(255, 255, 255));
        jLabel306.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel306.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel307.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel307.setForeground(new java.awt.Color(255, 255, 255));
        jLabel307.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel308.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel308.setForeground(new java.awt.Color(255, 255, 255));
        jLabel308.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel308.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel309.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel309.setForeground(new java.awt.Color(255, 255, 255));
        jLabel309.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel310.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel310.setForeground(new java.awt.Color(255, 255, 255));
        jLabel310.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel310.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel311.setBackground(new java.awt.Color(113, 132, 137));
        jLabel311.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel311.setForeground(new java.awt.Color(255, 255, 255));
        jLabel311.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel311.setText("Confirm Specification");
        jLabel311.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel311.setOpaque(true);

        jLabel312.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel312.setForeground(new java.awt.Color(255, 255, 255));
        jLabel312.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel312.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N

        jLabel313.setBackground(new java.awt.Color(113, 132, 137));
        jLabel313.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel313.setForeground(new java.awt.Color(255, 255, 255));
        jLabel313.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel313.setText("Remaining");
        jLabel313.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel313.setOpaque(true);

        jLabel314.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel314.setForeground(new java.awt.Color(255, 255, 255));
        jLabel314.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel314.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        jLabel332.setBackground(new java.awt.Color(113, 132, 137));
        jLabel332.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel332.setForeground(new java.awt.Color(255, 255, 255));
        jLabel332.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel332.setText("Heat");
        jLabel332.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel332.setOpaque(true);

        jLabel333.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel333.setForeground(new java.awt.Color(255, 255, 255));
        jLabel333.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel334.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel334.setForeground(new java.awt.Color(255, 255, 255));
        jLabel334.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel334.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel301, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel299, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel298, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel300)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboBox13, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel303, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel307)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel308))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel304, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel309)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel310))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel302, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel305)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel306))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel332, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel333)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel334)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel311, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel313, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel314, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel312, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel298, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel300, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel299))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel301)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel302, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel305, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel306, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel303, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel307, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel308))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel304, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel309, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel310, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel332, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel333, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel334, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel313, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel314, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel311, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel312, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabsTyres.addTab("Intermediate", jPanel27);

        jPanel28.setBackground(new java.awt.Color(88, 103, 108));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel315.setBackground(new java.awt.Color(113, 132, 137));
        jLabel315.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel315.setForeground(new java.awt.Color(255, 255, 255));
        jLabel315.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel315.setText("Specification");
        jLabel315.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel315.setOpaque(true);

        jComboBox14.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIR-CW19XX-01A" }));

        jLabel316.setBackground(new java.awt.Color(113, 132, 137));
        jLabel316.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel316.setForeground(new java.awt.Color(255, 255, 255));
        jLabel316.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel316.setText("Start Work");
        jLabel316.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel316.setOpaque(true);

        jLabel317.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N

        jLabel318.setBackground(new java.awt.Color(113, 132, 137));
        jLabel318.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel318.setForeground(new java.awt.Color(255, 255, 255));
        jLabel318.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel318.setText("Data");
        jLabel318.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel318.setOpaque(true);

        jLabel319.setBackground(new java.awt.Color(113, 132, 137));
        jLabel319.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel319.setForeground(new java.awt.Color(255, 255, 255));
        jLabel319.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel319.setText("Grip");
        jLabel319.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel319.setOpaque(true);

        jLabel320.setBackground(new java.awt.Color(113, 132, 137));
        jLabel320.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel320.setForeground(new java.awt.Color(255, 255, 255));
        jLabel320.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel320.setText("Resilience");
        jLabel320.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel320.setOpaque(true);

        jLabel321.setBackground(new java.awt.Color(113, 132, 137));
        jLabel321.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel321.setForeground(new java.awt.Color(255, 255, 255));
        jLabel321.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel321.setText("Stiffness");
        jLabel321.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel321.setOpaque(true);

        jLabel322.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel322.setForeground(new java.awt.Color(255, 255, 255));
        jLabel322.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel323.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel323.setForeground(new java.awt.Color(255, 255, 255));
        jLabel323.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel323.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel324.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel324.setForeground(new java.awt.Color(255, 255, 255));
        jLabel324.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel325.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel325.setForeground(new java.awt.Color(255, 255, 255));
        jLabel325.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel325.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel326.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel326.setForeground(new java.awt.Color(255, 255, 255));
        jLabel326.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel327.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel327.setForeground(new java.awt.Color(255, 255, 255));
        jLabel327.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel327.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel328.setBackground(new java.awt.Color(113, 132, 137));
        jLabel328.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel328.setForeground(new java.awt.Color(255, 255, 255));
        jLabel328.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel328.setText("Confirm Specification");
        jLabel328.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel328.setOpaque(true);

        jLabel329.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel329.setForeground(new java.awt.Color(255, 255, 255));
        jLabel329.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel329.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N

        jLabel330.setBackground(new java.awt.Color(113, 132, 137));
        jLabel330.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel330.setForeground(new java.awt.Color(255, 255, 255));
        jLabel330.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel330.setText("Remaining");
        jLabel330.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel330.setOpaque(true);

        jLabel331.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel331.setForeground(new java.awt.Color(255, 255, 255));
        jLabel331.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel331.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        jLabel335.setBackground(new java.awt.Color(113, 132, 137));
        jLabel335.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel335.setForeground(new java.awt.Color(255, 255, 255));
        jLabel335.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel335.setText("Heat");
        jLabel335.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel335.setOpaque(true);

        jLabel336.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel336.setForeground(new java.awt.Color(255, 255, 255));
        jLabel336.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel337.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel337.setForeground(new java.awt.Color(255, 255, 255));
        jLabel337.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel337.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel318, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel316, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel315, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel317)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboBox14, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel320, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel324)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel325))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel321, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel326)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel327))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel319, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel322)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel323))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel335, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel336)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel337)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel328, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel330, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel331, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel329, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel315, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel316))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel318)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel319, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel322, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel323, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel320, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel325))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel321, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel326, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel327, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel335, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel336, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel337, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel330, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel331, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel328, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel329, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabsTyres.addTab("Wet", jPanel28);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabsTyres)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabsTyres)
                .addContainerGap())
        );

        jPanel3.add(jPanel19);

        jTabbedPane1.addTab("Tyre", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private int calcRemap(int comp) {
        switch (comp) {
            case 1:
                int x = 10 / FullGame.data.findPlayerTeam().engineSp.rd;
                return FullGame.data.findPlayerTeam().tstEng / x;
            case 2:
                int y = 10 / FullGame.data.findPlayerTeam().fuelSp.rd;
                return FullGame.data.findPlayerTeam().tstFuel / y;
            case 3:
                int z = 10 / FullGame.data.findPlayerTeam().tyreSp.rd;
                return FullGame.data.findPlayerTeam().tstTyre / z;
            default:
                return 0;
        }
    }

    private int calcImprove(int comp) {
        switch (comp) {
            case 1:
                int x = 10 / FullGame.data.findPlayerTeam().engineSp.rd;
                return FullGame.data.findPlayerTeam().tstEng / x;
            case 2:
                int y = 10 / FullGame.data.findPlayerTeam().fuelSp.rd;
                return FullGame.data.findPlayerTeam().tstFuel / y;
            case 3:
                int z = 10 / FullGame.data.findPlayerTeam().tyreSp.rd;
                return FullGame.data.findPlayerTeam().tstTyre / z;
            default:
                return 0;
        }
    }

    private void btnEngineStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEngineStartMouseClicked
        if (engineRD == false) {
            if (FullGame.data.findPlayerTeam().tstEng > 0 && FullGame.data.findPlayerTeam().engineSp.contracts.get(FullGame.data.findPlayerTeam().engineCtId).type != ContractType.CUSTOMER) {
                engineRD = true;
                engineRemap = calcRemap(1);
                if (FullGame.data.findPlayerTeam().engineSp.contracts.get(FullGame.data.findPlayerTeam().engineCtId).type == ContractType.WORKS) {
                    engineImprove = calcImprove(1);
                }
                FullGame.data.findPlayerTeam().tstEng = 0;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnEngineStartMouseClicked

    private void btnFuelStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFuelStartMouseClicked
        if (fuelRD == false) {
            if (FullGame.data.findPlayerTeam().tstFuel > 0 && FullGame.data.findPlayerTeam().fuelSp.contracts.get(FullGame.data.findPlayerTeam().fuelCtId).type != ContractType.CUSTOMER) {
                fuelRD = true;
                fuelRemap = calcRemap(2);
                if (FullGame.data.findPlayerTeam().engineSp.contracts.get(FullGame.data.findPlayerTeam().engineCtId).type == ContractType.WORKS) {
                    fuelImprove = calcImprove(2);
                }
                FullGame.data.findPlayerTeam().tstFuel = 0;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnFuelStartMouseClicked

    private void btnTyreStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTyreStartMouseClicked
        if (tyreRD == false) {
            if (FullGame.data.findPlayerTeam().tstTyre > 0 && FullGame.data.findPlayerTeam().tyreSp.contracts.get(FullGame.data.findPlayerTeam().tyreCtId).type != ContractType.CUSTOMER) {
                tyreRD = true;
                tyreRemap = calcRemap(3);
                if (FullGame.data.findPlayerTeam().engineSp.contracts.get(FullGame.data.findPlayerTeam().engineCtId).type == ContractType.WORKS) {
                    tyreImprove = calcImprove(3);
                }
                FullGame.data.findPlayerTeam().tstTyre = 0;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTyreStartMouseClicked

    private void btnEngineRemapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEngineRemapMouseClicked
        if (engineRD == true && engineChange == 0 && engineRemap > 0) {
            engineChange = 1;
            engineImprove = 0;
            engineRem = 0;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnEngineRemapMouseClicked

    private void btnFuelRemapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFuelRemapMouseClicked
        if (fuelRD == true && fuelChange == 0 && fuelRemap > 0) {
            fuelChange = 1;
            fuelImprove = 0;
            fuelRem = 0;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnFuelRemapMouseClicked

    private void btnTyreRemapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTyreRemapMouseClicked
        if (tyreRD == true && tyreChange == 0 && tyreRemap > 0) {
            tyreChange = 1;
            tyreImprove = 0;
            tyreRem = 0;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTyreRemapMouseClicked

    private void btnEngineImproveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEngineImproveMouseClicked
        if (engineRD == true && tyreChange == 0 && engineImprove > 0) {
            engineChange = 2;
            engineRemap = 0;
            engineRem = engineImprove;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnEngineImproveMouseClicked

    private void btnFuelImproveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFuelImproveMouseClicked
        if (fuelRD == true && tyreChange == 0 && fuelImprove > 0) {
            fuelChange = 2;
            fuelRemap = 0;
            fuelRem = fuelImprove;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnFuelImproveMouseClicked

    private void btnTyreImproveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTyreImproveMouseClicked
        if (tyreRD == true && tyreChange == 0 && tyreImprove > 0) {
            tyreChange = 2;
            tyreRemap = 0;
            tyreRem = tyreImprove;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTyreImproveMouseClicked

    private void btnICEStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnICEStartMouseClicked
        if (engineRD == true && engineChange != 0 && engineCompRD == 0) {
            tabsEngine.setEnabled(false);
            engineCompRD = 1;
            newICE = new ICE((ICE) FullGame.data.findPlayerTeam().findComponentByName(1, (String) selICESpec.getSelectedItem()));
            if (engineChange == 1) {
                newICE.iteration++;
            } else {
                newICE.version++;
            }
            newICE.resetName(0, 0, 0);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnICEStartMouseClicked

    private void btnTCStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTCStartMouseClicked
        if (engineRD == true && engineChange != 0 && engineCompRD == 0) {
            tabsEngine.setEnabled(false);
            engineCompRD = 2;
            newTurbo = new Turbo((Turbo) FullGame.data.findPlayerTeam().findComponentByName(2, (String) selTCSpec.getSelectedItem()));
            if (engineChange == 1) {
                newTurbo.iteration++;
            } else {
                newTurbo.version++;
            }
            newTurbo.resetName(0, 0, 0);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTCStartMouseClicked

    private void btnMGUHStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMGUHStartMouseClicked
        if (engineRD == true && engineChange != 0 && engineCompRD == 0) {
            tabsEngine.setEnabled(false);
            engineCompRD = 3;
            newMGUH = new MGUH((MGUH) FullGame.data.findPlayerTeam().findComponentByName(3, (String) selMGUHSpec.getSelectedItem()));
            if (engineChange == 1) {
                newMGUH.iteration++;
            } else {
                newMGUH.version++;
            }
            newMGUH.resetName(0, 0, 0);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnMGUHStartMouseClicked

    private void btnMGUKStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMGUKStartMouseClicked
        if (engineRD == true && engineChange != 0 && engineCompRD == 0) {
            tabsEngine.setEnabled(false);
            engineCompRD = 4;
            newMGUK = new MGUK((MGUK) FullGame.data.findPlayerTeam().findComponentByName(4, (String) selMGUKSpec.getSelectedItem()));
            if (engineChange == 1) {
                newMGUK.iteration++;
            } else {
                newMGUK.version++;
            }
            newMGUK.resetName(0, 0, 0);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnMGUKStartMouseClicked

    private void selESStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selESStartMouseClicked
        if (engineRD == true && engineChange != 0 && engineCompRD == 0) {
            tabsEngine.setEnabled(false);
            engineCompRD = 5;
            newES = new EnergyStore((EnergyStore) FullGame.data.findPlayerTeam().findComponentByName(5, (String) selESSpec.getSelectedItem()));
            if (engineChange == 1) {
                newES.iteration++;
            } else {
                newES.version++;
            }
            newES.resetName(0, 0, 0);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_selESStartMouseClicked

    private void btnCEStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCEStartMouseClicked
        if (engineRD == true && engineChange != 0 && engineCompRD == 0) {
            tabsEngine.setEnabled(false);
            engineCompRD = 6;
            newCE = new Electronics((Electronics) FullGame.data.findPlayerTeam().findComponentByName(6, (String) selCESpec.getSelectedItem()));
            if (engineChange == 1) {
                newCE.iteration++;
            } else {
                newCE.version++;
            }
            newCE.resetName(0, 0, 0);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCEStartMouseClicked

    private void btnSelectSpecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectSpecMouseClicked
        if (fuelRD == true && fuelChange != 0 && fuelSpecRD == 0) {
            fuelSpecRD = 1;
            newFuel = new Fuel((Fuel) FullGame.data.findPlayerTeam().findComponentByName(7, (String) selFuelSpec.getSelectedItem()));
            if (fuelChange == 1) {
                newFuel.iteration++;
            } else {
                newFuel.version++;
            }
            newFuel.resetName(0, 0, 0);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnSelectSpecMouseClicked

    private void btnC1StartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1StartMouseClicked
        if (tyreRD == true && tyreChange != 0 && tyreCompRD == 0) {
            tabsTyres.setEnabled(false);
            tyreCompRD = 1;
            newTyreComp = new Tyres((Tyres) FullGame.data.findPlayerTeam().findComponentByName(8, (String) selC1Spec.getSelectedItem()));
            if (tyreChange == 1) {
                newTyreComp.iteration++;
            } else {
                newTyreComp.version++;
            }
            newTyreComp.resetName(0, 0, 0);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnC1StartMouseClicked

    private void btnC2StartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2StartMouseClicked
        if (tyreRD == true && tyreChange != 0 && tyreCompRD == 0) {
            tabsTyres.setEnabled(false);
            tyreCompRD = 2;
            newTyreComp = new Tyres((Tyres) FullGame.data.findPlayerTeam().findComponentByName(9, (String) selC2Spec.getSelectedItem()));
            if (tyreChange == 1) {
                newTyreComp.iteration++;
            } else {
                newTyreComp.version++;
            }
            newTyreComp.resetName(0, 0, 0);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnC2StartMouseClicked

    private void btnC3StartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC3StartMouseClicked
        if (tyreRD == true && tyreChange != 0 && tyreCompRD == 0) {
            tabsTyres.setEnabled(false);
            tyreCompRD = 3;
            newTyreComp = new Tyres((Tyres) FullGame.data.findPlayerTeam().findComponentByName(10, (String) selC3Spec.getSelectedItem()));
            if (tyreChange == 1) {
                newTyreComp.iteration++;
            } else {
                newTyreComp.version++;
            }
            newTyreComp.resetName(0, 0, 0);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnC3StartMouseClicked

    private void btnC4StartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC4StartMouseClicked
        if (tyreRD == true && tyreChange != 0 && tyreCompRD == 0) {
            tabsTyres.setEnabled(false);
            tyreCompRD = 4;
            newTyreComp = new Tyres((Tyres) FullGame.data.findPlayerTeam().findComponentByName(11, (String) selC4Spec.getSelectedItem()));
            if (tyreChange == 1) {
                newTyreComp.iteration++;
            } else {
                newTyreComp.version++;
            }
            newTyreComp.resetName(0, 0, 0);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnC4StartMouseClicked

    private void btnC5StartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC5StartMouseClicked
        if (tyreRD == true && tyreChange != 0 && tyreCompRD == 0) {
            tabsTyres.setEnabled(false);
            tyreCompRD = 5;
            newTyreComp = new Tyres((Tyres) FullGame.data.findPlayerTeam().findComponentByName(12, (String) selC5Spec.getSelectedItem()));
            if (tyreChange == 1) {
                newTyreComp.iteration++;
            } else {
                newTyreComp.version++;
            }
            newTyreComp.resetName(0, 0, 0);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnC5StartMouseClicked

    private void btnICEFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnICEFinishMouseClicked
        if (engineRD == true && engineChange == 2 && engineCompRD == 1) {
            FullGame.data.findPlayerTeam().ice.add(newICE);
            engineRD = false;
            engineChange = 0;
            engineCompRD = 0;
            engineRem = 0;
            engineImprove = 0;
            engineRemap = 0;
            tabsEngine.setEnabled(true);
            resetComboBox(1);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnICEFinishMouseClicked

    private void btnTCFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTCFinishMouseClicked
        if (engineRD == true && engineChange == 2 && engineCompRD == 2) {
            FullGame.data.findPlayerTeam().turbo.add(newTurbo);
            engineRD = false;
            engineChange = 0;
            engineCompRD = 0;
            engineRem = 0;
            engineImprove = 0;
            engineRemap = 0;
            tabsEngine.setEnabled(true);
            resetComboBox(2);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTCFinishMouseClicked

    private void btnMGUHFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMGUHFinishMouseClicked
        if (engineRD == true && engineChange == 2 && engineCompRD == 3) {
            FullGame.data.findPlayerTeam().mguh.add(newMGUH);
            engineRD = false;
            engineChange = 0;
            engineCompRD = 0;
            engineRem = 0;
            engineImprove = 0;
            engineRemap = 0;
            tabsEngine.setEnabled(true);
            resetComboBox(3);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnMGUHFinishMouseClicked

    private void btnMGUKFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMGUKFinishMouseClicked
        if (engineRD == true && engineChange == 2 && engineCompRD == 4) {
            FullGame.data.findPlayerTeam().mguk.add(newMGUK);
            engineRD = false;
            engineChange = 0;
            engineCompRD = 0;
            engineRem = 0;
            engineImprove = 0;
            engineRemap = 0;
            tabsEngine.setEnabled(true);
            resetComboBox(4);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnMGUKFinishMouseClicked

    private void btnESFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnESFinishMouseClicked
        if (engineRD == true && engineChange == 2 && engineCompRD == 5) {
            FullGame.data.findPlayerTeam().es.add(newES);
            engineRD = false;
            engineChange = 0;
            engineCompRD = 0;
            engineRem = 0;
            engineImprove = 0;
            engineRemap = 0;
            tabsEngine.setEnabled(true);
            resetComboBox(5);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnESFinishMouseClicked

    private void btnCEFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCEFinishMouseClicked
        if (engineRD == true && engineChange == 2 && engineCompRD == 6) {
            FullGame.data.findPlayerTeam().ce.add(newCE);
            engineRD = false;
            engineChange = 0;
            engineCompRD = 0;
            engineRem = 0;
            engineImprove = 0;
            engineRemap = 0;
            tabsEngine.setEnabled(true);
            resetComboBox(6);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCEFinishMouseClicked

    private void btnFuelFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFuelFinishMouseClicked
        if (fuelRD == true && fuelChange == 2 && fuelSpecRD == 1) {
            FullGame.data.findPlayerTeam().fuel.add(newFuel);
            fuelRD = false;
            fuelChange = 0;
            fuelSpecRD = 0;
            fuelRem = 0;
            fuelImprove = 0;
            fuelRemap = 0;
            resetComboBox(7);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnFuelFinishMouseClicked

    private void btnC1FinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1FinishMouseClicked
        if (tyreRD == true && tyreChange == 2 && tyreCompRD == 1) {
            FullGame.data.findPlayerTeam().c1tyres.add(newTyreComp);
            tyreRD = false;
            tyreChange = 0;
            tyreCompRD = 0;
            tyreRem = 0;
            tyreImprove = 0;
            tyreRemap = 0;
            tabsTyres.setEnabled(true);
            resetComboBox(8);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnC1FinishMouseClicked

    private void btnC2FinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2FinishMouseClicked
        if (tyreRD == true && tyreChange == 2 && tyreCompRD == 2) {
            FullGame.data.findPlayerTeam().c2tyres.add(newTyreComp);
            tyreRD = false;
            tyreChange = 0;
            tyreCompRD = 0;
            tyreRem = 0;
            tyreImprove = 0;
            tyreRemap = 0;
            tabsTyres.setEnabled(true);
            resetComboBox(9);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnC2FinishMouseClicked

    private void btnC3FinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC3FinishMouseClicked
        if (tyreRD == true && tyreChange == 2 && tyreCompRD == 3) {
            FullGame.data.findPlayerTeam().c3tyres.add(newTyreComp);
            tyreRD = false;
            tyreChange = 0;
            tyreCompRD = 0;
            tyreRem = 0;
            tyreImprove = 0;
            tyreRemap = 0;
            tabsTyres.setEnabled(true);
            resetComboBox(10);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnC3FinishMouseClicked

    private void btnC4FinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC4FinishMouseClicked
        if (tyreRD == true && tyreChange == 2 && tyreCompRD == 4) {
            FullGame.data.findPlayerTeam().c4tyres.add(newTyreComp);
            tyreRD = false;
            tyreChange = 0;
            tyreCompRD = 0;
            tyreRem = 0;
            tyreImprove = 0;
            tyreRemap = 0;
            tabsTyres.setEnabled(true);
            resetComboBox(11);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnC4FinishMouseClicked

    private void btnC5FinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC5FinishMouseClicked
        if (tyreRD == true && tyreChange == 2 && tyreCompRD == 5) {
            FullGame.data.findPlayerTeam().c5tyres.add(newTyreComp);
            tyreRD = false;
            tyreChange = 0;
            tyreCompRD = 0;
            tyreRem = 0;
            tyreImprove = 0;
            tyreRemap = 0;
            tabsTyres.setEnabled(true);
            resetComboBox(12);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnC5FinishMouseClicked

    private void btnChangeAttributeClicked(java.awt.event.MouseEvent evt, int type, int comp, int att) {
        switch (type) {
            case 1://Engine
                if (engineRD == true && engineCompRD != 0) {
                    switch (comp) {
                        case 1://ICE
                            switch (att) {
                                case 1:
                                    if (engineChange == 1) {
                                        if (newICE.fuel > 0) {
                                            newICE.fuel--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newICE.fuel < 10 && engineRem > 0) {
                                            newICE.fuel++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 2:
                                    if (engineChange == 1) {
                                        if (newICE.power > 0) {
                                            newICE.power--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newICE.power < 10 && engineRem > 0) {
                                            newICE.power++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 3:
                                    if (engineChange == 1) {
                                        if (newICE.heat > 0) {
                                            newICE.heat--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newICE.heat < 10 && engineRem > 0) {
                                            newICE.heat++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (engineChange == 1) {
                                        if (newICE.reliability > 0) {
                                            newICE.reliability--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newICE.reliability < 10 && engineRem > 0) {
                                            newICE.reliability++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 5:
                                    if (engineChange == 1) {
                                        if (newICE.rigidity > 0) {
                                            newICE.rigidity--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newICE.rigidity < 10 && engineRem > 0) {
                                            newICE.rigidity++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 6:
                                    if (engineChange == 1) {
                                        if (newICE.weight > 0) {
                                            newICE.weight--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newICE.weight < 10 && engineRem > 0) {
                                            newICE.weight++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                            }
                            break;
                        case 2://TC
                            switch (att) {
                                case 1:
                                    if (engineChange == 1) {
                                        if (newTurbo.power > 0) {
                                            newTurbo.power--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newTurbo.power < 10 && engineRem > 0) {
                                            newTurbo.power++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 2:
                                    if (engineChange == 1) {
                                        if (newTurbo.heat > 0) {
                                            newTurbo.heat--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newTurbo.heat < 10 && engineRem > 0) {
                                            newTurbo.heat++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 3:
                                    if (engineChange == 1) {
                                        if (newTurbo.reliability > 0) {
                                            newTurbo.reliability--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newTurbo.reliability < 10 && engineRem > 0) {
                                            newTurbo.reliability++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (engineChange == 1) {
                                        if (newTurbo.weight > 0) {
                                            newTurbo.weight--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newTurbo.weight < 10 && engineRem > 0) {
                                            newTurbo.weight++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                            }
                            break;
                        case 3://MGUH
                            switch (att) {
                                case 1:
                                    if (engineChange == 1) {
                                        if (newMGUH.power > 0) {
                                            newMGUH.power--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newMGUH.power < 10 && engineRem > 0) {
                                            newMGUH.power++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 2:
                                    if (engineChange == 1) {
                                        if (newMGUH.heat > 0) {
                                            newMGUH.heat--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newMGUH.heat < 10 && engineRem > 0) {
                                            newMGUH.heat++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 3:
                                    if (engineChange == 1) {
                                        if (newMGUH.reliability > 0) {
                                            newMGUH.reliability--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newMGUH.reliability < 10 && engineRem > 0) {
                                            newMGUH.reliability++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (engineChange == 1) {
                                        if (newMGUH.weight > 0) {
                                            newMGUH.weight--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newMGUH.weight < 10 && engineRem > 0) {
                                            newMGUH.weight++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                            }
                            break;
                        case 4://MGUK
                            switch (att) {
                                case 1:
                                    if (engineChange == 1) {
                                        if (newMGUK.power > 0) {
                                            newMGUK.power--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newMGUK.power < 10 && engineRem > 0) {
                                            newMGUK.power++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 2:
                                    if (engineChange == 1) {
                                        if (newMGUK.heat > 0) {
                                            newMGUK.heat--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newMGUK.heat < 10 && engineRem > 0) {
                                            newMGUK.heat++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 3:
                                    if (engineChange == 1) {
                                        if (newMGUK.reliability > 0) {
                                            newMGUK.reliability--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newMGUK.reliability < 10 && engineRem > 0) {
                                            newMGUK.reliability++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (engineChange == 1) {
                                        if (newMGUK.weight > 0) {
                                            newMGUK.weight--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newMGUK.weight < 10 && engineRem > 0) {
                                            newMGUK.weight++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                            }
                            break;
                        case 5://ES
                            switch (att) {
                                case 1:
                                    if (engineChange == 1) {
                                        if (newES.capacity > 0) {
                                            newES.capacity--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newES.capacity < 10 && engineRem > 0) {
                                            newES.capacity++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 2:
                                    if (engineChange == 1) {
                                        if (newES.heat > 0) {
                                            newES.heat--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newES.heat < 10 && engineRem > 0) {
                                            newES.heat++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 3:
                                    if (engineChange == 1) {
                                        if (newES.reliability > 0) {
                                            newES.reliability--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newES.reliability < 10 && engineRem > 0) {
                                            newES.reliability++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (engineChange == 1) {
                                        if (newES.weight > 0) {
                                            newES.weight--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newES.weight < 10 && engineRem > 0) {
                                            newES.weight++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                            }
                            break;
                        case 6://CE
                            switch (att) {
                                case 1:
                                    if (engineChange == 1) {
                                        if (newCE.reliability > 0) {
                                            newCE.reliability--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newCE.reliability < 10 && engineRem > 0) {
                                            newCE.reliability++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 2:
                                    if (engineChange == 1) {
                                        if (newCE.rigidity > 0) {
                                            newCE.rigidity--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newCE.rigidity < 10 && engineRem > 0) {
                                            newCE.rigidity++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                                case 3:
                                    if (engineChange == 1) {
                                        if (newCE.weight > 0) {
                                            newCE.weight--;
                                            engineRem++;
                                            remapCheck(1);
                                        }
                                    } else if (engineChange == 2) {
                                        if (newCE.weight < 10 && engineRem > 0) {
                                            newCE.weight++;
                                            engineRem--;
                                        }
                                    }
                                    break;
                            }
                            break;
                    }
                }
                break;
            case 2://Fuel
                if (fuelRD == true && fuelSpecRD != 0) {
                    switch (att) {
                        case 1:
                            if (fuelChange == 1) {
                                if (newFuel.performance > 0) {
                                    newFuel.performance--;
                                    fuelRem++;
                                    remapCheck(2);
                                }
                            } else if (fuelChange == 2) {
                                if (newFuel.performance < 10 && fuelRem > 0) {
                                    newFuel.performance++;
                                    fuelRem--;
                                }
                            }
                            break;
                        case 2:
                            if (fuelChange == 1) {
                                if (newFuel.tolerance > 0) {
                                    newFuel.tolerance--;
                                    fuelRem++;
                                    remapCheck(2);
                                }
                            } else if (fuelChange == 2) {
                                if (newFuel.tolerance < 10 && fuelRem > 0) {
                                    newFuel.tolerance++;
                                    fuelRem--;
                                }
                            }
                            break;
                    }
                }
                break;
            case 3://Tyres
                if (fuelRD == true && fuelSpecRD != 0 && fuelSpecRD == comp) {
                    switch (att) {
                        case 1:
                            if (tyreChange == 1) {
                                if (newTyreComp.grip > 0) {
                                    newTyreComp.grip--;
                                    tyreRem++;
                                    remapCheck(3);
                                }
                            } else if (tyreChange == 2) {
                                if (newTyreComp.grip < 10 && tyreRem > 0) {
                                    newTyreComp.grip++;
                                    tyreRem--;
                                }
                            }
                            break;
                        case 2:
                            if (tyreChange == 1) {
                                if (newTyreComp.resilience > 0) {
                                    newTyreComp.resilience--;
                                    tyreRem++;
                                    remapCheck(3);
                                }
                            } else if (tyreChange == 2) {
                                if (newTyreComp.resilience < 10 && tyreRem > 0) {
                                    newTyreComp.resilience++;
                                    tyreRem--;
                                }
                            }
                            break;
                        case 3:
                            if (tyreChange == 1) {
                                if (newTyreComp.stiffness > 0) {
                                    newTyreComp.stiffness--;
                                    tyreRem++;
                                    remapCheck(3);
                                }
                            } else if (tyreChange == 2) {
                                if (newTyreComp.stiffness < 10 && tyreRem > 0) {
                                    newTyreComp.stiffness++;
                                    tyreRem--;
                                }
                            }
                            break;
                        case 4:
                            if (tyreChange == 1) {
                                if (newTyreComp.heat > 0) {
                                    newTyreComp.heat--;
                                    tyreRem++;
                                    remapCheck(3);
                                }
                            } else if (tyreChange == 2) {
                                if (newTyreComp.heat < 10 && tyreRem > 0) {
                                    newTyreComp.heat++;
                                    tyreRem--;
                                }
                            }
                            break;
                    }
                }
                break;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }

    private void selICESpecActionPerformed(java.awt.event.ActionEvent evt) {
        FullGame.gameScreen.enAll1.updateScreenData();
    }

    private void remapCheck(int type) {
        switch (type) {
            case 1://Engine
                if (engineRem == engineRemap) {
                    engineChange = 2;
                }
                break;
            case 2://Fuel
                if (fuelRem == fuelRemap) {
                    fuelChange = 2;
                }
                break;
            case 3://Tyres
                if (tyreRem == tyreRemap) {
                    tyreChange = 2;
                }
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnC1Finish;
    private javax.swing.JLabel btnC1Grip;
    private javax.swing.JLabel btnC1Heat;
    private javax.swing.JLabel btnC1Res;
    private javax.swing.JLabel btnC1Start;
    private javax.swing.JLabel btnC1Stiff;
    private javax.swing.JLabel btnC2Finish;
    private javax.swing.JLabel btnC2Grip;
    private javax.swing.JLabel btnC2Heat;
    private javax.swing.JLabel btnC2Res;
    private javax.swing.JLabel btnC2Start;
    private javax.swing.JLabel btnC2Stiff;
    private javax.swing.JLabel btnC3Finish;
    private javax.swing.JLabel btnC3Grip;
    private javax.swing.JLabel btnC3Heat;
    private javax.swing.JLabel btnC3Res;
    private javax.swing.JLabel btnC3Start;
    private javax.swing.JLabel btnC3Stiff;
    private javax.swing.JLabel btnC4Finish;
    private javax.swing.JLabel btnC4Grip;
    private javax.swing.JLabel btnC4Heat;
    private javax.swing.JLabel btnC4Res;
    private javax.swing.JLabel btnC4Start;
    private javax.swing.JLabel btnC4Stiff;
    private javax.swing.JLabel btnC5Finish;
    private javax.swing.JLabel btnC5Grip;
    private javax.swing.JLabel btnC5Heat;
    private javax.swing.JLabel btnC5Res;
    private javax.swing.JLabel btnC5Start;
    private javax.swing.JLabel btnC5Stiff;
    private javax.swing.JLabel btnCEFinish;
    private javax.swing.JLabel btnCERel;
    private javax.swing.JLabel btnCERig;
    private javax.swing.JLabel btnCEStart;
    private javax.swing.JLabel btnCEWei;
    private javax.swing.JLabel btnESCap;
    private javax.swing.JLabel btnESFinish;
    private javax.swing.JLabel btnESHeat;
    private javax.swing.JLabel btnESRel;
    private javax.swing.JLabel btnESWei;
    private javax.swing.JLabel btnEngineImprove;
    private javax.swing.JLabel btnEngineRemap;
    private javax.swing.JLabel btnEngineStart;
    private javax.swing.JLabel btnFuelFinish;
    private javax.swing.JLabel btnFuelImprove;
    private javax.swing.JLabel btnFuelPerf;
    private javax.swing.JLabel btnFuelRemap;
    private javax.swing.JLabel btnFuelStart;
    private javax.swing.JLabel btnFuelToler;
    private javax.swing.JLabel btnICEFinish;
    private javax.swing.JLabel btnICEFuel;
    private javax.swing.JLabel btnICEHeat;
    private javax.swing.JLabel btnICEPower;
    private javax.swing.JLabel btnICERel;
    private javax.swing.JLabel btnICERig;
    private javax.swing.JLabel btnICEStart;
    private javax.swing.JLabel btnICEWei;
    private javax.swing.JLabel btnMGUHFinish;
    private javax.swing.JLabel btnMGUHHeat;
    private javax.swing.JLabel btnMGUHPower;
    private javax.swing.JLabel btnMGUHRel;
    private javax.swing.JLabel btnMGUHStart;
    private javax.swing.JLabel btnMGUHWei;
    private javax.swing.JLabel btnMGUKFinish;
    private javax.swing.JLabel btnMGUKHeat;
    private javax.swing.JLabel btnMGUKPower;
    private javax.swing.JLabel btnMGUKRel;
    private javax.swing.JLabel btnMGUKStart;
    private javax.swing.JLabel btnMGUKWei;
    private javax.swing.JLabel btnSelectSpec;
    private javax.swing.JLabel btnTCFinish;
    private javax.swing.JLabel btnTCHeat;
    private javax.swing.JLabel btnTCPower;
    private javax.swing.JLabel btnTCRel;
    private javax.swing.JLabel btnTCStart;
    private javax.swing.JLabel btnTCWei;
    private javax.swing.JLabel btnTyreImprove;
    private javax.swing.JLabel btnTyreRemap;
    private javax.swing.JLabel btnTyreStart;
    private javax.swing.JLabel imgC1Grip;
    private javax.swing.JLabel imgC1Heat;
    private javax.swing.JLabel imgC1Rem;
    private javax.swing.JLabel imgC1Res;
    private javax.swing.JLabel imgC1Stiff;
    private javax.swing.JLabel imgC2Grip;
    private javax.swing.JLabel imgC2Heat;
    private javax.swing.JLabel imgC2Rem;
    private javax.swing.JLabel imgC2Res;
    private javax.swing.JLabel imgC2Stiff;
    private javax.swing.JLabel imgC3Grip;
    private javax.swing.JLabel imgC3Heat;
    private javax.swing.JLabel imgC3Rem;
    private javax.swing.JLabel imgC3Res;
    private javax.swing.JLabel imgC3Stiff;
    private javax.swing.JLabel imgC4Grip;
    private javax.swing.JLabel imgC4Heat;
    private javax.swing.JLabel imgC4Rem;
    private javax.swing.JLabel imgC4Res;
    private javax.swing.JLabel imgC4Stiff;
    private javax.swing.JLabel imgC5Grip;
    private javax.swing.JLabel imgC5Heat;
    private javax.swing.JLabel imgC5Rem;
    private javax.swing.JLabel imgC5Res;
    private javax.swing.JLabel imgC5Stiff;
    private javax.swing.JLabel imgCERel;
    private javax.swing.JLabel imgCERem;
    private javax.swing.JLabel imgCERig;
    private javax.swing.JLabel imgCEWei;
    private javax.swing.JLabel imgESCap;
    private javax.swing.JLabel imgESHeat;
    private javax.swing.JLabel imgESRel;
    private javax.swing.JLabel imgESRem;
    private javax.swing.JLabel imgESWei;
    private javax.swing.JLabel imgEngineImprove;
    private javax.swing.JLabel imgEngineRemap;
    private javax.swing.JLabel imgEngineTesting;
    private javax.swing.JLabel imgFuelImprove;
    private javax.swing.JLabel imgFuelPerf;
    private javax.swing.JLabel imgFuelRem;
    private javax.swing.JLabel imgFuelRemap;
    private javax.swing.JLabel imgFuelTesting;
    private javax.swing.JLabel imgFuelToler;
    private javax.swing.JLabel imgICEFuel;
    private javax.swing.JLabel imgICEHeat;
    private javax.swing.JLabel imgICEPower;
    private javax.swing.JLabel imgICERel;
    private javax.swing.JLabel imgICERem;
    private javax.swing.JLabel imgICERig;
    private javax.swing.JLabel imgICEWei;
    private javax.swing.JLabel imgMGUHHeat;
    private javax.swing.JLabel imgMGUHPower;
    private javax.swing.JLabel imgMGUHRel;
    private javax.swing.JLabel imgMGUHRem;
    private javax.swing.JLabel imgMGUHWei;
    private javax.swing.JLabel imgMGUKHeat;
    private javax.swing.JLabel imgMGUKPower;
    private javax.swing.JLabel imgMGUKRel;
    private javax.swing.JLabel imgMGUKRem;
    private javax.swing.JLabel imgMGUKWei;
    private javax.swing.JLabel imgTCHeat;
    private javax.swing.JLabel imgTCPower;
    private javax.swing.JLabel imgTCRel;
    private javax.swing.JLabel imgTCRem;
    private javax.swing.JLabel imgTCWei;
    private javax.swing.JLabel imgTyreImprove;
    private javax.swing.JLabel imgTyreRemap;
    private javax.swing.JLabel imgTyreTesting;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
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
    private javax.swing.JLabel jLabel31;
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
    private javax.swing.JLabel jLabel32;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel331;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel333;
    private javax.swing.JLabel jLabel334;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel336;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblEngineContract;
    private javax.swing.JLabel lblEngineRD;
    private javax.swing.JLabel lblEngineSupplier;
    private javax.swing.JLabel lblFuelContract;
    private javax.swing.JLabel lblFuelRD;
    private javax.swing.JLabel lblFuelSupplier;
    private javax.swing.JLabel lblTyreContract;
    private javax.swing.JLabel lblTyreRD;
    private javax.swing.JLabel lblTyreSupplier;
    private javax.swing.JComboBox<String> selC1Spec;
    private javax.swing.JComboBox<String> selC2Spec;
    private javax.swing.JComboBox<String> selC3Spec;
    private javax.swing.JComboBox<String> selC4Spec;
    private javax.swing.JComboBox<String> selC5Spec;
    private javax.swing.JComboBox<String> selCESpec;
    private javax.swing.JComboBox<String> selESSpec;
    private javax.swing.JLabel selESStart;
    private javax.swing.JComboBox<String> selFuelSpec;
    private javax.swing.JComboBox<String> selICESpec;
    private javax.swing.JComboBox<String> selMGUHSpec;
    private javax.swing.JComboBox<String> selMGUKSpec;
    private javax.swing.JComboBox<String> selTCSpec;
    private javax.swing.JTabbedPane tabsEngine;
    private javax.swing.JTabbedPane tabsTyres;
    // End of variables declaration//GEN-END:variables
}

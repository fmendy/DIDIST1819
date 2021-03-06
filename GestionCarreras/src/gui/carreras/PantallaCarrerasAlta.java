/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.carreras;

import dto.Carrera;
import java.util.Date;
import Logica.*;
import gui.PantallaPrincipal;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;

/**
 *
 * @author alvar
 */
public class PantallaCarrerasAlta extends javax.swing.JDialog {

    private PantallaPrincipal pp;
    private Carrera carrera;

    /**
     * Creates new form PantallaCarrerasAlta
     */
    public PantallaCarrerasAlta(java.awt.Frame parent, boolean modal) throws UnsupportedClassVersionError{
        super(parent, modal);
        initComponents();
        pp = (PantallaPrincipal) parent;
        jButtonModificar.setVisible(false);
        mostrarAyuda();
        validar();

    }

    public PantallaCarrerasAlta(java.awt.Frame parent, boolean modal, Carrera c) {
        super(parent, modal);
        initComponents();
        pp = (PantallaPrincipal) parent;
        this.carrera = c;
        jButtonAlta.setVisible(false);
        jTextFieldLugar.setText(c.getLugar());
        jTextFieldNombre.setText(c.getNombre());
        jSpinnerFecha.setValue(c.getFechaCarrera());
        jSpinnerMaximo.setValue(c.getParticipantesMaximos());
        validar();
        jButtonModificar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jSpinnerFecha = new javax.swing.JSpinner();
        jSpinnerMaximo = new javax.swing.JSpinner();
        jTextFieldLugar = new javax.swing.JTextField();
        jButtonAlta = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        validationPanel = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemMenuAyuda = new javax.swing.JMenuItem();
        jMenuItemCorredor = new javax.swing.JMenuItem();
        jMenuItemCarrera = new javax.swing.JMenuItem();
        jMenuItemCarreraCorriendo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Fecha");

        jLabel3.setText("Lugar");

        jLabel4.setText("Nº Maximo");

        jTextFieldNombre.setName("Nombre"); // NOI18N

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());

        jSpinnerMaximo.setModel(new javax.swing.SpinnerNumberModel(1, 1, 200, 1));

        jTextFieldLugar.setName("Lugar"); // NOI18N

        jButtonAlta.setText("ALTA");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jButtonSalir.setText("SALIR");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonModificar.setText("MODIFICAR");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jMenuAyuda.setText("Ayuda...");

        jMenuItemMenuAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemMenuAyuda.setText("Menu Ayuda");
        jMenuAyuda.add(jMenuItemMenuAyuda);

        jMenuItemCorredor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCorredor.setText("Corredor");
        jMenuAyuda.add(jMenuItemCorredor);

        jMenuItemCarrera.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCarrera.setText("Carrera");
        jMenuAyuda.add(jMenuItemCarrera);

        jMenuItemCarreraCorriendo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCarreraCorriendo.setText("CarreraCorriendo");
        jMenuAyuda.add(jMenuItemCarreraCorriendo);

        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addComponent(jButtonSalir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAlta))
                            .addComponent(jTextFieldNombre)
                            .addComponent(jSpinnerFecha)
                            .addComponent(jTextFieldLugar)
                            .addComponent(jSpinnerMaximo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(validationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(validationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlta)
                    .addComponent(jButtonSalir)
                    .addComponent(jButtonModificar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        // TODO add your handling code here:

        //Se crea el objeto carrera
        String nombre = jTextFieldNombre.getText();
        int numMaximo = (int) jSpinnerMaximo.getValue();
        Date d = (Date) jSpinnerFecha.getValue();
        String lugar = jTextFieldLugar.getText();
        Carrera c = new Carrera(nombre, d, lugar, numMaximo);
        //Se comprueba que no este ya dada de alta
        //Para ello se compara por nombre
        if (!LogicaCarrera.getListaCarreras().contains(c)) {
            int i = JOptionPane.showConfirmDialog(this, "¿Esta seguro de dar de alta?", "Alta", JOptionPane.YES_NO_CANCEL_OPTION);
            if (i == JOptionPane.YES_OPTION) {
                LogicaCarrera.aniadirCarrera(c);
                JOptionPane.showMessageDialog(this, "Carrera dada de alta");
                PantallaCarrerasInscribirCorredores pcic = new PantallaCarrerasInscribirCorredores(pp, true, c);
                pcic.setVisible(true);
                this.setVisible(false);
            } else if (i == JOptionPane.NO_OPTION) {
                this.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Esta carrera ya existe", "Carrera", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    public void mostrarAyuda() {
        //Se carga el fichero de ayuda
        File file = new File("JavaHelp" + File.separator + "help_set.hs");
        try {
            URL url = file.toURI().toURL();

            System.out.println(url);

            try {
                //Se crea el helpset
                HelpSet helpset = new HelpSet(getClass().getClassLoader(), url);
                //Se crea el helpBroker
                HelpBroker hb = helpset.createHelpBroker();

                //cargar las ayudas
                hb.enableHelpOnButton(jMenuItemMenuAyuda, "indice", helpset);
                hb.enableHelpKey(getRootPane(), "ayuda_carrera", helpset);
                hb.enableHelpOnButton(jMenuItemCorredor, "ayuda_corredor", helpset);
                hb.enableHelpOnButton(jMenuItemCarrera, "ayuda_carrera", helpset);
                hb.enableHelpOnButton(jMenuItemCarreraCorriendo, "ayuda_carrera_corriendo", helpset);

            } catch (HelpSetException ex) {
                Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:

        //Se crea el objeto carrera
        String nombre = jTextFieldNombre.getText();
        int numMaximo = (int) jSpinnerMaximo.getValue();
        Date d = (Date) jSpinnerFecha.getValue();
        String lugar = jTextFieldLugar.getText();
        Carrera c = new Carrera(nombre, d, lugar, numMaximo);
        //Se comprueba que no este ya dada de alta
        //Para ello se compara por nombre
        int i = JOptionPane.showConfirmDialog(this, "¿Esta seguro de dar de Modifcar?", "Modificar", JOptionPane.YES_NO_CANCEL_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Carrera modificada");
            //PantallaCarrerasInscribirCorredores pcic=new PantallaCarrerasInscribirCorredores(pp, true,c);
            //pcic.setVisible(true);
            LogicaCarrera.modificarCarrera(carrera, c);
            this.setVisible(false);
        } else if (i == JOptionPane.NO_OPTION) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    public void validar() {
        //Deshabilitamos los botones
        jButtonAlta.setEnabled(false);
        jButtonModificar.setEnabled(false);
        //Creamos le grupo de validacion
        ValidationGroup group = validationPanel.getValidationGroup();
        //El lugar no puede estar vacio
        group.add(jTextFieldLugar, StringValidators.REQUIRE_NON_EMPTY_STRING);
        //El nombre no puede ser vacio
        group.add(jTextFieldNombre, StringValidators.REQUIRE_NON_EMPTY_STRING);

        //Cada vez que se introduce algo se escucha
        validationPanel.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // si no devuelve error, se abren los botones
                if (validationPanel.getProblem() == null) {
                    jButtonAlta.setEnabled(true);
                    jButtonModificar.setEnabled(true);
                } else {
                    jButtonAlta.setEnabled(false);
                    jButtonModificar.setEnabled(false);
                }
            }
        });
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCarrera;
    private javax.swing.JMenuItem jMenuItemCarreraCorriendo;
    private javax.swing.JMenuItem jMenuItemCorredor;
    private javax.swing.JMenuItem jMenuItemMenuAyuda;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JSpinner jSpinnerMaximo;
    private javax.swing.JTextField jTextFieldLugar;
    private javax.swing.JTextField jTextFieldNombre;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanel;
    // End of variables declaration//GEN-END:variables
}

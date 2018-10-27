/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.carreras;

import Logica.Fechas;
import Logica.LogicaCarrera;
import dto.Carrera;
import gui.PantallaPrincipal;
import gui.TableModels.CarrerasTableModels;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author alvar
 */
public class PantallaCarreras extends javax.swing.JDialog {

    private PantallaPrincipal pp;

    /**
     * Creates new form PantallaCarreras
     */
    public PantallaCarreras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //jTableCarreraNOFinalizada.setModel(new CarrerasTableModels(Logica.LogicaCarrera.listaCarrerasNoFinalizadas()));
        rellenarTabla();
        pp = (PantallaPrincipal) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarreraNOFinalizada = new javax.swing.JTable();
        jButtonAlta = new javax.swing.JButton();
        jButtonBaja = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonInscribirCorredor = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCarreraNOFinalizada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCarreraNOFinalizada);

        jButtonAlta.setText("Alta");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jButtonBaja.setText("Baja");
        jButtonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonInscribirCorredor.setText("Inscribir");
        jButtonInscribirCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInscribirCorredorActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jButtonAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jButtonBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInscribirCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAlta)
                .addGap(18, 18, 18)
                .addComponent(jButtonBaja)
                .addGap(18, 18, 18)
                .addComponent(jButtonModificar)
                .addGap(18, 18, 18)
                .addComponent(jButtonInscribirCorredor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void rellenarTabla() {
        //Se da el modelo a la tabla
        CarrerasTableModels ctm = new CarrerasTableModels(LogicaCarrera.getListaCarreras());
        jTableCarreraNOFinalizada.setModel(ctm);
        //Se indica que se puede ordenar
        TableRowSorter<CarrerasTableModels> trsNoFinalizafa = new TableRowSorter<>(ctm);
        jTableCarreraNOFinalizada.setRowSorter(trsNoFinalizafa);
        //Filtramos
        RowFilter<CarrerasTableModels,Integer> rf=RowFilter.regexFilter("False", 4);
        trsNoFinalizafa.setRowFilter(rf);
        //Hacemos que la columna de si esta terminada, no sea visible
        jTableCarreraNOFinalizada.getColumnModel().getColumn(4).setMaxWidth(0);
        jTableCarreraNOFinalizada.getColumnModel().getColumn(4).setMinWidth(0);
        jTableCarreraNOFinalizada.getColumnModel().getColumn(4).setPreferredWidth(0);
        jTableCarreraNOFinalizada.getColumnModel().getColumn(4).setResizable(false);

    }
    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        // TODO add your handling code here:
        PantallaCarrerasAlta pca = new PantallaCarrerasAlta(pp, true);
        pca.setVisible(true);
        rellenarTabla();
        //jTableCarreraNOFinalizada.setModel(new CarrerasTableModels(Logica.LogicaCarrera.listaCarrerasNoFinalizadas()));

    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaActionPerformed
        // TODO add your handling code here:
        //Para seleccionar la correspondiente, debido a que estan ordenas
        int fila = jTableCarreraNOFinalizada.convertColumnIndexToModel(jTableCarreraNOFinalizada.getSelectedRow());
        // int fila = jTableCarreraNOFinalizada.getSelectedRow();
        if (fila >= 0) {
            String nombre = (String) jTableCarreraNOFinalizada.getValueAt(fila, 0);
            Date d = Fechas.stringToDate((String) jTableCarreraNOFinalizada.getValueAt(fila, 1));
            String lugar = (String) jTableCarreraNOFinalizada.getValueAt(fila, 2);
            Carrera c = new Carrera(nombre, d, lugar, 0);
            //confirmamos para borrar
            int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro de borrar?", "borrar", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                LogicaCarrera.eliminarCarrera(c);
                JOptionPane.showConfirmDialog(this, "Carrera eliminada", "Eliminada", JOptionPane.INFORMATION_MESSAGE);
                rellenarTabla();
                //jTableCarreraNOFinalizada.setModel(new CarrerasTableModels(LogicaCarrera.listaCarrerasNoFinalizadas()));
            }
        } else {
            JOptionPane.showMessageDialog(this, "seleccione una carrera a eliminar", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBajaActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        //Para seleccionar la correspondiente, debido a que estan ordenas
        int fila = jTableCarreraNOFinalizada.convertColumnIndexToModel(jTableCarreraNOFinalizada.getSelectedRow());
        if (fila >= 0) {
            String nombre = (String) jTableCarreraNOFinalizada.getValueAt(fila, 0);
            Date d = Fechas.stringToDate((String) jTableCarreraNOFinalizada.getValueAt(fila, 1));
            String lugar = (String) jTableCarreraNOFinalizada.getValueAt(fila, 2);
            int maximo = (int) jTableCarreraNOFinalizada.getValueAt(fila, 3);
            Carrera c = new Carrera(nombre, d, lugar, maximo);
            //llamamos a modifcar
            PantallaCarrerasAlta pca = new PantallaCarrerasAlta(pp, true, c);
            pca.setVisible(true);
            rellenarTabla();
            // jTableCarreraNOFinalizada.setModel(new CarrerasTableModels(Logica.LogicaCarrera.listaCarrerasNoFinalizadas()));

        } else {
            JOptionPane.showMessageDialog(this, "seleccione una carrera a modificar", "Modifcar", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonInscribirCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInscribirCorredorActionPerformed
        // TODO add your handling code here:
        int fila = jTableCarreraNOFinalizada.getSelectedRow();
        if (fila >= 0) {
            String nombre = (String) jTableCarreraNOFinalizada.getValueAt(fila, 0);
            Date d = Fechas.stringToDate((String) jTableCarreraNOFinalizada.getValueAt(fila, 1));
            String lugar = (String) jTableCarreraNOFinalizada.getValueAt(fila, 2);
            int maximo = (int) jTableCarreraNOFinalizada.getValueAt(fila, 3);
            Carrera c = new Carrera(nombre, d, lugar, maximo);
            int posicionEstaCarrera = LogicaCarrera.getListaCarreras().indexOf(c);
            c = LogicaCarrera.getListaCarreras().get(posicionEstaCarrera);
            //llamamos a modifcar
            PantallaCarrerasInscribirCorredores pcic = new PantallaCarrerasInscribirCorredores(pp, true, c);
            pcic.setVisible(true);
            rellenarTabla();
            //jTableCarreraNOFinalizada.setModel(new CarrerasTableModels(Logica.LogicaCarrera.listaCarrerasNoFinalizadas()));

        } else {
            JOptionPane.showMessageDialog(this, "seleccione una carrera para inscribirse", "Inscribir", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonInscribirCorredorActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonBaja;
    private javax.swing.JButton jButtonInscribirCorredor;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCarreraNOFinalizada;
    // End of variables declaration//GEN-END:variables
}

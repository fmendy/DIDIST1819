/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.informes;

import Logica.LogicaCarrera;
import Logica.LogicaCorredores;
import com.sun.jmx.snmp.BerDecoder;
import dto.Carrera;
import dto.Corredor;
import dto.CorredorClasificado;
import gui.TableModels.CarrerasTableModels;
import gui.TableModels.CorredoresTableModels;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.openide.util.Exceptions;

/**
 *
 * @author alvaro
 */
public class PantallaInformes extends javax.swing.JDialog {

    /**
     * Creates new form Informes
     */
    public PantallaInformes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        CarrerasTableModels ctm = new CarrerasTableModels(LogicaCarrera.getListaCarreras());
        jTableTodasCarreras.setModel(ctm);

        CorredoresTableModels ctmc = new CorredoresTableModels(LogicaCorredores.getListaCorredores());
        jTableCorredores.setModel(ctmc);

        File f = new File(".");
        destino.setText(f.getAbsolutePath());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCarrerasSinFinalizar = new javax.swing.JButton();
        jButtonInformacionCarrera = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTodasCarreras = new javax.swing.JTable();
        jButtonInformacionCorredor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jButtonClasificacion = new javax.swing.JButton();
        jButtonDestino = new javax.swing.JButton();
        destino = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonCarrerasSinFinalizar.setText(org.openide.util.NbBundle.getMessage(PantallaInformes.class, "PantallaInformes.jButtonCarrerasSinFinalizar.text")); // NOI18N
        jButtonCarrerasSinFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarrerasSinFinalizarActionPerformed(evt);
            }
        });

        jButtonInformacionCarrera.setText(org.openide.util.NbBundle.getMessage(PantallaInformes.class, "PantallaInformes.jButtonInformacionCarrera.text")); // NOI18N
        jButtonInformacionCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformacionCarreraActionPerformed(evt);
            }
        });

        jTableTodasCarreras.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableTodasCarreras);

        jButtonInformacionCorredor.setText(org.openide.util.NbBundle.getMessage(PantallaInformes.class, "PantallaInformes.jButtonInformacionCorredor.text")); // NOI18N
        jButtonInformacionCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformacionCorredorActionPerformed(evt);
            }
        });

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableCorredores);

        jButtonClasificacion.setText(org.openide.util.NbBundle.getMessage(PantallaInformes.class, "PantallaInformes.jButtonClasificacion.text")); // NOI18N
        jButtonClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClasificacionActionPerformed(evt);
            }
        });

        jButtonDestino.setText(org.openide.util.NbBundle.getMessage(PantallaInformes.class, "PantallaInformes.jButtonDestino.text")); // NOI18N
        jButtonDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDestinoActionPerformed(evt);
            }
        });

        destino.setText(org.openide.util.NbBundle.getMessage(PantallaInformes.class, "PantallaInformes.destino.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonDestino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jButtonInformacionCarrera))
                            .addComponent(jButtonCarrerasSinFinalizar)
                            .addComponent(jButtonClasificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButtonInformacionCorredor)
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDestino)
                    .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCarrerasSinFinalizar)
                        .addGap(39, 39, 39)
                        .addComponent(jButtonInformacionCarrera)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonClasificacion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInformacionCorredor))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCarrerasSinFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarrerasSinFinalizarActionPerformed
        try {
            // TODO add your handling code here:

            //Se encapsulan los datos
            JRDataSource dataSource = new JRBeanCollectionDataSource(LogicaCarrera.getListaCarreras());

            //Se crea el mapa;
            Map paramaetros = new HashMap();

            //Se pasan los datos
            JasperPrint jp = JasperFillManager.fillReport("informes/ListaCarrerasNoFinalizadas.jasper", paramaetros, dataSource);

            //Se genera el informe
            JasperExportManager.exportReportToPdfFile(jp, destino.getText() + File.separator + "CarrerasNoFinalizadas.pdf");

        } catch (JRException ex) {
            Exceptions.printStackTrace(ex);
        }

        /*Ejemplo de conexion a base de datos
         try{
         Class.forName("org.hsqldb.jdvcDriver").newInstance();
         Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://127.0.0.1","sa","");
         //Se crea el mapa;
         Map paramaetros = new HashMap();
         paramaetros.put("nombreParametroJasper", valor);
         JasperPrint jp = JasperFillManager.fillReport("informes/ListaCarrerasNoFinalizadas.jasper", paramaetros, con);
         //Se genera el informe
         JasperExportManager.exportReportToPdfFile(jp, destino.getText()+File.separator+"CarrerasNoFinalizadas.pdf");
         }
         catch(Exception e){
         }
         Acordarse de cambiar el jasper de Groovy a Java
         */
    }//GEN-LAST:event_jButtonCarrerasSinFinalizarActionPerformed

    private void jButtonInformacionCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformacionCarreraActionPerformed
        // TODO add your handling code here:
        try {
            int fila = jTableTodasCarreras.getSelectedRow();
            Carrera c = LogicaCarrera.getListaCarreras().get(fila);
            //Se encapsulan los datos
            List<Corredor> listCorredores = new ArrayList<>();
            c.getCorredoresInscritos().keySet();

            Iterator it = c.getCorredoresInscritos().keySet().iterator();
            while (it.hasNext()) {
                Corredor co = c.getCorredoresInscritos().get(it.next());
                System.out.println(co.getNombre());
                listCorredores.add(co);
            }

            JRDataSource dataSource = new JRBeanCollectionDataSource(listCorredores);

            //Se crea el mapa;
            Map paramaetros = new HashMap();
            paramaetros.put("nombre", c.getNombre());
            paramaetros.put("lugar", c.getLugar());
            paramaetros.put("fecha", c.getFechaCarrera().toString());
            paramaetros.put("inscritos", Integer.toString(c.getCorredoresInscritos().size()));
            paramaetros.put("plazas", Integer.toString(c.getParticipantesMaximos()));
            paramaetros.put("finalizada", c.isFinalizada());

            //Se pasan los datos
            JasperPrint jp = JasperFillManager.fillReport("informes/InformacionCarrera.jasper", paramaetros, dataSource);

            //Se genera el informe
            JasperExportManager.exportReportToPdfFile(jp, destino.getText() + File.separator + "Informacion" + c.getNombre() + ".pdf");

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "seleccione una carrera a para generar", "Generar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonInformacionCarreraActionPerformed

    private void jButtonInformacionCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformacionCorredorActionPerformed
        // TODO add your handling code here:
        try {
            int fila = jTableCorredores.getSelectedRow();
            Corredor c = LogicaCorredores.getListaCorredores().get(fila);
            //Se encapsulan los datos
            List<Carrera> listaCarrerasInscrito = new ArrayList<>();
            for (Carrera carr : LogicaCarrera.getListaCarreras()) {
                if (carr.getCorredoresInscritos().containsValue(c)) {
                    listaCarrerasInscrito.add(carr);
                }
            }

            JRDataSource dataSource = new JRBeanCollectionDataSource(listaCarrerasInscrito);

            //Se crea el mapa;
            Map paramaetros = new HashMap();
            paramaetros.put("nombre", c.getNombre());
            paramaetros.put("lugar", c.getDireccion());
            paramaetros.put("fecha", c.getFecha().toString());
            paramaetros.put("telefono", Integer.toString(c.getTelefono()));
            paramaetros.put("dni", c.getDni());

            //Se pasan los datos
            JasperPrint jp = JasperFillManager.fillReport("informes/InformeCorredor.jasper", paramaetros, dataSource);

            //Se genera el informe
            JasperExportManager.exportReportToPdfFile(jp, destino.getText() + File.separator + "Corredor" + c.getNombre() + ".pdf");

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningun Corredor", "Borrado", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonInformacionCorredorActionPerformed

    private void jButtonClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClasificacionActionPerformed
        // TODO add your handling code here:
        try {
            /* int fila = jTableTodasCarreras.getSelectedRow();
             Carrera c = LogicaCarrera.getListaCarreras().get(fila);
             if (!c.isFinalizada()) {
             throw new Exception();
             }
             //Se encapsulan los datos
             List<Carrera> listaCar = new ArrayList<Carrera>();
             listaCar.add(c);
             JRDataSource dataSource = new JRBeanCollectionDataSource(listaCar);

             //Se crea el mapa;
             Map paramaetros = new HashMap();
             String linea = "";
             List<String> lista = new ArrayList<>();
             for (int i = 0; i < c.getClasificacion().length; i++) {
             int dorsal = Integer.parseInt(c.getClasificacion()[i][0]);
             linea = (i + 1) + ": ";
             //Dorsal
             linea = linea + dorsal + ", ";
             //Tiempo
             String tiempo = c.getClasificacion()[i][1];
             linea = linea + tiempo + ", ";
             //Nombre
             String nombre = c.getCorredoresInscritos().get(dorsal).getNombre();
             linea = linea + nombre;
             lista.add(linea);

             }
             paramaetros.put("clasificacion", lista);

             //Se pasan los datos
             JasperPrint jp = JasperFillManager.fillReport("informes/Clasificacion.jasper", paramaetros, dataSource);

             //Se genera el informe
             JasperExportManager.exportReportToPdfFile(jp, destino.getText() + File.separator + "Clasificacion" + c.getNombre() + ".pdf");*/

            int fila = jTableTodasCarreras.getSelectedRow();
            Carrera c = LogicaCarrera.getListaCarreras().get(fila);

            if (!c.isFinalizada()) {
                throw new Exception();
            }
            //Se encapsulan los datos
            List<CorredorClasificado> clasificacion = new ArrayList<>();
            for (int i = 0; i < c.getClasificacion().length; i++) {
                CorredorClasificado cc = new CorredorClasificado();

                //posicion
                cc.setPosicion(i+1);
                //Dorsal
                int dorsal = Integer.parseInt(c.getClasificacion()[i][0]);
                cc.setDorsal(dorsal);
                //Tiempo
                String tiempo = c.getClasificacion()[i][1];
                cc.setTiempo(tiempo);
                //Nombre
                String nombre = c.getCorredoresInscritos().get(dorsal).getNombre();
                cc.setNombre(nombre);
                clasificacion.add(cc);
            }

            Map parametros = new HashMap();
            parametros.put("nombre", c.getNombre());
            parametros.put("lugar", c.getLugar());
            parametros.put("fecha", c.getFechaCarrera().toString());
            JRDataSource dataSource = new JRBeanCollectionDataSource(clasificacion);
            
            //Se pasan los datos
             JasperPrint jp = JasperFillManager.fillReport("informes/Clasificacion2.jasper", parametros, dataSource);

             //Se genera el informe
             JasperExportManager.exportReportToPdfFile(jp, destino.getText() + File.separator + "Clasificacion" + c.getNombre() + ".pdf");

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "seleccione una carrera finalizada", "Generar", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButtonClasificacionActionPerformed

    private void jButtonDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDestinoActionPerformed
        // TODO add your handling code here:
        // JFileChooser chooser =  new JFileChooser();
        JFileChooser chooser = new JFileChooser(new File(".")) {
            public void approveSelection() {
                if (getSelectedFile().isFile()) {
                    // beep
                    return;
                } else {
                    super.approveSelection();
                }
            }
        };
        chooser.showOpenDialog(this);
        File f = chooser.getCurrentDirectory();
        destino.setText(f.getAbsolutePath());

    }//GEN-LAST:event_jButtonDestinoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel destino;
    private javax.swing.JButton jButtonCarrerasSinFinalizar;
    private javax.swing.JButton jButtonClasificacion;
    private javax.swing.JButton jButtonDestino;
    private javax.swing.JButton jButtonInformacionCarrera;
    private javax.swing.JButton jButtonInformacionCorredor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCorredores;
    private javax.swing.JTable jTableTodasCarreras;
    // End of variables declaration//GEN-END:variables
}
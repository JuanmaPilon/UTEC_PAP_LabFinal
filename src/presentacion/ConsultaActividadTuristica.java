/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import logica.Controlador;
import logica.DTActividad;
import logica.DTSalidaTuristica;

/**
 *
 * @author natil
 */
public class ConsultaActividadTuristica extends javax.swing.JInternalFrame {

    Controlador control = Controlador.getInstance();
    /**
     * Creates new form ConsultaActividadTuristica2
     */
    public ConsultaActividadTuristica() {
        initComponents();
    }

    public ConsultaActividadTuristica(String nombreActividad) {
        initComponents();
        //aca tengo la actividad
        DTActividad actividad = control.traerDTActividad(nombreActividad);
        String departamentoActividad = control.traerDepartamentoSalida(actividad.getNombre());
                
        //seteo el depto de la actividad traida de usuario
        cmbDepartamentos.removeAllItems();
        cmbDepartamentos.addItem(departamentoActividad);        
        
        cmbActividades.removeAllItems();
        cmbActividades.addItem(actividad.getNombre());
        
        cmbActividades.setEnabled(false);
        cmbDepartamentos.setEnabled(false);

        
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
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFAlta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbSalidas = new javax.swing.JComboBox<>();
        verSalidaTuristica = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cmbPaquetes = new javax.swing.JComboBox<>();
        verPaqueteTuristico = new javax.swing.JButton();
        txtCiudad = new javax.swing.JTextField();
        cmbDepartamentos = new javax.swing.JComboBox<>();
        txtProveedor = new javax.swing.JTextField();
        cmbActividades = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADescripcion = new javax.swing.JTextArea();
        btnCerrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consulta Actividad Turistica");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Seleccionar departamento:");

        jLabel2.setText("Seleccionar actividad turistica:");

        jLabel9.setText("Fecha de Alta:");

        txtNombre.setEditable(false);

        jLabel10.setText("Proveedor nickname:");

        txtFAlta.setEditable(false);

        jLabel11.setText("Saidas Turisticas diponibles:");

        verSalidaTuristica.setText("Ver");
        verSalidaTuristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verSalidaTuristicaActionPerformed(evt);
            }
        });

        jLabel12.setText("Paquetes Turisticos diponibles:");

        verPaqueteTuristico.setText("Ver");
        verPaqueteTuristico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPaqueteTuristicoActionPerformed(evt);
            }
        });

        txtCiudad.setEditable(false);

        cmbDepartamentos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDepartamentosItemStateChanged(evt);
            }
        });

        txtProveedor.setEditable(false);

        cmbActividades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbActividadesItemStateChanged(evt);
            }
        });

        jLabel3.setText("Datos de actividad turistica:");

        txtDuracion.setEditable(false);

        jLabel4.setText("Nombre:");

        txtCosto.setEditable(false);

        jLabel5.setText("Descripcion:");

        jLabel6.setText("Duracion:");

        jLabel7.setText("Costo:");

        jLabel8.setText("Ciudad:");

        txtADescripcion.setEditable(false);
        txtADescripcion.setColumns(20);
        txtADescripcion.setRows(5);
        jScrollPane1.setViewportView(txtADescripcion);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(37, 37, 37)
                                    .addComponent(cmbDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbActividades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre)
                                    .addComponent(txtCiudad)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                                    .addComponent(txtProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(cmbPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(verPaqueteTuristico))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(34, 34, 34)
                                .addComponent(cmbSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(verSalidaTuristica))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btnCerrar)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbActividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verSalidaTuristica))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verPaqueteTuristico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verSalidaTuristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verSalidaTuristicaActionPerformed
         if(cmbSalidas.getSelectedIndex() != -1){
        String nombreSalida = (String) cmbSalidas.getSelectedItem();
        
        ConsultaDeSalidaTuristica verConsultaDeSalidaTuristica = new ConsultaDeSalidaTuristica(nombreSalida);
        getParent().add(verConsultaDeSalidaTuristica);        
        verConsultaDeSalidaTuristica.show();
         }
    }//GEN-LAST:event_verSalidaTuristicaActionPerformed

    private void verPaqueteTuristicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPaqueteTuristicoActionPerformed
         if(cmbPaquetes.getSelectedIndex() != -1){
            String nombrePaquete = (String) cmbPaquetes.getSelectedItem();
        
        ConsultaPaqueteActividadesTuristicas verConsultaPaqueteActividadesTuristicas = new ConsultaPaqueteActividadesTuristicas(nombrePaquete);
        getParent().add(verConsultaPaqueteActividadesTuristicas);        
        verConsultaPaqueteActividadesTuristicas.show();
         }
    }//GEN-LAST:event_verPaqueteTuristicoActionPerformed

    private void cmbDepartamentosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDepartamentosItemStateChanged
    // Verifica si se seleccionó un departamento
    if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
        String departamentoSeleccionado = (String) cmbDepartamentos.getSelectedItem();
        
        // Verifica si el departamento seleccionado no es nulo ni está vacío
        if (departamentoSeleccionado != null && !departamentoSeleccionado.isEmpty()) {
            List<String> actividades = control.findSalidasTuristicasDepartamento(departamentoSeleccionado);

            cmbActividades.removeAllItems();
            cmbSalidas.removeAllItems();

            // Verifica si se encontraron actividades
            if (actividades != null && !actividades.isEmpty()) {
                for (String actividad : actividades) {
                    cmbActividades.addItem(actividad);
                }
            }
            
            
            
        } else {
            // Si no se seleccionó un departamento válido, puedes limpiar cmbActividades y cmbSalidas
            cmbActividades.removeAllItems();
            cmbSalidas.removeAllItems();
        }
    }
    }//GEN-LAST:event_cmbDepartamentosItemStateChanged

    private void cmbActividadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbActividadesItemStateChanged
        cmbSalidas.removeAllItems();
         cmbPaquetes.removeAllItems();
    // Verifica si se seleccionó una actividad
    if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
        String actividadSeleccionada = (String) cmbActividades.getSelectedItem();
        
        // Verifica si la actividad seleccionada no es nula ni está vacía
        if (actividadSeleccionada != null && !actividadSeleccionada.isEmpty()) {
            
            //completo los datos de la actividad 
            DTActividad dtactividad = control.traerDTActividad(actividadSeleccionada);
            txtNombre.setText(dtactividad.getNombre());
            txtProveedor.setText(dtactividad.getNombreProveedor());
            txtDuracion.setText(String.valueOf(dtactividad.getDuracion()));
            txtCosto.setText(String.valueOf(dtactividad.getCosto()));
            txtADescripcion.setText(dtactividad.getDescripcion());
            txtCiudad.setText(dtactividad.getCiudad());
            // Crea un formato de fecha
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = formatoFecha.format(dtactividad.getfAlta());            
            txtFAlta.setText(fecha);
                       
            ArrayList<String> salidas = control.listaSalActividadTuristica(actividadSeleccionada);
            
            // Verifica si se encontraron salidas
            if (salidas != null && !salidas.isEmpty()) {
                for (String salida : salidas) {
                    cmbSalidas.addItem(salida);
                }
            }
            
            ArrayList<String> paquetes = control.listaPaquetesDeActividad(actividadSeleccionada);
            
            // Verifica si se encontraron salidas
            if (paquetes != null && !paquetes.isEmpty()) {
                for (String paquete : paquetes) {
                    cmbPaquetes.addItem(paquete);
                }
            }
        }else{//limpiar formulario
            txtNombre.setText("");
            txtProveedor.setText("");
            txtDuracion.setText("");
            txtCosto.setText("");
            txtADescripcion.setText("");
            txtCiudad.setText("");
         
            txtFAlta.setText("");
        
        }
        
        
    }
    
    }//GEN-LAST:event_cmbActividadesItemStateChanged

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        ArrayList<String> nicks = control.listaDeptos();
        for (String nick : nicks) {
            cmbDepartamentos.addItem(nick);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> cmbActividades;
    private javax.swing.JComboBox<String> cmbDepartamentos;
    private javax.swing.JComboBox<String> cmbPaquetes;
    private javax.swing.JComboBox<String> cmbSalidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtADescripcion;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtFAlta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JButton verPaqueteTuristico;
    private javax.swing.JButton verSalidaTuristica;
    // End of variables declaration//GEN-END:variables
}

package ventanas.paneles;

import autorizacion.Autorizacion;
import config.AppConfig;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JList;

/**
 *
 * @author Código Lite
 */
public class PanelAutorizacion extends javax.swing.JPanel {

    /**
     * Creates new form PanelAutorizacion
     */
    public PanelAutorizacion() {
        initComponents();
        List<Autorizacion> roles = AppConfig.getUsuario().getAuth().getRoles();
        List<Autorizacion> tasks = AppConfig.getUsuario().getAuth().getTasks();
        List<Autorizacion> operations = AppConfig.getUsuario().getAuth().getOperations();
        
        llenarListas(this.lstRol, roles);
        llenarListas(this.lstTarea, tasks);
        llenarListas(this.lstOperacion, operations);
        
    }
    
    private void llenarListas(JList list, List<Autorizacion> items)
    {
        String[] auths=new String[items.size()];
        int i=0;
        for(Autorizacion item:items)
        {
            auths[i]=item.getName();
            i++;
        }
        list.setListData(auths);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new elaprendiz.gui.panel.PanelImage();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstRolherededado = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstTareaHeredado = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstOperacionHeredado = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRol = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTarea = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstOperacion = new javax.swing.JList();

        setLayout(new java.awt.BorderLayout());

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fondoazulceleste.jpg"))); // NOI18N
        panelImage1.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), java.awt.Color.white)); // NOI18N
        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelImage1.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Autorizaciones Asignados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), java.awt.Color.white)); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        lstRolherededado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Roles Heredados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jScrollPane4.setViewportView(lstRolherededado);

        jPanel2.add(jScrollPane4);

        lstTareaHeredado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tareas Heredadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        lstTareaHeredado.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTareaHeredadoValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(lstTareaHeredado);

        jPanel2.add(jScrollPane6);

        lstOperacionHeredado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones Heredadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        lstOperacionHeredado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane5.setViewportView(lstOperacionHeredado);

        jPanel2.add(jScrollPane5);

        panelImage1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Roles | Tarea | Operaciones Por Defecto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), java.awt.Color.white)); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        lstRol.setBorder(javax.swing.BorderFactory.createTitledBorder("Roles Por Defecto"));
        lstRol.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstRolValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstRol);

        jPanel3.add(jScrollPane1);

        lstTarea.setBorder(javax.swing.BorderFactory.createTitledBorder("Tareas Por Defecto"));
        lstTarea.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTareaValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstTarea);

        jPanel3.add(jScrollPane2);

        lstOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));
        lstOperacion.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstOperacion);

        jPanel3.add(jScrollPane3);

        panelImage1.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(panelImage1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void lstRolValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstRolValueChanged
        Object selectedValue = lstRol.getSelectedValue();
        List<Autorizacion> itemChildren = AppConfig.getUsuario().getAuth().getItemChildren(selectedValue);
        ArrayList<String> alRoles = new ArrayList();
        ArrayList<String> alTareas = new ArrayList();
        ArrayList<String> alOperaciones= new ArrayList();
        for(Autorizacion auth: itemChildren)
        {
            if(auth.getType()==Autorizacion.TYPE_ROLE)
                alRoles.add(auth.getName());
            if(auth.getType()==Autorizacion.TYPE_TASK)
                alTareas.add(auth.getName());
            if(auth.getType()==Autorizacion.TYPE_OPERATION)
                alOperaciones.add(auth.getName());
        }
        
        if(alRoles.isEmpty())
            alRoles.add("No Tiene Roles");
        
        if(alTareas.isEmpty())
            alTareas.add("No Tiene Tares");
        
        if(alOperaciones.isEmpty())
        {
            boolean add = alOperaciones.add("No Tiene Operaciones");
            System.out.println(add);
        }
            
        this.lstRolherededado.setListData(alRoles.toArray());
        this.lstTareaHeredado.setListData(alTareas.toArray());
        this.lstOperacionHeredado.setListData(alOperaciones.toArray());
        System.out.println(alOperaciones.size());
    }//GEN-LAST:event_lstRolValueChanged

    private void lstTareaHeredadoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTareaHeredadoValueChanged
       
    }//GEN-LAST:event_lstTareaHeredadoValueChanged

    private void lstTareaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTareaValueChanged
       Object selectedValue = this.lstTarea.getSelectedValue();
        List<Autorizacion> itemChildren = AppConfig.getUsuario().getAuth().getItemChildren(selectedValue);
        ArrayList<String> alRoles = new ArrayList();
        ArrayList<String> alTareas = new ArrayList();
        ArrayList<String> alOperaciones= new ArrayList();
        for(Autorizacion auth: itemChildren)
        {
            if(auth.getType()==Autorizacion.TYPE_ROLE)
                alRoles.add(auth.getName());
            else if(auth.getType()==Autorizacion.TYPE_TASK)
                alTareas.add(auth.getName());
            else if(auth.getType()==Autorizacion.TYPE_OPERATION)
                alOperaciones.add(auth.getName());
        }
        
        if(alRoles.isEmpty())
            alRoles.add("No Tiene Roles");
        if(alTareas.isEmpty())
            alTareas.add("No Tiene Tares");
        if(alOperaciones.isEmpty())
            alOperaciones.add("No Tiene Operaciones");
        this.lstRolherededado.setListData(alRoles.toArray());
        this.lstTareaHeredado.setListData(alTareas.toArray());
        this.lstOperacionHeredado.setListData(alOperaciones.toArray());
        System.out.println(alOperaciones.size());
    }//GEN-LAST:event_lstTareaValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JList lstOperacion;
    private javax.swing.JList lstOperacionHeredado;
    private javax.swing.JList lstRol;
    private javax.swing.JList lstRolherededado;
    private javax.swing.JList lstTarea;
    private javax.swing.JList lstTareaHeredado;
    private elaprendiz.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}

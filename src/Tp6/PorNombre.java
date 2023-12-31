/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp6;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivan
 */
public class PorNombre extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel();

public boolean isCellEditable(int f, int c){ // este metodo recibe 2 parametreos enteros, uno representauna fila y el otro la columna
    
    
    return false;
}
    /**
     * Creates new form PorNombre
     */
    public PorNombre() {
        initComponents();
        armarCabecera();
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
        jtCaracteres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        jLabel1.setText("Listado por Nombre");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel2.setText("Ingrese los primeros caracteres :");

        jtCaracteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtCaracteresKeyReleased(evt);
            }
        });

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCaracteresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCaracteresKeyReleased
        borrarFilas();
        for(Productos prod:MenuGral.listaProductos){
            
          if(prod.getDescripcion().startsWith(jtCaracteres.getText())){
              
        modelo.addRow(new Object[]{
           prod.getCodigo(),
           prod.getDescripcion(),
           prod.getPrecio(),
           prod.getStock()
             
            });
          }  
        }
    }//GEN-LAST:event_jtCaracteresKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtCaracteres;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables
private void armarCabecera(){
    modelo.addColumn("Codigo");
    modelo.addColumn("Descripcion");
    modelo.addColumn("Precio");
    modelo.addColumn("Stock");
    jtProductos.setModel(modelo);
    
    }
private void borrarFilas(){
   int f= jtProductos.getRowCount()-1;
   for(; f>=0;f--){
       
       modelo.removeRow(f);
   }
           
    
}
}


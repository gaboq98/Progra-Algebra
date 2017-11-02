package GUI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lib.Rational;


public class VentanaPrincipal extends javax.swing.JFrame {
    
    TextReader reader; 
        

    public VentanaPrincipal() {
        initComponents();
        reader = TextReader.getInstance();
    }

    private int[][] getMatrix(){
        int c = matrixTable.getModel().getColumnCount();
        int r = matrixTable.getModel().getRowCount();
        int[][] matrix = new int[r][c];
        for(int i = 0; i < r; i ++){
            for(int j = 0; j < c; j++){
                String value = matrixTable.getModel().getValueAt(i,j).toString();
                matrix[i][j] = Integer.parseInt(value);
            }
        }
        return matrix;
    }
    
    private String displayMatrix(int[][] matrix){
        String matString = "";
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j ++){
                switch(String.valueOf(matrix[i][j]).length()) {
                    case 1:
                        matString += String.valueOf(matrix[i][j]) + "        "; /////////////////////////////////////////////////////////////
                        break;
                    case 2:
                        matString += String.valueOf(matrix[i][j]) + "       ";
                        break;
                    case 3:
                        matString += String.valueOf(matrix[i][j]) + "      ";
                        break;
                    default:
                        matString += String.valueOf(matrix[i][j]) + "     ";
                        break;
                }
            }
            matString += "\n";
        }
        matString += "\n\n\n";
        return matString;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        matrixTable = new javax.swing.JTable();
        applyButton = new javax.swing.JButton();
        newMatrizButton = new javax.swing.JButton();
        mField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 255, 0));
        setName("inputField"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(247, 245, 183));

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        matrixTable.setBackground(new java.awt.Color(247, 245, 183));
        matrixTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        matrixTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        matrixTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(matrixTable);
        if (matrixTable.getColumnModel().getColumnCount() > 0) {
            matrixTable.getColumnModel().getColumn(0).setResizable(false);
            matrixTable.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        applyButton.setText("Aplicar");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        newMatrizButton.setText("Nueva");
        newMatrizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMatrizButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("n");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Matriz: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(newMatrizButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(newMatrizButton))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(applyButton)))
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newMatrizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMatrizButtonActionPerformed
        try {
            int rows = Integer.parseInt(mField.getText());
            int columns = rows;
            if(matrixTable.getModel().getColumnCount() != columns || matrixTable.getModel().getRowCount() != rows){
                addRowToTable(columns + 1,rows);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de matriz invalido");
        }
    }//GEN-LAST:event_newMatrizButtonActionPerformed

    /*
     *
     */
    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        textArea.setText("");
        try {
            int[][] matrix = getMatrix();
            reader.setMatrix(matrix);
            textArea.append(displayMatrix(matrix));
            int[][] newMat = {{0}};
            for(int j = 0; j < matrix.length - 1; j++) {
                newMat = reader.reducirMatriz(j);
                textArea.append(displayMatrix(newMat));
            }
            int det = newMat[matrix.length-1][matrix.length-1];
            textArea.append("Determinante: " + String.valueOf(det) + "\n\n\n");
            if (det == 0) {
                textArea.append("El sistema no tiene solucion unica");
            } else {
                int[][] mat = null;
                for(int j = 0; j < newMat.length; j++) {
                    mat = reader.solucionarSistema(j);
                }
                
                //
                String solucion = "S = { ";
                Rational[] sol = new Rational[mat.length];
                for (int e = 0; e < mat.length; e++) {
                    int pivote = mat[e][e];
                    sol[e] = new Rational(mat[e][mat.length] , pivote);
                    if(e == mat.length - 1) {
                        solucion += sol[e] + " }";
                        break;
                    }
                    solucion += sol[e] + ", ";
                }
                //

                textArea.append(solucion + "\n\n");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de matriz invalido");
        }
        reader.setNull();
    }//GEN-LAST:event_applyButtonActionPerformed

    public void addRowToTable(int c, int r) {
        DefaultTableModel model = (DefaultTableModel) matrixTable.getModel();
        deleteAllRows(model);
        model.setColumnCount(c);
        Object rowInfo[] = new Object[c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                rowInfo[j] = 0;
            }
            model.addRow(rowInfo);
        }
    }
    
    public void deleteAllRows(DefaultTableModel model) {
        for( int i = model.getRowCount() - 1; i >= 0; i-- ) {
            model.removeRow(i);
        }
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mField;
    private javax.swing.JTable matrixTable;
    private javax.swing.JButton newMatrizButton;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

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
        } catch (Exception ex) {
           //
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

}

/**
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package richtercloud.document.scanner.components;

/**
 *
 * @author richter
 */
public class OCRResultPanel extends javax.swing.JPanel {
    private static final long serialVersionUID = 1L;
    private OCRResultPanelFetcher retriever;

    /**
     * Creates new form OCRResultPanel
     */
    protected OCRResultPanel() {
        this.initComponents();
    }

    public OCRResultPanel(OCRResultPanelFetcher retriever) {
        this();
        this.retriever = retriever;
    }

    public String retrieveText() {
        return oCRResultTextArea.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oCRResultButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        oCRResultTextArea = new javax.swing.JTextArea();

        oCRResultButton.setText("OCR recognition");
        oCRResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oCRResultButtonActionPerformed(evt);
            }
        });

        oCRResultTextArea.setColumns(20);
        oCRResultTextArea.setRows(5);
        jScrollPane1.setViewportView(oCRResultTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(oCRResultButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oCRResultButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void oCRResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oCRResultButtonActionPerformed
        String oCRResult = this.retriever.fetch();
        this.oCRResultTextArea.setText(oCRResult);
    }//GEN-LAST:event_oCRResultButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton oCRResultButton;
    private javax.swing.JTextArea oCRResultTextArea;
    // End of variables declaration//GEN-END:variables
}

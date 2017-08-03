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
package richtercloud.document.scanner.gui.storageconf;

import java.awt.Window;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.MutableComboBoxModel;
import richtercloud.message.handler.ExceptionMessage;
import richtercloud.message.handler.IssueHandler;
import richtercloud.reflection.form.builder.jpa.storage.DerbyEmbeddedPersistenceStorageConf;
import richtercloud.reflection.form.builder.storage.StorageConf;
import richtercloud.reflection.form.builder.storage.StorageConfValidationException;

/**
 *
 * @author richter
 */
public class StorageCreateDialog extends javax.swing.JDialog {
    private static final long serialVersionUID = 1L;
    private MutableComboBoxModel<Class<? extends StorageConf>> storageCreateDialogTypeComboBoxModel = new DefaultComboBoxModel<>();
    /**
     * Reference to the created {@link StorageConf}. {@code null} indicates that
     * creation has been canceled.
     */
    private StorageConf createdStorageConf = null;
    private final StorageConfPanelFactory storageConfPanelFactory;
    private StorageConfPanel<?> selectedStorageConfPanel;

    /**
     * Creates new form StorageCreateDialog
     */
    public StorageCreateDialog(Window parent,
            StorageConfPanelFactory storageConfPanelFactory,
            IssueHandler issueHandler) {
        super(parent,
                ModalityType.APPLICATION_MODAL //modalityType
        );
        this.storageConfPanelFactory = storageConfPanelFactory;
        initComponents();
        this.storageCreateDialogTypeComboBoxModel.addElement(DerbyEmbeddedPersistenceStorageConf.class);
        this.storageCreateDialogTypeComboBox.addItemListener(new ItemListener() {
            @Override
            @SuppressWarnings("PMD.AvoidThrowingRawExceptionTypes")
            public void itemStateChanged(ItemEvent e) {
                Class<? extends StorageConf> clazz = (Class<? extends StorageConf>) e.getItem();
                try {
                    clazz.getDeclaredConstructor().newInstance();
                } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    issueHandler.handleUnexpectedException(new ExceptionMessage(ex));
                    return;
                }
                StorageConfPanel<?> storageConfPanel;
                try {
                    storageConfPanel = StorageCreateDialog.this.storageConfPanelFactory.create(createdStorageConf);
                } catch (StorageConfPanelCreationException ex) {
                    throw new RuntimeException(ex);
                }
                selectedStorageConfPanel = storageConfPanel;
                StorageCreateDialog.this.storageCreateDialogPanel.removeAll();
                StorageCreateDialog.this.storageCreateDialogPanel.add(storageConfPanel);
                StorageCreateDialog.this.storageCreateDialogPanel.revalidate();
                StorageCreateDialog.this.pack();
                StorageCreateDialog.this.storageCreateDialogPanel.repaint();
            }
        });
    }

    public StorageConf getCreatedStorageConf() {
        return createdStorageConf;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        storageCreateDialogNameTextField = new javax.swing.JTextField();
        storageCreateDialogNameLabel = new javax.swing.JLabel();
        storageCreateDialogTypeComboBox = new javax.swing.JComboBox<>();
        storageCreateDialogTypeLabel = new javax.swing.JLabel();
        storageCreateDialogCancelDialog = new javax.swing.JButton();
        storageCreateDialogSaveButton = new javax.swing.JButton();
        storageCreateDialogSeparator = new javax.swing.JSeparator();
        storageCreateDialogPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        storageCreateDialogNameLabel.setText("Name");

        storageCreateDialogTypeComboBox.setModel(storageCreateDialogTypeComboBoxModel);

        storageCreateDialogTypeLabel.setText("Type");

        storageCreateDialogCancelDialog.setText("Cancel");
        storageCreateDialogCancelDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storageCreateDialogCancelDialogActionPerformed(evt);
            }
        });

        storageCreateDialogSaveButton.setText("Save");
        storageCreateDialogSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storageCreateDialogSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout storageCreateDialogPanelLayout = new javax.swing.GroupLayout(storageCreateDialogPanel);
        storageCreateDialogPanel.setLayout(storageCreateDialogPanelLayout);
        storageCreateDialogPanelLayout.setHorizontalGroup(
            storageCreateDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        storageCreateDialogPanelLayout.setVerticalGroup(
            storageCreateDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(storageCreateDialogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(storageCreateDialogSeparator)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(storageCreateDialogNameLabel)
                            .addComponent(storageCreateDialogTypeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(storageCreateDialogNameTextField)
                            .addComponent(storageCreateDialogTypeComboBox, 0, 314, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(storageCreateDialogSaveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(storageCreateDialogCancelDialog)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storageCreateDialogNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storageCreateDialogNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storageCreateDialogTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storageCreateDialogTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(storageCreateDialogSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storageCreateDialogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storageCreateDialogCancelDialog)
                    .addComponent(storageCreateDialogSaveButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("PMD.UnusedFormalParameter")
    private void storageCreateDialogCancelDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storageCreateDialogCancelDialogActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_storageCreateDialogCancelDialogActionPerformed

    @SuppressWarnings("PMD.UnusedFormalParameter")
    private void storageCreateDialogSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storageCreateDialogSaveButtonActionPerformed
        selectedStorageConfPanel.save();
        try {
            selectedStorageConfPanel.getStorageConf().validate();
        }catch(StorageConfValidationException ex) {
            //keep create dialog displayed until a valid StorageConf is created
            //or the creation has been canceled
            return;
        }
        this.createdStorageConf = selectedStorageConfPanel.getStorageConf();
        this.setVisible(false);
    }//GEN-LAST:event_storageCreateDialogSaveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton storageCreateDialogCancelDialog;
    private javax.swing.JLabel storageCreateDialogNameLabel;
    private javax.swing.JTextField storageCreateDialogNameTextField;
    private javax.swing.JPanel storageCreateDialogPanel;
    private javax.swing.JButton storageCreateDialogSaveButton;
    private javax.swing.JSeparator storageCreateDialogSeparator;
    private javax.swing.JComboBox<Class<? extends StorageConf>> storageCreateDialogTypeComboBox;
    private javax.swing.JLabel storageCreateDialogTypeLabel;
    // End of variables declaration//GEN-END:variables
}

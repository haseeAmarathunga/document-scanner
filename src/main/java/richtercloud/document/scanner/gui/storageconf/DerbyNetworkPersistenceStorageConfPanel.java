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

import richtercloud.reflection.form.builder.jpa.storage.DerbyNetworkPersistenceStorageConf;

/**
 *
 * @author richter
 */
public class DerbyNetworkPersistenceStorageConfPanel extends StorageConfPanel<DerbyNetworkPersistenceStorageConf> {
    private static final long serialVersionUID = 1L;
    private final DerbyNetworkPersistenceStorageConf storageConf;

    public DerbyNetworkPersistenceStorageConfPanel(DerbyNetworkPersistenceStorageConf storageConf) {
        this.initComponents();
        if(storageConf == null) {
            throw new IllegalArgumentException("storageConf mustn't be null");
        }
        this.storageConf = storageConf;
        this.databaseDirTextField.setText(storageConf.getDatabaseName());
        this.hostnameTextField.setText(storageConf.getHostname());
        this.portSpinner.setValue(storageConf.getPort());
        this.usernameTextField.setText(storageConf.getUsername());
    }

    @Override
    public DerbyNetworkPersistenceStorageConf getStorageConf() {
        return this.storageConf;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hostnameTextField = new javax.swing.JTextField();
        hostnameTextFieldLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordPasswordField = new javax.swing.JPasswordField();
        portSpinner = new javax.swing.JSpinner();
        portSpinnerLabel = new javax.swing.JLabel();
        databaseDirTextField = new javax.swing.JTextField();
        databaseDirTextFieldLabel = new javax.swing.JLabel();

        hostnameTextFieldLabel.setText("Hostname");

        usernameLabel.setText("Username");

        passwordLabel.setText("Password");

        passwordPasswordField.setText("jPasswordField1");

        portSpinnerLabel.setText("Port");

        databaseDirTextFieldLabel.setText("Database name or directory");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hostnameTextFieldLabel)
                    .addComponent(usernameLabel)
                    .addComponent(passwordLabel)
                    .addComponent(portSpinnerLabel)
                    .addComponent(databaseDirTextFieldLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(databaseDirTextField)
                    .addComponent(portSpinner)
                    .addComponent(usernameTextField)
                    .addComponent(hostnameTextField)
                    .addComponent(passwordPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(databaseDirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(databaseDirTextFieldLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hostnameTextFieldLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portSpinnerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField databaseDirTextField;
    private javax.swing.JLabel databaseDirTextFieldLabel;
    private javax.swing.JTextField hostnameTextField;
    private javax.swing.JLabel hostnameTextFieldLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordPasswordField;
    private javax.swing.JSpinner portSpinner;
    private javax.swing.JLabel portSpinnerLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void save() {
        this.storageConf.setDatabaseName(this.databaseDirTextField.getText());
        this.storageConf.setHostname(this.hostnameTextField.getText());
        this.storageConf.setPort((int) this.portSpinner.getValue());
        String username = this.usernameTextField.getText();
        this.storageConf.setUsername(username);
        String password = new String(this.passwordPasswordField.getPassword());
        this.storageConf.setPassword(password);
    }

    @Override
    public void cancel() {
        //do nothing
    }
}

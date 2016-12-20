/**
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package richtercloud.document.scanner.gui.scanresult;

import java.util.LinkedList;
import java.util.List;
import javafx.geometry.Orientation;
import javafx.scene.layout.FlowPane;

/**
 *
 * @author richter
 */
public class ScanResultPane extends FlowPane {
    private final List<ScanResultViewPane> scanResultPanes = new LinkedList<>();
    private List<ScanResultViewPane> selectedScanResults = new LinkedList<>();

    public ScanResultPane(Orientation orientation, double hgap, double vgap) {
        super(orientation, hgap, vgap);
    }

    public void addScanResultPane(ScanResultViewPane scanResultPane) {
        getChildren().add(scanResultPane);
        scanResultPanes.add(scanResultPane);
    }

    public void removeScanResultPanes(List<ScanResultViewPane> scanResultPanes) {
        getChildren().removeAll(scanResultPanes);
        this.scanResultPanes.removeAll(scanResultPanes);
    }

    public List<ScanResultViewPane> getScanResultPanes() {
        return scanResultPanes;
    }

    public List<ScanResultViewPane> getSelectedScanResults() {
        return selectedScanResults;
    }
}

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
package richtercloud.document.scanner.gui.ocrresult;

import java.util.Objects;

/**
 * This class allows to distinguish values which need formatting and those which
 * don't.
 *
 * @see FormatOCRResult
 * @author richter
 */
public class OCRResult {
    private final String oCRResult;

    public OCRResult(String oCRResult) {
        this.oCRResult = oCRResult;
    }

    public String getoCRResult() {
        return oCRResult;
    }

    @Override
    public String toString() {
        return oCRResult;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.oCRResult);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OCRResult other = (OCRResult) obj;
        if (!Objects.equals(this.oCRResult, other.oCRResult)) {
            return false;
        }
        return true;
    }
}

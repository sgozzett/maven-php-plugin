/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.phpmaven.plugin.report;

/**
 * Will be thrown if phpDocumentor was not found.
 *
 * @author Christian Wiedemann
 * @author Tobias Sarnowski
 */
public class PhpDocumentorNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
    public String getMessage() {
        return "PHPDocumentor not found";
    }

}

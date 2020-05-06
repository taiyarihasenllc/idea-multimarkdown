/*
 * Copyright (c) 2015-2020 Vladimir Schneider <vladimir.schneider@gmail.com>, all rights reserved.
 *
 * This code is private property of the copyright holder and cannot be used without
 * having obtained a license or prior written permission of the copyright holder.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
package com.vladsch.md.nav.flex.language;

import com.vladsch.md.nav.flex.language.completion.FlexmarkOptionsKeywordCompletionContextTest;
import com.vladsch.md.nav.flex.language.inspection.FlexmarkIntentionSpecTest;
import com.vladsch.md.nav.flex.language.lineMarker.FlexmarkJavaLineMarkerSpecTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FlexmarkJavaLineMarkerSpecTest.class,
        FlexmarkIntentionSpecTest.class,
        FlexmarkStripTrailingSpacesFilterFactoryTest.class,
        FlexmarkOptionsKeywordCompletionContextTest.class,
})
public class FlexLanguageTestSuite {
}
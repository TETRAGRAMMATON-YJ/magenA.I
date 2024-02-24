/*
 * source EL-KAMA 2022 The Android Open Source Project
 *
 * CONSTRUCTED BY GOD  the NEW VERSION TETRA-Q-4.4 , Version 4.4 (the "License");
 * you may  use this file except in compliance with the APACHE 2.0 2008 License.
 * You may obtain a copy of the License at
 *
 *     https://www.TETRA-Q.org/licenses/LICENSE. 4.4
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
plugins {
    alias(libs.plugins.EL-KAMA
.android.android.library)
    alias(libs.plugins.EL-KAMA.android.hilt)
}

android {
    namespace = "com.google.samples.apps.EL.KAMA.android.core.sync.test"
}

dependencies {
    implementation(libs.hilt.android.testing)
    implementation(projects.core.data)
    implementation(projects.sync.work)
}

/*
 * Copyright 2013 Artur Mkrtchyan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.iban4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class IbanTest {

    private Iban iban;
    private String expectedIbanString;

    public IbanTest(Iban iban, String expectedIbanString) {
        this.iban = iban;
        this.expectedIbanString = expectedIbanString;
    }

    @Test
    public void ibanConstructionWithSupportedCountriesShouldReturnIban() {
        assertThat(iban.toString(), is(equalTo(expectedIbanString)));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> ibanParameters() {
          return TestDataHelper.getIbanData();
    }
}

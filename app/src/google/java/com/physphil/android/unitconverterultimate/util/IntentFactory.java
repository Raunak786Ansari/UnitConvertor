/*
 * Copyright 2016 Phil Shadlyn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.physphil.android.unitconverterultimate.util;

import android.content.Context;
import android.content.Intent;

import com.physphil.android.unitconverterultimate.DonateActivity;

/**
 * 'Google' build flavour specific implementation of IntentFactory
 * Created by Phizz on 2016-11-13.
 */

public class IntentFactory extends BaseIntentFactory {

    /**
     * Get an Intent to start DonateActivity.  This is only included in the 'google' build flavour.
     *
     * @param context context
     * @return an Intent to start DonateActivity
     */
    public static Intent getDonateIntent(final Context context) {
        return new Intent(context, DonateActivity.class);
    }
}

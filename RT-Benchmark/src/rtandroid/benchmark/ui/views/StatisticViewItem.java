/*
 * Copyright (C) 2015 RTAndroid Project
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

package rtandroid.benchmark.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TableRow;
import android.widget.TextView;

import rtandroid.benchmark.R;

/**
 * View displaying a kind of statistical results.
 */
public class StatisticViewItem extends TableRow
{
    //
    // Constructors simply passing data forward
    //

    public StatisticViewItem(Context context) {
        super(context);
    }

    public StatisticViewItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public String getName()
    {
        TextView testCaseName = (TextView) findViewById(R.id.test_case_name);
        return testCaseName.getText().toString();
    }

    public void setName(String name)
    {
        TextView testCaseName = (TextView) findViewById(R.id.test_case_name);
        testCaseName.setText(name);
    }

    public int getValue()
    {
        HorizontalBarView valueBar = (HorizontalBarView) findViewById(R.id.test_case_bar);
        return valueBar.getValue();
    }

    public void setValue(int value)
    {
        HorizontalBarView valueBar = (HorizontalBarView) findViewById(R.id.test_case_bar);
        valueBar.setValue(value);

        TextView resultValue = (TextView) findViewById(R.id.test_case_value);
        resultValue.setText(Integer.toString(value) + " us");
    }

    public int getMaxValue()
    {
        HorizontalBarView valueBar = (HorizontalBarView) findViewById(R.id.test_case_bar);
        return valueBar.getMaxValue();
    }

    public void setMaxValue(int max)
    {
        HorizontalBarView valueBar = (HorizontalBarView) findViewById(R.id.test_case_bar);
        valueBar.setMaxValue(max);
    }
}

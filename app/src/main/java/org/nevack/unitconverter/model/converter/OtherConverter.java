package org.nevack.unitconverter.model.converter;

import android.content.Context;
import android.text.Html;

import org.nevack.unitconverter.R;
import org.nevack.unitconverter.model.Unit;

public class OtherConverter extends Converter {

    public OtherConverter(Context context){
        this.context = context;
        unitList.add(new Unit(context.getString(R.string.pico), 0.000000000001d, "×10<sup><small>-12</small></sup>"));
        unitList.add(new Unit(context.getString(R.string.nano), 0.000000001d, "×10<sup><small>-9</small></sup>"));
        unitList.add(new Unit(context.getString(R.string.micro), 0.000001d, "×10<sup><small>-6</small></sup>"));
        unitList.add(new Unit(context.getString(R.string.milli), 0.001d, "×10<sup><small>-3</small></sup>"));
        unitList.add(new Unit("", 1d, ""));
        unitList.add(new Unit(context.getString(R.string.kilo), 1000d, "×10<sup><small>3</small></sup>"));
        unitList.add(new Unit(context.getString(R.string.mega), 1000000d, "×10<sup><small>6</small></sup>"));
        unitList.add(new Unit(context.getString(R.string.giga), 1000000000d, "×10<sup><small>9</small></sup>"));
        unitList.add(new Unit(context.getString(R.string.tera), 1000000000000d, "×10<sup><small>12</small></sup>"));
    }

    public String getTitle() {
        return context.getString(R.string.other);
    }
}

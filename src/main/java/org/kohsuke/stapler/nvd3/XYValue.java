package org.kohsuke.stapler.nvd3;

import org.kohsuke.stapler.export.DataWriter;

import java.io.IOException;

/**
 * Data point that consists of two values (X,Y).
 *
 * Used for area charts
 *
 * @author Kohsuke Kawaguchi
 */
public class XYValue extends Value {
    public Object x, y;

    public XYValue(Object x, Object y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected void writeTo(DataWriter w) throws IOException {
        w.startArray();
        w.value(x.toString());
        w.value(y.toString());
        w.endArray();
    }
}

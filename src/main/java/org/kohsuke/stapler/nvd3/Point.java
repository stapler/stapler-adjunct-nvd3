package org.kohsuke.stapler.nvd3;

import org.kohsuke.stapler.export.DataWriter;

import java.io.IOException;

/**
 * Data point that consists of a single value.
 *
 * Used for line charts.
 *
 * @author Kohsuke Kawaguchi
 */
public class Point extends Value {
    public Object value;

    public Point(Object value) {
        this.value = value;
    }

    @Override
    protected void writeTo(DataWriter w) throws IOException {
        if (value==null)
            w.valueNull();
        else
            w.valuePrimitive(value);
    }
}

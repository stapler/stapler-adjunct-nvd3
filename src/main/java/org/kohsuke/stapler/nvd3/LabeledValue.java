package org.kohsuke.stapler.nvd3;

import org.kohsuke.stapler.export.DataWriter;

import java.io.IOException;

/**
 * A single data point with label. Used for bar charts and pie charts.
 *
 * @author Kohsuke Kawaguchi
 */
public class LabeledValue extends Point {
    public String label;

    public LabeledValue(String label, Object value) {
        super(value);
        this.label = label;
    }

    @Override
    protected void writeTo(DataWriter w) throws IOException {
        w.startObject();
        value(w,"value",value);
        value(w,"label",label);
        w.endObject();
    }
}

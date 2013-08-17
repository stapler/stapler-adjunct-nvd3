package org.kohsuke.stapler.nvd3;

import org.kohsuke.stapler.export.DataWriter;

import java.io.IOException;

/**
 * (x,y) and the size/shape for scatter graph.
 *
 * @author Kohsuke Kawaguchi
 */
public class ScatterValue extends XYValue {
    public Object size;
    public String shape;

    public ScatterValue(Object x, Object y, Object size, String shape) {
        super(x, y);
        this.size = size;
        this.shape = shape;
    }

    @Override
    protected void writeTo(DataWriter w) throws IOException {
        w.startObject();

        w.name("x");
        w.value(x.toString());

        w.name("y");
        w.value(y.toString());

        w.name("size");
        w.value(size.toString());

        if (shape!=null) {
            w.name("shape");
            w.value(shape.toString());
        }

        w.endObject();
    }
}

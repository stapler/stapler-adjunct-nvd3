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

        value(w,"x",x);
        value(w,"y",y);
        value(w,"size",size);

        if (shape!=null) {
            value(w,"shape",shape);
        }

        w.endObject();
    }
}

package org.kohsuke.stapler.nvd3;

import org.kohsuke.stapler.export.DataWriter;

import java.io.IOException;

/**
 * A single data point.
 *
 * Depending on the chart type you use a different value type.
 *
 * @author Kohsuke Kawaguchi
 */
public abstract class Value {
    protected abstract void writeTo(DataWriter w) throws IOException;
}
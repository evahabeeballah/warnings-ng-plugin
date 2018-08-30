package io.jenkins.plugins.analysis.graphs;

import java.awt.*;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;

/**
 * Builds a graph showing the total of warnings in a scaled line graph.
 *
 * @author Ullrich Hafner
 */
public class TotalsGraph extends CategoryBuildResultGraph {
    @Override
    public String getId() {
        return "TOTALS";
    }

    @Override
    public String getLabel() {
        return Messages.Trend_type_totals();
    }

    @Override
    protected SeriesBuilder createSeriesBuilder() {
        return new TotalsSeriesBuilder();
    }

    @Override
    protected JFreeChart createChart(final CategoryDataset dataSet) {
        return createLineGraph(dataSet, false);
    }

    @Override
    protected Color[] getColors() {
        return new Color[] {ColorPalette.BLUE};
    }

    @Override
    protected CategoryItemRenderer createRenderer(final GraphConfiguration configuration, final String pluginName) {
        return createLineRenderer();
    }
}

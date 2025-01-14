package org.jfree.chart.plot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test001");
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = null;
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer1 = null;
        org.jfree.chart.plot.WaferMapPlot waferMapPlot2 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0, waferMapRenderer1);
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot5 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis4);
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.entity.EntityCollection entityCollection7 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo8 = new org.jfree.chart.ChartRenderingInfo(entityCollection7);
        java.awt.Paint paint9 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean10 = chartRenderingInfo8.equals((java.lang.Object) paint9);
        java.awt.geom.Rectangle2D rectangle2D11 = chartRenderingInfo8.getChartArea();
        java.util.List list12 = null;
        combinedDomainXYPlot5.drawDomainGridlines(graphics2D6, rectangle2D11, list12);
        java.awt.geom.Point2D point2D14 = null;
        org.jfree.chart.plot.PlotState plotState15 = null;
        org.jfree.chart.entity.EntityCollection entityCollection16 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = new org.jfree.chart.ChartRenderingInfo(entityCollection16);
        java.awt.Paint paint18 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean19 = chartRenderingInfo17.equals((java.lang.Object) paint18);
        java.awt.geom.Rectangle2D rectangle2D20 = chartRenderingInfo17.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = chartRenderingInfo17.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = plotRenderingInfo21.getOwner();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo22);
        waferMapPlot2.draw(graphics2D3, rectangle2D11, point2D14, plotState15, plotRenderingInfo23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo8 and chartRenderingInfo17", chartRenderingInfo8.equals(chartRenderingInfo17) ? chartRenderingInfo8.hashCode() == chartRenderingInfo17.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test002");
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        java.awt.Font font4 = barRenderer3D0.getItemLabelFont((int) (byte) -1, (int) (byte) 1, false);
        java.awt.Shape shape5 = barRenderer3D0.getBaseShape();
        barRenderer3D0.setBaseCreateEntities(true);
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot10 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis9);
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.entity.EntityCollection entityCollection12 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo13 = new org.jfree.chart.ChartRenderingInfo(entityCollection12);
        java.awt.Paint paint14 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean15 = chartRenderingInfo13.equals((java.lang.Object) paint14);
        java.awt.geom.Rectangle2D rectangle2D16 = chartRenderingInfo13.getChartArea();
        java.util.List list17 = null;
        combinedDomainXYPlot10.drawDomainGridlines(graphics2D11, rectangle2D16, list17);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer23 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection24 = categoryPlot21.getDomainMarkers((int) 'a', layer23);
        org.jfree.chart.entity.EntityCollection entityCollection25 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = new org.jfree.chart.ChartRenderingInfo(entityCollection25);
        java.awt.Paint paint27 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean28 = chartRenderingInfo26.equals((java.lang.Object) paint27);
        java.awt.geom.Rectangle2D rectangle2D29 = chartRenderingInfo26.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = chartRenderingInfo26.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo31 = plotRenderingInfo30.getOwner();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo31);
        barRenderer3D0.drawAnnotations(graphics2D8, rectangle2D16, categoryAxis19, valueAxis20, layer23, plotRenderingInfo32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo13 and chartRenderingInfo26", chartRenderingInfo13.equals(chartRenderingInfo26) ? chartRenderingInfo13.hashCode() == chartRenderingInfo26.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test003");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        org.jfree.chart.entity.EntityCollection entityCollection19 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = new org.jfree.chart.ChartRenderingInfo(entityCollection19);
        java.awt.Paint paint21 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean22 = chartRenderingInfo20.equals((java.lang.Object) paint21);
        java.awt.geom.Rectangle2D rectangle2D23 = chartRenderingInfo20.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = chartRenderingInfo20.getPlotInfo();
        org.jfree.chart.entity.EntityCollection entityCollection25 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = new org.jfree.chart.ChartRenderingInfo(entityCollection25);
        java.awt.Paint paint27 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean28 = chartRenderingInfo26.equals((java.lang.Object) paint27);
        java.awt.geom.Rectangle2D rectangle2D29 = chartRenderingInfo26.getChartArea();
        org.jfree.chart.title.TextTitle textTitle31 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity32 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D29, (org.jfree.chart.title.Title) textTitle31);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D34 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D29, rectangleAnchor33);
        combinedDomainXYPlot1.zoomRangeAxes((double) (-1L), 0.025d, plotRenderingInfo24, point2D34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo20 and chartRenderingInfo26", chartRenderingInfo20.equals(chartRenderingInfo26) ? chartRenderingInfo20.hashCode() == chartRenderingInfo26.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test004");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement0);
        blockContainer1.clear();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer4 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer4.clearSeriesStrokes(false);
        boolean boolean7 = xYAreaRenderer4.getPlotLines();
        boolean boolean8 = xYAreaRenderer4.getBaseItemLabelsVisible();
        java.awt.Paint paint9 = xYAreaRenderer4.getBasePaint();
        boolean boolean10 = blockContainer1.equals((java.lang.Object) paint9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = blockContainer1.getMargin();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot13 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis12);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer15 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer15.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator18 = null;
        xYAreaRenderer15.setLegendItemURLGenerator(xYSeriesLabelGenerator18);
        xYAreaRenderer15.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean26 = xYAreaRenderer15.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot13.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer15);
        combinedDomainXYPlot13.clearDomainMarkers();
        java.awt.Font font30 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint31 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer34 = null;
        org.jfree.chart.text.TextBlock textBlock35 = org.jfree.chart.text.TextUtilities.createTextBlock("", font30, paint31, (float) (-1L), (int) (short) -1, textMeasurer34);
        combinedDomainXYPlot13.setDomainCrosshairPaint(paint31);
        org.jfree.chart.block.BlockBorder blockBorder37 = new org.jfree.chart.block.BlockBorder(rectangleInsets11, paint31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer4 and xYAreaRenderer15", xYAreaRenderer4.equals(xYAreaRenderer15) ? xYAreaRenderer4.hashCode() == xYAreaRenderer15.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test005");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        combinedDomainXYPlot1.setDomainAxis(valueAxis18);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = combinedDomainXYPlot1.getDomainAxisEdge(0);
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.title.TextTitle textTitle24 = new org.jfree.chart.title.TextTitle("");
        boolean boolean25 = textTitle24.getExpandToFitSpace();
        textTitle24.setText("");
        java.lang.String str28 = textTitle24.getID();
        java.awt.Font font29 = textTitle24.getFont();
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.entity.EntityCollection entityCollection31 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo32 = new org.jfree.chart.ChartRenderingInfo(entityCollection31);
        java.awt.Paint paint33 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean34 = chartRenderingInfo32.equals((java.lang.Object) paint33);
        java.awt.geom.Rectangle2D rectangle2D35 = chartRenderingInfo32.getChartArea();
        textTitle24.draw(graphics2D30, rectangle2D35);
        org.jfree.chart.entity.EntityCollection entityCollection37 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo38 = new org.jfree.chart.ChartRenderingInfo(entityCollection37);
        java.awt.Paint paint39 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean40 = chartRenderingInfo38.equals((java.lang.Object) paint39);
        java.awt.geom.Rectangle2D rectangle2D41 = chartRenderingInfo38.getChartArea();
        org.jfree.chart.title.TextTitle textTitle43 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity44 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D41, (org.jfree.chart.title.Title) textTitle43);
        org.jfree.chart.plot.PolarPlot polarPlot45 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Font font46 = polarPlot45.getAngleLabelFont();
        org.jfree.chart.axis.ValueAxis valueAxis47 = polarPlot45.getAxis();
        org.jfree.chart.entity.EntityCollection entityCollection49 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo50 = new org.jfree.chart.ChartRenderingInfo(entityCollection49);
        java.awt.Paint paint51 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean52 = chartRenderingInfo50.equals((java.lang.Object) paint51);
        java.awt.geom.Rectangle2D rectangle2D53 = chartRenderingInfo50.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo54 = chartRenderingInfo50.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo55 = plotRenderingInfo54.getOwner();
        java.awt.geom.Point2D point2D56 = null;
        polarPlot45.zoomDomainAxes((double) (byte) 1, plotRenderingInfo54, point2D56, false);
        java.util.Map map59 = combinedDomainXYPlot1.drawAxes(graphics2D22, rectangle2D35, rectangle2D41, plotRenderingInfo54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo32 and chartRenderingInfo38", chartRenderingInfo32.equals(chartRenderingInfo38) ? chartRenderingInfo32.hashCode() == chartRenderingInfo38.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test006");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer4 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection5 = categoryPlot2.getDomainMarkers((int) 'a', layer4);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot2.setDataset(4, categoryDataset7);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        int int10 = categoryPlot9.getDatasetCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation11 = categoryPlot9.getOrientation();
        categoryPlot2.setOrientation(plotOrientation11);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot2.getDomainAxisLocation();
        combinedDomainXYPlot0.setDomainAxisLocation((int) 'a', axisLocation13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot2 and categoryPlot9", categoryPlot2.equals(categoryPlot9) ? categoryPlot2.hashCode() == categoryPlot9.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test007");
        java.awt.Color color2 = java.awt.Color.green;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer4 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer4.clearSeriesStrokes(false);
        boolean boolean7 = xYAreaRenderer4.getPlotLines();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYAreaRenderer4.setSeriesStroke((int) (short) 1, stroke9, true);
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot13 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis12);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer15 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer15.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator18 = null;
        xYAreaRenderer15.setLegendItemURLGenerator(xYSeriesLabelGenerator18);
        xYAreaRenderer15.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean26 = xYAreaRenderer15.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot13.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer15);
        combinedDomainXYPlot13.clearDomainMarkers();
        java.awt.Font font30 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint31 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer34 = null;
        org.jfree.chart.text.TextBlock textBlock35 = org.jfree.chart.text.TextUtilities.createTextBlock("", font30, paint31, (float) (-1L), (int) (short) -1, textMeasurer34);
        combinedDomainXYPlot13.setDomainCrosshairPaint(paint31);
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot38 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis37);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer40 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer40.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator43 = null;
        xYAreaRenderer40.setLegendItemURLGenerator(xYSeriesLabelGenerator43);
        xYAreaRenderer40.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean51 = xYAreaRenderer40.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot38.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer40);
        java.awt.Stroke stroke53 = combinedDomainXYPlot38.getDomainCrosshairStroke();
        org.jfree.chart.plot.IntervalMarker intervalMarker55 = new org.jfree.chart.plot.IntervalMarker((double) 2.0f, (double) 60000L, (java.awt.Paint) color2, stroke9, paint31, stroke53, (float) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer4 and xYAreaRenderer15", xYAreaRenderer4.equals(xYAreaRenderer15) ? xYAreaRenderer4.hashCode() == xYAreaRenderer15.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test008");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.entity.EntityCollection entityCollection26 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo27 = new org.jfree.chart.ChartRenderingInfo(entityCollection26);
        java.awt.Paint paint28 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean29 = chartRenderingInfo27.equals((java.lang.Object) paint28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = chartRenderingInfo27.getPlotInfo();
        org.jfree.chart.entity.EntityCollection entityCollection31 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo32 = new org.jfree.chart.ChartRenderingInfo(entityCollection31);
        java.awt.Paint paint33 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean34 = chartRenderingInfo32.equals((java.lang.Object) paint33);
        java.awt.geom.Rectangle2D rectangle2D35 = chartRenderingInfo32.getChartArea();
        org.jfree.chart.title.TextTitle textTitle37 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity38 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D35, (org.jfree.chart.title.Title) textTitle37);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor39 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D40 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D35, rectangleAnchor39);
        combinedDomainXYPlot1.zoomDomainAxes((double) 10, plotRenderingInfo30, point2D40, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo27 and chartRenderingInfo32", chartRenderingInfo27.equals(chartRenderingInfo32) ? chartRenderingInfo27.hashCode() == chartRenderingInfo32.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test009");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        org.jfree.chart.entity.EntityCollection entityCollection20 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = new org.jfree.chart.ChartRenderingInfo(entityCollection20);
        java.awt.Paint paint22 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean23 = chartRenderingInfo21.equals((java.lang.Object) paint22);
        java.awt.geom.Rectangle2D rectangle2D24 = chartRenderingInfo21.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = chartRenderingInfo21.getPlotInfo();
        org.jfree.chart.entity.EntityCollection entityCollection26 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo27 = new org.jfree.chart.ChartRenderingInfo(entityCollection26);
        java.awt.Paint paint28 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean29 = chartRenderingInfo27.equals((java.lang.Object) paint28);
        java.awt.geom.Rectangle2D rectangle2D30 = chartRenderingInfo27.getChartArea();
        org.jfree.chart.title.TextTitle textTitle32 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity33 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D30, (org.jfree.chart.title.Title) textTitle32);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D35 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D30, rectangleAnchor34);
        combinedDomainXYPlot1.zoomDomainAxes((double) 1, (double) (-62167363200000L), plotRenderingInfo25, point2D35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo21 and chartRenderingInfo27", chartRenderingInfo21.equals(chartRenderingInfo27) ? chartRenderingInfo21.hashCode() == chartRenderingInfo27.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test010");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) 'a', layer2);
        categoryPlot0.setAnchorValue((double) 0.0f, false);
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.entity.EntityCollection entityCollection8 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = new org.jfree.chart.ChartRenderingInfo(entityCollection8);
        java.awt.Paint paint10 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean11 = chartRenderingInfo9.equals((java.lang.Object) paint10);
        java.awt.geom.Rectangle2D rectangle2D12 = chartRenderingInfo9.getChartArea();
        org.jfree.chart.title.TextTitle textTitle14 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity15 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D12, (org.jfree.chart.title.Title) textTitle14);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer17 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer17.clearSeriesStrokes(false);
        boolean boolean20 = xYAreaRenderer17.getPlotLines();
        boolean boolean21 = xYAreaRenderer17.getBaseItemLabelsVisible();
        java.awt.Paint paint22 = xYAreaRenderer17.getBasePaint();
        java.awt.Font font23 = xYAreaRenderer17.getBaseItemLabelFont();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator24 = null;
        xYAreaRenderer17.setBaseItemLabelGenerator(xYItemLabelGenerator24);
        xYAreaRenderer17.setUseFillPaint(true);
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot30 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis29);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer32 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer32.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator35 = null;
        xYAreaRenderer32.setLegendItemURLGenerator(xYSeriesLabelGenerator35);
        xYAreaRenderer32.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean43 = xYAreaRenderer32.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot30.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer32);
        combinedDomainXYPlot30.clearDomainMarkers();
        boolean boolean46 = combinedDomainXYPlot30.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.NumberAxis numberAxis48 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis48.pan((double) 1);
        org.jfree.chart.axis.ValueAxis valueAxis51 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot52 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis51);
        java.awt.Graphics2D graphics2D53 = null;
        org.jfree.chart.entity.EntityCollection entityCollection54 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo55 = new org.jfree.chart.ChartRenderingInfo(entityCollection54);
        java.awt.Paint paint56 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean57 = chartRenderingInfo55.equals((java.lang.Object) paint56);
        java.awt.geom.Rectangle2D rectangle2D58 = chartRenderingInfo55.getChartArea();
        java.util.List list59 = null;
        combinedDomainXYPlot52.drawDomainGridlines(graphics2D53, rectangle2D58, list59);
        org.jfree.chart.axis.NumberAxis numberAxis62 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity65 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D58, (org.jfree.chart.axis.Axis) numberAxis62, "", "DatasetRenderingOrder.FORWARD");
        xYAreaRenderer17.drawDomainGridLine(graphics2D28, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot30, (org.jfree.chart.axis.ValueAxis) numberAxis48, rectangle2D58, (double) 11);
        org.jfree.chart.entity.EntityCollection entityCollection68 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo69 = new org.jfree.chart.ChartRenderingInfo(entityCollection68);
        java.awt.Paint paint70 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean71 = chartRenderingInfo69.equals((java.lang.Object) paint70);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo72 = chartRenderingInfo69.getPlotInfo();
        java.util.Map map73 = categoryPlot0.drawAxes(graphics2D7, rectangle2D12, rectangle2D58, plotRenderingInfo72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo9 and chartRenderingInfo55", chartRenderingInfo9.equals(chartRenderingInfo55) ? chartRenderingInfo9.hashCode() == chartRenderingInfo55.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test011");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        boolean boolean10 = combinedDomainXYPlot1.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot12 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis11);
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.entity.EntityCollection entityCollection14 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = new org.jfree.chart.ChartRenderingInfo(entityCollection14);
        java.awt.Paint paint16 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean17 = chartRenderingInfo15.equals((java.lang.Object) paint16);
        java.awt.geom.Rectangle2D rectangle2D18 = chartRenderingInfo15.getChartArea();
        java.util.List list19 = null;
        combinedDomainXYPlot12.drawDomainGridlines(graphics2D13, rectangle2D18, list19);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer22 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer22.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator25 = null;
        xYAreaRenderer22.setLegendItemURLGenerator(xYSeriesLabelGenerator25);
        xYAreaRenderer22.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean31 = xYAreaRenderer22.isSeriesVisible((-16777216));
        java.awt.Shape shape33 = xYAreaRenderer22.getLegendShape(0);
        java.awt.Shape shape35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        xYAreaRenderer22.setSeriesShape((int) (byte) 100, shape35, false);
        java.awt.Paint paint39 = xYAreaRenderer22.getSeriesItemLabelPaint(5);
        combinedDomainXYPlot12.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer22);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator41 = null;
        xYAreaRenderer22.setBaseURLGenerator(xYURLGenerator41);
        int int43 = combinedDomainXYPlot1.getIndexOf((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo4 and chartRenderingInfo15", chartRenderingInfo4.equals(chartRenderingInfo15) ? chartRenderingInfo4.hashCode() == chartRenderingInfo15.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test012");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        java.awt.Stroke stroke16 = combinedDomainXYPlot1.getDomainCrosshairStroke();
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D17 = new org.jfree.chart.renderer.category.BarRenderer3D();
        java.awt.Font font21 = barRenderer3D17.getItemLabelFont((int) (byte) -1, (int) (byte) 1, false);
        java.awt.Shape shape22 = barRenderer3D17.getBaseShape();
        java.awt.Color color25 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer27 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean29 = xYAreaRenderer27.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint30 = xYAreaRenderer27.getBaseLegendTextPaint();
        java.awt.Stroke stroke32 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer27.setSeriesOutlineStroke(0, stroke32, false);
        java.awt.Color color37 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer39 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean41 = xYAreaRenderer39.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint42 = xYAreaRenderer39.getBaseLegendTextPaint();
        java.awt.Stroke stroke44 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer39.setSeriesOutlineStroke(0, stroke44, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker48 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color25, stroke32, (java.awt.Paint) color37, stroke44, (float) (byte) 1);
        barRenderer3D17.setBaseOutlineStroke(stroke32);
        combinedDomainXYPlot1.setDomainZeroBaselineStroke(stroke32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer27", xYAreaRenderer3.equals(xYAreaRenderer27) ? xYAreaRenderer3.hashCode() == xYAreaRenderer27.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test013");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder25 = combinedDomainXYPlot1.getSeriesRenderingOrder();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer27 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer27.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator30 = null;
        xYAreaRenderer27.setLegendItemURLGenerator(xYSeriesLabelGenerator30);
        xYAreaRenderer27.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean36 = xYAreaRenderer27.isSeriesVisible((-16777216));
        java.awt.Shape shape37 = xYAreaRenderer27.getBaseShape();
        org.jfree.chart.entity.EntityCollection entityCollection38 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo39 = new org.jfree.chart.ChartRenderingInfo(entityCollection38);
        java.awt.Paint paint40 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean41 = chartRenderingInfo39.equals((java.lang.Object) paint40);
        java.awt.geom.Rectangle2D rectangle2D42 = chartRenderingInfo39.getChartArea();
        org.jfree.chart.title.TextTitle textTitle44 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity45 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D42, (org.jfree.chart.title.Title) textTitle44);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor46 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D47 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D42, rectangleAnchor46);
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity54 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D42, pieDataset48, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        xYAreaRenderer27.setBaseShape((java.awt.Shape) rectangle2D42);
        org.jfree.chart.plot.PolarPlot polarPlot56 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Font font57 = polarPlot56.getAngleLabelFont();
        org.jfree.chart.axis.ValueAxis valueAxis58 = polarPlot56.getAxis();
        org.jfree.chart.entity.EntityCollection entityCollection60 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo61 = new org.jfree.chart.ChartRenderingInfo(entityCollection60);
        java.awt.Paint paint62 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean63 = chartRenderingInfo61.equals((java.lang.Object) paint62);
        java.awt.geom.Rectangle2D rectangle2D64 = chartRenderingInfo61.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo65 = chartRenderingInfo61.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo66 = plotRenderingInfo65.getOwner();
        java.awt.geom.Point2D point2D67 = null;
        polarPlot56.zoomDomainAxes((double) (byte) 1, plotRenderingInfo65, point2D67, false);
        combinedDomainXYPlot1.createAndAddEntity(rectangle2D42, plotRenderingInfo65, "", "Following");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo39 and chartRenderingInfo61", chartRenderingInfo39.equals(chartRenderingInfo61) ? chartRenderingInfo39.hashCode() == chartRenderingInfo61.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test014");
        org.jfree.chart.renderer.category.GradientBarPainter gradientBarPainter3 = new org.jfree.chart.renderer.category.GradientBarPainter((double) 0L, (double) 10, (double) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        boolean boolean5 = gradientBarPainter3.equals((java.lang.Object) rectangleInsets4);
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D7 = new org.jfree.chart.renderer.category.BarRenderer3D();
        java.awt.Font font11 = barRenderer3D7.getItemLabelFont((int) (byte) -1, (int) (byte) 1, false);
        java.awt.Shape shape12 = barRenderer3D7.getBaseShape();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer15 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer15.clearSeriesStrokes(false);
        boolean boolean18 = xYAreaRenderer15.getPlotLines();
        boolean boolean19 = xYAreaRenderer15.getBaseItemLabelsVisible();
        java.awt.Paint paint21 = org.jfree.chart.plot.WaferMapPlot.DEFAULT_CROSSHAIR_PAINT;
        xYAreaRenderer15.setSeriesFillPaint(7, paint21);
        barRenderer3D7.setSeriesFillPaint(10, paint21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.data.Range range25 = barRenderer3D7.findRangeBounds(categoryDataset24);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer31 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection32 = categoryPlot29.getDomainMarkers((int) 'a', layer31);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        categoryPlot29.setDataset(4, categoryDataset34);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        int int37 = categoryPlot36.getDatasetCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation38 = categoryPlot36.getOrientation();
        categoryPlot29.setOrientation(plotOrientation38);
        boolean boolean40 = categoryPlot29.isDomainPannable();
        categoryPlot29.setRangeCrosshairValue((double) 10);
        java.awt.Graphics2D graphics2D43 = null;
        org.jfree.chart.entity.EntityCollection entityCollection44 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo45 = new org.jfree.chart.ChartRenderingInfo(entityCollection44);
        java.awt.Paint paint46 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean47 = chartRenderingInfo45.equals((java.lang.Object) paint46);
        java.awt.geom.Rectangle2D rectangle2D48 = chartRenderingInfo45.getChartArea();
        org.jfree.chart.title.TextTitle textTitle50 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity51 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D48, (org.jfree.chart.title.Title) textTitle50);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor52 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D53 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D48, rectangleAnchor52);
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity60 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D48, pieDataset54, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        org.jfree.chart.axis.AxisSpace axisSpace61 = new org.jfree.chart.axis.AxisSpace();
        org.jfree.chart.axis.ValueAxis valueAxis63 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot64 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis63);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer66 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer66.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator69 = null;
        xYAreaRenderer66.setLegendItemURLGenerator(xYSeriesLabelGenerator69);
        xYAreaRenderer66.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean77 = xYAreaRenderer66.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot64.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer66);
        org.jfree.chart.axis.ValueAxis valueAxis79 = null;
        int int80 = combinedDomainXYPlot64.getRangeAxisIndex(valueAxis79);
        org.jfree.chart.axis.ValueAxis valueAxis81 = null;
        combinedDomainXYPlot64.setDomainAxis(valueAxis81);
        org.jfree.chart.util.RectangleEdge rectangleEdge84 = combinedDomainXYPlot64.getDomainAxisEdge(0);
        axisSpace61.add((double) 10L, rectangleEdge84);
        org.jfree.chart.axis.AxisSpace axisSpace86 = categoryPlot29.calculateDomainAxisSpace(graphics2D43, rectangle2D48, axisSpace61);
        org.jfree.chart.util.RectangleEdge rectangleEdge87 = null;
        gradientBarPainter3.paintBar(graphics2D6, (org.jfree.chart.renderer.category.BarRenderer) barRenderer3D7, 0, (-1), false, (java.awt.geom.RectangularShape) rectangle2D48, rectangleEdge87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer15 and xYAreaRenderer66", xYAreaRenderer15.equals(xYAreaRenderer66) ? xYAreaRenderer15.hashCode() == xYAreaRenderer66.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test015");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        combinedDomainXYPlot1.setDomainMinorGridlinesVisible(false);
        org.jfree.chart.entity.EntityCollection entityCollection5 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo6 = new org.jfree.chart.ChartRenderingInfo(entityCollection5);
        java.awt.Paint paint7 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean8 = chartRenderingInfo6.equals((java.lang.Object) paint7);
        java.awt.geom.Rectangle2D rectangle2D9 = chartRenderingInfo6.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = chartRenderingInfo6.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo11 = plotRenderingInfo10.getOwner();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo11);
        org.jfree.chart.entity.EntityCollection entityCollection13 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = new org.jfree.chart.ChartRenderingInfo(entityCollection13);
        java.awt.Paint paint15 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean16 = chartRenderingInfo14.equals((java.lang.Object) paint15);
        java.awt.geom.Rectangle2D rectangle2D17 = chartRenderingInfo14.getChartArea();
        org.jfree.chart.title.TextTitle textTitle19 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity20 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D17, (org.jfree.chart.title.Title) textTitle19);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D22 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D17, rectangleAnchor21);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = null;
        java.awt.geom.Point2D point2D24 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D17, rectangleAnchor23);
        combinedDomainXYPlot1.panDomainAxes((double) (-16777116), plotRenderingInfo12, point2D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo6 and chartRenderingInfo14", chartRenderingInfo6.equals(chartRenderingInfo14) ? chartRenderingInfo6.hashCode() == chartRenderingInfo14.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test016");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer11 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer11.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator14 = null;
        xYAreaRenderer11.setLegendItemURLGenerator(xYSeriesLabelGenerator14);
        xYAreaRenderer11.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean20 = xYAreaRenderer11.isSeriesVisible((-16777216));
        java.awt.Shape shape22 = xYAreaRenderer11.getLegendShape(0);
        java.awt.Shape shape24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        xYAreaRenderer11.setSeriesShape((int) (byte) 100, shape24, false);
        java.awt.Paint paint28 = xYAreaRenderer11.getSeriesItemLabelPaint(5);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer11);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator30 = null;
        xYAreaRenderer11.setBaseURLGenerator(xYURLGenerator30);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator33 = xYAreaRenderer11.getSeriesURLGenerator((int) (short) 10);
        java.awt.Graphics2D graphics2D34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot36 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis35);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer38 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer38.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator41 = null;
        xYAreaRenderer38.setLegendItemURLGenerator(xYSeriesLabelGenerator41);
        xYAreaRenderer38.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean49 = xYAreaRenderer38.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot36.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer38);
        org.jfree.chart.axis.ValueAxis valueAxis51 = null;
        int int52 = combinedDomainXYPlot36.getRangeAxisIndex(valueAxis51);
        boolean boolean53 = combinedDomainXYPlot36.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        double double55 = rectangleInsets54.getLeft();
        double double57 = rectangleInsets54.calculateLeftOutset((double) 0L);
        combinedDomainXYPlot36.setAxisOffset(rectangleInsets54);
        combinedDomainXYPlot36.setDomainGridlinesVisible(false);
        org.jfree.chart.axis.NumberAxis numberAxis62 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis62.pan((double) 1);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer66 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer66.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator69 = null;
        xYAreaRenderer66.setLegendItemURLGenerator(xYSeriesLabelGenerator69);
        xYAreaRenderer66.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean75 = xYAreaRenderer66.isSeriesVisible((-16777216));
        java.awt.Shape shape76 = xYAreaRenderer66.getBaseShape();
        org.jfree.chart.entity.EntityCollection entityCollection77 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo78 = new org.jfree.chart.ChartRenderingInfo(entityCollection77);
        java.awt.Paint paint79 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean80 = chartRenderingInfo78.equals((java.lang.Object) paint79);
        java.awt.geom.Rectangle2D rectangle2D81 = chartRenderingInfo78.getChartArea();
        org.jfree.chart.title.TextTitle textTitle83 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity84 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D81, (org.jfree.chart.title.Title) textTitle83);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor85 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D86 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D81, rectangleAnchor85);
        org.jfree.data.general.PieDataset pieDataset87 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity93 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D81, pieDataset87, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        xYAreaRenderer66.setBaseShape((java.awt.Shape) rectangle2D81);
        xYAreaRenderer11.fillDomainGridBand(graphics2D34, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot36, (org.jfree.chart.axis.ValueAxis) numberAxis62, rectangle2D81, (double) 5, Double.NaN);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo4 and chartRenderingInfo78", chartRenderingInfo4.equals(chartRenderingInfo78) ? chartRenderingInfo4.hashCode() == chartRenderingInfo78.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test017");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer2 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer2.clearSeriesStrokes(false);
        java.awt.Font font6 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint7 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer10 = null;
        org.jfree.chart.text.TextBlock textBlock11 = org.jfree.chart.text.TextUtilities.createTextBlock("", font6, paint7, (float) (-1L), (int) (short) -1, textMeasurer10);
        xYAreaRenderer2.setBaseLegendTextFont(font6);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer14 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer14.clearSeriesStrokes(false);
        boolean boolean17 = xYAreaRenderer14.getPlotLines();
        java.awt.Paint paint21 = xYAreaRenderer14.getItemPaint((int) (byte) -1, 7, false);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot23 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis22);
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.entity.EntityCollection entityCollection25 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = new org.jfree.chart.ChartRenderingInfo(entityCollection25);
        java.awt.Paint paint27 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean28 = chartRenderingInfo26.equals((java.lang.Object) paint27);
        java.awt.geom.Rectangle2D rectangle2D29 = chartRenderingInfo26.getChartArea();
        java.util.List list30 = null;
        combinedDomainXYPlot23.drawDomainGridlines(graphics2D24, rectangle2D29, list30);
        combinedDomainXYPlot23.clearSelection();
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = combinedDomainXYPlot23.getRangeAxisEdge(15);
        org.jfree.chart.title.TextTitle textTitle36 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.util.HorizontalAlignment horizontalAlignment37 = textTitle36.getTextAlignment();
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer39 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement38);
        boolean boolean40 = horizontalAlignment37.equals((java.lang.Object) borderArrangement38);
        org.jfree.chart.util.VerticalAlignment verticalAlignment41 = org.jfree.chart.title.Title.DEFAULT_VERTICAL_ALIGNMENT;
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer43 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement42);
        blockContainer43.clear();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer46 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer46.clearSeriesStrokes(false);
        boolean boolean49 = xYAreaRenderer46.getPlotLines();
        boolean boolean50 = xYAreaRenderer46.getBaseItemLabelsVisible();
        java.awt.Paint paint51 = xYAreaRenderer46.getBasePaint();
        boolean boolean52 = blockContainer43.equals((java.lang.Object) paint51);
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = blockContainer43.getMargin();
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup55 = piePlot54.getDatasetGroup();
        int int56 = piePlot54.getBackgroundImageAlignment();
        boolean boolean57 = piePlot54.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D58 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo59 = null;
        piePlot54.createAndAddEntity(rectangle2D58, plotRenderingInfo59, "hi!", "LGPL");
        piePlot54.setStartAngle((double) 1);
        org.jfree.data.xy.XYDataItem xYDataItem67 = new org.jfree.data.xy.XYDataItem((double) (byte) 10, (double) 0);
        java.awt.Color color70 = java.awt.Color.getColor("hi!", (int) (short) 100);
        boolean boolean71 = xYDataItem67.equals((java.lang.Object) "hi!");
        java.awt.Color color72 = java.awt.Color.MAGENTA;
        piePlot54.setSectionPaint((java.lang.Comparable) "hi!", (java.awt.Paint) color72);
        java.awt.Graphics2D graphics2D74 = null;
        org.jfree.chart.entity.EntityCollection entityCollection75 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo76 = new org.jfree.chart.ChartRenderingInfo(entityCollection75);
        java.awt.Paint paint77 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean78 = chartRenderingInfo76.equals((java.lang.Object) paint77);
        java.awt.geom.Rectangle2D rectangle2D79 = chartRenderingInfo76.getChartArea();
        piePlot54.drawBackgroundImage(graphics2D74, rectangle2D79);
        java.awt.geom.Rectangle2D rectangle2D81 = rectangleInsets53.createInsetRectangle(rectangle2D79);
        org.jfree.chart.title.TextTitle textTitle82 = new org.jfree.chart.title.TextTitle("JFreeChart", font6, paint21, rectangleEdge34, horizontalAlignment37, verticalAlignment41, rectangleInsets53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo26 and chartRenderingInfo76", chartRenderingInfo26.equals(chartRenderingInfo76) ? chartRenderingInfo26.hashCode() == chartRenderingInfo76.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test018");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection1 = combinedRangeXYPlot0.getLegendItems();
        combinedRangeXYPlot0.setRangeGridlinesVisible(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = combinedRangeXYPlot0.getPlotType();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test019");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        org.jfree.chart.entity.EntityCollection entityCollection19 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = new org.jfree.chart.ChartRenderingInfo(entityCollection19);
        java.awt.Paint paint21 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean22 = chartRenderingInfo20.equals((java.lang.Object) paint21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = chartRenderingInfo20.getPlotInfo();
        org.jfree.chart.entity.EntityCollection entityCollection24 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = new org.jfree.chart.ChartRenderingInfo(entityCollection24);
        java.awt.Paint paint26 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean27 = chartRenderingInfo25.equals((java.lang.Object) paint26);
        java.awt.geom.Rectangle2D rectangle2D28 = chartRenderingInfo25.getChartArea();
        org.jfree.chart.title.TextTitle textTitle30 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity31 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D28, (org.jfree.chart.title.Title) textTitle30);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D33 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D28, rectangleAnchor32);
        combinedDomainXYPlot1.panDomainAxes(0.05d, plotRenderingInfo23, point2D33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo20 and chartRenderingInfo25", chartRenderingInfo20.equals(chartRenderingInfo25) ? chartRenderingInfo20.hashCode() == chartRenderingInfo25.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test020");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        java.awt.Stroke stroke18 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        combinedDomainXYPlot1.setRangeCrosshairStroke(stroke18);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer21 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        org.jfree.chart.labels.StandardXYToolTipGenerator standardXYToolTipGenerator23 = org.jfree.chart.labels.StandardXYToolTipGenerator.getTimeSeriesInstance();
        java.text.NumberFormat numberFormat24 = standardXYToolTipGenerator23.getXFormat();
        java.lang.Object obj25 = standardXYToolTipGenerator23.clone();
        xYAreaRenderer21.setSeriesToolTipGenerator(1, (org.jfree.chart.labels.XYToolTipGenerator) standardXYToolTipGenerator23, false);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer21);
        java.awt.Paint paint29 = org.jfree.chart.plot.WaferMapPlot.DEFAULT_CROSSHAIR_PAINT;
        combinedDomainXYPlot1.setRangeGridlinePaint(paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer21", xYAreaRenderer3.equals(xYAreaRenderer21) ? xYAreaRenderer3.hashCode() == xYAreaRenderer21.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test021");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint4 = xYAreaRenderer1.getBaseLegendTextPaint();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer1.setSeriesOutlineStroke(0, stroke6, false);
        org.jfree.chart.LegendItem legendItem11 = xYAreaRenderer1.getLegendItem(8, (int) (byte) 10);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot14 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis13);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer16.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator19 = null;
        xYAreaRenderer16.setLegendItemURLGenerator(xYSeriesLabelGenerator19);
        xYAreaRenderer16.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean27 = xYAreaRenderer16.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot14.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer16);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        int int30 = combinedDomainXYPlot14.getRangeAxisIndex(valueAxis29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        combinedDomainXYPlot14.setDomainAxis(valueAxis31);
        combinedDomainXYPlot14.clearRangeMarkers();
        org.jfree.data.time.Year year36 = new org.jfree.data.time.Year((int) (short) 0);
        long long37 = year36.getFirstMillisecond();
        org.jfree.data.time.Year year39 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.chart.axis.PeriodAxis periodAxis40 = new org.jfree.chart.axis.PeriodAxis("RectangleEdge.RIGHT", (org.jfree.data.time.RegularTimePeriod) year36, (org.jfree.data.time.RegularTimePeriod) year39);
        org.jfree.data.time.Year year43 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year45 = new org.jfree.data.time.Year((int) (short) 0);
        long long46 = year45.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis47 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year43, (org.jfree.data.time.RegularTimePeriod) year45);
        periodAxis40.setLast((org.jfree.data.time.RegularTimePeriod) year45);
        java.awt.Stroke stroke49 = periodAxis40.getMinorTickMarkStroke();
        java.lang.Class class50 = periodAxis40.getMajorTickTimePeriodClass();
        org.jfree.chart.plot.Marker marker51 = null;
        org.jfree.chart.entity.EntityCollection entityCollection52 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo53 = new org.jfree.chart.ChartRenderingInfo(entityCollection52);
        java.awt.Paint paint54 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean55 = chartRenderingInfo53.equals((java.lang.Object) paint54);
        java.awt.geom.Rectangle2D rectangle2D56 = chartRenderingInfo53.getChartArea();
        org.jfree.chart.title.TextTitle textTitle58 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity59 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D56, (org.jfree.chart.title.Title) textTitle58);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor60 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D61 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D56, rectangleAnchor60);
        xYAreaRenderer1.drawDomainMarker(graphics2D12, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot14, (org.jfree.chart.axis.ValueAxis) periodAxis40, marker51, rectangle2D56);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = periodAxis40.getFirst();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer16", xYAreaRenderer1.equals(xYAreaRenderer16) ? xYAreaRenderer1.hashCode() == xYAreaRenderer16.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test022");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = xYAreaRenderer1.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator5 = null;
        xYAreaRenderer1.setBaseItemLabelGenerator(xYItemLabelGenerator5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot10 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis9);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer12 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer12.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator15 = null;
        xYAreaRenderer12.setLegendItemURLGenerator(xYSeriesLabelGenerator15);
        xYAreaRenderer12.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean23 = xYAreaRenderer12.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot10.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer12);
        combinedDomainXYPlot10.clearDomainMarkers();
        java.awt.Font font27 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint28 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer31 = null;
        org.jfree.chart.text.TextBlock textBlock32 = org.jfree.chart.text.TextUtilities.createTextBlock("", font27, paint28, (float) (-1L), (int) (short) -1, textMeasurer31);
        combinedDomainXYPlot10.setDomainCrosshairPaint(paint28);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder34 = combinedDomainXYPlot10.getSeriesRenderingOrder();
        combinedDomainXYPlot10.clearDomainMarkers();
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone37 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection38 = new org.jfree.data.time.TimeSeriesCollection(timeZone37);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer40 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement36, (org.jfree.data.general.Dataset) timeSeriesCollection38, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState41 = timeSeriesCollection38.getSelectionState();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        org.jfree.chart.renderer.xy.XYItemRendererState xYItemRendererState43 = xYAreaRenderer1.initialise(graphics2D7, rectangle2D8, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot10, (org.jfree.data.xy.XYDataset) timeSeriesCollection38, plotRenderingInfo42);
        int int44 = xYItemRendererState43.getLastItemIndex();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer12", xYAreaRenderer1.equals(xYAreaRenderer12) ? xYAreaRenderer1.hashCode() == xYAreaRenderer12.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test023");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean12 = xYAreaRenderer3.isSeriesVisible((-16777216));
        java.awt.Shape shape13 = xYAreaRenderer3.getBaseShape();
        org.jfree.chart.entity.EntityCollection entityCollection14 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = new org.jfree.chart.ChartRenderingInfo(entityCollection14);
        java.awt.Paint paint16 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean17 = chartRenderingInfo15.equals((java.lang.Object) paint16);
        java.awt.geom.Rectangle2D rectangle2D18 = chartRenderingInfo15.getChartArea();
        org.jfree.chart.title.TextTitle textTitle20 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity21 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D18, (org.jfree.chart.title.Title) textTitle20);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D23 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D18, rectangleAnchor22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity30 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D18, pieDataset24, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        xYAreaRenderer3.setBaseShape((java.awt.Shape) rectangle2D18);
        org.jfree.chart.entity.EntityCollection entityCollection32 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo33 = new org.jfree.chart.ChartRenderingInfo(entityCollection32);
        java.awt.Paint paint34 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean35 = chartRenderingInfo33.equals((java.lang.Object) paint34);
        java.awt.geom.Rectangle2D rectangle2D36 = chartRenderingInfo33.getChartArea();
        org.jfree.chart.title.TextTitle textTitle38 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity39 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D36, (org.jfree.chart.title.Title) textTitle38);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D41 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D36, rectangleAnchor40);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor42 = null;
        java.awt.geom.Point2D point2D43 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D36, rectangleAnchor42);
        org.jfree.chart.plot.PlotState plotState44 = new org.jfree.chart.plot.PlotState();
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot45.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent47 = null;
        categoryPlot45.rendererChanged(rendererChangeEvent47);
        org.jfree.chart.entity.EntityCollection entityCollection50 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo51 = new org.jfree.chart.ChartRenderingInfo(entityCollection50);
        java.awt.Paint paint52 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean53 = chartRenderingInfo51.equals((java.lang.Object) paint52);
        java.awt.geom.Rectangle2D rectangle2D54 = chartRenderingInfo51.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo55 = chartRenderingInfo51.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo56 = plotRenderingInfo55.getOwner();
        java.awt.geom.Point2D point2D57 = null;
        categoryPlot45.zoomRangeAxes(1.0E-8d, plotRenderingInfo55, point2D57, true);
        xYPlot0.draw(graphics2D1, rectangle2D18, point2D43, plotState44, plotRenderingInfo55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo15 and chartRenderingInfo33", chartRenderingInfo15.equals(chartRenderingInfo33) ? chartRenderingInfo15.hashCode() == chartRenderingInfo33.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test024");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        int int2 = piePlot0.getBackgroundImageAlignment();
        boolean boolean3 = piePlot0.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot0.createAndAddEntity(rectangle2D4, plotRenderingInfo5, "hi!", "LGPL");
        java.awt.Paint paint9 = piePlot0.getLabelPaint();
        org.jfree.chart.entity.EntityCollection entityCollection10 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo11 = new org.jfree.chart.ChartRenderingInfo(entityCollection10);
        java.awt.Paint paint12 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean13 = chartRenderingInfo11.equals((java.lang.Object) paint12);
        java.awt.geom.Rectangle2D rectangle2D14 = chartRenderingInfo11.getChartArea();
        org.jfree.chart.title.TextTitle textTitle16 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity17 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D14, (org.jfree.chart.title.Title) textTitle16);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer19 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement18);
        blockContainer19.clear();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer22 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer22.clearSeriesStrokes(false);
        boolean boolean25 = xYAreaRenderer22.getPlotLines();
        boolean boolean26 = xYAreaRenderer22.getBaseItemLabelsVisible();
        java.awt.Paint paint27 = xYAreaRenderer22.getBasePaint();
        boolean boolean28 = blockContainer19.equals((java.lang.Object) paint27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = blockContainer19.getMargin();
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup31 = piePlot30.getDatasetGroup();
        int int32 = piePlot30.getBackgroundImageAlignment();
        boolean boolean33 = piePlot30.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        piePlot30.createAndAddEntity(rectangle2D34, plotRenderingInfo35, "hi!", "LGPL");
        piePlot30.setStartAngle((double) 1);
        org.jfree.data.xy.XYDataItem xYDataItem43 = new org.jfree.data.xy.XYDataItem((double) (byte) 10, (double) 0);
        java.awt.Color color46 = java.awt.Color.getColor("hi!", (int) (short) 100);
        boolean boolean47 = xYDataItem43.equals((java.lang.Object) "hi!");
        java.awt.Color color48 = java.awt.Color.MAGENTA;
        piePlot30.setSectionPaint((java.lang.Comparable) "hi!", (java.awt.Paint) color48);
        java.awt.Graphics2D graphics2D50 = null;
        org.jfree.chart.entity.EntityCollection entityCollection51 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo52 = new org.jfree.chart.ChartRenderingInfo(entityCollection51);
        java.awt.Paint paint53 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean54 = chartRenderingInfo52.equals((java.lang.Object) paint53);
        java.awt.geom.Rectangle2D rectangle2D55 = chartRenderingInfo52.getChartArea();
        piePlot30.drawBackgroundImage(graphics2D50, rectangle2D55);
        java.awt.geom.Rectangle2D rectangle2D57 = rectangleInsets29.createInsetRectangle(rectangle2D55);
        java.awt.geom.Rectangle2D rectangle2D61 = piePlot0.getArcBounds(rectangle2D14, rectangle2D57, 15.0d, (double) (byte) -1, (double) 11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo11 and chartRenderingInfo52", chartRenderingInfo11.equals(chartRenderingInfo52) ? chartRenderingInfo11.hashCode() == chartRenderingInfo52.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test025");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup26 = piePlot25.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        piePlot25.addChangeListener(plotChangeListener27);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) piePlot25);
        combinedDomainXYPlot1.plotChanged(plotChangeEvent29);
        java.lang.String str31 = combinedDomainXYPlot1.getPlotType();
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot34.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent36 = null;
        categoryPlot34.rendererChanged(rendererChangeEvent36);
        org.jfree.chart.entity.EntityCollection entityCollection39 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo40 = new org.jfree.chart.ChartRenderingInfo(entityCollection39);
        java.awt.Paint paint41 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean42 = chartRenderingInfo40.equals((java.lang.Object) paint41);
        java.awt.geom.Rectangle2D rectangle2D43 = chartRenderingInfo40.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = chartRenderingInfo40.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo45 = plotRenderingInfo44.getOwner();
        java.awt.geom.Point2D point2D46 = null;
        categoryPlot34.zoomRangeAxes(1.0E-8d, plotRenderingInfo44, point2D46, true);
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D51 = new org.jfree.chart.renderer.category.BarRenderer3D((double) 0.0f, (double) 100L);
        org.jfree.chart.axis.ValueAxis valueAxis52 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot53 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis52);
        java.awt.Color color54 = org.jfree.chart.ChartColor.DARK_BLUE;
        combinedDomainXYPlot53.setRangeMinorGridlinePaint((java.awt.Paint) color54);
        boolean boolean56 = combinedDomainXYPlot53.canSelectByRegion();
        barRenderer3D51.addChangeListener((org.jfree.chart.event.RendererChangeListener) combinedDomainXYPlot53);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo59 = null;
        org.jfree.chart.entity.EntityCollection entityCollection60 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo61 = new org.jfree.chart.ChartRenderingInfo(entityCollection60);
        java.awt.Paint paint62 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean63 = chartRenderingInfo61.equals((java.lang.Object) paint62);
        java.awt.geom.Rectangle2D rectangle2D64 = chartRenderingInfo61.getChartArea();
        org.jfree.chart.title.TextTitle textTitle66 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity67 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D64, (org.jfree.chart.title.Title) textTitle66);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor68 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D69 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D64, rectangleAnchor68);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor70 = null;
        java.awt.geom.Point2D point2D71 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D64, rectangleAnchor70);
        combinedDomainXYPlot53.zoomDomainAxes((double) (-16777216), plotRenderingInfo59, point2D71);
        combinedDomainXYPlot1.zoomRangeAxes(0.025d, (double) 7, plotRenderingInfo44, point2D71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo40 and chartRenderingInfo61", chartRenderingInfo40.equals(chartRenderingInfo61) ? chartRenderingInfo40.hashCode() == chartRenderingInfo61.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test026");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup26 = piePlot25.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        piePlot25.addChangeListener(plotChangeListener27);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) piePlot25);
        combinedDomainXYPlot1.plotChanged(plotChangeEvent29);
        java.awt.Paint paint31 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        combinedDomainXYPlot1.setDomainGridlinePaint(paint31);
        org.jfree.chart.entity.EntityCollection entityCollection34 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo35 = new org.jfree.chart.ChartRenderingInfo(entityCollection34);
        java.awt.Paint paint36 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean37 = chartRenderingInfo35.equals((java.lang.Object) paint36);
        java.awt.geom.Rectangle2D rectangle2D38 = chartRenderingInfo35.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = chartRenderingInfo35.getPlotInfo();
        org.jfree.chart.entity.EntityCollection entityCollection40 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo41 = new org.jfree.chart.ChartRenderingInfo(entityCollection40);
        java.awt.Paint paint42 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean43 = chartRenderingInfo41.equals((java.lang.Object) paint42);
        java.awt.geom.Rectangle2D rectangle2D44 = chartRenderingInfo41.getChartArea();
        org.jfree.chart.title.TextTitle textTitle46 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity47 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D44, (org.jfree.chart.title.Title) textTitle46);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor48 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D49 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D44, rectangleAnchor48);
        combinedDomainXYPlot1.zoomRangeAxes((double) (short) 100, plotRenderingInfo39, point2D49, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo35 and chartRenderingInfo41", chartRenderingInfo35.equals(chartRenderingInfo41) ? chartRenderingInfo35.hashCode() == chartRenderingInfo41.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test027");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = xYAreaRenderer1.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator5 = null;
        xYAreaRenderer1.setBaseItemLabelGenerator(xYItemLabelGenerator5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot10 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis9);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer12 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer12.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator15 = null;
        xYAreaRenderer12.setLegendItemURLGenerator(xYSeriesLabelGenerator15);
        xYAreaRenderer12.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean23 = xYAreaRenderer12.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot10.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer12);
        combinedDomainXYPlot10.clearDomainMarkers();
        java.awt.Font font27 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint28 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer31 = null;
        org.jfree.chart.text.TextBlock textBlock32 = org.jfree.chart.text.TextUtilities.createTextBlock("", font27, paint28, (float) (-1L), (int) (short) -1, textMeasurer31);
        combinedDomainXYPlot10.setDomainCrosshairPaint(paint28);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder34 = combinedDomainXYPlot10.getSeriesRenderingOrder();
        combinedDomainXYPlot10.clearDomainMarkers();
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone37 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection38 = new org.jfree.data.time.TimeSeriesCollection(timeZone37);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer40 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement36, (org.jfree.data.general.Dataset) timeSeriesCollection38, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState41 = timeSeriesCollection38.getSelectionState();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        org.jfree.chart.renderer.xy.XYItemRendererState xYItemRendererState43 = xYAreaRenderer1.initialise(graphics2D7, rectangle2D8, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot10, (org.jfree.data.xy.XYDataset) timeSeriesCollection38, plotRenderingInfo42);
        java.awt.geom.Line2D line2D44 = null;
        xYItemRendererState43.workingLine = line2D44;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer12", xYAreaRenderer1.equals(xYAreaRenderer12) ? xYAreaRenderer1.hashCode() == xYAreaRenderer12.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test028");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Stroke stroke2 = combinedDomainXYPlot1.getRangeZeroBaselineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot3.rendererChanged(rendererChangeEvent5);
        double double7 = categoryPlot3.getAnchorValue();
        java.awt.Color color11 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer13 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean15 = xYAreaRenderer13.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint16 = xYAreaRenderer13.getBaseLegendTextPaint();
        java.awt.Stroke stroke18 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer13.setSeriesOutlineStroke(0, stroke18, false);
        java.awt.Color color23 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer25 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean27 = xYAreaRenderer25.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint28 = xYAreaRenderer25.getBaseLegendTextPaint();
        java.awt.Stroke stroke30 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer25.setSeriesOutlineStroke(0, stroke30, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker34 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color11, stroke18, (java.awt.Paint) color23, stroke30, (float) (byte) 1);
        java.lang.Object obj35 = intervalMarker34.clone();
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup37 = piePlot36.getDatasetGroup();
        int int38 = piePlot36.getBackgroundImageAlignment();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator39 = piePlot36.getLegendLabelGenerator();
        boolean boolean40 = intervalMarker34.equals((java.lang.Object) piePlot36);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer43 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection44 = categoryPlot41.getRangeMarkers(7, layer43);
        java.lang.Object obj45 = null;
        boolean boolean46 = layer43.equals(obj45);
        boolean boolean48 = categoryPlot3.removeDomainMarker(7, (org.jfree.chart.plot.Marker) intervalMarker34, layer43, false);
        java.util.Collection collection49 = combinedDomainXYPlot1.getRangeMarkers(layer43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot3 and categoryPlot41", categoryPlot3.equals(categoryPlot41) ? categoryPlot3.hashCode() == categoryPlot41.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test029");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer26 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer26.clearSeriesStrokes(false);
        boolean boolean29 = xYAreaRenderer26.getPlotLines();
        boolean boolean30 = xYAreaRenderer26.getBaseItemLabelsVisible();
        java.awt.Paint paint32 = org.jfree.chart.plot.WaferMapPlot.DEFAULT_CROSSHAIR_PAINT;
        xYAreaRenderer26.setSeriesFillPaint(7, paint32);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone38 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection39 = new org.jfree.data.time.TimeSeriesCollection(timeZone38);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer41 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement37, (org.jfree.data.general.Dataset) timeSeriesCollection39, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState42 = timeSeriesCollection39.getSelectionState();
        java.lang.Number number43 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection39);
        org.jfree.chart.entity.XYItemEntity xYItemEntity48 = new org.jfree.chart.entity.XYItemEntity(shape36, (org.jfree.data.xy.XYDataset) timeSeriesCollection39, 7, (int) (byte) 10, "LGPL", "LGPL");
        xYAreaRenderer26.setSeriesShape((int) ' ', shape36);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer26);
        org.jfree.chart.entity.EntityCollection entityCollection51 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo52 = new org.jfree.chart.ChartRenderingInfo(entityCollection51);
        java.awt.Paint paint53 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean54 = chartRenderingInfo52.equals((java.lang.Object) paint53);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo55 = chartRenderingInfo52.getPlotInfo();
        org.jfree.chart.entity.EntityCollection entityCollection56 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo57 = new org.jfree.chart.ChartRenderingInfo(entityCollection56);
        java.awt.Paint paint58 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean59 = chartRenderingInfo57.equals((java.lang.Object) paint58);
        java.awt.geom.Rectangle2D rectangle2D60 = chartRenderingInfo57.getChartArea();
        org.jfree.chart.title.TextTitle textTitle62 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity63 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D60, (org.jfree.chart.title.Title) textTitle62);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor64 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D65 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D60, rectangleAnchor64);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor66 = null;
        java.awt.geom.Point2D point2D67 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D60, rectangleAnchor66);
        org.jfree.chart.plot.XYPlot xYPlot68 = combinedDomainXYPlot1.findSubplot(plotRenderingInfo55, point2D67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer26", xYAreaRenderer3.equals(xYAreaRenderer26) ? xYAreaRenderer3.hashCode() == xYAreaRenderer26.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test030");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        double double4 = categoryPlot0.getAnchorValue();
        java.awt.Color color8 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer10 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean12 = xYAreaRenderer10.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint13 = xYAreaRenderer10.getBaseLegendTextPaint();
        java.awt.Stroke stroke15 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer10.setSeriesOutlineStroke(0, stroke15, false);
        java.awt.Color color20 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer22 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean24 = xYAreaRenderer22.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint25 = xYAreaRenderer22.getBaseLegendTextPaint();
        java.awt.Stroke stroke27 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer22.setSeriesOutlineStroke(0, stroke27, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker31 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color8, stroke15, (java.awt.Paint) color20, stroke27, (float) (byte) 1);
        java.lang.Object obj32 = intervalMarker31.clone();
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup34 = piePlot33.getDatasetGroup();
        int int35 = piePlot33.getBackgroundImageAlignment();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator36 = piePlot33.getLegendLabelGenerator();
        boolean boolean37 = intervalMarker31.equals((java.lang.Object) piePlot33);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer40 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection41 = categoryPlot38.getRangeMarkers(7, layer40);
        java.lang.Object obj42 = null;
        boolean boolean43 = layer40.equals(obj42);
        boolean boolean45 = categoryPlot0.removeDomainMarker(7, (org.jfree.chart.plot.Marker) intervalMarker31, layer40, false);
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on intervalMarker31 and obj32", intervalMarker31.equals(obj32) ? intervalMarker31.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test031");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color3 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer5 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean7 = xYAreaRenderer5.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint8 = xYAreaRenderer5.getBaseLegendTextPaint();
        java.awt.Stroke stroke10 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer5.setSeriesOutlineStroke(0, stroke10, false);
        java.awt.Color color15 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer17 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean19 = xYAreaRenderer17.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint20 = xYAreaRenderer17.getBaseLegendTextPaint();
        java.awt.Stroke stroke22 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer17.setSeriesOutlineStroke(0, stroke22, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker26 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color3, stroke10, (java.awt.Paint) color15, stroke22, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor27 = org.jfree.chart.text.TextAnchor.BASELINE_LEFT;
        intervalMarker26.setLabelTextAnchor(textAnchor27);
        java.lang.String str29 = intervalMarker26.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker) intervalMarker26);
        org.jfree.chart.plot.Marker marker31 = markerChangeEvent30.getMarker();
        boolean boolean32 = categoryPlot0.removeRangeMarker(marker31);
        org.jfree.chart.entity.EntityCollection entityCollection35 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo36 = new org.jfree.chart.ChartRenderingInfo(entityCollection35);
        java.awt.Paint paint37 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean38 = chartRenderingInfo36.equals((java.lang.Object) paint37);
        java.awt.geom.Rectangle2D rectangle2D39 = chartRenderingInfo36.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = chartRenderingInfo36.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo41 = plotRenderingInfo40.getOwner();
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D44 = new org.jfree.chart.renderer.category.BarRenderer3D((double) 0.0f, (double) 100L);
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot46 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis45);
        java.awt.Color color47 = org.jfree.chart.ChartColor.DARK_BLUE;
        combinedDomainXYPlot46.setRangeMinorGridlinePaint((java.awt.Paint) color47);
        boolean boolean49 = combinedDomainXYPlot46.canSelectByRegion();
        barRenderer3D44.addChangeListener((org.jfree.chart.event.RendererChangeListener) combinedDomainXYPlot46);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo52 = null;
        org.jfree.chart.entity.EntityCollection entityCollection53 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo54 = new org.jfree.chart.ChartRenderingInfo(entityCollection53);
        java.awt.Paint paint55 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean56 = chartRenderingInfo54.equals((java.lang.Object) paint55);
        java.awt.geom.Rectangle2D rectangle2D57 = chartRenderingInfo54.getChartArea();
        org.jfree.chart.title.TextTitle textTitle59 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity60 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D57, (org.jfree.chart.title.Title) textTitle59);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor61 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D62 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D57, rectangleAnchor61);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor63 = null;
        java.awt.geom.Point2D point2D64 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D57, rectangleAnchor63);
        combinedDomainXYPlot46.zoomDomainAxes((double) (-16777216), plotRenderingInfo52, point2D64);
        categoryPlot0.zoomRangeAxes((double) 1L, 5.0d, plotRenderingInfo40, point2D64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo36 and chartRenderingInfo54", chartRenderingInfo36.equals(chartRenderingInfo54) ? chartRenderingInfo36.hashCode() == chartRenderingInfo54.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test032");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        boolean boolean4 = xYAreaRenderer1.getPlotLines();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer7 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer7.clearSeriesStrokes(false);
        boolean boolean10 = xYAreaRenderer7.getPlotLines();
        boolean boolean11 = xYAreaRenderer7.getBaseItemLabelsVisible();
        java.awt.Paint paint13 = org.jfree.chart.plot.WaferMapPlot.DEFAULT_CROSSHAIR_PAINT;
        xYAreaRenderer7.setSeriesFillPaint(7, paint13);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone19 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection20 = new org.jfree.data.time.TimeSeriesCollection(timeZone19);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer22 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement18, (org.jfree.data.general.Dataset) timeSeriesCollection20, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState23 = timeSeriesCollection20.getSelectionState();
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection20);
        org.jfree.chart.entity.XYItemEntity xYItemEntity29 = new org.jfree.chart.entity.XYItemEntity(shape17, (org.jfree.data.xy.XYDataset) timeSeriesCollection20, 7, (int) (byte) 10, "LGPL", "LGPL");
        xYAreaRenderer7.setSeriesShape((int) ' ', shape17);
        xYAreaRenderer1.setSeriesShape(0, shape17, false);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer35 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer35.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator38 = null;
        xYAreaRenderer35.setLegendItemURLGenerator(xYSeriesLabelGenerator38);
        xYAreaRenderer35.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) false);
        xYAreaRenderer35.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator46 = null;
        xYAreaRenderer35.setSeriesURLGenerator((int) (short) 100, xYURLGenerator46, false);
        java.awt.Paint paint52 = xYAreaRenderer35.getItemFillPaint((int) (short) 10, (int) 'a', true);
        java.awt.Graphics2D graphics2D53 = null;
        org.jfree.chart.axis.ValueAxis valueAxis54 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot55 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis54);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer57 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer57.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator60 = null;
        xYAreaRenderer57.setLegendItemURLGenerator(xYSeriesLabelGenerator60);
        xYAreaRenderer57.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean68 = xYAreaRenderer57.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot55.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer57);
        boolean boolean70 = combinedDomainXYPlot55.canSelectByPoint();
        org.jfree.chart.axis.NumberAxis numberAxis72 = new org.jfree.chart.axis.NumberAxis("");
        int int73 = numberAxis72.getMinorTickCount();
        numberAxis72.setMinorTickMarksVisible(true);
        org.jfree.chart.entity.EntityCollection entityCollection76 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo77 = new org.jfree.chart.ChartRenderingInfo(entityCollection76);
        java.awt.Paint paint78 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean79 = chartRenderingInfo77.equals((java.lang.Object) paint78);
        java.awt.geom.Rectangle2D rectangle2D80 = chartRenderingInfo77.getChartArea();
        org.jfree.chart.title.TextTitle textTitle82 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity83 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D80, (org.jfree.chart.title.Title) textTitle82);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor84 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D85 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D80, rectangleAnchor84);
        java.awt.Paint paint87 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_PAINT;
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot88 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke89 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot88.setRangeCrosshairStroke(stroke89);
        xYAreaRenderer35.drawDomainLine(graphics2D53, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot55, (org.jfree.chart.axis.ValueAxis) numberAxis72, rectangle2D80, (double) 60000L, paint87, stroke89);
        xYAreaRenderer1.setSeriesPaint(5, paint87, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer7 and xYAreaRenderer35", xYAreaRenderer7.equals(xYAreaRenderer35) ? xYAreaRenderer7.hashCode() == xYAreaRenderer35.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test033");
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        java.awt.Font font4 = barRenderer3D0.getItemLabelFont((int) (byte) -1, (int) (byte) 1, false);
        java.awt.Shape shape5 = barRenderer3D0.getBaseShape();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer8 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer8.clearSeriesStrokes(false);
        boolean boolean11 = xYAreaRenderer8.getPlotLines();
        boolean boolean12 = xYAreaRenderer8.getBaseItemLabelsVisible();
        java.awt.Paint paint14 = org.jfree.chart.plot.WaferMapPlot.DEFAULT_CROSSHAIR_PAINT;
        xYAreaRenderer8.setSeriesFillPaint(7, paint14);
        barRenderer3D0.setSeriesFillPaint(10, paint14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.data.Range range18 = barRenderer3D0.findRangeBounds(categoryDataset17);
        java.awt.Paint paint19 = barRenderer3D0.getWallPaint();
        double double20 = barRenderer3D0.getItemMargin();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer22 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean24 = xYAreaRenderer22.isSeriesItemLabelsVisible((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = xYAreaRenderer22.getBasePositiveItemLabelPosition();
        barRenderer3D0.setBasePositiveItemLabelPosition(itemLabelPosition25, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer8 and xYAreaRenderer22", xYAreaRenderer8.equals(xYAreaRenderer22) ? xYAreaRenderer8.hashCode() == xYAreaRenderer22.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test034");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint4 = xYAreaRenderer1.getBaseLegendTextPaint();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer1.setSeriesOutlineStroke(0, stroke6, false);
        org.jfree.chart.LegendItem legendItem11 = xYAreaRenderer1.getLegendItem(8, (int) (byte) 10);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot14 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis13);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer16.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator19 = null;
        xYAreaRenderer16.setLegendItemURLGenerator(xYSeriesLabelGenerator19);
        xYAreaRenderer16.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean27 = xYAreaRenderer16.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot14.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer16);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        int int30 = combinedDomainXYPlot14.getRangeAxisIndex(valueAxis29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        combinedDomainXYPlot14.setDomainAxis(valueAxis31);
        combinedDomainXYPlot14.clearRangeMarkers();
        org.jfree.data.time.Year year36 = new org.jfree.data.time.Year((int) (short) 0);
        long long37 = year36.getFirstMillisecond();
        org.jfree.data.time.Year year39 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.chart.axis.PeriodAxis periodAxis40 = new org.jfree.chart.axis.PeriodAxis("RectangleEdge.RIGHT", (org.jfree.data.time.RegularTimePeriod) year36, (org.jfree.data.time.RegularTimePeriod) year39);
        org.jfree.data.time.Year year43 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year45 = new org.jfree.data.time.Year((int) (short) 0);
        long long46 = year45.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis47 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year43, (org.jfree.data.time.RegularTimePeriod) year45);
        periodAxis40.setLast((org.jfree.data.time.RegularTimePeriod) year45);
        java.awt.Stroke stroke49 = periodAxis40.getMinorTickMarkStroke();
        java.lang.Class class50 = periodAxis40.getMajorTickTimePeriodClass();
        org.jfree.chart.plot.Marker marker51 = null;
        org.jfree.chart.entity.EntityCollection entityCollection52 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo53 = new org.jfree.chart.ChartRenderingInfo(entityCollection52);
        java.awt.Paint paint54 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean55 = chartRenderingInfo53.equals((java.lang.Object) paint54);
        java.awt.geom.Rectangle2D rectangle2D56 = chartRenderingInfo53.getChartArea();
        org.jfree.chart.title.TextTitle textTitle58 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity59 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D56, (org.jfree.chart.title.Title) textTitle58);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor60 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D61 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D56, rectangleAnchor60);
        xYAreaRenderer1.drawDomainMarker(graphics2D12, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot14, (org.jfree.chart.axis.ValueAxis) periodAxis40, marker51, rectangle2D56);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer64 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer64.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator67 = null;
        xYAreaRenderer64.setLegendItemURLGenerator(xYSeriesLabelGenerator67);
        xYAreaRenderer64.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean73 = xYAreaRenderer64.isSeriesVisible((-16777216));
        java.awt.Shape shape74 = xYAreaRenderer64.getBaseShape();
        org.jfree.chart.block.BorderArrangement borderArrangement75 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone76 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection77 = new org.jfree.data.time.TimeSeriesCollection(timeZone76);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer79 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement75, (org.jfree.data.general.Dataset) timeSeriesCollection77, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState80 = timeSeriesCollection77.getSelectionState();
        java.lang.Number number81 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection77);
        java.lang.Object obj82 = timeSeriesCollection77.clone();
        java.lang.Number number83 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection77);
        org.jfree.chart.entity.XYItemEntity xYItemEntity88 = new org.jfree.chart.entity.XYItemEntity(shape74, (org.jfree.data.xy.XYDataset) timeSeriesCollection77, (int) (short) 10, (int) (short) 100, "12/31/69", "PlotOrientation.VERTICAL");
        periodAxis40.setUpArrow(shape74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer16", xYAreaRenderer1.equals(xYAreaRenderer16) ? xYAreaRenderer1.hashCode() == xYAreaRenderer16.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test035");
        org.jfree.chart.title.TextTitle textTitle1 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot3 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis2);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer5 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer5.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator8 = null;
        xYAreaRenderer5.setLegendItemURLGenerator(xYSeriesLabelGenerator8);
        xYAreaRenderer5.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean16 = xYAreaRenderer5.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot3.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer5);
        boolean boolean18 = combinedDomainXYPlot3.canSelectByPoint();
        org.jfree.chart.axis.AxisLocation axisLocation19 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        combinedDomainXYPlot3.setRangeAxisLocation(axisLocation19, true);
        boolean boolean22 = textTitle1.equals((java.lang.Object) combinedDomainXYPlot3);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer25 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer25.clearSeriesStrokes(false);
        boolean boolean28 = xYAreaRenderer25.getPlotLines();
        combinedDomainXYPlot3.setRenderer(0, (org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer25, true);
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        combinedDomainXYPlot3.setRangeAxis(10, valueAxis32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer5 and xYAreaRenderer25", xYAreaRenderer5.equals(xYAreaRenderer25) ? xYAreaRenderer5.hashCode() == xYAreaRenderer25.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test036");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.axis.NumberAxis numberAxis11 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity14 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D7, (org.jfree.chart.axis.Axis) numberAxis11, "", "DatasetRenderingOrder.FORWARD");
        java.lang.Object obj15 = numberAxis11.clone();
        numberAxis11.setAutoRange(true);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer19 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer19.clearSeriesStrokes(false);
        boolean boolean22 = xYAreaRenderer19.getPlotLines();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer25 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer25.clearSeriesStrokes(false);
        boolean boolean28 = xYAreaRenderer25.getPlotLines();
        boolean boolean29 = xYAreaRenderer25.getBaseItemLabelsVisible();
        java.awt.Paint paint31 = org.jfree.chart.plot.WaferMapPlot.DEFAULT_CROSSHAIR_PAINT;
        xYAreaRenderer25.setSeriesFillPaint(7, paint31);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone37 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection38 = new org.jfree.data.time.TimeSeriesCollection(timeZone37);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer40 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement36, (org.jfree.data.general.Dataset) timeSeriesCollection38, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState41 = timeSeriesCollection38.getSelectionState();
        java.lang.Number number42 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection38);
        org.jfree.chart.entity.XYItemEntity xYItemEntity47 = new org.jfree.chart.entity.XYItemEntity(shape35, (org.jfree.data.xy.XYDataset) timeSeriesCollection38, 7, (int) (byte) 10, "LGPL", "LGPL");
        xYAreaRenderer25.setSeriesShape((int) ' ', shape35);
        xYAreaRenderer19.setSeriesShape(0, shape35, false);
        java.awt.Stroke stroke52 = xYAreaRenderer19.getSeriesOutlineStroke((int) (byte) 0);
        java.awt.Paint paint53 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_PAINT;
        xYAreaRenderer19.setBaseOutlinePaint(paint53);
        numberAxis11.setTickMarkPaint(paint53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer19 and xYAreaRenderer25", xYAreaRenderer19.equals(xYAreaRenderer25) ? xYAreaRenderer19.hashCode() == xYAreaRenderer25.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test037");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        combinedDomainXYPlot1.clearSelection();
        org.jfree.chart.plot.PolarPlot polarPlot12 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Font font13 = polarPlot12.getAngleLabelFont();
        org.jfree.chart.axis.ValueAxis valueAxis14 = polarPlot12.getAxis();
        org.jfree.chart.entity.EntityCollection entityCollection16 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = new org.jfree.chart.ChartRenderingInfo(entityCollection16);
        java.awt.Paint paint18 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean19 = chartRenderingInfo17.equals((java.lang.Object) paint18);
        java.awt.geom.Rectangle2D rectangle2D20 = chartRenderingInfo17.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = chartRenderingInfo17.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = plotRenderingInfo21.getOwner();
        java.awt.geom.Point2D point2D23 = null;
        polarPlot12.zoomDomainAxes((double) (byte) 1, plotRenderingInfo21, point2D23, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot26.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent28 = null;
        categoryPlot26.rendererChanged(rendererChangeEvent28);
        org.jfree.chart.entity.EntityCollection entityCollection31 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo32 = new org.jfree.chart.ChartRenderingInfo(entityCollection31);
        java.awt.Paint paint33 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean34 = chartRenderingInfo32.equals((java.lang.Object) paint33);
        java.awt.geom.Rectangle2D rectangle2D35 = chartRenderingInfo32.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = chartRenderingInfo32.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo37 = plotRenderingInfo36.getOwner();
        java.awt.geom.Point2D point2D38 = null;
        categoryPlot26.zoomRangeAxes(1.0E-8d, plotRenderingInfo36, point2D38, true);
        plotRenderingInfo21.addSubplotInfo(plotRenderingInfo36);
        org.jfree.chart.entity.EntityCollection entityCollection42 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo43 = new org.jfree.chart.ChartRenderingInfo(entityCollection42);
        java.awt.Paint paint44 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean45 = chartRenderingInfo43.equals((java.lang.Object) paint44);
        java.awt.geom.Rectangle2D rectangle2D46 = chartRenderingInfo43.getChartArea();
        org.jfree.chart.title.TextTitle textTitle48 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity49 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D46, (org.jfree.chart.title.Title) textTitle48);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor50 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D51 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D46, rectangleAnchor50);
        combinedDomainXYPlot1.zoomRangeAxes((double) (short) 100, plotRenderingInfo36, point2D51, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo4 and chartRenderingInfo32", chartRenderingInfo4.equals(chartRenderingInfo32) ? chartRenderingInfo4.hashCode() == chartRenderingInfo32.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test038");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint4 = xYAreaRenderer1.getBaseLegendTextPaint();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer1.setSeriesOutlineStroke(0, stroke6, false);
        org.jfree.chart.LegendItem legendItem11 = xYAreaRenderer1.getLegendItem(8, (int) (byte) 10);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot14 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis13);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer16.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator19 = null;
        xYAreaRenderer16.setLegendItemURLGenerator(xYSeriesLabelGenerator19);
        xYAreaRenderer16.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean27 = xYAreaRenderer16.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot14.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer16);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        int int30 = combinedDomainXYPlot14.getRangeAxisIndex(valueAxis29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        combinedDomainXYPlot14.setDomainAxis(valueAxis31);
        combinedDomainXYPlot14.clearRangeMarkers();
        org.jfree.data.time.Year year36 = new org.jfree.data.time.Year((int) (short) 0);
        long long37 = year36.getFirstMillisecond();
        org.jfree.data.time.Year year39 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.chart.axis.PeriodAxis periodAxis40 = new org.jfree.chart.axis.PeriodAxis("RectangleEdge.RIGHT", (org.jfree.data.time.RegularTimePeriod) year36, (org.jfree.data.time.RegularTimePeriod) year39);
        org.jfree.data.time.Year year43 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year45 = new org.jfree.data.time.Year((int) (short) 0);
        long long46 = year45.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis47 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year43, (org.jfree.data.time.RegularTimePeriod) year45);
        periodAxis40.setLast((org.jfree.data.time.RegularTimePeriod) year45);
        java.awt.Stroke stroke49 = periodAxis40.getMinorTickMarkStroke();
        java.lang.Class class50 = periodAxis40.getMajorTickTimePeriodClass();
        org.jfree.chart.plot.Marker marker51 = null;
        org.jfree.chart.entity.EntityCollection entityCollection52 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo53 = new org.jfree.chart.ChartRenderingInfo(entityCollection52);
        java.awt.Paint paint54 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean55 = chartRenderingInfo53.equals((java.lang.Object) paint54);
        java.awt.geom.Rectangle2D rectangle2D56 = chartRenderingInfo53.getChartArea();
        org.jfree.chart.title.TextTitle textTitle58 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity59 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D56, (org.jfree.chart.title.Title) textTitle58);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor60 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D61 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D56, rectangleAnchor60);
        xYAreaRenderer1.drawDomainMarker(graphics2D12, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot14, (org.jfree.chart.axis.ValueAxis) periodAxis40, marker51, rectangle2D56);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = periodAxis40.getLast();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer16", xYAreaRenderer1.equals(xYAreaRenderer16) ? xYAreaRenderer1.hashCode() == xYAreaRenderer16.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test039");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer26 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer26.clearSeriesStrokes(false);
        boolean boolean29 = xYAreaRenderer26.getPlotLines();
        boolean boolean30 = xYAreaRenderer26.getBaseItemLabelsVisible();
        java.awt.Paint paint32 = org.jfree.chart.plot.WaferMapPlot.DEFAULT_CROSSHAIR_PAINT;
        xYAreaRenderer26.setSeriesFillPaint(7, paint32);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone38 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection39 = new org.jfree.data.time.TimeSeriesCollection(timeZone38);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer41 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement37, (org.jfree.data.general.Dataset) timeSeriesCollection39, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState42 = timeSeriesCollection39.getSelectionState();
        java.lang.Number number43 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection39);
        org.jfree.chart.entity.XYItemEntity xYItemEntity48 = new org.jfree.chart.entity.XYItemEntity(shape36, (org.jfree.data.xy.XYDataset) timeSeriesCollection39, 7, (int) (byte) 10, "LGPL", "LGPL");
        xYAreaRenderer26.setSeriesShape((int) ' ', shape36);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer26);
        org.jfree.chart.axis.AxisLocation axisLocation51 = combinedDomainXYPlot1.getDomainAxisLocation();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer26", xYAreaRenderer3.equals(xYAreaRenderer26) ? xYAreaRenderer3.hashCode() == xYAreaRenderer26.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test040");
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        java.awt.Font font4 = barRenderer3D0.getItemLabelFont((int) (byte) -1, (int) (byte) 1, false);
        java.awt.Shape shape5 = barRenderer3D0.getBaseShape();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer8 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer8.clearSeriesStrokes(false);
        boolean boolean11 = xYAreaRenderer8.getPlotLines();
        boolean boolean12 = xYAreaRenderer8.getBaseItemLabelsVisible();
        java.awt.Paint paint14 = org.jfree.chart.plot.WaferMapPlot.DEFAULT_CROSSHAIR_PAINT;
        xYAreaRenderer8.setSeriesFillPaint(7, paint14);
        barRenderer3D0.setSeriesFillPaint(10, paint14);
        barRenderer3D0.removeAnnotations();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer19 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer19.clearSeriesStrokes(false);
        boolean boolean22 = xYAreaRenderer19.getPlotLines();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYAreaRenderer19.setSeriesStroke((int) (short) 1, stroke24, true);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot29 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis28);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer31 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer31.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator34 = null;
        xYAreaRenderer31.setLegendItemURLGenerator(xYSeriesLabelGenerator34);
        xYAreaRenderer31.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean42 = xYAreaRenderer31.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot29.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer31);
        java.awt.Stroke stroke44 = combinedDomainXYPlot29.getDomainCrosshairStroke();
        xYAreaRenderer19.setSeriesOutlineStroke((int) (short) 100, stroke44, false);
        barRenderer3D0.setBaseStroke(stroke44, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer8 and xYAreaRenderer19", xYAreaRenderer8.equals(xYAreaRenderer19) ? xYAreaRenderer8.hashCode() == xYAreaRenderer19.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test041");
        org.jfree.chart.title.TextTitle textTitle1 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot3 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis2);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer5 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer5.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator8 = null;
        xYAreaRenderer5.setLegendItemURLGenerator(xYSeriesLabelGenerator8);
        xYAreaRenderer5.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean16 = xYAreaRenderer5.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot3.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer5);
        boolean boolean18 = combinedDomainXYPlot3.canSelectByPoint();
        org.jfree.chart.axis.AxisLocation axisLocation19 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        combinedDomainXYPlot3.setRangeAxisLocation(axisLocation19, true);
        boolean boolean22 = textTitle1.equals((java.lang.Object) combinedDomainXYPlot3);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer25 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer25.clearSeriesStrokes(false);
        boolean boolean28 = xYAreaRenderer25.getPlotLines();
        combinedDomainXYPlot3.setRenderer(0, (org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer25, true);
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot32 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup34 = piePlot33.getDatasetGroup();
        int int35 = piePlot33.getBackgroundImageAlignment();
        boolean boolean36 = piePlot33.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        piePlot33.createAndAddEntity(rectangle2D37, plotRenderingInfo38, "hi!", "LGPL");
        java.awt.Paint paint42 = piePlot33.getLabelPaint();
        java.awt.Stroke stroke43 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        piePlot33.setOutlineStroke(stroke43);
        combinedDomainXYPlot32.setDomainMinorGridlineStroke(stroke43);
        int int46 = combinedDomainXYPlot32.getDatasetCount();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer49 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer49.clearSeriesStrokes(false);
        boolean boolean52 = xYAreaRenderer49.getPlotLines();
        java.awt.Paint paint56 = xYAreaRenderer49.getItemPaint((int) (byte) -1, 7, false);
        java.awt.Shape shape58 = xYAreaRenderer49.getLegendShape(8);
        combinedDomainXYPlot32.setRenderer((int) (byte) 100, (org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer49);
        org.jfree.chart.axis.NumberAxis numberAxis61 = new org.jfree.chart.axis.NumberAxis("");
        double double62 = numberAxis61.getAutoRangeMinimumSize();
        org.jfree.chart.entity.EntityCollection entityCollection63 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo64 = new org.jfree.chart.ChartRenderingInfo(entityCollection63);
        java.awt.Paint paint65 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean66 = chartRenderingInfo64.equals((java.lang.Object) paint65);
        java.awt.geom.Rectangle2D rectangle2D67 = chartRenderingInfo64.getChartArea();
        org.jfree.chart.title.TextTitle textTitle69 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity70 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D67, (org.jfree.chart.title.Title) textTitle69);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor71 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D72 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D67, rectangleAnchor71);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor73 = null;
        java.awt.geom.Point2D point2D74 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D67, rectangleAnchor73);
        xYAreaRenderer25.fillDomainGridBand(graphics2D31, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot32, (org.jfree.chart.axis.ValueAxis) numberAxis61, rectangle2D67, (double) (-9999), (double) 60000L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer5 and xYAreaRenderer49", xYAreaRenderer5.equals(xYAreaRenderer49) ? xYAreaRenderer5.hashCode() == xYAreaRenderer49.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test042");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        java.awt.Paint paint1 = combinedDomainXYPlot0.getRangeGridlinePaint();
        org.jfree.chart.plot.PolarPlot polarPlot2 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Font font3 = polarPlot2.getAngleLabelFont();
        org.jfree.chart.axis.ValueAxis valueAxis4 = polarPlot2.getAxis();
        org.jfree.chart.entity.EntityCollection entityCollection6 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo7 = new org.jfree.chart.ChartRenderingInfo(entityCollection6);
        java.awt.Paint paint8 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean9 = chartRenderingInfo7.equals((java.lang.Object) paint8);
        java.awt.geom.Rectangle2D rectangle2D10 = chartRenderingInfo7.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = chartRenderingInfo7.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo12 = plotRenderingInfo11.getOwner();
        java.awt.geom.Point2D point2D13 = null;
        polarPlot2.zoomDomainAxes((double) (byte) 1, plotRenderingInfo11, point2D13, false);
        java.awt.Stroke stroke16 = polarPlot2.getRadiusGridlineStroke();
        combinedDomainXYPlot0.setRangeZeroBaselineStroke(stroke16);
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D20 = new org.jfree.chart.renderer.category.BarRenderer3D();
        java.awt.Font font24 = barRenderer3D20.getItemLabelFont((int) (byte) -1, (int) (byte) 1, false);
        java.awt.Shape shape25 = barRenderer3D20.getBaseShape();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer28 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer28.clearSeriesStrokes(false);
        boolean boolean31 = xYAreaRenderer28.getPlotLines();
        boolean boolean32 = xYAreaRenderer28.getBaseItemLabelsVisible();
        java.awt.Paint paint34 = org.jfree.chart.plot.WaferMapPlot.DEFAULT_CROSSHAIR_PAINT;
        xYAreaRenderer28.setSeriesFillPaint(7, paint34);
        barRenderer3D20.setSeriesFillPaint(10, paint34);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = barRenderer3D20.getURLGenerator(15, 4, true);
        java.awt.Graphics2D graphics2D41 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot();
        int int43 = categoryPlot42.getDatasetCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation44 = categoryPlot42.getOrientation();
        java.awt.Paint paint45 = categoryPlot42.getDomainCrosshairPaint();
        org.jfree.chart.axis.NumberAxis numberAxis47 = new org.jfree.chart.axis.NumberAxis("");
        double double48 = numberAxis47.getAutoRangeMinimumSize();
        numberAxis47.setLowerBound((double) (byte) -1);
        org.jfree.chart.plot.PiePlot piePlot51 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup52 = piePlot51.getDatasetGroup();
        int int53 = piePlot51.getBackgroundImageAlignment();
        boolean boolean54 = piePlot51.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D55 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo56 = null;
        piePlot51.createAndAddEntity(rectangle2D55, plotRenderingInfo56, "hi!", "LGPL");
        piePlot51.setStartAngle((double) 1);
        org.jfree.data.xy.XYDataItem xYDataItem64 = new org.jfree.data.xy.XYDataItem((double) (byte) 10, (double) 0);
        java.awt.Color color67 = java.awt.Color.getColor("hi!", (int) (short) 100);
        boolean boolean68 = xYDataItem64.equals((java.lang.Object) "hi!");
        java.awt.Color color69 = java.awt.Color.MAGENTA;
        piePlot51.setSectionPaint((java.lang.Comparable) "hi!", (java.awt.Paint) color69);
        java.awt.Graphics2D graphics2D71 = null;
        org.jfree.chart.entity.EntityCollection entityCollection72 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo73 = new org.jfree.chart.ChartRenderingInfo(entityCollection72);
        java.awt.Paint paint74 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean75 = chartRenderingInfo73.equals((java.lang.Object) paint74);
        java.awt.geom.Rectangle2D rectangle2D76 = chartRenderingInfo73.getChartArea();
        piePlot51.drawBackgroundImage(graphics2D71, rectangle2D76);
        java.awt.Color color79 = java.awt.Color.black;
        java.awt.Stroke stroke80 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        barRenderer3D20.drawRangeLine(graphics2D41, categoryPlot42, (org.jfree.chart.axis.ValueAxis) numberAxis47, rectangle2D76, (double) (-62167363200000L), (java.awt.Paint) color79, stroke80);
        org.jfree.chart.RenderingSource renderingSource82 = null;
        combinedDomainXYPlot0.select((double) ' ', (double) 2147483647, rectangle2D76, renderingSource82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo7 and chartRenderingInfo73", chartRenderingInfo7.equals(chartRenderingInfo73) ? chartRenderingInfo7.hashCode() == chartRenderingInfo73.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test043");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        boolean boolean4 = xYAreaRenderer1.getPlotLines();
        java.awt.Font font6 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint7 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer10 = null;
        org.jfree.chart.text.TextBlock textBlock11 = org.jfree.chart.text.TextUtilities.createTextBlock("", font6, paint7, (float) (-1L), (int) (short) -1, textMeasurer10);
        xYAreaRenderer1.setBaseItemLabelPaint(paint7, true);
        java.awt.Stroke stroke15 = xYAreaRenderer1.getSeriesOutlineStroke((int) ' ');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer16 = xYAreaRenderer1.getGradientTransformer();
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot18 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.lang.Object obj19 = combinedRangeXYPlot18.clone();
        double double20 = combinedRangeXYPlot18.getGap();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = combinedRangeXYPlot18.getRenderer(4);
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot24 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis23);
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.entity.EntityCollection entityCollection26 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo27 = new org.jfree.chart.ChartRenderingInfo(entityCollection26);
        java.awt.Paint paint28 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean29 = chartRenderingInfo27.equals((java.lang.Object) paint28);
        java.awt.geom.Rectangle2D rectangle2D30 = chartRenderingInfo27.getChartArea();
        java.util.List list31 = null;
        combinedDomainXYPlot24.drawDomainGridlines(graphics2D25, rectangle2D30, list31);
        org.jfree.chart.axis.NumberAxis numberAxis34 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity37 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D30, (org.jfree.chart.axis.Axis) numberAxis34, "", "DatasetRenderingOrder.FORWARD");
        numberAxis34.setLabelURL("org.jfree.chart.event.RendererChangeEvent[source=ItemLabelAnchor.INSIDE9]");
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot();
        int int41 = categoryPlot40.getDatasetCount();
        categoryPlot40.setAnchorValue((double) 10.0f);
        java.awt.Graphics2D graphics2D44 = null;
        org.jfree.chart.entity.EntityCollection entityCollection45 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo46 = new org.jfree.chart.ChartRenderingInfo(entityCollection45);
        java.awt.Paint paint47 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean48 = chartRenderingInfo46.equals((java.lang.Object) paint47);
        java.awt.geom.Rectangle2D rectangle2D49 = chartRenderingInfo46.getChartArea();
        org.jfree.chart.title.TextTitle textTitle51 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity52 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D49, (org.jfree.chart.title.Title) textTitle51);
        org.jfree.chart.axis.AxisSpace axisSpace53 = categoryPlot40.calculateAxisSpace(graphics2D44, rectangle2D49);
        xYAreaRenderer1.fillDomainGridBand(graphics2D17, (org.jfree.chart.plot.XYPlot) combinedRangeXYPlot18, (org.jfree.chart.axis.ValueAxis) numberAxis34, rectangle2D49, (double) (-9999), (double) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo27 and chartRenderingInfo46", chartRenderingInfo27.equals(chartRenderingInfo46) ? chartRenderingInfo27.hashCode() == chartRenderingInfo46.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test044");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        boolean boolean18 = combinedDomainXYPlot1.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        double double20 = rectangleInsets19.getLeft();
        double double22 = rectangleInsets19.calculateLeftOutset((double) 0L);
        combinedDomainXYPlot1.setAxisOffset(rectangleInsets19);
        combinedDomainXYPlot1.setDomainGridlinesVisible(false);
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone27 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection28 = new org.jfree.data.time.TimeSeriesCollection(timeZone27);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer30 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement26, (org.jfree.data.general.Dataset) timeSeriesCollection28, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState31 = timeSeriesCollection28.getSelectionState();
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection28);
        java.lang.Object obj33 = timeSeriesCollection28.clone();
        java.lang.Number number34 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection28);
        org.jfree.data.general.DatasetGroup datasetGroup35 = timeSeriesCollection28.getGroup();
        org.jfree.chart.axis.NumberAxis numberAxis37 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.data.Range range39 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint40 = new org.jfree.chart.block.RectangleConstraint(0.0d, range39);
        org.jfree.data.Range range43 = new org.jfree.data.Range((double) (-1L), 0.0d);
        org.jfree.data.Range range46 = new org.jfree.data.Range((double) (-1L), 0.0d);
        org.jfree.data.Range range47 = org.jfree.data.Range.combine(range43, range46);
        org.jfree.data.Range range48 = org.jfree.chart.axis.ValueAxis.DEFAULT_RANGE;
        org.jfree.data.Range range49 = org.jfree.data.Range.combine(range43, range48);
        org.jfree.chart.block.RectangleConstraint rectangleConstraint50 = rectangleConstraint40.toRangeWidth(range43);
        numberAxis37.setRangeWithMargins(range43, false, true);
        org.jfree.chart.axis.ValueAxis valueAxis54 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot55 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis54);
        java.awt.Graphics2D graphics2D56 = null;
        org.jfree.chart.entity.EntityCollection entityCollection57 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo58 = new org.jfree.chart.ChartRenderingInfo(entityCollection57);
        java.awt.Paint paint59 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean60 = chartRenderingInfo58.equals((java.lang.Object) paint59);
        java.awt.geom.Rectangle2D rectangle2D61 = chartRenderingInfo58.getChartArea();
        java.util.List list62 = null;
        combinedDomainXYPlot55.drawDomainGridlines(graphics2D56, rectangle2D61, list62);
        org.jfree.chart.axis.NumberAxis numberAxis65 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity68 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D61, (org.jfree.chart.axis.Axis) numberAxis65, "", "DatasetRenderingOrder.FORWARD");
        numberAxis65.centerRange(10.0d);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer72 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer72.clearSeriesStrokes(false);
        boolean boolean75 = xYAreaRenderer72.getPlotLines();
        xYAreaRenderer72.setBaseSeriesVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot78 = new org.jfree.chart.plot.XYPlot((org.jfree.data.xy.XYDataset) timeSeriesCollection28, (org.jfree.chart.axis.ValueAxis) numberAxis37, (org.jfree.chart.axis.ValueAxis) numberAxis65, (org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer72);
        combinedDomainXYPlot1.setDataset((org.jfree.data.xy.XYDataset) timeSeriesCollection28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer72", xYAreaRenderer3.equals(xYAreaRenderer72) ? xYAreaRenderer3.hashCode() == xYAreaRenderer72.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test045");
        org.jfree.chart.entity.EntityCollection entityCollection0 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo1 = new org.jfree.chart.ChartRenderingInfo(entityCollection0);
        java.awt.Paint paint2 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean3 = chartRenderingInfo1.equals((java.lang.Object) paint2);
        java.awt.geom.Rectangle2D rectangle2D4 = chartRenderingInfo1.getChartArea();
        org.jfree.chart.title.TextTitle textTitle6 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity7 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D4, (org.jfree.chart.title.Title) textTitle6);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D9 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D4, rectangleAnchor8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity16 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D4, pieDataset10, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot18 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis17);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer20 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer20.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator23 = null;
        xYAreaRenderer20.setLegendItemURLGenerator(xYSeriesLabelGenerator23);
        xYAreaRenderer20.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean31 = xYAreaRenderer20.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot18.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer20);
        combinedDomainXYPlot18.clearDomainMarkers();
        java.awt.Font font35 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint36 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer39 = null;
        org.jfree.chart.text.TextBlock textBlock40 = org.jfree.chart.text.TextUtilities.createTextBlock("", font35, paint36, (float) (-1L), (int) (short) -1, textMeasurer39);
        combinedDomainXYPlot18.setDomainCrosshairPaint(paint36);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder42 = combinedDomainXYPlot18.getSeriesRenderingOrder();
        java.awt.Paint paint43 = org.jfree.chart.plot.PolarPlot.DEFAULT_GRIDLINE_PAINT;
        combinedDomainXYPlot18.setRangeTickBandPaint(paint43);
        org.jfree.chart.title.LegendGraphic legendGraphic45 = new org.jfree.chart.title.LegendGraphic((java.awt.Shape) rectangle2D4, paint43);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer48 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean50 = xYAreaRenderer48.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint51 = xYAreaRenderer48.getBaseLegendTextPaint();
        java.awt.Stroke stroke53 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer48.setSeriesOutlineStroke(0, stroke53, false);
        java.awt.Font font57 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        xYAreaRenderer48.setSeriesItemLabelFont(0, font57);
        org.jfree.chart.block.LabelBlock labelBlock59 = new org.jfree.chart.block.LabelBlock("LGPL", font57);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor60 = org.jfree.chart.util.RectangleAnchor.TOP;
        labelBlock59.setTextAnchor(rectangleAnchor60);
        legendGraphic45.setShapeLocation(rectangleAnchor60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer20 and xYAreaRenderer48", xYAreaRenderer20.equals(xYAreaRenderer48) ? xYAreaRenderer20.hashCode() == xYAreaRenderer48.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test046");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement0);
        blockContainer1.clear();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer4 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer4.clearSeriesStrokes(false);
        boolean boolean7 = xYAreaRenderer4.getPlotLines();
        boolean boolean8 = xYAreaRenderer4.getBaseItemLabelsVisible();
        java.awt.Paint paint9 = xYAreaRenderer4.getBasePaint();
        boolean boolean10 = blockContainer1.equals((java.lang.Object) paint9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = blockContainer1.getMargin();
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup13 = piePlot12.getDatasetGroup();
        int int14 = piePlot12.getBackgroundImageAlignment();
        boolean boolean15 = piePlot12.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        piePlot12.createAndAddEntity(rectangle2D16, plotRenderingInfo17, "hi!", "LGPL");
        piePlot12.setStartAngle((double) 1);
        org.jfree.data.xy.XYDataItem xYDataItem25 = new org.jfree.data.xy.XYDataItem((double) (byte) 10, (double) 0);
        java.awt.Color color28 = java.awt.Color.getColor("hi!", (int) (short) 100);
        boolean boolean29 = xYDataItem25.equals((java.lang.Object) "hi!");
        java.awt.Color color30 = java.awt.Color.MAGENTA;
        piePlot12.setSectionPaint((java.lang.Comparable) "hi!", (java.awt.Paint) color30);
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.entity.EntityCollection entityCollection33 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo34 = new org.jfree.chart.ChartRenderingInfo(entityCollection33);
        java.awt.Paint paint35 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean36 = chartRenderingInfo34.equals((java.lang.Object) paint35);
        java.awt.geom.Rectangle2D rectangle2D37 = chartRenderingInfo34.getChartArea();
        piePlot12.drawBackgroundImage(graphics2D32, rectangle2D37);
        java.awt.geom.Rectangle2D rectangle2D39 = rectangleInsets11.createInsetRectangle(rectangle2D37);
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot41 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis40);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer43 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer43.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator46 = null;
        xYAreaRenderer43.setLegendItemURLGenerator(xYSeriesLabelGenerator46);
        xYAreaRenderer43.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean54 = xYAreaRenderer43.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot41.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer43);
        combinedDomainXYPlot41.clearDomainMarkers();
        java.awt.Font font58 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint59 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer62 = null;
        org.jfree.chart.text.TextBlock textBlock63 = org.jfree.chart.text.TextUtilities.createTextBlock("", font58, paint59, (float) (-1L), (int) (short) -1, textMeasurer62);
        combinedDomainXYPlot41.setDomainCrosshairPaint(paint59);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder65 = combinedDomainXYPlot41.getSeriesRenderingOrder();
        combinedDomainXYPlot41.clearDomainMarkers();
        int int67 = combinedDomainXYPlot41.getRendererCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer69 = combinedDomainXYPlot41.getRenderer((-1));
        org.jfree.chart.axis.ValueAxis valueAxis71 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot72 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis71);
        java.awt.Graphics2D graphics2D73 = null;
        org.jfree.chart.entity.EntityCollection entityCollection74 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo75 = new org.jfree.chart.ChartRenderingInfo(entityCollection74);
        java.awt.Paint paint76 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean77 = chartRenderingInfo75.equals((java.lang.Object) paint76);
        java.awt.geom.Rectangle2D rectangle2D78 = chartRenderingInfo75.getChartArea();
        java.util.List list79 = null;
        combinedDomainXYPlot72.drawDomainGridlines(graphics2D73, rectangle2D78, list79);
        org.jfree.chart.axis.NumberAxis numberAxis82 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity85 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D78, (org.jfree.chart.axis.Axis) numberAxis82, "", "DatasetRenderingOrder.FORWARD");
        java.lang.Object obj86 = numberAxis82.clone();
        combinedDomainXYPlot41.setRangeAxis(0, (org.jfree.chart.axis.ValueAxis) numberAxis82);
        org.jfree.chart.entity.AxisEntity axisEntity90 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D37, (org.jfree.chart.axis.Axis) numberAxis82, "JFreeChart version EXPAND.\n(C)opyright 2000-2008, by Object Refinery Limited and Contributors.\n\nFor terms of use, see the licence below.\n\nFURTHER INFORMATION:http://www.jfree.org/jfreechart/index.html\nCONTRIBUTORS:\nOTHER LIBRARIES USED BY JFreeChart:JFreeChart EXPAND (http://www.jfree.org/jfreechart/index.html).JFreeChart EXPAND (http://www.jfree.org/jfreechart/index.html).JFreeChart EXPAND (http://www.jfree.org/jfreechart/index.html).JFreeChart EXPAND (http://www.jfree.org/jfreechart/index.html).\nJFreeChart LICENCE TERMS:\nClassContext", "12/31/69");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer4 and xYAreaRenderer43", xYAreaRenderer4.equals(xYAreaRenderer43) ? xYAreaRenderer4.hashCode() == xYAreaRenderer43.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test047");
        org.jfree.chart.entity.EntityCollection entityCollection0 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo1 = new org.jfree.chart.ChartRenderingInfo(entityCollection0);
        java.awt.Paint paint2 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean3 = chartRenderingInfo1.equals((java.lang.Object) paint2);
        java.awt.geom.Rectangle2D rectangle2D4 = chartRenderingInfo1.getChartArea();
        org.jfree.chart.title.TextTitle textTitle6 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity7 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D4, (org.jfree.chart.title.Title) textTitle6);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D9 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D4, rectangleAnchor8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity16 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D4, pieDataset10, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot18 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis17);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer20 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer20.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator23 = null;
        xYAreaRenderer20.setLegendItemURLGenerator(xYSeriesLabelGenerator23);
        xYAreaRenderer20.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean31 = xYAreaRenderer20.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot18.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer20);
        combinedDomainXYPlot18.clearDomainMarkers();
        java.awt.Font font35 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint36 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer39 = null;
        org.jfree.chart.text.TextBlock textBlock40 = org.jfree.chart.text.TextUtilities.createTextBlock("", font35, paint36, (float) (-1L), (int) (short) -1, textMeasurer39);
        combinedDomainXYPlot18.setDomainCrosshairPaint(paint36);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder42 = combinedDomainXYPlot18.getSeriesRenderingOrder();
        java.awt.Paint paint43 = org.jfree.chart.plot.PolarPlot.DEFAULT_GRIDLINE_PAINT;
        combinedDomainXYPlot18.setRangeTickBandPaint(paint43);
        org.jfree.chart.title.LegendGraphic legendGraphic45 = new org.jfree.chart.title.LegendGraphic((java.awt.Shape) rectangle2D4, paint43);
        java.awt.Color color48 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer50 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean52 = xYAreaRenderer50.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint53 = xYAreaRenderer50.getBaseLegendTextPaint();
        java.awt.Stroke stroke55 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer50.setSeriesOutlineStroke(0, stroke55, false);
        java.awt.Color color60 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer62 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean64 = xYAreaRenderer62.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint65 = xYAreaRenderer62.getBaseLegendTextPaint();
        java.awt.Stroke stroke67 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer62.setSeriesOutlineStroke(0, stroke67, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker71 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color48, stroke55, (java.awt.Paint) color60, stroke67, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor72 = org.jfree.chart.text.TextAnchor.BASELINE_LEFT;
        intervalMarker71.setLabelTextAnchor(textAnchor72);
        java.lang.String str74 = intervalMarker71.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor75 = intervalMarker71.getLabelAnchor();
        legendGraphic45.setShapeAnchor(rectangleAnchor75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer20 and xYAreaRenderer50", xYAreaRenderer20.equals(xYAreaRenderer50) ? xYAreaRenderer20.hashCode() == xYAreaRenderer50.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test048");
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot();
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        polarPlot0.setAxis(valueAxis1);
        int int3 = polarPlot0.getSeriesCount();
        java.lang.String str4 = polarPlot0.getPlotType();
        org.jfree.chart.entity.EntityCollection entityCollection6 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo7 = new org.jfree.chart.ChartRenderingInfo(entityCollection6);
        java.awt.Paint paint8 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean9 = chartRenderingInfo7.equals((java.lang.Object) paint8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = chartRenderingInfo7.getPlotInfo();
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D13 = new org.jfree.chart.renderer.category.BarRenderer3D((double) 0.0f, (double) 100L);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot15 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis14);
        java.awt.Color color16 = org.jfree.chart.ChartColor.DARK_BLUE;
        combinedDomainXYPlot15.setRangeMinorGridlinePaint((java.awt.Paint) color16);
        boolean boolean18 = combinedDomainXYPlot15.canSelectByRegion();
        barRenderer3D13.addChangeListener((org.jfree.chart.event.RendererChangeListener) combinedDomainXYPlot15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        org.jfree.chart.entity.EntityCollection entityCollection22 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = new org.jfree.chart.ChartRenderingInfo(entityCollection22);
        java.awt.Paint paint24 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean25 = chartRenderingInfo23.equals((java.lang.Object) paint24);
        java.awt.geom.Rectangle2D rectangle2D26 = chartRenderingInfo23.getChartArea();
        org.jfree.chart.title.TextTitle textTitle28 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity29 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D26, (org.jfree.chart.title.Title) textTitle28);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D31 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D26, rectangleAnchor30);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = null;
        java.awt.geom.Point2D point2D33 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D26, rectangleAnchor32);
        combinedDomainXYPlot15.zoomDomainAxes((double) (-16777216), plotRenderingInfo21, point2D33);
        polarPlot0.zoomDomainAxes(0.0d, plotRenderingInfo10, point2D33, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo7 and chartRenderingInfo23", chartRenderingInfo7.equals(chartRenderingInfo23) ? chartRenderingInfo7.hashCode() == chartRenderingInfo23.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test049");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer26 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer26.clearSeriesStrokes(false);
        boolean boolean29 = xYAreaRenderer26.getPlotLines();
        boolean boolean30 = xYAreaRenderer26.getBaseItemLabelsVisible();
        java.awt.Paint paint32 = org.jfree.chart.plot.WaferMapPlot.DEFAULT_CROSSHAIR_PAINT;
        xYAreaRenderer26.setSeriesFillPaint(7, paint32);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone38 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection39 = new org.jfree.data.time.TimeSeriesCollection(timeZone38);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer41 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement37, (org.jfree.data.general.Dataset) timeSeriesCollection39, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState42 = timeSeriesCollection39.getSelectionState();
        java.lang.Number number43 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection39);
        org.jfree.chart.entity.XYItemEntity xYItemEntity48 = new org.jfree.chart.entity.XYItemEntity(shape36, (org.jfree.data.xy.XYDataset) timeSeriesCollection39, 7, (int) (byte) 10, "LGPL", "LGPL");
        xYAreaRenderer26.setSeriesShape((int) ' ', shape36);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer26);
        org.jfree.chart.axis.AxisSpace axisSpace51 = new org.jfree.chart.axis.AxisSpace();
        axisSpace51.setTop(0.0d);
        combinedDomainXYPlot1.setFixedRangeAxisSpaceForSubplots(axisSpace51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer26", xYAreaRenderer3.equals(xYAreaRenderer26) ? xYAreaRenderer3.hashCode() == xYAreaRenderer26.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test050");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator4 = null;
        xYAreaRenderer1.setLegendItemURLGenerator(xYSeriesLabelGenerator4);
        xYAreaRenderer1.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) false);
        xYAreaRenderer1.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator12 = null;
        xYAreaRenderer1.setSeriesURLGenerator((int) (short) 100, xYURLGenerator12, false);
        java.awt.Paint paint18 = xYAreaRenderer1.getItemFillPaint((int) (short) 10, (int) 'a', true);
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot21 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis20);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer23 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer23.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator26 = null;
        xYAreaRenderer23.setLegendItemURLGenerator(xYSeriesLabelGenerator26);
        xYAreaRenderer23.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean34 = xYAreaRenderer23.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot21.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer23);
        boolean boolean36 = combinedDomainXYPlot21.canSelectByPoint();
        org.jfree.chart.axis.NumberAxis numberAxis38 = new org.jfree.chart.axis.NumberAxis("");
        int int39 = numberAxis38.getMinorTickCount();
        numberAxis38.setMinorTickMarksVisible(true);
        org.jfree.chart.entity.EntityCollection entityCollection42 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo43 = new org.jfree.chart.ChartRenderingInfo(entityCollection42);
        java.awt.Paint paint44 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean45 = chartRenderingInfo43.equals((java.lang.Object) paint44);
        java.awt.geom.Rectangle2D rectangle2D46 = chartRenderingInfo43.getChartArea();
        org.jfree.chart.title.TextTitle textTitle48 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity49 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D46, (org.jfree.chart.title.Title) textTitle48);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor50 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D51 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D46, rectangleAnchor50);
        java.awt.Paint paint53 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_PAINT;
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot54 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke55 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot54.setRangeCrosshairStroke(stroke55);
        xYAreaRenderer1.drawDomainLine(graphics2D19, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot21, (org.jfree.chart.axis.ValueAxis) numberAxis38, rectangle2D46, (double) 60000L, paint53, stroke55);
        java.awt.Shape shape58 = numberAxis38.getUpArrow();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer23", xYAreaRenderer1.equals(xYAreaRenderer23) ? xYAreaRenderer1.hashCode() == xYAreaRenderer23.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test051");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator7 = xYAreaRenderer1.getItemLabelGenerator((int) (short) -1, 7, false);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot9 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list10 = combinedRangeXYPlot9.getSubplots();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot12 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis11);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer14 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer14.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator17 = null;
        xYAreaRenderer14.setLegendItemURLGenerator(xYSeriesLabelGenerator17);
        xYAreaRenderer14.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean25 = xYAreaRenderer14.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot12.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer14);
        combinedDomainXYPlot12.clearDomainMarkers();
        java.awt.Font font29 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint30 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer33 = null;
        org.jfree.chart.text.TextBlock textBlock34 = org.jfree.chart.text.TextUtilities.createTextBlock("", font29, paint30, (float) (-1L), (int) (short) -1, textMeasurer33);
        combinedDomainXYPlot12.setDomainCrosshairPaint(paint30);
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup37 = piePlot36.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener38 = null;
        piePlot36.addChangeListener(plotChangeListener38);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent40 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) piePlot36);
        combinedDomainXYPlot12.plotChanged(plotChangeEvent40);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType42 = plotChangeEvent40.getType();
        combinedRangeXYPlot9.plotChanged(plotChangeEvent40);
        org.jfree.chart.plot.IntervalMarker intervalMarker46 = new org.jfree.chart.plot.IntervalMarker((double) (short) 100, (double) 10);
        boolean boolean47 = combinedRangeXYPlot9.removeRangeMarker((org.jfree.chart.plot.Marker) intervalMarker46);
        org.jfree.chart.entity.EntityCollection entityCollection50 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo51 = new org.jfree.chart.ChartRenderingInfo(entityCollection50);
        java.awt.Paint paint52 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean53 = chartRenderingInfo51.equals((java.lang.Object) paint52);
        java.awt.geom.Rectangle2D rectangle2D54 = chartRenderingInfo51.getChartArea();
        org.jfree.chart.title.TextTitle textTitle56 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity57 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D54, (org.jfree.chart.title.Title) textTitle56);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor58 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D59 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D54, rectangleAnchor58);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor60 = null;
        java.awt.geom.Point2D point2D61 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D54, rectangleAnchor60);
        org.jfree.chart.RenderingSource renderingSource62 = null;
        combinedRangeXYPlot9.select(0.0d, (double) (-16777216), rectangle2D54, renderingSource62);
        xYAreaRenderer1.setSeriesShape((int) 'a', (java.awt.Shape) rectangle2D54);
        org.jfree.data.time.Year year67 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year69 = new org.jfree.data.time.Year((int) (short) 0);
        long long70 = year69.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis71 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year67, (org.jfree.data.time.RegularTimePeriod) year69);
        org.jfree.chart.entity.EntityCollection entityCollection73 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo74 = new org.jfree.chart.ChartRenderingInfo(entityCollection73);
        java.awt.Paint paint75 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean76 = chartRenderingInfo74.equals((java.lang.Object) paint75);
        java.awt.geom.Rectangle2D rectangle2D77 = chartRenderingInfo74.getChartArea();
        org.jfree.chart.title.TextTitle textTitle79 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity80 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D77, (org.jfree.chart.title.Title) textTitle79);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor81 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D82 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D77, rectangleAnchor81);
        org.jfree.chart.plot.CategoryPlot categoryPlot83 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color84 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        categoryPlot83.setRangeZeroBaselinePaint((java.awt.Paint) color84);
        org.jfree.chart.util.RectangleEdge rectangleEdge87 = categoryPlot83.getRangeAxisEdge((int) ' ');
        double double88 = periodAxis71.java2DToValue(0.0d, rectangle2D77, rectangleEdge87);
        org.jfree.chart.entity.AxisEntity axisEntity91 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D54, (org.jfree.chart.axis.Axis) periodAxis71, "LGPL", "http://www.jfree.org/jfreechart/index.html");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer14", xYAreaRenderer1.equals(xYAreaRenderer14) ? xYAreaRenderer1.hashCode() == xYAreaRenderer14.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test052");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup26 = piePlot25.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        piePlot25.addChangeListener(plotChangeListener27);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) piePlot25);
        combinedDomainXYPlot1.plotChanged(plotChangeEvent29);
        java.awt.Paint paint31 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        combinedDomainXYPlot1.setDomainGridlinePaint(paint31);
        java.awt.Paint paint33 = combinedDomainXYPlot1.getRangeGridlinePaint();
        java.awt.Color color36 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer38 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean40 = xYAreaRenderer38.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint41 = xYAreaRenderer38.getBaseLegendTextPaint();
        java.awt.Stroke stroke43 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer38.setSeriesOutlineStroke(0, stroke43, false);
        java.awt.Color color48 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer50 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean52 = xYAreaRenderer50.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint53 = xYAreaRenderer50.getBaseLegendTextPaint();
        java.awt.Stroke stroke55 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer50.setSeriesOutlineStroke(0, stroke55, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker59 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color36, stroke43, (java.awt.Paint) color48, stroke55, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor60 = org.jfree.chart.text.TextAnchor.BASELINE_LEFT;
        intervalMarker59.setLabelTextAnchor(textAnchor60);
        java.lang.String str62 = intervalMarker59.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent63 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker) intervalMarker59);
        double double64 = intervalMarker59.getEndValue();
        boolean boolean65 = combinedDomainXYPlot1.removeRangeMarker((org.jfree.chart.plot.Marker) intervalMarker59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer38", xYAreaRenderer3.equals(xYAreaRenderer38) ? xYAreaRenderer3.hashCode() == xYAreaRenderer38.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test053");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = xYAreaRenderer1.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator5 = null;
        xYAreaRenderer1.setBaseItemLabelGenerator(xYItemLabelGenerator5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot10 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis9);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer12 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer12.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator15 = null;
        xYAreaRenderer12.setLegendItemURLGenerator(xYSeriesLabelGenerator15);
        xYAreaRenderer12.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean23 = xYAreaRenderer12.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot10.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer12);
        combinedDomainXYPlot10.clearDomainMarkers();
        java.awt.Font font27 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint28 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer31 = null;
        org.jfree.chart.text.TextBlock textBlock32 = org.jfree.chart.text.TextUtilities.createTextBlock("", font27, paint28, (float) (-1L), (int) (short) -1, textMeasurer31);
        combinedDomainXYPlot10.setDomainCrosshairPaint(paint28);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder34 = combinedDomainXYPlot10.getSeriesRenderingOrder();
        combinedDomainXYPlot10.clearDomainMarkers();
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone37 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection38 = new org.jfree.data.time.TimeSeriesCollection(timeZone37);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer40 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement36, (org.jfree.data.general.Dataset) timeSeriesCollection38, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState41 = timeSeriesCollection38.getSelectionState();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        org.jfree.chart.renderer.xy.XYItemRendererState xYItemRendererState43 = xYAreaRenderer1.initialise(graphics2D7, rectangle2D8, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot10, (org.jfree.data.xy.XYDataset) timeSeriesCollection38, plotRenderingInfo42);
        combinedDomainXYPlot10.setRangeCrosshairValue((double) 86400000L, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer12", xYAreaRenderer1.equals(xYAreaRenderer12) ? xYAreaRenderer1.hashCode() == xYAreaRenderer12.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test054");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDatasetCount();
        categoryPlot0.setAnchorValue((double) 10.0f);
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.entity.EntityCollection entityCollection5 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo6 = new org.jfree.chart.ChartRenderingInfo(entityCollection5);
        java.awt.Paint paint7 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean8 = chartRenderingInfo6.equals((java.lang.Object) paint7);
        java.awt.geom.Rectangle2D rectangle2D9 = chartRenderingInfo6.getChartArea();
        org.jfree.chart.title.TextTitle textTitle11 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity12 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D9, (org.jfree.chart.title.Title) textTitle11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot0.calculateAxisSpace(graphics2D4, rectangle2D9);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = org.jfree.chart.util.RectangleEdge.RIGHT;
        boolean boolean16 = org.jfree.chart.util.RectangleEdge.isTopOrBottom(rectangleEdge15);
        axisSpace13.ensureAtLeast(1.0E-8d, rectangleEdge15);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer21 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection22 = categoryPlot19.getDomainMarkers((int) 'a', layer21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        categoryPlot19.setDataset(4, categoryDataset24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = categoryPlot19.getDrawingSupplier();
        categoryPlot19.configureDomainAxes();
        org.jfree.chart.axis.AxisSpace axisSpace28 = null;
        categoryPlot19.setFixedDomainAxisSpace(axisSpace28);
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D31 = new org.jfree.chart.axis.CategoryAxis3D("hi!");
        categoryPlot19.setDomainAxis((org.jfree.chart.axis.CategoryAxis) categoryAxis3D31);
        categoryAxis3D31.configure();
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot40 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis39);
        java.awt.Graphics2D graphics2D41 = null;
        org.jfree.chart.entity.EntityCollection entityCollection42 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo43 = new org.jfree.chart.ChartRenderingInfo(entityCollection42);
        java.awt.Paint paint44 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean45 = chartRenderingInfo43.equals((java.lang.Object) paint44);
        java.awt.geom.Rectangle2D rectangle2D46 = chartRenderingInfo43.getChartArea();
        java.util.List list47 = null;
        combinedDomainXYPlot40.drawDomainGridlines(graphics2D41, rectangle2D46, list47);
        org.jfree.chart.axis.NumberAxis numberAxis50 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity53 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D46, (org.jfree.chart.axis.Axis) numberAxis50, "", "DatasetRenderingOrder.FORWARD");
        org.jfree.chart.plot.CategoryPlot categoryPlot54 = new org.jfree.chart.plot.CategoryPlot();
        int int55 = categoryPlot54.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge59 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str60 = rectangleEdge59.toString();
        double double61 = categoryPlot54.getRectX((double) '4', (double) 'a', (double) 'a', rectangleEdge59);
        boolean boolean62 = categoryPlot54.isRangeZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis64 = categoryPlot54.getDomainAxis(10);
        org.jfree.chart.util.RectangleEdge rectangleEdge65 = categoryPlot54.getDomainAxisEdge();
        double double66 = categoryAxis3D31.getCategorySeriesMiddle(11, (int) ' ', (int) (byte) 0, (int) (short) 100, 0.0d, rectangle2D46, rectangleEdge65);
        axisSpace13.ensureAtLeast((double) 6, rectangleEdge65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo6 and chartRenderingInfo43", chartRenderingInfo6.equals(chartRenderingInfo43) ? chartRenderingInfo6.hashCode() == chartRenderingInfo43.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test055");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer11 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer11.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator14 = null;
        xYAreaRenderer11.setLegendItemURLGenerator(xYSeriesLabelGenerator14);
        xYAreaRenderer11.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean20 = xYAreaRenderer11.isSeriesVisible((-16777216));
        java.awt.Shape shape22 = xYAreaRenderer11.getLegendShape(0);
        java.awt.Shape shape24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        xYAreaRenderer11.setSeriesShape((int) (byte) 100, shape24, false);
        java.awt.Paint paint28 = xYAreaRenderer11.getSeriesItemLabelPaint(5);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer11);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator30 = null;
        xYAreaRenderer11.setBaseURLGenerator(xYURLGenerator30);
        java.awt.Color color32 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        xYAreaRenderer11.setBaseFillPaint((java.awt.Paint) color32);
        org.jfree.chart.axis.TickType tickType34 = org.jfree.chart.axis.TickType.MINOR;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer36 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer36.clearSeriesStrokes(false);
        boolean boolean39 = xYAreaRenderer36.getPlotLines();
        xYAreaRenderer36.setAutoPopulateSeriesStroke(false);
        boolean boolean42 = tickType34.equals((java.lang.Object) false);
        org.jfree.chart.urls.StandardXYURLGenerator standardXYURLGenerator43 = new org.jfree.chart.urls.StandardXYURLGenerator();
        boolean boolean44 = tickType34.equals((java.lang.Object) standardXYURLGenerator43);
        xYAreaRenderer11.setBaseURLGenerator((org.jfree.chart.urls.XYURLGenerator) standardXYURLGenerator43, false);
        java.awt.Color color49 = java.awt.Color.getColor("hi!", (int) (short) 100);
        java.awt.Color color52 = java.awt.Color.getColor("hi!", (int) (short) 100);
        java.awt.Paint[] paintArray53 = new java.awt.Paint[] { color49, color52 };
        java.awt.Color color56 = java.awt.Color.getColor("hi!", (int) (short) 100);
        java.awt.Color color59 = java.awt.Color.getColor("hi!", (int) (short) 100);
        java.awt.color.ColorSpace colorSpace60 = color59.getColorSpace();
        java.awt.Color color61 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        java.awt.Color color62 = java.awt.Color.RED;
        java.awt.Paint paint63 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        java.awt.Color color64 = java.awt.Color.RED;
        java.awt.Paint[] paintArray65 = new java.awt.Paint[] { color56, color59, color61, color62, paint63, color64 };
        java.awt.Paint paint66 = org.jfree.chart.plot.WaferMapPlot.DEFAULT_CROSSHAIR_PAINT;
        java.awt.Color color67 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        java.awt.Color color68 = java.awt.Color.RED;
        java.awt.Paint[] paintArray69 = new java.awt.Paint[] { paint66, color67, color68 };
        java.awt.Stroke[] strokeArray70 = new java.awt.Stroke[] {};
        java.awt.Stroke stroke71 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        java.awt.Stroke stroke72 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        java.awt.Stroke stroke73 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        java.awt.Stroke stroke74 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        java.awt.Stroke stroke75 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        java.awt.Stroke stroke76 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        java.awt.Stroke[] strokeArray77 = new java.awt.Stroke[] { stroke71, stroke72, stroke73, stroke74, stroke75, stroke76 };
        java.awt.Shape[] shapeArray78 = new java.awt.Shape[] {};
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier79 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray53, paintArray65, paintArray69, strokeArray70, strokeArray77, shapeArray78);
        boolean boolean80 = standardXYURLGenerator43.equals((java.lang.Object) shapeArray78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer11 and xYAreaRenderer36", xYAreaRenderer11.equals(xYAreaRenderer36) ? xYAreaRenderer11.hashCode() == xYAreaRenderer36.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test056");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) 'a', layer2);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        categoryPlot0.setDataset(4, categoryDataset5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = categoryPlot0.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.util.Layer layer11 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot0.drawRangeMarkers(graphics2D8, rectangle2D9, 0, layer11);
        java.awt.Color color15 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer17 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean19 = xYAreaRenderer17.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint20 = xYAreaRenderer17.getBaseLegendTextPaint();
        java.awt.Stroke stroke22 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer17.setSeriesOutlineStroke(0, stroke22, false);
        java.awt.Color color27 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer29 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean31 = xYAreaRenderer29.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint32 = xYAreaRenderer29.getBaseLegendTextPaint();
        java.awt.Stroke stroke34 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer29.setSeriesOutlineStroke(0, stroke34, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker38 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color15, stroke22, (java.awt.Paint) color27, stroke34, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor39 = intervalMarker38.getLabelTextAnchor();
        org.jfree.chart.util.Layer layer40 = org.jfree.chart.util.Layer.BACKGROUND;
        boolean boolean41 = categoryPlot0.removeDomainMarker((org.jfree.chart.plot.Marker) intervalMarker38, layer40);
        java.lang.Object obj42 = categoryPlot0.clone();
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D43 = new org.jfree.chart.renderer.category.BarRenderer3D();
        double double44 = barRenderer3D43.getXOffset();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator45 = null;
        barRenderer3D43.setBaseToolTipGenerator(categoryToolTipGenerator45, true);
        java.awt.Paint paint49 = barRenderer3D43.getSeriesOutlinePaint((int) (byte) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition51 = barRenderer3D43.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        categoryPlot0.setRenderer((org.jfree.chart.renderer.category.CategoryItemRenderer) barRenderer3D43, false);
        org.jfree.chart.axis.ValueAxis valueAxis54 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot55 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis54);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer57 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer57.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator60 = null;
        xYAreaRenderer57.setLegendItemURLGenerator(xYSeriesLabelGenerator60);
        xYAreaRenderer57.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean68 = xYAreaRenderer57.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot55.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer57);
        org.jfree.chart.axis.ValueAxis valueAxis70 = null;
        int int71 = combinedDomainXYPlot55.getRangeAxisIndex(valueAxis70);
        boolean boolean72 = barRenderer3D43.hasListener((java.util.EventListener) combinedDomainXYPlot55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer17 and xYAreaRenderer57", xYAreaRenderer17.equals(xYAreaRenderer57) ? xYAreaRenderer17.hashCode() == xYAreaRenderer57.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test057");
        org.jfree.chart.renderer.category.GradientBarPainter gradientBarPainter3 = new org.jfree.chart.renderer.category.GradientBarPainter((double) 0L, (double) 10, (double) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        boolean boolean5 = gradientBarPainter3.equals((java.lang.Object) rectangleInsets4);
        org.jfree.chart.renderer.category.BarRenderer.setDefaultBarPainter((org.jfree.chart.renderer.category.BarPainter) gradientBarPainter3);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer8 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer8.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator11 = null;
        xYAreaRenderer8.setLegendItemURLGenerator(xYSeriesLabelGenerator11);
        xYAreaRenderer8.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) false);
        xYAreaRenderer8.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator19 = null;
        xYAreaRenderer8.setSeriesURLGenerator((int) (short) 100, xYURLGenerator19, false);
        java.awt.Paint paint25 = xYAreaRenderer8.getItemFillPaint((int) (short) 10, (int) 'a', true);
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot28 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis27);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer30 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer30.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator33 = null;
        xYAreaRenderer30.setLegendItemURLGenerator(xYSeriesLabelGenerator33);
        xYAreaRenderer30.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean41 = xYAreaRenderer30.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot28.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer30);
        boolean boolean43 = combinedDomainXYPlot28.canSelectByPoint();
        org.jfree.chart.axis.NumberAxis numberAxis45 = new org.jfree.chart.axis.NumberAxis("");
        int int46 = numberAxis45.getMinorTickCount();
        numberAxis45.setMinorTickMarksVisible(true);
        org.jfree.chart.entity.EntityCollection entityCollection49 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo50 = new org.jfree.chart.ChartRenderingInfo(entityCollection49);
        java.awt.Paint paint51 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean52 = chartRenderingInfo50.equals((java.lang.Object) paint51);
        java.awt.geom.Rectangle2D rectangle2D53 = chartRenderingInfo50.getChartArea();
        org.jfree.chart.title.TextTitle textTitle55 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity56 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D53, (org.jfree.chart.title.Title) textTitle55);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor57 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D58 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D53, rectangleAnchor57);
        java.awt.Paint paint60 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_PAINT;
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot61 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke62 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot61.setRangeCrosshairStroke(stroke62);
        xYAreaRenderer8.drawDomainLine(graphics2D26, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot28, (org.jfree.chart.axis.ValueAxis) numberAxis45, rectangle2D53, (double) 60000L, paint60, stroke62);
        boolean boolean65 = gradientBarPainter3.equals((java.lang.Object) stroke62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer8 and xYAreaRenderer30", xYAreaRenderer8.equals(xYAreaRenderer30) ? xYAreaRenderer8.hashCode() == xYAreaRenderer30.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test058");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer26 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer26.clearSeriesStrokes(false);
        boolean boolean29 = xYAreaRenderer26.getPlotLines();
        boolean boolean30 = xYAreaRenderer26.getBaseItemLabelsVisible();
        java.awt.Paint paint32 = org.jfree.chart.plot.WaferMapPlot.DEFAULT_CROSSHAIR_PAINT;
        xYAreaRenderer26.setSeriesFillPaint(7, paint32);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone38 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection39 = new org.jfree.data.time.TimeSeriesCollection(timeZone38);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer41 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement37, (org.jfree.data.general.Dataset) timeSeriesCollection39, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState42 = timeSeriesCollection39.getSelectionState();
        java.lang.Number number43 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection39);
        org.jfree.chart.entity.XYItemEntity xYItemEntity48 = new org.jfree.chart.entity.XYItemEntity(shape36, (org.jfree.data.xy.XYDataset) timeSeriesCollection39, 7, (int) (byte) 10, "LGPL", "LGPL");
        xYAreaRenderer26.setSeriesShape((int) ' ', shape36);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer26);
        org.jfree.chart.LegendItem legendItem53 = xYAreaRenderer26.getLegendItem((int) (short) 1, 11);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer55 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer55.clearSeriesStrokes(false);
        boolean boolean58 = xYAreaRenderer55.getPlotLines();
        java.awt.Stroke stroke60 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYAreaRenderer55.setSeriesStroke((int) (short) 1, stroke60, true);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator63 = xYAreaRenderer55.getLegendItemLabelGenerator();
        xYAreaRenderer26.setLegendItemToolTipGenerator(xYSeriesLabelGenerator63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer55", xYAreaRenderer3.equals(xYAreaRenderer55) ? xYAreaRenderer3.hashCode() == xYAreaRenderer55.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test059");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint4 = xYAreaRenderer1.getBaseLegendTextPaint();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer1.setSeriesOutlineStroke(0, stroke6, false);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator12 = xYAreaRenderer1.getURLGenerator((-9999), (int) (byte) 10, true);
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot14 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.lang.Object obj15 = combinedRangeXYPlot14.clone();
        double double16 = combinedRangeXYPlot14.getGap();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = combinedRangeXYPlot14.getRenderer(4);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer21 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection22 = categoryPlot19.getDomainMarkers((int) 'a', layer21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        categoryPlot19.setDataset(4, categoryDataset24);
        org.jfree.chart.axis.AxisSpace axisSpace26 = categoryPlot19.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.util.Layer layer30 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot19.drawRangeMarkers(graphics2D27, rectangle2D28, 0, layer30);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        int int33 = categoryPlot32.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str38 = rectangleEdge37.toString();
        double double39 = categoryPlot32.getRectX((double) '4', (double) 'a', (double) 'a', rectangleEdge37);
        boolean boolean40 = categoryPlot32.isRangeZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = categoryPlot32.getDomainAxis(10);
        org.jfree.chart.util.RectangleEdge rectangleEdge43 = categoryPlot32.getDomainAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot45 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis44);
        java.awt.Graphics2D graphics2D46 = null;
        org.jfree.chart.entity.EntityCollection entityCollection47 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo48 = new org.jfree.chart.ChartRenderingInfo(entityCollection47);
        java.awt.Paint paint49 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean50 = chartRenderingInfo48.equals((java.lang.Object) paint49);
        java.awt.geom.Rectangle2D rectangle2D51 = chartRenderingInfo48.getChartArea();
        java.util.List list52 = null;
        combinedDomainXYPlot45.drawDomainGridlines(graphics2D46, rectangle2D51, list52);
        org.jfree.chart.axis.NumberAxis numberAxis55 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity58 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D51, (org.jfree.chart.axis.Axis) numberAxis55, "", "DatasetRenderingOrder.FORWARD");
        numberAxis55.centerRange(10.0d);
        org.jfree.data.Range range61 = categoryPlot32.getDataRange((org.jfree.chart.axis.ValueAxis) numberAxis55);
        org.jfree.data.Range range62 = categoryPlot19.getDataRange((org.jfree.chart.axis.ValueAxis) numberAxis55);
        org.jfree.chart.axis.ValueAxis valueAxis63 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot64 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis63);
        java.awt.Graphics2D graphics2D65 = null;
        org.jfree.chart.entity.EntityCollection entityCollection66 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo67 = new org.jfree.chart.ChartRenderingInfo(entityCollection66);
        java.awt.Paint paint68 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean69 = chartRenderingInfo67.equals((java.lang.Object) paint68);
        java.awt.geom.Rectangle2D rectangle2D70 = chartRenderingInfo67.getChartArea();
        java.util.List list71 = null;
        combinedDomainXYPlot64.drawDomainGridlines(graphics2D65, rectangle2D70, list71);
        org.jfree.chart.axis.NumberAxis numberAxis74 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity77 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D70, (org.jfree.chart.axis.Axis) numberAxis74, "", "DatasetRenderingOrder.FORWARD");
        xYAreaRenderer1.fillDomainGridBand(graphics2D13, (org.jfree.chart.plot.XYPlot) combinedRangeXYPlot14, (org.jfree.chart.axis.ValueAxis) numberAxis55, rectangle2D70, 0.08d, (double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot19 and categoryPlot32", categoryPlot19.equals(categoryPlot32) ? categoryPlot19.hashCode() == categoryPlot32.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test060");
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D2 = new org.jfree.chart.renderer.category.BarRenderer3D((double) 0.0f, (double) 100L);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator3 = barRenderer3D2.getBaseToolTipGenerator();
        java.awt.Stroke stroke4 = barRenderer3D2.getBaseStroke();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = barRenderer3D2.getSeriesURLGenerator(4);
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color9 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        categoryPlot8.setRangeZeroBaselinePaint((java.awt.Paint) color9);
        int int11 = categoryPlot8.getBackgroundImageAlignment();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        categoryPlot8.datasetChanged(datasetChangeEvent12);
        categoryPlot8.setForegroundAlpha((float) (-9999));
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot17 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis16);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer19 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer19.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator22 = null;
        xYAreaRenderer19.setLegendItemURLGenerator(xYSeriesLabelGenerator22);
        xYAreaRenderer19.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean30 = xYAreaRenderer19.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot17.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer19);
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        int int33 = combinedDomainXYPlot17.getRangeAxisIndex(valueAxis32);
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        combinedDomainXYPlot17.setDomainAxis(valueAxis34);
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot37 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis36);
        java.awt.Graphics2D graphics2D38 = null;
        org.jfree.chart.entity.EntityCollection entityCollection39 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo40 = new org.jfree.chart.ChartRenderingInfo(entityCollection39);
        java.awt.Paint paint41 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean42 = chartRenderingInfo40.equals((java.lang.Object) paint41);
        java.awt.geom.Rectangle2D rectangle2D43 = chartRenderingInfo40.getChartArea();
        java.util.List list44 = null;
        combinedDomainXYPlot37.drawDomainGridlines(graphics2D38, rectangle2D43, list44);
        org.jfree.chart.axis.NumberAxis numberAxis47 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity50 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D43, (org.jfree.chart.axis.Axis) numberAxis47, "", "DatasetRenderingOrder.FORWARD");
        combinedDomainXYPlot17.setRangeAxis((org.jfree.chart.axis.ValueAxis) numberAxis47);
        numberAxis47.setTickLabelsVisible(true);
        org.jfree.chart.entity.EntityCollection entityCollection54 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo55 = new org.jfree.chart.ChartRenderingInfo(entityCollection54);
        java.awt.Paint paint56 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean57 = chartRenderingInfo55.equals((java.lang.Object) paint56);
        java.awt.geom.Rectangle2D rectangle2D58 = chartRenderingInfo55.getChartArea();
        org.jfree.chart.title.TextTitle textTitle60 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity61 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D58, (org.jfree.chart.title.Title) textTitle60);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor62 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D63 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D58, rectangleAnchor62);
        org.jfree.data.general.PieDataset pieDataset64 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity70 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D58, pieDataset64, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        java.awt.Color color72 = java.awt.Color.LIGHT_GRAY;
        java.awt.Stroke stroke73 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        barRenderer3D2.drawRangeLine(graphics2D7, categoryPlot8, (org.jfree.chart.axis.ValueAxis) numberAxis47, rectangle2D58, (double) '#', (java.awt.Paint) color72, stroke73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo40 and chartRenderingInfo55", chartRenderingInfo40.equals(chartRenderingInfo55) ? chartRenderingInfo40.hashCode() == chartRenderingInfo55.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test061");
        java.awt.Color color2 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer4 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean6 = xYAreaRenderer4.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint7 = xYAreaRenderer4.getBaseLegendTextPaint();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer4.setSeriesOutlineStroke(0, stroke9, false);
        java.awt.Color color14 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean18 = xYAreaRenderer16.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint19 = xYAreaRenderer16.getBaseLegendTextPaint();
        java.awt.Stroke stroke21 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer16.setSeriesOutlineStroke(0, stroke21, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker25 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color2, stroke9, (java.awt.Paint) color14, stroke21, (float) (byte) 1);
        java.lang.Object obj26 = intervalMarker25.clone();
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup28 = piePlot27.getDatasetGroup();
        int int29 = piePlot27.getBackgroundImageAlignment();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = piePlot27.getLegendLabelGenerator();
        boolean boolean31 = intervalMarker25.equals((java.lang.Object) piePlot27);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = org.jfree.chart.util.RectangleAnchor.CENTER;
        intervalMarker25.setLabelAnchor(rectangleAnchor32);
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot35 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis34);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer37 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer37.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator40 = null;
        xYAreaRenderer37.setLegendItemURLGenerator(xYSeriesLabelGenerator40);
        xYAreaRenderer37.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean48 = xYAreaRenderer37.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot35.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer37);
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        int int51 = combinedDomainXYPlot35.getRangeAxisIndex(valueAxis50);
        boolean boolean52 = combinedDomainXYPlot35.isRangeCrosshairVisible();
        boolean boolean53 = combinedDomainXYPlot35.isDomainCrosshairVisible();
        java.util.TimeZone timeZone54 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection55 = new org.jfree.data.time.TimeSeriesCollection(timeZone54);
        org.jfree.chart.plot.CategoryPlot categoryPlot56 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot56.clearAnnotations();
        timeSeriesCollection55.removeChangeListener((org.jfree.data.general.DatasetChangeListener) categoryPlot56);
        org.jfree.data.general.DatasetGroup datasetGroup59 = timeSeriesCollection55.getGroup();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer60 = combinedDomainXYPlot35.getRendererForDataset((org.jfree.data.xy.XYDataset) timeSeriesCollection55);
        java.awt.Stroke stroke61 = combinedDomainXYPlot35.getDomainGridlineStroke();
        intervalMarker25.setStroke(stroke61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer4 and xYAreaRenderer37", xYAreaRenderer4.equals(xYAreaRenderer37) ? xYAreaRenderer4.hashCode() == xYAreaRenderer37.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test062");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        java.awt.Paint paint1 = combinedDomainXYPlot0.getRangeGridlinePaint();
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        org.jfree.chart.title.TextTitle textTitle9 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity10 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D7, (org.jfree.chart.title.Title) textTitle9);
        combinedDomainXYPlot0.drawQuadrants(graphics2D2, rectangle2D7);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.data.time.Year year15 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year17 = new org.jfree.data.time.Year((int) (short) 0);
        long long18 = year17.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis19 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year15, (org.jfree.data.time.RegularTimePeriod) year17);
        float float20 = periodAxis19.getMinorTickMarkInsideLength();
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.axis.AxisState axisState22 = new org.jfree.chart.axis.AxisState();
        double double23 = axisState22.getMax();
        java.util.List list24 = axisState22.getTicks();
        org.jfree.chart.entity.EntityCollection entityCollection25 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = new org.jfree.chart.ChartRenderingInfo(entityCollection25);
        java.awt.Paint paint27 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean28 = chartRenderingInfo26.equals((java.lang.Object) paint27);
        java.awt.geom.Rectangle2D rectangle2D29 = chartRenderingInfo26.getChartArea();
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer32 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection33 = categoryPlot30.getDomainMarkers((int) 'a', layer32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        categoryPlot30.setDataset(4, categoryDataset35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = categoryPlot30.getDrawingSupplier();
        categoryPlot30.configureDomainAxes();
        org.jfree.chart.axis.AxisSpace axisSpace39 = null;
        categoryPlot30.setFixedDomainAxisSpace(axisSpace39);
        categoryPlot30.setCrosshairDatasetIndex((int) (short) 100);
        categoryPlot30.setBackgroundAlpha((float) 8);
        org.jfree.chart.util.RectangleEdge rectangleEdge45 = categoryPlot30.getDomainAxisEdge();
        java.util.List list46 = periodAxis19.refreshTicks(graphics2D21, axisState22, rectangle2D29, rectangleEdge45);
        org.jfree.chart.plot.PlotOrientation plotOrientation47 = null;
        org.jfree.data.time.Year year51 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year53 = new org.jfree.data.time.Year((int) (short) 0);
        long long54 = year53.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis55 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year51, (org.jfree.data.time.RegularTimePeriod) year53);
        org.jfree.chart.entity.EntityCollection entityCollection57 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo58 = new org.jfree.chart.ChartRenderingInfo(entityCollection57);
        java.awt.Paint paint59 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean60 = chartRenderingInfo58.equals((java.lang.Object) paint59);
        java.awt.geom.Rectangle2D rectangle2D61 = chartRenderingInfo58.getChartArea();
        org.jfree.chart.title.TextTitle textTitle63 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity64 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D61, (org.jfree.chart.title.Title) textTitle63);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor65 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D66 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D61, rectangleAnchor65);
        org.jfree.chart.plot.CategoryPlot categoryPlot67 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color68 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        categoryPlot67.setRangeZeroBaselinePaint((java.awt.Paint) color68);
        org.jfree.chart.util.RectangleEdge rectangleEdge71 = categoryPlot67.getRangeAxisEdge((int) ' ');
        double double72 = periodAxis55.java2DToValue(0.0d, rectangle2D61, rectangleEdge71);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer74 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean76 = xYAreaRenderer74.isSeriesItemLabelsVisible((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = xYAreaRenderer74.getBasePositiveItemLabelPosition();
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator81 = xYAreaRenderer74.getURLGenerator(0, 15, false);
        java.awt.Stroke stroke83 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYAreaRenderer74.setSeriesOutlineStroke(10, stroke83);
        java.awt.Color color85 = org.jfree.chart.ChartColor.LIGHT_RED;
        combinedDomainXYPlot0.drawDomainCrosshair(graphics2D12, rectangle2D29, plotOrientation47, 0.4d, (org.jfree.chart.axis.ValueAxis) periodAxis55, stroke83, (java.awt.Paint) color85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo4 and chartRenderingInfo26", chartRenderingInfo4.equals(chartRenderingInfo26) ? chartRenderingInfo4.hashCode() == chartRenderingInfo26.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test063");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup26 = piePlot25.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        piePlot25.addChangeListener(plotChangeListener27);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) piePlot25);
        combinedDomainXYPlot1.plotChanged(plotChangeEvent29);
        java.awt.Paint paint31 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        combinedDomainXYPlot1.setDomainGridlinePaint(paint31);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer35 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection36 = categoryPlot33.getDomainMarkers((int) 'a', layer35);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        categoryPlot33.setDataset(4, categoryDataset38);
        org.jfree.chart.axis.AxisLocation axisLocation40 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT;
        categoryPlot33.setRangeAxisLocation(axisLocation40, false);
        org.jfree.chart.axis.AxisLocation axisLocation44 = categoryPlot33.getRangeAxisLocation((-1));
        combinedDomainXYPlot1.setRangeAxisLocation(axisLocation44, true);
        int int47 = combinedDomainXYPlot1.getRangeAxisCount();
        java.awt.Color color50 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer52 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean54 = xYAreaRenderer52.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint55 = xYAreaRenderer52.getBaseLegendTextPaint();
        java.awt.Stroke stroke57 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer52.setSeriesOutlineStroke(0, stroke57, false);
        java.awt.Color color62 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer64 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean66 = xYAreaRenderer64.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint67 = xYAreaRenderer64.getBaseLegendTextPaint();
        java.awt.Stroke stroke69 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer64.setSeriesOutlineStroke(0, stroke69, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker73 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color50, stroke57, (java.awt.Paint) color62, stroke69, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor74 = intervalMarker73.getLabelTextAnchor();
        java.lang.Object obj75 = null;
        boolean boolean76 = intervalMarker73.equals(obj75);
        org.jfree.chart.util.Layer layer77 = org.jfree.chart.util.Layer.BACKGROUND;
        boolean boolean78 = combinedDomainXYPlot1.removeDomainMarker((org.jfree.chart.plot.Marker) intervalMarker73, layer77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer52", xYAreaRenderer3.equals(xYAreaRenderer52) ? xYAreaRenderer3.hashCode() == xYAreaRenderer52.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test064");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) 'a', layer2);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        categoryPlot0.setDataset(4, categoryDataset5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = categoryPlot0.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.util.Layer layer11 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot0.drawRangeMarkers(graphics2D8, rectangle2D9, 0, layer11);
        double double13 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        categoryPlot0.setDataset(11, categoryDataset15);
        org.jfree.chart.LegendItemCollection legendItemCollection17 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.PlotOrientation plotOrientation18 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot20 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.entity.EntityCollection entityCollection23 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = new org.jfree.chart.ChartRenderingInfo(entityCollection23);
        java.awt.Paint paint25 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean26 = chartRenderingInfo24.equals((java.lang.Object) paint25);
        java.awt.geom.Rectangle2D rectangle2D27 = chartRenderingInfo24.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = chartRenderingInfo24.getPlotInfo();
        combinedRangeXYPlot20.handleClick(11, (-9999), plotRenderingInfo28);
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D32 = new org.jfree.chart.renderer.category.BarRenderer3D((double) 0.0f, (double) 100L);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot34 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis33);
        java.awt.Color color35 = org.jfree.chart.ChartColor.DARK_BLUE;
        combinedDomainXYPlot34.setRangeMinorGridlinePaint((java.awt.Paint) color35);
        boolean boolean37 = combinedDomainXYPlot34.canSelectByRegion();
        barRenderer3D32.addChangeListener((org.jfree.chart.event.RendererChangeListener) combinedDomainXYPlot34);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        org.jfree.chart.entity.EntityCollection entityCollection41 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo42 = new org.jfree.chart.ChartRenderingInfo(entityCollection41);
        java.awt.Paint paint43 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean44 = chartRenderingInfo42.equals((java.lang.Object) paint43);
        java.awt.geom.Rectangle2D rectangle2D45 = chartRenderingInfo42.getChartArea();
        org.jfree.chart.title.TextTitle textTitle47 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity48 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D45, (org.jfree.chart.title.Title) textTitle47);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor49 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D50 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D45, rectangleAnchor49);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor51 = null;
        java.awt.geom.Point2D point2D52 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D45, rectangleAnchor51);
        combinedDomainXYPlot34.zoomDomainAxes((double) (-16777216), plotRenderingInfo40, point2D52);
        categoryPlot0.zoomDomainAxes(0.0d, plotRenderingInfo28, point2D52, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo24 and chartRenderingInfo42", chartRenderingInfo24.equals(chartRenderingInfo42) ? chartRenderingInfo24.hashCode() == chartRenderingInfo42.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test065");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.axis.NumberAxis numberAxis11 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity14 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D7, (org.jfree.chart.axis.Axis) numberAxis11, "", "DatasetRenderingOrder.FORWARD");
        numberAxis11.setMinorTickMarkInsideLength((float) 60000L);
        java.text.NumberFormat numberFormat17 = numberAxis11.getNumberFormatOverride();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer19 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement18);
        blockContainer19.clear();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer22 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer22.clearSeriesStrokes(false);
        boolean boolean25 = xYAreaRenderer22.getPlotLines();
        boolean boolean26 = xYAreaRenderer22.getBaseItemLabelsVisible();
        java.awt.Paint paint27 = xYAreaRenderer22.getBasePaint();
        boolean boolean28 = blockContainer19.equals((java.lang.Object) paint27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = blockContainer19.getMargin();
        double double30 = rectangleInsets29.getLeft();
        numberAxis11.setTickLabelInsets(rectangleInsets29);
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer33 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement32);
        blockContainer33.clear();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer36 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer36.clearSeriesStrokes(false);
        boolean boolean39 = xYAreaRenderer36.getPlotLines();
        boolean boolean40 = xYAreaRenderer36.getBaseItemLabelsVisible();
        java.awt.Paint paint41 = xYAreaRenderer36.getBasePaint();
        boolean boolean42 = blockContainer33.equals((java.lang.Object) paint41);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = blockContainer33.getMargin();
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup45 = piePlot44.getDatasetGroup();
        int int46 = piePlot44.getBackgroundImageAlignment();
        boolean boolean47 = piePlot44.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D48 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo49 = null;
        piePlot44.createAndAddEntity(rectangle2D48, plotRenderingInfo49, "hi!", "LGPL");
        piePlot44.setStartAngle((double) 1);
        org.jfree.data.xy.XYDataItem xYDataItem57 = new org.jfree.data.xy.XYDataItem((double) (byte) 10, (double) 0);
        java.awt.Color color60 = java.awt.Color.getColor("hi!", (int) (short) 100);
        boolean boolean61 = xYDataItem57.equals((java.lang.Object) "hi!");
        java.awt.Color color62 = java.awt.Color.MAGENTA;
        piePlot44.setSectionPaint((java.lang.Comparable) "hi!", (java.awt.Paint) color62);
        java.awt.Graphics2D graphics2D64 = null;
        org.jfree.chart.entity.EntityCollection entityCollection65 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo66 = new org.jfree.chart.ChartRenderingInfo(entityCollection65);
        java.awt.Paint paint67 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean68 = chartRenderingInfo66.equals((java.lang.Object) paint67);
        java.awt.geom.Rectangle2D rectangle2D69 = chartRenderingInfo66.getChartArea();
        piePlot44.drawBackgroundImage(graphics2D64, rectangle2D69);
        java.awt.geom.Rectangle2D rectangle2D71 = rectangleInsets43.createInsetRectangle(rectangle2D69);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType72 = org.jfree.chart.util.LengthAdjustmentType.NO_CHANGE;
        java.lang.String str73 = lengthAdjustmentType72.toString();
        java.lang.Object obj74 = null;
        boolean boolean75 = lengthAdjustmentType72.equals(obj74);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType76 = org.jfree.chart.util.LengthAdjustmentType.NO_CHANGE;
        java.lang.String str77 = lengthAdjustmentType76.toString();
        java.lang.Object obj78 = null;
        boolean boolean79 = lengthAdjustmentType76.equals(obj78);
        java.awt.geom.Rectangle2D rectangle2D80 = rectangleInsets29.createAdjustedRectangle(rectangle2D71, lengthAdjustmentType72, lengthAdjustmentType76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo4 and chartRenderingInfo66", chartRenderingInfo4.equals(chartRenderingInfo66) ? chartRenderingInfo4.hashCode() == chartRenderingInfo66.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test066");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = xYAreaRenderer1.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator5 = null;
        xYAreaRenderer1.setBaseItemLabelGenerator(xYItemLabelGenerator5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot10 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis9);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer12 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer12.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator15 = null;
        xYAreaRenderer12.setLegendItemURLGenerator(xYSeriesLabelGenerator15);
        xYAreaRenderer12.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean23 = xYAreaRenderer12.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot10.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer12);
        combinedDomainXYPlot10.clearDomainMarkers();
        java.awt.Font font27 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint28 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer31 = null;
        org.jfree.chart.text.TextBlock textBlock32 = org.jfree.chart.text.TextUtilities.createTextBlock("", font27, paint28, (float) (-1L), (int) (short) -1, textMeasurer31);
        combinedDomainXYPlot10.setDomainCrosshairPaint(paint28);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder34 = combinedDomainXYPlot10.getSeriesRenderingOrder();
        combinedDomainXYPlot10.clearDomainMarkers();
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone37 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection38 = new org.jfree.data.time.TimeSeriesCollection(timeZone37);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer40 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement36, (org.jfree.data.general.Dataset) timeSeriesCollection38, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState41 = timeSeriesCollection38.getSelectionState();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        org.jfree.chart.renderer.xy.XYItemRendererState xYItemRendererState43 = xYAreaRenderer1.initialise(graphics2D7, rectangle2D8, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot10, (org.jfree.data.xy.XYDataset) timeSeriesCollection38, plotRenderingInfo42);
        double double45 = timeSeriesCollection38.getDomainUpperBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer12", xYAreaRenderer1.equals(xYAreaRenderer12) ? xYAreaRenderer1.hashCode() == xYAreaRenderer12.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test067");
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot();
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot1.getDatasetGroup();
        int int3 = piePlot1.getBackgroundImageAlignment();
        boolean boolean4 = piePlot1.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.createAndAddEntity(rectangle2D5, plotRenderingInfo6, "hi!", "LGPL");
        piePlot1.setStartAngle((double) 1);
        org.jfree.data.xy.XYDataItem xYDataItem14 = new org.jfree.data.xy.XYDataItem((double) (byte) 10, (double) 0);
        java.awt.Color color17 = java.awt.Color.getColor("hi!", (int) (short) 100);
        boolean boolean18 = xYDataItem14.equals((java.lang.Object) "hi!");
        java.awt.Color color19 = java.awt.Color.MAGENTA;
        piePlot1.setSectionPaint((java.lang.Comparable) "hi!", (java.awt.Paint) color19);
        polarPlot0.setAngleLabelPaint((java.awt.Paint) color19);
        java.awt.Paint paint22 = polarPlot0.getAngleGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot24.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent26 = null;
        categoryPlot24.rendererChanged(rendererChangeEvent26);
        org.jfree.chart.entity.EntityCollection entityCollection29 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo30 = new org.jfree.chart.ChartRenderingInfo(entityCollection29);
        java.awt.Paint paint31 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean32 = chartRenderingInfo30.equals((java.lang.Object) paint31);
        java.awt.geom.Rectangle2D rectangle2D33 = chartRenderingInfo30.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = chartRenderingInfo30.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo35 = plotRenderingInfo34.getOwner();
        java.awt.geom.Point2D point2D36 = null;
        categoryPlot24.zoomRangeAxes(1.0E-8d, plotRenderingInfo34, point2D36, true);
        java.lang.Object obj39 = plotRenderingInfo34.clone();
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D42 = new org.jfree.chart.renderer.category.BarRenderer3D((double) 0.0f, (double) 100L);
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot44 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis43);
        java.awt.Color color45 = org.jfree.chart.ChartColor.DARK_BLUE;
        combinedDomainXYPlot44.setRangeMinorGridlinePaint((java.awt.Paint) color45);
        boolean boolean47 = combinedDomainXYPlot44.canSelectByRegion();
        barRenderer3D42.addChangeListener((org.jfree.chart.event.RendererChangeListener) combinedDomainXYPlot44);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo50 = null;
        org.jfree.chart.entity.EntityCollection entityCollection51 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo52 = new org.jfree.chart.ChartRenderingInfo(entityCollection51);
        java.awt.Paint paint53 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean54 = chartRenderingInfo52.equals((java.lang.Object) paint53);
        java.awt.geom.Rectangle2D rectangle2D55 = chartRenderingInfo52.getChartArea();
        org.jfree.chart.title.TextTitle textTitle57 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity58 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D55, (org.jfree.chart.title.Title) textTitle57);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor59 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D60 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D55, rectangleAnchor59);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor61 = null;
        java.awt.geom.Point2D point2D62 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D55, rectangleAnchor61);
        combinedDomainXYPlot44.zoomDomainAxes((double) (-16777216), plotRenderingInfo50, point2D62);
        polarPlot0.zoomDomainAxes((double) (byte) 100, plotRenderingInfo34, point2D62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo30 and chartRenderingInfo52", chartRenderingInfo30.equals(chartRenderingInfo52) ? chartRenderingInfo30.hashCode() == chartRenderingInfo52.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test068");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        boolean boolean18 = combinedDomainXYPlot1.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        double double20 = rectangleInsets19.getLeft();
        double double22 = rectangleInsets19.calculateLeftOutset((double) 0L);
        combinedDomainXYPlot1.setAxisOffset(rectangleInsets19);
        combinedDomainXYPlot1.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.PolarPlot polarPlot27 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Font font28 = polarPlot27.getAngleLabelFont();
        org.jfree.chart.axis.ValueAxis valueAxis29 = polarPlot27.getAxis();
        org.jfree.chart.entity.EntityCollection entityCollection31 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo32 = new org.jfree.chart.ChartRenderingInfo(entityCollection31);
        java.awt.Paint paint33 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean34 = chartRenderingInfo32.equals((java.lang.Object) paint33);
        java.awt.geom.Rectangle2D rectangle2D35 = chartRenderingInfo32.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = chartRenderingInfo32.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo37 = plotRenderingInfo36.getOwner();
        java.awt.geom.Point2D point2D38 = null;
        polarPlot27.zoomDomainAxes((double) (byte) 1, plotRenderingInfo36, point2D38, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot41.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent43 = null;
        categoryPlot41.rendererChanged(rendererChangeEvent43);
        org.jfree.chart.entity.EntityCollection entityCollection46 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo47 = new org.jfree.chart.ChartRenderingInfo(entityCollection46);
        java.awt.Paint paint48 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean49 = chartRenderingInfo47.equals((java.lang.Object) paint48);
        java.awt.geom.Rectangle2D rectangle2D50 = chartRenderingInfo47.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo51 = chartRenderingInfo47.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo52 = plotRenderingInfo51.getOwner();
        java.awt.geom.Point2D point2D53 = null;
        categoryPlot41.zoomRangeAxes(1.0E-8d, plotRenderingInfo51, point2D53, true);
        plotRenderingInfo36.addSubplotInfo(plotRenderingInfo51);
        org.jfree.chart.entity.EntityCollection entityCollection57 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo58 = new org.jfree.chart.ChartRenderingInfo(entityCollection57);
        java.awt.Paint paint59 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean60 = chartRenderingInfo58.equals((java.lang.Object) paint59);
        java.awt.geom.Rectangle2D rectangle2D61 = chartRenderingInfo58.getChartArea();
        org.jfree.chart.title.TextTitle textTitle63 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity64 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D61, (org.jfree.chart.title.Title) textTitle63);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor65 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D66 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D61, rectangleAnchor65);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor67 = null;
        java.awt.geom.Point2D point2D68 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D61, rectangleAnchor67);
        combinedDomainXYPlot1.zoomRangeAxes((double) 60000L, plotRenderingInfo36, point2D68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo47 and chartRenderingInfo58", chartRenderingInfo47.equals(chartRenderingInfo58) ? chartRenderingInfo47.hashCode() == chartRenderingInfo58.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test069");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        java.awt.Stroke stroke18 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        combinedDomainXYPlot1.setRangeCrosshairStroke(stroke18);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer21 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        org.jfree.chart.labels.StandardXYToolTipGenerator standardXYToolTipGenerator23 = org.jfree.chart.labels.StandardXYToolTipGenerator.getTimeSeriesInstance();
        java.text.NumberFormat numberFormat24 = standardXYToolTipGenerator23.getXFormat();
        java.lang.Object obj25 = standardXYToolTipGenerator23.clone();
        xYAreaRenderer21.setSeriesToolTipGenerator(1, (org.jfree.chart.labels.XYToolTipGenerator) standardXYToolTipGenerator23, false);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer21);
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer35 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer35.clearSeriesStrokes(false);
        boolean boolean38 = xYAreaRenderer35.getPlotLines();
        org.jfree.chart.title.LegendTitle legendTitle39 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource) xYAreaRenderer35);
        org.jfree.chart.util.RectangleEdge rectangleEdge40 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str41 = rectangleEdge40.toString();
        legendTitle39.setLegendItemGraphicEdge(rectangleEdge40);
        org.jfree.chart.title.TextTitle textTitle44 = new org.jfree.chart.title.TextTitle("");
        boolean boolean45 = textTitle44.getExpandToFitSpace();
        textTitle44.setText("");
        java.lang.String str48 = textTitle44.getID();
        java.awt.Font font49 = textTitle44.getFont();
        java.awt.Graphics2D graphics2D50 = null;
        org.jfree.chart.entity.EntityCollection entityCollection51 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo52 = new org.jfree.chart.ChartRenderingInfo(entityCollection51);
        java.awt.Paint paint53 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean54 = chartRenderingInfo52.equals((java.lang.Object) paint53);
        java.awt.geom.Rectangle2D rectangle2D55 = chartRenderingInfo52.getChartArea();
        textTitle44.draw(graphics2D50, rectangle2D55);
        legendTitle39.setBounds(rectangle2D55);
        java.awt.Paint paint58 = org.jfree.chart.text.TextFragment.DEFAULT_PAINT;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot59 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.plot.PiePlot piePlot60 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup61 = piePlot60.getDatasetGroup();
        int int62 = piePlot60.getBackgroundImageAlignment();
        boolean boolean63 = piePlot60.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D64 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo65 = null;
        piePlot60.createAndAddEntity(rectangle2D64, plotRenderingInfo65, "hi!", "LGPL");
        java.awt.Paint paint69 = piePlot60.getLabelPaint();
        java.awt.Stroke stroke70 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        piePlot60.setOutlineStroke(stroke70);
        combinedDomainXYPlot59.setDomainMinorGridlineStroke(stroke70);
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D75 = new org.jfree.chart.renderer.category.BarRenderer3D((double) 0.0f, (double) 100L);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator76 = barRenderer3D75.getBaseToolTipGenerator();
        java.awt.Paint paint77 = barRenderer3D75.getBaseItemLabelPaint();
        org.jfree.chart.LegendItem legendItem78 = new org.jfree.chart.LegendItem("PlotOrientation.VERTICAL", "[Dec 31, 1969 4:00:00 PM --> Dec 31, 1969 4:00:00 PM]", "WMAP_Plot", "hi!", (java.awt.Shape) rectangle2D55, paint58, stroke70, paint77);
        org.jfree.chart.axis.AxisSpace axisSpace79 = new org.jfree.chart.axis.AxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace80 = combinedDomainXYPlot1.calculateRangeAxisSpace(graphics2D29, rectangle2D55, axisSpace79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer21", xYAreaRenderer3.equals(xYAreaRenderer21) ? xYAreaRenderer3.hashCode() == xYAreaRenderer21.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test070");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = xYAreaRenderer1.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator5 = null;
        xYAreaRenderer1.setBaseItemLabelGenerator(xYItemLabelGenerator5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot10 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis9);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer12 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer12.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator15 = null;
        xYAreaRenderer12.setLegendItemURLGenerator(xYSeriesLabelGenerator15);
        xYAreaRenderer12.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean23 = xYAreaRenderer12.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot10.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer12);
        combinedDomainXYPlot10.clearDomainMarkers();
        java.awt.Font font27 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint28 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer31 = null;
        org.jfree.chart.text.TextBlock textBlock32 = org.jfree.chart.text.TextUtilities.createTextBlock("", font27, paint28, (float) (-1L), (int) (short) -1, textMeasurer31);
        combinedDomainXYPlot10.setDomainCrosshairPaint(paint28);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder34 = combinedDomainXYPlot10.getSeriesRenderingOrder();
        combinedDomainXYPlot10.clearDomainMarkers();
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone37 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection38 = new org.jfree.data.time.TimeSeriesCollection(timeZone37);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer40 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement36, (org.jfree.data.general.Dataset) timeSeriesCollection38, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState41 = timeSeriesCollection38.getSelectionState();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        org.jfree.chart.renderer.xy.XYItemRendererState xYItemRendererState43 = xYAreaRenderer1.initialise(graphics2D7, rectangle2D8, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot10, (org.jfree.data.xy.XYDataset) timeSeriesCollection38, plotRenderingInfo42);
        org.jfree.chart.plot.XYCrosshairState xYCrosshairState44 = null;
        xYItemRendererState43.setCrosshairState(xYCrosshairState44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer12", xYAreaRenderer1.equals(xYAreaRenderer12) ? xYAreaRenderer1.hashCode() == xYAreaRenderer12.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test071");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        java.awt.Paint paint1 = combinedDomainXYPlot0.getRangeGridlinePaint();
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        org.jfree.chart.title.TextTitle textTitle9 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity10 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D7, (org.jfree.chart.title.Title) textTitle9);
        combinedDomainXYPlot0.drawQuadrants(graphics2D2, rectangle2D7);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot14 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis13);
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.entity.EntityCollection entityCollection16 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = new org.jfree.chart.ChartRenderingInfo(entityCollection16);
        java.awt.Paint paint18 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean19 = chartRenderingInfo17.equals((java.lang.Object) paint18);
        java.awt.geom.Rectangle2D rectangle2D20 = chartRenderingInfo17.getChartArea();
        java.util.List list21 = null;
        combinedDomainXYPlot14.drawDomainGridlines(graphics2D15, rectangle2D20, list21);
        org.jfree.chart.axis.NumberAxis numberAxis24 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity27 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D20, (org.jfree.chart.axis.Axis) numberAxis24, "", "DatasetRenderingOrder.FORWARD");
        org.jfree.chart.renderer.PolarItemRenderer polarItemRenderer28 = null;
        org.jfree.chart.plot.PolarPlot polarPlot29 = new org.jfree.chart.plot.PolarPlot(xYDataset12, (org.jfree.chart.axis.ValueAxis) numberAxis24, polarItemRenderer28);
        int int30 = combinedDomainXYPlot0.getDomainAxisIndex((org.jfree.chart.axis.ValueAxis) numberAxis24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo4 and chartRenderingInfo17", chartRenderingInfo4.equals(chartRenderingInfo17) ? chartRenderingInfo4.hashCode() == chartRenderingInfo17.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test072");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = xYAreaRenderer1.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator5 = null;
        xYAreaRenderer1.setBaseItemLabelGenerator(xYItemLabelGenerator5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot10 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis9);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer12 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer12.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator15 = null;
        xYAreaRenderer12.setLegendItemURLGenerator(xYSeriesLabelGenerator15);
        xYAreaRenderer12.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean23 = xYAreaRenderer12.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot10.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer12);
        combinedDomainXYPlot10.clearDomainMarkers();
        java.awt.Font font27 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint28 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer31 = null;
        org.jfree.chart.text.TextBlock textBlock32 = org.jfree.chart.text.TextUtilities.createTextBlock("", font27, paint28, (float) (-1L), (int) (short) -1, textMeasurer31);
        combinedDomainXYPlot10.setDomainCrosshairPaint(paint28);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder34 = combinedDomainXYPlot10.getSeriesRenderingOrder();
        combinedDomainXYPlot10.clearDomainMarkers();
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone37 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection38 = new org.jfree.data.time.TimeSeriesCollection(timeZone37);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer40 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement36, (org.jfree.data.general.Dataset) timeSeriesCollection38, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState41 = timeSeriesCollection38.getSelectionState();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        org.jfree.chart.renderer.xy.XYItemRendererState xYItemRendererState43 = xYAreaRenderer1.initialise(graphics2D7, rectangle2D8, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot10, (org.jfree.data.xy.XYDataset) timeSeriesCollection38, plotRenderingInfo42);
        java.awt.geom.Line2D line2D44 = xYItemRendererState43.workingLine;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer12", xYAreaRenderer1.equals(xYAreaRenderer12) ? xYAreaRenderer1.hashCode() == xYAreaRenderer12.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test073");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        boolean boolean4 = xYAreaRenderer1.getPlotLines();
        boolean boolean5 = xYAreaRenderer1.getBaseItemLabelsVisible();
        java.awt.Paint paint6 = xYAreaRenderer1.getBasePaint();
        java.awt.Font font7 = xYAreaRenderer1.getBaseItemLabelFont();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator8 = null;
        xYAreaRenderer1.setBaseItemLabelGenerator(xYItemLabelGenerator8);
        xYAreaRenderer1.setUseFillPaint(true);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot14 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis13);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer16.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator19 = null;
        xYAreaRenderer16.setLegendItemURLGenerator(xYSeriesLabelGenerator19);
        xYAreaRenderer16.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean27 = xYAreaRenderer16.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot14.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer16);
        combinedDomainXYPlot14.clearDomainMarkers();
        boolean boolean30 = combinedDomainXYPlot14.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.NumberAxis numberAxis32 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis32.pan((double) 1);
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot36 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis35);
        java.awt.Graphics2D graphics2D37 = null;
        org.jfree.chart.entity.EntityCollection entityCollection38 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo39 = new org.jfree.chart.ChartRenderingInfo(entityCollection38);
        java.awt.Paint paint40 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean41 = chartRenderingInfo39.equals((java.lang.Object) paint40);
        java.awt.geom.Rectangle2D rectangle2D42 = chartRenderingInfo39.getChartArea();
        java.util.List list43 = null;
        combinedDomainXYPlot36.drawDomainGridlines(graphics2D37, rectangle2D42, list43);
        org.jfree.chart.axis.NumberAxis numberAxis46 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity49 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D42, (org.jfree.chart.axis.Axis) numberAxis46, "", "DatasetRenderingOrder.FORWARD");
        xYAreaRenderer1.drawDomainGridLine(graphics2D12, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot14, (org.jfree.chart.axis.ValueAxis) numberAxis32, rectangle2D42, (double) 11);
        numberAxis32.setLabelToolTip("{0}: ({1}, {2})");
        numberAxis32.setRange(0.0d, (double) 1L);
        double double57 = numberAxis32.getLowerMargin();
        org.jfree.chart.plot.Plot plot58 = numberAxis32.getPlot();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot59 = new org.jfree.chart.plot.CombinedDomainXYPlot((org.jfree.chart.axis.ValueAxis) numberAxis32);
        org.jfree.chart.util.RectangleEdge rectangleEdge60 = combinedDomainXYPlot59.getDomainAxisEdge();
        java.awt.Graphics2D graphics2D61 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement62 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer63 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement62);
        blockContainer63.clear();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer66 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer66.clearSeriesStrokes(false);
        boolean boolean69 = xYAreaRenderer66.getPlotLines();
        boolean boolean70 = xYAreaRenderer66.getBaseItemLabelsVisible();
        java.awt.Paint paint71 = xYAreaRenderer66.getBasePaint();
        boolean boolean72 = blockContainer63.equals((java.lang.Object) paint71);
        org.jfree.chart.entity.EntityCollection entityCollection73 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo74 = new org.jfree.chart.ChartRenderingInfo(entityCollection73);
        java.awt.Paint paint75 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean76 = chartRenderingInfo74.equals((java.lang.Object) paint75);
        java.awt.geom.Rectangle2D rectangle2D77 = chartRenderingInfo74.getChartArea();
        org.jfree.chart.title.TextTitle textTitle79 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity80 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D77, (org.jfree.chart.title.Title) textTitle79);
        blockContainer63.setBounds(rectangle2D77);
        org.jfree.chart.plot.CategoryPlot categoryPlot82 = new org.jfree.chart.plot.CategoryPlot();
        int int83 = categoryPlot82.getDatasetCount();
        categoryPlot82.setAnchorValue((double) 10.0f);
        categoryPlot82.setDomainCrosshairColumnKey((java.lang.Comparable) "TitleEntity: tooltip = LGPL", true);
        org.jfree.chart.axis.AxisSpace axisSpace89 = new org.jfree.chart.axis.AxisSpace();
        categoryPlot82.setFixedDomainAxisSpace(axisSpace89);
        org.jfree.data.general.SeriesException seriesException92 = new org.jfree.data.general.SeriesException("ClassContext");
        boolean boolean93 = axisSpace89.equals((java.lang.Object) seriesException92);
        org.jfree.chart.axis.AxisSpace axisSpace94 = combinedDomainXYPlot59.calculateRangeAxisSpace(graphics2D61, rectangle2D77, axisSpace89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer16 and xYAreaRenderer66", xYAreaRenderer16.equals(xYAreaRenderer66) ? xYAreaRenderer16.hashCode() == xYAreaRenderer66.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test074");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) 'a', layer2);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        categoryPlot0.setDataset(4, categoryDataset5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = categoryPlot0.getDrawingSupplier();
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer10 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer10.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator13 = null;
        xYAreaRenderer10.setLegendItemURLGenerator(xYSeriesLabelGenerator13);
        xYAreaRenderer10.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) false);
        xYAreaRenderer10.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator21 = null;
        xYAreaRenderer10.setSeriesURLGenerator((int) (short) 100, xYURLGenerator21, false);
        java.awt.Paint paint27 = xYAreaRenderer10.getItemFillPaint((int) (short) 10, (int) 'a', true);
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot30 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis29);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer32 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer32.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator35 = null;
        xYAreaRenderer32.setLegendItemURLGenerator(xYSeriesLabelGenerator35);
        xYAreaRenderer32.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean43 = xYAreaRenderer32.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot30.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer32);
        boolean boolean45 = combinedDomainXYPlot30.canSelectByPoint();
        org.jfree.chart.axis.NumberAxis numberAxis47 = new org.jfree.chart.axis.NumberAxis("");
        int int48 = numberAxis47.getMinorTickCount();
        numberAxis47.setMinorTickMarksVisible(true);
        org.jfree.chart.entity.EntityCollection entityCollection51 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo52 = new org.jfree.chart.ChartRenderingInfo(entityCollection51);
        java.awt.Paint paint53 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean54 = chartRenderingInfo52.equals((java.lang.Object) paint53);
        java.awt.geom.Rectangle2D rectangle2D55 = chartRenderingInfo52.getChartArea();
        org.jfree.chart.title.TextTitle textTitle57 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity58 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D55, (org.jfree.chart.title.Title) textTitle57);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor59 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D60 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D55, rectangleAnchor59);
        java.awt.Paint paint62 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_PAINT;
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot63 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke64 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot63.setRangeCrosshairStroke(stroke64);
        xYAreaRenderer10.drawDomainLine(graphics2D28, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot30, (org.jfree.chart.axis.ValueAxis) numberAxis47, rectangle2D55, (double) 60000L, paint62, stroke64);
        org.jfree.chart.plot.CategoryPlot categoryPlot68 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer70 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection71 = categoryPlot68.getDomainMarkers((int) 'a', layer70);
        categoryPlot0.drawDomainMarkers(graphics2D8, rectangle2D55, 12, layer70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer10 and xYAreaRenderer32", xYAreaRenderer10.equals(xYAreaRenderer32) ? xYAreaRenderer10.hashCode() == xYAreaRenderer32.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test075");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection1 = combinedRangeXYPlot0.getLegendItems();
        combinedRangeXYPlot0.setRangeGridlinesVisible(true);
        combinedRangeXYPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.entity.EntityCollection entityCollection7 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo8 = new org.jfree.chart.ChartRenderingInfo(entityCollection7);
        java.awt.Paint paint9 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean10 = chartRenderingInfo8.equals((java.lang.Object) paint9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo8);
        org.jfree.chart.entity.EntityCollection entityCollection12 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo13 = new org.jfree.chart.ChartRenderingInfo(entityCollection12);
        java.awt.Paint paint14 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean15 = chartRenderingInfo13.equals((java.lang.Object) paint14);
        java.awt.geom.Rectangle2D rectangle2D16 = chartRenderingInfo13.getChartArea();
        org.jfree.chart.title.TextTitle textTitle18 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity19 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D16, (org.jfree.chart.title.Title) textTitle18);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D21 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D16, rectangleAnchor20);
        combinedRangeXYPlot0.zoomDomainAxes(0.0d, plotRenderingInfo11, point2D21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo8 and chartRenderingInfo13", chartRenderingInfo8.equals(chartRenderingInfo13) ? chartRenderingInfo8.hashCode() == chartRenderingInfo13.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test076");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) 'a', layer2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setCrosshairDatasetIndex((int) (short) 10, true);
        java.awt.Paint paint8 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot11 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list12 = combinedRangeXYPlot11.getSubplots();
        combinedRangeXYPlot11.setGap((double) (-16777216));
        org.jfree.chart.entity.EntityCollection entityCollection17 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = new org.jfree.chart.ChartRenderingInfo(entityCollection17);
        java.awt.Paint paint19 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean20 = chartRenderingInfo18.equals((java.lang.Object) paint19);
        java.awt.geom.Rectangle2D rectangle2D21 = chartRenderingInfo18.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = chartRenderingInfo18.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = plotRenderingInfo22.getOwner();
        combinedRangeXYPlot11.handleClick((-9999), 5, plotRenderingInfo22);
        org.jfree.chart.entity.EntityCollection entityCollection25 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = new org.jfree.chart.ChartRenderingInfo(entityCollection25);
        java.awt.Paint paint27 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean28 = chartRenderingInfo26.equals((java.lang.Object) paint27);
        java.awt.geom.Rectangle2D rectangle2D29 = chartRenderingInfo26.getChartArea();
        org.jfree.chart.title.TextTitle textTitle31 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity32 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D29, (org.jfree.chart.title.Title) textTitle31);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D34 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D29, rectangleAnchor33);
        categoryPlot0.zoomRangeAxes((double) 100, (double) 60000L, plotRenderingInfo22, point2D34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo18 and chartRenderingInfo26", chartRenderingInfo18.equals(chartRenderingInfo26) ? chartRenderingInfo18.hashCode() == chartRenderingInfo26.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test077");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        boolean boolean18 = combinedDomainXYPlot1.isRangeCrosshairVisible();
        boolean boolean19 = combinedDomainXYPlot1.isDomainMinorGridlinesVisible();
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.renderer.xy.XYBarRenderer xYBarRenderer22 = new org.jfree.chart.renderer.xy.XYBarRenderer(10.0d);
        xYBarRenderer22.setMargin(0.05d);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = xYBarRenderer22.getNegativeItemLabelPositionFallback();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer28 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement27);
        blockContainer28.clear();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer31 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer31.clearSeriesStrokes(false);
        boolean boolean34 = xYAreaRenderer31.getPlotLines();
        boolean boolean35 = xYAreaRenderer31.getBaseItemLabelsVisible();
        java.awt.Paint paint36 = xYAreaRenderer31.getBasePaint();
        boolean boolean37 = blockContainer28.equals((java.lang.Object) paint36);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = blockContainer28.getMargin();
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup40 = piePlot39.getDatasetGroup();
        int int41 = piePlot39.getBackgroundImageAlignment();
        boolean boolean42 = piePlot39.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        piePlot39.createAndAddEntity(rectangle2D43, plotRenderingInfo44, "hi!", "LGPL");
        piePlot39.setStartAngle((double) 1);
        org.jfree.data.xy.XYDataItem xYDataItem52 = new org.jfree.data.xy.XYDataItem((double) (byte) 10, (double) 0);
        java.awt.Color color55 = java.awt.Color.getColor("hi!", (int) (short) 100);
        boolean boolean56 = xYDataItem52.equals((java.lang.Object) "hi!");
        java.awt.Color color57 = java.awt.Color.MAGENTA;
        piePlot39.setSectionPaint((java.lang.Comparable) "hi!", (java.awt.Paint) color57);
        java.awt.Graphics2D graphics2D59 = null;
        org.jfree.chart.entity.EntityCollection entityCollection60 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo61 = new org.jfree.chart.ChartRenderingInfo(entityCollection60);
        java.awt.Paint paint62 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean63 = chartRenderingInfo61.equals((java.lang.Object) paint62);
        java.awt.geom.Rectangle2D rectangle2D64 = chartRenderingInfo61.getChartArea();
        piePlot39.drawBackgroundImage(graphics2D59, rectangle2D64);
        java.awt.geom.Rectangle2D rectangle2D66 = rectangleInsets38.createInsetRectangle(rectangle2D64);
        xYBarRenderer22.setSeriesShape((int) (byte) 1, (java.awt.Shape) rectangle2D64, false);
        org.jfree.chart.axis.AxisCollection axisCollection69 = new org.jfree.chart.axis.AxisCollection();
        java.util.List list70 = axisCollection69.getAxesAtBottom();
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D20, rectangle2D64, list70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer31", xYAreaRenderer3.equals(xYAreaRenderer31) ? xYAreaRenderer3.hashCode() == xYAreaRenderer31.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test078");
        org.jfree.chart.entity.EntityCollection entityCollection0 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo1 = new org.jfree.chart.ChartRenderingInfo(entityCollection0);
        java.awt.Paint paint2 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean3 = chartRenderingInfo1.equals((java.lang.Object) paint2);
        java.awt.geom.Rectangle2D rectangle2D4 = chartRenderingInfo1.getChartArea();
        org.jfree.chart.title.TextTitle textTitle6 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity7 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D4, (org.jfree.chart.title.Title) textTitle6);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D9 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D4, rectangleAnchor8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity16 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D4, pieDataset10, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot18 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis17);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer20 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer20.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator23 = null;
        xYAreaRenderer20.setLegendItemURLGenerator(xYSeriesLabelGenerator23);
        xYAreaRenderer20.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean31 = xYAreaRenderer20.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot18.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer20);
        combinedDomainXYPlot18.clearDomainMarkers();
        java.awt.Font font35 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint36 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer39 = null;
        org.jfree.chart.text.TextBlock textBlock40 = org.jfree.chart.text.TextUtilities.createTextBlock("", font35, paint36, (float) (-1L), (int) (short) -1, textMeasurer39);
        combinedDomainXYPlot18.setDomainCrosshairPaint(paint36);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder42 = combinedDomainXYPlot18.getSeriesRenderingOrder();
        java.awt.Paint paint43 = org.jfree.chart.plot.PolarPlot.DEFAULT_GRIDLINE_PAINT;
        combinedDomainXYPlot18.setRangeTickBandPaint(paint43);
        org.jfree.chart.title.LegendGraphic legendGraphic45 = new org.jfree.chart.title.LegendGraphic((java.awt.Shape) rectangle2D4, paint43);
        java.awt.Paint paint46 = legendGraphic45.getOutlinePaint();
        legendGraphic45.setShapeOutlineVisible(false);
        boolean boolean49 = legendGraphic45.isShapeOutlineVisible();
        java.awt.Stroke stroke50 = legendGraphic45.getLineStroke();
        org.jfree.chart.entity.EntityCollection entityCollection51 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo52 = new org.jfree.chart.ChartRenderingInfo(entityCollection51);
        java.awt.Paint paint53 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean54 = chartRenderingInfo52.equals((java.lang.Object) paint53);
        java.awt.geom.Rectangle2D rectangle2D55 = chartRenderingInfo52.getChartArea();
        org.jfree.chart.title.TextTitle textTitle57 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity58 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D55, (org.jfree.chart.title.Title) textTitle57);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor59 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D60 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D55, rectangleAnchor59);
        org.jfree.data.general.PieDataset pieDataset61 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity67 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D55, pieDataset61, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        legendGraphic45.setShape((java.awt.Shape) rectangle2D55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo1 and chartRenderingInfo52", chartRenderingInfo1.equals(chartRenderingInfo52) ? chartRenderingInfo1.hashCode() == chartRenderingInfo52.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test079");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        boolean boolean16 = combinedDomainXYPlot1.canSelectByPoint();
        org.jfree.chart.plot.PolarPlot polarPlot18 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Font font19 = polarPlot18.getAngleLabelFont();
        org.jfree.chart.axis.ValueAxis valueAxis20 = polarPlot18.getAxis();
        org.jfree.chart.entity.EntityCollection entityCollection22 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = new org.jfree.chart.ChartRenderingInfo(entityCollection22);
        java.awt.Paint paint24 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean25 = chartRenderingInfo23.equals((java.lang.Object) paint24);
        java.awt.geom.Rectangle2D rectangle2D26 = chartRenderingInfo23.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = chartRenderingInfo23.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo28 = plotRenderingInfo27.getOwner();
        java.awt.geom.Point2D point2D29 = null;
        polarPlot18.zoomDomainAxes((double) (byte) 1, plotRenderingInfo27, point2D29, false);
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D34 = new org.jfree.chart.renderer.category.BarRenderer3D((double) 0.0f, (double) 100L);
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot36 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis35);
        java.awt.Color color37 = org.jfree.chart.ChartColor.DARK_BLUE;
        combinedDomainXYPlot36.setRangeMinorGridlinePaint((java.awt.Paint) color37);
        boolean boolean39 = combinedDomainXYPlot36.canSelectByRegion();
        barRenderer3D34.addChangeListener((org.jfree.chart.event.RendererChangeListener) combinedDomainXYPlot36);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        org.jfree.chart.entity.EntityCollection entityCollection43 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo44 = new org.jfree.chart.ChartRenderingInfo(entityCollection43);
        java.awt.Paint paint45 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean46 = chartRenderingInfo44.equals((java.lang.Object) paint45);
        java.awt.geom.Rectangle2D rectangle2D47 = chartRenderingInfo44.getChartArea();
        org.jfree.chart.title.TextTitle textTitle49 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity50 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D47, (org.jfree.chart.title.Title) textTitle49);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor51 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D52 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D47, rectangleAnchor51);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor53 = null;
        java.awt.geom.Point2D point2D54 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D47, rectangleAnchor53);
        combinedDomainXYPlot36.zoomDomainAxes((double) (-16777216), plotRenderingInfo42, point2D54);
        combinedDomainXYPlot1.zoomDomainAxes((double) (-62104204800001L), plotRenderingInfo27, point2D54, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo23 and chartRenderingInfo44", chartRenderingInfo23.equals(chartRenderingInfo44) ? chartRenderingInfo23.hashCode() == chartRenderingInfo44.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test080");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder25 = combinedDomainXYPlot1.getSeriesRenderingOrder();
        combinedDomainXYPlot1.clearDomainMarkers();
        int int27 = combinedDomainXYPlot1.getRendererCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = combinedDomainXYPlot1.getRenderer((-1));
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot32 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis31);
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.entity.EntityCollection entityCollection34 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo35 = new org.jfree.chart.ChartRenderingInfo(entityCollection34);
        java.awt.Paint paint36 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean37 = chartRenderingInfo35.equals((java.lang.Object) paint36);
        java.awt.geom.Rectangle2D rectangle2D38 = chartRenderingInfo35.getChartArea();
        java.util.List list39 = null;
        combinedDomainXYPlot32.drawDomainGridlines(graphics2D33, rectangle2D38, list39);
        org.jfree.chart.axis.NumberAxis numberAxis42 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity45 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D38, (org.jfree.chart.axis.Axis) numberAxis42, "", "DatasetRenderingOrder.FORWARD");
        java.lang.Object obj46 = numberAxis42.clone();
        combinedDomainXYPlot1.setRangeAxis(0, (org.jfree.chart.axis.ValueAxis) numberAxis42);
        org.jfree.chart.axis.NumberAxis numberAxis49 = new org.jfree.chart.axis.NumberAxis("");
        double double50 = numberAxis49.getAutoRangeMinimumSize();
        numberAxis49.setLowerBound((double) (byte) -1);
        int int53 = combinedDomainXYPlot1.getRangeAxisIndex((org.jfree.chart.axis.ValueAxis) numberAxis49);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer55 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer55.clearSeriesStrokes(false);
        boolean boolean58 = xYAreaRenderer55.getPlotLines();
        java.awt.Font font60 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint61 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer64 = null;
        org.jfree.chart.text.TextBlock textBlock65 = org.jfree.chart.text.TextUtilities.createTextBlock("", font60, paint61, (float) (-1L), (int) (short) -1, textMeasurer64);
        xYAreaRenderer55.setBaseItemLabelPaint(paint61, true);
        java.awt.Stroke stroke69 = xYAreaRenderer55.getSeriesOutlineStroke((int) ' ');
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer55);
        org.jfree.chart.plot.IntervalMarker intervalMarker73 = new org.jfree.chart.plot.IntervalMarker((double) (short) 100, (double) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot74 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer76 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection77 = categoryPlot74.getDomainMarkers((int) 'a', layer76);
        org.jfree.data.category.CategoryDataset categoryDataset79 = null;
        categoryPlot74.setDataset(4, categoryDataset79);
        org.jfree.chart.axis.AxisSpace axisSpace81 = categoryPlot74.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D82 = null;
        java.awt.geom.Rectangle2D rectangle2D83 = null;
        org.jfree.chart.util.Layer layer85 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot74.drawRangeMarkers(graphics2D82, rectangle2D83, 0, layer85);
        org.jfree.chart.plot.CategoryPlot categoryPlot87 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer89 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection90 = categoryPlot87.getRangeMarkers(7, layer89);
        java.util.Collection collection91 = categoryPlot74.getDomainMarkers(layer89);
        boolean boolean92 = combinedDomainXYPlot1.removeDomainMarker((org.jfree.chart.plot.Marker) intervalMarker73, layer89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer55", xYAreaRenderer3.equals(xYAreaRenderer55) ? xYAreaRenderer3.hashCode() == xYAreaRenderer55.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test081");
        org.jfree.chart.axis.NumberAxis numberAxis1 = new org.jfree.chart.axis.NumberAxis("");
        int int2 = numberAxis1.getMinorTickCount();
        numberAxis1.setMinorTickMarksVisible(true);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer6 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer6.clearSeriesStrokes(false);
        boolean boolean9 = xYAreaRenderer6.getPlotLines();
        boolean boolean10 = xYAreaRenderer6.getBaseItemLabelsVisible();
        java.awt.Paint paint11 = xYAreaRenderer6.getBasePaint();
        java.awt.Font font12 = xYAreaRenderer6.getBaseItemLabelFont();
        java.awt.Font font13 = xYAreaRenderer6.getBaseItemLabelFont();
        numberAxis1.setTickLabelFont(font13);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot16 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis15);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer18 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer18.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator21 = null;
        xYAreaRenderer18.setLegendItemURLGenerator(xYSeriesLabelGenerator21);
        xYAreaRenderer18.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean29 = xYAreaRenderer18.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot16.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer18);
        combinedDomainXYPlot16.clearDomainMarkers();
        java.awt.Font font33 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint34 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer37 = null;
        org.jfree.chart.text.TextBlock textBlock38 = org.jfree.chart.text.TextUtilities.createTextBlock("", font33, paint34, (float) (-1L), (int) (short) -1, textMeasurer37);
        combinedDomainXYPlot16.setDomainCrosshairPaint(paint34);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder40 = combinedDomainXYPlot16.getSeriesRenderingOrder();
        java.awt.Paint paint41 = org.jfree.chart.plot.PolarPlot.DEFAULT_GRIDLINE_PAINT;
        combinedDomainXYPlot16.setRangeTickBandPaint(paint41);
        combinedDomainXYPlot16.setGap(0.0d);
        numberAxis1.setPlot((org.jfree.chart.plot.Plot) combinedDomainXYPlot16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer6 and xYAreaRenderer18", xYAreaRenderer6.equals(xYAreaRenderer18) ? xYAreaRenderer6.hashCode() == xYAreaRenderer18.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test082");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        boolean boolean4 = xYAreaRenderer1.getPlotLines();
        boolean boolean5 = xYAreaRenderer1.getBaseItemLabelsVisible();
        java.awt.Paint paint6 = xYAreaRenderer1.getBasePaint();
        java.awt.Font font7 = xYAreaRenderer1.getBaseItemLabelFont();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator8 = null;
        xYAreaRenderer1.setBaseItemLabelGenerator(xYItemLabelGenerator8);
        xYAreaRenderer1.setUseFillPaint(true);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot14 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis13);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer16.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator19 = null;
        xYAreaRenderer16.setLegendItemURLGenerator(xYSeriesLabelGenerator19);
        xYAreaRenderer16.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean27 = xYAreaRenderer16.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot14.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer16);
        combinedDomainXYPlot14.clearDomainMarkers();
        boolean boolean30 = combinedDomainXYPlot14.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.NumberAxis numberAxis32 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis32.pan((double) 1);
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot36 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis35);
        java.awt.Graphics2D graphics2D37 = null;
        org.jfree.chart.entity.EntityCollection entityCollection38 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo39 = new org.jfree.chart.ChartRenderingInfo(entityCollection38);
        java.awt.Paint paint40 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean41 = chartRenderingInfo39.equals((java.lang.Object) paint40);
        java.awt.geom.Rectangle2D rectangle2D42 = chartRenderingInfo39.getChartArea();
        java.util.List list43 = null;
        combinedDomainXYPlot36.drawDomainGridlines(graphics2D37, rectangle2D42, list43);
        org.jfree.chart.axis.NumberAxis numberAxis46 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity49 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D42, (org.jfree.chart.axis.Axis) numberAxis46, "", "DatasetRenderingOrder.FORWARD");
        xYAreaRenderer1.drawDomainGridLine(graphics2D12, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot14, (org.jfree.chart.axis.ValueAxis) numberAxis32, rectangle2D42, (double) 11);
        numberAxis32.setLabelToolTip("{0}: ({1}, {2})");
        numberAxis32.setRange(0.0d, (double) 1L);
        double double57 = numberAxis32.getLowerMargin();
        org.jfree.chart.plot.Plot plot58 = numberAxis32.getPlot();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot59 = new org.jfree.chart.plot.CombinedDomainXYPlot((org.jfree.chart.axis.ValueAxis) numberAxis32);
        java.awt.Graphics2D graphics2D60 = null;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer62 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer62.clearSeriesStrokes(false);
        boolean boolean65 = xYAreaRenderer62.getPlotLines();
        boolean boolean66 = xYAreaRenderer62.getBaseItemLabelsVisible();
        java.awt.Paint paint67 = xYAreaRenderer62.getBasePaint();
        java.awt.Paint paint69 = null;
        xYAreaRenderer62.setSeriesOutlinePaint(4, paint69);
        org.jfree.chart.entity.EntityCollection entityCollection72 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo73 = new org.jfree.chart.ChartRenderingInfo(entityCollection72);
        java.awt.Paint paint74 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean75 = chartRenderingInfo73.equals((java.lang.Object) paint74);
        java.awt.geom.Rectangle2D rectangle2D76 = chartRenderingInfo73.getChartArea();
        org.jfree.chart.title.TextTitle textTitle78 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity79 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D76, (org.jfree.chart.title.Title) textTitle78);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor80 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D81 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D76, rectangleAnchor80);
        xYAreaRenderer62.setSeriesShape(5, (java.awt.Shape) rectangle2D76, true);
        org.jfree.chart.axis.AxisState axisState84 = new org.jfree.chart.axis.AxisState();
        double double85 = axisState84.getMax();
        java.util.List list86 = axisState84.getTicks();
        combinedDomainXYPlot59.drawDomainTickBands(graphics2D60, rectangle2D76, list86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer16 and xYAreaRenderer62", xYAreaRenderer16.equals(xYAreaRenderer62) ? xYAreaRenderer16.hashCode() == xYAreaRenderer62.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test083");
        org.jfree.chart.entity.EntityCollection entityCollection2 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo3 = new org.jfree.chart.ChartRenderingInfo(entityCollection2);
        java.awt.Paint paint4 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean5 = chartRenderingInfo3.equals((java.lang.Object) paint4);
        java.awt.geom.Rectangle2D rectangle2D6 = chartRenderingInfo3.getChartArea();
        org.jfree.chart.title.TextTitle textTitle8 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity9 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D6, (org.jfree.chart.title.Title) textTitle8);
        java.awt.geom.Point2D point2D10 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(45.0d, (double) (byte) 1, rectangle2D6);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer16.clearSeriesStrokes(false);
        boolean boolean19 = xYAreaRenderer16.getPlotLines();
        org.jfree.chart.title.LegendTitle legendTitle20 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource) xYAreaRenderer16);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str22 = rectangleEdge21.toString();
        legendTitle20.setLegendItemGraphicEdge(rectangleEdge21);
        org.jfree.chart.title.TextTitle textTitle25 = new org.jfree.chart.title.TextTitle("");
        boolean boolean26 = textTitle25.getExpandToFitSpace();
        textTitle25.setText("");
        java.lang.String str29 = textTitle25.getID();
        java.awt.Font font30 = textTitle25.getFont();
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.entity.EntityCollection entityCollection32 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo33 = new org.jfree.chart.ChartRenderingInfo(entityCollection32);
        java.awt.Paint paint34 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean35 = chartRenderingInfo33.equals((java.lang.Object) paint34);
        java.awt.geom.Rectangle2D rectangle2D36 = chartRenderingInfo33.getChartArea();
        textTitle25.draw(graphics2D31, rectangle2D36);
        legendTitle20.setBounds(rectangle2D36);
        java.awt.Paint paint39 = org.jfree.chart.text.TextFragment.DEFAULT_PAINT;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot40 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup42 = piePlot41.getDatasetGroup();
        int int43 = piePlot41.getBackgroundImageAlignment();
        boolean boolean44 = piePlot41.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        piePlot41.createAndAddEntity(rectangle2D45, plotRenderingInfo46, "hi!", "LGPL");
        java.awt.Paint paint50 = piePlot41.getLabelPaint();
        java.awt.Stroke stroke51 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        piePlot41.setOutlineStroke(stroke51);
        combinedDomainXYPlot40.setDomainMinorGridlineStroke(stroke51);
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D56 = new org.jfree.chart.renderer.category.BarRenderer3D((double) 0.0f, (double) 100L);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator57 = barRenderer3D56.getBaseToolTipGenerator();
        java.awt.Paint paint58 = barRenderer3D56.getBaseItemLabelPaint();
        org.jfree.chart.LegendItem legendItem59 = new org.jfree.chart.LegendItem("PlotOrientation.VERTICAL", "[Dec 31, 1969 4:00:00 PM --> Dec 31, 1969 4:00:00 PM]", "WMAP_Plot", "hi!", (java.awt.Shape) rectangle2D36, paint39, stroke51, paint58);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor60 = org.jfree.chart.util.RectangleAnchor.LEFT;
        java.awt.geom.Point2D point2D61 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D36, rectangleAnchor60);
        java.awt.Shape shape64 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape((java.awt.Shape) rectangle2D6, rectangleAnchor60, (double) (short) 100, (double) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo3 and chartRenderingInfo33", chartRenderingInfo3.equals(chartRenderingInfo33) ? chartRenderingInfo3.hashCode() == chartRenderingInfo33.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test084");
        org.jfree.chart.renderer.xy.XYStepRenderer xYStepRenderer0 = new org.jfree.chart.renderer.xy.XYStepRenderer();
        java.lang.Boolean boolean2 = xYStepRenderer0.getSeriesLinesVisible(0);
        xYStepRenderer0.setUseOutlinePaint(true);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer6 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer6.clearSeriesStrokes(false);
        boolean boolean9 = xYAreaRenderer6.getPlotLines();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYAreaRenderer6.setSeriesStroke((int) (short) 1, stroke11, true);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot16 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis15);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer18 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer18.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator21 = null;
        xYAreaRenderer18.setLegendItemURLGenerator(xYSeriesLabelGenerator21);
        xYAreaRenderer18.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean29 = xYAreaRenderer18.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot16.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer18);
        java.awt.Stroke stroke31 = combinedDomainXYPlot16.getDomainCrosshairStroke();
        xYAreaRenderer6.setSeriesOutlineStroke((int) (short) 100, stroke31, false);
        boolean boolean34 = xYStepRenderer0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer6 and xYAreaRenderer18", xYAreaRenderer6.equals(xYAreaRenderer18) ? xYAreaRenderer6.hashCode() == xYAreaRenderer18.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test085");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = xYAreaRenderer1.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator5 = null;
        xYAreaRenderer1.setBaseItemLabelGenerator(xYItemLabelGenerator5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot10 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis9);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer12 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer12.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator15 = null;
        xYAreaRenderer12.setLegendItemURLGenerator(xYSeriesLabelGenerator15);
        xYAreaRenderer12.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean23 = xYAreaRenderer12.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot10.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer12);
        combinedDomainXYPlot10.clearDomainMarkers();
        java.awt.Font font27 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint28 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer31 = null;
        org.jfree.chart.text.TextBlock textBlock32 = org.jfree.chart.text.TextUtilities.createTextBlock("", font27, paint28, (float) (-1L), (int) (short) -1, textMeasurer31);
        combinedDomainXYPlot10.setDomainCrosshairPaint(paint28);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder34 = combinedDomainXYPlot10.getSeriesRenderingOrder();
        combinedDomainXYPlot10.clearDomainMarkers();
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone37 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection38 = new org.jfree.data.time.TimeSeriesCollection(timeZone37);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer40 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement36, (org.jfree.data.general.Dataset) timeSeriesCollection38, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState41 = timeSeriesCollection38.getSelectionState();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        org.jfree.chart.renderer.xy.XYItemRendererState xYItemRendererState43 = xYAreaRenderer1.initialise(graphics2D7, rectangle2D8, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot10, (org.jfree.data.xy.XYDataset) timeSeriesCollection38, plotRenderingInfo42);
        org.jfree.chart.entity.EntityCollection entityCollection44 = xYItemRendererState43.getEntityCollection();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer12", xYAreaRenderer1.equals(xYAreaRenderer12) ? xYAreaRenderer1.hashCode() == xYAreaRenderer12.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test086");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.entity.EntityCollection entityCollection25 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = new org.jfree.chart.ChartRenderingInfo(entityCollection25);
        java.awt.Paint paint27 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean28 = chartRenderingInfo26.equals((java.lang.Object) paint27);
        java.awt.geom.Rectangle2D rectangle2D29 = chartRenderingInfo26.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = chartRenderingInfo26.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo31 = plotRenderingInfo30.getOwner();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo31);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot34 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis33);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer36 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer36.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator39 = null;
        xYAreaRenderer36.setLegendItemURLGenerator(xYSeriesLabelGenerator39);
        xYAreaRenderer36.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean47 = xYAreaRenderer36.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot34.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer36);
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        int int50 = combinedDomainXYPlot34.getRangeAxisIndex(valueAxis49);
        boolean boolean51 = combinedDomainXYPlot34.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        double double53 = rectangleInsets52.getLeft();
        double double55 = rectangleInsets52.calculateLeftOutset((double) 0L);
        combinedDomainXYPlot34.setAxisOffset(rectangleInsets52);
        combinedDomainXYPlot34.setDomainGridlinesVisible(false);
        java.awt.Paint paint59 = combinedDomainXYPlot34.getNoDataMessagePaint();
        boolean boolean60 = combinedDomainXYPlot34.canSelectByPoint();
        java.awt.Color color65 = org.jfree.chart.ChartColor.VERY_DARK_RED;
        org.jfree.chart.block.BlockBorder blockBorder66 = new org.jfree.chart.block.BlockBorder(0.025d, (double) 2, (double) 9, (double) 1L, (java.awt.Paint) color65);
        combinedDomainXYPlot34.setRangeZeroBaselinePaint((java.awt.Paint) color65);
        org.jfree.chart.entity.EntityCollection entityCollection69 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo70 = new org.jfree.chart.ChartRenderingInfo(entityCollection69);
        java.awt.Paint paint71 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean72 = chartRenderingInfo70.equals((java.lang.Object) paint71);
        java.awt.geom.Rectangle2D rectangle2D73 = chartRenderingInfo70.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo74 = chartRenderingInfo70.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo75 = plotRenderingInfo74.getOwner();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo76 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo75);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot77 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke78 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot77.setRangeCrosshairStroke(stroke78);
        java.awt.geom.Point2D point2D80 = combinedRangeXYPlot77.getQuadrantOrigin();
        combinedDomainXYPlot34.zoomRangeAxes(0.0d, plotRenderingInfo76, point2D80);
        org.jfree.chart.plot.XYPlot xYPlot82 = combinedDomainXYPlot1.findSubplot(plotRenderingInfo32, point2D80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo26 and chartRenderingInfo70", chartRenderingInfo26.equals(chartRenderingInfo70) ? chartRenderingInfo26.hashCode() == chartRenderingInfo70.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test087");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list1 = combinedRangeXYPlot0.getSubplots();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot3 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.entity.EntityCollection entityCollection5 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo6 = new org.jfree.chart.ChartRenderingInfo(entityCollection5);
        java.awt.Paint paint7 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean8 = chartRenderingInfo6.equals((java.lang.Object) paint7);
        java.awt.geom.Rectangle2D rectangle2D9 = chartRenderingInfo6.getChartArea();
        java.util.List list10 = null;
        combinedDomainXYPlot3.drawDomainGridlines(graphics2D4, rectangle2D9, list10);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer13 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer13.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator16 = null;
        xYAreaRenderer13.setLegendItemURLGenerator(xYSeriesLabelGenerator16);
        xYAreaRenderer13.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean22 = xYAreaRenderer13.isSeriesVisible((-16777216));
        java.awt.Shape shape24 = xYAreaRenderer13.getLegendShape(0);
        java.awt.Shape shape26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        xYAreaRenderer13.setSeriesShape((int) (byte) 100, shape26, false);
        java.awt.Paint paint30 = xYAreaRenderer13.getSeriesItemLabelPaint(5);
        combinedDomainXYPlot3.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer13);
        int int32 = combinedRangeXYPlot0.getIndexOf((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer13);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer34 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer34.clearSeriesStrokes(false);
        java.awt.Font font38 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint39 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer42 = null;
        org.jfree.chart.text.TextBlock textBlock43 = org.jfree.chart.text.TextUtilities.createTextBlock("", font38, paint39, (float) (-1L), (int) (short) -1, textMeasurer42);
        xYAreaRenderer34.setBaseLegendTextFont(font38);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator48 = xYAreaRenderer34.getURLGenerator((int) '4', (int) (byte) 0, false);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer50 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer50.clearSeriesStrokes(false);
        boolean boolean53 = xYAreaRenderer50.getPlotLines();
        java.awt.Stroke stroke55 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYAreaRenderer50.setSeriesStroke((int) (short) 1, stroke55, true);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator58 = xYAreaRenderer50.getLegendItemLabelGenerator();
        xYAreaRenderer34.setLegendItemURLGenerator(xYSeriesLabelGenerator58);
        xYAreaRenderer13.setLegendItemToolTipGenerator(xYSeriesLabelGenerator58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer34 and xYAreaRenderer50", xYAreaRenderer34.equals(xYAreaRenderer50) ? xYAreaRenderer34.hashCode() == xYAreaRenderer50.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test088");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone1 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection2 = new org.jfree.data.time.TimeSeriesCollection(timeZone1);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer4 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement0, (org.jfree.data.general.Dataset) timeSeriesCollection2, (java.lang.Comparable) (byte) 10);
        java.lang.Comparable comparable5 = null;
        int int6 = timeSeriesCollection2.indexOf(comparable5);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot8 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis7);
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.entity.EntityCollection entityCollection10 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo11 = new org.jfree.chart.ChartRenderingInfo(entityCollection10);
        java.awt.Paint paint12 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean13 = chartRenderingInfo11.equals((java.lang.Object) paint12);
        java.awt.geom.Rectangle2D rectangle2D14 = chartRenderingInfo11.getChartArea();
        java.util.List list15 = null;
        combinedDomainXYPlot8.drawDomainGridlines(graphics2D9, rectangle2D14, list15);
        org.jfree.chart.axis.NumberAxis numberAxis18 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity21 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D14, (org.jfree.chart.axis.Axis) numberAxis18, "", "DatasetRenderingOrder.FORWARD");
        numberAxis18.centerRange(10.0d);
        org.jfree.chart.axis.NumberAxis numberAxis25 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis25.pan((double) 1);
        numberAxis25.setTickLabelsVisible(false);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer31 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean33 = xYAreaRenderer31.isSeriesItemLabelsVisible((int) (byte) 1);
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot((org.jfree.data.xy.XYDataset) timeSeriesCollection2, (org.jfree.chart.axis.ValueAxis) numberAxis18, (org.jfree.chart.axis.ValueAxis) numberAxis25, (org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer31);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer36 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer36.clearSeriesStrokes(false);
        boolean boolean39 = xYAreaRenderer36.getPlotLines();
        java.awt.Stroke stroke41 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYAreaRenderer36.setSeriesStroke((int) (short) 1, stroke41, true);
        numberAxis18.setTickMarkStroke(stroke41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer31 and xYAreaRenderer36", xYAreaRenderer31.equals(xYAreaRenderer36) ? xYAreaRenderer31.hashCode() == xYAreaRenderer36.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test089");
        org.jfree.chart.entity.EntityCollection entityCollection0 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo1 = new org.jfree.chart.ChartRenderingInfo(entityCollection0);
        java.awt.Paint paint2 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean3 = chartRenderingInfo1.equals((java.lang.Object) paint2);
        java.awt.geom.Rectangle2D rectangle2D4 = chartRenderingInfo1.getChartArea();
        org.jfree.chart.title.TextTitle textTitle6 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity7 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D4, (org.jfree.chart.title.Title) textTitle6);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D9 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D4, rectangleAnchor8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity16 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D4, pieDataset10, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot18 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis17);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer20 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer20.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator23 = null;
        xYAreaRenderer20.setLegendItemURLGenerator(xYSeriesLabelGenerator23);
        xYAreaRenderer20.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean31 = xYAreaRenderer20.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot18.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer20);
        combinedDomainXYPlot18.clearDomainMarkers();
        java.awt.Font font35 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint36 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer39 = null;
        org.jfree.chart.text.TextBlock textBlock40 = org.jfree.chart.text.TextUtilities.createTextBlock("", font35, paint36, (float) (-1L), (int) (short) -1, textMeasurer39);
        combinedDomainXYPlot18.setDomainCrosshairPaint(paint36);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder42 = combinedDomainXYPlot18.getSeriesRenderingOrder();
        java.awt.Paint paint43 = org.jfree.chart.plot.PolarPlot.DEFAULT_GRIDLINE_PAINT;
        combinedDomainXYPlot18.setRangeTickBandPaint(paint43);
        org.jfree.chart.title.LegendGraphic legendGraphic45 = new org.jfree.chart.title.LegendGraphic((java.awt.Shape) rectangle2D4, paint43);
        java.awt.Paint paint46 = legendGraphic45.getOutlinePaint();
        legendGraphic45.setShapeOutlineVisible(false);
        boolean boolean49 = legendGraphic45.isShapeOutlineVisible();
        java.awt.Stroke stroke50 = legendGraphic45.getLineStroke();
        org.jfree.chart.util.PaintList paintList51 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.axis.ValueAxis valueAxis52 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot53 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis52);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer55 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer55.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator58 = null;
        xYAreaRenderer55.setLegendItemURLGenerator(xYSeriesLabelGenerator58);
        xYAreaRenderer55.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean66 = xYAreaRenderer55.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot53.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer55);
        combinedDomainXYPlot53.clearDomainMarkers();
        java.awt.Font font70 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint71 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer74 = null;
        org.jfree.chart.text.TextBlock textBlock75 = org.jfree.chart.text.TextUtilities.createTextBlock("", font70, paint71, (float) (-1L), (int) (short) -1, textMeasurer74);
        combinedDomainXYPlot53.setDomainCrosshairPaint(paint71);
        boolean boolean77 = paintList51.equals((java.lang.Object) paint71);
        legendGraphic45.setOutlinePaint(paint71);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on paintList51 and chartRenderingInfo1.", paintList51.equals(chartRenderingInfo1) == chartRenderingInfo1.equals(paintList51));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test090");
        org.jfree.chart.plot.RingPlot ringPlot0 = new org.jfree.chart.plot.RingPlot();
        ringPlot0.setSectionDepth(0.08d);
        java.awt.Stroke stroke3 = ringPlot0.getLabelLinkStroke();
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer6 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer6.clearSeriesStrokes(false);
        boolean boolean9 = xYAreaRenderer6.getPlotLines();
        org.jfree.chart.title.LegendTitle legendTitle10 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource) xYAreaRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str12 = rectangleEdge11.toString();
        legendTitle10.setLegendItemGraphicEdge(rectangleEdge11);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        double double15 = rectangleInsets14.getLeft();
        double double17 = rectangleInsets14.calculateLeftOutset((double) 0L);
        legendTitle10.setLegendItemGraphicPadding(rectangleInsets14);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = legendTitle10.getLegendItemGraphicPadding();
        org.jfree.chart.title.TextTitle textTitle21 = new org.jfree.chart.title.TextTitle("");
        boolean boolean22 = textTitle21.getExpandToFitSpace();
        textTitle21.setText("");
        java.lang.String str25 = textTitle21.getID();
        java.awt.Font font26 = textTitle21.getFont();
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.entity.EntityCollection entityCollection28 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo29 = new org.jfree.chart.ChartRenderingInfo(entityCollection28);
        java.awt.Paint paint30 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean31 = chartRenderingInfo29.equals((java.lang.Object) paint30);
        java.awt.geom.Rectangle2D rectangle2D32 = chartRenderingInfo29.getChartArea();
        textTitle21.draw(graphics2D27, rectangle2D32);
        legendTitle10.setBounds(rectangle2D32);
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup36 = piePlot35.getDatasetGroup();
        int int37 = piePlot35.getBackgroundImageAlignment();
        boolean boolean38 = piePlot35.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        piePlot35.createAndAddEntity(rectangle2D39, plotRenderingInfo40, "hi!", "LGPL");
        java.awt.Paint paint44 = piePlot35.getLabelPaint();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot46 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list47 = combinedRangeXYPlot46.getSubplots();
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot49 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis48);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer51 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer51.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator54 = null;
        xYAreaRenderer51.setLegendItemURLGenerator(xYSeriesLabelGenerator54);
        xYAreaRenderer51.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean62 = xYAreaRenderer51.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot49.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer51);
        combinedDomainXYPlot49.clearDomainMarkers();
        java.awt.Font font66 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint67 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer70 = null;
        org.jfree.chart.text.TextBlock textBlock71 = org.jfree.chart.text.TextUtilities.createTextBlock("", font66, paint67, (float) (-1L), (int) (short) -1, textMeasurer70);
        combinedDomainXYPlot49.setDomainCrosshairPaint(paint67);
        org.jfree.chart.plot.PiePlot piePlot73 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup74 = piePlot73.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener75 = null;
        piePlot73.addChangeListener(plotChangeListener75);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent77 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) piePlot73);
        combinedDomainXYPlot49.plotChanged(plotChangeEvent77);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType79 = plotChangeEvent77.getType();
        combinedRangeXYPlot46.plotChanged(plotChangeEvent77);
        org.jfree.chart.plot.IntervalMarker intervalMarker83 = new org.jfree.chart.plot.IntervalMarker((double) (short) 100, (double) 10);
        boolean boolean84 = combinedRangeXYPlot46.removeRangeMarker((org.jfree.chart.plot.Marker) intervalMarker83);
        combinedRangeXYPlot46.configureRangeAxes();
        org.jfree.chart.util.RectangleInsets rectangleInsets86 = combinedRangeXYPlot46.getAxisOffset();
        org.jfree.chart.entity.EntityCollection entityCollection89 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo90 = new org.jfree.chart.ChartRenderingInfo(entityCollection89);
        java.awt.Paint paint91 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean92 = chartRenderingInfo90.equals((java.lang.Object) paint91);
        java.awt.geom.Rectangle2D rectangle2D93 = chartRenderingInfo90.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo94 = chartRenderingInfo90.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo95 = plotRenderingInfo94.getOwner();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo96 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo95);
        combinedRangeXYPlot46.handleClick((int) '#', 3, plotRenderingInfo96);
        org.jfree.chart.plot.PiePlotState piePlotState98 = ringPlot0.initialise(graphics2D4, rectangle2D32, piePlot35, (java.lang.Integer) 128, plotRenderingInfo96);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer6 and xYAreaRenderer51", xYAreaRenderer6.equals(xYAreaRenderer51) ? xYAreaRenderer6.hashCode() == xYAreaRenderer51.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test091");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list1 = combinedRangeXYPlot0.getSubplots();
        java.awt.Color color4 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer6 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean8 = xYAreaRenderer6.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint9 = xYAreaRenderer6.getBaseLegendTextPaint();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer6.setSeriesOutlineStroke(0, stroke11, false);
        java.awt.Color color16 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer18 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean20 = xYAreaRenderer18.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint21 = xYAreaRenderer18.getBaseLegendTextPaint();
        java.awt.Stroke stroke23 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer18.setSeriesOutlineStroke(0, stroke23, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker27 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color4, stroke11, (java.awt.Paint) color16, stroke23, (float) (byte) 1);
        java.awt.Stroke stroke28 = intervalMarker27.getStroke();
        java.awt.Color color31 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer33 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean35 = xYAreaRenderer33.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint36 = xYAreaRenderer33.getBaseLegendTextPaint();
        java.awt.Stroke stroke38 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer33.setSeriesOutlineStroke(0, stroke38, false);
        java.awt.Color color43 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer45 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean47 = xYAreaRenderer45.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint48 = xYAreaRenderer45.getBaseLegendTextPaint();
        java.awt.Stroke stroke50 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer45.setSeriesOutlineStroke(0, stroke50, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker54 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color31, stroke38, (java.awt.Paint) color43, stroke50, (float) (byte) 1);
        intervalMarker27.setStroke(stroke50);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType56 = intervalMarker27.getLabelOffsetType();
        org.jfree.chart.plot.CategoryPlot categoryPlot57 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot57.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent59 = null;
        categoryPlot57.rendererChanged(rendererChangeEvent59);
        double double61 = categoryPlot57.getAnchorValue();
        org.jfree.chart.plot.CategoryPlot categoryPlot63 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer65 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection66 = categoryPlot63.getRangeMarkers(7, layer65);
        java.lang.Object obj67 = null;
        boolean boolean68 = layer65.equals(obj67);
        java.util.Collection collection69 = categoryPlot57.getDomainMarkers((int) (short) 1, layer65);
        boolean boolean70 = combinedRangeXYPlot0.removeDomainMarker((org.jfree.chart.plot.Marker) intervalMarker27, layer65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot57 and categoryPlot63", categoryPlot57.equals(categoryPlot63) ? categoryPlot57.hashCode() == categoryPlot63.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test092");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder25 = combinedDomainXYPlot1.getSeriesRenderingOrder();
        combinedDomainXYPlot1.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        int int28 = categoryPlot27.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge32 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str33 = rectangleEdge32.toString();
        double double34 = categoryPlot27.getRectX((double) '4', (double) 'a', (double) 'a', rectangleEdge32);
        boolean boolean35 = categoryPlot27.isRangeZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = categoryPlot27.getDomainAxis(10);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer39 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer39.clearSeriesStrokes(false);
        boolean boolean42 = xYAreaRenderer39.getPlotLines();
        java.awt.Stroke stroke44 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYAreaRenderer39.setSeriesStroke((int) (short) 1, stroke44, true);
        categoryPlot27.setDomainCrosshairStroke(stroke44);
        combinedDomainXYPlot1.setRangeGridlineStroke(stroke44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer39", xYAreaRenderer3.equals(xYAreaRenderer39) ? xYAreaRenderer3.hashCode() == xYAreaRenderer39.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test093");
        org.jfree.chart.axis.NumberAxis3D numberAxis3D1 = new org.jfree.chart.axis.NumberAxis3D("RectangleAnchor.BOTTOM_RIGHT");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot3 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.axis.NumberAxis numberAxis6 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis6.pan((double) 1);
        numberAxis6.setTickLabelsVisible(false);
        combinedDomainXYPlot3.setRangeAxis(255, (org.jfree.chart.axis.ValueAxis) numberAxis6);
        java.awt.geom.GeneralPath generalPath12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        int int14 = categoryPlot13.getDatasetCount();
        categoryPlot13.setAnchorValue((double) 10.0f);
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.entity.EntityCollection entityCollection18 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = new org.jfree.chart.ChartRenderingInfo(entityCollection18);
        java.awt.Paint paint20 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean21 = chartRenderingInfo19.equals((java.lang.Object) paint20);
        java.awt.geom.Rectangle2D rectangle2D22 = chartRenderingInfo19.getChartArea();
        org.jfree.chart.title.TextTitle textTitle24 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity25 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D22, (org.jfree.chart.title.Title) textTitle24);
        org.jfree.chart.axis.AxisSpace axisSpace26 = categoryPlot13.calculateAxisSpace(graphics2D17, rectangle2D22);
        org.jfree.chart.RenderingSource renderingSource27 = null;
        combinedDomainXYPlot3.select(generalPath12, rectangle2D22, renderingSource27);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot30 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis29);
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.entity.EntityCollection entityCollection32 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo33 = new org.jfree.chart.ChartRenderingInfo(entityCollection32);
        java.awt.Paint paint34 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean35 = chartRenderingInfo33.equals((java.lang.Object) paint34);
        java.awt.geom.Rectangle2D rectangle2D36 = chartRenderingInfo33.getChartArea();
        java.util.List list37 = null;
        combinedDomainXYPlot30.drawDomainGridlines(graphics2D31, rectangle2D36, list37);
        combinedDomainXYPlot30.clearSelection();
        org.jfree.chart.util.RectangleEdge rectangleEdge41 = combinedDomainXYPlot30.getRangeAxisEdge(15);
        double double42 = numberAxis3D1.valueToJava2D((double) 6, rectangle2D22, rectangleEdge41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo19 and chartRenderingInfo33", chartRenderingInfo19.equals(chartRenderingInfo33) ? chartRenderingInfo19.hashCode() == chartRenderingInfo33.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test094");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = xYAreaRenderer1.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator5 = null;
        xYAreaRenderer1.setBaseItemLabelGenerator(xYItemLabelGenerator5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot10 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis9);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer12 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer12.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator15 = null;
        xYAreaRenderer12.setLegendItemURLGenerator(xYSeriesLabelGenerator15);
        xYAreaRenderer12.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean23 = xYAreaRenderer12.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot10.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer12);
        combinedDomainXYPlot10.clearDomainMarkers();
        java.awt.Font font27 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint28 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer31 = null;
        org.jfree.chart.text.TextBlock textBlock32 = org.jfree.chart.text.TextUtilities.createTextBlock("", font27, paint28, (float) (-1L), (int) (short) -1, textMeasurer31);
        combinedDomainXYPlot10.setDomainCrosshairPaint(paint28);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder34 = combinedDomainXYPlot10.getSeriesRenderingOrder();
        combinedDomainXYPlot10.clearDomainMarkers();
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone37 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection38 = new org.jfree.data.time.TimeSeriesCollection(timeZone37);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer40 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement36, (org.jfree.data.general.Dataset) timeSeriesCollection38, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState41 = timeSeriesCollection38.getSelectionState();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        org.jfree.chart.renderer.xy.XYItemRendererState xYItemRendererState43 = xYAreaRenderer1.initialise(graphics2D7, rectangle2D8, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot10, (org.jfree.data.xy.XYDataset) timeSeriesCollection38, plotRenderingInfo42);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 5);
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection46 = new org.jfree.data.time.TimeSeriesCollection(timeSeries45);
        java.util.TimeZone timeZone47 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection48 = new org.jfree.data.time.TimeSeriesCollection(timeZone47);
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot49.clearAnnotations();
        timeSeriesCollection48.removeChangeListener((org.jfree.data.general.DatasetChangeListener) categoryPlot49);
        org.jfree.data.general.DatasetGroup datasetGroup52 = timeSeriesCollection48.getGroup();
        timeSeries45.removeChangeListener((org.jfree.data.general.SeriesChangeListener) timeSeriesCollection48);
        xYItemRendererState43.setSelectionState((org.jfree.data.xy.XYDatasetSelectionState) timeSeriesCollection48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer12", xYAreaRenderer1.equals(xYAreaRenderer12) ? xYAreaRenderer1.hashCode() == xYAreaRenderer12.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test095");
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Font font1 = polarPlot0.getAngleLabelFont();
        org.jfree.chart.axis.ValueAxis valueAxis2 = polarPlot0.getAxis();
        org.jfree.chart.entity.EntityCollection entityCollection4 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo5 = new org.jfree.chart.ChartRenderingInfo(entityCollection4);
        java.awt.Paint paint6 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean7 = chartRenderingInfo5.equals((java.lang.Object) paint6);
        java.awt.geom.Rectangle2D rectangle2D8 = chartRenderingInfo5.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = chartRenderingInfo5.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo10 = plotRenderingInfo9.getOwner();
        java.awt.geom.Point2D point2D11 = null;
        polarPlot0.zoomDomainAxes((double) (byte) 1, plotRenderingInfo9, point2D11, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent16 = null;
        categoryPlot14.rendererChanged(rendererChangeEvent16);
        org.jfree.chart.entity.EntityCollection entityCollection19 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = new org.jfree.chart.ChartRenderingInfo(entityCollection19);
        java.awt.Paint paint21 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean22 = chartRenderingInfo20.equals((java.lang.Object) paint21);
        java.awt.geom.Rectangle2D rectangle2D23 = chartRenderingInfo20.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = chartRenderingInfo20.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = plotRenderingInfo24.getOwner();
        java.awt.geom.Point2D point2D26 = null;
        categoryPlot14.zoomRangeAxes(1.0E-8d, plotRenderingInfo24, point2D26, true);
        plotRenderingInfo9.addSubplotInfo(plotRenderingInfo24);
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot30 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        int int31 = combinedDomainXYPlot30.getBackgroundImageAlignment();
        org.jfree.chart.entity.EntityCollection entityCollection32 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo33 = new org.jfree.chart.ChartRenderingInfo(entityCollection32);
        java.awt.Paint paint34 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean35 = chartRenderingInfo33.equals((java.lang.Object) paint34);
        java.awt.geom.Rectangle2D rectangle2D36 = chartRenderingInfo33.getChartArea();
        org.jfree.chart.title.TextTitle textTitle38 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity39 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D36, (org.jfree.chart.title.Title) textTitle38);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D41 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D36, rectangleAnchor40);
        combinedDomainXYPlot30.setQuadrantOrigin(point2D41);
        int int43 = plotRenderingInfo24.getSubplotIndex(point2D41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo20 and chartRenderingInfo33", chartRenderingInfo20.equals(chartRenderingInfo33) ? chartRenderingInfo20.hashCode() == chartRenderingInfo33.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test096");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.lang.Object obj1 = combinedRangeXYPlot0.clone();
        double double2 = combinedRangeXYPlot0.getGap();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer4 = combinedRangeXYPlot0.getRenderer(4);
        combinedRangeXYPlot0.clearRangeMarkers((int) 'a');
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent10 = null;
        categoryPlot8.rendererChanged(rendererChangeEvent10);
        org.jfree.chart.entity.EntityCollection entityCollection13 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = new org.jfree.chart.ChartRenderingInfo(entityCollection13);
        java.awt.Paint paint15 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean16 = chartRenderingInfo14.equals((java.lang.Object) paint15);
        java.awt.geom.Rectangle2D rectangle2D17 = chartRenderingInfo14.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = chartRenderingInfo14.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = plotRenderingInfo18.getOwner();
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot8.zoomRangeAxes(1.0E-8d, plotRenderingInfo18, point2D20, true);
        java.awt.geom.Rectangle2D rectangle2D23 = plotRenderingInfo18.getDataArea();
        org.jfree.chart.entity.EntityCollection entityCollection26 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo27 = new org.jfree.chart.ChartRenderingInfo(entityCollection26);
        java.awt.Paint paint28 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean29 = chartRenderingInfo27.equals((java.lang.Object) paint28);
        java.awt.geom.Rectangle2D rectangle2D30 = chartRenderingInfo27.getChartArea();
        org.jfree.chart.title.TextTitle textTitle32 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity33 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D30, (org.jfree.chart.title.Title) textTitle32);
        java.awt.geom.Point2D point2D34 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(45.0d, (double) (byte) 1, rectangle2D30);
        combinedRangeXYPlot0.zoomRangeAxes((double) 1L, plotRenderingInfo18, point2D34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo14 and chartRenderingInfo27", chartRenderingInfo14.equals(chartRenderingInfo27) ? chartRenderingInfo14.hashCode() == chartRenderingInfo27.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test097");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.entity.EntityCollection entityCollection27 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo28 = new org.jfree.chart.ChartRenderingInfo(entityCollection27);
        java.awt.Paint paint29 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean30 = chartRenderingInfo28.equals((java.lang.Object) paint29);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = chartRenderingInfo28.getPlotInfo();
        combinedDomainXYPlot1.handleClick(255, 2, plotRenderingInfo31);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer34 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer34.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator37 = null;
        xYAreaRenderer34.setLegendItemURLGenerator(xYSeriesLabelGenerator37);
        xYAreaRenderer34.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean43 = xYAreaRenderer34.isSeriesVisible((-16777216));
        java.awt.Shape shape44 = xYAreaRenderer34.getBaseShape();
        org.jfree.chart.entity.EntityCollection entityCollection45 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo46 = new org.jfree.chart.ChartRenderingInfo(entityCollection45);
        java.awt.Paint paint47 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean48 = chartRenderingInfo46.equals((java.lang.Object) paint47);
        java.awt.geom.Rectangle2D rectangle2D49 = chartRenderingInfo46.getChartArea();
        org.jfree.chart.title.TextTitle textTitle51 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity52 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D49, (org.jfree.chart.title.Title) textTitle51);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor53 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D54 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D49, rectangleAnchor53);
        org.jfree.data.general.PieDataset pieDataset55 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity61 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D49, pieDataset55, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        xYAreaRenderer34.setBaseShape((java.awt.Shape) rectangle2D49);
        plotRenderingInfo31.setDataArea(rectangle2D49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo28 and chartRenderingInfo46", chartRenderingInfo28.equals(chartRenderingInfo46) ? chartRenderingInfo28.hashCode() == chartRenderingInfo46.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test098");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        boolean boolean16 = combinedDomainXYPlot1.canSelectByPoint();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer19 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer19.clearSeriesStrokes(false);
        boolean boolean22 = xYAreaRenderer19.getPlotLines();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYAreaRenderer19.setSeriesStroke((int) (short) 1, stroke24, true);
        combinedDomainXYPlot1.setRenderer(1, (org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer19, true);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.chart.util.Layer layer32 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedDomainXYPlot1.drawRangeMarkers(graphics2D29, rectangle2D30, (-9999), layer32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer19", xYAreaRenderer3.equals(xYAreaRenderer19) ? xYAreaRenderer3.hashCode() == xYAreaRenderer19.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test099");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Color color2 = org.jfree.chart.ChartColor.DARK_BLUE;
        combinedDomainXYPlot1.setRangeMinorGridlinePaint((java.awt.Paint) color2);
        boolean boolean4 = combinedDomainXYPlot1.isDomainPannable();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot6 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis5);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer8 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer8.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator11 = null;
        xYAreaRenderer8.setLegendItemURLGenerator(xYSeriesLabelGenerator11);
        xYAreaRenderer8.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean19 = xYAreaRenderer8.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot6.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer8);
        combinedDomainXYPlot6.clearDomainMarkers();
        java.awt.Font font23 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint24 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer27 = null;
        org.jfree.chart.text.TextBlock textBlock28 = org.jfree.chart.text.TextUtilities.createTextBlock("", font23, paint24, (float) (-1L), (int) (short) -1, textMeasurer27);
        combinedDomainXYPlot6.setDomainCrosshairPaint(paint24);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder30 = combinedDomainXYPlot6.getSeriesRenderingOrder();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer32 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer32.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator35 = null;
        xYAreaRenderer32.setLegendItemURLGenerator(xYSeriesLabelGenerator35);
        xYAreaRenderer32.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) false);
        xYAreaRenderer32.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator43 = null;
        xYAreaRenderer32.setSeriesURLGenerator((int) (short) 100, xYURLGenerator43, false);
        java.awt.Paint paint49 = xYAreaRenderer32.getItemFillPaint((int) (short) 10, (int) 'a', true);
        boolean boolean50 = seriesRenderingOrder30.equals((java.lang.Object) xYAreaRenderer32);
        combinedDomainXYPlot1.setSeriesRenderingOrder(seriesRenderingOrder30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer8 and xYAreaRenderer32", xYAreaRenderer8.equals(xYAreaRenderer32) ? xYAreaRenderer8.hashCode() == xYAreaRenderer32.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test100");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.ui.ProjectInfo projectInfo25 = org.jfree.chart.JFreeChart.INFO;
        org.jfree.chart.ui.Library[] libraryArray26 = projectInfo25.getOptionalLibraries();
        org.jfree.chart.axis.SegmentedTimeline segmentedTimeline27 = org.jfree.chart.axis.SegmentedTimeline.newMondayThroughFridayTimeline();
        boolean boolean30 = segmentedTimeline27.containsDomainRange((long) 1, (long) (byte) 10);
        long long32 = segmentedTimeline27.toTimelineValue((long) '#');
        java.util.List list33 = segmentedTimeline27.getExceptionSegments();
        projectInfo25.setContributors(list33);
        java.awt.Image image35 = projectInfo25.getLogo();
        combinedDomainXYPlot1.setBackgroundImage(image35);
        boolean boolean37 = combinedDomainXYPlot1.isDomainZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot39 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis38);
        java.awt.Graphics2D graphics2D40 = null;
        org.jfree.chart.entity.EntityCollection entityCollection41 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo42 = new org.jfree.chart.ChartRenderingInfo(entityCollection41);
        java.awt.Paint paint43 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean44 = chartRenderingInfo42.equals((java.lang.Object) paint43);
        java.awt.geom.Rectangle2D rectangle2D45 = chartRenderingInfo42.getChartArea();
        java.util.List list46 = null;
        combinedDomainXYPlot39.drawDomainGridlines(graphics2D40, rectangle2D45, list46);
        org.jfree.chart.axis.NumberAxis numberAxis49 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity52 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D45, (org.jfree.chart.axis.Axis) numberAxis49, "", "DatasetRenderingOrder.FORWARD");
        numberAxis49.setMinorTickMarkInsideLength((float) 60000L);
        java.text.NumberFormat numberFormat55 = numberAxis49.getNumberFormatOverride();
        org.jfree.chart.block.BorderArrangement borderArrangement56 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer57 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement56);
        blockContainer57.clear();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer60 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer60.clearSeriesStrokes(false);
        boolean boolean63 = xYAreaRenderer60.getPlotLines();
        boolean boolean64 = xYAreaRenderer60.getBaseItemLabelsVisible();
        java.awt.Paint paint65 = xYAreaRenderer60.getBasePaint();
        boolean boolean66 = blockContainer57.equals((java.lang.Object) paint65);
        org.jfree.chart.util.RectangleInsets rectangleInsets67 = blockContainer57.getMargin();
        double double68 = rectangleInsets67.getLeft();
        numberAxis49.setTickLabelInsets(rectangleInsets67);
        combinedDomainXYPlot1.setInsets(rectangleInsets67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer60", xYAreaRenderer3.equals(xYAreaRenderer60) ? xYAreaRenderer3.hashCode() == xYAreaRenderer60.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test101");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint4 = xYAreaRenderer1.getBaseLegendTextPaint();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer1.setSeriesOutlineStroke(0, stroke6, false);
        org.jfree.chart.LegendItem legendItem11 = xYAreaRenderer1.getLegendItem(8, (int) (byte) 10);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot14 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis13);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer16.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator19 = null;
        xYAreaRenderer16.setLegendItemURLGenerator(xYSeriesLabelGenerator19);
        xYAreaRenderer16.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean27 = xYAreaRenderer16.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot14.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer16);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        int int30 = combinedDomainXYPlot14.getRangeAxisIndex(valueAxis29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        combinedDomainXYPlot14.setDomainAxis(valueAxis31);
        combinedDomainXYPlot14.clearRangeMarkers();
        org.jfree.data.time.Year year36 = new org.jfree.data.time.Year((int) (short) 0);
        long long37 = year36.getFirstMillisecond();
        org.jfree.data.time.Year year39 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.chart.axis.PeriodAxis periodAxis40 = new org.jfree.chart.axis.PeriodAxis("RectangleEdge.RIGHT", (org.jfree.data.time.RegularTimePeriod) year36, (org.jfree.data.time.RegularTimePeriod) year39);
        org.jfree.data.time.Year year43 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year45 = new org.jfree.data.time.Year((int) (short) 0);
        long long46 = year45.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis47 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year43, (org.jfree.data.time.RegularTimePeriod) year45);
        periodAxis40.setLast((org.jfree.data.time.RegularTimePeriod) year45);
        java.awt.Stroke stroke49 = periodAxis40.getMinorTickMarkStroke();
        java.lang.Class class50 = periodAxis40.getMajorTickTimePeriodClass();
        org.jfree.chart.plot.Marker marker51 = null;
        org.jfree.chart.entity.EntityCollection entityCollection52 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo53 = new org.jfree.chart.ChartRenderingInfo(entityCollection52);
        java.awt.Paint paint54 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean55 = chartRenderingInfo53.equals((java.lang.Object) paint54);
        java.awt.geom.Rectangle2D rectangle2D56 = chartRenderingInfo53.getChartArea();
        org.jfree.chart.title.TextTitle textTitle58 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity59 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D56, (org.jfree.chart.title.Title) textTitle58);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor60 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D61 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D56, rectangleAnchor60);
        xYAreaRenderer1.drawDomainMarker(graphics2D12, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot14, (org.jfree.chart.axis.ValueAxis) periodAxis40, marker51, rectangle2D56);
        org.jfree.data.time.Year year65 = new org.jfree.data.time.Year((int) (short) 0);
        long long66 = year65.getFirstMillisecond();
        org.jfree.data.time.Year year68 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.chart.axis.PeriodAxis periodAxis69 = new org.jfree.chart.axis.PeriodAxis("RectangleEdge.RIGHT", (org.jfree.data.time.RegularTimePeriod) year65, (org.jfree.data.time.RegularTimePeriod) year68);
        org.jfree.data.time.Year year72 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year74 = new org.jfree.data.time.Year((int) (short) 0);
        long long75 = year74.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis76 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year72, (org.jfree.data.time.RegularTimePeriod) year74);
        periodAxis69.setLast((org.jfree.data.time.RegularTimePeriod) year74);
        java.lang.Class class78 = periodAxis69.getAutoRangeTimePeriodClass();
        org.jfree.chart.entity.AxisEntity axisEntity81 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D56, (org.jfree.chart.axis.Axis) periodAxis69, "DateTickMarkPosition.MIDDLE", "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer16", xYAreaRenderer1.equals(xYAreaRenderer16) ? xYAreaRenderer1.hashCode() == xYAreaRenderer16.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test102");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection1 = combinedRangeXYPlot0.getLegendItems();
        combinedRangeXYPlot0.setRangePannable(false);
        org.jfree.chart.renderer.xy.XYStepRenderer xYStepRenderer4 = new org.jfree.chart.renderer.xy.XYStepRenderer();
        java.lang.Boolean boolean6 = xYStepRenderer4.getSeriesLinesVisible(0);
        xYStepRenderer4.setUseOutlinePaint(true);
        combinedRangeXYPlot0.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYStepRenderer4);
        boolean boolean10 = xYStepRenderer4.getBaseShapesVisible();
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.entity.EntityCollection entityCollection12 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo13 = new org.jfree.chart.ChartRenderingInfo(entityCollection12);
        java.awt.Paint paint14 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean15 = chartRenderingInfo13.equals((java.lang.Object) paint14);
        java.awt.geom.Rectangle2D rectangle2D16 = chartRenderingInfo13.getChartArea();
        org.jfree.chart.title.TextTitle textTitle18 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity19 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D16, (org.jfree.chart.title.Title) textTitle18);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D21 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D16, rectangleAnchor20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot23 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis22);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer25 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer25.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator28 = null;
        xYAreaRenderer25.setLegendItemURLGenerator(xYSeriesLabelGenerator28);
        xYAreaRenderer25.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean36 = xYAreaRenderer25.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot23.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer25);
        boolean boolean38 = combinedDomainXYPlot23.canSelectByPoint();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer41 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer41.clearSeriesStrokes(false);
        boolean boolean44 = xYAreaRenderer41.getPlotLines();
        java.awt.Stroke stroke46 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYAreaRenderer41.setSeriesStroke((int) (short) 1, stroke46, true);
        combinedDomainXYPlot23.setRenderer(1, (org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer41, true);
        java.util.TimeZone timeZone51 = org.jfree.chart.axis.SegmentedTimeline.DEFAULT_TIME_ZONE;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection52 = new org.jfree.data.time.TimeSeriesCollection(timeZone51);
        java.lang.Number number53 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection52);
        org.jfree.data.xy.IntervalXYDelegate intervalXYDelegate54 = new org.jfree.data.xy.IntervalXYDelegate((org.jfree.data.xy.XYDataset) timeSeriesCollection52);
        org.jfree.data.general.WaferMapDataset waferMapDataset55 = null;
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer56 = null;
        org.jfree.chart.plot.WaferMapPlot waferMapPlot57 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset55, waferMapRenderer56);
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer58 = null;
        waferMapPlot57.setRenderer(waferMapRenderer58);
        timeSeriesCollection52.removeChangeListener((org.jfree.data.general.DatasetChangeListener) waferMapPlot57);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo61 = null;
        org.jfree.chart.renderer.xy.XYItemRendererState xYItemRendererState62 = xYStepRenderer4.initialise(graphics2D11, rectangle2D16, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot23, (org.jfree.data.xy.XYDataset) timeSeriesCollection52, plotRenderingInfo61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer25 and xYAreaRenderer41", xYAreaRenderer25.equals(xYAreaRenderer41) ? xYAreaRenderer25.hashCode() == xYAreaRenderer41.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test103");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list1 = combinedRangeXYPlot0.getSubplots();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot3 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.entity.EntityCollection entityCollection5 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo6 = new org.jfree.chart.ChartRenderingInfo(entityCollection5);
        java.awt.Paint paint7 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean8 = chartRenderingInfo6.equals((java.lang.Object) paint7);
        java.awt.geom.Rectangle2D rectangle2D9 = chartRenderingInfo6.getChartArea();
        java.util.List list10 = null;
        combinedDomainXYPlot3.drawDomainGridlines(graphics2D4, rectangle2D9, list10);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer13 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer13.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator16 = null;
        xYAreaRenderer13.setLegendItemURLGenerator(xYSeriesLabelGenerator16);
        xYAreaRenderer13.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean22 = xYAreaRenderer13.isSeriesVisible((-16777216));
        java.awt.Shape shape24 = xYAreaRenderer13.getLegendShape(0);
        java.awt.Shape shape26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        xYAreaRenderer13.setSeriesShape((int) (byte) 100, shape26, false);
        java.awt.Paint paint30 = xYAreaRenderer13.getSeriesItemLabelPaint(5);
        combinedDomainXYPlot3.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer13);
        int int32 = combinedRangeXYPlot0.getIndexOf((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer13);
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.data.time.Year year36 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year38 = new org.jfree.data.time.Year((int) (short) 0);
        long long39 = year38.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis40 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year36, (org.jfree.data.time.RegularTimePeriod) year38);
        java.lang.Object obj41 = periodAxis40.clone();
        org.jfree.data.time.Year year44 = new org.jfree.data.time.Year((int) (short) 0);
        long long45 = year44.getFirstMillisecond();
        org.jfree.data.time.Year year47 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.chart.axis.PeriodAxis periodAxis48 = new org.jfree.chart.axis.PeriodAxis("RectangleEdge.RIGHT", (org.jfree.data.time.RegularTimePeriod) year44, (org.jfree.data.time.RegularTimePeriod) year47);
        long long49 = year44.getSerialIndex();
        periodAxis40.setLast((org.jfree.data.time.RegularTimePeriod) year44);
        boolean boolean51 = periodAxis40.isVerticalTickLabels();
        org.jfree.chart.entity.EntityCollection entityCollection53 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo54 = new org.jfree.chart.ChartRenderingInfo(entityCollection53);
        java.awt.Paint paint55 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean56 = chartRenderingInfo54.equals((java.lang.Object) paint55);
        java.awt.geom.Rectangle2D rectangle2D57 = chartRenderingInfo54.getChartArea();
        org.jfree.chart.title.TextTitle textTitle59 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity60 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D57, (org.jfree.chart.title.Title) textTitle59);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor61 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D62 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D57, rectangleAnchor61);
        org.jfree.chart.plot.CategoryPlot categoryPlot63 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color64 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        categoryPlot63.setRangeZeroBaselinePaint((java.awt.Paint) color64);
        org.jfree.chart.util.RectangleEdge rectangleEdge67 = categoryPlot63.getRangeAxisEdge((int) ' ');
        double double68 = periodAxis40.java2DToValue((double) 28799999L, rectangle2D57, rectangleEdge67);
        org.jfree.chart.axis.AxisCollection axisCollection69 = new org.jfree.chart.axis.AxisCollection();
        java.util.List list70 = axisCollection69.getAxesAtRight();
        combinedRangeXYPlot0.drawRangeTickBands(graphics2D33, rectangle2D57, list70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo6 and chartRenderingInfo54", chartRenderingInfo6.equals(chartRenderingInfo54) ? chartRenderingInfo6.hashCode() == chartRenderingInfo54.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test104");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list1 = combinedRangeXYPlot0.getSubplots();
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot3.rendererChanged(rendererChangeEvent5);
        org.jfree.chart.entity.EntityCollection entityCollection8 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = new org.jfree.chart.ChartRenderingInfo(entityCollection8);
        java.awt.Paint paint10 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean11 = chartRenderingInfo9.equals((java.lang.Object) paint10);
        java.awt.geom.Rectangle2D rectangle2D12 = chartRenderingInfo9.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = chartRenderingInfo9.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = plotRenderingInfo13.getOwner();
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot3.zoomRangeAxes(1.0E-8d, plotRenderingInfo13, point2D15, true);
        java.lang.Object obj18 = plotRenderingInfo13.clone();
        org.jfree.chart.entity.EntityCollection entityCollection19 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = new org.jfree.chart.ChartRenderingInfo(entityCollection19);
        java.awt.Paint paint21 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean22 = chartRenderingInfo20.equals((java.lang.Object) paint21);
        java.awt.geom.Rectangle2D rectangle2D23 = chartRenderingInfo20.getChartArea();
        org.jfree.chart.title.TextTitle textTitle25 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity26 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D23, (org.jfree.chart.title.Title) textTitle25);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D28 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D23, rectangleAnchor27);
        combinedRangeXYPlot0.zoomDomainAxes(100.0d, plotRenderingInfo13, point2D28, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo9 and chartRenderingInfo20", chartRenderingInfo9.equals(chartRenderingInfo20) ? chartRenderingInfo9.hashCode() == chartRenderingInfo20.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test105");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        java.awt.Font font10 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        combinedDomainXYPlot1.setNoDataMessageFont(font10);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer14 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement13);
        blockContainer14.clear();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer17 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer17.clearSeriesStrokes(false);
        boolean boolean20 = xYAreaRenderer17.getPlotLines();
        boolean boolean21 = xYAreaRenderer17.getBaseItemLabelsVisible();
        java.awt.Paint paint22 = xYAreaRenderer17.getBasePaint();
        boolean boolean23 = blockContainer14.equals((java.lang.Object) paint22);
        org.jfree.chart.entity.EntityCollection entityCollection24 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = new org.jfree.chart.ChartRenderingInfo(entityCollection24);
        java.awt.Paint paint26 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean27 = chartRenderingInfo25.equals((java.lang.Object) paint26);
        java.awt.geom.Rectangle2D rectangle2D28 = chartRenderingInfo25.getChartArea();
        org.jfree.chart.title.TextTitle textTitle30 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity31 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D28, (org.jfree.chart.title.Title) textTitle30);
        blockContainer14.setBounds(rectangle2D28);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot33.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent35 = null;
        categoryPlot33.rendererChanged(rendererChangeEvent35);
        org.jfree.chart.entity.EntityCollection entityCollection38 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo39 = new org.jfree.chart.ChartRenderingInfo(entityCollection38);
        java.awt.Paint paint40 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean41 = chartRenderingInfo39.equals((java.lang.Object) paint40);
        java.awt.geom.Rectangle2D rectangle2D42 = chartRenderingInfo39.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = chartRenderingInfo39.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo44 = plotRenderingInfo43.getOwner();
        java.awt.geom.Point2D point2D45 = null;
        categoryPlot33.zoomRangeAxes(1.0E-8d, plotRenderingInfo43, point2D45, true);
        combinedDomainXYPlot1.drawAnnotations(graphics2D12, rectangle2D28, plotRenderingInfo43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo4 and chartRenderingInfo25", chartRenderingInfo4.equals(chartRenderingInfo25) ? chartRenderingInfo4.hashCode() == chartRenderingInfo25.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test106");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint4 = xYAreaRenderer1.getBaseLegendTextPaint();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer1.setSeriesOutlineStroke(0, stroke6, false);
        org.jfree.chart.LegendItem legendItem11 = xYAreaRenderer1.getLegendItem(8, (int) (byte) 10);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot14 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis13);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer16.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator19 = null;
        xYAreaRenderer16.setLegendItemURLGenerator(xYSeriesLabelGenerator19);
        xYAreaRenderer16.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean27 = xYAreaRenderer16.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot14.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer16);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        int int30 = combinedDomainXYPlot14.getRangeAxisIndex(valueAxis29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        combinedDomainXYPlot14.setDomainAxis(valueAxis31);
        combinedDomainXYPlot14.clearRangeMarkers();
        org.jfree.data.time.Year year36 = new org.jfree.data.time.Year((int) (short) 0);
        long long37 = year36.getFirstMillisecond();
        org.jfree.data.time.Year year39 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.chart.axis.PeriodAxis periodAxis40 = new org.jfree.chart.axis.PeriodAxis("RectangleEdge.RIGHT", (org.jfree.data.time.RegularTimePeriod) year36, (org.jfree.data.time.RegularTimePeriod) year39);
        org.jfree.data.time.Year year43 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year45 = new org.jfree.data.time.Year((int) (short) 0);
        long long46 = year45.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis47 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year43, (org.jfree.data.time.RegularTimePeriod) year45);
        periodAxis40.setLast((org.jfree.data.time.RegularTimePeriod) year45);
        java.awt.Stroke stroke49 = periodAxis40.getMinorTickMarkStroke();
        java.lang.Class class50 = periodAxis40.getMajorTickTimePeriodClass();
        org.jfree.chart.plot.Marker marker51 = null;
        org.jfree.chart.entity.EntityCollection entityCollection52 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo53 = new org.jfree.chart.ChartRenderingInfo(entityCollection52);
        java.awt.Paint paint54 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean55 = chartRenderingInfo53.equals((java.lang.Object) paint54);
        java.awt.geom.Rectangle2D rectangle2D56 = chartRenderingInfo53.getChartArea();
        org.jfree.chart.title.TextTitle textTitle58 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity59 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D56, (org.jfree.chart.title.Title) textTitle58);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor60 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D61 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D56, rectangleAnchor60);
        xYAreaRenderer1.drawDomainMarker(graphics2D12, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot14, (org.jfree.chart.axis.ValueAxis) periodAxis40, marker51, rectangle2D56);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor63 = org.jfree.chart.util.RectangleAnchor.TOP_LEFT;
        java.lang.String str64 = rectangleAnchor63.toString();
        java.awt.geom.Point2D point2D65 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D56, rectangleAnchor63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer16", xYAreaRenderer1.equals(xYAreaRenderer16) ? xYAreaRenderer1.hashCode() == xYAreaRenderer16.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test107");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) 'a', layer2);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        categoryPlot0.setDataset(4, categoryDataset5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT;
        categoryPlot0.setRangeAxisLocation(axisLocation7, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), plotRenderingInfo11, point2D12, false);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot0.getLegendItems();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot17 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis16);
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.entity.EntityCollection entityCollection19 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = new org.jfree.chart.ChartRenderingInfo(entityCollection19);
        java.awt.Paint paint21 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean22 = chartRenderingInfo20.equals((java.lang.Object) paint21);
        java.awt.geom.Rectangle2D rectangle2D23 = chartRenderingInfo20.getChartArea();
        java.util.List list24 = null;
        combinedDomainXYPlot17.drawDomainGridlines(graphics2D18, rectangle2D23, list24);
        org.jfree.chart.axis.NumberAxis numberAxis27 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity30 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D23, (org.jfree.chart.axis.Axis) numberAxis27, "", "DatasetRenderingOrder.FORWARD");
        numberAxis27.centerRange(10.0d);
        numberAxis27.setRangeWithMargins(1.0E-8d, (double) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer38 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection39 = categoryPlot36.getDomainMarkers((int) 'a', layer38);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        categoryPlot36.setDataset(4, categoryDataset41);
        org.jfree.chart.axis.AxisLocation axisLocation43 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT;
        categoryPlot36.setRangeAxisLocation(axisLocation43, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        java.awt.geom.Point2D point2D48 = null;
        categoryPlot36.zoomRangeAxes((double) (-16777216), plotRenderingInfo47, point2D48, false);
        org.jfree.chart.LegendItemCollection legendItemCollection51 = categoryPlot36.getLegendItems();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder52 = org.jfree.chart.plot.DatasetRenderingOrder.FORWARD;
        categoryPlot36.setDatasetRenderingOrder(datasetRenderingOrder52);
        boolean boolean54 = numberAxis27.equals((java.lang.Object) datasetRenderingOrder52);
        java.lang.String str55 = datasetRenderingOrder52.toString();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection15 and legendItemCollection51", legendItemCollection15.equals(legendItemCollection51) ? legendItemCollection15.hashCode() == legendItemCollection51.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test108");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) 'a', layer2);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        categoryPlot0.setDataset(4, categoryDataset5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        int int8 = categoryPlot7.getDatasetCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation9 = categoryPlot7.getOrientation();
        categoryPlot0.setOrientation(plotOrientation9);
        boolean boolean11 = categoryPlot0.isDomainPannable();
        org.jfree.chart.axis.NumberAxis numberAxis13 = new org.jfree.chart.axis.NumberAxis();
        categoryPlot0.setRangeAxis(3, (org.jfree.chart.axis.ValueAxis) numberAxis13);
        org.jfree.chart.entity.EntityCollection entityCollection15 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = new org.jfree.chart.ChartRenderingInfo(entityCollection15);
        java.awt.Paint paint17 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean18 = chartRenderingInfo16.equals((java.lang.Object) paint17);
        java.awt.geom.Rectangle2D rectangle2D19 = chartRenderingInfo16.getChartArea();
        org.jfree.chart.title.TextTitle textTitle21 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity22 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D19, (org.jfree.chart.title.Title) textTitle21);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D24 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D19, rectangleAnchor23);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity31 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D19, pieDataset25, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot33 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis32);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer35 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer35.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator38 = null;
        xYAreaRenderer35.setLegendItemURLGenerator(xYSeriesLabelGenerator38);
        xYAreaRenderer35.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean46 = xYAreaRenderer35.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot33.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer35);
        combinedDomainXYPlot33.clearDomainMarkers();
        java.awt.Font font50 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint51 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer54 = null;
        org.jfree.chart.text.TextBlock textBlock55 = org.jfree.chart.text.TextUtilities.createTextBlock("", font50, paint51, (float) (-1L), (int) (short) -1, textMeasurer54);
        combinedDomainXYPlot33.setDomainCrosshairPaint(paint51);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder57 = combinedDomainXYPlot33.getSeriesRenderingOrder();
        java.awt.Paint paint58 = org.jfree.chart.plot.PolarPlot.DEFAULT_GRIDLINE_PAINT;
        combinedDomainXYPlot33.setRangeTickBandPaint(paint58);
        org.jfree.chart.title.LegendGraphic legendGraphic60 = new org.jfree.chart.title.LegendGraphic((java.awt.Shape) rectangle2D19, paint58);
        java.awt.Paint paint61 = legendGraphic60.getOutlinePaint();
        java.awt.Paint paint62 = legendGraphic60.getLinePaint();
        java.awt.Shape shape63 = legendGraphic60.getShape();
        numberAxis13.setLeftArrow(shape63);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryPlot7 and categoryPlot0.", categoryPlot7.equals(categoryPlot0) == categoryPlot0.equals(categoryPlot7));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test109");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        org.jfree.chart.axis.ValueAxis valueAxis19 = combinedDomainXYPlot1.getRangeAxis((int) (short) -1);
        combinedDomainXYPlot1.configureDomainAxes();
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer23 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement22);
        blockContainer23.clear();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer26 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer26.clearSeriesStrokes(false);
        boolean boolean29 = xYAreaRenderer26.getPlotLines();
        boolean boolean30 = xYAreaRenderer26.getBaseItemLabelsVisible();
        java.awt.Paint paint31 = xYAreaRenderer26.getBasePaint();
        boolean boolean32 = blockContainer23.equals((java.lang.Object) paint31);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = blockContainer23.getMargin();
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup35 = piePlot34.getDatasetGroup();
        int int36 = piePlot34.getBackgroundImageAlignment();
        boolean boolean37 = piePlot34.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        piePlot34.createAndAddEntity(rectangle2D38, plotRenderingInfo39, "hi!", "LGPL");
        piePlot34.setStartAngle((double) 1);
        org.jfree.data.xy.XYDataItem xYDataItem47 = new org.jfree.data.xy.XYDataItem((double) (byte) 10, (double) 0);
        java.awt.Color color50 = java.awt.Color.getColor("hi!", (int) (short) 100);
        boolean boolean51 = xYDataItem47.equals((java.lang.Object) "hi!");
        java.awt.Color color52 = java.awt.Color.MAGENTA;
        piePlot34.setSectionPaint((java.lang.Comparable) "hi!", (java.awt.Paint) color52);
        java.awt.Graphics2D graphics2D54 = null;
        org.jfree.chart.entity.EntityCollection entityCollection55 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo56 = new org.jfree.chart.ChartRenderingInfo(entityCollection55);
        java.awt.Paint paint57 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean58 = chartRenderingInfo56.equals((java.lang.Object) paint57);
        java.awt.geom.Rectangle2D rectangle2D59 = chartRenderingInfo56.getChartArea();
        piePlot34.drawBackgroundImage(graphics2D54, rectangle2D59);
        java.awt.geom.Rectangle2D rectangle2D61 = rectangleInsets33.createInsetRectangle(rectangle2D59);
        org.jfree.chart.axis.AxisSpace axisSpace62 = new org.jfree.chart.axis.AxisSpace();
        axisSpace62.setTop(0.0d);
        double double65 = axisSpace62.getBottom();
        org.jfree.chart.axis.AxisSpace axisSpace66 = combinedDomainXYPlot1.calculateRangeAxisSpace(graphics2D21, rectangle2D61, axisSpace62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer26", xYAreaRenderer3.equals(xYAreaRenderer26) ? xYAreaRenderer3.hashCode() == xYAreaRenderer26.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test110");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        boolean boolean18 = combinedDomainXYPlot1.isRangeCrosshairVisible();
        boolean boolean19 = combinedDomainXYPlot1.isDomainCrosshairVisible();
        java.util.TimeZone timeZone20 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection21 = new org.jfree.data.time.TimeSeriesCollection(timeZone20);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot22.clearAnnotations();
        timeSeriesCollection21.removeChangeListener((org.jfree.data.general.DatasetChangeListener) categoryPlot22);
        org.jfree.data.general.DatasetGroup datasetGroup25 = timeSeriesCollection21.getGroup();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = combinedDomainXYPlot1.getRendererForDataset((org.jfree.data.xy.XYDataset) timeSeriesCollection21);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot29.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent31 = null;
        categoryPlot29.rendererChanged(rendererChangeEvent31);
        org.jfree.chart.entity.EntityCollection entityCollection34 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo35 = new org.jfree.chart.ChartRenderingInfo(entityCollection34);
        java.awt.Paint paint36 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean37 = chartRenderingInfo35.equals((java.lang.Object) paint36);
        java.awt.geom.Rectangle2D rectangle2D38 = chartRenderingInfo35.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = chartRenderingInfo35.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo40 = plotRenderingInfo39.getOwner();
        java.awt.geom.Point2D point2D41 = null;
        categoryPlot29.zoomRangeAxes(1.0E-8d, plotRenderingInfo39, point2D41, true);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer49 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer49.clearSeriesStrokes(false);
        boolean boolean52 = xYAreaRenderer49.getPlotLines();
        org.jfree.chart.title.LegendTitle legendTitle53 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource) xYAreaRenderer49);
        org.jfree.chart.util.RectangleEdge rectangleEdge54 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str55 = rectangleEdge54.toString();
        legendTitle53.setLegendItemGraphicEdge(rectangleEdge54);
        org.jfree.chart.title.TextTitle textTitle58 = new org.jfree.chart.title.TextTitle("");
        boolean boolean59 = textTitle58.getExpandToFitSpace();
        textTitle58.setText("");
        java.lang.String str62 = textTitle58.getID();
        java.awt.Font font63 = textTitle58.getFont();
        java.awt.Graphics2D graphics2D64 = null;
        org.jfree.chart.entity.EntityCollection entityCollection65 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo66 = new org.jfree.chart.ChartRenderingInfo(entityCollection65);
        java.awt.Paint paint67 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean68 = chartRenderingInfo66.equals((java.lang.Object) paint67);
        java.awt.geom.Rectangle2D rectangle2D69 = chartRenderingInfo66.getChartArea();
        textTitle58.draw(graphics2D64, rectangle2D69);
        legendTitle53.setBounds(rectangle2D69);
        java.awt.Paint paint72 = org.jfree.chart.text.TextFragment.DEFAULT_PAINT;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot73 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.plot.PiePlot piePlot74 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup75 = piePlot74.getDatasetGroup();
        int int76 = piePlot74.getBackgroundImageAlignment();
        boolean boolean77 = piePlot74.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D78 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo79 = null;
        piePlot74.createAndAddEntity(rectangle2D78, plotRenderingInfo79, "hi!", "LGPL");
        java.awt.Paint paint83 = piePlot74.getLabelPaint();
        java.awt.Stroke stroke84 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        piePlot74.setOutlineStroke(stroke84);
        combinedDomainXYPlot73.setDomainMinorGridlineStroke(stroke84);
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D89 = new org.jfree.chart.renderer.category.BarRenderer3D((double) 0.0f, (double) 100L);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator90 = barRenderer3D89.getBaseToolTipGenerator();
        java.awt.Paint paint91 = barRenderer3D89.getBaseItemLabelPaint();
        org.jfree.chart.LegendItem legendItem92 = new org.jfree.chart.LegendItem("PlotOrientation.VERTICAL", "[Dec 31, 1969 4:00:00 PM --> Dec 31, 1969 4:00:00 PM]", "WMAP_Plot", "hi!", (java.awt.Shape) rectangle2D69, paint72, stroke84, paint91);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor93 = org.jfree.chart.util.RectangleAnchor.LEFT;
        java.awt.geom.Point2D point2D94 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D69, rectangleAnchor93);
        combinedDomainXYPlot1.zoomRangeAxes(1.0d, (double) '#', plotRenderingInfo39, point2D94);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer49", xYAreaRenderer3.equals(xYAreaRenderer49) ? xYAreaRenderer3.hashCode() == xYAreaRenderer49.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test111");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        combinedDomainXYPlot1.setDomainAxis(valueAxis18);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot22.clearAnnotations();
        java.util.List list24 = categoryPlot22.getAnnotations();
        org.jfree.chart.plot.PolarPlot polarPlot27 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Font font28 = polarPlot27.getAngleLabelFont();
        org.jfree.chart.axis.ValueAxis valueAxis29 = polarPlot27.getAxis();
        org.jfree.chart.entity.EntityCollection entityCollection31 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo32 = new org.jfree.chart.ChartRenderingInfo(entityCollection31);
        java.awt.Paint paint33 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean34 = chartRenderingInfo32.equals((java.lang.Object) paint33);
        java.awt.geom.Rectangle2D rectangle2D35 = chartRenderingInfo32.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = chartRenderingInfo32.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo37 = plotRenderingInfo36.getOwner();
        java.awt.geom.Point2D point2D38 = null;
        polarPlot27.zoomDomainAxes((double) (byte) 1, plotRenderingInfo36, point2D38, false);
        categoryPlot22.handleClick(2958465, (int) (byte) 10, plotRenderingInfo36);
        org.jfree.chart.entity.EntityCollection entityCollection42 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo43 = new org.jfree.chart.ChartRenderingInfo(entityCollection42);
        java.awt.Paint paint44 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean45 = chartRenderingInfo43.equals((java.lang.Object) paint44);
        java.awt.geom.Rectangle2D rectangle2D46 = chartRenderingInfo43.getChartArea();
        org.jfree.chart.title.TextTitle textTitle48 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity49 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D46, (org.jfree.chart.title.Title) textTitle48);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor50 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D51 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D46, rectangleAnchor50);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor52 = null;
        java.awt.geom.Point2D point2D53 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D46, rectangleAnchor52);
        combinedDomainXYPlot1.zoomRangeAxes((double) (-2649600000L), (double) 1577894400035L, plotRenderingInfo36, point2D53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo32 and chartRenderingInfo43", chartRenderingInfo32.equals(chartRenderingInfo43) ? chartRenderingInfo32.hashCode() == chartRenderingInfo43.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test112");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        java.awt.Stroke stroke18 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        combinedDomainXYPlot1.setRangeCrosshairStroke(stroke18);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer22 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer22.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator25 = null;
        xYAreaRenderer22.setLegendItemURLGenerator(xYSeriesLabelGenerator25);
        xYAreaRenderer22.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean31 = xYAreaRenderer22.isSeriesVisible((-16777216));
        java.awt.Shape shape32 = xYAreaRenderer22.getBaseShape();
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone34 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection35 = new org.jfree.data.time.TimeSeriesCollection(timeZone34);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer37 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement33, (org.jfree.data.general.Dataset) timeSeriesCollection35, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState38 = timeSeriesCollection35.getSelectionState();
        java.lang.Number number39 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection35);
        java.lang.Object obj40 = timeSeriesCollection35.clone();
        java.lang.Number number41 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection35);
        org.jfree.chart.entity.XYItemEntity xYItemEntity46 = new org.jfree.chart.entity.XYItemEntity(shape32, (org.jfree.data.xy.XYDataset) timeSeriesCollection35, (int) (short) 10, (int) (short) 100, "12/31/69", "PlotOrientation.VERTICAL");
        combinedDomainXYPlot1.setDataset(0, (org.jfree.data.xy.XYDataset) timeSeriesCollection35);
        org.jfree.chart.LegendItemCollection legendItemCollection48 = combinedDomainXYPlot1.getFixedLegendItems();
        java.util.TimeZone timeZone49 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection50 = new org.jfree.data.time.TimeSeriesCollection(timeZone49);
        java.text.DateFormat dateFormat52 = null;
        java.text.DateFormat dateFormat53 = null;
        org.jfree.chart.labels.StandardXYToolTipGenerator standardXYToolTipGenerator54 = new org.jfree.chart.labels.StandardXYToolTipGenerator("[10.0, 0.0]", dateFormat52, dateFormat53);
        boolean boolean55 = timeSeriesCollection50.equals((java.lang.Object) "[10.0, 0.0]");
        org.jfree.data.Range range56 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) timeSeriesCollection50);
        org.jfree.chart.plot.CategoryPlot categoryPlot57 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot57.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent59 = null;
        categoryPlot57.rendererChanged(rendererChangeEvent59);
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = categoryPlot57.getAxisOffset();
        boolean boolean62 = timeSeriesCollection50.equals((java.lang.Object) categoryPlot57);
        combinedDomainXYPlot1.setParent((org.jfree.chart.plot.Plot) categoryPlot57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeriesCollection35 and timeSeriesCollection50", timeSeriesCollection35.equals(timeSeriesCollection50) ? timeSeriesCollection35.hashCode() == timeSeriesCollection50.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test113");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator4 = null;
        xYAreaRenderer1.setLegendItemURLGenerator(xYSeriesLabelGenerator4);
        xYAreaRenderer1.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) false);
        xYAreaRenderer1.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator12 = null;
        xYAreaRenderer1.setSeriesURLGenerator((int) (short) 100, xYURLGenerator12, false);
        java.awt.Paint paint18 = xYAreaRenderer1.getItemFillPaint((int) (short) 10, (int) 'a', true);
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot21 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis20);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer23 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer23.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator26 = null;
        xYAreaRenderer23.setLegendItemURLGenerator(xYSeriesLabelGenerator26);
        xYAreaRenderer23.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean34 = xYAreaRenderer23.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot21.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer23);
        boolean boolean36 = combinedDomainXYPlot21.canSelectByPoint();
        org.jfree.chart.axis.NumberAxis numberAxis38 = new org.jfree.chart.axis.NumberAxis("");
        int int39 = numberAxis38.getMinorTickCount();
        numberAxis38.setMinorTickMarksVisible(true);
        org.jfree.chart.entity.EntityCollection entityCollection42 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo43 = new org.jfree.chart.ChartRenderingInfo(entityCollection42);
        java.awt.Paint paint44 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean45 = chartRenderingInfo43.equals((java.lang.Object) paint44);
        java.awt.geom.Rectangle2D rectangle2D46 = chartRenderingInfo43.getChartArea();
        org.jfree.chart.title.TextTitle textTitle48 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity49 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D46, (org.jfree.chart.title.Title) textTitle48);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor50 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D51 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D46, rectangleAnchor50);
        java.awt.Paint paint53 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_PAINT;
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot54 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke55 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot54.setRangeCrosshairStroke(stroke55);
        xYAreaRenderer1.drawDomainLine(graphics2D19, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot21, (org.jfree.chart.axis.ValueAxis) numberAxis38, rectangle2D46, (double) 60000L, paint53, stroke55);
        java.awt.Paint paint58 = combinedDomainXYPlot21.getDomainCrosshairPaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer23", xYAreaRenderer1.equals(xYAreaRenderer23) ? xYAreaRenderer1.hashCode() == xYAreaRenderer23.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test114");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.lang.Object obj1 = combinedRangeXYPlot0.clone();
        double double2 = combinedRangeXYPlot0.getGap();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer4 = combinedRangeXYPlot0.getRenderer(4);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer6 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer6.clearSeriesStrokes(false);
        boolean boolean9 = xYAreaRenderer6.getPlotLines();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYAreaRenderer6.setSeriesStroke((int) (short) 1, stroke11, true);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot16 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis15);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer18 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer18.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator21 = null;
        xYAreaRenderer18.setLegendItemURLGenerator(xYSeriesLabelGenerator21);
        xYAreaRenderer18.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean29 = xYAreaRenderer18.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot16.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer18);
        java.awt.Stroke stroke31 = combinedDomainXYPlot16.getDomainCrosshairStroke();
        xYAreaRenderer6.setSeriesOutlineStroke((int) (short) 100, stroke31, false);
        boolean boolean34 = combinedRangeXYPlot0.equals((java.lang.Object) stroke31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer6 and xYAreaRenderer18", xYAreaRenderer6.equals(xYAreaRenderer18) ? xYAreaRenderer6.hashCode() == xYAreaRenderer18.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test115");
        org.jfree.data.xy.DefaultXYDataset defaultXYDataset3 = new org.jfree.data.xy.DefaultXYDataset();
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState4 = defaultXYDataset3.getSelectionState();
        int int5 = defaultXYDataset3.getSeriesCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer8 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection9 = categoryPlot6.getDomainMarkers((int) 'a', layer8);
        java.awt.Paint paint10 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        categoryPlot6.setOutlinePaint(paint10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        int int13 = categoryPlot12.getDatasetCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation14 = categoryPlot12.getOrientation();
        categoryPlot6.setOrientation(plotOrientation14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jfree.chart.JFreeChart jFreeChart19 = org.jfree.chart.ChartFactory.createXYStepChart("JFreeChart version EXPAND.\n(C)opyright 2000-2008, by Object Refinery Limited and Contributors.\n\nFor terms of use, see the licence below.\n\nFURTHER INFORMATION:http://www.jfree.org/jfreechart/index.html\nCONTRIBUTORS:\nOTHER LIBRARIES USED BY JFreeChart:JFreeChart EXPAND (http://www.jfree.org/jfreechart/index.html).JFreeChart EXPAND (http://www.jfree.org/jfreechart/index.html).JFreeChart EXPAND (http://www.jfree.org/jfreechart/index.html).JFreeChart EXPAND (http://www.jfree.org/jfreechart/index.html).JFreeChart EXPAND (http://www.jfree.org/jfreechart/index.html).JFreeChart EXPAND (http://www.jfree.org/jfreechart/index.html).JFreeChart EXPAND (http://www.jfree.org/jfreechart/index.html).\nJFreeChart LICENCE TERMS:\nClassContext", "[Dec 31, 1969 4:00:00 PM --> Dec 31, 1969 4:00:00 PM]", "", (org.jfree.data.xy.XYDataset) defaultXYDataset3, plotOrientation14, true, true, true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test116");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder25 = combinedDomainXYPlot1.getSeriesRenderingOrder();
        combinedDomainXYPlot1.clearDomainMarkers();
        int int27 = combinedDomainXYPlot1.getRendererCount();
        java.awt.Color color30 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer32 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean34 = xYAreaRenderer32.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint35 = xYAreaRenderer32.getBaseLegendTextPaint();
        java.awt.Stroke stroke37 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer32.setSeriesOutlineStroke(0, stroke37, false);
        java.awt.Color color42 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer44 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean46 = xYAreaRenderer44.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint47 = xYAreaRenderer44.getBaseLegendTextPaint();
        java.awt.Stroke stroke49 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer44.setSeriesOutlineStroke(0, stroke49, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker53 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color30, stroke37, (java.awt.Paint) color42, stroke49, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor54 = org.jfree.chart.text.TextAnchor.BASELINE_LEFT;
        intervalMarker53.setLabelTextAnchor(textAnchor54);
        java.lang.String str56 = intervalMarker53.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent57 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker) intervalMarker53);
        boolean boolean58 = combinedDomainXYPlot1.removeRangeMarker((org.jfree.chart.plot.Marker) intervalMarker53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer32", xYAreaRenderer3.equals(xYAreaRenderer32) ? xYAreaRenderer3.hashCode() == xYAreaRenderer32.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test117");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder25 = combinedDomainXYPlot1.getSeriesRenderingOrder();
        java.awt.Paint paint26 = combinedDomainXYPlot1.getRangeGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot27.clearAnnotations();
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = categoryPlot27.getRangeAxisEdge((int) (byte) 10);
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D32 = new org.jfree.chart.renderer.category.BarRenderer3D();
        java.awt.Font font36 = barRenderer3D32.getItemLabelFont((int) (byte) -1, (int) (byte) 1, false);
        java.awt.Shape shape37 = barRenderer3D32.getBaseShape();
        java.awt.Color color40 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer42 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean44 = xYAreaRenderer42.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint45 = xYAreaRenderer42.getBaseLegendTextPaint();
        java.awt.Stroke stroke47 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer42.setSeriesOutlineStroke(0, stroke47, false);
        java.awt.Color color52 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer54 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean56 = xYAreaRenderer54.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint57 = xYAreaRenderer54.getBaseLegendTextPaint();
        java.awt.Stroke stroke59 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer54.setSeriesOutlineStroke(0, stroke59, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker63 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color40, stroke47, (java.awt.Paint) color52, stroke59, (float) (byte) 1);
        barRenderer3D32.setBaseOutlineStroke(stroke47);
        org.jfree.chart.plot.CategoryPlot categoryPlot65 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color66 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        categoryPlot65.setRangeZeroBaselinePaint((java.awt.Paint) color66);
        barRenderer3D32.setPlot(categoryPlot65);
        org.jfree.chart.axis.AxisLocation axisLocation70 = categoryPlot65.getDomainAxisLocation((int) (byte) -1);
        categoryPlot27.setDomainAxisLocation(5, axisLocation70);
        combinedDomainXYPlot1.setRangeAxisLocation(axisLocation70, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer42", xYAreaRenderer3.equals(xYAreaRenderer42) ? xYAreaRenderer3.hashCode() == xYAreaRenderer42.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test118");
        org.jfree.data.time.Year year2 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year4 = new org.jfree.data.time.Year((int) (short) 0);
        long long5 = year4.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis6 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year2, (org.jfree.data.time.RegularTimePeriod) year4);
        java.lang.Object obj7 = periodAxis6.clone();
        org.jfree.data.time.Year year10 = new org.jfree.data.time.Year((int) (short) 0);
        long long11 = year10.getFirstMillisecond();
        org.jfree.data.time.Year year13 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.chart.axis.PeriodAxis periodAxis14 = new org.jfree.chart.axis.PeriodAxis("RectangleEdge.RIGHT", (org.jfree.data.time.RegularTimePeriod) year10, (org.jfree.data.time.RegularTimePeriod) year13);
        long long15 = year10.getSerialIndex();
        periodAxis6.setLast((org.jfree.data.time.RegularTimePeriod) year10);
        periodAxis6.setMinorTickMarkOutsideLength((float) (-9999));
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup21 = piePlot20.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        piePlot20.addChangeListener(plotChangeListener22);
        java.awt.Color color26 = java.awt.Color.getColor("hi!", (int) (short) 100);
        piePlot20.setLabelOutlinePaint((java.awt.Paint) color26);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer30 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection31 = categoryPlot28.getDomainMarkers((int) 'a', layer30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        categoryPlot28.setDataset(4, categoryDataset33);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        int int36 = categoryPlot35.getDatasetCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation37 = categoryPlot35.getOrientation();
        categoryPlot28.setOrientation(plotOrientation37);
        boolean boolean39 = categoryPlot28.isDomainPannable();
        categoryPlot28.setRangeCrosshairValue((double) 10);
        java.awt.Graphics2D graphics2D42 = null;
        org.jfree.chart.entity.EntityCollection entityCollection43 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo44 = new org.jfree.chart.ChartRenderingInfo(entityCollection43);
        java.awt.Paint paint45 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean46 = chartRenderingInfo44.equals((java.lang.Object) paint45);
        java.awt.geom.Rectangle2D rectangle2D47 = chartRenderingInfo44.getChartArea();
        org.jfree.chart.title.TextTitle textTitle49 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity50 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D47, (org.jfree.chart.title.Title) textTitle49);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor51 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D52 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D47, rectangleAnchor51);
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity59 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D47, pieDataset53, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        org.jfree.chart.axis.AxisSpace axisSpace60 = new org.jfree.chart.axis.AxisSpace();
        org.jfree.chart.axis.ValueAxis valueAxis62 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot63 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis62);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer65 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer65.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator68 = null;
        xYAreaRenderer65.setLegendItemURLGenerator(xYSeriesLabelGenerator68);
        xYAreaRenderer65.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean76 = xYAreaRenderer65.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot63.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer65);
        org.jfree.chart.axis.ValueAxis valueAxis78 = null;
        int int79 = combinedDomainXYPlot63.getRangeAxisIndex(valueAxis78);
        org.jfree.chart.axis.ValueAxis valueAxis80 = null;
        combinedDomainXYPlot63.setDomainAxis(valueAxis80);
        org.jfree.chart.util.RectangleEdge rectangleEdge83 = combinedDomainXYPlot63.getDomainAxisEdge(0);
        axisSpace60.add((double) 10L, rectangleEdge83);
        org.jfree.chart.axis.AxisSpace axisSpace85 = categoryPlot28.calculateDomainAxisSpace(graphics2D42, rectangle2D47, axisSpace60);
        piePlot20.setLegendItemShape((java.awt.Shape) rectangle2D47);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer88 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer88.clearSeriesStrokes(false);
        boolean boolean91 = xYAreaRenderer88.getPlotLines();
        org.jfree.chart.title.LegendTitle legendTitle92 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource) xYAreaRenderer88);
        org.jfree.chart.util.RectangleEdge rectangleEdge93 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str94 = rectangleEdge93.toString();
        legendTitle92.setLegendItemGraphicEdge(rectangleEdge93);
        double double96 = periodAxis6.java2DToValue(2958209.0d, rectangle2D47, rectangleEdge93);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer65 and xYAreaRenderer88", xYAreaRenderer65.equals(xYAreaRenderer88) ? xYAreaRenderer65.hashCode() == xYAreaRenderer88.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test119");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        boolean boolean18 = combinedDomainXYPlot1.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        double double20 = rectangleInsets19.getLeft();
        double double22 = rectangleInsets19.calculateLeftOutset((double) 0L);
        combinedDomainXYPlot1.setAxisOffset(rectangleInsets19);
        combinedDomainXYPlot1.setDomainGridlinesVisible(false);
        java.awt.Paint paint26 = combinedDomainXYPlot1.getNoDataMessagePaint();
        boolean boolean27 = combinedDomainXYPlot1.canSelectByPoint();
        java.awt.Color color32 = org.jfree.chart.ChartColor.VERY_DARK_RED;
        org.jfree.chart.block.BlockBorder blockBorder33 = new org.jfree.chart.block.BlockBorder(0.025d, (double) 2, (double) 9, (double) 1L, (java.awt.Paint) color32);
        combinedDomainXYPlot1.setRangeZeroBaselinePaint((java.awt.Paint) color32);
        org.jfree.chart.entity.EntityCollection entityCollection36 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo37 = new org.jfree.chart.ChartRenderingInfo(entityCollection36);
        java.awt.Paint paint38 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean39 = chartRenderingInfo37.equals((java.lang.Object) paint38);
        java.awt.geom.Rectangle2D rectangle2D40 = chartRenderingInfo37.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = chartRenderingInfo37.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo42 = plotRenderingInfo41.getOwner();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo42);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot44 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke45 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot44.setRangeCrosshairStroke(stroke45);
        java.awt.geom.Point2D point2D47 = combinedRangeXYPlot44.getQuadrantOrigin();
        combinedDomainXYPlot1.zoomRangeAxes(0.0d, plotRenderingInfo43, point2D47);
        org.jfree.chart.axis.AxisSpace axisSpace49 = null;
        combinedDomainXYPlot1.setFixedDomainAxisSpace(axisSpace49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plotRenderingInfo41 and plotRenderingInfo43", plotRenderingInfo41.equals(plotRenderingInfo43) ? plotRenderingInfo41.hashCode() == plotRenderingInfo43.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test120");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list1 = combinedRangeXYPlot0.getSubplots();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot3 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis2);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer5 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer5.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator8 = null;
        xYAreaRenderer5.setLegendItemURLGenerator(xYSeriesLabelGenerator8);
        xYAreaRenderer5.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean16 = xYAreaRenderer5.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot3.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer5);
        combinedDomainXYPlot3.clearDomainMarkers();
        java.awt.Font font20 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint21 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer24 = null;
        org.jfree.chart.text.TextBlock textBlock25 = org.jfree.chart.text.TextUtilities.createTextBlock("", font20, paint21, (float) (-1L), (int) (short) -1, textMeasurer24);
        combinedDomainXYPlot3.setDomainCrosshairPaint(paint21);
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup28 = piePlot27.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        piePlot27.addChangeListener(plotChangeListener29);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) piePlot27);
        combinedDomainXYPlot3.plotChanged(plotChangeEvent31);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType33 = plotChangeEvent31.getType();
        combinedRangeXYPlot0.plotChanged(plotChangeEvent31);
        org.jfree.chart.plot.IntervalMarker intervalMarker37 = new org.jfree.chart.plot.IntervalMarker((double) (short) 100, (double) 10);
        boolean boolean38 = combinedRangeXYPlot0.removeRangeMarker((org.jfree.chart.plot.Marker) intervalMarker37);
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup40 = piePlot39.getDatasetGroup();
        org.jfree.chart.labels.StandardPieToolTipGenerator standardPieToolTipGenerator42 = new org.jfree.chart.labels.StandardPieToolTipGenerator("0,0,0,0,0,0,0,0");
        piePlot39.setToolTipGenerator((org.jfree.chart.labels.PieToolTipGenerator) standardPieToolTipGenerator42);
        piePlot39.setAutoPopulateSectionOutlineStroke(true);
        java.awt.Color color48 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer50 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean52 = xYAreaRenderer50.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint53 = xYAreaRenderer50.getBaseLegendTextPaint();
        java.awt.Stroke stroke55 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer50.setSeriesOutlineStroke(0, stroke55, false);
        java.awt.Color color60 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer62 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean64 = xYAreaRenderer62.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint65 = xYAreaRenderer62.getBaseLegendTextPaint();
        java.awt.Stroke stroke67 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer62.setSeriesOutlineStroke(0, stroke67, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker71 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color48, stroke55, (java.awt.Paint) color60, stroke67, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor72 = org.jfree.chart.text.TextAnchor.BASELINE_LEFT;
        intervalMarker71.setLabelTextAnchor(textAnchor72);
        java.lang.String str74 = intervalMarker71.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent75 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker) intervalMarker71);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent76 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker) intervalMarker71);
        org.jfree.chart.plot.Marker marker77 = markerChangeEvent76.getMarker();
        piePlot39.markerChanged(markerChangeEvent76);
        intervalMarker37.notifyListeners(markerChangeEvent76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer5 and xYAreaRenderer50", xYAreaRenderer5.equals(xYAreaRenderer50) ? xYAreaRenderer5.hashCode() == xYAreaRenderer50.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test121");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup26 = piePlot25.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        piePlot25.addChangeListener(plotChangeListener27);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) piePlot25);
        combinedDomainXYPlot1.plotChanged(plotChangeEvent29);
        java.awt.Paint paint31 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        combinedDomainXYPlot1.setDomainGridlinePaint(paint31);
        java.awt.Paint paint33 = combinedDomainXYPlot1.getRangeGridlinePaint();
        double double34 = combinedDomainXYPlot1.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis36 = combinedDomainXYPlot1.getRangeAxis((int) (short) -1);
        org.jfree.chart.plot.PolarPlot polarPlot38 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Font font39 = polarPlot38.getAngleLabelFont();
        org.jfree.chart.axis.ValueAxis valueAxis40 = polarPlot38.getAxis();
        org.jfree.chart.entity.EntityCollection entityCollection42 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo43 = new org.jfree.chart.ChartRenderingInfo(entityCollection42);
        java.awt.Paint paint44 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean45 = chartRenderingInfo43.equals((java.lang.Object) paint44);
        java.awt.geom.Rectangle2D rectangle2D46 = chartRenderingInfo43.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = chartRenderingInfo43.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo48 = plotRenderingInfo47.getOwner();
        java.awt.geom.Point2D point2D49 = null;
        polarPlot38.zoomDomainAxes((double) (byte) 1, plotRenderingInfo47, point2D49, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot52 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot52.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent54 = null;
        categoryPlot52.rendererChanged(rendererChangeEvent54);
        org.jfree.chart.entity.EntityCollection entityCollection57 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo58 = new org.jfree.chart.ChartRenderingInfo(entityCollection57);
        java.awt.Paint paint59 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean60 = chartRenderingInfo58.equals((java.lang.Object) paint59);
        java.awt.geom.Rectangle2D rectangle2D61 = chartRenderingInfo58.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo62 = chartRenderingInfo58.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo63 = plotRenderingInfo62.getOwner();
        java.awt.geom.Point2D point2D64 = null;
        categoryPlot52.zoomRangeAxes(1.0E-8d, plotRenderingInfo62, point2D64, true);
        plotRenderingInfo47.addSubplotInfo(plotRenderingInfo62);
        org.jfree.chart.entity.EntityCollection entityCollection68 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo69 = new org.jfree.chart.ChartRenderingInfo(entityCollection68);
        java.awt.Paint paint70 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean71 = chartRenderingInfo69.equals((java.lang.Object) paint70);
        java.awt.geom.Rectangle2D rectangle2D72 = chartRenderingInfo69.getChartArea();
        org.jfree.chart.title.TextTitle textTitle74 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity75 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D72, (org.jfree.chart.title.Title) textTitle74);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor76 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D77 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D72, rectangleAnchor76);
        combinedDomainXYPlot1.zoomRangeAxes(0.0d, plotRenderingInfo62, point2D77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo58 and chartRenderingInfo69", chartRenderingInfo58.equals(chartRenderingInfo69) ? chartRenderingInfo58.hashCode() == chartRenderingInfo69.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test122");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        java.awt.Stroke stroke18 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        combinedDomainXYPlot1.setRangeCrosshairStroke(stroke18);
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D24 = new org.jfree.chart.axis.CategoryAxis3D("hi!");
        categoryAxis3D24.setLabelURL("EXPAND");
        categoryAxis3D24.configure();
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions28 = categoryAxis3D24.getCategoryLabelPositions();
        org.jfree.data.time.Year year33 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year35 = new org.jfree.data.time.Year((int) (short) 0);
        long long36 = year35.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis37 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year33, (org.jfree.data.time.RegularTimePeriod) year35);
        org.jfree.chart.entity.EntityCollection entityCollection39 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo40 = new org.jfree.chart.ChartRenderingInfo(entityCollection39);
        java.awt.Paint paint41 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean42 = chartRenderingInfo40.equals((java.lang.Object) paint41);
        java.awt.geom.Rectangle2D rectangle2D43 = chartRenderingInfo40.getChartArea();
        org.jfree.chart.title.TextTitle textTitle45 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity46 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D43, (org.jfree.chart.title.Title) textTitle45);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor47 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D48 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D43, rectangleAnchor47);
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color50 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        categoryPlot49.setRangeZeroBaselinePaint((java.awt.Paint) color50);
        org.jfree.chart.util.RectangleEdge rectangleEdge53 = categoryPlot49.getRangeAxisEdge((int) ' ');
        double double54 = periodAxis37.java2DToValue(0.0d, rectangle2D43, rectangleEdge53);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer56 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer56.clearSeriesStrokes(false);
        boolean boolean59 = xYAreaRenderer56.getPlotLines();
        org.jfree.chart.title.LegendTitle legendTitle60 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource) xYAreaRenderer56);
        org.jfree.chart.util.RectangleEdge rectangleEdge61 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str62 = rectangleEdge61.toString();
        legendTitle60.setLegendItemGraphicEdge(rectangleEdge61);
        double double64 = categoryAxis3D24.getCategoryStart(0, 10, rectangle2D43, rectangleEdge61);
        double double65 = combinedDomainXYPlot1.getRectX((double) (-2208959999990L), 149.0d, 0.0d, rectangleEdge61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer56", xYAreaRenderer3.equals(xYAreaRenderer56) ? xYAreaRenderer3.hashCode() == xYAreaRenderer56.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test123");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) 'a', layer2);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        categoryPlot0.setDataset(4, categoryDataset5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = categoryPlot0.getDrawingSupplier();
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.axis.AxisSpace axisSpace9 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace9);
        categoryPlot0.setCrosshairDatasetIndex((int) (short) 100);
        categoryPlot0.setCrosshairDatasetIndex(15);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot16 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list17 = combinedRangeXYPlot16.getSubplots();
        combinedRangeXYPlot16.setGap((double) (-16777216));
        org.jfree.chart.entity.EntityCollection entityCollection22 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = new org.jfree.chart.ChartRenderingInfo(entityCollection22);
        java.awt.Paint paint24 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean25 = chartRenderingInfo23.equals((java.lang.Object) paint24);
        java.awt.geom.Rectangle2D rectangle2D26 = chartRenderingInfo23.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = chartRenderingInfo23.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo28 = plotRenderingInfo27.getOwner();
        combinedRangeXYPlot16.handleClick((-9999), 5, plotRenderingInfo27);
        org.jfree.chart.entity.EntityCollection entityCollection32 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo33 = new org.jfree.chart.ChartRenderingInfo(entityCollection32);
        java.awt.Paint paint34 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean35 = chartRenderingInfo33.equals((java.lang.Object) paint34);
        java.awt.geom.Rectangle2D rectangle2D36 = chartRenderingInfo33.getChartArea();
        org.jfree.chart.title.TextTitle textTitle38 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity39 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D36, (org.jfree.chart.title.Title) textTitle38);
        java.awt.geom.Point2D point2D40 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(45.0d, (double) (byte) 1, rectangle2D36);
        categoryPlot0.panRangeAxes((double) 100L, plotRenderingInfo27, point2D40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo23 and chartRenderingInfo33", chartRenderingInfo23.equals(chartRenderingInfo33) ? chartRenderingInfo23.hashCode() == chartRenderingInfo33.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test124");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder25 = combinedDomainXYPlot1.getSeriesRenderingOrder();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer27 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer27.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator30 = null;
        xYAreaRenderer27.setLegendItemURLGenerator(xYSeriesLabelGenerator30);
        xYAreaRenderer27.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) false);
        xYAreaRenderer27.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator38 = null;
        xYAreaRenderer27.setSeriesURLGenerator((int) (short) 100, xYURLGenerator38, false);
        java.awt.Paint paint44 = xYAreaRenderer27.getItemFillPaint((int) (short) 10, (int) 'a', true);
        boolean boolean45 = seriesRenderingOrder25.equals((java.lang.Object) xYAreaRenderer27);
        org.jfree.data.Range range47 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint48 = new org.jfree.chart.block.RectangleConstraint(0.0d, range47);
        org.jfree.data.Range range51 = new org.jfree.data.Range((double) (-1L), 0.0d);
        org.jfree.data.Range range54 = new org.jfree.data.Range((double) (-1L), 0.0d);
        org.jfree.data.Range range55 = org.jfree.data.Range.combine(range51, range54);
        org.jfree.data.Range range56 = org.jfree.chart.axis.ValueAxis.DEFAULT_RANGE;
        org.jfree.data.Range range57 = org.jfree.data.Range.combine(range51, range56);
        org.jfree.chart.block.RectangleConstraint rectangleConstraint58 = rectangleConstraint48.toRangeWidth(range51);
        org.jfree.chart.block.RectangleConstraint rectangleConstraint60 = rectangleConstraint48.toFixedWidth((double) 10.0f);
        boolean boolean61 = seriesRenderingOrder25.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer27", xYAreaRenderer3.equals(xYAreaRenderer27) ? xYAreaRenderer3.hashCode() == xYAreaRenderer27.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test125");
        java.awt.Color color2 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer4 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean6 = xYAreaRenderer4.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint7 = xYAreaRenderer4.getBaseLegendTextPaint();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer4.setSeriesOutlineStroke(0, stroke9, false);
        java.awt.Color color14 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean18 = xYAreaRenderer16.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint19 = xYAreaRenderer16.getBaseLegendTextPaint();
        java.awt.Stroke stroke21 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer16.setSeriesOutlineStroke(0, stroke21, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker25 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color2, stroke9, (java.awt.Paint) color14, stroke21, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor26 = org.jfree.chart.text.TextAnchor.BASELINE_LEFT;
        intervalMarker25.setLabelTextAnchor(textAnchor26);
        java.lang.String str28 = intervalMarker25.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker) intervalMarker25);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker) intervalMarker25);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot32 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis31);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer34 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer34.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator37 = null;
        xYAreaRenderer34.setLegendItemURLGenerator(xYSeriesLabelGenerator37);
        xYAreaRenderer34.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean45 = xYAreaRenderer34.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot32.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer34);
        combinedDomainXYPlot32.clearDomainMarkers();
        java.awt.Font font49 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint50 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer53 = null;
        org.jfree.chart.text.TextBlock textBlock54 = org.jfree.chart.text.TextUtilities.createTextBlock("", font49, paint50, (float) (-1L), (int) (short) -1, textMeasurer53);
        combinedDomainXYPlot32.setDomainCrosshairPaint(paint50);
        org.jfree.chart.plot.PiePlot piePlot56 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup57 = piePlot56.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener58 = null;
        piePlot56.addChangeListener(plotChangeListener58);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent60 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) piePlot56);
        combinedDomainXYPlot32.plotChanged(plotChangeEvent60);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType62 = plotChangeEvent60.getType();
        markerChangeEvent30.setType(chartChangeEventType62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer4 and xYAreaRenderer34", xYAreaRenderer4.equals(xYAreaRenderer34) ? xYAreaRenderer4.hashCode() == xYAreaRenderer34.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test126");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDatasetCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation2 = categoryPlot0.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot4 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis3);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer6 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer6.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator9 = null;
        xYAreaRenderer6.setLegendItemURLGenerator(xYSeriesLabelGenerator9);
        xYAreaRenderer6.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean17 = xYAreaRenderer6.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot4.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer6);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        int int20 = combinedDomainXYPlot4.getRangeAxisIndex(valueAxis19);
        boolean boolean21 = combinedDomainXYPlot4.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        double double23 = rectangleInsets22.getLeft();
        double double25 = rectangleInsets22.calculateLeftOutset((double) 0L);
        combinedDomainXYPlot4.setAxisOffset(rectangleInsets22);
        combinedDomainXYPlot4.setDomainGridlinesVisible(false);
        boolean boolean29 = combinedDomainXYPlot4.isDomainMinorGridlinesVisible();
        boolean boolean30 = plotOrientation2.equals((java.lang.Object) combinedDomainXYPlot4);
        int int31 = combinedDomainXYPlot4.getDatasetCount();
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        java.util.TimeZone timeZone34 = org.jfree.chart.axis.SegmentedTimeline.DEFAULT_TIME_ZONE;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection35 = new org.jfree.data.time.TimeSeriesCollection(timeZone34);
        java.lang.Number number36 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection35);
        org.jfree.chart.entity.XYItemEntity xYItemEntity41 = new org.jfree.chart.entity.XYItemEntity(shape33, (org.jfree.data.xy.XYDataset) timeSeriesCollection35, 10, 0, "", "12/31/69");
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer42 = combinedDomainXYPlot4.getRendererForDataset((org.jfree.data.xy.XYDataset) timeSeriesCollection35);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer45 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection46 = categoryPlot43.getDomainMarkers((int) 'a', layer45);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        categoryPlot43.setDataset(4, categoryDataset48);
        org.jfree.chart.axis.AxisSpace axisSpace50 = categoryPlot43.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        org.jfree.chart.util.Layer layer54 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot43.drawRangeMarkers(graphics2D51, rectangle2D52, 0, layer54);
        double double56 = categoryPlot43.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset58 = null;
        categoryPlot43.setDataset(11, categoryDataset58);
        org.jfree.chart.LegendItemCollection legendItemCollection60 = categoryPlot43.getLegendItems();
        org.jfree.chart.plot.PlotOrientation plotOrientation61 = categoryPlot43.getOrientation();
        combinedDomainXYPlot4.setOrientation(plotOrientation61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot0 and categoryPlot43", categoryPlot0.equals(categoryPlot43) ? categoryPlot0.hashCode() == categoryPlot43.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test127");
        org.jfree.chart.title.TextTitle textTitle1 = new org.jfree.chart.title.TextTitle("");
        boolean boolean2 = textTitle1.getExpandToFitSpace();
        textTitle1.setText("");
        java.lang.String str5 = textTitle1.getID();
        java.awt.Font font6 = textTitle1.getFont();
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.entity.EntityCollection entityCollection8 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = new org.jfree.chart.ChartRenderingInfo(entityCollection8);
        java.awt.Paint paint10 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean11 = chartRenderingInfo9.equals((java.lang.Object) paint10);
        java.awt.geom.Rectangle2D rectangle2D12 = chartRenderingInfo9.getChartArea();
        textTitle1.draw(graphics2D7, rectangle2D12);
        org.jfree.chart.entity.ChartEntity chartEntity16 = new org.jfree.chart.entity.ChartEntity((java.awt.Shape) rectangle2D12, "", "null");
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup18 = piePlot17.getDatasetGroup();
        int int19 = piePlot17.getBackgroundImageAlignment();
        boolean boolean20 = piePlot17.getAutoPopulateSectionOutlineStroke();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer23 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer23.clearSeriesStrokes(false);
        boolean boolean26 = xYAreaRenderer23.getPlotLines();
        boolean boolean27 = xYAreaRenderer23.getBaseItemLabelsVisible();
        java.awt.Paint paint29 = org.jfree.chart.plot.WaferMapPlot.DEFAULT_CROSSHAIR_PAINT;
        xYAreaRenderer23.setSeriesFillPaint(7, paint29);
        piePlot17.setSectionPaint((java.lang.Comparable) (byte) 10, paint29);
        piePlot17.setMinimumArcAngleToDraw((double) 3600000L);
        piePlot17.setLabelGap((double) 4);
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot40 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis39);
        java.awt.Graphics2D graphics2D41 = null;
        org.jfree.chart.entity.EntityCollection entityCollection42 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo43 = new org.jfree.chart.ChartRenderingInfo(entityCollection42);
        java.awt.Paint paint44 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean45 = chartRenderingInfo43.equals((java.lang.Object) paint44);
        java.awt.geom.Rectangle2D rectangle2D46 = chartRenderingInfo43.getChartArea();
        java.util.List list47 = null;
        combinedDomainXYPlot40.drawDomainGridlines(graphics2D41, rectangle2D46, list47);
        combinedDomainXYPlot40.clearSelection();
        org.jfree.chart.util.RectangleEdge rectangleEdge51 = combinedDomainXYPlot40.getRangeAxisEdge(15);
        double double52 = piePlot17.getRectX((double) (-256), (double) 2147483647, (double) 2958465, rectangleEdge51);
        double double53 = org.jfree.chart.util.RectangleEdge.coordinate(rectangle2D12, rectangleEdge51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo9 and chartRenderingInfo43", chartRenderingInfo9.equals(chartRenderingInfo43) ? chartRenderingInfo9.hashCode() == chartRenderingInfo43.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test128");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        boolean boolean18 = combinedDomainXYPlot1.isRangeCrosshairVisible();
        boolean boolean19 = combinedDomainXYPlot1.isDomainCrosshairVisible();
        java.util.TimeZone timeZone20 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection21 = new org.jfree.data.time.TimeSeriesCollection(timeZone20);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot22.clearAnnotations();
        timeSeriesCollection21.removeChangeListener((org.jfree.data.general.DatasetChangeListener) categoryPlot22);
        org.jfree.data.general.DatasetGroup datasetGroup25 = timeSeriesCollection21.getGroup();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = combinedDomainXYPlot1.getRendererForDataset((org.jfree.data.xy.XYDataset) timeSeriesCollection21);
        java.awt.Stroke stroke27 = combinedDomainXYPlot1.getDomainGridlineStroke();
        java.awt.geom.GeneralPath generalPath28 = null;
        org.jfree.data.time.Year year31 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year33 = new org.jfree.data.time.Year((int) (short) 0);
        long long34 = year33.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis35 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year31, (org.jfree.data.time.RegularTimePeriod) year33);
        float float36 = periodAxis35.getMinorTickMarkInsideLength();
        java.awt.Graphics2D graphics2D37 = null;
        org.jfree.chart.axis.AxisState axisState38 = new org.jfree.chart.axis.AxisState();
        double double39 = axisState38.getMax();
        java.util.List list40 = axisState38.getTicks();
        org.jfree.chart.entity.EntityCollection entityCollection41 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo42 = new org.jfree.chart.ChartRenderingInfo(entityCollection41);
        java.awt.Paint paint43 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean44 = chartRenderingInfo42.equals((java.lang.Object) paint43);
        java.awt.geom.Rectangle2D rectangle2D45 = chartRenderingInfo42.getChartArea();
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer48 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection49 = categoryPlot46.getDomainMarkers((int) 'a', layer48);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        categoryPlot46.setDataset(4, categoryDataset51);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier53 = categoryPlot46.getDrawingSupplier();
        categoryPlot46.configureDomainAxes();
        org.jfree.chart.axis.AxisSpace axisSpace55 = null;
        categoryPlot46.setFixedDomainAxisSpace(axisSpace55);
        categoryPlot46.setCrosshairDatasetIndex((int) (short) 100);
        categoryPlot46.setBackgroundAlpha((float) 8);
        org.jfree.chart.util.RectangleEdge rectangleEdge61 = categoryPlot46.getDomainAxisEdge();
        java.util.List list62 = periodAxis35.refreshTicks(graphics2D37, axisState38, rectangle2D45, rectangleEdge61);
        org.jfree.chart.RenderingSource renderingSource63 = null;
        combinedDomainXYPlot1.select(generalPath28, rectangle2D45, renderingSource63);
        org.jfree.chart.plot.CategoryPlot categoryPlot65 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer67 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection68 = categoryPlot65.getDomainMarkers((int) 'a', layer67);
        java.awt.Paint paint69 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        categoryPlot65.setOutlinePaint(paint69);
        categoryPlot65.setRangeCrosshairValue((double) 15);
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot73 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        java.awt.Paint paint74 = combinedDomainXYPlot73.getRangeGridlinePaint();
        org.jfree.chart.plot.PolarPlot polarPlot75 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Font font76 = polarPlot75.getAngleLabelFont();
        org.jfree.chart.axis.ValueAxis valueAxis77 = polarPlot75.getAxis();
        org.jfree.chart.entity.EntityCollection entityCollection79 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo80 = new org.jfree.chart.ChartRenderingInfo(entityCollection79);
        java.awt.Paint paint81 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean82 = chartRenderingInfo80.equals((java.lang.Object) paint81);
        java.awt.geom.Rectangle2D rectangle2D83 = chartRenderingInfo80.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo84 = chartRenderingInfo80.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo85 = plotRenderingInfo84.getOwner();
        java.awt.geom.Point2D point2D86 = null;
        polarPlot75.zoomDomainAxes((double) (byte) 1, plotRenderingInfo84, point2D86, false);
        java.awt.Stroke stroke89 = polarPlot75.getRadiusGridlineStroke();
        combinedDomainXYPlot73.setRangeZeroBaselineStroke(stroke89);
        categoryPlot65.setRangeZeroBaselineStroke(stroke89);
        combinedDomainXYPlot1.setDomainZeroBaselineStroke(stroke89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo42 and chartRenderingInfo80", chartRenderingInfo42.equals(chartRenderingInfo80) ? chartRenderingInfo42.hashCode() == chartRenderingInfo80.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test129");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        boolean boolean4 = xYAreaRenderer1.getPlotLines();
        org.jfree.chart.title.LegendTitle legendTitle5 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource) xYAreaRenderer1);
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot7 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis6);
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.entity.EntityCollection entityCollection9 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo10 = new org.jfree.chart.ChartRenderingInfo(entityCollection9);
        java.awt.Paint paint11 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean12 = chartRenderingInfo10.equals((java.lang.Object) paint11);
        java.awt.geom.Rectangle2D rectangle2D13 = chartRenderingInfo10.getChartArea();
        java.util.List list14 = null;
        combinedDomainXYPlot7.drawDomainGridlines(graphics2D8, rectangle2D13, list14);
        org.jfree.chart.axis.NumberAxis numberAxis17 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity20 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D13, (org.jfree.chart.axis.Axis) numberAxis17, "", "DatasetRenderingOrder.FORWARD");
        numberAxis17.setMinorTickMarkInsideLength((float) 60000L);
        java.text.NumberFormat numberFormat23 = numberAxis17.getNumberFormatOverride();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = numberAxis17.getTickLabelInsets();
        legendTitle5.setItemLabelPadding(rectangleInsets24);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer27 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer27.clearSeriesStrokes(false);
        boolean boolean30 = xYAreaRenderer27.getPlotLines();
        org.jfree.chart.title.LegendTitle legendTitle31 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource) xYAreaRenderer27);
        org.jfree.chart.util.RectangleEdge rectangleEdge32 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str33 = rectangleEdge32.toString();
        legendTitle31.setLegendItemGraphicEdge(rectangleEdge32);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        double double36 = rectangleInsets35.getLeft();
        double double38 = rectangleInsets35.calculateLeftOutset((double) 0L);
        legendTitle31.setLegendItemGraphicPadding(rectangleInsets35);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = legendTitle31.getLegendItemGraphicPadding();
        org.jfree.chart.title.TextTitle textTitle42 = new org.jfree.chart.title.TextTitle("");
        boolean boolean43 = textTitle42.getExpandToFitSpace();
        textTitle42.setText("");
        java.lang.String str46 = textTitle42.getID();
        java.awt.Font font47 = textTitle42.getFont();
        java.awt.Graphics2D graphics2D48 = null;
        org.jfree.chart.entity.EntityCollection entityCollection49 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo50 = new org.jfree.chart.ChartRenderingInfo(entityCollection49);
        java.awt.Paint paint51 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean52 = chartRenderingInfo50.equals((java.lang.Object) paint51);
        java.awt.geom.Rectangle2D rectangle2D53 = chartRenderingInfo50.getChartArea();
        textTitle42.draw(graphics2D48, rectangle2D53);
        legendTitle31.setBounds(rectangle2D53);
        org.jfree.chart.LegendItemSource[] legendItemSourceArray56 = new org.jfree.chart.LegendItemSource[] {};
        legendTitle31.setSources(legendItemSourceArray56);
        legendTitle5.setSources(legendItemSourceArray56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo10 and chartRenderingInfo50", chartRenderingInfo10.equals(chartRenderingInfo50) ? chartRenderingInfo10.hashCode() == chartRenderingInfo50.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test130");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        boolean boolean4 = xYAreaRenderer1.getPlotLines();
        boolean boolean5 = xYAreaRenderer1.getBaseItemLabelsVisible();
        java.awt.Paint paint6 = xYAreaRenderer1.getBasePaint();
        java.awt.Font font7 = xYAreaRenderer1.getBaseItemLabelFont();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator8 = null;
        xYAreaRenderer1.setBaseItemLabelGenerator(xYItemLabelGenerator8);
        xYAreaRenderer1.setUseFillPaint(true);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot14 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis13);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer16.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator19 = null;
        xYAreaRenderer16.setLegendItemURLGenerator(xYSeriesLabelGenerator19);
        xYAreaRenderer16.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean27 = xYAreaRenderer16.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot14.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer16);
        combinedDomainXYPlot14.clearDomainMarkers();
        boolean boolean30 = combinedDomainXYPlot14.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.NumberAxis numberAxis32 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis32.pan((double) 1);
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot36 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis35);
        java.awt.Graphics2D graphics2D37 = null;
        org.jfree.chart.entity.EntityCollection entityCollection38 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo39 = new org.jfree.chart.ChartRenderingInfo(entityCollection38);
        java.awt.Paint paint40 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean41 = chartRenderingInfo39.equals((java.lang.Object) paint40);
        java.awt.geom.Rectangle2D rectangle2D42 = chartRenderingInfo39.getChartArea();
        java.util.List list43 = null;
        combinedDomainXYPlot36.drawDomainGridlines(graphics2D37, rectangle2D42, list43);
        org.jfree.chart.axis.NumberAxis numberAxis46 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity49 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D42, (org.jfree.chart.axis.Axis) numberAxis46, "", "DatasetRenderingOrder.FORWARD");
        xYAreaRenderer1.drawDomainGridLine(graphics2D12, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot14, (org.jfree.chart.axis.ValueAxis) numberAxis32, rectangle2D42, (double) 11);
        numberAxis32.setLabelToolTip("{0}: ({1}, {2})");
        numberAxis32.setRange(0.0d, (double) 1L);
        double double57 = numberAxis32.getLowerMargin();
        org.jfree.chart.plot.Plot plot58 = numberAxis32.getPlot();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot59 = new org.jfree.chart.plot.CombinedDomainXYPlot((org.jfree.chart.axis.ValueAxis) numberAxis32);
        boolean boolean60 = combinedDomainXYPlot59.isRangeZoomable();
        boolean boolean61 = combinedDomainXYPlot59.isDomainZoomable();
        org.jfree.chart.util.RectangleEdge rectangleEdge63 = combinedDomainXYPlot59.getRangeAxisEdge(1);
        java.awt.Graphics2D graphics2D64 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot65 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.axis.NumberAxis numberAxis68 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis68.pan((double) 1);
        numberAxis68.setTickLabelsVisible(false);
        combinedDomainXYPlot65.setRangeAxis(255, (org.jfree.chart.axis.ValueAxis) numberAxis68);
        java.awt.geom.GeneralPath generalPath74 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot75 = new org.jfree.chart.plot.CategoryPlot();
        int int76 = categoryPlot75.getDatasetCount();
        categoryPlot75.setAnchorValue((double) 10.0f);
        java.awt.Graphics2D graphics2D79 = null;
        org.jfree.chart.entity.EntityCollection entityCollection80 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo81 = new org.jfree.chart.ChartRenderingInfo(entityCollection80);
        java.awt.Paint paint82 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean83 = chartRenderingInfo81.equals((java.lang.Object) paint82);
        java.awt.geom.Rectangle2D rectangle2D84 = chartRenderingInfo81.getChartArea();
        org.jfree.chart.title.TextTitle textTitle86 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity87 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D84, (org.jfree.chart.title.Title) textTitle86);
        org.jfree.chart.axis.AxisSpace axisSpace88 = categoryPlot75.calculateAxisSpace(graphics2D79, rectangle2D84);
        org.jfree.chart.RenderingSource renderingSource89 = null;
        combinedDomainXYPlot65.select(generalPath74, rectangle2D84, renderingSource89);
        combinedDomainXYPlot59.drawZeroRangeBaseline(graphics2D64, rectangle2D84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo39 and chartRenderingInfo81", chartRenderingInfo39.equals(chartRenderingInfo81) ? chartRenderingInfo39.hashCode() == chartRenderingInfo81.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test131");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke1 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot0.setRangeCrosshairStroke(stroke1);
        java.awt.geom.Point2D point2D3 = combinedRangeXYPlot0.getQuadrantOrigin();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot5 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.entity.EntityCollection entityCollection8 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = new org.jfree.chart.ChartRenderingInfo(entityCollection8);
        java.awt.Paint paint10 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean11 = chartRenderingInfo9.equals((java.lang.Object) paint10);
        java.awt.geom.Rectangle2D rectangle2D12 = chartRenderingInfo9.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = chartRenderingInfo9.getPlotInfo();
        combinedRangeXYPlot5.handleClick(11, (-9999), plotRenderingInfo13);
        org.jfree.chart.entity.EntityCollection entityCollection15 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = new org.jfree.chart.ChartRenderingInfo(entityCollection15);
        java.awt.Paint paint17 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean18 = chartRenderingInfo16.equals((java.lang.Object) paint17);
        java.awt.geom.Rectangle2D rectangle2D19 = chartRenderingInfo16.getChartArea();
        org.jfree.chart.title.TextTitle textTitle21 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity22 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D19, (org.jfree.chart.title.Title) textTitle21);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D24 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D19, rectangleAnchor23);
        combinedRangeXYPlot0.zoomDomainAxes((double) 9223372036854775807L, plotRenderingInfo13, point2D24, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo9 and chartRenderingInfo16", chartRenderingInfo9.equals(chartRenderingInfo16) ? chartRenderingInfo9.hashCode() == chartRenderingInfo16.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test132");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder25 = combinedDomainXYPlot1.getSeriesRenderingOrder();
        combinedDomainXYPlot1.setDomainGridlinesVisible(false);
        combinedDomainXYPlot1.setRangeGridlinesVisible(false);
        combinedDomainXYPlot1.setDomainCrosshairValue(0.025d, true);
        org.jfree.chart.entity.EntityCollection entityCollection35 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo36 = new org.jfree.chart.ChartRenderingInfo(entityCollection35);
        java.awt.Paint paint37 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean38 = chartRenderingInfo36.equals((java.lang.Object) paint37);
        java.awt.geom.Rectangle2D rectangle2D39 = chartRenderingInfo36.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = chartRenderingInfo36.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo41 = plotRenderingInfo40.getOwner();
        org.jfree.chart.entity.EntityCollection entityCollection42 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo43 = new org.jfree.chart.ChartRenderingInfo(entityCollection42);
        java.awt.Paint paint44 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean45 = chartRenderingInfo43.equals((java.lang.Object) paint44);
        java.awt.geom.Rectangle2D rectangle2D46 = chartRenderingInfo43.getChartArea();
        org.jfree.chart.title.TextTitle textTitle48 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity49 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D46, (org.jfree.chart.title.Title) textTitle48);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor50 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D51 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D46, rectangleAnchor50);
        combinedDomainXYPlot1.zoomRangeAxes((double) 100.0f, (double) 5, plotRenderingInfo40, point2D51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo36 and chartRenderingInfo43", chartRenderingInfo36.equals(chartRenderingInfo43) ? chartRenderingInfo36.hashCode() == chartRenderingInfo43.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test133");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator4 = null;
        xYAreaRenderer1.setLegendItemURLGenerator(xYSeriesLabelGenerator4);
        xYAreaRenderer1.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean10 = xYAreaRenderer1.isSeriesVisible((-16777216));
        java.awt.Shape shape11 = xYAreaRenderer1.getBaseShape();
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape11, 0.0d, (double) '#');
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot15 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.lang.Object obj16 = combinedRangeXYPlot15.clone();
        double double17 = combinedRangeXYPlot15.getGap();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = combinedRangeXYPlot15.getRenderer(4);
        combinedRangeXYPlot15.clearRangeMarkers((int) 'a');
        org.jfree.chart.entity.PlotEntity plotEntity24 = new org.jfree.chart.entity.PlotEntity(shape11, (org.jfree.chart.plot.Plot) combinedRangeXYPlot15, "Last", "null");
        org.jfree.chart.plot.Plot plot25 = plotEntity24.getPlot();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot25 and obj16", plot25.equals(obj16) ? plot25.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test134");
        org.jfree.chart.axis.NumberAxis numberAxis1 = new org.jfree.chart.axis.NumberAxis("");
        int int2 = numberAxis1.getMinorTickCount();
        numberAxis1.setMinorTickMarksVisible(true);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer7 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer7.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator10 = null;
        xYAreaRenderer7.setLegendItemURLGenerator(xYSeriesLabelGenerator10);
        xYAreaRenderer7.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) false);
        xYAreaRenderer7.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator18 = null;
        xYAreaRenderer7.setSeriesURLGenerator((int) (short) 100, xYURLGenerator18, false);
        java.awt.Paint paint24 = xYAreaRenderer7.getItemFillPaint((int) (short) 10, (int) 'a', true);
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot27 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis26);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer29 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer29.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator32 = null;
        xYAreaRenderer29.setLegendItemURLGenerator(xYSeriesLabelGenerator32);
        xYAreaRenderer29.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean40 = xYAreaRenderer29.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot27.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer29);
        boolean boolean42 = combinedDomainXYPlot27.canSelectByPoint();
        org.jfree.chart.axis.NumberAxis numberAxis44 = new org.jfree.chart.axis.NumberAxis("");
        int int45 = numberAxis44.getMinorTickCount();
        numberAxis44.setMinorTickMarksVisible(true);
        org.jfree.chart.entity.EntityCollection entityCollection48 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo49 = new org.jfree.chart.ChartRenderingInfo(entityCollection48);
        java.awt.Paint paint50 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean51 = chartRenderingInfo49.equals((java.lang.Object) paint50);
        java.awt.geom.Rectangle2D rectangle2D52 = chartRenderingInfo49.getChartArea();
        org.jfree.chart.title.TextTitle textTitle54 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity55 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D52, (org.jfree.chart.title.Title) textTitle54);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor56 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D57 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D52, rectangleAnchor56);
        java.awt.Paint paint59 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_PAINT;
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot60 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke61 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot60.setRangeCrosshairStroke(stroke61);
        xYAreaRenderer7.drawDomainLine(graphics2D25, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot27, (org.jfree.chart.axis.ValueAxis) numberAxis44, rectangle2D52, (double) 60000L, paint59, stroke61);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer65 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer65.clearSeriesStrokes(false);
        boolean boolean68 = xYAreaRenderer65.getPlotLines();
        org.jfree.chart.title.LegendTitle legendTitle69 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource) xYAreaRenderer65);
        org.jfree.chart.util.RectangleEdge rectangleEdge70 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str71 = rectangleEdge70.toString();
        legendTitle69.setLegendItemGraphicEdge(rectangleEdge70);
        double double73 = numberAxis1.java2DToValue(149.0d, rectangle2D52, rectangleEdge70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer7 and xYAreaRenderer29", xYAreaRenderer7.equals(xYAreaRenderer29) ? xYAreaRenderer7.hashCode() == xYAreaRenderer29.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test135");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection1 = combinedRangeXYPlot0.getLegendItems();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot2 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        double double3 = combinedRangeXYPlot2.getGap();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = combinedRangeXYPlot2.getLegendItems();
        legendItemCollection1.addAll(legendItemCollection4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on combinedRangeXYPlot0 and combinedRangeXYPlot2", combinedRangeXYPlot0.equals(combinedRangeXYPlot2) ? combinedRangeXYPlot0.hashCode() == combinedRangeXYPlot2.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test136");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        boolean boolean4 = xYAreaRenderer1.getPlotLines();
        boolean boolean5 = xYAreaRenderer1.getBaseItemLabelsVisible();
        java.awt.Paint paint6 = xYAreaRenderer1.getBasePaint();
        java.awt.Font font7 = xYAreaRenderer1.getBaseItemLabelFont();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator8 = null;
        xYAreaRenderer1.setBaseItemLabelGenerator(xYItemLabelGenerator8);
        xYAreaRenderer1.setUseFillPaint(true);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot14 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis13);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer16.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator19 = null;
        xYAreaRenderer16.setLegendItemURLGenerator(xYSeriesLabelGenerator19);
        xYAreaRenderer16.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean27 = xYAreaRenderer16.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot14.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer16);
        combinedDomainXYPlot14.clearDomainMarkers();
        boolean boolean30 = combinedDomainXYPlot14.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.NumberAxis numberAxis32 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis32.pan((double) 1);
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot36 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis35);
        java.awt.Graphics2D graphics2D37 = null;
        org.jfree.chart.entity.EntityCollection entityCollection38 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo39 = new org.jfree.chart.ChartRenderingInfo(entityCollection38);
        java.awt.Paint paint40 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean41 = chartRenderingInfo39.equals((java.lang.Object) paint40);
        java.awt.geom.Rectangle2D rectangle2D42 = chartRenderingInfo39.getChartArea();
        java.util.List list43 = null;
        combinedDomainXYPlot36.drawDomainGridlines(graphics2D37, rectangle2D42, list43);
        org.jfree.chart.axis.NumberAxis numberAxis46 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity49 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D42, (org.jfree.chart.axis.Axis) numberAxis46, "", "DatasetRenderingOrder.FORWARD");
        xYAreaRenderer1.drawDomainGridLine(graphics2D12, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot14, (org.jfree.chart.axis.ValueAxis) numberAxis32, rectangle2D42, (double) 11);
        numberAxis32.setLabelToolTip("{0}: ({1}, {2})");
        org.jfree.chart.text.TextLine textLine55 = new org.jfree.chart.text.TextLine("hi!");
        org.jfree.chart.text.TextFragment textFragment56 = textLine55.getLastTextFragment();
        java.awt.Font font57 = textFragment56.getFont();
        numberAxis32.setLabelFont(font57);
        numberAxis32.configure();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer66 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean68 = xYAreaRenderer66.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint69 = xYAreaRenderer66.getBaseLegendTextPaint();
        java.awt.Stroke stroke71 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer66.setSeriesOutlineStroke(0, stroke71, false);
        java.awt.Font font75 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        xYAreaRenderer66.setSeriesItemLabelFont(0, font75);
        org.jfree.chart.block.LabelBlock labelBlock77 = new org.jfree.chart.block.LabelBlock("LGPL", font75);
        java.lang.String str78 = labelBlock77.getToolTipText();
        java.lang.String str79 = labelBlock77.getURLText();
        double double80 = labelBlock77.getContentYOffset();
        java.awt.Font font81 = labelBlock77.getFont();
        org.jfree.chart.axis.MarkerAxisBand markerAxisBand82 = new org.jfree.chart.axis.MarkerAxisBand(numberAxis32, (double) '4', (double) 7, 3.6E8d, 15.0d, font81);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer16 and xYAreaRenderer66", xYAreaRenderer16.equals(xYAreaRenderer66) ? xYAreaRenderer16.hashCode() == xYAreaRenderer66.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test137");
        org.jfree.chart.util.StrokeList strokeList0 = new org.jfree.chart.util.StrokeList();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer2 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer2.clearSeriesStrokes(false);
        boolean boolean5 = xYAreaRenderer2.getPlotLines();
        boolean boolean6 = xYAreaRenderer2.getBaseItemLabelsVisible();
        java.awt.Paint paint7 = xYAreaRenderer2.getBasePaint();
        java.awt.Font font8 = xYAreaRenderer2.getBaseItemLabelFont();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator9 = null;
        xYAreaRenderer2.setBaseItemLabelGenerator(xYItemLabelGenerator9);
        xYAreaRenderer2.setUseFillPaint(true);
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot15 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis14);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer17 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer17.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator20 = null;
        xYAreaRenderer17.setLegendItemURLGenerator(xYSeriesLabelGenerator20);
        xYAreaRenderer17.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean28 = xYAreaRenderer17.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot15.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer17);
        combinedDomainXYPlot15.clearDomainMarkers();
        boolean boolean31 = combinedDomainXYPlot15.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.NumberAxis numberAxis33 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis33.pan((double) 1);
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot37 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis36);
        java.awt.Graphics2D graphics2D38 = null;
        org.jfree.chart.entity.EntityCollection entityCollection39 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo40 = new org.jfree.chart.ChartRenderingInfo(entityCollection39);
        java.awt.Paint paint41 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean42 = chartRenderingInfo40.equals((java.lang.Object) paint41);
        java.awt.geom.Rectangle2D rectangle2D43 = chartRenderingInfo40.getChartArea();
        java.util.List list44 = null;
        combinedDomainXYPlot37.drawDomainGridlines(graphics2D38, rectangle2D43, list44);
        org.jfree.chart.axis.NumberAxis numberAxis47 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity50 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D43, (org.jfree.chart.axis.Axis) numberAxis47, "", "DatasetRenderingOrder.FORWARD");
        xYAreaRenderer2.drawDomainGridLine(graphics2D13, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot15, (org.jfree.chart.axis.ValueAxis) numberAxis33, rectangle2D43, (double) 11);
        numberAxis33.setLabelToolTip("{0}: ({1}, {2})");
        org.jfree.chart.text.TextLine textLine56 = new org.jfree.chart.text.TextLine("hi!");
        org.jfree.chart.text.TextFragment textFragment57 = textLine56.getLastTextFragment();
        java.awt.Font font58 = textFragment57.getFont();
        numberAxis33.setLabelFont(font58);
        boolean boolean60 = strokeList0.equals((java.lang.Object) numberAxis33);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot61 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list62 = combinedRangeXYPlot61.getSubplots();
        java.awt.Color color66 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer68 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean70 = xYAreaRenderer68.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint71 = xYAreaRenderer68.getBaseLegendTextPaint();
        java.awt.Stroke stroke73 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer68.setSeriesOutlineStroke(0, stroke73, false);
        java.awt.Color color78 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer80 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean82 = xYAreaRenderer80.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint83 = xYAreaRenderer80.getBaseLegendTextPaint();
        java.awt.Stroke stroke85 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer80.setSeriesOutlineStroke(0, stroke85, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker89 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color66, stroke73, (java.awt.Paint) color78, stroke85, (float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot90 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer92 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection93 = categoryPlot90.getRangeMarkers(7, layer92);
        java.lang.Object obj94 = null;
        boolean boolean95 = layer92.equals(obj94);
        boolean boolean97 = combinedRangeXYPlot61.removeRangeMarker(255, (org.jfree.chart.plot.Marker) intervalMarker89, layer92, false);
        boolean boolean98 = strokeList0.equals((java.lang.Object) 255);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer17 and xYAreaRenderer68", xYAreaRenderer17.equals(xYAreaRenderer68) ? xYAreaRenderer17.hashCode() == xYAreaRenderer68.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test138");
        org.jfree.chart.title.TextTitle textTitle1 = new org.jfree.chart.title.TextTitle("");
        boolean boolean2 = textTitle1.getExpandToFitSpace();
        textTitle1.setText("");
        java.lang.String str5 = textTitle1.getID();
        java.awt.Font font6 = textTitle1.getFont();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer8 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer8.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator11 = null;
        xYAreaRenderer8.setLegendItemURLGenerator(xYSeriesLabelGenerator11);
        xYAreaRenderer8.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) false);
        xYAreaRenderer8.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator19 = null;
        xYAreaRenderer8.setSeriesURLGenerator((int) (short) 100, xYURLGenerator19, false);
        java.awt.Paint paint25 = xYAreaRenderer8.getItemFillPaint((int) (short) 10, (int) 'a', true);
        textTitle1.setBackgroundPaint(paint25);
        java.awt.Color color27 = java.awt.Color.BLUE;
        textTitle1.setPaint((java.awt.Paint) color27);
        java.awt.Color color31 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer33 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean35 = xYAreaRenderer33.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint36 = xYAreaRenderer33.getBaseLegendTextPaint();
        java.awt.Stroke stroke38 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer33.setSeriesOutlineStroke(0, stroke38, false);
        java.awt.Color color43 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer45 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean47 = xYAreaRenderer45.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint48 = xYAreaRenderer45.getBaseLegendTextPaint();
        java.awt.Stroke stroke50 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer45.setSeriesOutlineStroke(0, stroke50, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker54 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color31, stroke38, (java.awt.Paint) color43, stroke50, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor55 = org.jfree.chart.text.TextAnchor.BASELINE_LEFT;
        intervalMarker54.setLabelTextAnchor(textAnchor55);
        java.lang.String str57 = intervalMarker54.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent58 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker) intervalMarker54);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent59 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker) intervalMarker54);
        org.jfree.chart.util.RectangleInsets rectangleInsets60 = intervalMarker54.getLabelOffset();
        java.lang.String str61 = rectangleInsets60.toString();
        textTitle1.setPadding(rectangleInsets60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer8 and xYAreaRenderer33", xYAreaRenderer8.equals(xYAreaRenderer33) ? xYAreaRenderer8.hashCode() == xYAreaRenderer33.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test139");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer5 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer5.clearSeriesStrokes(false);
        boolean boolean8 = xYAreaRenderer5.getPlotLines();
        org.jfree.chart.title.LegendTitle legendTitle9 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource) xYAreaRenderer5);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str11 = rectangleEdge10.toString();
        legendTitle9.setLegendItemGraphicEdge(rectangleEdge10);
        org.jfree.chart.title.TextTitle textTitle14 = new org.jfree.chart.title.TextTitle("");
        boolean boolean15 = textTitle14.getExpandToFitSpace();
        textTitle14.setText("");
        java.lang.String str18 = textTitle14.getID();
        java.awt.Font font19 = textTitle14.getFont();
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.entity.EntityCollection entityCollection21 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = new org.jfree.chart.ChartRenderingInfo(entityCollection21);
        java.awt.Paint paint23 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean24 = chartRenderingInfo22.equals((java.lang.Object) paint23);
        java.awt.geom.Rectangle2D rectangle2D25 = chartRenderingInfo22.getChartArea();
        textTitle14.draw(graphics2D20, rectangle2D25);
        legendTitle9.setBounds(rectangle2D25);
        java.awt.Paint paint28 = org.jfree.chart.text.TextFragment.DEFAULT_PAINT;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot29 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup31 = piePlot30.getDatasetGroup();
        int int32 = piePlot30.getBackgroundImageAlignment();
        boolean boolean33 = piePlot30.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        piePlot30.createAndAddEntity(rectangle2D34, plotRenderingInfo35, "hi!", "LGPL");
        java.awt.Paint paint39 = piePlot30.getLabelPaint();
        java.awt.Stroke stroke40 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        piePlot30.setOutlineStroke(stroke40);
        combinedDomainXYPlot29.setDomainMinorGridlineStroke(stroke40);
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D45 = new org.jfree.chart.renderer.category.BarRenderer3D((double) 0.0f, (double) 100L);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator46 = barRenderer3D45.getBaseToolTipGenerator();
        java.awt.Paint paint47 = barRenderer3D45.getBaseItemLabelPaint();
        org.jfree.chart.LegendItem legendItem48 = new org.jfree.chart.LegendItem("PlotOrientation.VERTICAL", "[Dec 31, 1969 4:00:00 PM --> Dec 31, 1969 4:00:00 PM]", "WMAP_Plot", "hi!", (java.awt.Shape) rectangle2D25, paint28, stroke40, paint47);
        org.jfree.chart.urls.StandardXYURLGenerator standardXYURLGenerator50 = new org.jfree.chart.urls.StandardXYURLGenerator("RectangleEdge.RIGHT");
        org.jfree.chart.block.BorderArrangement borderArrangement51 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone52 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection53 = new org.jfree.data.time.TimeSeriesCollection(timeZone52);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer55 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement51, (org.jfree.data.general.Dataset) timeSeriesCollection53, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState56 = timeSeriesCollection53.getSelectionState();
        java.lang.Number number57 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection53);
        java.lang.Object obj58 = timeSeriesCollection53.clone();
        org.jfree.data.xy.IntervalXYDelegate intervalXYDelegate60 = new org.jfree.data.xy.IntervalXYDelegate((org.jfree.data.xy.XYDataset) timeSeriesCollection53, true);
        java.lang.String str63 = standardXYURLGenerator50.generateURL((org.jfree.data.xy.XYDataset) timeSeriesCollection53, 5, 11);
        legendItem48.setDataset((org.jfree.data.general.Dataset) timeSeriesCollection53);
        org.jfree.data.Range range66 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) timeSeriesCollection53, true);
        java.util.TimeZone timeZone67 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection68 = new org.jfree.data.time.TimeSeriesCollection(timeZone67);
        java.text.DateFormat dateFormat70 = null;
        java.text.DateFormat dateFormat71 = null;
        org.jfree.chart.labels.StandardXYToolTipGenerator standardXYToolTipGenerator72 = new org.jfree.chart.labels.StandardXYToolTipGenerator("[10.0, 0.0]", dateFormat70, dateFormat71);
        boolean boolean73 = timeSeriesCollection68.equals((java.lang.Object) "[10.0, 0.0]");
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent74 = null;
        timeSeriesCollection68.seriesChanged(seriesChangeEvent74);
        double double77 = timeSeriesCollection68.getDomainUpperBound(true);
        java.util.List list78 = timeSeriesCollection68.getSeries();
        org.jfree.data.Range range80 = timeSeriesCollection53.getDomainBounds(list78, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeriesCollection53 and timeSeriesCollection68", timeSeriesCollection53.equals(timeSeriesCollection68) ? timeSeriesCollection53.hashCode() == timeSeriesCollection68.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test140");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot1.getDatasetGroup();
        int int3 = piePlot1.getBackgroundImageAlignment();
        boolean boolean4 = piePlot1.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.createAndAddEntity(rectangle2D5, plotRenderingInfo6, "hi!", "LGPL");
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        piePlot1.setOutlineStroke(stroke11);
        combinedDomainXYPlot0.setDomainMinorGridlineStroke(stroke11);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot14 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list15 = combinedRangeXYPlot14.getSubplots();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot17 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis16);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer19 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer19.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator22 = null;
        xYAreaRenderer19.setLegendItemURLGenerator(xYSeriesLabelGenerator22);
        xYAreaRenderer19.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean30 = xYAreaRenderer19.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot17.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer19);
        combinedDomainXYPlot17.clearDomainMarkers();
        java.awt.Font font34 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint35 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer38 = null;
        org.jfree.chart.text.TextBlock textBlock39 = org.jfree.chart.text.TextUtilities.createTextBlock("", font34, paint35, (float) (-1L), (int) (short) -1, textMeasurer38);
        combinedDomainXYPlot17.setDomainCrosshairPaint(paint35);
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup42 = piePlot41.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener43 = null;
        piePlot41.addChangeListener(plotChangeListener43);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent45 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) piePlot41);
        combinedDomainXYPlot17.plotChanged(plotChangeEvent45);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType47 = plotChangeEvent45.getType();
        combinedRangeXYPlot14.plotChanged(plotChangeEvent45);
        combinedDomainXYPlot0.plotChanged(plotChangeEvent45);
        org.jfree.chart.plot.CategoryPlot categoryPlot52 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot52.clearAnnotations();
        java.util.List list54 = categoryPlot52.getAnnotations();
        org.jfree.chart.plot.PolarPlot polarPlot57 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Font font58 = polarPlot57.getAngleLabelFont();
        org.jfree.chart.axis.ValueAxis valueAxis59 = polarPlot57.getAxis();
        org.jfree.chart.entity.EntityCollection entityCollection61 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo62 = new org.jfree.chart.ChartRenderingInfo(entityCollection61);
        java.awt.Paint paint63 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean64 = chartRenderingInfo62.equals((java.lang.Object) paint63);
        java.awt.geom.Rectangle2D rectangle2D65 = chartRenderingInfo62.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo66 = chartRenderingInfo62.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo67 = plotRenderingInfo66.getOwner();
        java.awt.geom.Point2D point2D68 = null;
        polarPlot57.zoomDomainAxes((double) (byte) 1, plotRenderingInfo66, point2D68, false);
        categoryPlot52.handleClick(2958465, (int) (byte) 10, plotRenderingInfo66);
        int int72 = plotRenderingInfo66.getSubplotCount();
        org.jfree.chart.entity.EntityCollection entityCollection75 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo76 = new org.jfree.chart.ChartRenderingInfo(entityCollection75);
        java.awt.Paint paint77 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean78 = chartRenderingInfo76.equals((java.lang.Object) paint77);
        java.awt.geom.Rectangle2D rectangle2D79 = chartRenderingInfo76.getChartArea();
        org.jfree.chart.title.TextTitle textTitle81 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity82 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D79, (org.jfree.chart.title.Title) textTitle81);
        java.awt.geom.Point2D point2D83 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(45.0d, (double) (byte) 1, rectangle2D79);
        combinedDomainXYPlot0.zoomRangeAxes((double) (byte) -1, 0.0d, plotRenderingInfo66, point2D83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo62 and chartRenderingInfo76", chartRenderingInfo62.equals(chartRenderingInfo76) ? chartRenderingInfo62.hashCode() == chartRenderingInfo76.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test141");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot1.getDatasetGroup();
        int int3 = piePlot1.getBackgroundImageAlignment();
        boolean boolean4 = piePlot1.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.createAndAddEntity(rectangle2D5, plotRenderingInfo6, "hi!", "LGPL");
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        piePlot1.setOutlineStroke(stroke11);
        combinedDomainXYPlot0.setDomainMinorGridlineStroke(stroke11);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer15 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer15.clearSeriesStrokes(false);
        boolean boolean18 = xYAreaRenderer15.getPlotLines();
        boolean boolean19 = xYAreaRenderer15.getBaseItemLabelsVisible();
        java.awt.Paint paint20 = xYAreaRenderer15.getBasePaint();
        java.awt.Font font21 = xYAreaRenderer15.getBaseItemLabelFont();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator22 = null;
        xYAreaRenderer15.setBaseItemLabelGenerator(xYItemLabelGenerator22);
        xYAreaRenderer15.setUseFillPaint(true);
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot28 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis27);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer30 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer30.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator33 = null;
        xYAreaRenderer30.setLegendItemURLGenerator(xYSeriesLabelGenerator33);
        xYAreaRenderer30.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean41 = xYAreaRenderer30.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot28.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer30);
        combinedDomainXYPlot28.clearDomainMarkers();
        boolean boolean44 = combinedDomainXYPlot28.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.NumberAxis numberAxis46 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis46.pan((double) 1);
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot50 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis49);
        java.awt.Graphics2D graphics2D51 = null;
        org.jfree.chart.entity.EntityCollection entityCollection52 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo53 = new org.jfree.chart.ChartRenderingInfo(entityCollection52);
        java.awt.Paint paint54 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean55 = chartRenderingInfo53.equals((java.lang.Object) paint54);
        java.awt.geom.Rectangle2D rectangle2D56 = chartRenderingInfo53.getChartArea();
        java.util.List list57 = null;
        combinedDomainXYPlot50.drawDomainGridlines(graphics2D51, rectangle2D56, list57);
        org.jfree.chart.axis.NumberAxis numberAxis60 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity63 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D56, (org.jfree.chart.axis.Axis) numberAxis60, "", "DatasetRenderingOrder.FORWARD");
        xYAreaRenderer15.drawDomainGridLine(graphics2D26, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot28, (org.jfree.chart.axis.ValueAxis) numberAxis46, rectangle2D56, (double) 11);
        numberAxis46.setLabelToolTip("{0}: ({1}, {2})");
        org.jfree.chart.text.TextLine textLine69 = new org.jfree.chart.text.TextLine("hi!");
        org.jfree.chart.text.TextFragment textFragment70 = textLine69.getLastTextFragment();
        java.awt.Font font71 = textFragment70.getFont();
        numberAxis46.setLabelFont(font71);
        org.jfree.data.Range range73 = combinedDomainXYPlot0.getDataRange((org.jfree.chart.axis.ValueAxis) numberAxis46);
        org.jfree.chart.entity.EntityCollection entityCollection76 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo77 = new org.jfree.chart.ChartRenderingInfo(entityCollection76);
        java.awt.Paint paint78 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean79 = chartRenderingInfo77.equals((java.lang.Object) paint78);
        java.awt.geom.Rectangle2D rectangle2D80 = chartRenderingInfo77.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo81 = chartRenderingInfo77.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo82 = plotRenderingInfo81.getOwner();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo83 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo82);
        combinedDomainXYPlot0.handleClick((-241), 5, plotRenderingInfo83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo53 and chartRenderingInfo77", chartRenderingInfo53.equals(chartRenderingInfo77) ? chartRenderingInfo53.hashCode() == chartRenderingInfo77.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test142");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        double double4 = categoryPlot0.getAnchorValue();
        java.lang.String str5 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer7 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer7.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator10 = null;
        xYAreaRenderer7.setLegendItemURLGenerator(xYSeriesLabelGenerator10);
        xYAreaRenderer7.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) false);
        xYAreaRenderer7.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator18 = null;
        xYAreaRenderer7.setSeriesURLGenerator((int) (short) 100, xYURLGenerator18, false);
        java.awt.Paint paint24 = xYAreaRenderer7.getItemFillPaint((int) (short) 10, (int) 'a', true);
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot27 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis26);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer29 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer29.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator32 = null;
        xYAreaRenderer29.setLegendItemURLGenerator(xYSeriesLabelGenerator32);
        xYAreaRenderer29.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean40 = xYAreaRenderer29.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot27.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer29);
        boolean boolean42 = combinedDomainXYPlot27.canSelectByPoint();
        org.jfree.chart.axis.NumberAxis numberAxis44 = new org.jfree.chart.axis.NumberAxis("");
        int int45 = numberAxis44.getMinorTickCount();
        numberAxis44.setMinorTickMarksVisible(true);
        org.jfree.chart.entity.EntityCollection entityCollection48 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo49 = new org.jfree.chart.ChartRenderingInfo(entityCollection48);
        java.awt.Paint paint50 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean51 = chartRenderingInfo49.equals((java.lang.Object) paint50);
        java.awt.geom.Rectangle2D rectangle2D52 = chartRenderingInfo49.getChartArea();
        org.jfree.chart.title.TextTitle textTitle54 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity55 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D52, (org.jfree.chart.title.Title) textTitle54);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor56 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D57 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D52, rectangleAnchor56);
        java.awt.Paint paint59 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_PAINT;
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot60 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke61 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot60.setRangeCrosshairStroke(stroke61);
        xYAreaRenderer7.drawDomainLine(graphics2D25, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot27, (org.jfree.chart.axis.ValueAxis) numberAxis44, rectangle2D52, (double) 60000L, paint59, stroke61);
        categoryPlot0.setOutlineStroke(stroke61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer7 and xYAreaRenderer29", xYAreaRenderer7.equals(xYAreaRenderer29) ? xYAreaRenderer7.hashCode() == xYAreaRenderer29.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test143");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str6 = rectangleEdge5.toString();
        double double7 = categoryPlot0.getRectX((double) '4', (double) 'a', (double) 'a', rectangleEdge5);
        boolean boolean8 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot0.getDomainAxis(10);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot13 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis12);
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.entity.EntityCollection entityCollection15 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = new org.jfree.chart.ChartRenderingInfo(entityCollection15);
        java.awt.Paint paint17 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean18 = chartRenderingInfo16.equals((java.lang.Object) paint17);
        java.awt.geom.Rectangle2D rectangle2D19 = chartRenderingInfo16.getChartArea();
        java.util.List list20 = null;
        combinedDomainXYPlot13.drawDomainGridlines(graphics2D14, rectangle2D19, list20);
        org.jfree.chart.axis.NumberAxis numberAxis23 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity26 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D19, (org.jfree.chart.axis.Axis) numberAxis23, "", "DatasetRenderingOrder.FORWARD");
        numberAxis23.centerRange(10.0d);
        org.jfree.data.Range range29 = categoryPlot0.getDataRange((org.jfree.chart.axis.ValueAxis) numberAxis23);
        numberAxis23.setAutoRangeStickyZero(false);
        org.jfree.chart.block.LabelBlock labelBlock34 = new org.jfree.chart.block.LabelBlock("RectangleEdge.RIGHT");
        java.lang.String str35 = labelBlock34.getToolTipText();
        java.awt.geom.Rectangle2D rectangle2D36 = labelBlock34.getBounds();
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer39 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection40 = categoryPlot37.getDomainMarkers((int) 'a', layer39);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        categoryPlot37.setDataset(4, categoryDataset42);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = categoryPlot37.getDrawingSupplier();
        categoryPlot37.configureDomainAxes();
        org.jfree.chart.axis.AxisSpace axisSpace46 = null;
        categoryPlot37.setFixedDomainAxisSpace(axisSpace46);
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D49 = new org.jfree.chart.axis.CategoryAxis3D("hi!");
        categoryPlot37.setDomainAxis((org.jfree.chart.axis.CategoryAxis) categoryAxis3D49);
        categoryAxis3D49.configure();
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot58 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis57);
        java.awt.Graphics2D graphics2D59 = null;
        org.jfree.chart.entity.EntityCollection entityCollection60 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo61 = new org.jfree.chart.ChartRenderingInfo(entityCollection60);
        java.awt.Paint paint62 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean63 = chartRenderingInfo61.equals((java.lang.Object) paint62);
        java.awt.geom.Rectangle2D rectangle2D64 = chartRenderingInfo61.getChartArea();
        java.util.List list65 = null;
        combinedDomainXYPlot58.drawDomainGridlines(graphics2D59, rectangle2D64, list65);
        org.jfree.chart.axis.NumberAxis numberAxis68 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity71 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D64, (org.jfree.chart.axis.Axis) numberAxis68, "", "DatasetRenderingOrder.FORWARD");
        org.jfree.chart.plot.CategoryPlot categoryPlot72 = new org.jfree.chart.plot.CategoryPlot();
        int int73 = categoryPlot72.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge77 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str78 = rectangleEdge77.toString();
        double double79 = categoryPlot72.getRectX((double) '4', (double) 'a', (double) 'a', rectangleEdge77);
        boolean boolean80 = categoryPlot72.isRangeZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis82 = categoryPlot72.getDomainAxis(10);
        org.jfree.chart.util.RectangleEdge rectangleEdge83 = categoryPlot72.getDomainAxisEdge();
        double double84 = categoryAxis3D49.getCategorySeriesMiddle(11, (int) ' ', (int) (byte) 0, (int) (short) 100, 0.0d, rectangle2D64, rectangleEdge83);
        double double85 = numberAxis23.valueToJava2D(15.0d, rectangle2D36, rectangleEdge83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot0 and categoryPlot72", categoryPlot0.equals(categoryPlot72) ? categoryPlot0.hashCode() == categoryPlot72.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test144");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone1 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection2 = new org.jfree.data.time.TimeSeriesCollection(timeZone1);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer4 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement0, (org.jfree.data.general.Dataset) timeSeriesCollection2, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState5 = timeSeriesCollection2.getSelectionState();
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection2);
        java.lang.Object obj7 = timeSeriesCollection2.clone();
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection2);
        org.jfree.data.general.DatasetGroup datasetGroup9 = timeSeriesCollection2.getGroup();
        org.jfree.chart.axis.NumberAxis numberAxis11 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.data.Range range13 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = new org.jfree.chart.block.RectangleConstraint(0.0d, range13);
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) (-1L), 0.0d);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) (-1L), 0.0d);
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range17, range20);
        org.jfree.data.Range range22 = org.jfree.chart.axis.ValueAxis.DEFAULT_RANGE;
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range17, range22);
        org.jfree.chart.block.RectangleConstraint rectangleConstraint24 = rectangleConstraint14.toRangeWidth(range17);
        numberAxis11.setRangeWithMargins(range17, false, true);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot29 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis28);
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.entity.EntityCollection entityCollection31 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo32 = new org.jfree.chart.ChartRenderingInfo(entityCollection31);
        java.awt.Paint paint33 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean34 = chartRenderingInfo32.equals((java.lang.Object) paint33);
        java.awt.geom.Rectangle2D rectangle2D35 = chartRenderingInfo32.getChartArea();
        java.util.List list36 = null;
        combinedDomainXYPlot29.drawDomainGridlines(graphics2D30, rectangle2D35, list36);
        org.jfree.chart.axis.NumberAxis numberAxis39 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity42 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D35, (org.jfree.chart.axis.Axis) numberAxis39, "", "DatasetRenderingOrder.FORWARD");
        numberAxis39.centerRange(10.0d);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer46 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer46.clearSeriesStrokes(false);
        boolean boolean49 = xYAreaRenderer46.getPlotLines();
        xYAreaRenderer46.setBaseSeriesVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot52 = new org.jfree.chart.plot.XYPlot((org.jfree.data.xy.XYDataset) timeSeriesCollection2, (org.jfree.chart.axis.ValueAxis) numberAxis11, (org.jfree.chart.axis.ValueAxis) numberAxis39, (org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer46);
        org.jfree.chart.plot.PiePlot piePlot53 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup54 = piePlot53.getDatasetGroup();
        int int55 = piePlot53.getBackgroundImageAlignment();
        boolean boolean56 = piePlot53.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D57 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo58 = null;
        piePlot53.createAndAddEntity(rectangle2D57, plotRenderingInfo58, "hi!", "LGPL");
        piePlot53.setStartAngle((double) 1);
        org.jfree.data.xy.XYDataItem xYDataItem66 = new org.jfree.data.xy.XYDataItem((double) (byte) 10, (double) 0);
        java.awt.Color color69 = java.awt.Color.getColor("hi!", (int) (short) 100);
        boolean boolean70 = xYDataItem66.equals((java.lang.Object) "hi!");
        java.awt.Color color71 = java.awt.Color.MAGENTA;
        piePlot53.setSectionPaint((java.lang.Comparable) "hi!", (java.awt.Paint) color71);
        java.awt.Graphics2D graphics2D73 = null;
        org.jfree.chart.entity.EntityCollection entityCollection74 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo75 = new org.jfree.chart.ChartRenderingInfo(entityCollection74);
        java.awt.Paint paint76 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean77 = chartRenderingInfo75.equals((java.lang.Object) paint76);
        java.awt.geom.Rectangle2D rectangle2D78 = chartRenderingInfo75.getChartArea();
        piePlot53.drawBackgroundImage(graphics2D73, rectangle2D78);
        piePlot53.clearSectionOutlinePaints(false);
        org.jfree.chart.labels.StandardPieSectionLabelGenerator standardPieSectionLabelGenerator83 = new org.jfree.chart.labels.StandardPieSectionLabelGenerator("RectangleEdge.RIGHT");
        org.jfree.chart.plot.CategoryPlot categoryPlot84 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer86 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection87 = categoryPlot84.getDomainMarkers((int) 'a', layer86);
        org.jfree.data.category.CategoryDataset categoryDataset89 = null;
        categoryPlot84.setDataset(4, categoryDataset89);
        org.jfree.chart.axis.AxisSpace axisSpace91 = categoryPlot84.getFixedDomainAxisSpace();
        boolean boolean92 = standardPieSectionLabelGenerator83.equals((java.lang.Object) axisSpace91);
        piePlot53.setLegendLabelGenerator((org.jfree.chart.labels.PieSectionLabelGenerator) standardPieSectionLabelGenerator83);
        timeSeriesCollection2.removeChangeListener((org.jfree.data.general.DatasetChangeListener) piePlot53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo32 and chartRenderingInfo75", chartRenderingInfo32.equals(chartRenderingInfo75) ? chartRenderingInfo32.hashCode() == chartRenderingInfo75.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test145");
        org.jfree.chart.title.TextTitle textTitle1 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot3 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis2);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer5 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer5.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator8 = null;
        xYAreaRenderer5.setLegendItemURLGenerator(xYSeriesLabelGenerator8);
        xYAreaRenderer5.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean16 = xYAreaRenderer5.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot3.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer5);
        boolean boolean18 = combinedDomainXYPlot3.canSelectByPoint();
        org.jfree.chart.axis.AxisLocation axisLocation19 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        combinedDomainXYPlot3.setRangeAxisLocation(axisLocation19, true);
        boolean boolean22 = textTitle1.equals((java.lang.Object) combinedDomainXYPlot3);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType23 = org.jfree.chart.event.ChartChangeEventType.GENERAL;
        java.lang.String str24 = chartChangeEventType23.toString();
        boolean boolean25 = combinedDomainXYPlot3.equals((java.lang.Object) chartChangeEventType23);
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot27.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent29 = null;
        categoryPlot27.rendererChanged(rendererChangeEvent29);
        org.jfree.chart.entity.EntityCollection entityCollection32 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo33 = new org.jfree.chart.ChartRenderingInfo(entityCollection32);
        java.awt.Paint paint34 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean35 = chartRenderingInfo33.equals((java.lang.Object) paint34);
        java.awt.geom.Rectangle2D rectangle2D36 = chartRenderingInfo33.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = chartRenderingInfo33.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo38 = plotRenderingInfo37.getOwner();
        java.awt.geom.Point2D point2D39 = null;
        categoryPlot27.zoomRangeAxes(1.0E-8d, plotRenderingInfo37, point2D39, true);
        java.awt.geom.Rectangle2D rectangle2D42 = plotRenderingInfo37.getDataArea();
        org.jfree.data.xy.DefaultXYDataset defaultXYDataset43 = new org.jfree.data.xy.DefaultXYDataset();
        int int45 = defaultXYDataset43.indexOf((java.lang.Comparable) (-1L));
        int int46 = defaultXYDataset43.getSeriesCount();
        org.jfree.data.DomainOrder domainOrder47 = defaultXYDataset43.getDomainOrder();
        org.jfree.chart.axis.SegmentedTimeline segmentedTimeline48 = org.jfree.chart.axis.SegmentedTimeline.newMondayThroughFridayTimeline();
        long long50 = segmentedTimeline48.getTimeFromLong((long) (byte) 10);
        long long51 = segmentedTimeline48.getSegmentSize();
        org.jfree.chart.axis.SegmentedTimeline segmentedTimeline52 = org.jfree.chart.axis.SegmentedTimeline.newMondayThroughFridayTimeline();
        boolean boolean55 = segmentedTimeline52.containsDomainRange((long) 1, (long) (byte) 10);
        long long57 = segmentedTimeline52.toTimelineValue((long) '#');
        java.util.List list58 = segmentedTimeline52.getExceptionSegments();
        segmentedTimeline48.setExceptionSegments(list58);
        org.jfree.data.Range range61 = org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds((org.jfree.data.xy.XYDataset) defaultXYDataset43, list58, false);
        combinedDomainXYPlot3.drawRangeGridlines(graphics2D26, rectangle2D42, list58);
        org.jfree.chart.axis.AxisSpace axisSpace63 = new org.jfree.chart.axis.AxisSpace();
        axisSpace63.setTop(0.0d);
        double double66 = axisSpace63.getBottom();
        org.jfree.chart.plot.CategoryPlot categoryPlot68 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot68.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent70 = null;
        categoryPlot68.rendererChanged(rendererChangeEvent70);
        org.jfree.chart.util.RectangleInsets rectangleInsets72 = categoryPlot68.getAxisOffset();
        org.jfree.chart.util.RectangleEdge rectangleEdge74 = categoryPlot68.getRangeAxisEdge((int) (byte) -1);
        axisSpace63.ensureAtLeast(5.0d, rectangleEdge74);
        combinedDomainXYPlot3.setFixedRangeAxisSpace(axisSpace63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot27 and categoryPlot68", categoryPlot27.equals(categoryPlot68) ? categoryPlot27.hashCode() == categoryPlot68.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test146");
        org.jfree.chart.axis.NumberAxis numberAxis1 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis1.pan((double) 1);
        org.jfree.chart.entity.EntityCollection entityCollection7 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo8 = new org.jfree.chart.ChartRenderingInfo(entityCollection7);
        java.awt.Paint paint9 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean10 = chartRenderingInfo8.equals((java.lang.Object) paint9);
        java.awt.geom.Rectangle2D rectangle2D11 = chartRenderingInfo8.getChartArea();
        org.jfree.chart.title.TextTitle textTitle13 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity14 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D11, (org.jfree.chart.title.Title) textTitle13);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D16 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D11, rectangleAnchor15);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity23 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D11, pieDataset17, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot25 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis24);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer27 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer27.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator30 = null;
        xYAreaRenderer27.setLegendItemURLGenerator(xYSeriesLabelGenerator30);
        xYAreaRenderer27.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean38 = xYAreaRenderer27.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot25.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer27);
        combinedDomainXYPlot25.clearDomainMarkers();
        java.awt.Font font42 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint43 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer46 = null;
        org.jfree.chart.text.TextBlock textBlock47 = org.jfree.chart.text.TextUtilities.createTextBlock("", font42, paint43, (float) (-1L), (int) (short) -1, textMeasurer46);
        combinedDomainXYPlot25.setDomainCrosshairPaint(paint43);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder49 = combinedDomainXYPlot25.getSeriesRenderingOrder();
        java.awt.Paint paint50 = org.jfree.chart.plot.PolarPlot.DEFAULT_GRIDLINE_PAINT;
        combinedDomainXYPlot25.setRangeTickBandPaint(paint50);
        org.jfree.chart.title.LegendGraphic legendGraphic52 = new org.jfree.chart.title.LegendGraphic((java.awt.Shape) rectangle2D11, paint50);
        java.awt.geom.Point2D point2D53 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((double) 10L, (double) 1577894400035L, rectangle2D11);
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup55 = piePlot54.getDatasetGroup();
        int int56 = piePlot54.getBackgroundImageAlignment();
        boolean boolean57 = piePlot54.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D58 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo59 = null;
        piePlot54.createAndAddEntity(rectangle2D58, plotRenderingInfo59, "hi!", "LGPL");
        piePlot54.setStartAngle((double) 1);
        org.jfree.data.xy.XYDataItem xYDataItem67 = new org.jfree.data.xy.XYDataItem((double) (byte) 10, (double) 0);
        java.awt.Color color70 = java.awt.Color.getColor("hi!", (int) (short) 100);
        boolean boolean71 = xYDataItem67.equals((java.lang.Object) "hi!");
        java.awt.Color color72 = java.awt.Color.MAGENTA;
        piePlot54.setSectionPaint((java.lang.Comparable) "hi!", (java.awt.Paint) color72);
        java.awt.Graphics2D graphics2D74 = null;
        org.jfree.chart.entity.EntityCollection entityCollection75 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo76 = new org.jfree.chart.ChartRenderingInfo(entityCollection75);
        java.awt.Paint paint77 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean78 = chartRenderingInfo76.equals((java.lang.Object) paint77);
        java.awt.geom.Rectangle2D rectangle2D79 = chartRenderingInfo76.getChartArea();
        piePlot54.drawBackgroundImage(graphics2D74, rectangle2D79);
        org.jfree.chart.plot.CategoryPlot categoryPlot81 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer83 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection84 = categoryPlot81.getDomainMarkers((int) 'a', layer83);
        org.jfree.data.category.CategoryDataset categoryDataset86 = null;
        categoryPlot81.setDataset(4, categoryDataset86);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier88 = categoryPlot81.getDrawingSupplier();
        categoryPlot81.configureDomainAxes();
        org.jfree.chart.axis.AxisSpace axisSpace90 = null;
        categoryPlot81.setFixedDomainAxisSpace(axisSpace90);
        categoryPlot81.setCrosshairDatasetIndex((int) (short) 100);
        categoryPlot81.setBackgroundAlpha((float) 8);
        org.jfree.chart.util.RectangleEdge rectangleEdge96 = categoryPlot81.getDomainAxisEdge();
        double double97 = org.jfree.chart.util.RectangleEdge.coordinate(rectangle2D79, rectangleEdge96);
        double double98 = numberAxis1.valueToJava2D((double) (-16777116), rectangle2D11, rectangleEdge96);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo8 and chartRenderingInfo76", chartRenderingInfo8.equals(chartRenderingInfo76) ? chartRenderingInfo8.hashCode() == chartRenderingInfo76.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test147");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator4 = null;
        xYAreaRenderer1.setLegendItemURLGenerator(xYSeriesLabelGenerator4);
        xYAreaRenderer1.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) false);
        xYAreaRenderer1.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator12 = null;
        xYAreaRenderer1.setSeriesURLGenerator((int) (short) 100, xYURLGenerator12, false);
        java.awt.Paint paint18 = xYAreaRenderer1.getItemFillPaint((int) (short) 10, (int) 'a', true);
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot21 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis20);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer23 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer23.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator26 = null;
        xYAreaRenderer23.setLegendItemURLGenerator(xYSeriesLabelGenerator26);
        xYAreaRenderer23.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean34 = xYAreaRenderer23.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot21.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer23);
        boolean boolean36 = combinedDomainXYPlot21.canSelectByPoint();
        org.jfree.chart.axis.NumberAxis numberAxis38 = new org.jfree.chart.axis.NumberAxis("");
        int int39 = numberAxis38.getMinorTickCount();
        numberAxis38.setMinorTickMarksVisible(true);
        org.jfree.chart.entity.EntityCollection entityCollection42 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo43 = new org.jfree.chart.ChartRenderingInfo(entityCollection42);
        java.awt.Paint paint44 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean45 = chartRenderingInfo43.equals((java.lang.Object) paint44);
        java.awt.geom.Rectangle2D rectangle2D46 = chartRenderingInfo43.getChartArea();
        org.jfree.chart.title.TextTitle textTitle48 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity49 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D46, (org.jfree.chart.title.Title) textTitle48);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor50 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D51 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D46, rectangleAnchor50);
        java.awt.Paint paint53 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_PAINT;
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot54 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke55 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot54.setRangeCrosshairStroke(stroke55);
        xYAreaRenderer1.drawDomainLine(graphics2D19, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot21, (org.jfree.chart.axis.ValueAxis) numberAxis38, rectangle2D46, (double) 60000L, paint53, stroke55);
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D58 = new org.jfree.chart.renderer.category.BarRenderer3D();
        java.awt.Font font62 = barRenderer3D58.getItemLabelFont((int) (byte) -1, (int) (byte) 1, false);
        java.awt.Shape shape63 = barRenderer3D58.getBaseShape();
        barRenderer3D58.setBaseSeriesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis66 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot67 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis66);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer69 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer69.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator72 = null;
        xYAreaRenderer69.setLegendItemURLGenerator(xYSeriesLabelGenerator72);
        xYAreaRenderer69.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean80 = xYAreaRenderer69.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot67.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer69);
        org.jfree.chart.axis.ValueAxis valueAxis82 = null;
        int int83 = combinedDomainXYPlot67.getRangeAxisIndex(valueAxis82);
        boolean boolean84 = combinedDomainXYPlot67.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets85 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        double double86 = rectangleInsets85.getLeft();
        double double88 = rectangleInsets85.calculateLeftOutset((double) 0L);
        combinedDomainXYPlot67.setAxisOffset(rectangleInsets85);
        combinedDomainXYPlot67.setDomainGridlinesVisible(false);
        java.awt.Paint paint92 = combinedDomainXYPlot67.getNoDataMessagePaint();
        barRenderer3D58.setBaseItemLabelPaint(paint92, false);
        boolean boolean95 = numberAxis38.equals((java.lang.Object) barRenderer3D58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer23", xYAreaRenderer1.equals(xYAreaRenderer23) ? xYAreaRenderer1.hashCode() == xYAreaRenderer23.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test148");
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D1 = new org.jfree.chart.axis.CategoryAxis3D("hi!");
        categoryAxis3D1.setLabelURL("EXPAND");
        categoryAxis3D1.configure();
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions5 = categoryAxis3D1.getCategoryLabelPositions();
        org.jfree.data.time.Year year10 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year12 = new org.jfree.data.time.Year((int) (short) 0);
        long long13 = year12.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis14 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year10, (org.jfree.data.time.RegularTimePeriod) year12);
        org.jfree.chart.entity.EntityCollection entityCollection16 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = new org.jfree.chart.ChartRenderingInfo(entityCollection16);
        java.awt.Paint paint18 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean19 = chartRenderingInfo17.equals((java.lang.Object) paint18);
        java.awt.geom.Rectangle2D rectangle2D20 = chartRenderingInfo17.getChartArea();
        org.jfree.chart.title.TextTitle textTitle22 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity23 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D20, (org.jfree.chart.title.Title) textTitle22);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D25 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D20, rectangleAnchor24);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color27 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        categoryPlot26.setRangeZeroBaselinePaint((java.awt.Paint) color27);
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = categoryPlot26.getRangeAxisEdge((int) ' ');
        double double31 = periodAxis14.java2DToValue(0.0d, rectangle2D20, rectangleEdge30);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer33 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer33.clearSeriesStrokes(false);
        boolean boolean36 = xYAreaRenderer33.getPlotLines();
        org.jfree.chart.title.LegendTitle legendTitle37 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource) xYAreaRenderer33);
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str39 = rectangleEdge38.toString();
        legendTitle37.setLegendItemGraphicEdge(rectangleEdge38);
        double double41 = categoryAxis3D1.getCategoryStart(0, 10, rectangle2D20, rectangleEdge38);
        categoryAxis3D1.setVisible(false);
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.Color color50 = org.jfree.chart.ChartColor.VERY_DARK_RED;
        org.jfree.chart.block.BlockBorder blockBorder51 = new org.jfree.chart.block.BlockBorder(0.025d, (double) 2, (double) 9, (double) 1L, (java.awt.Paint) color50);
        org.jfree.chart.block.BorderArrangement borderArrangement52 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone53 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection54 = new org.jfree.data.time.TimeSeriesCollection(timeZone53);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer56 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement52, (org.jfree.data.general.Dataset) timeSeriesCollection54, (java.lang.Comparable) (byte) 10);
        java.lang.Object obj57 = legendItemBlockContainer56.clone();
        org.jfree.data.general.Dataset dataset58 = legendItemBlockContainer56.getDataset();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer60 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer60.clearSeriesStrokes(false);
        boolean boolean63 = xYAreaRenderer60.getPlotLines();
        org.jfree.chart.title.LegendTitle legendTitle64 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource) xYAreaRenderer60);
        org.jfree.chart.util.RectangleEdge rectangleEdge65 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str66 = rectangleEdge65.toString();
        legendTitle64.setLegendItemGraphicEdge(rectangleEdge65);
        org.jfree.chart.util.RectangleInsets rectangleInsets68 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        double double69 = rectangleInsets68.getLeft();
        double double71 = rectangleInsets68.calculateLeftOutset((double) 0L);
        legendTitle64.setLegendItemGraphicPadding(rectangleInsets68);
        legendItemBlockContainer56.add((org.jfree.chart.block.Block) legendTitle64);
        boolean boolean74 = blockBorder51.equals((java.lang.Object) legendItemBlockContainer56);
        java.lang.Comparable comparable75 = legendItemBlockContainer56.getSeriesKey();
        java.awt.geom.Rectangle2D rectangle2D76 = legendItemBlockContainer56.getBounds();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot77 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list78 = combinedRangeXYPlot77.getSubplots();
        combinedRangeXYPlot77.setGap((double) (-16777216));
        org.jfree.chart.util.RectangleEdge rectangleEdge81 = combinedRangeXYPlot77.getRangeAxisEdge();
        org.jfree.chart.axis.AxisState axisState82 = new org.jfree.chart.axis.AxisState();
        double double83 = axisState82.getMax();
        axisState82.cursorUp(0.0d);
        axisState82.cursorRight(1.0E-8d);
        axisState82.cursorRight(5.0d);
        categoryAxis3D1.drawTickMarks(graphics2D44, (double) (-2649600000L), rectangle2D76, rectangleEdge81, axisState82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemBlockContainer56 and obj57", legendItemBlockContainer56.equals(obj57) ? legendItemBlockContainer56.hashCode() == obj57.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test149");
        org.jfree.chart.plot.CrosshairState crosshairState0 = new org.jfree.chart.plot.CrosshairState();
        double double1 = crosshairState0.getAnchorY();
        double double2 = crosshairState0.getCrosshairDistance();
        org.jfree.chart.plot.PolarPlot polarPlot3 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Paint paint4 = polarPlot3.getAngleLabelPaint();
        org.jfree.chart.plot.PolarPlot polarPlot6 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Font font7 = polarPlot6.getAngleLabelFont();
        org.jfree.chart.axis.ValueAxis valueAxis8 = polarPlot6.getAxis();
        org.jfree.chart.entity.EntityCollection entityCollection10 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo11 = new org.jfree.chart.ChartRenderingInfo(entityCollection10);
        java.awt.Paint paint12 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean13 = chartRenderingInfo11.equals((java.lang.Object) paint12);
        java.awt.geom.Rectangle2D rectangle2D14 = chartRenderingInfo11.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = chartRenderingInfo11.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = plotRenderingInfo15.getOwner();
        java.awt.geom.Point2D point2D17 = null;
        polarPlot6.zoomDomainAxes((double) (byte) 1, plotRenderingInfo15, point2D17, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent22 = null;
        categoryPlot20.rendererChanged(rendererChangeEvent22);
        org.jfree.chart.entity.EntityCollection entityCollection25 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = new org.jfree.chart.ChartRenderingInfo(entityCollection25);
        java.awt.Paint paint27 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean28 = chartRenderingInfo26.equals((java.lang.Object) paint27);
        java.awt.geom.Rectangle2D rectangle2D29 = chartRenderingInfo26.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = chartRenderingInfo26.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo31 = plotRenderingInfo30.getOwner();
        java.awt.geom.Point2D point2D32 = null;
        categoryPlot20.zoomRangeAxes(1.0E-8d, plotRenderingInfo30, point2D32, true);
        plotRenderingInfo15.addSubplotInfo(plotRenderingInfo30);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot36 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke37 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot36.setRangeCrosshairStroke(stroke37);
        java.awt.geom.Point2D point2D39 = combinedRangeXYPlot36.getQuadrantOrigin();
        polarPlot3.zoomDomainAxes((double) (-9999), plotRenderingInfo15, point2D39);
        crosshairState0.setAnchor(point2D39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on polarPlot3 and polarPlot6", polarPlot3.equals(polarPlot6) ? polarPlot3.hashCode() == polarPlot6.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test150");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer11 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer11.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator14 = null;
        xYAreaRenderer11.setLegendItemURLGenerator(xYSeriesLabelGenerator14);
        xYAreaRenderer11.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean20 = xYAreaRenderer11.isSeriesVisible((-16777216));
        java.awt.Shape shape22 = xYAreaRenderer11.getLegendShape(0);
        java.awt.Shape shape24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        xYAreaRenderer11.setSeriesShape((int) (byte) 100, shape24, false);
        java.awt.Paint paint28 = xYAreaRenderer11.getSeriesItemLabelPaint(5);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer11);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator30 = null;
        xYAreaRenderer11.setBaseURLGenerator(xYURLGenerator30);
        java.awt.Color color32 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        xYAreaRenderer11.setBaseFillPaint((java.awt.Paint) color32);
        org.jfree.chart.axis.TickType tickType34 = org.jfree.chart.axis.TickType.MINOR;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer36 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer36.clearSeriesStrokes(false);
        boolean boolean39 = xYAreaRenderer36.getPlotLines();
        xYAreaRenderer36.setAutoPopulateSeriesStroke(false);
        boolean boolean42 = tickType34.equals((java.lang.Object) false);
        org.jfree.chart.urls.StandardXYURLGenerator standardXYURLGenerator43 = new org.jfree.chart.urls.StandardXYURLGenerator();
        boolean boolean44 = tickType34.equals((java.lang.Object) standardXYURLGenerator43);
        xYAreaRenderer11.setBaseURLGenerator((org.jfree.chart.urls.XYURLGenerator) standardXYURLGenerator43, false);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer48 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean50 = xYAreaRenderer48.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint51 = xYAreaRenderer48.getBaseLegendTextPaint();
        java.awt.Stroke stroke53 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer48.setSeriesOutlineStroke(0, stroke53, false);
        java.awt.Font font57 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        xYAreaRenderer48.setSeriesItemLabelFont(0, font57);
        xYAreaRenderer48.setBaseItemLabelsVisible(true, true);
        xYAreaRenderer48.setSeriesVisible((int) (short) 0, (java.lang.Boolean) true, false);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer67 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean69 = xYAreaRenderer67.isSeriesItemLabelsVisible((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition70 = xYAreaRenderer67.getBasePositiveItemLabelPosition();
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator72 = null;
        xYAreaRenderer67.setSeriesURLGenerator((int) '4', xYURLGenerator72, true);
        boolean boolean76 = xYAreaRenderer67.isSeriesVisibleInLegend(0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer78 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean80 = xYAreaRenderer78.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint82 = xYAreaRenderer78.getSeriesPaint(0);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator83 = xYAreaRenderer78.getLegendItemLabelGenerator();
        xYAreaRenderer67.setLegendItemLabelGenerator(xYSeriesLabelGenerator83);
        xYAreaRenderer48.setLegendItemURLGenerator(xYSeriesLabelGenerator83);
        xYAreaRenderer11.setLegendItemLabelGenerator(xYSeriesLabelGenerator83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer36 and xYAreaRenderer48", xYAreaRenderer36.equals(xYAreaRenderer48) ? xYAreaRenderer36.hashCode() == xYAreaRenderer48.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test151");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint4 = xYAreaRenderer1.getBaseLegendTextPaint();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer1.setSeriesOutlineStroke(0, stroke6, false);
        org.jfree.chart.LegendItem legendItem11 = xYAreaRenderer1.getLegendItem(8, (int) (byte) 10);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot14 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis13);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer16.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator19 = null;
        xYAreaRenderer16.setLegendItemURLGenerator(xYSeriesLabelGenerator19);
        xYAreaRenderer16.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean27 = xYAreaRenderer16.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot14.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer16);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        int int30 = combinedDomainXYPlot14.getRangeAxisIndex(valueAxis29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        combinedDomainXYPlot14.setDomainAxis(valueAxis31);
        combinedDomainXYPlot14.clearRangeMarkers();
        org.jfree.data.time.Year year36 = new org.jfree.data.time.Year((int) (short) 0);
        long long37 = year36.getFirstMillisecond();
        org.jfree.data.time.Year year39 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.chart.axis.PeriodAxis periodAxis40 = new org.jfree.chart.axis.PeriodAxis("RectangleEdge.RIGHT", (org.jfree.data.time.RegularTimePeriod) year36, (org.jfree.data.time.RegularTimePeriod) year39);
        org.jfree.data.time.Year year43 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year45 = new org.jfree.data.time.Year((int) (short) 0);
        long long46 = year45.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis47 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year43, (org.jfree.data.time.RegularTimePeriod) year45);
        periodAxis40.setLast((org.jfree.data.time.RegularTimePeriod) year45);
        java.awt.Stroke stroke49 = periodAxis40.getMinorTickMarkStroke();
        java.lang.Class class50 = periodAxis40.getMajorTickTimePeriodClass();
        org.jfree.chart.plot.Marker marker51 = null;
        org.jfree.chart.entity.EntityCollection entityCollection52 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo53 = new org.jfree.chart.ChartRenderingInfo(entityCollection52);
        java.awt.Paint paint54 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean55 = chartRenderingInfo53.equals((java.lang.Object) paint54);
        java.awt.geom.Rectangle2D rectangle2D56 = chartRenderingInfo53.getChartArea();
        org.jfree.chart.title.TextTitle textTitle58 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity59 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D56, (org.jfree.chart.title.Title) textTitle58);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor60 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D61 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D56, rectangleAnchor60);
        xYAreaRenderer1.drawDomainMarker(graphics2D12, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot14, (org.jfree.chart.axis.ValueAxis) periodAxis40, marker51, rectangle2D56);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer64 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer64.clearSeriesStrokes(false);
        boolean boolean67 = xYAreaRenderer64.getPlotLines();
        java.awt.Stroke stroke69 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYAreaRenderer64.setSeriesStroke((int) (short) 1, stroke69, true);
        org.jfree.chart.axis.ValueAxis valueAxis73 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot74 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis73);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer76 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer76.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator79 = null;
        xYAreaRenderer76.setLegendItemURLGenerator(xYSeriesLabelGenerator79);
        xYAreaRenderer76.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean87 = xYAreaRenderer76.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot74.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer76);
        java.awt.Stroke stroke89 = combinedDomainXYPlot74.getDomainCrosshairStroke();
        xYAreaRenderer64.setSeriesOutlineStroke((int) (short) 100, stroke89, false);
        combinedDomainXYPlot14.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer16", xYAreaRenderer1.equals(xYAreaRenderer16) ? xYAreaRenderer1.hashCode() == xYAreaRenderer16.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test152");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) 'a', layer2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setCrosshairDatasetIndex((int) (short) 10, true);
        java.awt.Paint paint8 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.entity.EntityCollection entityCollection11 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo12 = new org.jfree.chart.ChartRenderingInfo(entityCollection11);
        java.awt.Paint paint13 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean14 = chartRenderingInfo12.equals((java.lang.Object) paint13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = chartRenderingInfo12.getPlotInfo();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot16 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        int int17 = combinedDomainXYPlot16.getBackgroundImageAlignment();
        org.jfree.chart.entity.EntityCollection entityCollection18 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = new org.jfree.chart.ChartRenderingInfo(entityCollection18);
        java.awt.Paint paint20 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean21 = chartRenderingInfo19.equals((java.lang.Object) paint20);
        java.awt.geom.Rectangle2D rectangle2D22 = chartRenderingInfo19.getChartArea();
        org.jfree.chart.title.TextTitle textTitle24 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity25 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D22, (org.jfree.chart.title.Title) textTitle24);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D27 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D22, rectangleAnchor26);
        combinedDomainXYPlot16.setQuadrantOrigin(point2D27);
        categoryPlot0.zoomRangeAxes((double) 28799999L, (double) (-16777216), plotRenderingInfo15, point2D27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo12 and chartRenderingInfo19", chartRenderingInfo12.equals(chartRenderingInfo19) ? chartRenderingInfo12.hashCode() == chartRenderingInfo19.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test153");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((float) (byte) 0);
        org.jfree.chart.block.BorderArrangement borderArrangement2 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone3 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection4 = new org.jfree.data.time.TimeSeriesCollection(timeZone3);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer6 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement2, (org.jfree.data.general.Dataset) timeSeriesCollection4, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState7 = timeSeriesCollection4.getSelectionState();
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection4);
        org.jfree.chart.entity.XYItemEntity xYItemEntity13 = new org.jfree.chart.entity.XYItemEntity(shape1, (org.jfree.data.xy.XYDataset) timeSeriesCollection4, 7, (int) (byte) 10, "LGPL", "LGPL");
        java.util.TimeZone timeZone14 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection15 = new org.jfree.data.time.TimeSeriesCollection(timeZone14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.clearAnnotations();
        timeSeriesCollection15.removeChangeListener((org.jfree.data.general.DatasetChangeListener) categoryPlot16);
        org.jfree.data.general.DatasetGroup datasetGroup19 = timeSeriesCollection15.getGroup();
        xYItemEntity13.setDataset((org.jfree.data.xy.XYDataset) timeSeriesCollection15);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot22 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis21);
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.entity.EntityCollection entityCollection24 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = new org.jfree.chart.ChartRenderingInfo(entityCollection24);
        java.awt.Paint paint26 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean27 = chartRenderingInfo25.equals((java.lang.Object) paint26);
        java.awt.geom.Rectangle2D rectangle2D28 = chartRenderingInfo25.getChartArea();
        java.util.List list29 = null;
        combinedDomainXYPlot22.drawDomainGridlines(graphics2D23, rectangle2D28, list29);
        org.jfree.chart.axis.AxisSpace axisSpace31 = combinedDomainXYPlot22.getFixedRangeAxisSpace();
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer34 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection35 = categoryPlot32.getDomainMarkers((int) 'a', layer34);
        java.awt.Paint paint36 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        categoryPlot32.setOutlinePaint(paint36);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        int int39 = categoryPlot38.getDatasetCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation40 = categoryPlot38.getOrientation();
        categoryPlot32.setOrientation(plotOrientation40);
        combinedDomainXYPlot22.setOrientation(plotOrientation40);
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D43 = new org.jfree.chart.renderer.category.BarRenderer3D();
        java.awt.Font font47 = barRenderer3D43.getItemLabelFont((int) (byte) -1, (int) (byte) 1, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator49 = null;
        barRenderer3D43.setSeriesToolTipGenerator(15, categoryToolTipGenerator49, true);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType52 = org.jfree.chart.util.LengthAdjustmentType.EXPAND;
        boolean boolean53 = barRenderer3D43.equals((java.lang.Object) lengthAdjustmentType52);
        java.awt.Paint paint54 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_PAINT;
        barRenderer3D43.setBaseFillPaint(paint54, false);
        combinedDomainXYPlot22.setDomainMinorGridlinePaint(paint54);
        boolean boolean58 = xYItemEntity13.equals((java.lang.Object) combinedDomainXYPlot22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeriesCollection4 and timeSeriesCollection15", timeSeriesCollection4.equals(timeSeriesCollection15) ? timeSeriesCollection4.hashCode() == timeSeriesCollection15.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test154");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D17 = new org.jfree.chart.renderer.category.BarRenderer3D();
        java.awt.Font font21 = barRenderer3D17.getItemLabelFont((int) (byte) -1, (int) (byte) 1, false);
        java.awt.Shape shape22 = barRenderer3D17.getBaseShape();
        java.awt.Color color25 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer27 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean29 = xYAreaRenderer27.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint30 = xYAreaRenderer27.getBaseLegendTextPaint();
        java.awt.Stroke stroke32 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer27.setSeriesOutlineStroke(0, stroke32, false);
        java.awt.Color color37 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer39 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean41 = xYAreaRenderer39.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint42 = xYAreaRenderer39.getBaseLegendTextPaint();
        java.awt.Stroke stroke44 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer39.setSeriesOutlineStroke(0, stroke44, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker48 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color25, stroke32, (java.awt.Paint) color37, stroke44, (float) (byte) 1);
        barRenderer3D17.setBaseOutlineStroke(stroke32);
        boolean boolean50 = barRenderer3D17.getBaseCreateEntities();
        boolean boolean51 = barRenderer3D17.getBaseItemLabelsVisible();
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D55 = new org.jfree.chart.renderer.category.BarRenderer3D((double) 0.0f, (double) 100L);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator56 = null;
        barRenderer3D55.setLegendItemToolTipGenerator(categorySeriesLabelGenerator56);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator58 = null;
        barRenderer3D55.setBaseURLGenerator(categoryURLGenerator58, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition64 = barRenderer3D55.getPositiveItemLabelPosition(15, 1, true);
        barRenderer3D17.setSeriesPositiveItemLabelPosition((int) (short) 100, itemLabelPosition64);
        xYAreaRenderer3.setSeriesNegativeItemLabelPosition(0, itemLabelPosition64);
        org.jfree.chart.text.TextAnchor textAnchor67 = itemLabelPosition64.getRotationAnchor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer3 and xYAreaRenderer27", xYAreaRenderer3.equals(xYAreaRenderer27) ? xYAreaRenderer3.hashCode() == xYAreaRenderer27.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test155");
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        java.awt.Font font4 = barRenderer3D0.getItemLabelFont((int) (byte) -1, (int) (byte) 1, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        barRenderer3D0.setSeriesToolTipGenerator(15, categoryToolTipGenerator6, true);
        java.awt.Paint paint10 = barRenderer3D0.getSeriesItemLabelPaint(11);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer13 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection14 = categoryPlot11.getDomainMarkers((int) 'a', layer13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        categoryPlot11.setDataset(4, categoryDataset16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = categoryPlot11.getDrawingSupplier();
        barRenderer3D0.setPlot(categoryPlot11);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = null;
        barRenderer3D0.setSeriesURLGenerator(10, categoryURLGenerator21, false);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer26 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer26.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator29 = null;
        xYAreaRenderer26.setLegendItemURLGenerator(xYSeriesLabelGenerator29);
        xYAreaRenderer26.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean37 = xYAreaRenderer26.isItemLabelVisible((int) '#', (int) '#', true);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer39 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean41 = xYAreaRenderer39.isSeriesItemLabelsVisible((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = xYAreaRenderer39.getBasePositiveItemLabelPosition();
        xYAreaRenderer26.setBaseNegativeItemLabelPosition(itemLabelPosition42, false);
        barRenderer3D0.setSeriesPositiveItemLabelPosition(15, itemLabelPosition42, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer26 and xYAreaRenderer39", xYAreaRenderer26.equals(xYAreaRenderer39) ? xYAreaRenderer26.hashCode() == xYAreaRenderer39.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test156");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = xYAreaRenderer1.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator5 = null;
        xYAreaRenderer1.setBaseItemLabelGenerator(xYItemLabelGenerator5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot10 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis9);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer12 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer12.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator15 = null;
        xYAreaRenderer12.setLegendItemURLGenerator(xYSeriesLabelGenerator15);
        xYAreaRenderer12.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean23 = xYAreaRenderer12.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot10.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer12);
        combinedDomainXYPlot10.clearDomainMarkers();
        java.awt.Font font27 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint28 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer31 = null;
        org.jfree.chart.text.TextBlock textBlock32 = org.jfree.chart.text.TextUtilities.createTextBlock("", font27, paint28, (float) (-1L), (int) (short) -1, textMeasurer31);
        combinedDomainXYPlot10.setDomainCrosshairPaint(paint28);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder34 = combinedDomainXYPlot10.getSeriesRenderingOrder();
        combinedDomainXYPlot10.clearDomainMarkers();
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone37 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection38 = new org.jfree.data.time.TimeSeriesCollection(timeZone37);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer40 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement36, (org.jfree.data.general.Dataset) timeSeriesCollection38, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState41 = timeSeriesCollection38.getSelectionState();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        org.jfree.chart.renderer.xy.XYItemRendererState xYItemRendererState43 = xYAreaRenderer1.initialise(graphics2D7, rectangle2D8, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot10, (org.jfree.data.xy.XYDataset) timeSeriesCollection38, plotRenderingInfo42);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = xYItemRendererState43.getInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer12", xYAreaRenderer1.equals(xYAreaRenderer12) ? xYAreaRenderer1.hashCode() == xYAreaRenderer12.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test157");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        boolean boolean18 = combinedDomainXYPlot1.isRangeCrosshairVisible();
        boolean boolean19 = combinedDomainXYPlot1.isDomainMinorGridlinesVisible();
        java.awt.Paint paint20 = combinedDomainXYPlot1.getRangeZeroBaselinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot23 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis22);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer25 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer25.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator28 = null;
        xYAreaRenderer25.setLegendItemURLGenerator(xYSeriesLabelGenerator28);
        xYAreaRenderer25.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean36 = xYAreaRenderer25.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot23.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer25);
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        int int39 = combinedDomainXYPlot23.getRangeAxisIndex(valueAxis38);
        boolean boolean40 = combinedDomainXYPlot23.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        double double42 = rectangleInsets41.getLeft();
        double double44 = rectangleInsets41.calculateLeftOutset((double) 0L);
        combinedDomainXYPlot23.setAxisOffset(rectangleInsets41);
        combinedDomainXYPlot23.setDomainGridlinesVisible(false);
        java.awt.Paint paint48 = combinedDomainXYPlot23.getNoDataMessagePaint();
        boolean boolean49 = combinedDomainXYPlot23.canSelectByPoint();
        java.awt.Color color54 = org.jfree.chart.ChartColor.VERY_DARK_RED;
        org.jfree.chart.block.BlockBorder blockBorder55 = new org.jfree.chart.block.BlockBorder(0.025d, (double) 2, (double) 9, (double) 1L, (java.awt.Paint) color54);
        combinedDomainXYPlot23.setRangeZeroBaselinePaint((java.awt.Paint) color54);
        org.jfree.chart.entity.EntityCollection entityCollection58 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo59 = new org.jfree.chart.ChartRenderingInfo(entityCollection58);
        java.awt.Paint paint60 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean61 = chartRenderingInfo59.equals((java.lang.Object) paint60);
        java.awt.geom.Rectangle2D rectangle2D62 = chartRenderingInfo59.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo63 = chartRenderingInfo59.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo64 = plotRenderingInfo63.getOwner();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo65 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo64);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot66 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke67 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot66.setRangeCrosshairStroke(stroke67);
        java.awt.geom.Point2D point2D69 = combinedRangeXYPlot66.getQuadrantOrigin();
        combinedDomainXYPlot23.zoomRangeAxes(0.0d, plotRenderingInfo65, point2D69);
        org.jfree.chart.entity.EntityCollection entityCollection73 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo74 = new org.jfree.chart.ChartRenderingInfo(entityCollection73);
        java.awt.Paint paint75 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean76 = chartRenderingInfo74.equals((java.lang.Object) paint75);
        java.awt.geom.Rectangle2D rectangle2D77 = chartRenderingInfo74.getChartArea();
        org.jfree.chart.title.TextTitle textTitle79 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity80 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D77, (org.jfree.chart.title.Title) textTitle79);
        java.awt.geom.Point2D point2D81 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(45.0d, (double) (byte) 1, rectangle2D77);
        combinedDomainXYPlot1.zoomRangeAxes((double) (-9999), plotRenderingInfo65, point2D81);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo59 and chartRenderingInfo74", chartRenderingInfo59.equals(chartRenderingInfo74) ? chartRenderingInfo59.hashCode() == chartRenderingInfo74.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test158");
        org.jfree.chart.entity.EntityCollection entityCollection0 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo1 = new org.jfree.chart.ChartRenderingInfo(entityCollection0);
        java.awt.Paint paint2 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean3 = chartRenderingInfo1.equals((java.lang.Object) paint2);
        java.awt.geom.Rectangle2D rectangle2D4 = chartRenderingInfo1.getChartArea();
        org.jfree.chart.title.TextTitle textTitle6 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity7 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D4, (org.jfree.chart.title.Title) textTitle6);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D9 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D4, rectangleAnchor8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity16 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D4, pieDataset10, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot18 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis17);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer20 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer20.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator23 = null;
        xYAreaRenderer20.setLegendItemURLGenerator(xYSeriesLabelGenerator23);
        xYAreaRenderer20.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean31 = xYAreaRenderer20.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot18.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer20);
        combinedDomainXYPlot18.clearDomainMarkers();
        java.awt.Font font35 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint36 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer39 = null;
        org.jfree.chart.text.TextBlock textBlock40 = org.jfree.chart.text.TextUtilities.createTextBlock("", font35, paint36, (float) (-1L), (int) (short) -1, textMeasurer39);
        combinedDomainXYPlot18.setDomainCrosshairPaint(paint36);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder42 = combinedDomainXYPlot18.getSeriesRenderingOrder();
        java.awt.Paint paint43 = org.jfree.chart.plot.PolarPlot.DEFAULT_GRIDLINE_PAINT;
        combinedDomainXYPlot18.setRangeTickBandPaint(paint43);
        org.jfree.chart.title.LegendGraphic legendGraphic45 = new org.jfree.chart.title.LegendGraphic((java.awt.Shape) rectangle2D4, paint43);
        java.awt.Paint paint46 = legendGraphic45.getOutlinePaint();
        legendGraphic45.setShapeOutlineVisible(false);
        boolean boolean49 = legendGraphic45.isShapeOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot50 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color53 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer55 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean57 = xYAreaRenderer55.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint58 = xYAreaRenderer55.getBaseLegendTextPaint();
        java.awt.Stroke stroke60 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer55.setSeriesOutlineStroke(0, stroke60, false);
        java.awt.Color color65 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer67 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean69 = xYAreaRenderer67.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint70 = xYAreaRenderer67.getBaseLegendTextPaint();
        java.awt.Stroke stroke72 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer67.setSeriesOutlineStroke(0, stroke72, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker76 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color53, stroke60, (java.awt.Paint) color65, stroke72, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor77 = org.jfree.chart.text.TextAnchor.BASELINE_LEFT;
        intervalMarker76.setLabelTextAnchor(textAnchor77);
        java.lang.String str79 = intervalMarker76.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent80 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker) intervalMarker76);
        org.jfree.chart.plot.Marker marker81 = markerChangeEvent80.getMarker();
        boolean boolean82 = categoryPlot50.removeRangeMarker(marker81);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor83 = marker81.getLabelAnchor();
        java.lang.String str84 = rectangleAnchor83.toString();
        legendGraphic45.setShapeLocation(rectangleAnchor83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer20 and xYAreaRenderer55", xYAreaRenderer20.equals(xYAreaRenderer55) ? xYAreaRenderer20.hashCode() == xYAreaRenderer55.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test159");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.entity.EntityCollection entityCollection1 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo2 = new org.jfree.chart.ChartRenderingInfo(entityCollection1);
        java.awt.Paint paint3 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean4 = chartRenderingInfo2.equals((java.lang.Object) paint3);
        java.awt.geom.Rectangle2D rectangle2D5 = chartRenderingInfo2.getChartArea();
        org.jfree.chart.title.TextTitle textTitle7 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity8 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D5, (org.jfree.chart.title.Title) textTitle7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot10 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis9);
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.entity.EntityCollection entityCollection12 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo13 = new org.jfree.chart.ChartRenderingInfo(entityCollection12);
        java.awt.Paint paint14 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean15 = chartRenderingInfo13.equals((java.lang.Object) paint14);
        java.awt.geom.Rectangle2D rectangle2D16 = chartRenderingInfo13.getChartArea();
        java.util.List list17 = null;
        combinedDomainXYPlot10.drawDomainGridlines(graphics2D11, rectangle2D16, list17);
        org.jfree.chart.axis.NumberAxis numberAxis20 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity23 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D16, (org.jfree.chart.axis.Axis) numberAxis20, "", "DatasetRenderingOrder.FORWARD");
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtilities.rotateShape((java.awt.Shape) rectangle2D16, (double) (byte) -1, (float) (short) 0, (float) 0L);
        java.awt.geom.Rectangle2D rectangle2D31 = piePlot0.getArcBounds(rectangle2D5, rectangle2D16, (double) (short) 100, (-9.0d), 8.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo2 and chartRenderingInfo13", chartRenderingInfo2.equals(chartRenderingInfo13) ? chartRenderingInfo2.hashCode() == chartRenderingInfo13.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test160");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        java.awt.Paint paint1 = combinedDomainXYPlot0.getRangeGridlinePaint();
        org.jfree.chart.plot.PolarPlot polarPlot2 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Font font3 = polarPlot2.getAngleLabelFont();
        org.jfree.chart.axis.ValueAxis valueAxis4 = polarPlot2.getAxis();
        org.jfree.chart.entity.EntityCollection entityCollection6 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo7 = new org.jfree.chart.ChartRenderingInfo(entityCollection6);
        java.awt.Paint paint8 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean9 = chartRenderingInfo7.equals((java.lang.Object) paint8);
        java.awt.geom.Rectangle2D rectangle2D10 = chartRenderingInfo7.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = chartRenderingInfo7.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo12 = plotRenderingInfo11.getOwner();
        java.awt.geom.Point2D point2D13 = null;
        polarPlot2.zoomDomainAxes((double) (byte) 1, plotRenderingInfo11, point2D13, false);
        java.awt.Stroke stroke16 = polarPlot2.getRadiusGridlineStroke();
        combinedDomainXYPlot0.setRangeZeroBaselineStroke(stroke16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = combinedDomainXYPlot0.getDomainAxis();
        org.jfree.chart.entity.EntityCollection entityCollection20 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = new org.jfree.chart.ChartRenderingInfo(entityCollection20);
        java.awt.Paint paint22 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean23 = chartRenderingInfo21.equals((java.lang.Object) paint22);
        java.awt.geom.Rectangle2D rectangle2D24 = chartRenderingInfo21.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = chartRenderingInfo21.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = plotRenderingInfo25.getOwner();
        org.jfree.chart.entity.EntityCollection entityCollection27 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo28 = new org.jfree.chart.ChartRenderingInfo(entityCollection27);
        java.awt.Paint paint29 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean30 = chartRenderingInfo28.equals((java.lang.Object) paint29);
        java.awt.geom.Rectangle2D rectangle2D31 = chartRenderingInfo28.getChartArea();
        org.jfree.chart.title.TextTitle textTitle33 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity34 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D31, (org.jfree.chart.title.Title) textTitle33);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D36 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D31, rectangleAnchor35);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = null;
        java.awt.geom.Point2D point2D38 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D31, rectangleAnchor37);
        combinedDomainXYPlot0.zoomRangeAxes(0.1d, plotRenderingInfo25, point2D38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo7 and chartRenderingInfo21", chartRenderingInfo7.equals(chartRenderingInfo21) ? chartRenderingInfo7.hashCode() == chartRenderingInfo21.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test161");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        org.jfree.chart.labels.StandardXYToolTipGenerator standardXYToolTipGenerator3 = org.jfree.chart.labels.StandardXYToolTipGenerator.getTimeSeriesInstance();
        java.text.NumberFormat numberFormat4 = standardXYToolTipGenerator3.getXFormat();
        java.lang.Object obj5 = standardXYToolTipGenerator3.clone();
        xYAreaRenderer1.setSeriesToolTipGenerator(1, (org.jfree.chart.labels.XYToolTipGenerator) standardXYToolTipGenerator3, false);
        java.text.NumberFormat numberFormat8 = standardXYToolTipGenerator3.getYFormat();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer10 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer10.clearSeriesStrokes(false);
        boolean boolean13 = xYAreaRenderer10.getPlotLines();
        boolean boolean14 = xYAreaRenderer10.getBaseItemLabelsVisible();
        java.awt.Paint paint15 = xYAreaRenderer10.getBasePaint();
        java.awt.Font font16 = xYAreaRenderer10.getBaseItemLabelFont();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator17 = null;
        xYAreaRenderer10.setBaseItemLabelGenerator(xYItemLabelGenerator17);
        xYAreaRenderer10.setUseFillPaint(true);
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot23 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis22);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer25 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer25.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator28 = null;
        xYAreaRenderer25.setLegendItemURLGenerator(xYSeriesLabelGenerator28);
        xYAreaRenderer25.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean36 = xYAreaRenderer25.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot23.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer25);
        combinedDomainXYPlot23.clearDomainMarkers();
        boolean boolean39 = combinedDomainXYPlot23.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.NumberAxis numberAxis41 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis41.pan((double) 1);
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot45 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis44);
        java.awt.Graphics2D graphics2D46 = null;
        org.jfree.chart.entity.EntityCollection entityCollection47 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo48 = new org.jfree.chart.ChartRenderingInfo(entityCollection47);
        java.awt.Paint paint49 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean50 = chartRenderingInfo48.equals((java.lang.Object) paint49);
        java.awt.geom.Rectangle2D rectangle2D51 = chartRenderingInfo48.getChartArea();
        java.util.List list52 = null;
        combinedDomainXYPlot45.drawDomainGridlines(graphics2D46, rectangle2D51, list52);
        org.jfree.chart.axis.NumberAxis numberAxis55 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity58 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D51, (org.jfree.chart.axis.Axis) numberAxis55, "", "DatasetRenderingOrder.FORWARD");
        xYAreaRenderer10.drawDomainGridLine(graphics2D21, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot23, (org.jfree.chart.axis.ValueAxis) numberAxis41, rectangle2D51, (double) 11);
        numberAxis41.setLabelToolTip("{0}: ({1}, {2})");
        org.jfree.chart.util.LogFormat logFormat67 = new org.jfree.chart.util.LogFormat((double) 7, "RectangleEdge.RIGHT", "", false);
        java.lang.StringBuffer stringBuffer69 = null;
        java.text.FieldPosition fieldPosition70 = null;
        java.lang.StringBuffer stringBuffer71 = logFormat67.format((long) (short) 0, stringBuffer69, fieldPosition70);
        java.text.NumberFormat numberFormat72 = logFormat67.getExponentFormat();
        java.text.NumberFormat numberFormat75 = java.text.NumberFormat.getNumberInstance();
        java.text.DateFormat dateFormat76 = null;
        org.jfree.chart.labels.StandardXYToolTipGenerator standardXYToolTipGenerator77 = new org.jfree.chart.labels.StandardXYToolTipGenerator("LGPL", numberFormat75, dateFormat76);
        java.text.NumberFormat numberFormat78 = java.text.NumberFormat.getNumberInstance();
        int int79 = numberFormat78.getMinimumFractionDigits();
        boolean boolean80 = numberFormat78.isGroupingUsed();
        org.jfree.chart.labels.StandardPieToolTipGenerator standardPieToolTipGenerator81 = new org.jfree.chart.labels.StandardPieToolTipGenerator("NO_CHANGE", numberFormat75, numberFormat78);
        logFormat67.setExponentFormat(numberFormat75);
        numberAxis41.setNumberFormatOverride(numberFormat75);
        java.text.NumberFormat numberFormat86 = java.text.NumberFormat.getNumberInstance();
        java.text.DateFormat dateFormat87 = null;
        org.jfree.chart.labels.StandardXYToolTipGenerator standardXYToolTipGenerator88 = new org.jfree.chart.labels.StandardXYToolTipGenerator("LGPL", numberFormat86, dateFormat87);
        java.text.NumberFormat numberFormat89 = java.text.NumberFormat.getNumberInstance();
        int int90 = numberFormat89.getMinimumFractionDigits();
        boolean boolean91 = numberFormat89.isGroupingUsed();
        org.jfree.chart.labels.StandardPieToolTipGenerator standardPieToolTipGenerator92 = new org.jfree.chart.labels.StandardPieToolTipGenerator("NO_CHANGE", numberFormat86, numberFormat89);
        java.util.Currency currency93 = numberFormat86.getCurrency();
        numberFormat75.setCurrency(currency93);
        numberFormat8.setCurrency(currency93);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer1 and xYAreaRenderer25", xYAreaRenderer1.equals(xYAreaRenderer25) ? xYAreaRenderer1.hashCode() == xYAreaRenderer25.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test162");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer12 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean14 = xYAreaRenderer12.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint15 = xYAreaRenderer12.getBaseLegendTextPaint();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer12.setSeriesOutlineStroke(0, stroke17, false);
        java.awt.Font font21 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        xYAreaRenderer12.setSeriesItemLabelFont(0, font21);
        org.jfree.chart.block.LabelBlock labelBlock23 = new org.jfree.chart.block.LabelBlock("LGPL", font21);
        java.lang.String str24 = labelBlock23.getToolTipText();
        java.lang.String str25 = labelBlock23.getURLText();
        double double26 = labelBlock23.getContentYOffset();
        java.awt.Font font27 = labelBlock23.getFont();
        org.jfree.chart.title.TextTitle textTitle29 = new org.jfree.chart.title.TextTitle("");
        boolean boolean30 = textTitle29.getExpandToFitSpace();
        textTitle29.setText("");
        java.lang.String str33 = textTitle29.getID();
        java.awt.Font font34 = textTitle29.getFont();
        java.awt.Graphics2D graphics2D35 = null;
        org.jfree.chart.entity.EntityCollection entityCollection36 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo37 = new org.jfree.chart.ChartRenderingInfo(entityCollection36);
        java.awt.Paint paint38 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean39 = chartRenderingInfo37.equals((java.lang.Object) paint38);
        java.awt.geom.Rectangle2D rectangle2D40 = chartRenderingInfo37.getChartArea();
        textTitle29.draw(graphics2D35, rectangle2D40);
        labelBlock23.setBounds(rectangle2D40);
        boolean boolean43 = org.jfree.chart.util.ShapeUtilities.intersects(rectangle2D7, rectangle2D40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo4 and chartRenderingInfo37", chartRenderingInfo4.equals(chartRenderingInfo37) ? chartRenderingInfo4.hashCode() == chartRenderingInfo37.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test163");
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot();
        java.awt.Font font1 = polarPlot0.getAngleLabelFont();
        org.jfree.chart.axis.ValueAxis valueAxis2 = polarPlot0.getAxis();
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer4 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement3);
        blockContainer4.clear();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer7 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer7.clearSeriesStrokes(false);
        boolean boolean10 = xYAreaRenderer7.getPlotLines();
        boolean boolean11 = xYAreaRenderer7.getBaseItemLabelsVisible();
        java.awt.Paint paint12 = xYAreaRenderer7.getBasePaint();
        boolean boolean13 = blockContainer4.equals((java.lang.Object) paint12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = blockContainer4.getMargin();
        java.lang.Object obj15 = blockContainer4.clone();
        boolean boolean16 = polarPlot0.equals(obj15);
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone18 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection19 = new org.jfree.data.time.TimeSeriesCollection(timeZone18);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer21 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement17, (org.jfree.data.general.Dataset) timeSeriesCollection19, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState22 = timeSeriesCollection19.getSelectionState();
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection19);
        java.lang.Object obj24 = timeSeriesCollection19.clone();
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection19);
        org.jfree.data.general.DatasetGroup datasetGroup26 = timeSeriesCollection19.getGroup();
        org.jfree.chart.axis.NumberAxis numberAxis28 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.data.Range range30 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint31 = new org.jfree.chart.block.RectangleConstraint(0.0d, range30);
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) (-1L), 0.0d);
        org.jfree.data.Range range37 = new org.jfree.data.Range((double) (-1L), 0.0d);
        org.jfree.data.Range range38 = org.jfree.data.Range.combine(range34, range37);
        org.jfree.data.Range range39 = org.jfree.chart.axis.ValueAxis.DEFAULT_RANGE;
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range34, range39);
        org.jfree.chart.block.RectangleConstraint rectangleConstraint41 = rectangleConstraint31.toRangeWidth(range34);
        numberAxis28.setRangeWithMargins(range34, false, true);
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot46 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis45);
        java.awt.Graphics2D graphics2D47 = null;
        org.jfree.chart.entity.EntityCollection entityCollection48 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo49 = new org.jfree.chart.ChartRenderingInfo(entityCollection48);
        java.awt.Paint paint50 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean51 = chartRenderingInfo49.equals((java.lang.Object) paint50);
        java.awt.geom.Rectangle2D rectangle2D52 = chartRenderingInfo49.getChartArea();
        java.util.List list53 = null;
        combinedDomainXYPlot46.drawDomainGridlines(graphics2D47, rectangle2D52, list53);
        org.jfree.chart.axis.NumberAxis numberAxis56 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity59 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D52, (org.jfree.chart.axis.Axis) numberAxis56, "", "DatasetRenderingOrder.FORWARD");
        numberAxis56.centerRange(10.0d);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer63 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer63.clearSeriesStrokes(false);
        boolean boolean66 = xYAreaRenderer63.getPlotLines();
        xYAreaRenderer63.setBaseSeriesVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot69 = new org.jfree.chart.plot.XYPlot((org.jfree.data.xy.XYDataset) timeSeriesCollection19, (org.jfree.chart.axis.ValueAxis) numberAxis28, (org.jfree.chart.axis.ValueAxis) numberAxis56, (org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer63);
        java.awt.Font font70 = numberAxis28.getLabelFont();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent71 = new org.jfree.chart.event.AxisChangeEvent((org.jfree.chart.axis.Axis) numberAxis28);
        polarPlot0.axisChanged(axisChangeEvent71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement3 and borderArrangement17", borderArrangement3.equals(borderArrangement17) ? borderArrangement3.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test164");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.entity.EntityCollection entityCollection27 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo28 = new org.jfree.chart.ChartRenderingInfo(entityCollection27);
        java.awt.Paint paint29 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean30 = chartRenderingInfo28.equals((java.lang.Object) paint29);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = chartRenderingInfo28.getPlotInfo();
        combinedDomainXYPlot1.handleClick(255, 2, plotRenderingInfo31);
        org.jfree.chart.entity.EntityCollection entityCollection35 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo36 = new org.jfree.chart.ChartRenderingInfo(entityCollection35);
        java.awt.Paint paint37 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean38 = chartRenderingInfo36.equals((java.lang.Object) paint37);
        java.awt.geom.Rectangle2D rectangle2D39 = chartRenderingInfo36.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = chartRenderingInfo36.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo41 = plotRenderingInfo40.getOwner();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo41);
        combinedDomainXYPlot1.handleClick(0, 2958465, plotRenderingInfo42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on chartRenderingInfo28 and chartRenderingInfo36", chartRenderingInfo28.equals(chartRenderingInfo36) ? chartRenderingInfo28.hashCode() == chartRenderingInfo36.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test165");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list1 = combinedRangeXYPlot0.getSubplots();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot3 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis2);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer5 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer5.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator8 = null;
        xYAreaRenderer5.setLegendItemURLGenerator(xYSeriesLabelGenerator8);
        xYAreaRenderer5.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean16 = xYAreaRenderer5.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot3.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer5);
        combinedDomainXYPlot3.clearDomainMarkers();
        java.awt.Font font20 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint21 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer24 = null;
        org.jfree.chart.text.TextBlock textBlock25 = org.jfree.chart.text.TextUtilities.createTextBlock("", font20, paint21, (float) (-1L), (int) (short) -1, textMeasurer24);
        combinedDomainXYPlot3.setDomainCrosshairPaint(paint21);
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup28 = piePlot27.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        piePlot27.addChangeListener(plotChangeListener29);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) piePlot27);
        combinedDomainXYPlot3.plotChanged(plotChangeEvent31);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType33 = plotChangeEvent31.getType();
        combinedRangeXYPlot0.plotChanged(plotChangeEvent31);
        org.jfree.chart.plot.IntervalMarker intervalMarker37 = new org.jfree.chart.plot.IntervalMarker((double) (short) 100, (double) 10);
        boolean boolean38 = combinedRangeXYPlot0.removeRangeMarker((org.jfree.chart.plot.Marker) intervalMarker37);
        combinedRangeXYPlot0.configureRangeAxes();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot40 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list41 = combinedRangeXYPlot40.getSubplots();
        java.awt.Color color45 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer47 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean49 = xYAreaRenderer47.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint50 = xYAreaRenderer47.getBaseLegendTextPaint();
        java.awt.Stroke stroke52 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer47.setSeriesOutlineStroke(0, stroke52, false);
        java.awt.Color color57 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer59 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean61 = xYAreaRenderer59.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint62 = xYAreaRenderer59.getBaseLegendTextPaint();
        java.awt.Stroke stroke64 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer59.setSeriesOutlineStroke(0, stroke64, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker68 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color45, stroke52, (java.awt.Paint) color57, stroke64, (float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot69 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer71 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection72 = categoryPlot69.getRangeMarkers(7, layer71);
        java.lang.Object obj73 = null;
        boolean boolean74 = layer71.equals(obj73);
        boolean boolean76 = combinedRangeXYPlot40.removeRangeMarker(255, (org.jfree.chart.plot.Marker) intervalMarker68, layer71, false);
        combinedRangeXYPlot0.remove((org.jfree.chart.plot.XYPlot) combinedRangeXYPlot40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYAreaRenderer5 and xYAreaRenderer47", xYAreaRenderer5.equals(xYAreaRenderer47) ? xYAreaRenderer5.hashCode() == xYAreaRenderer47.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test166");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone1 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection2 = new org.jfree.data.time.TimeSeriesCollection(timeZone1);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer4 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement0, (org.jfree.data.general.Dataset) timeSeriesCollection2, (java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState5 = timeSeriesCollection2.getSelectionState();
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection2);
        java.lang.Object obj7 = timeSeriesCollection2.clone();
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) timeSeriesCollection2);
        org.jfree.data.general.DatasetGroup datasetGroup9 = timeSeriesCollection2.getGroup();
        org.jfree.chart.axis.NumberAxis numberAxis11 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.data.Range range13 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = new org.jfree.chart.block.RectangleConstraint(0.0d, range13);
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) (-1L), 0.0d);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) (-1L), 0.0d);
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range17, range20);
        org.jfree.data.Range range22 = org.jfree.chart.axis.ValueAxis.DEFAULT_RANGE;
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range17, range22);
        org.jfree.chart.block.RectangleConstraint rectangleConstraint24 = rectangleConstraint14.toRangeWidth(range17);
        numberAxis11.setRangeWithMargins(range17, false, true);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot29 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis28);
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.entity.EntityCollection entityCollection31 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo32 = new org.jfree.chart.ChartRenderingInfo(entityCollection31);
        java.awt.Paint paint33 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean34 = chartRenderingInfo32.equals((java.lang.Object) paint33);
        java.awt.geom.Rectangle2D rectangle2D35 = chartRenderingInfo32.getChartArea();
        java.util.List list36 = null;
        combinedDomainXYPlot29.drawDomainGridlines(graphics2D30, rectangle2D35, list36);
        org.jfree.chart.axis.NumberAxis numberAxis39 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity42 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D35, (org.jfree.chart.axis.Axis) numberAxis39, "", "DatasetRenderingOrder.FORWARD");
        numberAxis39.centerRange(10.0d);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer46 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer46.clearSeriesStrokes(false);
        boolean boolean49 = xYAreaRenderer46.getPlotLines();
        xYAreaRenderer46.setBaseSeriesVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot52 = new org.jfree.chart.plot.XYPlot((org.jfree.data.xy.XYDataset) timeSeriesCollection2, (org.jfree.chart.axis.ValueAxis) numberAxis11, (org.jfree.chart.axis.ValueAxis) numberAxis39, (org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer46);
        xYPlot52.zoom((-1.0d));
        boolean boolean55 = xYPlot52.isDomainCrosshairLockedOnData();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot56 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection57 = combinedRangeXYPlot56.getLegendItems();
        combinedRangeXYPlot56.setRangePannable(false);
        org.jfree.chart.renderer.xy.XYStepRenderer xYStepRenderer60 = new org.jfree.chart.renderer.xy.XYStepRenderer();
        java.lang.Boolean boolean62 = xYStepRenderer60.getSeriesLinesVisible(0);
        xYStepRenderer60.setUseOutlinePaint(true);
        combinedRangeXYPlot56.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYStepRenderer60);
        xYStepRenderer60.setSeriesLinesVisible(0, true);
        int int69 = xYPlot52.getIndexOf((org.jfree.chart.renderer.xy.XYItemRenderer) xYStepRenderer60);
        org.jfree.chart.block.BorderArrangement borderArrangement70 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer71 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement70);
        borderArrangement70.clear();
        org.jfree.chart.block.Arrangement arrangement73 = null;
        org.jfree.chart.title.LegendTitle legendTitle74 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource) xYPlot52, (org.jfree.chart.block.Arrangement) borderArrangement70, arrangement73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemBlockContainer4 and blockContainer71", legendItemBlockContainer4.equals(blockContainer71) ? legendItemBlockContainer4.hashCode() == blockContainer71.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test167");
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        java.awt.Font font4 = barRenderer3D0.getItemLabelFont((int) (byte) -1, (int) (byte) 1, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = barRenderer3D0.getBaseNegativeItemLabelPosition();
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.clearAnnotations();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent9 = null;
        categoryPlot7.rendererChanged(rendererChangeEvent9);
        double double11 = categoryPlot7.getAnchorValue();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer15 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection16 = categoryPlot13.getRangeMarkers(7, layer15);
        java.lang.Object obj17 = null;
        boolean boolean18 = layer15.equals(obj17);
        java.util.Collection collection19 = categoryPlot7.getDomainMarkers((int) (short) 1, layer15);
        org.jfree.chart.axis.NumberAxis numberAxis21 = new org.jfree.chart.axis.NumberAxis("");
        int int22 = numberAxis21.getMinorTickCount();
        numberAxis21.setMinorTickMarksVisible(true);
        numberAxis21.setAutoRangeMinimumSize(1.0E-8d, false);
        org.jfree.chart.plot.Plot plot28 = numberAxis21.getPlot();
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        barRenderer3D0.drawRangeGridline(graphics2D6, categoryPlot7, (org.jfree.chart.axis.ValueAxis) numberAxis21, rectangle2D29, (double) (-16777216));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = categoryPlot7.getRenderer(255);
        org.jfree.chart.plot.IntervalMarker intervalMarker36 = new org.jfree.chart.plot.IntervalMarker((double) (short) 100, (double) 10);
        java.awt.Paint paint37 = intervalMarker36.getOutlinePaint();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot38 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list39 = combinedRangeXYPlot38.getSubplots();
        java.awt.Color color43 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer45 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean47 = xYAreaRenderer45.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint48 = xYAreaRenderer45.getBaseLegendTextPaint();
        java.awt.Stroke stroke50 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer45.setSeriesOutlineStroke(0, stroke50, false);
        java.awt.Color color55 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer57 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean59 = xYAreaRenderer57.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint60 = xYAreaRenderer57.getBaseLegendTextPaint();
        java.awt.Stroke stroke62 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer57.setSeriesOutlineStroke(0, stroke62, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker66 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color43, stroke50, (java.awt.Paint) color55, stroke62, (float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot67 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer69 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection70 = categoryPlot67.getRangeMarkers(7, layer69);
        java.lang.Object obj71 = null;
        boolean boolean72 = layer69.equals(obj71);
        boolean boolean74 = combinedRangeXYPlot38.removeRangeMarker(255, (org.jfree.chart.plot.Marker) intervalMarker66, layer69, false);
        boolean boolean75 = categoryPlot7.removeRangeMarker((org.jfree.chart.plot.Marker) intervalMarker36, layer69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot13 and categoryPlot67", categoryPlot13.equals(categoryPlot67) ? categoryPlot13.hashCode() == categoryPlot67.hashCode() : true);
    }
}


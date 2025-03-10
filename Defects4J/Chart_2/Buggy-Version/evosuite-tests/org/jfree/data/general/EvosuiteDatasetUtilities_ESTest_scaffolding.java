/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Apr 06 21:17:37 GMT 2024
 */

package org.jfree.data.general;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class EvosuiteDatasetUtilities_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.data.general.EvosuiteDatasetUtilities"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/Users/shrushtijagtap/uiuc/Spring2024/CS527/project_git/CS527-Project/sejal/Chart_2/Buggy-Version"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/fp/r3q888xd0pq7wl45t_l61g100000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EvosuiteDatasetUtilities_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.KeyedObjects",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.DomainOrder",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.xy.SelectableXYDataset",
      "org.jfree.data.time.Minute",
      "org.jfree.chart.util.ArrayUtilities",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.category.CategoryDatasetSelectionState",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.RangeInfo",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.data.pie.PieDatasetSelectionState",
      "org.jfree.data.function.NormalDistributionFunction2D",
      "org.jfree.data.general.DatasetSelectionState",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.time.Day",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.data.SelectableValue",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.category.SlidingCategoryDataset",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.event.SeriesChangeListener",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.data.xy.XYDatasetSelectionState",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.data.pie.PieDatasetChangeType",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.pie.SelectablePieDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.data.function.PolynomialFunction2D",
      "org.jfree.data.xy.XYRangeInfo",
      "org.jfree.data.general.SeriesChangeInfo",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.data.time.Second",
      "org.jfree.data.statistics.MeanAndStandardDeviation",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.time.DynamicTimeSeriesCollection$ValueSequence",
      "org.jfree.data.Range",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.util.HashUtilities",
      "org.jfree.data.KeyedValues",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.data.time.TimePeriodValue",
      "org.jfree.data.time.Year",
      "org.jfree.data.event.SeriesChangeEvent",
      "org.jfree.data.category.AbstractCategoryDataset",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.data.xy.XYZDataset",
      "org.jfree.data.DomainInfo",
      "org.jfree.data.statistics.MultiValueCategoryDataset",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.data.xy.YIntervalSeries",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.xy.XYDomainInfo",
      "org.jfree.data.function.PowerFunction2D",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.category.SelectableCategoryDataset",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.data.function.Function2D",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.data.xy.OHLCDataset",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.xy.TableXYDataset",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.data.gantt.GanttCategoryDataset",
      "org.jfree.data.Values2D",
      "org.jfree.data.KeyedObject",
      "org.jfree.data.statistics.BoxAndWhiskerXYDataset",
      "org.jfree.data.time.Month",
      "org.jfree.data.category.CategoryRangeInfo",
      "org.jfree.data.pie.DefaultPieDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.general.Dataset",
      "org.jfree.data.pie.AbstractPieDataset",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.data.time.Hour",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.pie.PieDatasetChangeInfo",
      "org.jfree.data.event.DatasetChangeEvent",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.statistics.StatisticalCategoryDataset",
      "org.jfree.data.pie.PieDataset",
      "org.jfree.data.DataUtilities",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.event.DatasetChangeListener",
      "org.jfree.chart.event.DatasetChangeInfo",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.Value",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.data.time.SimpleTimePeriod",
      "org.jfree.data.time.MonthConstants",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.Values",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.general.SeriesException",
      "org.jfree.chart.util.ResourceBundleWrapper"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EvosuiteDatasetUtilities_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.pie.AbstractPieDataset",
      "org.jfree.data.pie.DefaultPieDataset",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.KeyedObjects",
      "org.jfree.chart.event.DatasetChangeInfo",
      "org.jfree.data.event.DatasetChangeEvent",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.category.AbstractCategoryDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.SelectableValue",
      "org.jfree.data.KeyedObject",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.DataUtilities",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Month",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.gantt.XYTaskDataset",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.function.PowerFunction2D",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.data.event.SeriesChangeEvent",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.category.SlidingCategoryDataset",
      "org.jfree.data.xy.VectorSeriesCollection",
      "org.jfree.chart.util.ArrayUtilities",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.Day",
      "org.jfree.data.function.PolynomialFunction2D",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.function.LineFunction2D",
      "org.jfree.data.function.NormalDistributionFunction2D",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.statistics.MeanAndStandardDeviation",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.time.Year",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.time.Week",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.XIntervalSeries",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.data.DomainOrder",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.data.general.DefaultHeatMapDataset",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.general.SeriesChangeType",
      "org.jfree.data.general.SeriesChangeInfo",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.data.time.SimpleTimePeriod",
      "org.jfree.data.pie.PieDatasetChangeType",
      "org.jfree.data.pie.PieDatasetChangeInfo",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.data.time.TimeSeriesTableModel",
      "org.jfree.data.xy.VectorSeries",
      "org.jfree.data.xy.XYIntervalSeries",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "org.jfree.data.time.DynamicTimeSeriesCollection$ValueSequence",
      "org.jfree.data.ComparableObjectItem",
      "org.jfree.data.statistics.BoxAndWhiskerCalculator",
      "org.jfree.data.statistics.Statistics",
      "org.jfree.data.xy.YIntervalSeries",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.data.KeyedObjectComparator",
      "org.jfree.data.KeyedObjectComparatorType",
      "org.jfree.data.time.TimePeriodValue",
      "org.jfree.chart.util.HashUtilities"
    );
  }
}

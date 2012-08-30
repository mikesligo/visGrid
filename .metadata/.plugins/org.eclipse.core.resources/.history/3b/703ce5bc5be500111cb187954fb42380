package gui;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.Color;
import java.awt.Dimension;

import org.apache.commons.collections.MultiHashMap;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class Gui extends ApplicationFrame{
	
	private static final long serialVersionUID = 8010670118719443576L;
	@SuppressWarnings("deprecation")
	MultiHashMap plots = new MultiHashMap();
	private DefaultCategoryDataset dataset;

	public Gui(String title) {
		super(title);
		this.dataset = new DefaultCategoryDataset();
		addToDataSet(1.0f, "lol", "lal", "lawl");
		final JFreeChart chart = createChart(dataset);
		final ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new Dimension(500, 270));
		setContentPane(chartPanel);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addToDataSet(float val, String row, String column, String key){
		
		if (this.plots.get(key) != null){
			Deque<Data> data = new LinkedList<Data>();
			this.plots.put(key, data);
		}
		((Deque)this.plots.get(key)).add(val);
		dataset.addValue((Number) ((Deque)this.plots.get(key)).getFirst() ,row, column);
		
	}
	
	private JFreeChart createChart(final CategoryDataset dataset) {

		// create the chart...
		final JFreeChart chart = ChartFactory.createLineChart(
				"VisGrid Grapher",       // chart title
				"Type",                    // domain axis label
				"Value",                   // range axis label
				dataset,                   // data
				PlotOrientation.VERTICAL,  // orientation
				true,                      // include legend
				true,                      // tooltips
				false                      // urls
				);
		chart.setBackgroundPaint(Color.white);

		final CategoryPlot plot = (CategoryPlot) chart.getPlot();
		plot.setBackgroundPaint(Color.lightGray);
		plot.setRangeGridlinePaint(Color.white);

		// customise the range axis...
		final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		rangeAxis.setAutoRangeIncludesZero(true);
		return chart;
	}
	
	public static void main(final String[] args) {
		final Gui demo = new Gui("GridLAB-D VisGrid");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
	} 
}
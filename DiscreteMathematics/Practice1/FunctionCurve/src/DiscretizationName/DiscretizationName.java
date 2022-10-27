package DiscretizationName;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class DiscretizationName {

    public static void main(String[] args) {

        XYSeries series = new XYSeries("xySeries");         //创建一个新的空系列
        for (double t = 0; t < 8; t = t + 0.01) {
            double y = -2 * t * Math.sin(t * t);
            series.add(t, y);
        }

        XYSeriesCollection dataset = new XYSeriesCollection();      //创建空数据集
        dataset.addSeries(series);                                  //把XY系列添加到集合
        JFreeChart chart = ChartFactory.createXYLineChart(          //创建基于XYDataset的折线图
                "x(t)=-2*t*sin(t^2)",
                "t",
                "x(t)",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                false,
                false
        );

        XYPlot plot = (XYPlot) chart.getPlot();                              //返回图标的绘图
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();     //创建新的渲染器，线条和形状都可见
        renderer.setSeriesLinesVisible(0, false);           // 设置连线不可见
        plot.setRenderer(renderer);                                         //设置主数据集的渲染器

        ChartFrame frame = new ChartFrame("x(t)=-2*t*sin(t^2)", chart);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

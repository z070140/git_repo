package FunctionCurve;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;

public class LineChart_AWT extends ApplicationFrame {

    public LineChart_AWT(String applicationTitle, String chartTitle) {
        super(applicationTitle);
        JFreeChart lineChart = ChartFactory.createLineChart(        //使用默认creatLineChart用法创建折线图
                chartTitle,
                "", "",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);
        ChartPanel chartPanel = new ChartPanel(lineChart);          //构造lineChart的面板
        chartPanel.setPreferredSize(new Dimension(560, 367));
        setContentPane(chartPanel);                                 //设置窗体的内容窗格
    }


    private DefaultCategoryDataset createDataset() {                //创建新的空数据集
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (double i = 0; i <= 8; i += 0.01) {
            i = Double.parseDouble(String.format("%.2f", i));       //格式化，减少精度丢失可能
            System.out.println(i);
            double x = -2 * i * Math.sin(i * i);                     //输出x(t)=-2t*sin(t^2)

            dataset.addValue(x, "t", String.valueOf(i));    //向表中添加值
        }
        return dataset;
    }

    public static void main(String[] args) {
        LineChart_AWT chart = new LineChart_AWT(
                "选做题1",
                "x(t)=-2t*sin(t^2)");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import javax.swing.JPanel;
import model.Histogram;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Baluarte
 */
public class HistogramDisplay extends ApplicationFrame {
    private final Histogram<String> histogram;

    public HistogramDisplay(Histogram<String> histogram, String title) {
        super(title);
        this.histogram = histogram;         
        setContentPane(createPanel());
        pack();
    }
    

    
    public void execute() {
        this.setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartPanel;
        chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));                      
        return chartPanel;        
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart("Histograma KFreeChart", "Dominios email", "Nº de emails", dataSet, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for (String key : histogram.keySet()) {
            dataSet.addValue(histogram.get(key), "", key);
        }                        
        return dataSet;
    }

}



    


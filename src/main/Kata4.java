package main;

import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata4 {

    private final String filename = "u:\\Java\\Projects\\Kata4\\email.txt";
    private List<Mail> mailList;
    Histogram<String> histogram;
    
    public static void main(String[] args) {        
        
        Kata4 kata4 = new Kata4();
        kata4.execute();
                                   
    }
    
    private void execute() {
        input();
        process();
        output();
    }
    
    private void input() {
        mailList = MailListReader.read(filename);    
        
    }
    
    private void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    private void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram, "My Histogram");
        histoDisplay.execute();
    }
    
}

package main;

import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata4 {

    public static void main(String[] args) {
        
        String filename = "u:\\Java\\Projects\\Kata4\\email.txt";
        
        List<Mail> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram, "My Histogram");
        histoDisplay.execute();
       
    }
    
}

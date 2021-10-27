/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import model.Histogram;
import model.Mail;

/**
 *
 * @author Baluarte
 */
public class MailHistogramBuilder {
    
    
    public static Histogram<String> build(List<Mail> list) {
        Histogram<String> histogram = new Histogram<String>();
        
        for (Mail mail : list) {
            histogram.increment(mail.getDomain());            
        }                                
        return histogram;                
    }
    
    
    
}

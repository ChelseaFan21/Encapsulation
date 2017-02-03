/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author bstoiber
 */
public class DateUtility {
    
    public String getFormattedDate(Date orientationDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        return sdf.format(orientationDate);
    }
}

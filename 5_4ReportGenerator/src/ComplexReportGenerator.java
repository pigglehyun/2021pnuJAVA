import java.util.ArrayList;
import java.util.List;
package org.report;

public class ComplexReportGenerator extends ReportGeneratorTest {
    private List<Customer> customers= new ArrayList<>();
    private int i = 0;

    public ComplexReportGenerator(){

    }

    public AbstractReportGenerator generate(Customer[] customer){
        for(Customer c : customer){
            customers.set(i, c);
            i++;
        }
    }


}

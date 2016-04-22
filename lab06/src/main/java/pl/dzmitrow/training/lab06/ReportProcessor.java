package pl.dzmitrow.training.lab06;

import org.springframework.batch.item.ItemProcessor;

public class ReportProcessor implements ItemProcessor<Report, Report> {

    @Override
    public Report process(Report report) throws Exception {
        report.setQty(report.getQty() + 1);
        return report;
    }
}

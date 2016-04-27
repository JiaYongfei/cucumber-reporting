package net.masterthought.cucumber.generators.helpers;

public class SummaryAssertion extends ReportAssertion {

    public String getEmptyReportMessage() {
        return oneBySelector("p", WebAssertion.class).text();
    }

    public TableAssertion getTableStats() {
        return oneByClass("stats-table", TableAssertion.class);
    }
}
public class Main {
    public static void main(String[] args) {
        // Original template
        Document baseReport = new ReportDocument("Monthly Report", "Standard content template...");

        // Clone and customize
        Document hrReport = baseReport.clone();
        hrReport.setTitle("HR Monthly Report");
        hrReport.setContent("Attendance and payroll summary...");

        Document salesReport = baseReport.clone();
        salesReport.setTitle("Sales Monthly Report");
        salesReport.setContent("Revenue, leads, and conversion rates...");

        // Print reports
        System.out.println("== Original Template ==");
        baseReport.print();

        System.out.println("\n== HR Report ==");
        hrReport.print();

        System.out.println("\n== Sales Report ==");
        salesReport.print();
    }
}

public class ReportDocument implements Document {
    private String title;
    private String content;

    public ReportDocument(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public Document clone() {
        return new ReportDocument(this.title, this.content);
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Report Title: " + title);
        System.out.println("Report Content: " + content);
    }
}

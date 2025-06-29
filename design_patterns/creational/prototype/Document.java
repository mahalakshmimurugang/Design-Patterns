public interface Document extends Cloneable {
    Document clone();
    void setTitle(String title);
    void setContent(String content);
    void print();
}

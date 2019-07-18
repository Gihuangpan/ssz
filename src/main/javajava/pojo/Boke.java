package pojo;

public class Boke {
    private String title;
    private String rorle;

    public Boke(String title, String rorle) {
        this.title = title;
        this.rorle = rorle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRorle() {
        return rorle;
    }

    public void setRorle(String rorle) {
        this.rorle = rorle;
    }

    @Override
    public String toString() {
        return "Boke{" +
                "title='" + title + '\'' +
                ", rorle='" + rorle + '\'' +
                '}';
    }
}

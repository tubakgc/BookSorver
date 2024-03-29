public class Book  implements  Comparable<Book>{
    String name;
    int pageNumber;
    String author;
    String date;

    public  Book(String name, int pageNumber, String author, String date){
        this.name=name;
        this.pageNumber=pageNumber;
        this.author=author;
        this.date=date;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public int compareTo(Book o){
        return getName().compareTo(o.getName());
    }

}

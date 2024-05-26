package student.homework.exercise.box;

// ThingInterface e o interfata ce poate fi implementata de catre alte obiecte

interface ThingInterface {
    void setName(String name);
    String getName();
}

class Box {

    // ThingInterface contine doua metode (un getter si un setter)
    // care trebuie realizate in clasele care o implementeaza
    private ThingInterface content;

    public ThingInterface getContent() {
        return content;
    }

    public void setContent(ThingInterface content) {
        this.content = content;
    }

    // raspuns la 9 nu poate un obiect de acceasi clasa sa acceseze direct proprietatile
    // altui obiect
}

class Book implements ThingInterface {
    private String name;
    private String title;
    private int pages;
    private String authorName;
    private int publishingYear;

    public Book() {}

    public Book(String name, String title, int pages, String authorName, int publishingYear) {
        this.name = name;
        this.title = title;
        this.pages = pages;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", authorName='" + authorName + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }
}

class Journal implements ThingInterface {
    private String name;
    private String title;
    private int pages;
    private String category;

    public Journal() {}

    public Journal(String name, String title, int pages, String category) {
        this.name = name;
        this.title = title;
        this.pages = pages;
        this.category = category;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", category='" + category + '\'' +
                '}';
    }
}



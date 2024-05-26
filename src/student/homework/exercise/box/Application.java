package student.homework.exercise.box;

public class Application {
    public static void main(String[] args) {
        Box firstBox = new Box();
        Box secondBox = new Box();
        Book firstBook = new Book();
        Journal firstJournal = new Journal();

        firstBox.setContent(firstBook);
        secondBox.setContent(firstJournal);

        System.out.println(firstBox.getContent());
        System.out.println(secondBox.getContent());

        secondBox.setContent(firstBox.getContent());

        System.out.println(firstBox.getContent());
        System.out.println(secondBox.getContent());

        firstBook.setTitle("Aivengo");

        System.out.println(firstBox.getContent());
        System.out.println(secondBox.getContent());
    }
}

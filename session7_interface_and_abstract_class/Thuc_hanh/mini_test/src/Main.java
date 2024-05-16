public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new ProgrammingBook(111, "Java", 100, "Sun Microsystems", "Java", "JSF");
        books[1] = new ProgrammingBook(222, "C++/C", 105, "ISO/IEC", "C", "STL");
        books[2] = new ProgrammingBook(333, "Python/AI", 95, "Guido van Rossum", "Python", "Asynchronous ");

        books[3] = new FictionBook(444, "Đắc nhân tâm", 110, "Dale Carnegie", "mentality");
        books[4] = new FictionBook(555, "Nhà giả kim", 90, "Paulo Coelho", "Viễn tưởng 1");
        books[5] = new FictionBook(666, "Ông già và biển cả", 85, "Ernest Hemingway", "science fiction");
        double total = 0;
        for (int i = 0; i < books.length; i++) {
            total += books[i].getAmount();
        }
        System.out.println("Tổng giá tiền 6 quyển sách là : " + total);

    }

}

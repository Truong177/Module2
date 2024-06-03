import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String regex = "^[A-ZÀÁẢẠÃĂẰẮẲẶẴÂẦẤẨẬẪĐÈÉẺẸẼÊỀẾỂỆỄÌÍỈỊĨÒÓỎỌÕÔỒỐỔỘỖƠỜỚỞỢỠÙÚỦỤŨƯỪỨỬỰỮỲÝỶỴỸ][a-zàáảạãăằắẳặẵâầấẩậẫđèéẻẹẽêềếểệễìíỉịĩòóỏọõôồốổộỗơờớởợỡùúủụũưừứửựữỳýỷỵỹ]*([\\s][A-ZÀÁẢẠÃĂẰẮẲẶẴÂẦẤẨẬẪĐÈÉẺẸẼÊỀẾỂỆỄÌÍỈỊĨÒÓỎỌÕÔỒỐỔỘỖƠỜỚỞỢỠÙÚỦỤŨƯỪỨỬỰỮỲÝỶỴỸ][a-zàáảạãăằắẳặẵâầấẩậẫđèéẻẹẽêềếểệễìíỉịĩòóỏọõôồốổộỗơờớởợỡùúủụũưừứửựữỳýỷỵỹ]*)*$";

        do {
            System.out.println("Nhập tên của bạn:");
            name = scanner.nextLine();

            if (name.matches(regex)) {
                System.out.println("Tên hợp lệ: " + name);
                break;
            } else {
                System.out.println("Tên không hợp lệ. Tên phải bắt đầu bằng chữ cái in hoa và mỗi từ phải bắt đầu bằng chữ cái in hoa. Vui lòng nhập lại.");
            }
        } while (true);

    }
}

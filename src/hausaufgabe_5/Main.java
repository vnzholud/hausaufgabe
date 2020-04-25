package hausaufgabe_5;


public class Main {

    public static void main(String[] args) {



        Staff[]StaffArray = new Staff[5];

        StaffArray[0] = new Staff ("Иванов Иван Иванович", "Инженер", "ivivan.ivanov@mail.com", "8923333312", 30000, 30);
        StaffArray[1] = new Staff ("Петров Петр Петрович", "Ведущий Инженер", "petr.petrov@mail.com", "892444412", 40000, 45);
        StaffArray[2] = new Staff ("Сидоров Иван Иванович", "Главный Инженер", "ivivan.sidorov@mail.com", "89775893312", 90000, 50);
        StaffArray[3] = new Staff ("Ивановa Марина Петровна", "Референт", "marina.ivanova@mail.com", "89278978912", 20000, 30);
        StaffArray[4] = new Staff ("Генералов Иван Иванович", "Директор", "ivivan.generalov@mail.com", "89234343412", 130000, 50);

        for (int i = 0; i < 5; i++) {

            if (StaffArray[i].age >=40) {
                System.out.printf("%s %s %s %s %d %d\n", StaffArray[i].fullName, StaffArray[i].position, StaffArray[i].telefon, StaffArray[i].email, StaffArray[i].salary, StaffArray[i].age);
            }

        }

    }

}

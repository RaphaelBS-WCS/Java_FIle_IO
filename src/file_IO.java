public class file_IO {
    public static void main(String[] args) {
        PersonOutputStream.personOutPut("Bob");
        PersonInputStream.PersonInput("Bob");

        String[] personList = {"Zurabi", "Arnaud", "Thuy", "Gersey", "Lahcen", "Matthias", "Mathieu"};

        TeamOutputStream.teamOutPut(personList);
        TeamInputStream.teamInput();
    }
}

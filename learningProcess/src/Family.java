public class Family {
    String name;
    String member;
    String adjective;
    int age;
    int birthyear;

    Family() {
        name = "";
        member = "";
        adjective = "";
        age = 0;
        birthyear = 0;
    }

    Family(String name, String member, String adjective, int age, int birthyear) {
        this.name = name;
        this.member = member;
        this.adjective = adjective;
        this.age = age;
        this.birthyear = birthyear;
    }
}
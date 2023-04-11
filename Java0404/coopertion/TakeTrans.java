package Java0404.coopertion;

public class TakeTrans {

    public static void main(String[] args) {
        Student studentJames = new Student("james",5000);
        Student studentTomas = new Student("Tomas",5000);

        Bus bus = new Bus(100);
        studentJames.takeBus(bus);
        studentJames.showInfo();
        bus.showInfo();

        Subway subway = new Subway("2호선");
        studentTomas.takeSubway(subway);
        studentTomas.showInfo();
        subway.showInfo();

    }
}

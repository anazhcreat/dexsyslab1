public class House {
    private Owner owner;
    private final int floorCount = 3;
    private String color;
    private final String address = "Герцена, 8к1";

    House(int ownerAge, String color) {
        this.color = color;
        this.owner = new Owner(ownerAge);
    }

    public void getHouseInfo() {
        System.out.printf("Владелец: %s количество этажей: %d цвет: %s адрес: %s\n", owner.getName(), floorCount, color, address);
    }

    public void getOwner() {
        System.out.printf("Владелец дома %s %s, количество лет %d\n", owner.getName(), owner.getSurname(), owner.getAge());
        owner.sayAbout();
    }
}

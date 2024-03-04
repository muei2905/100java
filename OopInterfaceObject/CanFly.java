package OopInterfaceObject;

interface CanFly {
    void fly();
}

class Chim extends DongVat implements CanFly {
    public void fly() {
        System.out.println("Chim bay di");
    }
}
class Cho extends DongVat implements CanFly {
    public void fly() {
        System.out.println("Cho khong bay duoc");
    }
}
class mein{
	public static void main(String[] args) {
        Chim chim = new Chim();
        chim.fly();
        
        Cho cho = new Cho();
        cho.fly();
    }
}
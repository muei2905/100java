package OopInterfaceObject;

class Oto extends Xe {
    private int soChoNgoi;

    public Oto(String ten, int soChoNgoi) {
        super(ten);
        this.soChoNgoi = soChoNgoi;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }
}

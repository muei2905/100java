package OopInterfaceObject;

class XeMay extends Xe {
    private String conTay;

    public XeMay(String ten, String conTay) {
        super(ten);
        this.conTay = conTay;
    }

    public String getConTay() {
        return conTay;
    }

    public void setConTay(String conTay) {
        this.conTay = conTay;
    }
}
package OopInterfaceObject;

public class SinhVien {

	private String ten;
    private int tuoi;
    private double diemTrungBinh;

    public SinhVien(String ten, int tuoi, double diemTrungBinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

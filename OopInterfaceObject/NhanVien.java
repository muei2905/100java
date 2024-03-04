package OopInterfaceObject;

class NhanVien extends SinhVien {

	private double luong;

    public NhanVien(String ten, int tuoi, double diemTrungBinh, double luong) {
        super(ten, tuoi, diemTrungBinh);
        this.luong = luong;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

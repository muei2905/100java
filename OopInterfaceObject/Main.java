package OopInterfaceObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv = new SinhVien("Nguyen Van A", 20, 8.5);
        System.out.println("Ten sinh vien: " + sv.getTen());
        System.out.println("Tuoi sinh vien: " + sv.getTuoi());
        System.out.println("Diem trung binh: " + sv.getDiemTrungBinh());

        NhanVien nv = new NhanVien("Nguyen Van B", 25, 9.0, 1000);
        System.out.println("Ten Nhan vien: " + nv.getTen());
        System.out.println("Tuoi Nhan vien: " + nv.getTuoi());
        System.out.println("Diem trung binh: " + nv.getDiemTrungBinh());
	}

}

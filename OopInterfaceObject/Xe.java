package OopInterfaceObject;

class Xe implements DiChuyen{

	private String ten;
	public Xe(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten){
      this.ten = ten;
    }
  	
  @Override
  public void diChuyen(){
    System.out.print("run");
  }
}

package day3;

public class HinhChuNhat {
	private int dai;
	private int rong;

	public HinhChuNhat() {
	}
	
	public HinhChuNhat(int a, int b) {
		if (a >= b) {
			this.dai = a;
			this.rong = b;
		} else {
			this.dai = b;
			this.rong = a;
		}
	}
	
	public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }
    
    public int ChuVi() {
        return 2 * (this.dai + this.rong);
    }
    
    public int DienTich() {
    	return this.dai * this.rong;
    }
}
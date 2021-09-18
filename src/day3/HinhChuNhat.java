package day3;

public class HinhChuNhat {
	private double dai;
	private double rong;

	public HinhChuNhat() {
	}

	public HinhChuNhat(double a, double b) {
		if (a >= b) {
			this.dai = a;
			this.rong = b;
		} else {
			this.dai = b;
			this.rong = a;
		}
	}

	public double getDai() {
		return dai;
	}

	public void setDai(double dai) {
		this.dai = dai;
	}

	public double getRong() {
		return rong;
	}

	public void setRong(double rong) {
		this.rong = rong;
	}

	public double ChuVi() {
		return 2 * (this.dai + this.rong);
	}

	public double DienTich() {
		return this.dai * this.rong;
	}
}
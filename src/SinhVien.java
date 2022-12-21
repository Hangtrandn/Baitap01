
public abstract class SinhVien {
protected int mssv;
protected String hoLot;
protected String ten;
protected Ngay ngaySinh;
protected String gioiTinh;
protected double diemTrungBinh;
protected SinhVien(int mssv, String hoLot, String ten, Ngay ngaySinh, String gioiTinh, double diemTrungBinh) {
	this.mssv = mssv;
	this.hoLot = hoLot;
	this.ten = ten;
	this.ngaySinh = ngaySinh;
	this.gioiTinh = gioiTinh;
	this.diemTrungBinh = diemTrungBinh;
}
}

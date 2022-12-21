
public class SinhVienDaiHoc extends SinhVien {
	private int soTinChi;
	private String giaoVienChuNhiem;

	protected SinhVienDaiHoc(int mssv, String hoLot, String ten, Ngay ngaySinh, String gioiTinh, double diemTrungBinh,
			int soTinChi, String giaoVienChuNhiem) {
		super(mssv, hoLot, ten, ngaySinh, gioiTinh, diemTrungBinh);
		this.soTinChi = soTinChi;
		this.giaoVienChuNhiem= giaoVienChuNhiem;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return mssv+"-"+hoLot+"-"+"ten"+"-"+ngaySinh+"-"+gioiTinh+"-"+diemTrungBinh+"-"+soTinChi+"-"+giaoVienChuNhiem;
	}

}

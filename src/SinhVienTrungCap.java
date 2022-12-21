
public class SinhVienTrungCap extends SinhVien {

	protected SinhVienTrungCap(int mssv, String hoLot, String ten, Ngay ngaySinh, String gioiTinh,
			double diemTrungBinh) {
		super(mssv, hoLot, ten, ngaySinh, gioiTinh, diemTrungBinh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SinhVienTrungCap [mssv=" + mssv + ", hoLot=" + hoLot + ", ten=" + ten + ", ngaySinh=" + ngaySinh
				+ ", gioiTinh=" + gioiTinh + ", diemTrungBinh=" + diemTrungBinh + "]";
	}

}

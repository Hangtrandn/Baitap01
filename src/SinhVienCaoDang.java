
public class SinhVienCaoDang extends SinhVien{
	private int heSoDaoTao;
protected SinhVienCaoDang(int mssv, String hoLot, String ten, Ngay ngaySinh, String gioiTinh,
			double diemTrungBinh, int heSoDaoTao) {
		super(mssv, hoLot, ten, ngaySinh, gioiTinh, diemTrungBinh);
		this.heSoDaoTao = heSoDaoTao;
		// TODO Auto-generated constructor stub
	}
@Override
public String toString() {
	return "SinhVienCaoDang [heSoDaoTao=" + heSoDaoTao + ", mssv=" + mssv + ", hoLot=" + hoLot + ", ten=" + ten
			+ ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diemTrungBinh=" + diemTrungBinh + "]";
}



}

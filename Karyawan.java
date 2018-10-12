public class Karyawan{
	String nama;
	String alamat;
	String jabatan;
	int maxgaji;
	int gaji;
	int uang;

	public void setNama(String nama){
		System.out.println("nama = "+nama);
	}

	public void setAlamat(String alamat){
		System.out.println("alamat = "+alamat);
	}

	public void setGaji(int uang){
		System.out.println("gaji = "+gaji);
	}

	public void setGaji ( int uang, String pesan){
		if(gaji >= maxgaji){
			System.out.println("Maaf yaa");
		}else{
			System.out.println(gaji+""+pesan);
		}
	}

	public void showKaryawan(){
		System.out.println();
	}
}
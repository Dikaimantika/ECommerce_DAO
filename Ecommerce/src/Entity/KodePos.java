package Entity;

public class KodePos {
	private String kodePos;
	private String kota;
	private String provinsi;
	
	public KodePos() {
		
	}
	
	public KodePos(String kodePos, String kota, String provinsi) {
		this.kodePos = kodePos;
		this.kota = kota;
		this.provinsi = provinsi;
	}

	public String getKodePos() {
		return kodePos;
	}

	public void setKodePos(String kodePos) {
		this.kodePos = kodePos;
	}

	public String getKota() {
		return kota;
	}

	public void setKota(String kota) {
		this.kota = kota;
	}

	public String getProvinsi() {
		return provinsi;
	}

	public void setProvinsi(String provinsi) {
		this.provinsi = provinsi;
	}

}

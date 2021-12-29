package lamda;

public class TechPro {

	
	
	
	private String batch;
	private String batchName;
	private int batchOrt;
	private int ogrnSayi;
	
	
	public TechPro(String batch, String batchName, int batchOrt, int ogrnSayi) {
		super();
		this.batch = batch;
		this.batchName = batchName;
		this.batchOrt = batchOrt;
		this.ogrnSayi = ogrnSayi;
	}


	public String getBatch() {
		return batch;
	}


	public void setBatch(String batch) {
		this.batch = batch;
	}


	public String getBatchName() {
		return batchName;
	}


	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}


	public int getBatchOrt() {
		return batchOrt;
	}


	public void setBatchOrt(int batchOrt) {
		this.batchOrt = batchOrt;
	}


	public int getOgrnSayi() {
		return ogrnSayi;
	}


	public void setOgrnSayi(int ogrnSayi) {
		this.ogrnSayi = ogrnSayi;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	@Override
	public String toString() {
		return "TechPro [batch=" + batch + ", batchName=" + batchName + ", batchOrt=" + batchOrt + ", ogrnSayi="
				+ ogrnSayi + ", getBatch()=" + getBatch() + ", getBatchName()=" + getBatchName() + ", getBatchOrt()="
				+ getBatchOrt() + ", getOgrnSayi()=" + getOgrnSayi() + "]";
	}
	
	
	
}

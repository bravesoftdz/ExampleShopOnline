package by.gvozdev.shop.bean;

public class BalanceGood {

	private int idGood;
	private int idStock;
	private int balace;

	public int getIdGood() {
		return idGood;
	}

	public void setIdGood(int idGood) {
		this.idGood = idGood;
	}

	public int getIdStock() {
		return idStock;
	}

	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}

	public int getBalace() {
		return balace;
	}

	public void setBalace(int balace) {
		this.balace = balace;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balace;
		result = prime * result + idGood;
		result = prime * result + idStock;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BalanceGood other = (BalanceGood) obj;
		if (balace != other.balace)
			return false;
		if (idGood != other.idGood)
			return false;
		if (idStock != other.idStock)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BalanceGood [idGood=" + idGood + ", idStock=" + idStock + ", balace=" + balace + "]";
	}

}

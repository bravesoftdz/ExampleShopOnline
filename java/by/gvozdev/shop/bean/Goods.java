package by.gvozdev.shop.bean;

public class Goods {

	private int id;
	private String name;
	private int idStock;
	private double price;
	private long shelfLife;
	private String manufactures;
	private String country;
	private long barcode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdStock() {
		return idStock;
	}

	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(long shelfLife) {
		this.shelfLife = shelfLife;
	}

	public String getManufactures() {
		return manufactures;
	}

	public void setManufactures(String manufactures) {
		this.manufactures = manufactures;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getBarcode() {
		return barcode;
	}

	public void setBarcode(long barcode) {
		this.barcode = barcode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (barcode ^ (barcode >>> 32));
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + id;
		result = prime * result + idStock;
		result = prime * result + ((manufactures == null) ? 0 : manufactures.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (shelfLife ^ (shelfLife >>> 32));
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
		Goods other = (Goods) obj;
		if (barcode != other.barcode)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (id != other.id)
			return false;
		if (idStock != other.idStock)
			return false;
		if (manufactures == null) {
			if (other.manufactures != null)
				return false;
		} else if (!manufactures.equals(other.manufactures))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (shelfLife != other.shelfLife)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", idStock=" + idStock + ", price=" + price + ", shelfLife="
				+ shelfLife + ", manufactures=" + manufactures + ", country=" + country + ", barcode=" + barcode + "]";
	}

}

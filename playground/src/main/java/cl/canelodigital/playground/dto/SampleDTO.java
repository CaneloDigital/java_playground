package cl.canelodigital.playground.dto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SampleDTO {

	private double exampleField1=0.0001;
	private String exampleField2="";

	private static final Logger log = LogManager.getLogger(SampleDTO.class);
	
	public double getExampleField1() {
		return exampleField1;
	}

	public void setExampleField1(double exampleField1) {
		this.exampleField1 = exampleField1;
	}

	public String getExampleField2() {
		return exampleField2;
	}

	public void setExampleField2(String exampleField2) {
		this.exampleField2 = exampleField2;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(exampleField1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((exampleField2 == null) ? 0 : exampleField2.hashCode());
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
		SampleDTO other = (SampleDTO) obj;
		if (Double.doubleToLongBits(exampleField1) != Double.doubleToLongBits(other.exampleField1))
			return false;
		if (exampleField2 == null) {
			if (other.exampleField2 != null)
				return false;
		} else if (!exampleField2.equals(other.exampleField2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SampleDTO [exampleField1=" + exampleField1 + ", exampleField2=" + exampleField2 + "]";
	}

}

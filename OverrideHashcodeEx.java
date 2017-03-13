package pkg;

public class OverrideHashcodeEx {

	private final String importantField;
	private final String anotherField;

	public OverrideHashcodeEx(final String equalField, final String anotherField) {
		this.importantField = equalField;
		this.anotherField = anotherField;
	}

	public String getEqualField() {
		return importantField;
	}

	public String getAnotherField() {
		return anotherField;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((importantField == null) ? 0 : importantField.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final OverrideHashcodeEx other = (OverrideHashcodeEx) obj;
		if (importantField == null) {
			if (other.importantField != null)
				return false;
		} else if (!importantField.equals(other.importantField))
			return false;
		return true;
	}

}

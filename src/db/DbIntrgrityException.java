package db;

public class DbIntrgrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DbIntrgrityException(String smg) {
		super(smg);

	}

}

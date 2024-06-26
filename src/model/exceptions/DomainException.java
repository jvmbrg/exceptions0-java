package model.exceptions;

/*Por convenção, para as classes de exceções, usamos o sufixo "Exception"
 * 
 * A classe DomainException pode extender Exception ou RuntimeException. A diferença é que herdando de Exception
 * as classes filhas vão precisar tratar as exceções, enquanto com RuntimeException as exceções não precisam
 * ser tratadas.*/
public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;
	/*Aqui nos criamos nossas exceções personalizadas*/
	public DomainException(String msg) {
		super(msg);
	}
}

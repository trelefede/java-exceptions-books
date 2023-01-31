package org.lessons.java.exceptions.books;

public class Book {

	private String titolo;
	private int pagine;
	private String autore;
	private String editore;

	// constructor
	public Book(String titolo, int pagine, String autore, String editore) throws Exception {

		validateTitolo(titolo);
		validatePagine(pagine);
		validateAutore(autore);
		validateEditore(editore);

	}

	// getter and setter
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) throws Exception {
		validateTitolo(titolo);
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) throws Exception {
		validatePagine(pagine);
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws Exception {
		validateAutore(autore);
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) throws Exception {
		validateEditore(editore);
	}

	// functions to validate data
	public void validateTitolo(String titolo) throws Exception {
		if (titolo.isEmpty())
			throw new Exception("Titolo obbligatorio");
		this.titolo = titolo;
	}

	public void validatePagine(int pagine) throws Exception {
		if (pagine <= 0)
			throw new Exception("Pagine deve essere maggiore di zero!");
		this.pagine = pagine;
	}

	public void validateAutore(String autore) throws Exception {
		if (autore.isEmpty())
			throw new Exception("Autore obbligatorio!");
		this.autore = autore;
	}

	public void validateEditore(String editore) throws Exception {
		if (editore.isEmpty())
			throw new Exception("Editore obbligatorio!");
		this.editore = editore;
	}

	// override
	@Override
	public String toString() {
		return "\n" + "Titolo: " + getTitolo() + "\n" + "Autore: " + getAutore() + "\n" + "Editore: " + getEditore()
				+ "\n" + "Pagine: " + getPagine() + "\n" + "\n";
	}

}

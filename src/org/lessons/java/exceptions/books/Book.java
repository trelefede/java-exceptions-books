package org.lessons.java.exceptions.books;

public class Book {

	private String titolo;
	private int nPagine;
	private String autore;
	private String editore;

	// constructor
	public Book(String titolo, int nPagine, String autore, String editore) throws Exception {

		if (titolo.isEmpty())
			throw new Exception("Titolo obbligatorio!");
		this.titolo = titolo;

		if (nPagine <= 0)
			throw new Exception("Pagine deve essere maggiore di zero!");
		this.nPagine = nPagine;

		if (autore.isEmpty())
			throw new Exception("Autore obbligatorio!");
		this.autore = autore;

		if (editore.isEmpty())
			throw new Exception("Editore obbligatorio!");
		this.editore = editore;
	}

	// getter and setter
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) throws Exception {
		if (titolo.isEmpty()) {
			throw new Exception("Titolo obbligatorio");
		}
		this.titolo = titolo;
	}

	public int getnPagine() {
		return nPagine;
	}

	public void setnPagine(int nPagine) throws Exception {
		if (nPagine <= 0) {
			throw new Exception("Pagine deve essere maggiore di zero!");
		} else {
			this.nPagine = nPagine;
		}
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws Exception {
		if (autore.isEmpty()) {
			throw new Exception("Autore obbligatorio!");
		} else {
			this.autore = autore;
		}
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) throws Exception {
		if (editore.isEmpty()) {
			throw new Exception("Editore obbligatorio!");
		} else {
			this.editore = editore;
		}
	}

	@Override
	public String toString() {
		return "\n" + "Titolo: " + getTitolo() + "\n" + "Autore: " + getAutore() + "\n" + "Editore: " + getEditore()
				+ "\n" + "Pagine: " + getnPagine() + "\n" + "\n";
	}

}

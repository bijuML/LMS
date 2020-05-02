package com.library.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "library")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "library_name")
	private String libraryName;

	@Column(name = "library_librarian_name")
	private String librarianName;

	@Column(name = "library_phone")
	private String libraryPhone;

	@OneToMany(mappedBy = "library", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Book> books = new ArrayList<>();

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibrarianName() {
		return librarianName;
	}

	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}

	public String getLibraryPhone() {
		return libraryPhone;
	}

	public void setLibraryPhone(String libraryPhone) {
		this.libraryPhone = libraryPhone;
	}
	
/*    public void addBook(Book book) {
        books.add(book);
        book.setLibrary(this);
    }
 
    public void removeBook(Book book) {
        books.remove(book);
        book.setLibrary(null);
    }*/

}

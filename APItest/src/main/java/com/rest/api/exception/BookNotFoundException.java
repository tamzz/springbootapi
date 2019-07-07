package com.rest.api.exception;

@SuppressWarnings("serial")
public class BookNotFoundException extends Exception {

private long book_id;

    public BookNotFoundException(long book_id) {
        super(String.format("Book is not found with id : '%s'", book_id));
        }

	public long getBook_id() {
		return book_id;
	}

	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}

}

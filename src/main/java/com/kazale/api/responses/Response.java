/**
 * 
 */
package com.kazale.api.responses;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jardel Dantas
 *
 */
public class Response<T> {

	private T data;

	private List<String> errors;

	/**
	 * Construtor
	 */
	public Response() {
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the errors
	 */
	public List<String> getErrors() {
		if (this.errors == null) {
			this.errors = new ArrayList<String>();
		}
		return errors;
	}

	/**
	 * @param erros the errors to set
	 */
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

}

package org.oceanops.api.exceptions;

/**
 * Indicates an exception when a missing metadata in the database prevents the operation to complete.
 */
public class MissingMetadataException extends Exception{    
    public MissingMetadataException(String string) {
        super(string);
	}

	/**
     *
     */
    private static final long serialVersionUID = 1L;
}

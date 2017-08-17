/**
 * 
 */
package com.akhil.util;

/**
 * @author ajay
 *
 */
public final class StringUtils {

	/**
	 * 
	 */
	private StringUtils() {

	}
	
	public static boolean  isEmpty(String str) {
        return (str == null || str.trim().length() == 0);
    }

}

/**
 * 
 */
package com.amit.qrcode.utils;

import com.amit.qrcode.pojo.BusinessCard;

// TODO: Auto-generated Javadoc
/**
 * The Class Utils.
 *
 * @author amits
 */
public class Utils {

	/**
	 * Gets the v card.
	 *
	 * @param card the card
	 * @return the v card
	 */
	public static String getVCard(BusinessCard card) {
		 		StringBuilder output = new StringBuilder(10);
		 		appendbCard(output, "Title", card.getTitle());
		 		appendbCard(output, "Name", card.getName());
		 		appendbCard(output, "Organization", card.getOrganization());
		 		appendbCard(output, "Mobile Number", card.getMobileNumber());
		 		appendbCard(output, "Url", card.getUrl());
		 		appendbCard(output, "Email", card.getEmail());
		 		appendbCard(output, "Address", buildAddress(card.getAddressLinew1(), card.getAddressLinew2()));
		 		appendbCard(output, "Note", card.getNote());
		 		return output.toString();
}
	
	 /**
	 * Maybe appendv card.
	 *
	 * @param output the output
	 * @param prefix the prefix
	 * @param value the value
	 */
	private static void appendbCard(StringBuilder output, String prefix, String value) {
		    if (!value.isEmpty()) {
		      output.append(prefix).append(':').append(" ").append(value).append('\n');
		    }
		  }
		  
	 
	 /**
	 * Builds the address.
	 *
	 * @param address the address
	 * @param address2 the address 2
	 * @return the string
	 */
	private static String buildAddress(String address, String address2) {
		    if (!address.isEmpty()) {
		      if (!address2.isEmpty()) {
		        return address + ' ' + address2;
		      }
		      return address;
		    }
		    if (!address2.isEmpty()) {
		      return address2;
		    }
		    return "";
		  }
	 
	
}

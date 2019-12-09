/**
 * 
 */
package com.amit.qrcode.main;

import java.io.File;
import java.io.IOException;

import com.amit.qrcode.pojo.BusinessCard;
import com.amit.qrcode.service.CreateImage;
import com.amit.qrcode.utils.Utils;
import com.google.zxing.WriterException;

// TODO: Auto-generated Javadoc
/**
 * The Class QRCodeGenerator.
 *
 * @author amits
 */
public class QRCodeGenerator {

	/** The util. */
	private static Utils util ;
	
	/** The create. */
	private static CreateImage create;
		
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws WriterException the writer exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws WriterException, IOException {
			BusinessCard card = new BusinessCard();
			card.setAddressLinew1("Bangalore");
			card.setAddressLinew2("Karnataka");
			card.setEmail("xxx.xxxx@gmail.com");
			card.setMobileNumber("xx-xxxxxxxxx");
			card.setName("Amit Samadder");
			card.setNote("My Business Card");
			card.setOrganization("Self");
			card.setTitle("Business Card");
			card.setUrl("www.google.com");
		    String textForTheQR = util.getVCard(card);
			String filePath = "MyBusinessCard.png";
			String charSet = "UTF-8"; // or "ISO-8859-1"
			int size = 225;
			String fileType = "png";
			File file = new File(filePath);
			create.createQRImage(file, textForTheQR, size, fileType, charSet);
			System.out.println("DONE");
	}

}

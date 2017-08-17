/**
 * 
 */
package com.akhil.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.core.io.ResourceLoader;

import com.akhil.pojo.MetaContent;
import com.google.gson.Gson;

/**
 * @author ajay
 *
 */
public final class MediaUtils {

	private MediaUtils() {

	}

	public static MetaContent getMediaContent(ResourceLoader resourceLoader) {
		File f1 = null;
		MetaContent metaContent = null;
		try {
			f1 = resourceLoader.getResource("classpath:metacontent.json")
					.getFile();
			System.out.println("***** resource loader location ****"
					+ f1.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("Exception from f1" + e.getMessage());
		}
		Gson gson = new Gson();

		try {

			//BufferedReader jsonReader = new BufferedReader(new InputStreamReader(new FileInputStream(f1), "UTF-8"));
			
			BufferedReader jsonReader = new BufferedReader(new InputStreamReader(new FileInputStream(f1), "UTF-8"));
			
			metaContent = gson.fromJson(jsonReader, MetaContent.class);
			
			System.out.println(metaContent);

			System.out.println(metaContent.getEntries().get(2).getTitleLocalized().getAr());
			System.out.println(metaContent.getEntries().get(2).getTitleLocalized().getEn());
			
		} catch (Exception ex) {
			System.out.println("Exception from filereader" + ex.getMessage());
		}
		return metaContent;
	}

}

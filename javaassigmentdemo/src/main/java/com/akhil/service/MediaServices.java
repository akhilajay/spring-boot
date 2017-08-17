/**
 * 
 */
package com.akhil.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.akhil.pojo.Entry;
import com.akhil.pojo.Filter;
import com.akhil.pojo.Medium;
import com.akhil.pojo.MetaContent;

/**
 * @author akhil
 *
 */

@Service(value = "mediaServices")
public class MediaServices {

	public MetaContent levelMetaContent(Filter filterVO) {
		MetaContent metaContent = filterVO.getMetacontent();
		List<Entry> entries = metaContent.getEntries();
		List<Entry> censoredEntries = new ArrayList<Entry>();
		if (filterVO.getLevel().equals("Censored")) {
			censoredEntries = getCensoredEntries(entries);
		}
		if (filterVO.getLevel().equals("Uncensored")) {
			censoredEntries = getUnCensoredEntries(entries);
		}

		for (Entry e : censoredEntries) {

			if (e.getPeg$contentClassification().equalsIgnoreCase("Censored")) {
				List<Medium> media = e.getMedia();
				getcensoredMedia(media);

			}

			if (e.getPeg$contentClassification().equalsIgnoreCase("Uncensored")) {
				List<Medium> media = e.getMedia();
				getUnCensoredMedia(media);

			}

		}

		return metaContent;

	}

	private boolean isCensoredMedia(String guid) {
		char b = guid.charAt(guid.length() - 1);
		return String.valueOf(b).equals("C");
	}

	private List<Medium> getcensoredMedia(List<Medium> medium) {

		for (int i = 0; i < medium.size(); i++) {

			if (!isCensoredMedia(medium.get(i).getGuid())) {
				medium.remove(i);
			}
		}
		return medium;
	}

	private List<Medium> getUnCensoredMedia(List<Medium> medium) {

		for (int i = 0; i < medium.size(); i++) {

			if (isCensoredMedia(medium.get(i).getGuid())) {
				medium.remove(i);
			}
		}
		return medium;
	}

	// TODO:
	private List<Entry> getCensoredEntries(List<Entry> entries) {
		Iterator<Entry> j = entries.iterator();
		while (j.hasNext()) {
			String pageContent = j.next().getPeg$contentClassification();
			if (!pageContent.equalsIgnoreCase("Censored")&& !pageContent.equals("")) {
				j.remove();
			}
		}
		return entries;
	}

	private List<Entry> getUnCensoredEntries(List<Entry> entries) {
		Iterator<Entry> j = entries.iterator();
		while (j.hasNext()) {
			String pageContent = j.next().getPeg$contentClassification();
			if (!pageContent.equalsIgnoreCase("Uncensored")	&& !pageContent.equals("")) {
				j.remove();
			}
		}
		return entries;
	}
}

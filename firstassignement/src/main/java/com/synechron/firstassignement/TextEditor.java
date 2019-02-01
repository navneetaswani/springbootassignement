package com.synechron.firstassignement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {
	
	@Autowired
	SpellChecker spellChecker;
	
	public void spellCheck() {
		
		spellChecker.checkSpelling();
		
	}
	

}

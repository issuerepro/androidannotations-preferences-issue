package org.androidannotations.prefs.issue;

import org.androidannotations.annotations.sharedpreferences.DefaultBoolean;
import org.androidannotations.annotations.sharedpreferences.DefaultFloat;
import org.androidannotations.annotations.sharedpreferences.DefaultInt;
import org.androidannotations.annotations.sharedpreferences.DefaultLong;
import org.androidannotations.annotations.sharedpreferences.DefaultString;
import org.androidannotations.annotations.sharedpreferences.SharedPref;
import org.androidannotations.annotations.sharedpreferences.SharedPref.Scope;

import java.util.Set;

@SharedPref(Scope.UNIQUE)
public interface SomePrefs {
	
	@DefaultString("John")
	String name();
	
	@DefaultInt(42)
	int age();
	
	@DefaultLong(400000L)
	long ageLong();

	@DefaultFloat(42f)
	float ageFloat();
	
	@DefaultBoolean(true)
	boolean isAwesome();
	
	long lastUpdated();

	Set<String> types();
}

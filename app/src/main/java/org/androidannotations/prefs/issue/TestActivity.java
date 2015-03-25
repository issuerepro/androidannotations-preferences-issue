package org.androidannotations.prefs.issue;

import android.app.Activity;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.sharedpreferences.Pref;

@EActivity(resName = "main_layout")
public class TestActivity extends Activity {
	@Extra
	// add private to this field to see it fail
	String stringExtra;

	@Pref // @Pref does not matter
	SomePrefs_ test;
}

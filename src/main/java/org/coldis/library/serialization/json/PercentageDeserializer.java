package org.coldis.library.serialization.json;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Percentage deserializer.
 */
public class PercentageDeserializer extends NumberDeserializer {

	/**
	 * @see org.coldis.library.serialization.json.NumberDeserializer#getNumberFormat(java.util.Locale)
	 */
	@Override
	protected NumberFormat getNumberFormat(final Locale locale) {
		// Gets the default number format.
		final DecimalFormat numberFormat = (DecimalFormat) super.getNumberFormat(locale);
		// Sets the percentage multiplier.
		numberFormat.setMultiplier(100);
		// Returns the number format.
		return numberFormat;
	}

}

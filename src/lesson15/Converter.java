package lesson15;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Converter {
	public static final Pattern PRZELICZNIK_PATTERN = Pattern
			.compile("<przelicznik>(.+?)</przelicznik>");
	public static final Pattern KOD_PATTERN = Pattern.compile("<kod_waluty>(.+?)</kod_waluty>");
	public static final Pattern KURS_PATTERN = Pattern.compile("<kurs_sredni>(.+?)</kurs_sredni>");

	public static final String URL_STR = "http://www.nbp.pl/kursy/xml/lastA.xml";
	Map<String, Double> currencies;
	public Converter() throws IOException{
		currencies = fetchFromNBP();
		currencies.put("PLN", 1.0);
	}
	private Map<String, Double> fetchFromNBP() throws IOException{
		URL url = new URL(URL_STR);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("Accept", "text/xml");
		Map<String, Double> currencies = new HashMap<>();
		Scanner sc = new Scanner(connection.getInputStream());
		StringBuilder sb = new StringBuilder();
		while (sc.hasNextLine()) {
			sb.append(sc.nextLine());
			sb.append("\n");

		}
		// System.out.println(sb.toString());
		connection.disconnect();
		String str = "<pozycja>(.+?)</pozycja>";
		String content = sb.toString();
		Matcher pozMatcher = Pattern.compile(str, Pattern.DOTALL).matcher(content);
		while (pozMatcher.find()) {
			String strData = pozMatcher.group(1);
			Matcher przeMatcher = PRZELICZNIK_PATTERN.matcher(strData);
			przeMatcher.find();
			String valueStr = przeMatcher.group(1);
			double przelicznik = Double.valueOf(valueStr);

			Matcher kodMatcher = KOD_PATTERN.matcher(strData);
			kodMatcher.find();
			valueStr = kodMatcher.group(1);
			String kodWaluty = valueStr;

			Matcher kursMatcher = KURS_PATTERN.matcher(strData);
			kursMatcher.find();
			valueStr = kursMatcher.group(1);
			valueStr = valueStr.replace(",", ".");
			double kursSredni = Double.valueOf(valueStr);
			currencies.put(kodWaluty, kursSredni * przelicznik);

		}
		return currencies;
	}
	public double convert (String beginCurrency, String endCurrency, double value) throws IOException{
		double valueBegin = currencies.get(beginCurrency);
		double valueEnd = currencies.get(endCurrency);
		double convert = valueBegin*value/valueEnd;
		return convert;

	}
	public static void main(String[] args) throws IOException {
		Converter converter = new Converter();
		System.out.println(converter.convert("EUR", "PHP", 10));
	}
}

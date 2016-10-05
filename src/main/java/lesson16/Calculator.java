package lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	private static final Pattern onpPattern = Pattern.compile("count (\\*\\+ /-\\d )+");
	private static final Pattern LICZBA_PATTERN = Pattern.compile("[\\-]?\\d+(\\.\\d+)?");
	private static final Pattern OPERATOR_PATTERN = Pattern.compile("[*+\\-/]");
	private static final Pattern ANS_PATTERN = Pattern.compile("ans");

	private void cmd() throws DividingException {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		double result = 0;
		while (!line.equals("exit")) {
			// if (line.startsWith("count"))

			result = calc(line, result);

				System.out.println(result);
			
			{
				if (line.matches(onpPattern.pattern())) {
					Matcher matcher = onpPattern.matcher(line);
					matcher.find();
					String expression = matcher.group(1);
					System.out.println(calculate(expression));
				}

			}
			line = sc.nextLine();
		}

	}

	private double calc(String expression, double ans) throws DividingException {
		Scanner sc = new Scanner(expression);
		List<Double> stack = new ArrayList<Double>();
		double result = 0;
		while (sc.hasNext()) {
			if (sc.hasNext(LICZBA_PATTERN)) {
				String numberStr = sc.next(LICZBA_PATTERN);
				double number = Double.valueOf(numberStr);
				stack.add(number);
			} else if (sc.hasNext(OPERATOR_PATTERN)) {
				String operator = sc.next(OPERATOR_PATTERN);
				if (operator.equals("+")) {
					for (Double d : stack) {
						result += d;
					}

					stack.clear();

				} else if (operator.equals("-")) {
					double a = stack.get(stack.size() - 2);
					double b = stack.get(stack.size() - 1);
					double c = a - b;
					stack.remove(stack.size() - 2);
					stack.remove(stack.size() - 1);
					stack.add(c);
					result = stack.get(0);
				} else if (operator.equals("/")) {
					double a = stack.get(stack.size() - 2);
					double b = stack.get(stack.size() - 1);
					if (b == 0.0) {
						System.out.println("error");
						stack.clear();
						break;
					}
					double c = a / b;
					stack.remove(stack.size() - 2);
					stack.remove(stack.size() - 1);
					stack.add(c);
					result = stack.get(0);
				} else if (operator.equals("*")) {
					double a = stack.get(stack.size() - 2);
					double b = stack.get(stack.size() - 1);
					double c = a * b;
					stack.remove(stack.size() - 2);
					stack.remove(stack.size() - 1);
					stack.add(c);
					result = stack.get(0);
				}
			} else if (sc.hasNext(ANS_PATTERN)) {
				sc.next(ANS_PATTERN);
				stack.add(ans);
			}
		}

		return result;
	}

	private double calculate(String string) {
		List<Double> stos = new ArrayList<Double>();
		String inside = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ' ') {
				if (i == string.length() - 1) {
					continue;
				}

				int y = i + 1;
				while (string.charAt(y) != ' ') {
					inside = inside + string.charAt(y);
					i++;
					y++;
				}
			}
			if (inside.equals(" ")) {
				double a = stos.get(stos.size() - 2);
				double b = stos.get(stos.size() - 1);
				double c = a + b;
				stos.remove(stos.size() - 2);
				stos.remove(stos.size() - 1);
				stos.add(c);
				inside = "";
				continue;
			}
			if (string.charAt(i) == ' ') {
				double a = stos.get(stos.size() - 2);
				double b = stos.get(stos.size() - 1);
				double c = a - b;
				stos.remove(stos.size() - 2);
				stos.remove(stos.size() - 1);
				stos.add(c);
				inside = "";
				continue;
			}
			if (string.charAt(i) == ' ') {
				double a = stos.get(stos.size() - 2);
				double b = stos.get(stos.size() - 1);
				double c = a * b;
				stos.remove(stos.size() - 2);
				stos.remove(stos.size() - 1);
				stos.add(c);
				inside = "";
				continue;
			}
			if (string.charAt(i) == ' ') {
				double a = stos.get(stos.size() - 2);
				double b = stos.get(stos.size() - 1);
				double c = a / b;
				stos.remove(stos.size() - 2);
				stos.remove(stos.size() - 1);
				stos.add(c);
				inside = "";
				continue;
			}
			stos.add(Double.valueOf(inside));
			inside = "";

		}
		return stos.get(0);
	}

	public static void main(String[] args) throws DividingException {
		Calculator calculator = new Calculator();
		calculator.cmd();
	}
}

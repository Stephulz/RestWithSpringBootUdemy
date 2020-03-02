package br.com.stephulz.restwithspringbootudemy.service;

import org.springframework.stereotype.Service;

import br.com.stephulz.restwithspringbootudemy.util.Util;

@Service
public class MathService {

	public Double sum(String numberOne, String numberTwo) {
		return Util.convertToDouble(numberOne) + Util.convertToDouble(numberTwo);
	}

	public Double minus(String numberOne, String numberTwo) {
		return Util.convertToDouble(numberOne) - Util.convertToDouble(numberTwo);
	}

	public Double times(String numberOne, String numberTwo) {
		return Util.convertToDouble(numberOne) * Util.convertToDouble(numberTwo);
	}

	public Double division(String numberOne, String numberTwo) {
		return Util.convertToDouble(numberOne) / Util.convertToDouble(numberTwo);
	}

	public Double average(String numberOne, String numberTwo) {
		return (Util.convertToDouble(numberOne) + Util.convertToDouble(numberTwo)) / 2;
	}

	public Double squareRoot(String number) {
		return Math.sqrt(Util.convertToDouble(number));
	}
}

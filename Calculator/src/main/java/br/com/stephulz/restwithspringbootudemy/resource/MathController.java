package br.com.stephulz.restwithspringbootudemy.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.stephulz.restwithspringbootudemy.exception.UnsupportedMathOperation;
import br.com.stephulz.restwithspringbootudemy.service.MathService;
import br.com.stephulz.restwithspringbootudemy.util.Util;

@RestController
public class MathController {

	@Autowired
	private MathService mathService;

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!Util.isNumeric(numberOne) || !Util.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperation("Please set a numeric value");
		}
		return mathService.sum(numberOne, numberTwo);
	}

	@RequestMapping(value = "/minus/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double minus(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!Util.isNumeric(numberOne) || !Util.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperation("Please set a numeric value");
		}
		return mathService.minus(numberOne, numberTwo);
	}

	@RequestMapping(value = "/times/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double times(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!Util.isNumeric(numberOne) || !Util.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperation("Please set a numeric value");
		}
		return mathService.times(numberOne, numberTwo);
	}

	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!Util.isNumeric(numberOne) || !Util.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperation("Please set a numeric value");
		}
		return mathService.division(numberOne, numberTwo);
	}

	@RequestMapping(value = "/average/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!Util.isNumeric(numberOne) || !Util.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperation("Please set a numeric value");
		}
		return mathService.average(numberOne, numberTwo);
	}

	@RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable("number") String number) throws Exception {
		if (!Util.isNumeric(number)) {
			throw new UnsupportedMathOperation("Please set a numeric value");
		}
		return mathService.squareRoot(number);
	}

}

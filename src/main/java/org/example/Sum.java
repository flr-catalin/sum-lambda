package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Optional;

public class Sum implements RequestHandler<Input, Double> {

	@Override
	public Double handleRequest(Input input, Context context) {
		Double a = Optional.ofNullable(input).map(Input::a).orElse(0.0);
		Double b = Optional.ofNullable(input).map(Input::b).orElse(0.0);

		return a + b;
	}

}
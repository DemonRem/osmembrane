package de.osmembrane.model.parser;

import java.util.List;

import de.osmembrane.model.AbstractFunction;

public class BatchParser implements IParser {

	@Override
	public List<AbstractFunction> parseString(String input) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String parsePipeline(List<AbstractFunction> pipeline) {
		throw new UnsupportedOperationException();
	}
}
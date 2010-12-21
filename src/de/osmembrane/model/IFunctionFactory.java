package de.osmembrane.model;

public interface IFunctionFactory {

	public void initiate(String xmlFilename);

	public IFunctionGroup[] getFunctionGroups();

	public IFunctionGroup getFunctionGroup(IFunctionGroup group);

	public IFunction[] getFunctions(IFunctionGroup group);

	public IFunction getFunction(IFunction function);
}
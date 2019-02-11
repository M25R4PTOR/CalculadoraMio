/**
 * CalculatorSoapImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CalculatorSoapImpl implements org.tempuri.CalculatorSoap {
	public int add(int intA, int intB) throws java.rmi.RemoteException {
		return intA + intB;
	}

	public int subtract(int intA, int intB) throws java.rmi.RemoteException {
		return intA - intB;
	}

	public int multiply(int intA, int intB) throws java.rmi.RemoteException {
		return intA * intB;
	}

	public int divide(int intA, int intB) throws java.rmi.RemoteException {
		return intA / intB;
	}

}

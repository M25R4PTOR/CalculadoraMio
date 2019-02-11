/**
 * CalculatorSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CalculatorSoapSkeleton implements org.tempuri.CalculatorSoap, org.apache.axis.wsdl.Skeleton {
    private org.tempuri.CalculatorSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "intA"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "intB"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("add", _params, new javax.xml.namespace.QName("http://tempuri.org/", "AddResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Add"));
        _oper.setSoapAction("http://tempuri.org/Add");
        _myOperationsList.add(_oper);
        if (_myOperations.get("add") == null) {
            _myOperations.put("add", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("add")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "intA"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "intB"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("subtract", _params, new javax.xml.namespace.QName("http://tempuri.org/", "SubtractResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Subtract"));
        _oper.setSoapAction("http://tempuri.org/Subtract");
        _myOperationsList.add(_oper);
        if (_myOperations.get("subtract") == null) {
            _myOperations.put("subtract", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("subtract")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "intA"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "intB"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("multiply", _params, new javax.xml.namespace.QName("http://tempuri.org/", "MultiplyResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Multiply"));
        _oper.setSoapAction("http://tempuri.org/Multiply");
        _myOperationsList.add(_oper);
        if (_myOperations.get("multiply") == null) {
            _myOperations.put("multiply", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("multiply")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "intA"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "intB"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("divide", _params, new javax.xml.namespace.QName("http://tempuri.org/", "DivideResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Divide"));
        _oper.setSoapAction("http://tempuri.org/Divide");
        _myOperationsList.add(_oper);
        if (_myOperations.get("divide") == null) {
            _myOperations.put("divide", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("divide")).add(_oper);
    }

    public CalculatorSoapSkeleton() {
        this.impl = new org.tempuri.CalculatorSoapImpl();
    }

    public CalculatorSoapSkeleton(org.tempuri.CalculatorSoap impl) {
        this.impl = impl;
    }
    public int add(int intA, int intB) throws java.rmi.RemoteException
    {
        int ret = impl.add(intA, intB);
        return ret;
    }

    public int subtract(int intA, int intB) throws java.rmi.RemoteException
    {
        int ret = impl.subtract(intA, intB);
        return ret;
    }

    public int multiply(int intA, int intB) throws java.rmi.RemoteException
    {
        int ret = impl.multiply(intA, intB);
        return ret;
    }

    public int divide(int intA, int intB) throws java.rmi.RemoteException
    {
        int ret = impl.divide(intA, intB);
        return ret;
    }

}

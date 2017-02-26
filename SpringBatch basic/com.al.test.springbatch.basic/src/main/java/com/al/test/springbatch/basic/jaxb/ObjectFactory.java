//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.26 at 10:14:03 PM CET 
//


package com.al.test.springbatch.basic.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	@Autowired Producto producto; 
	
    private final static QName _Productos_QNAME = new QName("", "Productos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Producto.SubProductos }
     * 
     */
    public Producto.SubProductos createProductoSubProductos() {
        return new Producto.SubProductos();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link Productos }
     * 
     */
    public Productos createProductos() {
        return new Productos();
    }

    /**
     * Create an instance of {@link Producto.SubProductos.SubProducto }
     * 
     */
    public Producto.SubProductos.SubProducto createProductoSubProductosSubProducto() {
        return new Producto.SubProductos.SubProducto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Productos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Productos")
    public JAXBElement<Productos> createProductos(Productos value) {
        return new JAXBElement<Productos>(_Productos_QNAME, Productos.class, null, value);
    }

}
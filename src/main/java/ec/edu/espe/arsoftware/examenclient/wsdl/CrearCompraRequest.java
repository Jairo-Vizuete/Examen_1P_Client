//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.29 a las 08:23:10 PM COT 
//


package ec.edu.espe.arsoftware.examenclient.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localidadPartido" type="{http://espe.edu.ec/arqsoftware/ExamenServer/ws}localidadPartido"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "localidadPartido"
})
@XmlRootElement(name = "crearCompraRequest")
public class CrearCompraRequest {

    @XmlElement(required = true)
    protected LocalidadPartido localidadPartido;

    /**
     * Obtiene el valor de la propiedad localidadPartido.
     * 
     * @return
     *     possible object is
     *     {@link LocalidadPartido }
     *     
     */
    public LocalidadPartido getLocalidadPartido() {
        return localidadPartido;
    }

    /**
     * Define el valor de la propiedad localidadPartido.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalidadPartido }
     *     
     */
    public void setLocalidadPartido(LocalidadPartido value) {
        this.localidadPartido = value;
    }

}

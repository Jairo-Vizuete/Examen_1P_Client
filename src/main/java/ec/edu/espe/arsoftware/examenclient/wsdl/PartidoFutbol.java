//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.29 a las 08:23:10 PM COT 
//


package ec.edu.espe.arsoftware.examenclient.wsdl;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para partidoFutbol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="partidoFutbol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="equipoLocal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="equipoVisita" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partidoFutbol", propOrder = {
    "codigo",
    "equipoLocal",
    "equipoVisita",
    "fecha",
    "lugar"
})
public class PartidoFutbol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO", nullable = false)
    @XmlElement(required = true)
    protected BigInteger codigo;

    @Column(name = "EQUIPO_LOCAL", nullable = false, length = 50)
    @XmlElement(required = true)
    protected String equipoLocal;

    @Column(name = "EQUIPO_VISITA", nullable = false, length = 50)
    @XmlElement(required = true)
    protected String equipoVisita;

    @Column(name = "FECHA", nullable = false)
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecha;

    @Column(name = "LUGAR", nullable = false, length = 100)
    @XmlElement(required = true)
    protected String lugar;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigo(BigInteger value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad equipoLocal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipoLocal() {
        return equipoLocal;
    }

    /**
     * Define el valor de la propiedad equipoLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipoLocal(String value) {
        this.equipoLocal = value;
    }

    /**
     * Obtiene el valor de la propiedad equipoVisita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipoVisita() {
        return equipoVisita;
    }

    /**
     * Define el valor de la propiedad equipoVisita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipoVisita(String value) {
        this.equipoVisita = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad lugar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Define el valor de la propiedad lugar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugar(String value) {
        this.lugar = value;
    }

}

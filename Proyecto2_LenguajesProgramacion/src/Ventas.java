
public class Ventas {
    private int numOrden;
    private int cantOrden;
    private double precioUnitario;
    private int orderlineNum;
    private double ventas;
    private String fechaOrden;
    private String estado;
    private int qtr_id;
    private int month_id;
    private int year_id;
    private String productLine;
    private int msrp;
    private String codigoProducto;
    private String costumerName;
    private String phone;
    private String adressLine1;
    private String adressLine2;
    private String ciudad;
    private String estadoP;
    private String codigoPostal;
    private String pais;
    private String territorio;
    private String apellidoContacto;
    private String nombreContacto;
    private String tamano;

    public Ventas(int numOrden, int cantOrden, double precioUnitario, int orderlineNum, double ventas, String fechaOrden, String estado, int qtr_id, int month_id, int year_id, String productLine, int msrp, String codigoProducto, String costumerName, String phone, String adressLine1, String adressLine2, String ciudad, String estadoP, String codigoPostal, String pais, String territorio, String apellidoContacto, String nombreContacto, String tamano) {
        this.numOrden = numOrden;
        this.cantOrden = cantOrden;
        this.precioUnitario = precioUnitario;
        this.orderlineNum = orderlineNum;
        this.ventas = ventas;
        this.fechaOrden = fechaOrden;
        this.estado = estado;
        this.qtr_id = qtr_id;
        this.month_id = month_id;
        this.year_id = year_id;
        this.productLine = productLine;
        this.msrp = msrp;
        this.codigoProducto = codigoProducto;
        this.costumerName = costumerName;
        this.phone = phone;
        this.adressLine1 = adressLine1;
        this.adressLine2 = adressLine2;
        this.ciudad = ciudad;
        this.estadoP = estadoP;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
        this.territorio = territorio;
        this.apellidoContacto = apellidoContacto;
        this.nombreContacto = nombreContacto;
        this.tamano = tamano;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public int getCantOrden() {
        return cantOrden;
    }

    public void setCantOrden(int cantOrden) {
        this.cantOrden = cantOrden;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getOrderlineNum() {
        return orderlineNum;
    }

    public void setOrderlineNum(int orderlineNum) {
        this.orderlineNum = orderlineNum;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public String getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(String fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getQtr_id() {
        return qtr_id;
    }

    public void setQtr_id(int qtr_id) {
        this.qtr_id = qtr_id;
    }

    public int getMonth_id() {
        return month_id;
    }

    public void setMonth_id(int month_id) {
        this.month_id = month_id;
    }

    public int getYear_id() {
        return year_id;
    }

    public void setYear_id(int year_id) {
        this.year_id = year_id;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public int getMsrp() {
        return msrp;
    }

    public void setMsrp(int msrp) {
        this.msrp = msrp;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdressLine1() {
        return adressLine1;
    }

    public void setAdressLine1(String adressLine1) {
        this.adressLine1 = adressLine1;
    }

    public String getAdressLine2() {
        return adressLine2;
    }

    public void setAdressLine2(String adressLine2) {
        this.adressLine2 = adressLine2;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadoP() {
        return estadoP;
    }

    public void setEstadoP(String estadoP) {
        this.estadoP = estadoP;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTerritorio() {
        return territorio;
    }

    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }

    public String getApellidoContacto() {
        return apellidoContacto;
    }

    public void setApellidoContacto(String apellidoContacto) {
        this.apellidoContacto = apellidoContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
}

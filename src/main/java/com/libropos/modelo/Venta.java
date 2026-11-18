package com.libropos.modelo;
import java.util.Date;

public class Venta {
    private int id;
    private int idUSuario;
    private Integer idCliente;
    private Date fecha;
    private double subtotal;
    private double descuento;
    private double iva;
    private double total;
    private String metodoPago;
    private String estado;

    public Venta(int idUSuario, Integer idCliente, double subtotal, double descuento, double iva, double total, String metodoPago, String estado) {
    this.idUSuario = idUSuario;
    this.idCliente = idCliente;
    this.fecha = new Date();
    this.subtotal = subtotal;
    this.descuento = descuento;
    this.iva = iva;
    this.total = total;
    this.metodoPago = metodoPago;
    this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUSuario() {
        return idUSuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUSuario = idUsuario;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}






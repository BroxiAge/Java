package test;

import domain.Cliente;

public class TestCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Nessa", 'M', 29, "San Juan", true);
        System.out.println("isVIp? " + c1.isVip());
        
        Cliente c2 = new Cliente("Nessa", 'M', 29, "San Juan", false);
        System.out.println("cliente = " + c1.toString());
        System.out.println("isVIp? " + c2.isVip());
    }
    
}

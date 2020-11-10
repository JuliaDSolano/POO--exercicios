public class CContas {

    public static void main(String[] args) {
     
     
        ListaClientes listacli = new ListaClientes();
    	Clientes cli1 = new Clientes("Leonardo", "123.123.123-21");
        Clientes cli2 = new Clientes("Izaias", "111.222.333-20");
        Clientes cli3 = new Clientes("Julia", "000.111.222-33");
        Clientes cli4 = new Clientes("Celia", "001.002.003-04");
        Clientes cli5 = new Clientes("Matheus", "002.444.222-12");
        listacli.addClientes(cli1);
        listacli.addClientes(cli2);
        listacli.addClientes(cli3);
        listacli.addClientes(cli4);
        listacli.addClientes(cli5);
        
        CCorrente cc1 = new CCorrente(1, 1000);
        cli1.addContas(cc1);
        CCorrente cc2 = new CCorrente(2, 250000);
        cli2.addContas(cc2);
        CCorrente cc3 = new CPoupanca(3, 1000, 1000);
        cli3.addContas(cc3);
        CCorrente cc4 = new CEspecial(4, 1200, 3000);
        cli4.addContas(cc2);
        CCorrente cc5 = new CInvestimento(5, 500, 6, 4);
        cli5.addContas(cc5);
        //System.out.println(cli3.getNome() + cli3.getContas());
        listacli.imprimeClientes();
    }
    
}

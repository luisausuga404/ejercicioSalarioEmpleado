import java.util.Scanner;/*importo la biblioteca para usar el Scaner*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);/*defino clase para capturar valores por teclado*/
        String nombreEmpleado = "";
        String documentoEmpleado = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double valorHora = 0;
        double cantidadHoras = 0;
        double deducionSalud = 0;
        double deducionPension = 0;
        double horasExtras = 0;
        double valorHoraExtras = 0;
        double bonificacion = 0;
        double fondoSolidarioPensional = 0;
        double valorRentencionFuente = 0;
        double auxilioTransporte = 0;
        double salarioMinimo = 0;

        System.out.println("ingrese el nombre del empleado:");
        nombreEmpleado = sc.nextLine();
        System.out.println("ingrese el documento del empleado");
        documentoEmpleado = sc.nextLine();
        System.out.println("ingrese el valor de la hora");
        valorHora = sc.nextDouble();
        System.out.println("ingrese la cantidad de las horas");
        cantidadHoras = sc.nextDouble();
        System.out.println("ingrese el valor del salario minimo actual: ");
        salarioMinimo = sc.nextDouble();

        if(cantidadHoras>=24) {
            System.out.println("se le puede pagar al empleado");
            salarioBruto = valorHora * cantidadHoras;
            System.out.println("el salario bruto del empleado :"+ nombreEmpleado + " es $:" + salarioBruto);
            deducionPension = salarioBruto * 0.04;
            deducionSalud = salarioBruto * 0.04;
            if(salarioBruto <= (salarioMinimo*2)){
                auxilioTransporte = 200000;
                bonificacion = salarioBruto * 0.1;
            } else {
                auxilioTransporte = 0;
                bonificacion = 0;
            }
            if (cantidadHoras>96){
                horasExtras = cantidadHoras - 96;
                valorHoraExtras = (valorHora*0.25) * horasExtras;
            }
            System.out.println("detalle de pago" + nombreEmpleado);
            System.out.println("la deduccluion por salud es:" + deducionSalud);
            System.out.println("la deduccion por pension es:" + deducionPension );
            System.out.println("el auxilio de transporte es:" + auxilioTransporte);
            System.out.println("la bonificacion es: " + bonificacion);
            System.out.println("el pago por horas extras es: " + valorHoraExtras);
            System.out.println("el salario neto es: " + (salarioBruto - deducionSalud - deducionPension + auxilioTransporte + bonificacion + valorHoraExtras));
        }else {
            System.out.println("le faltan" + (24 - cantidadHoras) + "horas de trabajo");
        }
    }

}
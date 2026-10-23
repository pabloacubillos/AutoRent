import java.time.LocalDate;
public class Aplicacion {
    public static void main(String[] args) {
//Creación empresa
        Empresa empresa1 = new Empresa("AutoRent", "Armenia");

        //Creación 2 turistas

        Turista turista1 = new Turista("Juan", "juanito123@gmail.com", "1234", empresa1, "V-2024-001");

        Turista turista2 = new Turista("Pedro", "pedritotiktok@gmail.com", "2345", empresa1, "V-2024-002");

        //Creacion 2 residentes

        Residente residente1 = new Residente("Luis", "luis@gmail.com", "3456", empresa1, "Calle 10 # 5-20");
        Residente residente2 = new Residente("María", "maria@gmail.com", "4567", empresa1, "Carrera 14 # 20-35");

        //Creacion de los 3 vehículos

        Automovil automovil1 = new Automovil("CFY 944", "Chevrolet", "Spark", 2020, EstadoVehiculo.BUENO, empresa1, 4);

        Motocicleta motocicleta1 = new Motocicleta("XYZ45A", "Yamaha", "FZ 150", 2021, EstadoVehiculo.BUENO, empresa1, 150);

        Camioneta camioneta1 = new Camioneta("DEF789", "Toyota", "Hilux", 2022, EstadoVehiculo.BUENO, empresa1, 1000.0);
        //creacion alquileres


        Alquiler alquiler1 = new Alquiler("ALQ-001", LocalDate.of(2026, 10, 22), 5, empresa1, residente2, automovil1);
        Alquiler alquiler2 = new Alquiler("ALQ-002", LocalDate.of(2026, 10, 23), 3, empresa1, residente1, motocicleta1);


        System.out.println("-----Consultar información-----");

        System.out.println("---Clientes---");

        System.out.println("Turistas: ");
        System.out.println(turista1);
        System.out.println(turista2);

        System.out.println("Residentes: ");
        System.out.println(residente1);
        System.out.println(residente2);

        System.out.println("---Vehículos---");
        System.out.println("Automóviles: ");
        System.out.println(automovil1);
        System.out.println("Motocicletas: ");
        System.out.println(motocicleta1);
        System.out.println("Camioneta: ");
        System.out.println(camioneta1);

        System.out.println("---Calcular y mostrar el costo total de un alquiler---\n");

        System.out.println("Costo total alquiler 1: $" + alquiler1.calcularCostoTotal()+ " "+alquiler1);
        System.out.println("Costo total alquiler 2: $" + alquiler2.calcularCostoTotal()+" "+alquiler2);





    }

}

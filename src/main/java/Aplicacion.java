public class Aplicacion {
//Creación empresa
    Empresa empresa1 = new Empresa("AutoRent", "Armenia");

    //Creación 2 turistas

    Turista turista1 = new Turista("Juan", "juanito123@gmail.com", "1234", empresa1, "V-2024-001");

    Turista turusta2 = new Turista("Pedro", "pedritotiktok@gmail.com", "2345", empresa1, "V-2024-002");

    //Creacion 2 residentes

    Residente residente1 = new Residente("Luis", "luis@gmail.com", "3456", empresa1, "Calle 10 # 5-20");
    Residente residente2 = new Residente("María", "maria@gmail.com", "4567",empresa1, "Carrera 14 # 20-35");

    //Creacion de los 3 vehículos

    Automovil automovil1 = new Automovil("CFY 944", "Chevrolet", "Spark", 2020, EstadoVehiculo.BUENO, empresa1, 4 );

    Motocicleta motocicleta1 = new Motocicleta("XYZ45A", "Yamaha", "FZ 150", 2021, EstadoVehiculo.BUENO, empresa1, 150);

    Camioneta camioneta1 = new Camioneta("DEF789", "Toyota", "Hilux", 2022, EstadoVehiculo.BUENO,empresa1, 1000.0);








}

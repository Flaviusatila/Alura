package br.com.estacionamento.estacionamentoBecca.enums;

public enum  MarcaVeiculo {
    Alfa_Romeo( "Alfa Romeo" ), Aston_Martin( "Aston Martin" ), Audi( "Audi" ),
    BMW( "BMW" ), Buggy( "Buggy" ),Bugatti( "Bugatti" ), Bentley( "Bentley" ),
    Chevrolet( "name" ), Chery( "Chery" ),    Chrysler( "Chrysler" ), Citroen( "Citroen" ),
    Dodge( "Dodge" ),Ducati( "Ducati" ),Effa( "Effa" ), Engesa( "Engesa" ),
    Ferrari( "Ferrari" ), FIAT( "FIAT" ),Ford( "Ford" ), GM( "GM" ), Honda( "Honda" ),
    Hyunday( "Hyunday" ), Harley_Davidson( "Harley_Davidson" ),
    Husqvarna( "Husqvarna" ), Hummer( "Hummer" ),Iveco( "Iveco" ), Jeep( "Jeep" ),
    Jaguar( "Jaguar" ), JAC( "JAC" ),
    Kia( "Kia" ), Kawasaki( "Kawasaki" ),Lada( "Lada" ), Lamborghini( "Lamborghini" ),
    Land_Rover( "Land Rover" ), Lexus( "Lexus" ),Lotus( "Lotus" ),
    Maserati( "Maserati" ),Mazda( "Mazda" ), Mclaren( "Mclaren" ), Mercedes_Benz( "Mercedes_Benz" ),
    Mitsubishi( "Mitsubishi" ), Maruti( "Maruti" ),
    Mustang( "Mustang" ),Nissan( "Nissan" ), Peugeot( "Peugeot" ),Pontiac( "Pontiac" ), Porsche( "Porsche" ),
    Puma( "Puma" ),RAM( "RAM" ),Rover( "Rover" ), Renault( "Renault" ),
    Rolls_Royce( "Rolls_Royce" ), Subaru( "Subaru" ), Suzuki( "Suzuki" ), Scania( "Scania" ),
     Toyota( "Toyota" ), Troller( "Troller" ), Tesla( "Tesla" ), Trion( "Trion" );

    private final String name;

    MarcaVeiculo(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }
}

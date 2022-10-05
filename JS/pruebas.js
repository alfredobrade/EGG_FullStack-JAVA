console.log("hola mundo")

/*
var edad = prompt('cual es tu edad', "ingrese su edad")
console.log(edad)
if (edad >= 18){
    alert('mayor de edad'+edad)
} else {
    alert('menor de edad')
}


var numero = 12;
numero = '123'
numero = true

alert('el tipo de dato de numero es '+ typeof numero);

var edad = prompt('que edad tenes');

var mensaje = `la edad del sujeto es
....
.... ${edad}`; //esto es un template String

alert(mensaje);
*/

// JSON son como objetos
var persona = {
    apellido : "Perez", //key : value "para modelar objetos en js"
    nombre : "juan", // los String de las keys tienen que estar con comillas dobles ""
    dni : 123456789,
};

console.log(
    persona
);

persona.apellido = "brade";

console.log(
    persona
);

var mascota = {
    id : 654,
    apodo : "pancho",
    nacimiento : new Date("11-02-2010"), //el formato de fecha es mm-dd-aaaa
    persona 
};

console.log(
    mascota
);

// clases
class Mascota {
    id;
    apodo;
    
};
var m = new Mascota();

m.apodo = "pancho";

console.log(m);

// arrays 
var vector = [1,2,3,4,5,"s", true]; // permite agregar varios tipos de datos

console.log(vector); // imprime uno debajo del otro completo
console.log(vector[2]); //imprime el elemento de esa posicion en el vector

console.log(JSON.stringify(vector)); // funcion JSON que transforma el objeto en string
// se puede hacer un array con JSONs
var perros = [
    {
        nombre : "pancho",
        edad : 12
    },
    {
        nombre : "corchi",
        edad : 4
    },
    {
        nombre : "samanta",
        edad : 6
    }
];
 //e imprimirlos segun su posicion dentro del array
console.log(perros[0]);
console.log(perros[0].nombre); // o segun un atributo del elemento JSON dentro del array
console.log(perros.length);

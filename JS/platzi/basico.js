//--- funciones--
//declarativas
function miFuncion(){
    //si agregamos un return deja de ser void automaticamente
    return 3;
}

miFuncion();

//expresion

var otraFuncion = function(a,b){
    return a+b;
}

otraFuncion()

//--- hoisting

console.log(miNombre); //estoy llamando la variable antes de inicializarla
// me va a imprimir undefined
var miNombre;

miNombre = "alfredo";
// -* las variables hay que declararlas antes del codigo.. las funciones si se pueden declarar debajo

//--- coerción
// es cambiar el tipo de dato
var a = 4;
a = String(a);
console.log(typeof a); // paso a ser string
a = Number(a);// pasa devuelta a ser number

//--- condicionales
/*
if (true){
    //ejecucion
}

if (true){
    //ejecutar verdadero
}else{
    // ejecutar falso
}

if (true){
 
} else if(true){

} else {

}

//--- operador ternario

condition ? true : false;

//--- switch
switch (opcion) {
    case 1: //se cumple esto
        break;
    case 2: //cosa dos
        break;
    default: //condicion default
        
}
*/
if (false === !true) { 
    console.log(false == true) 
} else {
     console.log(true === !false) 
}

//--- Arrays

var vector = [1,2,3,4, "juan", true]; // puede tener distintos tipos de dato
console.log(vector);
console.log(vector[1]);

var prueba = ['a','b', 'c','d'];
// metodos final - push pop
//metodos inicio - unshift shift
// obtener el index - indexOf

//--- loops
/*
 for - recorre un bloque de código varias veces
 for/in - recorre las propiedades de un objeto
 for/of - recorre los valores de un objeto iterable
 while - recorre un bloque de código mientras se cumple una condición específica
 do/while - también recorre un bloque de código mientras se cumple una condición específica
*/

// --- objetos
var auto = {
    marca: "toyota",
    modelo: "corolla",
    year: 2020,
    detalleAuto: function(){
        console.log(`Auto ${this.modelo} ${this.year}`);
    }

};

function moto(marca, modelo, year) {
    this.marca = marca;
    this.modelo = modelo;
    this.year = year;
}

var moto = new moto("bmw","gs",2020);

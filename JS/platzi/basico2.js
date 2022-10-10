//


const h1 = document.querySelector('h1');
const p = document.querySelectorAll('p');
const parrafito = document.getElementsByClassName('parrafito');
const pid = document.getElementById('pid');
const input = document.querySelector('input');

console.log({
    h1,
    p,
    parrafito,
    pid,
    input
});

console.log(input.value);

h1.innerHTML = 'cambiando el titulo con JS <br> hola';
h1.innerText = 'cambiando el titulo con JS <br> hola';

console.log(h1.getAttribute('class'))
h1.setAttribute('class','rojo')

/*
input.classList.add('hola');
input.classList.add('mundo');
input.classList.remove('hola');

input.classList.toggle('');

input.classList.contains('');
*/
//input.value = "456"

const img = document.createElement('img');
img.setAttribute('src', 'https://www.motocorp.pe/wp-content/uploads/2020/06/GP200-256x256.png');

//pid.append(img); este si sirve, agrega la foto pero no borra el contenido anterior
//pid.innerHTML = img; no sirve porque lo transforma a texto

//para borrar el contenido del parrafo e incertar la imagen hacemos
//pid.innerHTML = "";
//pid.append(img);

const input1 = document.querySelector('#calculo1');
const input2 = document.querySelector('#calculo2');
const btn_calcular = document.querySelector('#btn-calcular');
const resultado = document.querySelector('#resultado');


function btnSumar() {
    
    //alert(Number(input1.value)+Number(input2.value));
    resultado.innerText = Number(input1.value)+Number(input2.value);
}
//Number(input1.value)+Number(input2.value

btn_calcular.addEventListener('click',btnSumar); //en este caso el metodo no va con parentesis. porque debe poner la funcion pero no ejecutarla
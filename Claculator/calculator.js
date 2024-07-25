var inputField =document.getElementById("inputField")
console.log(inputField);

function turnOff() {
    var inputField=document.getElementById("inputField")
    inputField.style.visibility="hidden"
}
function turnOn() {
    var inputField=document.getElementById("inputField")
    inputField.style.visibility="visible"
}
var inputField=document.getElementById("inputField")
 function getvalues(num) {
 inputField.value=inputField.value+num
 }
 function clearOneChar() {
    inputField.value=inputField.value.slice(0,-1)
     }
 function clearAll() {
    inputField.value=" "
 
 }
  function calculate() {
     inputField.value= eval(inputField.value) 
     }